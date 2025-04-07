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