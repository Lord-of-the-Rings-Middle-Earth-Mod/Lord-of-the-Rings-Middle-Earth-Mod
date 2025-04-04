package me.anedhel.lotr.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

public class ModPillarBlock extends Block {
	public static final EnumProperty<ModPillarType> PILLAR_TYPE = EnumProperty.of("pillar_type", ModPillarType.class);

	public ModPillarBlock(Settings settings) {
		super(settings);
		setDefaultState(getStateManager().getDefaultState().with(PILLAR_TYPE, ModPillarType.SINGLE));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(PILLAR_TYPE);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext context) {
		return getUpdatedState(context.getWorld(), context.getBlockPos());
	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		if (direction == Direction.UP || direction == Direction.DOWN) {
			return getUpdatedState(world, pos);
		}
		return state;
	}

	private BlockState getUpdatedState(WorldAccess world, BlockPos pos) {
		boolean hasAbove = world.getBlockState(pos.up()).isOf(this);
		boolean hasBelow = world.getBlockState(pos.down()).isOf(this);

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
