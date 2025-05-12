/*
 * Copyright (c)
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * lord-of-the-rings-middle-earth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * lord-of-the-rings-middle-earth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotr.world.biome;

import me.anedhel.lotr.entity.ModEntities;
import me.anedhel.lotr.world.ModPlacedFeatures;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

/**
 * This class is responsible for adding specific biome features and mobs to the Shire biome.
 */
public class ModBiomeFeatures {

	/**
	 * Adds all mobs to the SpawnSettings.Builder for the Shire biome.
	 *
	 * @param builder the SpawnSettings.Builder to which the mobs will be added
	 */
	public static void addShireMobs(SpawnSettings.Builder builder) {
		DefaultBiomeFeatures.addFarmAnimals(builder);
		builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.HOBBIT, 5, 2, 6));
	}

	/**
	 * Adds ore generation features specific to the world of Arda.
	 *
	 * @param builder the GenerationSettings.LookupBackedBuilder to which the ore features will be added
	 */
	public static void addArdaOres(GenerationSettings.LookupBackedBuilder builder) {
		DefaultBiomeFeatures.addDefaultOres(builder, false);
		/*builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TIN_ORE);*/ //Causes a crash for
		// some reason
	}
}
