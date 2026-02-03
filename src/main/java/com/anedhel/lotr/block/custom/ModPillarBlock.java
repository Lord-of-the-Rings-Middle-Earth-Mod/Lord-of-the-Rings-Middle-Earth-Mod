/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

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

/**
 * Represents a custom pillar block for the Vanilla Extensions Mod.
 * <p>
 * This block dynamically determines its {@link ModPillarType} based on adjacent pillar blocks,
 * allowing for seamless vertical connections.
 * The pillar type is stored in the {@link #PILLAR_TYPE} property and is updated on placement
 * and when neighboring blocks change.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModPillarBlock extends Block {

	public static final EnumProperty<ModPillarType> PILLAR_TYPE = EnumProperty.of("pillar_type", ModPillarType.class);

	public ModPillarBlock(Settings settings) {
		super(settings);
		setDefaultState(getStateManager().getDefaultState().with(PILLAR_TYPE, ModPillarType.SINGLE));
	}

	/**
	 * Determines the updated block state for this pillar block based on the presence of adjacent pillar blocks.
	 *
	 * @param world the world view used to check the state of neighboring blocks
	 * @param pos the position of this block in the world
	 * @return the updated block state with the correct {@link ModPillarType}
	 */
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

	/**
	 * Adds the {@link #PILLAR_TYPE} property to the block's state manager.
	 *
	 * @param builder the state manager builder used to define the block's state properties
	 */
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(PILLAR_TYPE);
	}

	@Override
	public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
		return getUpdatedState(ctx.getWorld(), ctx.getBlockPos());
	}

	/**
	 * Updates the block state when a neighboring block changes.
	 *
	 * @param state the current block state
	 * @param world the world view
	 * @param tickView the scheduled tick view
	 * @param pos the position of this block
	 * @param direction the direction of the neighbor update
	 * @param neighborPos the position of the neighboring block
	 * @param neighborState the state of the neighboring block
	 * @param random the random instance
	 * @return the updated block state if a relevant neighbor changed, otherwise the current state
	 */
	@Override
	protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView,
			BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
		if(direction == Direction.UP || direction == Direction.DOWN) {
			return getUpdatedState(world, pos);
		}
		return state;
	}
}