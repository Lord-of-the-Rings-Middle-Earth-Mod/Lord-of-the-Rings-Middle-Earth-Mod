package me.anedhel.lotr;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.item.ModItemGroups;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.block.ComposterBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LordOfTheRingsMiddleEarthMod implements ModInitializer {

	public static final String MOD_ID = "lotr";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("The Lord of the Rings Mod starts to initialise.");
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		addCropsToComposer();
		LOGGER.info("The Lord of the Rings Mod is loaded.");
	}

	private void addCropsToComposer() {
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO_SEEDS, 0.5f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO, 0.65f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.LETTUCE, 0.65f);
	}
}