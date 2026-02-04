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

import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

/**
 * Utility class for ore placement modifiers.
 * Provides methods that are private in the vanilla code.
 *
 * @author Moritz Rohleder
 * @see net.minecraft.world.gen.feature.OrePlacedFeatures
 * @since 0.1.0
 */
public class ModOrePlacement {

	/**
	 *  Returns a list of placement modifiers including the given count modifier and height modifier.
	 *
	 * @param countModifier The count placement modifier.
	 * @param heightModifier The height placement modifier.
	 * @return A list of placement modifiers.
	 */
	public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
		return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
	}

	/**
	 * Returns a list of placement modifiers including the given count and height modifier.
	 *
	 * @param count The number of times to place the feature.
	 * @param heightModifier The height placement modifier.
	 * @return A list of placement modifiers.
	 */
	public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
		return modifiers(CountPlacementModifier.of(count), heightModifier);
	}

	/**
	 * Returns a list of placement modifiers including the given rarity and height modifier.
	 *
	 * @param chance The chance (1 in X) to place the feature.
	 * @param heightModifier The height placement modifier.
	 * @return A list of placement modifiers.
	 */
	public static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
		return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
	}
}
