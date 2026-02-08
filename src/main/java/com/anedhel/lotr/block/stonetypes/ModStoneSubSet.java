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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Represents a subset of stone blocks with variations including normal, mossy, overgrown, cracked, 
 * and metal-ornamented versions (bronze, silver, gold).
 *
 * @author Moritz Rohleder
 * @see ModStoneSet
 * @see StoneTypeVariants
 * @since 0.1.0
 */
public class ModStoneSubSet {

	private final BlockFamily BASE_FAMILY;
	private final BlockFamily MOSSY_FAMILY;
	private final BlockFamily OVERGROWN_FAMILY;

	private final BlockFamily CRACKED_FAMILY;
	private final BlockFamily MOSSY_CRACKED_FAMILY;
	private final BlockFamily OVERGROWN_CRACKED_FAMILY;

	private final BlockFamily BRONZE_FAMILY;
	private final BlockFamily MOSSY_BRONZE_FAMILY;
	private final BlockFamily OVERGROWN_BRONZE_FAMILY;

	private final BlockFamily CRACKED_BRONZE_FAMILY;
	private final BlockFamily MOSSY_CRACKED_BRONZE_FAMILY;
	private final BlockFamily OVERGROWN_CRACKED_BRONZE_FAMILY;

	private final BlockFamily SILVER_FAMILY;
	private final BlockFamily MOSSY_SILVER_FAMILY;
	private final BlockFamily OVERGROWN_SILVER_FAMILY;

	private final BlockFamily CRACKED_SILVER_FAMILY;
	private final BlockFamily MOSSY_CRACKED_SILVER_FAMILY;
	private final BlockFamily OVERGROWN_CRACKED_SILVER_FAMILY;

	private final BlockFamily GOLD_FAMILY;
	private final BlockFamily MOSSY_GOLD_FAMILY;
	private final BlockFamily OVERGROWN_GOLD_FAMILY;

	private final BlockFamily CRACKED_GOLD_FAMILY;
	private final BlockFamily MOSSY_CRACKED_GOLD_FAMILY;
	private final BlockFamily OVERGROWN_CRACKED_GOLD_FAMILY;

	private final String NAME;

	private final Map<BlockFamily, BlockFamily> crackedFamilyMap = new HashMap<>();

