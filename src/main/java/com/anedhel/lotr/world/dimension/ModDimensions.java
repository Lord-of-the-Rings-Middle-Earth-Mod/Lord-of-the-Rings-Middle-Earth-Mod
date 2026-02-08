/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.world.dimension;

import com.anedhel.lotr.LotRMEMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;

/**
 * This class is responsible for defining and registering the custom dimensions for the mod.
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModDimensions {

	public static final RegistryKey<World> ARDA_WORLD_KEY = RegistryKey.of(
			RegistryKeys.WORLD,
			Identifier.of(LotRMEMod.MOD_ID, "arda")
	);

	public static final RegistryKey<DimensionType> ARDA_DIMENSION_TYPE_KEY = RegistryKey.of(
		RegistryKeys.DIMENSION_TYPE,
		Identifier.of(LotRMEMod.MOD_ID, "arda_type")
	);

	public static final RegistryKey<DimensionOptions> ARDA_DIMENSION_KEY = RegistryKey.of(
		RegistryKeys.DIMENSION,
		Identifier.of(LotRMEMod.MOD_ID, "arda")
	);

	/**
	 * Registers the mod's dimensions. This method should be called during the mod initialization phase.
	 */
	public static void register() {
		LotRMEMod.LOGGER.info("Registering dimensions for " + LotRMEMod.MOD_ID);
	}
}
