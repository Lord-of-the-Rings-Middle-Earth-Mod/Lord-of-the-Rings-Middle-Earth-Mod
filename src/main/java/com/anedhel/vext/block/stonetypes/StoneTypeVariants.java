/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.block.stonetypes;

/**
 * Enum representing all possible stone variant combinations.
 * <p>
 * Stone variants include base types (stone, mossy, overgrown), cracked states,
 * and metal ornamentations (bronze, silver, gold). This enum is used for
 * generating recipes and managing stone block variants programmatically.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public enum StoneTypeVariants {
	STONE,
	MOSSY_STONE,
	OVERGROWN_STONE,
	BRONZE_STONE,
	MOSSY_BRONZE_STONE,
	OVERGROWN_BRONZE_STONE,
	SILVER_STONE,
	MOSSY_SILVER_STONE,
	OVERGROWN_SILVER_STONE,
	GOLD_STONE,
	MOSSY_GOLD_STONE,
	OVERGROWN_GOLD_STONE,
	CRACKED_STONE,
	CRACKED_MOSSY_STONE,
	CRACKED_OVERGROWN_STONE,
	CRACKED_BRONZE_STONE,
	CRACKED_MOSSY_BRONZE_STONE,
	CRACKED_OVERGROWN_BRONZE_STONE,
	CRACKED_SILVER_STONE,
	CRACKED_MOSSY_SILVER_STONE,
	CRACKED_OVERGROWN_SILVER_STONE,
	CRACKED_GOLD_STONE,
	CRACKED_MOSSY_GOLD_STONE,
	CRACKED_OVERGROWN_GOLD_STONE;

	/**
	 * Returns the recipe path for the given stone type variant.
	 * The recipe path is used for crafting the stone type.
	 *
	 * @param variant the stone type variant
	 * @param name the name of the stone type
	 * @return the recipe path for the stone type variant
	 */
	public static String getRecipePath(StoneTypeVariants variant, String name) {
		switch(variant) {
			case STONE -> {
				return name;
			}
			case MOSSY_STONE -> {
				return "m_" + name;
			}
			case OVERGROWN_STONE -> {
				return "o_" + name;
			}
			case BRONZE_STONE -> {
				return "b_" + name;
			}
			case MOSSY_BRONZE_STONE -> {
				return "m_b_" + name;
			}
			case OVERGROWN_BRONZE_STONE -> {
				return "o_b_" + name;
			}
			case SILVER_STONE -> {
				return "s_" + name;
			}
			case MOSSY_SILVER_STONE -> {
				return "m_s_" + name;
			}
			case OVERGROWN_SILVER_STONE -> {
				return "o_s_" + name;
			}
			case GOLD_STONE -> {
				return "g_" + name;
			}
			case MOSSY_GOLD_STONE -> {
				return "m_g_" + name;
			}
			case OVERGROWN_GOLD_STONE -> {
				return "o_g_" + name;
			}
			case CRACKED_STONE -> {
				return "c_" + name;
			}
			case CRACKED_MOSSY_STONE -> {
				return "c_m_" + name;
			}
			case CRACKED_OVERGROWN_STONE -> {
				return "c_o_" + name;
			}
			case CRACKED_BRONZE_STONE -> {
				return "c_b_" + name;
			}
			case CRACKED_MOSSY_BRONZE_STONE -> {
				return "c_m_b_" + name;
			}
			case CRACKED_OVERGROWN_BRONZE_STONE -> {
				return "c_o_b_" + name;
			}
			case CRACKED_SILVER_STONE -> {
				return "c_s_" + name;
			}
			case CRACKED_MOSSY_SILVER_STONE -> {
				return "c_m_s_" + name;
			}
			case CRACKED_OVERGROWN_SILVER_STONE -> {
				return "c_o_s_" + name;
			}
			case CRACKED_GOLD_STONE -> {
				return "c_g_" + name;
			}
			case CRACKED_MOSSY_GOLD_STONE -> {
				return "c_m_g_" + name;
			}
			case CRACKED_OVERGROWN_GOLD_STONE -> {
				return "c_o_g_" + name;
			}
			default -> {
				return "";
			}
		}
	}

	/**
	 * Returns the variant, from which the given ornamented variant is crafted
	 * While not used now, the Getter might be used in the future
	 *
	 * @param variant the ornamented variant
	 * @return the base variant
	 */
	public static StoneTypeVariants getBaseFromOrnamented(StoneTypeVariants variant) {
		switch(variant){
			case BRONZE_STONE, SILVER_STONE, GOLD_STONE -> {
				return StoneTypeVariants.STONE;
			}
			case MOSSY_BRONZE_STONE, MOSSY_SILVER_STONE, MOSSY_GOLD_STONE -> {
				return StoneTypeVariants.MOSSY_STONE;
			}
			case OVERGROWN_BRONZE_STONE, OVERGROWN_SILVER_STONE, OVERGROWN_GOLD_STONE -> {
				return StoneTypeVariants.OVERGROWN_STONE;
			}
			case CRACKED_BRONZE_STONE, CRACKED_SILVER_STONE, CRACKED_GOLD_STONE -> {
				return StoneTypeVariants.CRACKED_STONE;
			}
			case CRACKED_MOSSY_BRONZE_STONE, CRACKED_MOSSY_SILVER_STONE, CRACKED_MOSSY_GOLD_STONE -> {
				return StoneTypeVariants.CRACKED_MOSSY_STONE;
			}
			case CRACKED_OVERGROWN_BRONZE_STONE, CRACKED_OVERGROWN_SILVER_STONE, CRACKED_OVERGROWN_GOLD_STONE -> {
				return StoneTypeVariants.CRACKED_OVERGROWN_STONE;
			}
			default -> {
				return variant;
			}
		}
	}

	/**
	 * Returns the base variant from which the given cracked variant is derived.
	 * While not used now, the Getter might be used in the future
	 *
	 * @param variant the cracked variant
	 * @return the base variant
	 */
	public static StoneTypeVariants getBaseFromCracked(StoneTypeVariants variant) {
		switch(variant) {
			case CRACKED_STONE -> {
				return StoneTypeVariants.STONE;
			}
			case CRACKED_MOSSY_STONE -> {
				return StoneTypeVariants.MOSSY_STONE;
			}
			case CRACKED_OVERGROWN_STONE -> {
				return StoneTypeVariants.OVERGROWN_STONE;
			}
			case CRACKED_BRONZE_STONE -> {
				return StoneTypeVariants.BRONZE_STONE;
			}
			case CRACKED_MOSSY_BRONZE_STONE -> {
				return StoneTypeVariants.MOSSY_BRONZE_STONE;
			}
			case CRACKED_OVERGROWN_BRONZE_STONE -> {
				return StoneTypeVariants.OVERGROWN_BRONZE_STONE;
			}
			case CRACKED_SILVER_STONE -> {
				return StoneTypeVariants.SILVER_STONE;
			}
			case CRACKED_MOSSY_SILVER_STONE -> {
				return StoneTypeVariants.MOSSY_SILVER_STONE;
			}
			case CRACKED_OVERGROWN_SILVER_STONE -> {
				return StoneTypeVariants.OVERGROWN_SILVER_STONE;
			}
			case CRACKED_GOLD_STONE -> {
				return StoneTypeVariants.GOLD_STONE;
			}
			case CRACKED_MOSSY_GOLD_STONE -> {
				return StoneTypeVariants.MOSSY_GOLD_STONE;
			}
			case CRACKED_OVERGROWN_GOLD_STONE -> {
				return StoneTypeVariants.OVERGROWN_GOLD_STONE;
			}
			default -> {
				return variant;
			}
		}
	}

	/**
	 * Returns the base variant from which the given mossy or overgrown variant is derived.
	 * While not used now, the Getter might be used in the future
	 *
	 * @param variant the mossy or overgrown variant
	 * @return the base variant
	 */
	public static StoneTypeVariants getBaseFromMossyOrOvergrown(StoneTypeVariants variant) {
		switch(variant) {
			case MOSSY_STONE, OVERGROWN_STONE -> {
				return StoneTypeVariants.STONE;
			}
			case CRACKED_MOSSY_STONE, CRACKED_OVERGROWN_STONE -> {
				return StoneTypeVariants.CRACKED_STONE;
			}
			case MOSSY_BRONZE_STONE, OVERGROWN_BRONZE_STONE -> {
				return StoneTypeVariants.BRONZE_STONE;
			}
			case CRACKED_MOSSY_BRONZE_STONE, CRACKED_OVERGROWN_BRONZE_STONE -> {
				return StoneTypeVariants.CRACKED_BRONZE_STONE;
			}
			case MOSSY_SILVER_STONE, OVERGROWN_SILVER_STONE -> {
				return StoneTypeVariants.SILVER_STONE;
			}
			case CRACKED_MOSSY_SILVER_STONE, CRACKED_OVERGROWN_SILVER_STONE -> {
				return StoneTypeVariants.CRACKED_SILVER_STONE;
			}
			case MOSSY_GOLD_STONE, OVERGROWN_GOLD_STONE -> {
				return StoneTypeVariants.GOLD_STONE;
			}
			case CRACKED_MOSSY_GOLD_STONE, CRACKED_OVERGROWN_GOLD_STONE -> {
				return StoneTypeVariants.CRACKED_GOLD_STONE;
			}
			default -> {
				return variant;
			}
		}
	}

	/**
	 * Returns the mossy variant from the given overgrown variant.
	 * While not used now, the Getter might be used in the future
	 *
	 * @param variant the overgrown variant
	 * @return the corresponding mossy variant
	 */
	public static StoneTypeVariants getMossyFromOvergrown(StoneTypeVariants variant) {
		switch(variant) {
			case OVERGROWN_STONE -> {
				return StoneTypeVariants.MOSSY_STONE;
			}
			case CRACKED_OVERGROWN_STONE -> {
				return StoneTypeVariants.CRACKED_MOSSY_STONE;
			}
			case OVERGROWN_BRONZE_STONE -> {
				return StoneTypeVariants.MOSSY_BRONZE_STONE;
			}
			case CRACKED_OVERGROWN_BRONZE_STONE -> {
				return StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE;
			}
			case OVERGROWN_SILVER_STONE -> {
				return StoneTypeVariants.MOSSY_SILVER_STONE;
			}
			case CRACKED_OVERGROWN_SILVER_STONE -> {
				return StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE;
			}
			case OVERGROWN_GOLD_STONE -> {
				return StoneTypeVariants.MOSSY_GOLD_STONE;
			}
			case CRACKED_OVERGROWN_GOLD_STONE -> {
				return StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE;
			}
			default -> {
				return variant;
			}
		}
	}

	/**
	 * Checks whether a stone variant has metal ornamentation.
	 * While not used now, the Getter might be used in the future
	 *
	 * @param variant the stone variant to check
	 * @return true if the variant has bronze, silver, or gold ornamentation
	 */
	public static boolean isOrnamented(StoneTypeVariants variant) {
		switch(variant) {
			case BRONZE_STONE, MOSSY_BRONZE_STONE, OVERGROWN_BRONZE_STONE,
			     SILVER_STONE, MOSSY_SILVER_STONE, OVERGROWN_SILVER_STONE,
			     GOLD_STONE, MOSSY_GOLD_STONE, OVERGROWN_GOLD_STONE -> {
				return true;
			}
			default -> {
				return false;
			}
		}
	}

	/**
	 * Checks whether a stone variant is in a cracked state.
	 * While not used now, the Getter might be used in the future
	 *
	 * @param variant the stone variant to check
	 * @return true if the variant is cracked
	 */
	public static boolean isCracked(StoneTypeVariants variant) {
		switch(variant) {
			case CRACKED_STONE, CRACKED_MOSSY_STONE, CRACKED_OVERGROWN_STONE,
			     CRACKED_BRONZE_STONE, CRACKED_MOSSY_BRONZE_STONE, CRACKED_OVERGROWN_BRONZE_STONE,
			     CRACKED_SILVER_STONE, CRACKED_MOSSY_SILVER_STONE, CRACKED_OVERGROWN_SILVER_STONE,
			     CRACKED_GOLD_STONE, CRACKED_MOSSY_GOLD_STONE, CRACKED_OVERGROWN_GOLD_STONE -> {
				return true;
			}
			default -> {
				return false;
			}
		}
	}
}