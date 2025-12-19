package com.anedhel.lotr.block.woodtypes;

import com.anedhel.lotr.LotRMEMod;
import com.anedhel.lotr.block.ModBlockTags;
import com.anedhel.lotr.item.ModItemTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

import static com.anedhel.lotr.block.ModBlocks.registerBlock;

public class PineBlocks{

	public static Block PINE_LOG = registerBlock("pine_log",
			settings -> new PillarBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_WOOD = registerBlock("pine_wood",
			settings -> new PillarBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));

	public static Block STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
			settings -> new PillarBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
			settings -> new PillarBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));

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
	public static Block PINE_FENCE = registerBlock("pine_fence",
			settings -> new FenceBlock(settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_FENCE_GATE = registerBlock("pine_fence_gate",
			settings -> new FenceGateBlock(WoodType.OAK, settings.strength(2.0f).sounds(BlockSoundGroup.WOOD)));
	public static Block PINE_PLANKS_DOOR = registerBlock("pine_planks_door",
			settings -> new DoorBlock(BlockSetType.OAK,
					settings.strength(3.0f).sounds(BlockSoundGroup.WOOD).requiresTool().nonOpaque()));
	public static Block PINE_PLANKS_TRAPDOOR = registerBlock("pine_planks_trapdoor",
			settings -> new TrapdoorBlock(BlockSetType.OAK,
					settings.strength(3.0f).sounds(BlockSoundGroup.WOOD).requiresTool().nonOpaque()));

	public static ModWoodSet PINE_SET = new ModWoodSet(
			PINE_LOG,
			PINE_WOOD,
			STRIPPED_PINE_LOG,
			STRIPPED_PINE_WOOD,
			PINE_PLANKS, PINE_PLANK_STAIRS, PINE_PLANK_SLAB, PINE_PLANK_BUTTON, PINE_PLANK_PRESSURE_PLATE,
			PINE_FENCE, PINE_FENCE_GATE, PINE_PLANKS_DOOR, PINE_PLANKS_TRAPDOOR,
			ModBlockTags.PINE_LOGS, ModItemTags.PINE_LOGS
	);

	public static void registerPineBlocks() {
		LotRMEMod.LOGGER.info("Registering Pine Blocks for " + LotRMEMod.MOD_ID);
	}
}
