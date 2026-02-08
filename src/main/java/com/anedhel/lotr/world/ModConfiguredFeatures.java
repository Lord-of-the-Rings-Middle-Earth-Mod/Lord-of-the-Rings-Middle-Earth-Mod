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

package com.anedhel.lotr.world;

import com.anedhel.lotr.LotRMEMod;
import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.block.woodtypes.PineBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

/**
 * Class responsible for registering configured features in the mod.
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModConfiguredFeatures {

	public static final RegistryKey<ConfiguredFeature<?, ?>> WILD_TOMATO_KEY = registerKey("wild_tomato");
	public static final RegistryKey<ConfiguredFeature<?, ?>> WILD_CORN_KEY = registerKey("wild_corn");

	public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_KEY = registerKey("pine_key");

	public static final RegistryKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");
	public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore");

	/**
	 * Bootstraps the configured features into the registry.
	 *
	 * @param context The registerable context.
	 */
	public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

		RuleTest stoneReplaceable = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
		RuleTest deepslateReplaceable = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

		List<OreFeatureConfig.Target> overworldTinOres = List.of(
				OreFeatureConfig.createTarget(stoneReplaceable, ModBlocks.TIN_ORE.getDefaultState()),
				OreFeatureConfig.createTarget(deepslateReplaceable, ModBlocks.DEEPSLATE_TIN_ORE.getDefaultState())
		);
		List<OreFeatureConfig.Target> overworldSilverOres = List.of(
				OreFeatureConfig.createTarget(stoneReplaceable, ModBlocks.SILVER_ORE.getDefaultState()),
				OreFeatureConfig.createTarget(deepslateReplaceable, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState())
		);

		register(context, WILD_TOMATO_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2,
				PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
						new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WILD_TOMATO)))));
		register(context, WILD_CORN_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2,
				PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
						new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WILD_CORN)))));

		register(context, PINE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
				BlockStateProvider.of(PineBlocks.PINE_LOG),
				new StraightTrunkPlacer(5, 2, 1),
				BlockStateProvider.of(PineBlocks.PINE_LEAVES),
				new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
				new TwoLayersFeatureSize(2, 0, 2)
		).build());

		register(context, TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTinOres, 10));
		register(context, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSilverOres, 9));
	}

	/**
	 * Registers a {@link RegistryKey} for a {@link ConfiguredFeature} with the given name.
	 *
	 * @param name the name of the configured feature
	 * @return the {@link RegistryKey} for the configured feature
	 */
	public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(LotRMEMod.MOD_ID, name));
	}

	/**
	 * Registers a {@link ConfiguredFeature} in the given context.
	 *
	 * @param context the context to register the configured feature in
	 * @param key the registry key of the configured feature
	 * @param feature the feature to configure
	 * @param configuration the configuration for the feature
	 * @param <FC> the type of the feature configuration
	 * @param <F> the type of the feature
	 */
	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
			Registerable<ConfiguredFeature<?, ?>> context,
			RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		context.register(key, new ConfiguredFeature<>(feature, configuration));
	}
}
