package com.anedhel.lotr.screen;

import com.anedhel.lotr.LotRMEMod;
import com.anedhel.lotr.screen.custom.CarpentryTableScreenHandler;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {

	public static final ScreenHandlerType<CarpentryTableScreenHandler> CARPENTRY_TABLE_SCREEN_HANDLER =
			Registry.register(Registries.SCREEN_HANDLER, Identifier.of(LotRMEMod.MOD_ID, "carpentry_screen_handler"),
					new ScreenHandlerType<>(CarpentryTableScreenHandler::new, FeatureFlags.VANILLA_FEATURES));

	public static void registerScreenHandlers() {
		LotRMEMod.LOGGER.info("Registering Screen Handlers for " + LotRMEMod.MOD_ID);
	}
}
