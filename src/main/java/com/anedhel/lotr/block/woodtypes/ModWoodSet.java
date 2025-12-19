package com.anedhel.lotr.block.woodtypes;

import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;

import java.util.List;

public class ModWoodSet {
	private final Block LOG;
	private final Block WOOD;

	private final Block STRIPPED_LOG;
	private final Block STRIPPED_WOOD;

	private final Block PLANKS;
	private final Block PLANKS_STAIRS;
	private final Block PLANKS_SLAB;
	private final Block PLANKS_BUTTON;
	private final Block PLANKS_PRESSURE_PLATE;
	private final Block PLANKS_FENCE;
	private final Block PLANKS_FENCE_GATE;
	private final Block PLANKS_DOOR;
	private final Block PLANKS_TRAPDOOR;
	private final BlockFamily PLANKS_FAMILY;

	private final TagKey<Block> LOG_BLOCK_TAG;
	private final TagKey<Item> LOG_ITEM_TAG;

	public ModWoodSet(Block log, Block wood, Block strippedLog, Block strippedWood,
			Block planks, Block planksStairs, Block planksSlab, Block planksButton, Block planksPressurePlate,
			Block planksFence, Block planksFenceGate, Block planksDoor, Block planksTrapdoor,
			TagKey<Block> logTag,
			TagKey<Item> logItemTag) {
		LOG = log;
		WOOD = wood;

		STRIPPED_LOG = strippedLog;
		STRIPPED_WOOD = strippedWood;

		PLANKS = planks;
		PLANKS_STAIRS = planksStairs;
		PLANKS_SLAB = planksSlab;
		PLANKS_BUTTON = planksButton;
		PLANKS_PRESSURE_PLATE = planksPressurePlate;
		PLANKS_FENCE = planksFence;
		PLANKS_FENCE_GATE = planksFenceGate;
		PLANKS_DOOR = planksDoor;
		PLANKS_TRAPDOOR = planksTrapdoor;
		PLANKS_FAMILY = BlockFamilies.register(PLANKS)
				.stairs(PLANKS_STAIRS)
				.slab(PLANKS_SLAB)
				.button(PLANKS_BUTTON)
				.pressurePlate(PLANKS_PRESSURE_PLATE)
				.fence(PLANKS_FENCE)
				.fenceGate(PLANKS_FENCE_GATE)
				.door(PLANKS_DOOR)
				.trapdoor(PLANKS_TRAPDOOR)
				.build();

		LOG_BLOCK_TAG = logTag;
		LOG_ITEM_TAG = logItemTag;
	}

	public List<ItemStack> getWoodItemGroupList() {
		return List.of(
				new ItemStack(getLog()),
				new ItemStack(getWood()),
				new ItemStack(getStrippedLog()),
				new ItemStack(getStrippedWood()),
				new ItemStack(getPlanksVariant("base")),
				new ItemStack(getPlanksVariant("stairs")),
				new ItemStack(getPlanksVariant("slab")),
				new ItemStack(getPlanksVariant("button")),
				new ItemStack(getPlanksVariant("pressure_plate")),
				new ItemStack(getPlanksVariant("fence")),
				new ItemStack(getPlanksVariant("fence_gate")),
				new ItemStack(getPlanksVariant("door")),
				new ItemStack(getPlanksVariant("trapdoor"))
		);
	}

	public Block getLog() {
		return LOG;
	}

	public Block getWood() {
		return WOOD;
	}

	public Block getStrippedLog() {
		return STRIPPED_LOG;
	}

	public Block getStrippedWood() {
		return STRIPPED_WOOD;
	}

	public BlockFamily getPlanksFamily() {
		return PLANKS_FAMILY;
	}

	public Block getPlanksVariant(String variant) {
		return switch(variant) {
			case "base" -> PLANKS;
			case "stairs" -> PLANKS_STAIRS;
			case "slab" -> PLANKS_SLAB;
			case "button" -> PLANKS_BUTTON;
			case "pressure_plate" -> PLANKS_PRESSURE_PLATE;
			case "fence" -> PLANKS_FENCE;
			case "fence_gate" -> PLANKS_FENCE_GATE;
			case "door" -> PLANKS_DOOR;
			case "trapdoor" -> PLANKS_TRAPDOOR;
			default -> throw new IllegalArgumentException("Unknown planks variant: " + variant);
		};
	}

	public TagKey<Block> getLogBlockTag() {
		return LOG_BLOCK_TAG;
	}

	public TagKey<Item> getLogItemTag() {
		return LOG_ITEM_TAG;
	}
}
