package me.anedhel.lotr;

import me.anedhel.lotr.blocks.ModBlocks;
import me.anedhel.lotr.item.ModItemGroups;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LordOfTheRingsMiddleEarthMod implements ModInitializer {

	public static final String MOD_ID = "lotr";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("The Lord of the Rings Mod starts to initialise.");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
		LOGGER.info("The Lord of the Rings Mod is loaded.");
	}
}