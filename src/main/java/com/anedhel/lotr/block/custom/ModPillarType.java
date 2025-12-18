package com.anedhel.lotr.block.custom;

import net.minecraft.util.StringIdentifiable;

public enum ModPillarType implements StringIdentifiable {
	SINGLE("single"),
	TOP("top"),
	MIDDLE("middle"),
	BASE("base");

	private final String name;

	ModPillarType(String name) {
		this.name = name;
	}

	/**
	 * {@return the unique string representation of the enum, used for serialization}
	 */
	@Override
	public String asString() {
		return this.name();
	}
}
