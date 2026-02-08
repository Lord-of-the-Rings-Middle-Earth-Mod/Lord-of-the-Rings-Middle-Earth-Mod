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

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

/**
 * This class is responsible for generating the biomes of Arda.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModArdaBiomes {

	/**
	 * Helper method to generate a biome with the same features as the shire, but with different colors and mob spawns.
	 *
	 * @param hasDownfall Whether the biome has downfall or not.
	 * @param downfall The amount of downfall the biome has. The value should be between 0 and 1, where 0 means no rain and 1 means heavy rain.
	 * @param temperature The temperature of the biome. This is used to determine the color of the grass and foliage, as well as the types of mobs that can spawn in the biome. The value should be between 0 and 1, where 0 means cold and 1 means hot.
	 * @param waterColor The color of the water in the biome. This is used to determine the color of the water in the biome. The value should be a hex color code, where 0x000000 is black and 0xffffff is white.
	 * @param grassColor The color of the grass in the biome. This is used to determine the color of the grass in the biome. The value should be a hex color code, where 0x000000 is black and 0xffffff is white.
	 * @param foliageColor The color of the foliage in the biome. This is used to determine the color of the foliage in the biome. The value should be a hex color code, where 0x000000 is black and 0xffffff is white.
	 * @param spawnBuilder The spawn settings builder for the biome. This is used to determine the types of mobs that can spawn in the biome, as well as their spawn rates and conditions.
	 * @param biomeBuilder The generation settings builder for the biome.
	 * @return A biome with the same features as the shire, but with different colors and mob spawns.
	 */
	public static Biome generateBasicBiome(boolean hasDownfall, float downfall, float temperature,
			int waterColor, int grassColor, int foliageColor,
			SpawnSettings.Builder spawnBuilder, GenerationSettings.LookupBackedBuilder biomeBuilder) {
		return new Biome.Builder()
				.precipitation(hasDownfall)
				.downfall(downfall)
				.temperature(temperature)
				.effects((new BiomeEffects.Builder())
						.waterColor(waterColor)
						.grassColor(grassColor)
						.foliageColor(foliageColor)
						.build())
				.generationSettings(biomeBuilder.build())
				.spawnSettings(spawnBuilder.build())
				.build();
	}

	/**
	 * Generates a biome with the same features as the shire, but with different colors and mob spawns.
	 *
	 * @param context The context of the biome. This is used to register the biome in the registry.
	 * @param placedFeatureGetter A registry entry lookup for placed features. This is used to add the features of the biome, such as trees, flowers, and ores.
	 * @param carverGetter A registry entry lookup for configured carvers. This is used to add the carvers of the biome, such as caves and ravines.
	 * @return A biome with the same features as the shire, but with different colors and mob spawns.
	 */
	public static Biome shire(Registerable<Biome> context, RegistryEntryLookup<PlacedFeature> placedFeatureGetter,
			RegistryEntryLookup<ConfiguredCarver<?>> carverGetter) {
		SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
		ModBiomeFeatures.addShireMobs(spawnBuilder);

		GenerationSettings.LookupBackedBuilder biomeBuilder =
				new GenerationSettings.LookupBackedBuilder(placedFeatureGetter, carverGetter);

		DefaultBiomeFeatures.addLandCarvers(biomeBuilder);
		DefaultBiomeFeatures.addAmethystGeodes(biomeBuilder);
		DefaultBiomeFeatures.addDungeons(biomeBuilder);
		DefaultBiomeFeatures.addMineables(biomeBuilder);
		DefaultBiomeFeatures.addSprings(biomeBuilder);
		DefaultBiomeFeatures.addFrozenTopLayer(biomeBuilder);
		ModBiomeFeatures.addArdaOres(biomeBuilder);

		biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.TREES_PLAINS);
		DefaultBiomeFeatures.addForestFlowers(biomeBuilder);
		DefaultBiomeFeatures.addLargeFerns(biomeBuilder);

		return generateBasicBiome(true, 0.4f, 0.7f, 0x2f5a86, 0x30a81d,
				0x268617, spawnBuilder, biomeBuilder);
	}
}
