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

package com.anedhel.vext.world.gen;

import com.anedhel.vext.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

/**
 * Handles the generation of custom Vegetation in the mod.
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModVegetationGeneration {

	/**
	 * Generates all vegetation features in the mod.
	 */
	public static void generateVegetation() {
		generateTrees();
		generateFlowers();
	}

	/**
	 * Registers the tree generation for custom trees in the mod.
	 */
	private static void generateTrees() {
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW, BiomeKeys.OLD_GROWTH_PINE_TAIGA,
				BiomeKeys.TAIGA), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINE_PLACED_KEY);
	}

	/**
	 * Registers the flower generation for custom flowers in the mod.
	 */
	private static void generateFlowers() {
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW, BiomeKeys.SAVANNA,
				BiomeKeys.SAVANNA_PLATEAU), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WILD_TOMATO_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.FLOWER_FOREST,
				BiomeKeys.SUNFLOWER_PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WILD_CORN_PLACED_KEY);
	}

}
