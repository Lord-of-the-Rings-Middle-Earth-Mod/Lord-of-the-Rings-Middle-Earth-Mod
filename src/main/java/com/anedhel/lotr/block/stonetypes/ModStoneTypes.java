package com.anedhel.lotr.block.stonetypes;

public enum ModStoneTypes {

	BLUESLATE(BlueslateBlocks.BLUESLATE_SET, "Blueslate");

	private final ModStoneSet modStoneSet;
	private final String name;

	ModStoneTypes(ModStoneSet modStoneSet, String name) {
		this.modStoneSet = modStoneSet;
		this.name = name;
	}

	public ModStoneSet getModStoneSet() {
		return modStoneSet;
	}

	public String getName() {
		return name;
	}
}
