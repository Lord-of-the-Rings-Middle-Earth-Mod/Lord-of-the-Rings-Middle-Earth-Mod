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

package me.anedhel.lotr.world;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModWoodBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

/**
 * This class is responsible for registering and managing the configured features
 */
public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> TIN_ORE_SMALL = registerKey("tin_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TIN_ORE_LARGE = registerKey("tin_ore_large");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_KEY = registerKey("pine");

    /**
     * Bootstraps the configured features for the mod, including tree and ore generation.
     *
     * @param context The registerable context used to register the configured features.
     */
    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, PINE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModWoodBlocks.PINE_LOG),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.of(ModWoodBlocks.PINE_LEAVES),
                new SpruceFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(2), ConstantIntProvider.create(2)),
                new TwoLayersFeatureSize(2, 0, 2)).build());

        oreBootstrap(context);
    }

    /**
     * Registers the ore generation configuration for tin ores in the game world.
     *
     * @param context The registerable context used to register the configured feature.
     */
    public static void oreBootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldTinOres = List.of(
                OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TIN_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_TIN_ORE.getDefaultState()));

        register(context, TIN_ORE_SMALL, Feature.ORE, new OreFeatureConfig(overworldTinOres, 6));
        register(context, TIN_ORE_LARGE, Feature.ORE, new OreFeatureConfig(overworldTinOres, 12));
    }

    /**
     * Registers a new `RegistryKey` for a configured feature using the given name.
     *
     * @param name The name of the configured feature to register.
     * @return The `RegistryKey` associated with the configured feature.
     */
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name));
    }

    /**
     * Registers a configured feature in the given context.
     *
     * @param context The registerable context used to register the configured feature.
     * @param key The `RegistryKey` associated with the configured feature.
     * @param feature The feature to register.
     * @param configuration The configuration for the feature.
     * @param <FC> The type of the feature configuration.
     * @param <F> The type of the feature.
     */
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
