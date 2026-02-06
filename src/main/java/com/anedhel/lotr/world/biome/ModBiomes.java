/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.world.biome;

import com.anedhel.lotr.LotRMEMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

/**
 * ModBiomes is responsible for defining and registering custom biomes for the mod.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModBiomes {

	public static final RegistryKey<Biome> SHIRE = registerBiomeKey("shire");

	/**
	 * Bootstraps the biome registration by creating and registering the biomes in the given context.
	 *
	 * @param context The registry context to register the biomes in
	 */
	public static void bootstrap(Registerable<Biome> context) {
		var carver = context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER);
		var placedFeatures = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

		register(context, SHIRE, ModArdaBiomes.shire(context, placedFeatures, carver));
	}

	/**
	 * Helper method to register a biome in the given context.
	 *
	 * @param context The registry context to register the biome in
	 * @param key     The RegistryKey for the biome
	 * @param biome   The Biome instance to register
	 */
	private static void register(Registerable<Biome> context, RegistryKey<Biome> key, Biome biome) {
		context.register(key, biome);
	}

	/**
	 * Helper method to create a RegistryKey for a Biome with the mod's namespace.
	 *
	 * @param name The name of the biome (without namespace)
	 * @return A RegistryKey for the biome
	 */
	private static RegistryKey<Biome> registerBiomeKey(String name) {
		return RegistryKey.of(RegistryKeys.BIOME, Identifier.of(LotRMEMod.MOD_ID, name));
	}
}
