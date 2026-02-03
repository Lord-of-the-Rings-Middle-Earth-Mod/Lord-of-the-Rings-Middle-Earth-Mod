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

public class ModFriezeBlock extends Block {

	public static final EnumProperty<ModFriezeType> FRIEZE_TYPE = EnumProperty.of("frieze_type", ModFriezeType.class);

	public ModFriezeBlock(Settings settings) {
		super(settings);
		setDefaultState(getStateManager().getDefaultState().with(FRIEZE_TYPE, ModFriezeType.SINGLE));
	}

	private BlockState getUpdatedState(WorldView world, BlockPos pos) {
		boolean hasFriezeNorth = world.getBlockState(pos.north()).isIn(ModBlockTags.FRIEZES);
		boolean hasFriezeEast = world.getBlockState(pos.east()).isIn(ModBlockTags.FRIEZES);
		boolean hasFriezeSouth = world.getBlockState(pos.south()).isIn(ModBlockTags.FRIEZES);
		boolean hasFriezeWest = world.getBlockState(pos.west()).isIn(ModBlockTags.FRIEZES);

		// Bitmask: 1 = North, 2 = East, 4 = South, 8 = West
		int mask = 0;
		if (hasFriezeNorth) mask |= 1;
		if (hasFriezeEast)  mask |= 2;
		if (hasFriezeSouth) mask |= 4;
		if (hasFriezeWest)  mask |= 8;

		ModFriezeType type = switch(mask) {
			case 15 -> ModFriezeType.CROSS_MIDDLE; // N E S W
			case 14 -> ModFriezeType.T_NORTH_MIDDLE; // E S W
			case 13 -> ModFriezeType.T_EAST_MIDDLE; // N S W
			case 11 -> ModFriezeType.T_SOUTH_MIDDLE; // N E W
			case 7 -> ModFriezeType.T_WEST_MIDDLE; // N E S
			case 5 -> ModFriezeType.NORTH_SOUTH_MIDDLE; // N S
			case 10 -> ModFriezeType.EAST_WEST_MIDDLE; // E W
			case 3 -> ModFriezeType.NORTH_EAST_CORNER; // N E
			case 9 -> ModFriezeType.NORTH_WEST_CORNER; // N W
			case 6 -> ModFriezeType.SOUTH_EAST_CORNER; // E S
			case 12 -> ModFriezeType.SOUTH_WEST_CORNER; // S W
			case 4 -> ModFriezeType.NORTH_END; // S
			case 8 -> ModFriezeType.EAST_END; // W
			case 1 -> ModFriezeType.SOUTH_END; // N
			case 2 -> ModFriezeType.WEST_END; // E
			default -> ModFriezeType.SINGLE;
		};
		return this.getDefaultState().with(FRIEZE_TYPE, type);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FRIEZE_TYPE);
	}

	@Override
	public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
		return getUpdatedState(ctx.getWorld(), ctx.getBlockPos());
	}

	@Override
	protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView,
			BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
		if(direction == Direction.NORTH || direction == Direction.EAST || direction == Direction.SOUTH || direction == Direction.WEST) {
			return getUpdatedState(world, pos);
		}
		return state;
	}
}
