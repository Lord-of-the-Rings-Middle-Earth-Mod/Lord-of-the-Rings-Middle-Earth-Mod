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

package com.anedhel.vext.world.biome;

import com.anedhel.vext.world.ModPlacedFeatures;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;

/**
 * Utility class for adding custom biome features.
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModBiomeFeatures {

	/**
	 * Adds all mobs to the SpawnSettings.Builder for the Shire biome.
	 *
	 * @param builder the SpawnSettings.Builder to which the mobs will be added
	 */
	public static void addShireMobs(SpawnSettings.Builder builder) {
		DefaultBiomeFeatures.addFarmAnimals(builder);
		//builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.HOBBIT, 5, 2, 6));
	}

	/**
	 * Adds ore generation features specific to the world of Arda.
	 *
	 * @param builder the GenerationSettings.LookupBackedBuilder to which the ore features will be added
	 */
	public static void addArdaOres(GenerationSettings.LookupBackedBuilder builder) {
		DefaultBiomeFeatures.addDefaultOres(builder, false);
		addFeature(builder, GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TIN_ORE_PLACED_KEY);
		addFeature(builder, GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SILVER_ORE_PLACED_KEY);
	}

	/**
	 * Adds a feature to the generation settings builder.
	 *
	 * @param builder the {@link GenerationSettings.LookupBackedBuilder} to add the feature to
	 * @param step the {@link GenerationStep.Feature} indicating the generation step
	 * @param feature the {@link RegistryKey<PlacedFeature>} representing the feature to add
	 */
	private static void addFeature(GenerationSettings.LookupBackedBuilder builder, GenerationStep.Feature step, RegistryKey<PlacedFeature> feature) {
		builder.feature(step, feature);
	}
}
