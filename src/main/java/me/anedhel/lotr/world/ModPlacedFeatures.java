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
import me.anedhel.lotr.block.ModWoodBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

/**
 * This class is responsible for registering and managing the placed features
 */
public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> TIN_ORE = registerKey("tin_ore");

    public static final RegistryKey<PlacedFeature> PINE_PLACED_KEY = registerKey("pine_placed");

    /**
     * Initializes and registers all placed features for the mod.
     *
     * @param context The registerable context for placed features.
     */
    public static void boostrap(Registerable<PlacedFeature> context) {
        var configureFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, PINE_PLACED_KEY, configureFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.1f, 2),
                        ModWoodBlocks.PINE_SAPLINGS));

        oreBootstrap(context);
    }

    /**
     * Initializes and registers the ore placement features for the mod.
     *
     * @param context The registerable context for placed features.
     */
    private static void oreBootstrap(Registerable<PlacedFeature> context) {
        var configureFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, TIN_ORE, configureFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TIN_ORE_LARGE),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
    }

    /**
     * Creates a new `RegistryKey` for a `PlacedFeature` with the specified name.
     *
     * @param name The name of the placed feature to register.
     * @return A `RegistryKey` associated with the given name and the mod's namespace.
     */
    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name));
    }

    /**
     * Registers a new `PlacedFeature` in the given context with the specified key, configuration, and modifiers.
     *
     * @param context The registerable context used to register the placed feature.
     * @param key The `RegistryKey` for the placed feature.
     * @param configuration The configuration for the placed feature.
     * @param modifiers The list of placement modifiers for the placed feature.
     */
    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
