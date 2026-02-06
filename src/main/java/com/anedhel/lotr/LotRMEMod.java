/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr;

import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.item.ModItemGroups;
import com.anedhel.lotr.item.ModItems;
import com.anedhel.lotr.recipe.ModRecipes;
import com.anedhel.lotr.screen.ModScreenHandlers;
import com.anedhel.lotr.world.dimension.ModDimensions;
import com.anedhel.lotr.world.gen.ModWorldGenerator;
import net.fabricmc.api.ModInitializer;

import net.minecraft.block.ComposterBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main mod initialization class for the Lord of the Rings Middle Earth Mod.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class LotRMEMod implements ModInitializer {

	public static final String MOD_ID = "lotr";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	/**
	 * Called when the mod is initialized.
	 */
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + MOD_ID + " mod.");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModScreenHandlers.registerScreenHandlers();
		ModRecipes.registerRecipes();

		ModWorldGenerator.generateModWorldGen();
		ModDimensions.register();

		addCompostableItems();
	}

	/**
	 * Registers mod items as compostable with their respective composting chances.
	 */
	private void addCompostableItems() {
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_TOMATO, 0.45f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_CORN, 0.45f);

		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO_SEEDS, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO, 0.65f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORN_SEEDS, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORN, 0.65f);
	}
}