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
import com.anedhel.lotr.block.woodtypes.PineBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

/**
 * Class for registering placed features.
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModPlacedFeatures {

	public static final RegistryKey<PlacedFeature> PINE_PLACED_KEY = registerKey("pine_placed");

	public static final RegistryKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
	public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");

	/**
	 * Bootstraps the placed features into the registry.
	 *
	 * @param context The registerable context.
	 */
	public static void bootstrap(Registerable<PlacedFeature> context) {
		var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

		register(context, PINE_PLACED_KEY,
				configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINE_KEY),
				VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
						PlacedFeatures.createCountExtraModifier(3, 0.1f, 1), PineBlocks.PINE_SAPLING
				));

		register(context, TIN_ORE_PLACED_KEY,
				configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TIN_ORE_KEY),
				ModOrePlacement.modifiersWithCount(16,
						HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-16), YOffset.fixed(112))));
		register(context, SILVER_ORE_PLACED_KEY,
				configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY),
				ModOrePlacement.modifiersWithCount(8,
						HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.fixed(32))));
	}

	/**
	 * Registers a {@link RegistryKey} for placed features.
	 *
	 * @param name The name of the placed feature.
	 * @return The created {@link RegistryKey}.
	 */
	public static RegistryKey<PlacedFeature> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(LotRMEMod.MOD_ID, name));
	}

	/**
	 * Registers placed features.
	 *
	 * @param context The registerable context.
	 * @param key The {@link RegistryKey}.
	 * @param configuration The configured feature as {@link RegistryEntry}.
	 * @param modifiers The placement modifiers as {@link List}.
	 */
	private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
			List<PlacementModifier> modifiers) {
		context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
	}

	/**
	 * Registers placed features.
	 *
	 * @param context The registerable context.
	 * @param key The {@link RegistryKey}.
	 * @param configuration The configured feature as {@link RegistryEntry}.
	 * @param modifiers The placement modifiers as varargs.
	 * @param <FC> The feature config type.
	 * @param <F> The feature type.
	 */
	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
			RegistryEntry<ConfiguredFeature<?, ?>> configuration,
			PlacementModifier... modifiers) {
		register(context, key, configuration, List.of(modifiers));
	}
}
