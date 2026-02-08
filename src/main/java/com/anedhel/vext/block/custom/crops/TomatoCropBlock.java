/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.block.custom.crops;

import com.anedhel.vext.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;

/**
 * Represents a custom crop block for tomatoes in the Vanilla Extensions Mod.
 * <p>
 * This crop grows through 6 stages (0-5) and uses custom tomato seeds for planting.
 *
 * @author Moritz Rohleder
 * @see net.minecraft.block.CropBlock
 * @since 0.1.0
 */
public class TomatoCropBlock extends CropBlock {

	public static final int MAX_AGE = 5;
	public static final IntProperty AGE = Properties.AGE_5;

	public TomatoCropBlock(Settings settings) {
		super(settings);
	}

	/**
	 * Retrieves the seed item associated with this crop block.
	 * <p>
	 * This method is overridden to return the custom {@link ModItems#TOMATO_SEEDS} item
	 * used for planting this crop.
	 * </p>
	 *
	 * @return the {@link ItemConvertible} representing the tomato seeds.
	 */
	@Override
	protected ItemConvertible getSeedsItem() {
		return ModItems.TOMATO_SEEDS;
	}

	/**
	 * Adds the age property to the block's state manager.
	 * <p>
	 * This method ensures that the {@link #AGE} property is included
	 * in the block's state, allowing the crop's growth stages to be tracked.
	 *
	 * @param builder the {@link StateManager.Builder} used to define the block's state properties.
	 */
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}

	@Override
	protected IntProperty getAgeProperty() {
		return AGE;
	}

	@Override
	public int getMaxAge() {
		return MAX_AGE;
	}
}
