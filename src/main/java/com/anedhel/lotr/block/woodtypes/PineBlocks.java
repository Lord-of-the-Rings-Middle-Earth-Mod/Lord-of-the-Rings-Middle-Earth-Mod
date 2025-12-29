package com.anedhel.lotr.block.woodtypes;

import com.anedhel.lotr.LotRMEMod;
import com.anedhel.lotr.block.ModBlockTags;
import com.anedhel.lotr.item.ModItemTags;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.sound.BlockSoundGroup;

import static com.anedhel.lotr.block.ModBlocks.registerBlock;

public class PineBlocks{

	public static Block PINE_LOG = registerBlock("pine_log",
			settings -> new PillarBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_WOOD = registerBlock("pine_wood",
			settings -> new PillarBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_WOOD_STAIRS = registerBlock("pine_wood_stairs",
			settings -> new StairsBlock(PineBlocks.PINE_WOOD.getDefaultState(),
					settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_WOOD_SLAB = registerBlock("pine_wood_slab",
			settings -> new SlabBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_WOOD_BUTTON = registerBlock("pine_wood_button",
			settings -> new ButtonBlock(BlockSetType.OAK, 10, settings.requiresTool()));
	public static Block PINE_WOOD_PRESSURE_PLATE = registerBlock("pine_wood_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.OAK, settings.requiresTool()));
	public static Block PINE_WOOD_FENCE = registerBlock("pine_wood_fence",
			settings -> new FenceBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_WOOD_FENCE_GATE = registerBlock("pine_wood_fence_gate",
			settings -> new FenceGateBlock(WoodType.OAK, settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_WOODS_DOOR = registerBlock("pine_wood_door",
			settings -> new DoorBlock(BlockSetType.OAK,
					settings.strength(3.0f).sounds(BlockSoundGroup.WOOD).requiresTool().nonOpaque()));
	public static Block PINE_WOODS_TRAPDOOR = registerBlock("pine_wood_trapdoor",
			settings -> new TrapdoorBlock(BlockSetType.OAK,
					settings.strength(3.0f).sounds(BlockSoundGroup.WOOD).requiresTool().nonOpaque()));
	public static BlockFamily PINE_WOOD_FAMILY = BlockFamilies.register(PINE_WOOD)
			.stairs(PINE_WOOD_STAIRS)
			.slab(PINE_WOOD_SLAB)
			.button(PINE_WOOD_BUTTON)
			.pressurePlate(PINE_WOOD_PRESSURE_PLATE)
			.fence(PINE_WOOD_FENCE)
			.fenceGate(PINE_WOOD_FENCE_GATE)
			.door(PINE_WOODS_DOOR)
			.trapdoor(PINE_WOODS_TRAPDOOR)
			.build();

	public static Block STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
			settings -> new PillarBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
			settings -> new PillarBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block STRIPPED_PINE_WOOD_STAIRS = registerBlock("stripped_pine_wood_stairs",
			settings -> new StairsBlock(PineBlocks.STRIPPED_PINE_WOOD.getDefaultState(),
					settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block STRIPPED_PINE_WOOD_SLAB = registerBlock("stripped_pine_wood_slab",
			settings -> new SlabBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block STRIPPED_PINE_WOOD_BUTTON = registerBlock("stripped_pine_wood_button",
			settings -> new ButtonBlock(BlockSetType.OAK, 10, settings.requiresTool()));
	public static Block STRIPPED_PINE_WOOD_PRESSURE_PLATE = registerBlock("stripped_pine_wood_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.OAK, settings.requiresTool()));
	public static Block STRIPPED_PINE_WOODS_FENCE = registerBlock("stripped_pine_wood_fence",
			settings -> new FenceBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block STRIPPED_PINE_WOODS_FENCE_GATE = registerBlock("stripped_pine_wood_fence_gate",
			settings -> new FenceGateBlock(WoodType.OAK, settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block STRIPPED_PINE_WOODS_DOOR = registerBlock("stripped_pine_wood_door",
			settings -> new DoorBlock(BlockSetType.OAK,
					settings.strength(3.0f).sounds(BlockSoundGroup.WOOD).requiresTool().nonOpaque()));
	public static Block STRIPPED_PINE_WOODS_TRAPDOOR = registerBlock("stripped_pine_wood_trapdoor",
			settings -> new TrapdoorBlock(BlockSetType.OAK,
					settings.strength(3.0f).sounds(BlockSoundGroup.WOOD).requiresTool().nonOpaque()));
	public static BlockFamily STRIPPED_PINE_WOOD_FAMILY = BlockFamilies.register(STRIPPED_PINE_WOOD)
			.stairs(STRIPPED_PINE_WOOD_STAIRS)
			.slab(STRIPPED_PINE_WOOD_SLAB)
			.button(STRIPPED_PINE_WOOD_BUTTON)
			.pressurePlate(STRIPPED_PINE_WOOD_PRESSURE_PLATE)
			.fence(STRIPPED_PINE_WOODS_FENCE)
			.fenceGate(STRIPPED_PINE_WOODS_FENCE_GATE)
			.door(STRIPPED_PINE_WOODS_DOOR)
			.trapdoor(STRIPPED_PINE_WOODS_TRAPDOOR)
			.build();

	public static Block PINE_PLANKS = registerBlock("pine_planks",
			settings -> new Block(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_PLANK_STAIRS = registerBlock("pine_plank_stairs",
			settings -> new StairsBlock(PineBlocks.PINE_PLANKS.getDefaultState(),
					settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_PLANK_SLAB = registerBlock("pine_plank_slab",
			settings -> new SlabBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_PLANK_BUTTON = registerBlock("pine_plank_button",
			settings -> new ButtonBlock(BlockSetType.OAK, 10, settings.requiresTool()));
	public static Block PINE_PLANK_PRESSURE_PLATE = registerBlock("pine_plank_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.OAK, settings.requiresTool()));
	public static Block PINE_PLANKS_FENCE = registerBlock("pine_planks_fence",
			settings -> new FenceBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_PLANKS_FENCE_GATE = registerBlock("pine_planks_fence_gate",
			settings -> new FenceGateBlock(WoodType.OAK, settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_PLANKS_DOOR = registerBlock("pine_planks_door",
			settings -> new DoorBlock(BlockSetType.OAK,
					settings.strength(3.0f).sounds(BlockSoundGroup.WOOD).requiresTool().nonOpaque()));
	public static Block PINE_PLANKS_TRAPDOOR = registerBlock("pine_planks_trapdoor",
			settings -> new TrapdoorBlock(BlockSetType.OAK,
					settings.strength(3.0f).sounds(BlockSoundGroup.WOOD).requiresTool().nonOpaque()));
	public static BlockFamily PINE_PLANKS_FAMILY = BlockFamilies.register(PINE_PLANKS)
			.stairs(PINE_PLANK_STAIRS)
			.slab(PINE_PLANK_SLAB)
			.button(PINE_PLANK_BUTTON)
			.pressurePlate(PINE_PLANK_PRESSURE_PLATE)
			.fence(PINE_PLANKS_FENCE)
			.fenceGate(PINE_PLANKS_FENCE_GATE)
			.door(PINE_PLANKS_DOOR)
			.trapdoor(PINE_PLANKS_TRAPDOOR)
			.build();

	public static ModWoodSet PINE_SET = new ModWoodSet(
			PINE_LOG, PINE_WOOD_FAMILY,
			STRIPPED_PINE_LOG, STRIPPED_PINE_WOOD_FAMILY,
			PINE_PLANKS_FAMILY,
			ModBlockTags.PINE_LOGS, ModItemTags.PINE_LOGS
	);

	public static void registerPineBlocks() {
		LotRMEMod.LOGGER.info("Registering Pine Blocks for " + LotRMEMod.MOD_ID);
	}
}
