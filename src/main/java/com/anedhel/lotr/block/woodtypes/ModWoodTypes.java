package com.anedhel.lotr.block.woodtypes;

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
