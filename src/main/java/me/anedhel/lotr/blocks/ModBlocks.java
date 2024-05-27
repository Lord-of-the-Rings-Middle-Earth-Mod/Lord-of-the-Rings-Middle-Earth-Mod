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

/**
 * This class is used to register all Custom Blocks.
 */
public class ModBlocks {

    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK)));
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));

    public static final Block CHALK = registerBlock("chalk",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block CHALK_STAIRS = registerBlock("chalk_stairs",
            new StairsBlock(ModBlocks.CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block CHALK_SLAB = registerBlock("chalk_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block CHALK_WALL = registerBlock("chalk_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
    public static final Block CHALK_BUTTON = registerBlock("chalk_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block CHALK_PRESSURE_PLATE = registerBlock("chalk_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block CHALK_BRICK = registerBlock("chalk_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block CHALK_BRICK_STAIRS = registerBlock("chalk_brick_stairs",
            new StairsBlock(ModBlocks.CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block CHALK_BRICK_SLAB = registerBlock("chalk_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block CHALK_BRICK_WALL = registerBlock("chalk_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));

    public static final Block COBBLED_CHALK = registerBlock("cobbled_chalk",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block COBBLED_CHALK_STAIRS = registerBlock("cobbled_chalk_stairs",
            new StairsBlock(ModBlocks.CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block COBBLED_CHALK_SLAB = registerBlock("cobbled_chalk_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block COBBLED_CHALK_WALL = registerBlock("cobbled_chalk_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
    public static final Block COBBLED_CHALK_BUTTON = registerBlock("cobbled_chalk_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block COBBLED_CHALK_PRESSURE_PLATE = registerBlock("cobbled_chalk_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));


    /**
     * This Method is used to register a Block with minecraft and also register the Item for the block
     * @param name the name of the Block
     * @param block the Block to be registered
     * @return The Block after it has been registered
     */

    private static Block registerBlock (String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,
                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name),
                block);
    }

    /**
     * This Method is used to register a Block Item with minecraft
     * @param name The name of the Block
     * @param block The Block to be registered as Item
     * @return The BlockItem after it has been registered
     */
    private static Item registerBlockItem (String name, Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    /**
     * This Method is run on startup and informs that Blocks are being registered.
     */
    public static void registerModBlocks () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod Blocks for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}
