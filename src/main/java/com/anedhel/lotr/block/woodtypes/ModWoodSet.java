package com.anedhel.lotr.block.woodtypes;

import com.anedhel.lotr.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;

import java.util.LinkedList;
import java.util.List;

public class ModWoodSet {
	private final Block LOG;
	private final BlockFamily WOOD_FAMILY;

	private final Block STRIPPED_LOG;
	private final BlockFamily STRIPPED_WOOD_FAMILY;

	private final BlockFamily PLANKS_FAMILY;

	private final TagKey<Block> LOG_BLOCK_TAG;
	private final TagKey<Item> LOG_ITEM_TAG;

	public ModWoodSet(Block log, BlockFamily woodFamily,
			Block strippedLog, BlockFamily strippedWoodFamily,
			BlockFamily planksFamily,
			TagKey<Block> logTag,
			TagKey<Item> logItemTag) {
		LOG = log;
		WOOD_FAMILY = woodFamily;

		STRIPPED_LOG = strippedLog;
		STRIPPED_WOOD_FAMILY = strippedWoodFamily;

		PLANKS_FAMILY = planksFamily;

		LOG_BLOCK_TAG = logTag;
		LOG_ITEM_TAG = logItemTag;
	}

	public List<ItemStack> getWoodItemGroupList() {
		List<ItemStack> woodItemGroupList = new LinkedList<>();
		woodItemGroupList.add(new ItemStack(LOG));
		woodItemGroupList.addAll(getBlockFamilyList(WOOD_FAMILY));
		woodItemGroupList.add(new ItemStack(STRIPPED_LOG));
		woodItemGroupList.addAll(getBlockFamilyList(STRIPPED_WOOD_FAMILY));
		woodItemGroupList.addAll(getBlockFamilyList(PLANKS_FAMILY));
		return woodItemGroupList;
	}

	private static List<ItemStack> getBlockFamilyList(BlockFamily family) {
		List<ItemStack> blockFamilyList = new LinkedList<>();
		blockFamilyList.add(new ItemStack(family.getBaseBlock()));
		family.getVariants().values().forEach(block -> blockFamilyList.add(new ItemStack(block)));
		return blockFamilyList;
	}

	public Block getLog() {
		return LOG;
	}

	public BlockFamily getWoodFamily() {
		return WOOD_FAMILY;
	}

	public Block getWoodVariant(String variant) {
		return ModUtil.getBlockFromFamily(WOOD_FAMILY, variant);
	}

	public Block getStrippedLog() {
		return STRIPPED_LOG;
	}

	public BlockFamily getStrippedWoodFamily() {
		return STRIPPED_WOOD_FAMILY;
	}

	public Block getStrippedWoodVariant(String variant) {
		return ModUtil.getBlockFromFamily(STRIPPED_WOOD_FAMILY, variant);
	}

	public BlockFamily getPlanksFamily() {
		return PLANKS_FAMILY;
	}

	public Block getPlanksVariant(String variant) {
		return ModUtil.getBlockFromFamily(PLANKS_FAMILY, variant);
	}

	public TagKey<Block> getLogBlockTag() {
		return LOG_BLOCK_TAG;
	}

	public TagKey<Item> getLogItemTag() {
		return LOG_ITEM_TAG;
	}
}
