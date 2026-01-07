package com.anedhel.lotr;

import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.item.ModItemGroups;
import com.anedhel.lotr.item.ModItems;
import com.anedhel.lotr.recipe.ModRecipes;
import com.anedhel.lotr.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;

import net.minecraft.block.ComposterBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LotRMEMod implements ModInitializer {

	public static final String MOD_ID = "lotr";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + MOD_ID + " mod.");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModScreenHandlers.registerScreenHandlers();
		ModRecipes.registerRecipes();

		addCompostableItems();
	}

	private void addCompostableItems() {
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO_SEEDS, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO, 0.65f);
	}
}