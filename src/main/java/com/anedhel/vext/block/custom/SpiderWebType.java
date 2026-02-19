/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.block.custom;

import net.minecraft.util.StringIdentifiable;

import java.util.Locale;

/**
 * Enum representing the different frieze types for the Vanilla Extensions Mod.
 * <p>
 * Each type describes a possible connection or ending of a frieze block
 * and is used at runtime for block rendering.
 *
 * @author Moritz Rohleder
 * @see ModFriezeBlock
 * @since 0.1.0
 */
public enum SpiderWebType implements StringIdentifiable {
	SINGLE("single"),
	NORTH("n"),
	EAST("e"),
	SOUTH("s"),
	WEST("w"),
	UP("u"),
	NORTH_EAST("ne"),
	NORTH_SOUTH("ns"),
	NORTH_WEST("nw"),
	NORTH_UP("nu"),
	EAST_SOUTH("es"),
	EAST_WEST("ew"),
	EAST_UP("eu"),
	SOUTH_WEST("sw"),
	SOUTH_UP("su"),
	WEST_UP("wu"),
	NORTH_EAST_SOUTH("nes"),
	NORTH_EAST_WEST("new"),
	NORTH_EAST_UP("neu"),
	NORTH_SOUTH_WEST("nsw"),
	NORTH_SOUTH_UP("nsu"),
	NORTH_WEST_UP("nwu"),
	EAST_SOUTH_WEST("esw"),
	EAST_SOUTH_UP("esu"),
	EAST_WEST_UP("ewu"),
	SOUTH_WEST_UP("swu"),
	NORTH_EAST_SOUTH_WEST("nesw"),
	NORTH_EAST_SOUTH_UP("nesu"),
	NORTH_EAST_WEST_UP("newu"),
	NORTH_SOUTH_WEST_UP("nswu"),
	EAST_SOUTH_WEST_UP("eswu"),
	NORTH_EAST_SOUTH_WEST_UP("neswu");


	private final String name;

	SpiderWebType(String name) {
		this.name = name;
	}

	/**
	 * {@return the unique string representation of the enum, used for serialization}
	 */
	@Override
	public String asString() {
		return this.name.toLowerCase(Locale.ROOT);
	}
}
