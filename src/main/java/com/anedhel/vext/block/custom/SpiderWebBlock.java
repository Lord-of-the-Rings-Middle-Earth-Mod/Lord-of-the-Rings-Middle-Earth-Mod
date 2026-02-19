package com.anedhel.vext.block.custom;

import com.anedhel.vext.block.ModBlockTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jspecify.annotations.Nullable;

public class SpiderWebBlock extends Block {
    public static final EnumProperty<SpiderWebType> SPIDER_WEB_TYPE = EnumProperty.of("spider_web_type", SpiderWebType.class);
    private static final VoxelShape SHAPE = Block.createCuboidShape(4.0D, 4.0D, 4.0D, 12.0D, 12.0D, 12.0D);

    public SpiderWebBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(SPIDER_WEB_TYPE, SpiderWebType.UP));
    }

    /**
     * Determines the updated block state for this SpiderWeb block based on the presence of adjacent full blocks.
     *
     * @param world the world view used to check the state of neighboring blocks
     * @param pos the position of this block in the world
     * @return the updated block state with the correct {@link ModFriezeType}
     */
    private BlockState getUpdatedState(WorldView world, BlockPos pos) {
        boolean hasBlockNorth = world.getBlockState(pos.north()).isSideSolidFullSquare(world, pos.north(), Direction.SOUTH);
        boolean hasBlockEast = world.getBlockState(pos.east()).isSideSolidFullSquare(world, pos.east(), Direction.WEST);
        boolean hasBlockSouth = world.getBlockState(pos.south()).isSideSolidFullSquare(world, pos.south(), Direction.NORTH);
        boolean hasBlockWest = world.getBlockState(pos.west()).isSideSolidFullSquare(world, pos.west(), Direction.EAST);
        boolean hasBlockUp = world.getBlockState(pos.up()).isSideSolidFullSquare(world, pos.up(), Direction.DOWN);

        // Bitmask: 1 = North, 2 = East, 4 = South, 8 = West, 16 Up
        int mask = 0;
        if (hasBlockNorth) mask |= 1;
        if (hasBlockEast)  mask |= 2;
        if (hasBlockSouth) mask |= 4;
        if (hasBlockWest)  mask |= 8;
        if (hasBlockUp)   mask |= 16;

        SpiderWebType type = switch(mask) {
            case 1  -> SpiderWebType.NORTH; // N
            case 2  -> SpiderWebType.EAST; // E
            case 3  -> SpiderWebType.NORTH_EAST; // NE
            case 4  -> SpiderWebType.SOUTH; // S
            case 5  -> SpiderWebType.NORTH_SOUTH; // NS
            case 6  -> SpiderWebType.EAST_SOUTH; // ES
            case 7  -> SpiderWebType.NORTH_EAST_SOUTH; //NES
            case 8  -> SpiderWebType.WEST; // W
            case 9  -> SpiderWebType.NORTH_WEST; // NW
            case 10 -> SpiderWebType.EAST_WEST; // EW
            case 11 -> SpiderWebType.NORTH_EAST_WEST; // NEW
            case 12 -> SpiderWebType.SOUTH_WEST; // SW
            case 13 -> SpiderWebType.NORTH_SOUTH_WEST; // NSW
            case 14 -> SpiderWebType.EAST_SOUTH_WEST; // ESW
            case 15 -> SpiderWebType.NORTH_EAST_SOUTH_WEST; // NESW
            case 16 -> SpiderWebType.UP; // U
            case 17 -> SpiderWebType.NORTH_UP; // NU
            case 18 -> SpiderWebType.EAST_UP; // EU
            case 19 -> SpiderWebType.NORTH_EAST_UP; //NEU
            case 20 -> SpiderWebType.SOUTH_UP; //SU
            case 21 -> SpiderWebType.NORTH_SOUTH_UP; //NSU
            case 22 -> SpiderWebType.EAST_SOUTH_UP; //ESU
            case 23 -> SpiderWebType.NORTH_EAST_SOUTH_UP; //NESU
            case 24 -> SpiderWebType.WEST_UP; //WU
            case 25 -> SpiderWebType.NORTH_WEST_UP; //NWU
            case 26 -> SpiderWebType.EAST_WEST_UP; //EWU
            case 27 -> SpiderWebType.NORTH_EAST_WEST_UP; //NEWU
            case 28 -> SpiderWebType.SOUTH_WEST_UP; //SWU
            case 29 -> SpiderWebType.NORTH_SOUTH_WEST_UP; //NSWU
            case 30 -> SpiderWebType.EAST_SOUTH_WEST_UP; //ESWU
            case 31 -> SpiderWebType.NORTH_EAST_SOUTH_WEST_UP; //NESWU
            case 0  -> SpiderWebType.UP; // should break
            default -> throw new IllegalStateException("Unexpected mask: " + mask);

        };
        return this.getDefaultState().with(SPIDER_WEB_TYPE, type);
    }

    /**
     * Adds the {@link #SPIDER_WEB_TYPE} property to the block's state manager.
     *
     * @param builder the state manager builder used to define the block's state properties
     */
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SPIDER_WEB_TYPE);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState state = getUpdatedState(ctx.getWorld(), ctx.getBlockPos());
        return state.canPlaceAt(ctx.getWorld(), ctx.getBlockPos()) ? state : null;
    }

    /**
     * Updates the block state when a neigboring block is updated.
     *
     * @param state the state of this block
     * @param world the world
     * @param tickView the scheduled tick view
     * @param pos the position of this block
     * @param direction the direction from this block to the neighbor
     * @param neighborPos the position of the neighbor block
     * @param neighborState the state of the updated neighbor block
     * @param random the random instance
     * @return the updated block state if a relevant neighbor changed, otherwise the current state
     */
    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView,
                                                   BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        if(direction == Direction.NORTH || direction == Direction.EAST || direction == Direction.SOUTH || direction == Direction.WEST || direction == Direction.UP) {
            return getUpdatedState(world, pos);
        }

        return state;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        boolean hasBlockNorth = world.getBlockState(pos.north())
                .isSideSolidFullSquare(world, pos.north(), Direction.SOUTH);
        boolean hasBlockEast = world.getBlockState(pos.east())
                .isSideSolidFullSquare(world, pos.east(), Direction.WEST);
        boolean hasBlockSouth = world.getBlockState(pos.south())
                .isSideSolidFullSquare(world, pos.south(), Direction.NORTH);
        boolean hasBlockWest = world.getBlockState(pos.west())
                .isSideSolidFullSquare(world, pos.west(), Direction.EAST);
        boolean hasBlockUp = world.getBlockState(pos.up())
                .isSideSolidFullSquare(world, pos.up(), Direction.DOWN);

        return hasBlockNorth || hasBlockEast || hasBlockSouth || hasBlockWest || hasBlockUp;
    }
}
