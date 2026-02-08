/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.util;

import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;

/**
 * Utility methods for common operations in the mod.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModUtil {

	/**
	 * Retrieves a specific {@link Block} variant from a {@link BlockFamily}.
	 *
	 * @param family the {@link BlockFamily} to search
	 * @param variant the variant name (e.g., "stairs", "slab", "wall")
	 * @return the {@link Block} matching the variant
	 * @throws IllegalArgumentException if the variant is unknown or not present in the family
	 */
	public static Block getBlockFromFamily(BlockFamily family, String variant) {
		Block block;
		switch (variant) {
			case "base" -> block = family.getBaseBlock();
			case "stairs" -> block = family.getVariant(BlockFamily.Variant.STAIRS);
			case "slab" -> block = family.getVariant(BlockFamily.Variant.SLAB);
			case "button" -> block = family.getVariant(BlockFamily.Variant.BUTTON);
			case "pressure_plate" -> block = family.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
			case "fence" -> block = family.getVariant(BlockFamily.Variant.FENCE);
			case "fence_gate" -> block = family.getVariant(BlockFamily.Variant.FENCE_GATE);
			case "door" -> block = family.getVariant(BlockFamily.Variant.DOOR);
			case "trapdoor" -> block = family.getVariant(BlockFamily.Variant.TRAPDOOR);
			case "chiseled" -> block = family.getVariant(BlockFamily.Variant.CHISELED);
			case "sign" -> block = family.getVariant(BlockFamily.Variant.SIGN);
			case "wall_sign" -> block = family.getVariant(BlockFamily.Variant.WALL_SIGN);
			case "wall" -> block = family.getVariant(BlockFamily.Variant.WALL);
			default -> throw new IllegalArgumentException("Unknown variant: " + variant + " of " + family.getBaseBlock().getName());
		}
		if (block == null) {
			throw new IllegalArgumentException("BlockFamily does not have variant: " + variant + " for base block: " + family.getBaseBlock().getName());
		}
		return block;
	}
}
