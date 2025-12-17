package com.anedhel.lotr;

import com.anedhel.lotr.item.ModItemGroups;
import com.anedhel.lotr.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LotRMEMod implements ModInitializer {

	public static final String MOD_ID = "lotr";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + MOD_ID + " mod.");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}