	public ModStoneSubSet(BlockFamily baseFamily, BlockFamily mossyBaseFamily, BlockFamily overgrownBaseFamily,
			BlockFamily crackedBaseFamily, BlockFamily mossyCrackedBaseFamily, BlockFamily overgrownCrackedBaseFamily,
			BlockFamily bronzeBaseFamily, BlockFamily mossyBronzeBaseFamily, BlockFamily overgrownBronzeBaseFamily,
			BlockFamily crackedBronzeBaseFamily, BlockFamily mossyCrackedBronzeBaseFamily,
			BlockFamily overgrownCrackedBronzeBaseFamily, BlockFamily silverBaseFamily,
			BlockFamily mossySilverBaseFamily, BlockFamily overgrownSilverBaseFamily,
			BlockFamily crackedSilverBaseFamily, BlockFamily mossyCrackedSilverBaseFamily,
			BlockFamily overgrownCrackedSilverBaseFamily, BlockFamily goldBaseFamily, BlockFamily mossyGoldBaseFamily,
			BlockFamily overgrownGoldBaseFamily, BlockFamily crackedGoldBaseFamily,
			BlockFamily mossyCrackedGoldBaseFamily, BlockFamily overgrownCrackedGoldBaseFamily, String name) {
		BASE_FAMILY = baseFamily;
		MOSSY_FAMILY = mossyBaseFamily;
		OVERGROWN_FAMILY = overgrownBaseFamily;
		CRACKED_FAMILY = crackedBaseFamily;
		MOSSY_CRACKED_FAMILY = mossyCrackedBaseFamily;
		OVERGROWN_CRACKED_FAMILY = overgrownCrackedBaseFamily;
		BRONZE_FAMILY = bronzeBaseFamily;
		MOSSY_BRONZE_FAMILY = mossyBronzeBaseFamily;
		OVERGROWN_BRONZE_FAMILY = overgrownBronzeBaseFamily;
		CRACKED_BRONZE_FAMILY = crackedBronzeBaseFamily;
		MOSSY_CRACKED_BRONZE_FAMILY = mossyCrackedBronzeBaseFamily;
		OVERGROWN_CRACKED_BRONZE_FAMILY = overgrownCrackedBronzeBaseFamily;
		SILVER_FAMILY = silverBaseFamily;
		MOSSY_SILVER_FAMILY = mossySilverBaseFamily;
		OVERGROWN_SILVER_FAMILY = overgrownSilverBaseFamily;
		CRACKED_SILVER_FAMILY = crackedSilverBaseFamily;
		MOSSY_CRACKED_SILVER_FAMILY = mossyCrackedSilverBaseFamily;
		OVERGROWN_CRACKED_SILVER_FAMILY = overgrownCrackedSilverBaseFamily;
		GOLD_FAMILY = goldBaseFamily;
		MOSSY_GOLD_FAMILY = mossyGoldBaseFamily;
		OVERGROWN_GOLD_FAMILY = overgrownGoldBaseFamily;
		CRACKED_GOLD_FAMILY = crackedGoldBaseFamily;
		MOSSY_CRACKED_GOLD_FAMILY = mossyCrackedGoldBaseFamily;
		OVERGROWN_CRACKED_GOLD_FAMILY = overgrownCrackedGoldBaseFamily;

		NAME = name;

		crackedFamilyMap.put(BASE_FAMILY, CRACKED_FAMILY);
		crackedFamilyMap.put(MOSSY_FAMILY, MOSSY_CRACKED_FAMILY);
		crackedFamilyMap.put(OVERGROWN_FAMILY, OVERGROWN_CRACKED_FAMILY);
		crackedFamilyMap.put(BRONZE_FAMILY, CRACKED_BRONZE_FAMILY);
		crackedFamilyMap.put(MOSSY_BRONZE_FAMILY, MOSSY_CRACKED_BRONZE_FAMILY);
		crackedFamilyMap.put(OVERGROWN_BRONZE_FAMILY, OVERGROWN_CRACKED_BRONZE_FAMILY);
		crackedFamilyMap.put(SILVER_FAMILY, CRACKED_SILVER_FAMILY);
		crackedFamilyMap.put(MOSSY_SILVER_FAMILY, MOSSY_CRACKED_SILVER_FAMILY);
		crackedFamilyMap.put(OVERGROWN_SILVER_FAMILY, OVERGROWN_CRACKED_SILVER_FAMILY);
		crackedFamilyMap.put(GOLD_FAMILY, CRACKED_GOLD_FAMILY);
		crackedFamilyMap.put(MOSSY_GOLD_FAMILY, MOSSY_CRACKED_GOLD_FAMILY);
		crackedFamilyMap.put(OVERGROWN_GOLD_FAMILY, OVERGROWN_CRACKED_GOLD_FAMILY);
	}

