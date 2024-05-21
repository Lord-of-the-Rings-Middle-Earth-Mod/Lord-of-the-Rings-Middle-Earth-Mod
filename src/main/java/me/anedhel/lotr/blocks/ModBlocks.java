package me.anedhel.lotr.blocks;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CHALK_STONE = registerBlock("chalk_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block CHALK_STONE_STAIRS = registerBlock("chalk_stone_stairs",
            new StairsBlock(ModBlocks.CHALK_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block CHALK_STONE_SLAB = registerBlock("chalk_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block CHALK_STONE_WALL = registerBlock("chalk_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
    public static final Block CHALK_STONE_BUTTON = registerBlock("chalk_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block CHALK_STONE_PRESSUREPLATE = registerBlock("chalk_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    private static Block registerBlock (String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,
                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name),
                block);
    }

    private static Item registerBlockItem (String name, Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod Blocks for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}
