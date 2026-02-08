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

package com.anedhel.lotr.world.dimension;

import com.anedhel.lotr.LotRMEMod;
import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.world.biome.ModMaterialRules;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TimelineTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.attribute.EnvironmentAttributeMap;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import net.minecraft.world.gen.chunk.GenerationShapeConfig;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Provides the dimension types and chunk generator settings for the mod's custom dimensions.
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModDimensionProvider extends FabricDynamicRegistryProvider {

	private static final RegistryKey<ChunkGeneratorSettings> ARDA_SETTINGS_KEY = RegistryKey.of(
			RegistryKeys.CHUNK_GENERATOR_SETTINGS,
			Identifier.of(LotRMEMod.MOD_ID, "arda_settings")
	);

	public ModDimensionProvider(FabricDataOutput output,
			CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	/**
	 * Bootstraps the dimension types for the mod's custom dimensions.
	 *
	 * @param context the registry context to register the dimension types in
	 */
	public static void bootstrapType(Registerable<DimensionType> context) {
		EnvironmentAttributeMap environmentAttributeMap = EnvironmentAttributeMap.builder()
				.with(EnvironmentAttributes.SKY_COLOR_VISUAL, 0x22a1e6)
				.with(EnvironmentAttributes.WATER_FOG_COLOR_VISUAL, 0x2f5a86)
				.with(EnvironmentAttributes.FOG_COLOR_VISUAL, 0xaecbd6)
				.build();

		context.register(
				ModDimensions.ARDA_DIMENSION_TYPE_KEY,
				new DimensionType(
						false,
						true,
						false,
						1.0,
						-64,
						384,
						384, BlockTags.INFINIBURN_OVERWORLD,
						0.0f,
						new DimensionType.MonsterSettings(UniformIntProvider.create(0, 0), 0),
						DimensionType.Skybox.OVERWORLD,
						DimensionType.CardinalLightType.DEFAULT,
						environmentAttributeMap,
						context.getRegistryLookup(RegistryKeys.TIMELINE).getOrThrow(TimelineTags.IN_OVERWORLD)
				)
		);
	}

	/**
	 * Bootstraps the chunk generator settings for the mod's custom dimensions.
	 *
	 * @param context the registry context to register the chunk generator settings in
	 */
	public static void bootstrapSettings(Registerable<ChunkGeneratorSettings> context) {
		context.register(
				ARDA_SETTINGS_KEY,
				new ChunkGeneratorSettings(
						GenerationShapeConfig.create(-64, 384, 1, 2),
						ModBlocks.BRONZE_BLOCK.getDefaultState(),
						Blocks.WATER.getDefaultState(),
						DimensionUtil.createSurfaceNoiseRouter(
								context.getRegistryLookup(RegistryKeys.DENSITY_FUNCTION),
								context.getRegistryLookup(RegistryKeys.NOISE_PARAMETERS),
								false,
								false
						),
						ModMaterialRules.makeShireRules(),
						List.of(),
						63,
						false,
						true,
						true,
						false
				)
		);
	}

	/**
	 * Configures the dynamic registry provider by adding the dimension types and chunk generator settings to the provided entries.
	 *
	 * @param registries the registry wrapper lookup to retrieve the necessary registries
	 * @param entries    the entries to add the dimension types and chunk generator settings to
	 */
	@Override
	protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
		entries.addAll(registries.getOrThrow(RegistryKeys.DIMENSION_TYPE));
		entries.addAll(registries.getOrThrow(RegistryKeys.CHUNK_GENERATOR_SETTINGS));
	}

	@Override
	public String getName() {
		return "Arda";
	}
}
