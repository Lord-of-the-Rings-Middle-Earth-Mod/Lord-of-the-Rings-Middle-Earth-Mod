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

package me.anedhel.lotr.block.custom;

import net.minecraft.util.StringIdentifiable;

/**
 * Enum representing the different types of pillars in the mod.
 * Each type has a unique string identifier.
 */
public enum ModPillarType implements StringIdentifiable {
	SINGLE("single"),
	BASE("base"),
	MIDDLE("middle"),
	TOP("top");

	private final String name;

	ModPillarType(String name) {
		this.name = name;
	}

	@Override
	public String asString() {
		return this.name;
	}
}