package com.anedhel.vext.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MultifaceBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCollisionHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * Represents a custom SpiderWebBlock for the Vanilla Extensions Mod.
 * <p>
 * This block dynamically determines its {@link SpiderWebType} based on adjacent full blocks.
 * This block is walk through and breaks if the player is running or an entitys velocity
 * is greater 0.9 (arrow, egg, falling player...).
 * The Spiderweb type is stored in the {@link #SPIDER_WEB_TYPE} property and is updated on placement
 * and when neighboring blocks change.
 *
 * @author AnoJedt
 * @since after 0.1.0
 */

public class SpiderWebBlock extends Block {
    public static final EnumProperty<SpiderWebType> SPIDER_WEB_TYPE = EnumProperty.of("spider_web_type", SpiderWebType.class);
    private static final Map<SpiderWebType, VoxelShape> SHAPES =
    createShapes();

    public SpiderWebBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(SPIDER_WEB_TYPE, SpiderWebType.UP));
    }

    /**
     * Creates a map of {@link SpiderWebType} to their corresponding {@link VoxelShape}.
     */
    private static Map<SpiderWebType, VoxelShape> createShapes() {
        EnumMap<SpiderWebType, VoxelShape> shapes =
                new EnumMap<>(SpiderWebType.class);

        VoxelShape shapenorth = Block.createCuboidShape(
                0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 1.0D
        );
        VoxelShape shapeeast = Block.createCuboidShape(
                15.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D
        );
        VoxelShape shapesouth = Block.createCuboidShape(
                0.0D, 0.0D, 15.0D, 16.0D, 16.0D, 16.0D
        );
        VoxelShape shapewest = Block.createCuboidShape(
                0.0D, 0.0D, 0.0D, 1.0D, 16.0D, 16.0D
        );
        VoxelShape shapeup = Block.createCuboidShape(
                5.0D, 7.0D, 6.0D, 10.0D, 16.0D, 10.0D
        );
        VoxelShape shapetwoside = Block.createCuboidShape(
                0.0D, 13.0D, 0.0D, 16.0D, 16.0D, 16.0D
        );
        VoxelShape shapethreeside = Block.createCuboidShape(
                0.0D, 7.0D, 0.0D, 16.0D, 16.0D, 16.0D
        );
        VoxelShape shapenorthsouth = Block.createCuboidShape(
                4.0D, 7.0D, 0.0D, 12.0D, 16.0D, 16.0D
        );
        VoxelShape shapeeastwest = Block.createCuboidShape(
                0.0D, 7.0D, 4.0D, 16.0D, 16.0D, 12.0D
        );
        VoxelShape shapenorthup = Block.createCuboidShape(
                0.0D, 7.0D, 1.0D, 10.0D, 16.0D, 10.0D
        );
        VoxelShape shapeeastup = Block.createCuboidShape(
                6.0D, 7.0D, 5.0D, 15.0D, 16.0D, 10.0D
        );
        VoxelShape shapesouthup = Block.createCuboidShape(
                6.0D, 7.0D, 6.0D, 11.0D, 16.0D, 15.0D
        );
        VoxelShape shapewestup = Block.createCuboidShape(
                1.0D, 7.0D, 6.0D, 10.0D, 16.0D, 11.0D
        );
        VoxelShape shapefull = Block.createCuboidShape(
                0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D
        );

        shapes.put(SpiderWebType.NORTH, shapenorth);
        shapes.put(SpiderWebType.EAST, shapeeast);
        shapes.put(SpiderWebType.SOUTH, shapesouth);
        shapes.put(SpiderWebType.WEST, shapewest);
        shapes.put(SpiderWebType.UP, shapeup);
        shapes.put(SpiderWebType.NORTH_EAST, shapetwoside);
        shapes.put(SpiderWebType.NORTH_SOUTH, VoxelShapes.union(shapenorth, shapesouth, shapenorthsouth));
        shapes.put(SpiderWebType.NORTH_WEST, shapetwoside);
        shapes.put(SpiderWebType.NORTH_UP, VoxelShapes.union(shapenorth, shapenorthup));
        shapes.put(SpiderWebType.EAST_SOUTH, shapetwoside);
        shapes.put(SpiderWebType.EAST_WEST, VoxelShapes.union(shapeeast, shapewest, shapeeastwest));
        shapes.put(SpiderWebType.EAST_UP, VoxelShapes.union(shapeeast, shapeeastup));
        shapes.put(SpiderWebType.SOUTH_WEST, shapetwoside);
        shapes.put(SpiderWebType.SOUTH_UP, VoxelShapes.union(shapesouth, shapesouthup));
        shapes.put(SpiderWebType.WEST_UP, VoxelShapes.union(shapewest, shapewestup));
        shapes.put(SpiderWebType.NORTH_EAST_SOUTH, shapethreeside);
        shapes.put(SpiderWebType.NORTH_EAST_WEST, shapethreeside);
        shapes.put(SpiderWebType.NORTH_EAST_UP, shapefull);
        shapes.put(SpiderWebType.NORTH_SOUTH_WEST, shapethreeside);
        shapes.put(SpiderWebType.NORTH_SOUTH_UP, VoxelShapes.union(shapenorth, shapesouth, shapenorthsouth));
        shapes.put(SpiderWebType.NORTH_WEST_UP, shapefull);
        shapes.put(SpiderWebType.EAST_SOUTH_WEST, shapethreeside);
        shapes.put(SpiderWebType.EAST_SOUTH_UP, shapefull);
        shapes.put(SpiderWebType.EAST_WEST_UP, VoxelShapes.union(shapeeast, shapewest, shapeeastwest));
        shapes.put(SpiderWebType.SOUTH_WEST_UP, shapefull);
        shapes.put(SpiderWebType.NORTH_EAST_SOUTH_WEST, shapethreeside);
        shapes.put(SpiderWebType.NORTH_EAST_SOUTH_UP, shapefull);
        shapes.put(SpiderWebType.NORTH_EAST_WEST_UP, shapefull);
        shapes.put(SpiderWebType.NORTH_SOUTH_WEST_UP, shapefull);
        shapes.put(SpiderWebType.EAST_SOUTH_WEST_UP, shapefull);
        shapes.put(SpiderWebType.NORTH_EAST_SOUTH_WEST_UP, shapefull);

        return Collections.unmodifiableMap(shapes);
    }


    /**
     * Determines the updated block state for this SpiderWeb block based on the presence of adjacent full blocks.
     *
     * @param world the world view used to check the state of neighboring blocks
     * @param pos the position of this block in the world
     * @return the updated block state with the correct {@link SpiderWebType}
     */

    private boolean canAttachTo(WorldView world, BlockPos pos, Direction direction) {
        BlockState state = world.getBlockState(pos);

        return MultifaceBlock.canGrowOn(
                world,
                direction,
                pos,
                state
        );
    }

    private BlockState getUpdatedState(WorldView world, BlockPos pos) {
        boolean hasBlockNorth = canAttachTo(world, pos.north(), Direction.SOUTH);
        boolean hasBlockEast = canAttachTo(world, pos.east(), Direction.WEST);
        boolean hasBlockSouth = canAttachTo(world, pos.south(), Direction.NORTH);
        boolean hasBlockWest = canAttachTo(world, pos.west(), Direction.EAST);
        boolean hasBlockUp = canAttachTo(world, pos.up(), Direction.DOWN);

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
     * Updates the block state when a neighboring block is updated.
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
            if (world instanceof World realWorld && !realWorld.isClient()) {
                realWorld.breakBlock(pos, true);
            }
            return state;
        }
        if(direction == Direction.NORTH || direction == Direction.EAST || direction == Direction.SOUTH || direction == Direction.WEST || direction == Direction.UP) {
            return getUpdatedState(world, pos);
        }

        return state;
    }

    /**
     * breaks the block on entity Collision.
     * breaks when entitys velocity is greater than 0.9 or player is running.
     */
    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity, EntityCollisionHandler handler, boolean bl) {
        if (world.isClient()) return;

        if (entity instanceof PlayerEntity player && !world.isClient()) {
            if (player.isSprinting()) {
                world.breakBlock(pos, false);
            }
        }

    /*not sure: it breaks around 5 blocks fall, but the head counts as hit so really high up*/
        Vec3d velocity = entity.getVelocity();
        double speed = velocity.length();
            if (speed > 0.9) {
                world.breakBlock(pos, false); //no item drop
            }
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        SpiderWebType type = state.get(SPIDER_WEB_TYPE);
        return SHAPES.get(type);
    }

    /**
     * disables collision of the player (block is walkthrough)
     * entitycollision is still working
     */
    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty(); // no collision
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        boolean hasBlockNorth = canAttachTo(world, pos.north(), Direction.SOUTH);
        boolean hasBlockEast = canAttachTo(world, pos.east(), Direction.WEST);
        boolean hasBlockSouth = canAttachTo(world, pos.south(), Direction.NORTH);
        boolean hasBlockWest = canAttachTo(world, pos.west(), Direction.EAST);
        boolean hasBlockUp = canAttachTo(world, pos.up(), Direction.DOWN);

        return hasBlockNorth || hasBlockEast || hasBlockSouth || hasBlockWest || hasBlockUp;
    }
}
