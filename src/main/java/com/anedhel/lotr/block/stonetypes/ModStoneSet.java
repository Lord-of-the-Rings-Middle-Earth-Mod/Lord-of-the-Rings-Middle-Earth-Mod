package com.anedhel.lotr.block.stonetypes;

import com.anedhel.lotr.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ModStoneSet {

	private final BlockFamily STONE_FAMILY;
	private final BlockFamily MOSSY_STONE_FAMILY;
	private final BlockFamily OVERGROWN_STONE_FAMILY;

	private final BlockFamily COBBLED_FAMILY;
	private final BlockFamily MOSSY_COBBLED_FAMILY;
	private final BlockFamily OVERGROWN_COBBLED_FAMILY;

	private final BlockFamily SMOOTH_FAMILY;
	private final BlockFamily MOSSY_SMOOTH_FAMILY;
	private final BlockFamily OVERGROWN_SMOOTH_FAMILY;

	private final BlockFamily CRACKED_SMOOTH_FAMILY;
	private final BlockFamily MOSSY_CRACKED_SMOOTH_FAMILY;
	private final BlockFamily OVERGROWN_CRACKED_SMOOTH_FAMILY;

	private final ModStoneSubSet POLISHED_SET;
	private final ModStoneSubSet PILLAR_SET;
	private final ModStoneSubSet FRIEZE_SET;
	private final ModStoneSubSet COBBLED_BRICK_SET;
	private final ModStoneSubSet RUSTIC_BRICK_SET;
	private final ModStoneSubSet BRICK_SET;
	private final ModStoneSubSet FANCY_BRICK_SET;
	private final ModStoneSubSet TILE_SET;
	private final ModStoneSubSet PAVEMENT_SET;

	public ModStoneSet(BlockFamily stoneFamily, BlockFamily mossyStoneFamily, BlockFamily overgrownStoneFamily,
			BlockFamily cobbledFamily, BlockFamily mossyCobbledFamily, BlockFamily overgrownCobbledFamily,
			BlockFamily smoothFamily, BlockFamily mossySmoothFamily, BlockFamily overgrownSmoothFamily,
			BlockFamily crackedSmoothFamily, BlockFamily mossyCrackedSmoothFamily,
			BlockFamily overgrownCrackedSmoothFamily,
			ModStoneSubSet polishedSet,
			ModStoneSubSet pillarSet,
			ModStoneSubSet friezeSet,
			ModStoneSubSet cobbledBrickSet,
			ModStoneSubSet rusticBrickSet,
			ModStoneSubSet brickSet,
			ModStoneSubSet tileSet,
			ModStoneSubSet pavementSet,
			ModStoneSubSet fancyBrickSet) {
		STONE_FAMILY = stoneFamily;
		MOSSY_STONE_FAMILY = mossyStoneFamily;
		OVERGROWN_STONE_FAMILY = overgrownStoneFamily;

		COBBLED_FAMILY = cobbledFamily;
		MOSSY_COBBLED_FAMILY = mossyCobbledFamily;
		OVERGROWN_COBBLED_FAMILY = overgrownCobbledFamily;

		SMOOTH_FAMILY = smoothFamily;
		MOSSY_SMOOTH_FAMILY = mossySmoothFamily;
		OVERGROWN_SMOOTH_FAMILY = overgrownSmoothFamily;
		CRACKED_SMOOTH_FAMILY = crackedSmoothFamily;
		MOSSY_CRACKED_SMOOTH_FAMILY = mossyCrackedSmoothFamily;
		OVERGROWN_CRACKED_SMOOTH_FAMILY = overgrownCrackedSmoothFamily;

		POLISHED_SET = polishedSet;
		PILLAR_SET = pillarSet;
		FRIEZE_SET = friezeSet;
		COBBLED_BRICK_SET = cobbledBrickSet;
		RUSTIC_BRICK_SET = rusticBrickSet;
		BRICK_SET = brickSet;
		TILE_SET = tileSet;
		PAVEMENT_SET = pavementSet;
		FANCY_BRICK_SET = fancyBrickSet;
	}

	public List<ItemStack> getStoneItemGroupList() {
		List<ItemStack> stoneItemGroupList = new java.util.LinkedList<>();
		stoneItemGroupList.addAll(getBlockFamilyList(STONE_FAMILY));
		stoneItemGroupList.addAll(getBlockFamilyList(MOSSY_STONE_FAMILY));
		stoneItemGroupList.addAll(getBlockFamilyList(OVERGROWN_STONE_FAMILY));
		stoneItemGroupList.addAll(getBlockFamilyList(COBBLED_FAMILY));
		stoneItemGroupList.addAll(getBlockFamilyList(MOSSY_COBBLED_FAMILY));
		stoneItemGroupList.addAll(getBlockFamilyList(OVERGROWN_COBBLED_FAMILY));
		stoneItemGroupList.addAll(getBlockFamilyList(SMOOTH_FAMILY));
		stoneItemGroupList.addAll(getBlockFamilyList(MOSSY_SMOOTH_FAMILY));
		stoneItemGroupList.addAll(getBlockFamilyList(OVERGROWN_SMOOTH_FAMILY));
		stoneItemGroupList.addAll(getBlockFamilyList(CRACKED_SMOOTH_FAMILY));
		stoneItemGroupList.addAll(getBlockFamilyList(MOSSY_CRACKED_SMOOTH_FAMILY));
		stoneItemGroupList.addAll(getBlockFamilyList(OVERGROWN_CRACKED_SMOOTH_FAMILY));

		stoneItemGroupList.addAll(POLISHED_SET.getStoneSubSetItemGroupList());
		stoneItemGroupList.addAll(PILLAR_SET.getStoneSubSetItemGroupList());
		stoneItemGroupList.addAll(FRIEZE_SET.getStoneSubSetItemGroupList());
		stoneItemGroupList.addAll(COBBLED_BRICK_SET.getStoneSubSetItemGroupList());
		stoneItemGroupList.addAll(RUSTIC_BRICK_SET.getStoneSubSetItemGroupList());
		stoneItemGroupList.addAll(BRICK_SET.getStoneSubSetItemGroupList());
		stoneItemGroupList.addAll(TILE_SET.getStoneSubSetItemGroupList());
		stoneItemGroupList.addAll(PAVEMENT_SET.getStoneSubSetItemGroupList());
		stoneItemGroupList.addAll(FANCY_BRICK_SET.getStoneSubSetItemGroupList());
		return stoneItemGroupList;
	}

	private List<ItemStack> getBlockFamilyList(BlockFamily family) {
		List<ItemStack> blockFamilyList = new java.util.LinkedList<>();
		blockFamilyList.add(new ItemStack(family.getBaseBlock()));
		family.getVariants().values().forEach(block -> blockFamilyList.add(new ItemStack(block)));
		return blockFamilyList;
	}

	public List<BlockFamily> getAllBlockFamilies() {
		return List.of(
				STONE_FAMILY,
				MOSSY_STONE_FAMILY,
				OVERGROWN_STONE_FAMILY,
				COBBLED_FAMILY,
				MOSSY_COBBLED_FAMILY,
				OVERGROWN_COBBLED_FAMILY,
				SMOOTH_FAMILY,
				MOSSY_SMOOTH_FAMILY,
				OVERGROWN_SMOOTH_FAMILY,
				CRACKED_SMOOTH_FAMILY,
				MOSSY_CRACKED_SMOOTH_FAMILY,
				OVERGROWN_CRACKED_SMOOTH_FAMILY
		);
	}

	public List<ModStoneSubSet> getAllStoneSubSets() {
		return List.of(
				POLISHED_SET,
				PILLAR_SET,
				FRIEZE_SET,
				COBBLED_BRICK_SET,
				RUSTIC_BRICK_SET,
				BRICK_SET,
				TILE_SET,
				PAVEMENT_SET,
				FANCY_BRICK_SET
		);
	}

	public BlockFamily getStoneFamily() {
		return STONE_FAMILY;
	}

	public Block getStoneVariant(String variant) {
		return ModUtil.getBlockFromFamily(STONE_FAMILY, variant);
	}

	public BlockFamily getMossyStoneFamily() {
		return MOSSY_STONE_FAMILY;
	}

	public Block getMossyStoneVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_STONE_FAMILY, variant);
	}

	public BlockFamily getOvergrownStoneFamily() {
		return OVERGROWN_STONE_FAMILY;
	}

	public Block getOvergrownStoneVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_STONE_FAMILY, variant);
	}

	public BlockFamily getCobbledFamily() {
		return COBBLED_FAMILY;
	}

	public Block getCobbledVariant(String variant) {
		return ModUtil.getBlockFromFamily(COBBLED_FAMILY, variant);
	}

	public BlockFamily getMossyCobbledFamily() {
		return MOSSY_COBBLED_FAMILY;
	}

	public Block getMossyCobbledVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_COBBLED_FAMILY, variant);
	}

	public BlockFamily getOvergrownCobbledFamily() {
		return OVERGROWN_COBBLED_FAMILY;
	}

	public Block getOvergrownCobbledVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_COBBLED_FAMILY, variant);
	}

	public BlockFamily getSmoothFamily() {
		return SMOOTH_FAMILY;
	}

	public Block getSmoothVariant(String variant) {
		return ModUtil.getBlockFromFamily(SMOOTH_FAMILY, variant);
	}

	public BlockFamily getMossySmoothFamily() {
		return MOSSY_SMOOTH_FAMILY;
	}

	public Block getMossySmoothVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_SMOOTH_FAMILY, variant);
	}

	public BlockFamily getOvergrownSmoothFamily() {
		return OVERGROWN_SMOOTH_FAMILY;
	}

	public Block getOvergrownSmoothVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_SMOOTH_FAMILY, variant);
	}

	public BlockFamily getCrackedSmoothFamily() {
		return CRACKED_SMOOTH_FAMILY;
	}

	public Block getCrackedSmoothVariant(String variant) {
		return ModUtil.getBlockFromFamily(CRACKED_SMOOTH_FAMILY, variant);
	}

	public BlockFamily getMossyCrackedSmoothFamily() {
		return MOSSY_CRACKED_SMOOTH_FAMILY;
	}

	public Block getMossyCrackedSmoothVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_CRACKED_SMOOTH_FAMILY, variant);
	}

	public BlockFamily getOvergrownCrackedSmoothFamily() {
		return OVERGROWN_CRACKED_SMOOTH_FAMILY;
	}

	public Block getOvergrownCrackedSmoothVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_CRACKED_SMOOTH_FAMILY, variant);
	}

	public ModStoneSubSet getPolishedSet() {
		return POLISHED_SET;
	}

	public ModStoneSubSet getPillarSet() {
		return PILLAR_SET;
	}

	public ModStoneSubSet getFriezeSet() {
		return FRIEZE_SET;
	}

	public ModStoneSubSet getCobbledBrickSet() {
		return COBBLED_BRICK_SET;
	}

	public ModStoneSubSet getRusticBrickSet() {
		return RUSTIC_BRICK_SET;
	}

	public ModStoneSubSet getBrickSet() {
		return BRICK_SET;
	}

	public ModStoneSubSet getTileSet() {
		return TILE_SET;
	}

	public ModStoneSubSet getPavementSet() {
		return PAVEMENT_SET;
	}

	public ModStoneSubSet getFancyBrickSet() {
		return FANCY_BRICK_SET;
	}
}
