/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.block.custom.crops;

import com.anedhel.lotr.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;

public class TomatoCropBlock extends CropBlock {

	public static final int MAX_AGE = 5;
	public static final IntProperty AGE = Properties.AGE_5;

	public TomatoCropBlock(Settings settings) {
		super(settings);
	}

	@Override
	protected ItemConvertible getSeedsItem() {
		return ModItems.TOMATO_SEEDS;
	}

	@Override
	protected IntProperty getAgeProperty() {
		return AGE;
	}

	@Override
	public int getMaxAge() {
		return MAX_AGE;
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}
}
