/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

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
