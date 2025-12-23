package com.anedhel.lotr.block.custom;

import com.anedhel.lotr.block.ModBlockTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jspecify.annotations.Nullable;

public class ModPillarBlock extends Block {

	public static final EnumProperty<ModPillarType> PILLAR_TYPE = EnumProperty.of("pillar_type", ModPillarType.class);

	public ModPillarBlock(Settings settings) {
		super(settings);
		setDefaultState(getStateManager().getDefaultState().with(PILLAR_TYPE, ModPillarType.SINGLE));
	}

	private BlockState getUpdatedState(WorldView world, BlockPos pos) {
		boolean hasPillarAbove = world.getBlockState(pos.up()).isIn(ModBlockTags.PILLARS);
		boolean hasPillarBelow = world.getBlockState(pos.down()).isIn(ModBlockTags.PILLARS);

		if(hasPillarAbove && hasPillarBelow) {
			return this.getDefaultState().with(PILLAR_TYPE, ModPillarType.MIDDLE);
		} else if(hasPillarAbove) {
			return this.getDefaultState().with(PILLAR_TYPE, ModPillarType.BASE);
		} else if(hasPillarBelow) {
			return this.getDefaultState().with(PILLAR_TYPE, ModPillarType.TOP);
		} else {
			return this.getDefaultState().with(PILLAR_TYPE, ModPillarType.SINGLE);
		}
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(PILLAR_TYPE);
	}

	@Override
	public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
		return getUpdatedState(ctx.getWorld(), ctx.getBlockPos());
	}

	@Override
	protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView,
			BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
		if(direction == Direction.UP || direction == Direction.DOWN) {
			return getUpdatedState(world, pos);
		}
		return state;
	}
}