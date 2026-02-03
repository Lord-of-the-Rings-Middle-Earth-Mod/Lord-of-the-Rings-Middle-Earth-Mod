/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.block.woodtypes;

/**
 * Enum representing all wood types available in the mod.
 * <p>
 * Each wood type associates a {@link ModWoodSet} containing all block variants
 * with a display name used in translations.
 * </p>
 *
 * @author Moritz Rohleder
 * @see ModWoodSet
 * @see PineBlocks
 * @since 0.1.0
 */
public enum ModWoodTypes {

	PINE(PineBlocks.PINE_SET, "Pine");

	private final ModWoodSet modWoodSet;
	private final String name;

	ModWoodTypes(ModWoodSet modWoodSet, String name) {
		this.modWoodSet = modWoodSet;
		this.name = name;
	}

	public ModWoodSet getModWoodSet() {
		return modWoodSet;
	}

	public String getName() {
		return name;
	}
}
