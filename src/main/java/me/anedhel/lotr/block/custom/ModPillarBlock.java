package me.anedhel.lotr.block.custom;

import me.anedhel.lotr.datagen.ModBlockTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

/**
 * A block, which can be placed in a pillar formation or as a single block.
 * Different block states are used to represent the different places a pillar can have within the pillar formation.
 * The textures connect to each other, so the block looks like one pillar within the formation.
 */
public class ModPillarBlock extends Block {
	public static final EnumProperty<ModPillarType> PILLAR_TYPE = EnumProperty.of("pillar_type", ModPillarType.class);

	public ModPillarBlock(Settings settings) {
		super(settings);
		setDefaultState(getStateManager().getDefaultState().with(PILLAR_TYPE, ModPillarType.SINGLE));
	}

	/**
	 * Appends block state properties to this pillar block.
	 */
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(PILLAR_TYPE);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext context) {
		return getUpdatedState(context.getWorld(), context.getBlockPos());
	}

	/**
	 * Called when a neighbor block´s blockstate is changed.
	 * This method is used to update the block state of this block based on the state of its neighbors.
	 *
	 * @param state the state of this block
	 * @param direction the direction from this block to the neighbor
	 * @param neighborState the state of the updated neighbor block
	 * @param world the world
	 * @param pos the position of this block
	 * @param neighborPos the position of the neighbor block
	 * @return
	 */
	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		if (direction == Direction.UP || direction == Direction.DOWN) {
			return getUpdatedState(world, pos);
		}
		return state;
	}

	/**
	 * Updates the block state based on the presence of blocks above and below the current block position.
	 * This method checks for blocks that have the tag <code>c:pillars</code>.
	 *
	 * @param world the world access object
	 * @param pos the position of the current block
	 * @return the updated block state
	 */
	private BlockState getUpdatedState(WorldAccess world, BlockPos pos) {
		boolean hasAbove = world.getBlockState(pos.up()).isIn(ModBlockTagProvider.PILLARS);
		boolean hasBelow = world.getBlockState(pos.down()).isIn(ModBlockTagProvider.PILLARS);

		if (hasAbove && hasBelow) {
			return this.getDefaultState().with(PILLAR_TYPE, ModPillarType.MIDDLE);
		} else if (hasAbove) {
			return this.getDefaultState().with(PILLAR_TYPE, ModPillarType.BASE);
		} else if (hasBelow) {
			return this.getDefaultState().with(PILLAR_TYPE, ModPillarType.TOP);
		} else {
			return this.getDefaultState().with(PILLAR_TYPE, ModPillarType.SINGLE);
		}
	}
}
