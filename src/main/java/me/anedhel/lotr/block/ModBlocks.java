package me.anedhel.lotr.block;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block COBBLED_CHALK_STAIRS = registerBlock("cobbled_chalk_stairs",
            new StairsBlock(ModBlocks.COBBLED_CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block COBBLED_CHALK_SLAB = registerBlock("cobbled_chalk_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block COBBLED_CHALK_WALL = registerBlock("cobbled_chalk_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
    public static final Block COBBLED_CHALK_BUTTON = registerBlock("cobbled_chalk_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block COBBLED_CHALK_PRESSURE_PLATE = registerBlock("cobbled_chalk_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block ANDESITE_BUTTON = registerBlock("andesite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block ANDESITE_PRESSURE_PLATE = registerBlock("andesite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block POLISHED_ANDESITE_BUTTON = registerBlock("polished_andesite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = registerBlock("polished_andesite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block ANDESITE_BRICK = registerBlock("andesite_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(ModBlocks.ANDESITE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block COBBLED_ANDESITE = registerBlock("cobbled_andesite",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block COBBLED_ANDESITE_STAIRS = registerBlock("cobbled_andesite_stairs",
            new StairsBlock(ModBlocks.COBBLED_ANDESITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block COBBLED_ANDESITE_SLAB = registerBlock("cobbled_andesite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block COBBLED_ANDESITE_WALL = registerBlock("cobbled_andesite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
    public static final Block COBBLED_ANDESITE_BUTTON = registerBlock("cobbled_andesite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block COBBLED_ANDESITE_PRESSURE_PLATE = registerBlock("cobbled_andesite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block DIORITE_BUTTON = registerBlock("diorite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block DIORITE_PRESSURE_PLATE = registerBlock("diorite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block POLISHED_DIORITE_BUTTON = registerBlock("polished_diorite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = registerBlock("polished_diorite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block DIORITE_BRICK = registerBlock("diorite_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(ModBlocks.DIORITE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block COBBLED_DIORITE = registerBlock("cobbled_diorite",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block COBBLED_DIORITE_STAIRS = registerBlock("cobbled_diorite_stairs",
            new StairsBlock(ModBlocks.COBBLED_DIORITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block COBBLED_DIORITE_SLAB = registerBlock("cobbled_diorite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block COBBLED_DIORITE_WALL = registerBlock("cobbled_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
    public static final Block COBBLED_DIORITE_BUTTON = registerBlock("cobbled_diorite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block COBBLED_DIORITE_PRESSURE_PLATE = registerBlock("cobbled_diorite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block GRANITE_BUTTON = registerBlock("granite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block GRANITE_PRESSURE_PLATE = registerBlock("granite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block POLISHED_GRANITE_BUTTON = registerBlock("polished_granite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = registerBlock("polished_granite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block GRANITE_BRICK = registerBlock("granite_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            new StairsBlock(ModBlocks.GRANITE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block COBBLED_GRANITE = registerBlock("cobbled_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block COBBLED_GRANITE_STAIRS = registerBlock("cobbled_granite_stairs",
            new StairsBlock(ModBlocks.COBBLED_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block COBBLED_GRANITE_SLAB = registerBlock("cobbled_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block COBBLED_GRANITE_WALL = registerBlock("cobbled_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
    public static final Block COBBLED_GRANITE_BUTTON = registerBlock("cobbled_granite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block COBBLED_GRANITE_PRESSURE_PLATE = registerBlock("cobbled_granite_pressure_plate",
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
