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
