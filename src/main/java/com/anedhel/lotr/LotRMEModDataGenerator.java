/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr;

import com.anedhel.lotr.datagen.*;
import com.anedhel.lotr.world.ModConfiguredFeatures;
import com.anedhel.lotr.world.ModPlacedFeatures;
import com.anedhel.lotr.world.biome.ModBiomes;
import com.anedhel.lotr.world.dimension.ModDimensionProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

/**
 * Data generator initialization class for the Lord of the Rings Middle Earth Mod.
 * <p>
 * This class registers all data generation providers for automatic generation of
 * tags, models, recipes, loot tables, and language files during the build process.
 *
 * @author Moritz Rohleder
 * @see ModBlockTagProvider
 * @see ModItemTagProvider
 * @see ModModelProvider
 * @since 0.1.0
 */
public class LotRMEModDataGenerator implements DataGeneratorEntrypoint {

	/**
	 * Initializes the data generator by adding various data providers.
	 *
	 * @param fabricDataGenerator The Fabric data generator instance.
	 */
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModEnUsLangProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);
		pack.addProvider(ModDimensionProvider::new);
	}

	/**
	 * Builds custom registries for configured and placed features.
	 *
	 * @param registryBuilder The registry builder used to add custom registries.
	 */
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);

		registryBuilder.addRegistry(RegistryKeys.BIOME, ModBiomes::bootstrap);

		registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, ModDimensionProvider::bootstrapType);
		registryBuilder.addRegistry(RegistryKeys.CHUNK_GENERATOR_SETTINGS, ModDimensionProvider::bootstrapSettings);
	}
}
