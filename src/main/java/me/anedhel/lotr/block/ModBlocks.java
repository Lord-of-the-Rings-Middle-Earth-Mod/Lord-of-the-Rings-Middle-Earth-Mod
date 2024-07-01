package me.anedhel.lotr.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.block.custom.crops.CornCropBlock;
import me.anedhel.lotr.block.custom.crops.LettuceCropBlock;
import me.anedhel.lotr.block.custom.crops.TomatoCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
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

    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block LETTUCE_CROP = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lettuce_crop"),
            new LettuceCropBlock(FabricBlockSettings.copyOf(Blocks.BEETROOTS)));
    public static final Block CORN_CROP = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "corn_crop"),
            new CornCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block WILD_BEETROOT = registerBlock("wild_beetroot",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_WILD_BEETROOT = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "potted_wild_beetroot"),
            new FlowerPotBlock(WILD_BEETROOT, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block WILD_CARROT = registerBlock("wild_carrot",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_WILD_CARROT = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "potted_wild_carrot"),
            new FlowerPotBlock(WILD_CARROT, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block WILD_POTATO = registerBlock("wild_potato",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_WILD_POTATO = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "potted_wild_potato"),
            new FlowerPotBlock(WILD_POTATO, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block WILD_CORN = registerBlock("wild_corn",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_WILD_CORN = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "potted_wild_corn"),
            new FlowerPotBlock(WILD_CORN, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block WILD_LETTUCE = registerBlock("wild_lettuce",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_WILD_LETTUCE = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "potted_wild_lettuce"),
            new FlowerPotBlock(WILD_LETTUCE, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block WILD_TOMATO = registerBlock("wild_tomato",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_WILD_TOMATO = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "potted_wild_tomato"),
            new FlowerPotBlock(WILD_TOMATO, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block POTATO_CRATE = registerBlock("potato_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));
    public static final Block CARROT_CRATE = registerBlock("carrot_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));
    public static final Block BEETROOT_CRATE = registerBlock("beetroot_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));

    public static final Block TOMATO_CRATE = registerBlock("tomato_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));
    public static final Block LETTUCE_CRATE = registerBlock("lettuce_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));
    public static final Block CORN_CRATE = registerBlock("corn_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));

    public static final Block PINE_LOG = registerBlock("pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block PINE_WOOD = registerBlock("pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));
    public static final Block PINE_PLANKS = registerBlock("pine_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block PINE_PLANKS_STAIRS = registerBlock("pine_planks_stairs",
            new StairsBlock(ModBlocks.PINE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).strength(4f)));
    public static final Block PINE_PLANKS_SLAB = registerBlock("pine_planks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block PINE_PLANKS_FENCE = registerBlock("pine_planks_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PINE_PLANKS_FENCE_GATE = registerBlock("pine_planks_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block PINE_PLANKS_BUTTON = registerBlock("pine_planks_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f), BlockSetType.OAK, 10, true));
    public static final Block PINE_PLANKS_PRESSURE_PLATE = registerBlock("pine_planks_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f), BlockSetType.OAK));
    public static final Block PINE_PLANKS_DOOR = registerBlock("pine_planks_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PINE_PLANKS_TRAPDOOR = registerBlock("pine_planks_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block PINE_LEAVES = registerBlock("pine_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f).nonOpaque()));

    public static final Identifier PINE_SIGN_TEXTURE = new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "entity/signs/pine");
    public static final Identifier PINE_HANGING_SIGN_TEXTURE = new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "entity/signs/hanging/pine");
    public static final Identifier PINE_HANGING_GUI_SIGN_TEXTURE = new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "textures/gui/hanging_sign/pine");

    public static final Block STANDING_PINE_SIGN = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "pine_standing_sign"),
            new TerraformSignBlock(PINE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_PINE_SIGN = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "pine_wall_sign"),
            new TerraformSignBlock(PINE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_PINE_SIGN = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "pine_hanging_sign"),
            new TerraformHangingSignBlock(PINE_HANGING_SIGN_TEXTURE, PINE_HANGING_GUI_SIGN_TEXTURE,
                    FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_PINE_SIGN = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "pine_wall_hanging_sign"),
            new TerraformHangingSignBlock(PINE_HANGING_SIGN_TEXTURE, PINE_HANGING_GUI_SIGN_TEXTURE,
                    FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final BlockFamily PINE_PLANKS_FAMILY = BlockFamilies.register(ModBlocks.PINE_PLANKS)
            .stairs(ModBlocks.PINE_PLANKS_STAIRS)
            .slab(ModBlocks.PINE_PLANKS_SLAB)
            .fence(ModBlocks.PINE_PLANKS_FENCE)
            .fenceGate(ModBlocks.PINE_PLANKS_FENCE_GATE)
            .button(ModBlocks.PINE_PLANKS_BUTTON)
            .pressurePlate(ModBlocks.PINE_PLANKS_PRESSURE_PLATE)
            .sign(ModBlocks.STANDING_PINE_SIGN, ModBlocks.WALL_PINE_SIGN)
            .door(ModBlocks.PINE_PLANKS_DOOR)
            .trapdoor(ModBlocks.PINE_PLANKS_TRAPDOOR)
            .group("wooden").unlockCriterionName("has_planks").build();


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

    public static final Block BLUESLATE = registerBlock("blueslate",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block BLUESLATE_STAIRS = registerBlock("blueslate_stairs",
            new StairsBlock(ModBlocks.BLUESLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
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
            new StairsBlock(ModBlocks.COBBLED_BLUESLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
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
            new StairsBlock(ModBlocks.BLUESLATE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
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
            new StairsBlock(ModBlocks.BASALT_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block BASALT_BRICK_WALL = registerBlock("basalt_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

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
