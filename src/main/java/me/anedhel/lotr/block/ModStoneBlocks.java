package me.anedhel.lotr.block;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStoneBlocks {

    public static final Block CHALK = registerBlock("chalk",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block CHALK_STAIRS = registerBlock("chalk_stairs",
            new StairsBlock(ModStoneBlocks.CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
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
            new StairsBlock(ModStoneBlocks.CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block CHALK_BRICK_SLAB = registerBlock("chalk_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block CHALK_BRICK_WALL = registerBlock("chalk_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));

    public static final Block COBBLED_CHALK = registerBlock("cobbled_chalk",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block COBBLED_CHALK_STAIRS = registerBlock("cobbled_chalk_stairs",
            new StairsBlock(ModStoneBlocks.COBBLED_CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block COBBLED_CHALK_SLAB = registerBlock("cobbled_chalk_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block COBBLED_CHALK_WALL = registerBlock("cobbled_chalk_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
    public static final Block COBBLED_CHALK_BUTTON = registerBlock("cobbled_chalk_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block COBBLED_CHALK_PRESSURE_PLATE = registerBlock("cobbled_chalk_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block BLUESLATE = registerBlock("blueslate",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block BLUESLATE_STAIRS = registerBlock("blueslate_stairs",
            new StairsBlock(ModStoneBlocks.BLUESLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block BLUESLATE_SLAB = registerBlock("blueslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block BLUESLATE_WALL = registerBlock("blueslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
    public static final Block BLUESLATE_BUTTON = registerBlock("blueslate_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block BLUESLATE_PRESSURE_PLATE = registerBlock("blueslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block COBBLED_BLUESLATE = registerBlock("cobbled_blueslate",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block COBBLED_BLUESLATE_STAIRS = registerBlock("cobbled_blueslate_stairs",
            new StairsBlock(ModStoneBlocks.COBBLED_BLUESLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block COBBLED_BLUESLATE_SLAB = registerBlock("cobbled_blueslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block COBBLED_BLUESLATE_WALL = registerBlock("cobbled_blueslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
    public static final Block COBBLED_BLUESLATE_BUTTON = registerBlock("cobbled_blueslate_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block COBBLED_BLUESLATE_PRESSURE_PLATE = registerBlock("cobbled_blueslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block BLUESLATE_BRICK = registerBlock("blueslate_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block BLUESLATE_BRICK_STAIRS = registerBlock("blueslate_brick_stairs",
            new StairsBlock(ModStoneBlocks.BLUESLATE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block BLUESLATE_BRICK_SLAB = registerBlock("blueslate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block BLUESLATE_BRICK_WALL = registerBlock("blueslate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));

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
            new StairsBlock(ModStoneBlocks.ANDESITE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block COBBLED_ANDESITE = registerBlock("cobbled_andesite",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block COBBLED_ANDESITE_STAIRS = registerBlock("cobbled_andesite_stairs",
            new StairsBlock(ModStoneBlocks.COBBLED_ANDESITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
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
            new StairsBlock(ModStoneBlocks.DIORITE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block COBBLED_DIORITE = registerBlock("cobbled_diorite",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block COBBLED_DIORITE_STAIRS = registerBlock("cobbled_diorite_stairs",
            new StairsBlock(ModStoneBlocks.COBBLED_DIORITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
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
            new StairsBlock(ModStoneBlocks.GRANITE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block COBBLED_GRANITE = registerBlock("cobbled_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block COBBLED_GRANITE_STAIRS = registerBlock("cobbled_granite_stairs",
            new StairsBlock(ModStoneBlocks.COBBLED_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block COBBLED_GRANITE_SLAB = registerBlock("cobbled_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block COBBLED_GRANITE_WALL = registerBlock("cobbled_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
    public static final Block COBBLED_GRANITE_BUTTON = registerBlock("cobbled_granite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block COBBLED_GRANITE_PRESSURE_PLATE = registerBlock("cobbled_granite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
    public static final Block SMOOTH_BASALT_BUTTON = registerBlock("smooth_basalt_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block SMOOTH_BASALT_PRESSURE_PLATE = registerBlock("smooth_basalt_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));

    public static final Block BASALT_BRICK = registerBlock("basalt_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block BASALT_BRICK_STAIRS = registerBlock("basalt_brick_stairs",
            new StairsBlock(ModStoneBlocks.BASALT_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block BASALT_BRICK_WALL = registerBlock("basalt_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final BlockFamily COBBLED_ANDESITE_FAMILY = BlockFamilies.register(COBBLED_ANDESITE)
            .stairs(COBBLED_ANDESITE_STAIRS)
            .slab(COBBLED_ANDESITE_SLAB)
            .wall(COBBLED_ANDESITE_WALL)
            .button(COBBLED_ANDESITE_BUTTON)
            .pressurePlate(COBBLED_ANDESITE_PRESSURE_PLATE)
            .group("stone").unlockCriterionName("has_cobbled_stone").build();

    public static final BlockFamily ANDESITE_BRICK_FAMILY = BlockFamilies.register(ANDESITE_BRICK)
            .stairs(ANDESITE_BRICK_STAIRS)
            .slab(ANDESITE_BRICK_SLAB)
            .wall(ANDESITE_BRICK_WALL)
            .group("stone").unlockCriterionName("has_brick").build();

    public static final BlockFamily COBBLED_DIORITE_FAMILY = BlockFamilies.register(COBBLED_DIORITE)
            .stairs(COBBLED_DIORITE_STAIRS)
            .slab(COBBLED_DIORITE_SLAB)
            .wall(COBBLED_DIORITE_WALL)
            .button(COBBLED_DIORITE_BUTTON)
            .pressurePlate(COBBLED_DIORITE_PRESSURE_PLATE)
            .group("stone").unlockCriterionName("has_cobbled_stone").build();

    public static final BlockFamily DIORITE_BRICK_FAMILY = BlockFamilies.register(DIORITE_BRICK)
            .stairs(DIORITE_BRICK_STAIRS)
            .slab(DIORITE_BRICK_SLAB)
            .wall(DIORITE_BRICK_WALL)
            .group("stone").unlockCriterionName("has_brick").build();

    public static final BlockFamily COBBLED_GRANITE_FAMILY = BlockFamilies.register(COBBLED_GRANITE)
            .stairs(COBBLED_GRANITE_STAIRS)
            .slab(COBBLED_GRANITE_SLAB)
            .wall(COBBLED_GRANITE_WALL)
            .button(COBBLED_GRANITE_BUTTON)
            .pressurePlate(COBBLED_GRANITE_PRESSURE_PLATE)
            .group("stone").unlockCriterionName("has_cobbled_stone").build();

    public static final BlockFamily GRANITE_BRICK_FAMILY = BlockFamilies.register(GRANITE_BRICK)
            .stairs(GRANITE_BRICK_STAIRS)
            .slab(GRANITE_BRICK_SLAB)
            .wall(GRANITE_BRICK_WALL)
            .group("stone").unlockCriterionName("has_brick").build();

    public static final BlockFamily CHALK_FAMILY = BlockFamilies.register(CHALK)
            .stairs(CHALK_STAIRS)
            .slab(CHALK_SLAB)
            .wall(CHALK_WALL)
            .button(CHALK_BUTTON)
            .pressurePlate(CHALK_PRESSURE_PLATE)
            .group("stone").unlockCriterionName("has_stone").build();

    public static final BlockFamily COBBLED_CHALK_FAMILY = BlockFamilies.register(COBBLED_CHALK)
            .stairs(COBBLED_CHALK_STAIRS)
            .slab(COBBLED_CHALK_SLAB)
            .wall(COBBLED_CHALK_WALL)
            .button(COBBLED_CHALK_BUTTON)
            .pressurePlate(COBBLED_CHALK_PRESSURE_PLATE)
            .group("stone").unlockCriterionName("has_cobbled_stone").build();

    public static final BlockFamily CHALK_BRICK_FAMILY = BlockFamilies.register(CHALK_BRICK)
            .stairs(CHALK_BRICK_STAIRS)
            .slab(CHALK_BRICK_SLAB)
            .wall(CHALK_BRICK_WALL)
            .group("stone").unlockCriterionName("has_brick").build();

    public static final BlockFamily BLUESLATE_FAMILY = BlockFamilies.register(BLUESLATE)
            .stairs(BLUESLATE_STAIRS)
            .slab(BLUESLATE_SLAB)
            .wall(BLUESLATE_WALL)
            .button(BLUESLATE_BUTTON)
            .pressurePlate(BLUESLATE_PRESSURE_PLATE)
            .group("stone").unlockCriterionName("has_stone").build();

    public static final BlockFamily COBBLED_BLUESLATE_FAMILY = BlockFamilies.register(COBBLED_BLUESLATE)
            .stairs(COBBLED_BLUESLATE_STAIRS)
            .slab(COBBLED_BLUESLATE_SLAB)
            .wall(COBBLED_BLUESLATE_WALL)
            .button(COBBLED_BLUESLATE_BUTTON)
            .pressurePlate(COBBLED_BLUESLATE_PRESSURE_PLATE)
            .group("stone").unlockCriterionName("has_cobbled_stone").build();

    public static final BlockFamily BLUESLATE_BRICK_FAMILY = BlockFamilies.register(BLUESLATE_BRICK)
            .stairs(BLUESLATE_BRICK_STAIRS)
            .slab(BLUESLATE_BRICK_SLAB)
            .wall(BLUESLATE_BRICK_WALL)
            .group("stone").unlockCriterionName("has_brick").build();

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
    public static void registerModStoneBlocks () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod Stone Blocks for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}