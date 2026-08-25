/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.block;

import com.anedhel.vext.VExtMod;
import com.anedhel.vext.block.custom.CarpentryTable;
import com.anedhel.vext.block.custom.FactionBlock;
import com.anedhel.vext.block.custom.SpiderWebBlock;
import com.anedhel.vext.block.custom.crops.CornCropBlock;
import com.anedhel.vext.block.custom.crops.TomatoCropBlock;
import com.anedhel.vext.block.stonetypes.BlueslateBlocks;
import com.anedhel.vext.block.woodtypes.PineBlocks;
import com.anedhel.vext.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

/**
 * Central registry for all custom blocks added by the mod.
 * <p>
 * This class registers blocks including crops, flowers, ores, metal blocks,
 * and custom functional blocks. It provides utility methods for block registration
 * and automatically creates associated block items.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModBlocks {

	public static final Block TOMATO_CROP = registerBlockWithoutBlockItem("tomato_crop",
			settings -> new TomatoCropBlock(settings.noCollision().ticksRandomly().breakInstantly()
					.sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block CORN_CROP = registerBlockWithoutBlockItem("corn_crop",
			settings -> new CornCropBlock(settings.noCollision().ticksRandomly().breakInstantly()
					.sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));

	public static final Block WILD_TOMATO = registerBlock("wild_tomato",
			settings -> new FlowerBlock(StatusEffects.SATURATION, 0.5f,
					settings.noCollision()
							.breakInstantly()
							.nonOpaque()
							.sounds(BlockSoundGroup.GRASS)
							.offset(AbstractBlock.OffsetType.XZ)
							.pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block POTTED_WILD_TOMATO = registerBlockWithoutBlockItem("potted_wild_tomato",
			settings -> new FlowerPotBlock(WILD_TOMATO,
					settings.breakInstantly()
							.nonOpaque()
							.pistonBehavior(PistonBehavior.DESTROY)));

	public static final Block WILD_CORN = registerBlock("wild_corn",
			settings -> new TallFlowerBlock(settings.noCollision()
							.breakInstantly()
							.nonOpaque()
							.sounds(BlockSoundGroup.GRASS)
							.offset(AbstractBlock.OffsetType.XZ)
							.pistonBehavior(PistonBehavior.DESTROY)));

	public static final Block SILVER_ORE = registerBlock("silver_ore",
			settings -> new Block(settings.strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
			settings -> new Block(settings.strength(4.5f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
	public static final Block TIN_ORE = registerBlock("tin_ore",
			settings -> new Block(settings.strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
			settings -> new Block(settings.strength(4.5f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

	public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
			settings -> new Block(settings.strength(5.0f).requiresTool().sounds(BlockSoundGroup.COPPER)));
	public static final Block SILVER_BLOCK = registerBlock("silver_block",
			settings -> new Block(settings.strength(5.0f).requiresTool().sounds(BlockSoundGroup.COPPER)));
	public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
			settings -> new Block(settings.strength(5.0f).requiresTool().sounds(BlockSoundGroup.COPPER)));
	public static final Block TIN_BLOCK = registerBlock("tin_block",
			settings -> new Block(settings.strength(5.0f).requiresTool().sounds(BlockSoundGroup.COPPER)));
	public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
			settings -> new Block(settings.strength(5.0f).requiresTool().sounds(BlockSoundGroup.COPPER)));

	public static final Block CARPENTRY_TABLE = registerBlock("carpentry_table",
			settings -> new CarpentryTable(settings.strength(2.5f).sounds(BlockSoundGroup.WOOD).nonOpaque()));

	public static final Block SPIDER_WEB = registerBlock("spider_web",
	settings -> new SpiderWebBlock(settings.breakInstantly().sounds(ModSounds.SPIDER_WEB_SOUNDS).nonOpaque()));

	public static final Block FACTION_BLOCK = registerBlock("faction_block",
			settings -> new FactionBlock(settings.strength(5.0f).requiresTool().sounds(BlockSoundGroup.WOOD).nonOpaque()));

	/**
	 * Registers a {@link Block} and creates its associated {@link BlockItem}.
	 *
	 * @param name the registry name for the block
	 * @param blockFactory the function to create the block from settings
	 * @return the registered block
	 */
	public static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> blockFactory){
		Block toRegister =
				blockFactory.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
						Identifier.of(VExtMod.MOD_ID, name))));
		registerBlockItem(name, toRegister);
		return Registry.register(Registries.BLOCK, Identifier.of(VExtMod.MOD_ID, name), toRegister);
	}

	/**
	 * Registers a {@link Block} without creating a block item.
	 * <p>
	 * Used for blocks that should not appear in the creative inventory directly,
	 * such as {@link CropBlock} that are placed via seeds.
	 * </p>
	 *
	 * @param name the registry name for the block
	 * @param blockFactory the function to create the block from settings
	 * @return the registered block
	 */
	public static Block registerBlockWithoutBlockItem(String name,
			Function<AbstractBlock.Settings, Block> blockFactory){
		return Registry.register(Registries.BLOCK, Identifier.of(VExtMod.MOD_ID, name),
				blockFactory.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(
						VExtMod.MOD_ID, name)))));
	}

	/**
	 * Creates and registers a {@link BlockItem} for the given {@link Block}.
	 *
	 * @param name the registry name for the {@link BlockItem}
	 * @param block the {@link Block} to create an {@link BlockItem} for
	 */
	private static void registerBlockItem(String name, Block block){
		Registry.register(Registries.ITEM, Identifier.of(VExtMod.MOD_ID, name),
				new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
						.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VExtMod.MOD_ID, name)))));
	}

	/**
	 * Registers all mod blocks including wood and stone block sets.
	 */
	public static void registerModBlocks(){
		VExtMod.LOGGER.info("Registering Mod Blocks for " + VExtMod.MOD_ID);
		registerModWoodBlocks();
		registerModStoneBlocks();
	}

	/**
	 * Registers all mod wood block sets.
	 */
	private static void registerModWoodBlocks() {
		VExtMod.LOGGER.info("Registering Mod Wood Blocks for " + VExtMod.MOD_ID);
		PineBlocks.registerPineBlocks();
	}

	/**
	 * Registers all mod stone block sets.
	 */
	private static void registerModStoneBlocks() {
		VExtMod.LOGGER.info("Registering Mod Stone Blocks for " + VExtMod.MOD_ID);
		BlueslateBlocks.registerBlueslateBlocks();
	}
}
