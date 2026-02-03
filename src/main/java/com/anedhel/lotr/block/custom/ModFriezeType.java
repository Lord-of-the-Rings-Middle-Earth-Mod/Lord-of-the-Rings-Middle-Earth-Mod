/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.block.custom;

import net.minecraft.util.StringIdentifiable;

import java.util.Locale;

public enum ModFriezeType implements StringIdentifiable {
	SINGLE("single"),
	NORTH_END("n_end"),
	EAST_END("e_end"),
	SOUTH_END("s_end"),
	WEST_END("w_end"),
	NORTH_SOUTH_MIDDLE("ns_middle"),
	EAST_WEST_MIDDLE("ew_middle"),
	NORTH_WEST_CORNER("nw_corner"),
	NORTH_EAST_CORNER("ne_corner"),
	SOUTH_WEST_CORNER("sw_corner"),
	SOUTH_EAST_CORNER("se_corner"),
	T_NORTH_MIDDLE("t_n_middle"),
	T_EAST_MIDDLE("t_e_middle"),
	T_SOUTH_MIDDLE("t_s_middle"),
	T_WEST_MIDDLE("t_w_middle"),
	CROSS_MIDDLE("cross");

	private final String name;

	ModFriezeType(String name) {
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