	/**
	 * Generates a list of all stone subset items for display in item groups.
	 *
	 * @return a list of {@link ItemStack} containing all blocks in this subset
	 */
	public List<ItemStack> getStoneSubSetItemGroupList() {
		List<ItemStack> stoneSubSetItemGroupList = new LinkedList<>();
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(BASE_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(MOSSY_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(OVERGROWN_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(CRACKED_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(MOSSY_CRACKED_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(OVERGROWN_CRACKED_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(BRONZE_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(MOSSY_BRONZE_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(OVERGROWN_BRONZE_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(CRACKED_BRONZE_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(MOSSY_CRACKED_BRONZE_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(OVERGROWN_CRACKED_BRONZE_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(SILVER_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(MOSSY_SILVER_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(OVERGROWN_SILVER_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(CRACKED_SILVER_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(MOSSY_CRACKED_SILVER_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(OVERGROWN_CRACKED_SILVER_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(GOLD_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(MOSSY_GOLD_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(OVERGROWN_GOLD_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(CRACKED_GOLD_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(MOSSY_CRACKED_GOLD_FAMILY));
		stoneSubSetItemGroupList.addAll(getBlockFamilyList(OVERGROWN_CRACKED_GOLD_FAMILY));
		return stoneSubSetItemGroupList;
	}

	/**
	 * Converts a block family to a list of item stacks.
	 *
	 * @param family the {@link BlockFamily} to convert
	 * @return a list of {@link ItemStack} for all blocks in the family
	 */
	public List<ItemStack> getBlockFamilyList(BlockFamily family) {
		List<ItemStack> blockFamilyList = new LinkedList<>();
		blockFamilyList.add(new ItemStack(family.getBaseBlock()));
		family.getVariants().values().forEach(block -> blockFamilyList.add(new ItemStack(block)));
		return blockFamilyList;
	}

	/**
	 * Retrieves all block families in this subset.
	 *
	 * @return a list of all {@link BlockFamily} in this subset
	 */
	public List<BlockFamily> getAllBlockFamilies() {
		return List.of(
				BASE_FAMILY, MOSSY_FAMILY, OVERGROWN_FAMILY, CRACKED_FAMILY, MOSSY_CRACKED_FAMILY,
				OVERGROWN_CRACKED_FAMILY, BRONZE_FAMILY, MOSSY_BRONZE_FAMILY, OVERGROWN_BRONZE_FAMILY,
				CRACKED_BRONZE_FAMILY, MOSSY_CRACKED_BRONZE_FAMILY, OVERGROWN_CRACKED_BRONZE_FAMILY, SILVER_FAMILY,
				MOSSY_SILVER_FAMILY, OVERGROWN_SILVER_FAMILY, CRACKED_SILVER_FAMILY, MOSSY_CRACKED_SILVER_FAMILY,
				OVERGROWN_CRACKED_SILVER_FAMILY, GOLD_FAMILY, MOSSY_GOLD_FAMILY, OVERGROWN_GOLD_FAMILY,
				CRACKED_GOLD_FAMILY, MOSSY_CRACKED_GOLD_FAMILY, OVERGROWN_CRACKED_GOLD_FAMILY
		);
	}

	/**
	 * Gets the block family corresponding to the specified stone type variant.
	 *
	 * @param variant the {@link StoneTypeVariants} to look up
	 * @return the corresponding {@link BlockFamily}
	 */
	public BlockFamily getStoneTypeVariantFamily (StoneTypeVariants variant) {
		return switch (variant) {
			case STONE -> BASE_FAMILY;
			case MOSSY_STONE -> MOSSY_FAMILY;
			case OVERGROWN_STONE -> OVERGROWN_FAMILY;
			case CRACKED_STONE -> CRACKED_FAMILY;
			case CRACKED_MOSSY_STONE -> MOSSY_CRACKED_FAMILY;
			case CRACKED_OVERGROWN_STONE -> OVERGROWN_CRACKED_FAMILY;
			case BRONZE_STONE -> BRONZE_FAMILY;
			case MOSSY_BRONZE_STONE -> MOSSY_BRONZE_FAMILY;
			case OVERGROWN_BRONZE_STONE -> OVERGROWN_BRONZE_FAMILY;
			case CRACKED_BRONZE_STONE -> CRACKED_BRONZE_FAMILY;
			case CRACKED_MOSSY_BRONZE_STONE -> MOSSY_CRACKED_BRONZE_FAMILY;
			case CRACKED_OVERGROWN_BRONZE_STONE -> OVERGROWN_CRACKED_BRONZE_FAMILY;
			case SILVER_STONE -> SILVER_FAMILY;
			case MOSSY_SILVER_STONE -> MOSSY_SILVER_FAMILY;
			case OVERGROWN_SILVER_STONE -> OVERGROWN_SILVER_FAMILY;
			case CRACKED_SILVER_STONE -> CRACKED_SILVER_FAMILY;
			case CRACKED_MOSSY_SILVER_STONE -> MOSSY_CRACKED_SILVER_FAMILY;
			case CRACKED_OVERGROWN_SILVER_STONE -> OVERGROWN_CRACKED_SILVER_FAMILY;
			case GOLD_STONE -> GOLD_FAMILY;
			case MOSSY_GOLD_STONE -> MOSSY_GOLD_FAMILY;
			case OVERGROWN_GOLD_STONE -> OVERGROWN_GOLD_FAMILY;
			case CRACKED_GOLD_STONE -> CRACKED_GOLD_FAMILY;
			case CRACKED_MOSSY_GOLD_STONE -> MOSSY_CRACKED_GOLD_FAMILY;
			case CRACKED_OVERGROWN_GOLD_STONE -> OVERGROWN_CRACKED_GOLD_FAMILY;
		};
	}

	// While the method isn´t used at the moment, we provide this Getter as it may be useful in the future
	public BlockFamily getCrackedFamily(BlockFamily family) {
		return crackedFamilyMap.get(family);
	}

	public BlockFamily getBaseFamily() {
		return BASE_FAMILY;
	}

	public Block getBaseFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(BASE_FAMILY, variant);
	}

	public BlockFamily getMossyFamily() {
		return MOSSY_FAMILY;
	}

	public Block getMossyFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_FAMILY, variant);
	}

	public BlockFamily getOvergrownFamily() {
		return OVERGROWN_FAMILY;
	}

	public Block getOvergrownFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_FAMILY, variant);
	}

	public BlockFamily getCrackedFamily() {
		return CRACKED_FAMILY;
	}

	public Block getCrackedFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(CRACKED_FAMILY, variant);
	}

	public BlockFamily getMossyCrackedFamily() {
		return MOSSY_CRACKED_FAMILY;
	}

	public Block getMossyCrackedFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_CRACKED_FAMILY, variant);
	}

	public BlockFamily getOvergrownCrackedFamily() {
		return OVERGROWN_CRACKED_FAMILY;
	}

	public Block getOvergrownCrackedFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_CRACKED_FAMILY, variant);
	}

	public BlockFamily getBronzeFamily() {
		return BRONZE_FAMILY;
	}

	public Block getBronzeFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(BRONZE_FAMILY, variant);
	}

	public BlockFamily getMossyBronzeFamily() {
		return MOSSY_BRONZE_FAMILY;
	}

	public Block getMossyBronzeFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_BRONZE_FAMILY, variant);
	}

	public BlockFamily getOvergrownBronzeFamily() {
		return OVERGROWN_BRONZE_FAMILY;
	}

	public Block getOvergrownBronzeFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_BRONZE_FAMILY, variant);
	}

	public BlockFamily getCrackedBronzeFamily() {
		return CRACKED_BRONZE_FAMILY;
	}

	public Block getCrackedBronzeFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(CRACKED_BRONZE_FAMILY, variant);
	}

	public BlockFamily getMossyCrackedBronzeFamily() {
		return MOSSY_CRACKED_BRONZE_FAMILY;
	}

	public Block getMossyCrackedBronzeFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_CRACKED_BRONZE_FAMILY, variant);
	}

	public BlockFamily getOvergrownCrackedBronzeFamily() {
		return OVERGROWN_CRACKED_BRONZE_FAMILY;
	}

	public Block getOvergrownCrackedBronzeFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_CRACKED_BRONZE_FAMILY, variant);
	}

	public BlockFamily getSilverFamily() {
		return SILVER_FAMILY;
	}

	public Block getSilverFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(SILVER_FAMILY, variant);
	}

