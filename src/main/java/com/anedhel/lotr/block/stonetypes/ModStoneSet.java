/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.block.stonetypes;

import com.anedhel.lotr.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Represents a complete set of stone blocks including multiple variants and decorative styles.
 * <p>
 * This class organizes stone blocks into {@link BlockFamily} based on their state (stone, cobbled, smooth),
 * condition (normal, mossy, overgrown, cracked), and ornamentation (bronze, silver, gold).
 * It also manages specialized stone subsets like polished, pillars, friezes, and various brick styles.
 *
 * @author Moritz Rohleder
 * @see ModStoneTypes
 * @see ModStoneSubSet
 * @see StoneTypeVariants
 * @since 0.1.0
 */
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

	/**
	 * Generates a list of all stone items for display in item groups.
	 *
	 * @return a list of {@link ItemStack} containing all stone blocks in this set
	 */
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

	/**
	 * Converts a {@link BlockFamily} to a list of item stacks.
	 *
	 * @param family the {@link BlockFamily} to convert
	 * @return a list of {@link ItemStack} for all blocks in the family
	 */
	private List<ItemStack> getBlockFamilyList(BlockFamily family) {
		List<ItemStack> blockFamilyList = new java.util.LinkedList<>();
		blockFamilyList.add(new ItemStack(family.getBaseBlock()));
		family.getVariants().values().forEach(block -> blockFamilyList.add(new ItemStack(block)));
		return blockFamilyList;
	}

	/**
	 * Retrieves all block families in this stone set.
	 *
	 * @return a list of all {@link BlockFamily}
	 */
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

	/**
	 * Retrieves all stone subsets in this stone set.
	 *
	 * @return a list of all {@link ModStoneSubSet}
	 */
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

	/**
	 * Retrieves a specific variant block from the stone family.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
	public Block getStoneVariant(String variant) {
		return ModUtil.getBlockFromFamily(STONE_FAMILY, variant);
	}

	public BlockFamily getMossyStoneFamily() {
		return MOSSY_STONE_FAMILY;
	}

	/**
	 * Retrieves a specific variant block from the mossy stone family.
	 * While the method isn´t used at the moment, we provide this Getter as it may be useful in the future.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
	public Block getMossyStoneVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_STONE_FAMILY, variant);
	}

	public BlockFamily getOvergrownStoneFamily() {
		return OVERGROWN_STONE_FAMILY;
	}

	/**
	 * Retrieves a specific variant block from the overgrown stone family.
	 * While the method isn´t used at the moment, we provide this Getter as it may be useful in the future.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
	public Block getOvergrownStoneVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_STONE_FAMILY, variant);
	}

	public BlockFamily getCobbledFamily() {
		return COBBLED_FAMILY;
	}

	/**
	 * Retrieves a specific variant block from the cobbled family.
	 * While the method isn´t used at the moment, we provide this Getter as it may be useful in the future.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
	public Block getCobbledVariant(String variant) {
		return ModUtil.getBlockFromFamily(COBBLED_FAMILY, variant);
	}

	public BlockFamily getMossyCobbledFamily() {
		return MOSSY_COBBLED_FAMILY;
	}

	/**
	 * Retrieves a specific variant block from the mossy cobbled family.
	 * While the method isn´t used at the moment, we provide this Getter as it may be useful in the future.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
	public Block getMossyCobbledVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_COBBLED_FAMILY, variant);
	}

	public BlockFamily getOvergrownCobbledFamily() {
		return OVERGROWN_COBBLED_FAMILY;
	}

	/**
	 * Retrieves a specific variant block from the overgrown cobbled family.
	 * While the method isn´t used at the moment, we provide this Getter as it may be useful in the future.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
	public Block getOvergrownCobbledVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_COBBLED_FAMILY, variant);
	}

	public BlockFamily getSmoothFamily() {
		return SMOOTH_FAMILY;
	}

	/**
	 * Retrieves a specific variant block from the smooth family.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
	public Block getSmoothVariant(String variant) {
		return ModUtil.getBlockFromFamily(SMOOTH_FAMILY, variant);
	}

	public BlockFamily getMossySmoothFamily() {
		return MOSSY_SMOOTH_FAMILY;
	}

	/**
	 * Retrieves a specific variant block from the mossy smooth family.
	 * While the method isn´t used at the moment, we provide this Getter as it may be useful in the future.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
	public Block getMossySmoothVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_SMOOTH_FAMILY, variant);
	}

	public BlockFamily getOvergrownSmoothFamily() {
		return OVERGROWN_SMOOTH_FAMILY;
	}

	/**
	 * Retrieves a specific variant block from the overgrown smooth family.
	 * While the method isn´t used at the moment, we provide this Getter as it may be useful in the future.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
	public Block getOvergrownSmoothVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_SMOOTH_FAMILY, variant);
	}

	public BlockFamily getCrackedSmoothFamily() {
		return CRACKED_SMOOTH_FAMILY;
	}

	/**
	 * Retrieves a specific variant block from the cracked smooth family.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
	public Block getCrackedSmoothVariant(String variant) {
		return ModUtil.getBlockFromFamily(CRACKED_SMOOTH_FAMILY, variant);
	}

	public BlockFamily getMossyCrackedSmoothFamily() {
		return MOSSY_CRACKED_SMOOTH_FAMILY;
	}

	/**
	 * Retrieves a specific variant block from the mossy cracked smooth family.
	 * While the method isn´t used at the moment, we provide this Getter as it may be useful in the future.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
	public Block getMossyCrackedSmoothVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_CRACKED_SMOOTH_FAMILY, variant);
	}

	public BlockFamily getOvergrownCrackedSmoothFamily() {
		return OVERGROWN_CRACKED_SMOOTH_FAMILY;
	}

	/**
	 * Retrieves a specific variant block from the overgrown cracked smooth family.
	 * While the method isn´t used at the moment, we provide this Getter as it may be useful in the future.
	 *
	 * @param variant the variant name (e.g., "stairs", "slab")
	 * @see ModUtil#getBlockFromFamily(BlockFamily, String)
	 * @return the block matching the variant name
	 */
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
