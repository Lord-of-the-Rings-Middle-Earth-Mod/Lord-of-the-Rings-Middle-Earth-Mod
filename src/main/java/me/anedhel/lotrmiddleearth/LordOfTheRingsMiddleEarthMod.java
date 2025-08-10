package me.anedhel.lotrmiddleearth;

import me.anedhel.lotrmiddleearth.block.ModBlocks;
import me.anedhel.lotrmiddleearth.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LordOfTheRingsMiddleEarthMod implements ModInitializer {

	public static final String MOD_ID = "lotr";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("The Lord of the Rings Mod starts to initialise.");

		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		LOGGER.info("The Lord of the Rings Mod is loaded.");
	}
}