	public BlockFamily getMossySilverFamily() {
		return MOSSY_SILVER_FAMILY;
	}

	public Block getMossySilverFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_SILVER_FAMILY, variant);
	}

	public BlockFamily getOvergrownSilverFamily() {
		return OVERGROWN_SILVER_FAMILY;
	}

	public Block getOvergrownSilverFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_SILVER_FAMILY, variant);
	}

	public BlockFamily getCrackedSilverFamily() {
		return CRACKED_SILVER_FAMILY;
	}

	public Block getCrackedSilverFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(CRACKED_SILVER_FAMILY, variant);
	}

	public BlockFamily getMossyCrackedSilverFamily() {
		return MOSSY_CRACKED_SILVER_FAMILY;
	}

	public Block getMossyCrackedSilverFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_CRACKED_SILVER_FAMILY, variant);
	}

	public BlockFamily getOvergrownCrackedSilverFamily() {
		return OVERGROWN_CRACKED_SILVER_FAMILY;
	}

	public Block getOvergrownCrackedSilverFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_CRACKED_SILVER_FAMILY, variant);
	}

	public BlockFamily getGoldFamily() {
		return GOLD_FAMILY;
	}

	public Block getGoldFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(GOLD_FAMILY, variant);
	}

	public BlockFamily getMossyGoldFamily() {
		return MOSSY_GOLD_FAMILY;
	}

	public Block getMossyGoldFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_GOLD_FAMILY, variant);
	}

	public BlockFamily getOvergrownGoldFamily() {
		return OVERGROWN_GOLD_FAMILY;
	}

	public Block getOvergrownGoldFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_GOLD_FAMILY, variant);
	}

	public BlockFamily getCrackedGoldFamily() {
		return CRACKED_GOLD_FAMILY;
	}

	public Block getCrackedGoldFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(CRACKED_GOLD_FAMILY, variant);
	}

	public BlockFamily getMossyCrackedGoldFamily() {
		return MOSSY_CRACKED_GOLD_FAMILY;
	}

	public Block getMossyCrackedGoldFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(MOSSY_CRACKED_GOLD_FAMILY, variant);
	}

	public BlockFamily getOvergrownCrackedGoldFamily() {
		return OVERGROWN_CRACKED_GOLD_FAMILY;
	}

	public Block getOvergrownCrackedGoldFamilyVariant(String variant) {
		return ModUtil.getBlockFromFamily(OVERGROWN_CRACKED_GOLD_FAMILY, variant);
	}

	public String getName() {
		return NAME;
	}
}
