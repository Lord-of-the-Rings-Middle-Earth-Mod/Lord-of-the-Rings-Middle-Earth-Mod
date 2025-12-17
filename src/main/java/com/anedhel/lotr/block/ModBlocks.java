package com.anedhel.lotr.block;

import com.anedhel.lotr.LotRMEMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import javax.swing.*;
import java.util.function.Function;

public class ModBlocks {

	public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
			settings -> new Block(settings.strength(5.0f).requiresTool().sounds(BlockSoundGroup.COPPER)));
	public static final Block SILVER_BLOCK = registerBlock("silver_block",
			settings -> new Block(settings.strength(5.0f).requiresTool().sounds(BlockSoundGroup.COPPER)));
	public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
			settings -> new Block(settings.strength(5.0f).requiresTool().sounds(BlockSoundGroup.COPPER)));
	public static final Block TIN_BLOCK = registerBlock("tin_block",
			settings -> new Block(settings.strength(5.0f).requiresTool().sounds(BlockSoundGroup.COPPER)));

	public static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> blockFactory){
		Block toRegister =
				blockFactory.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
						Identifier.of(LotRMEMod.MOD_ID, name))));
		registerBlockItem(name, toRegister);
		return Registry.register(Registries.BLOCK, Identifier.of(LotRMEMod.MOD_ID, name), toRegister);
	}

	public static Block registerBlockWithoutBlockItem(String name,
			Function<AbstractBlock.Settings, Block> blockFactory){
		return Registry.register(Registries.BLOCK, Identifier.of(LotRMEMod.MOD_ID, name),
				blockFactory.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(LotRMEMod.MOD_ID, name)))));
	}

	private static void registerBlockItem(String name, Block block){
		Registry.register(Registries.ITEM, Identifier.of(LotRMEMod.MOD_ID, name),
				new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
						.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LotRMEMod.MOD_ID, name)))));
	}

	public static void registerModBlocks(){
		LotRMEMod.LOGGER.info("Registering Mod Blocks for " + LotRMEMod.MOD_ID);
	}
}
