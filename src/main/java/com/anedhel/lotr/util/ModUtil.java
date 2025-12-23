package com.anedhel.lotr.util;

import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;

public class ModUtil {

	public static Block getBlockFromFamily(BlockFamily family, String variant) {
		Block block;
		switch (variant) {
			case "base" -> block = family.getBaseBlock();
			case "stairs" -> block = family.getVariant(BlockFamily.Variant.STAIRS);
			case "slab" -> block = family.getVariant(BlockFamily.Variant.SLAB);
			case "button" -> block = family.getVariant(BlockFamily.Variant.BUTTON);
			case "pressure_plate" -> block = family.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
			case "fence" -> block = family.getVariant(BlockFamily.Variant.FENCE);
			case "fence_gate" -> block = family.getVariant(BlockFamily.Variant.FENCE_GATE);
			case "door" -> block = family.getVariant(BlockFamily.Variant.DOOR);
			case "trapdoor" -> block = family.getVariant(BlockFamily.Variant.TRAPDOOR);
			case "chiseled" -> block = family.getVariant(BlockFamily.Variant.CHISELED);
			case "sign" -> block = family.getVariant(BlockFamily.Variant.SIGN);
			case "wall_sign" -> block = family.getVariant(BlockFamily.Variant.WALL_SIGN);
			case "wall" -> block = family.getVariant(BlockFamily.Variant.WALL);
			default -> throw new IllegalArgumentException("Unknown variant: " + variant + " of " + family.getBaseBlock().getName());
		}
		if (block == null) {
			throw new IllegalArgumentException("BlockFamily does not have variant: " + variant + " for base block: " + family.getBaseBlock().getName());
		}
		return block;
	}
}
