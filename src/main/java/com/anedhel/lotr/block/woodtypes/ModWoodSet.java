package com.anedhel.lotr.block.woodtypes;

import com.anedhel.lotr.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamilies;
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

	public ModWoodSet(Block log, Block wood, Block woodStairs, Block woodSlab, Block woodButton,
			Block woodPressurePlate, Block woodFence, Block woodFenceGate, Block woodDoor, Block woodTrapdoor,
			Block strippedLog, Block strippedWood, Block strippedWoodStairs, Block strippedWoodSlab,
			Block strippedWoodButton, Block strippedWoodPressurePlate, Block strippedWoodFence,
			Block strippedWoodFenceGate, Block strippedWoodDoor, Block strippedWoodTrapdoor,
			Block planks, Block planksStairs, Block planksSlab, Block planksButton, Block planksPressurePlate,
			Block planksFence, Block planksFenceGate, Block planksDoor, Block planksTrapdoor,
			TagKey<Block> logTag,
			TagKey<Item> logItemTag) {
		LOG = log;
		WOOD_FAMILY = BlockFamilies.register(wood)
				.stairs(woodStairs)
				.slab(woodSlab)
				.button(woodButton)
				.pressurePlate(woodPressurePlate)
				.fence(woodFence)
				.fenceGate(woodFenceGate)
				.door(woodDoor)
				.trapdoor(woodTrapdoor)
				.build();

		STRIPPED_LOG = strippedLog;
		STRIPPED_WOOD_FAMILY = BlockFamilies.register(strippedWood)
				.stairs(strippedWoodStairs)
				.slab(strippedWoodSlab)
				.button(strippedWoodButton)
				.pressurePlate(strippedWoodPressurePlate)
				.fence(strippedWoodFence)
				.fenceGate(strippedWoodFenceGate)
				.door(strippedWoodDoor)
				.trapdoor(strippedWoodTrapdoor)
				.build();

		PLANKS_FAMILY = BlockFamilies.register(planks)
				.stairs(planksStairs)
				.slab(planksSlab)
				.button(planksButton)
				.pressurePlate(planksPressurePlate)
				.fence(planksFence)
				.fenceGate(planksFenceGate)
				.door(planksDoor)
				.trapdoor(planksTrapdoor)
				.build();

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
