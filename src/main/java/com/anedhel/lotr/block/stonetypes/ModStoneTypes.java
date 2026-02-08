/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.block.stonetypes;

/**
 * Enum representing all stone types available in the mod.
 * <p>
 * Each stone type associates a {@link ModStoneSet} containing all block variants
 * with a display name used in translations.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public enum ModStoneTypes {

	BLUESLATE(BlueslateBlocks.BLUESLATE_SET, "Blueslate");

	private final ModStoneSet modStoneSet;
	private final String name;

	ModStoneTypes(ModStoneSet modStoneSet, String name) {
		this.modStoneSet = modStoneSet;
		this.name = name;
	}

	/**
	 * Returns the file-conform name of the stone type.
	 * <p>
	 * This is the display name converted to lowercase and with spaces replaced by underscores.
	 *
	 * @return The file-conform name of the stone type.
	 */
	public String getFileConformName() {
		return name.toLowerCase().replace(" ", "_");
	}

	public ModStoneSet getModStoneSet() {
		return modStoneSet;
	}

	public String getName() {
		return name;
	}
}
