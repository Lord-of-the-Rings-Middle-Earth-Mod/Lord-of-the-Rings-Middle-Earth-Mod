package me.anedhel.lotr.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.world.tree.PineSaplingGenerator;
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

public class ModWoodBlocks {

    /*
    Wood Types
     */
    public static final Block PINE_LOG = registerBlock("pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block PINE_WOOD = registerBlock("pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block PINE_WOOD_STAIRS = registerBlock("pine_wood_stairs",
            new StairsBlock(ModWoodBlocks.PINE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block PINE_WOOD_SLAB = registerBlock("pine_wood_slabs",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block PINE_WOOD_BUTTON = registerBlock("pine_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PINE_WOOD_PRESSURE_PLATE = registerBlock("pine_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PINE_WOOD_DOOR = registerBlock("pine_wood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f), BlockSetType.OAK));
    public static final Block PINE_WOOD_TRAPDOOR = registerBlock("pine_wood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f), BlockSetType.OAK));
    public static final Block STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_PINE_STAIRS = registerBlock("stripped_pine_stairs",
            new StairsBlock(STRIPPED_PINE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_PINE_SLAB = registerBlock("stripped_pine_slabs",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_PINE_WOOD_BUTTON = registerBlock("stripped_pine_wood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block STRIPPED_PINE_WOOD_PRESSURE_PLATE = registerBlock("stripped_pine_wood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block STRIPPED_PINE_DOOR = registerBlock("stripped_pine_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD), BlockSetType.OAK));
    public static final Block STRIPPED_PINE_TRAPDOOR = registerBlock("stripped_pine_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block PINE_PLANKS = registerBlock("pine_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block PINE_PLANKS_STAIRS = registerBlock("pine_planks_stairs",
            new StairsBlock(ModWoodBlocks.PINE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).strength(4f)));
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

    /*
    Leaves and Saplings
     */
    public static final Block PINE_LEAVES = registerBlock("pine_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f).nonOpaque()));
    public static final Block PINE_SAPLINGS = registerBlock("pine_sapling",
            new SaplingBlock(new PineSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    /*
    Sign Textures
     */
    public static final Identifier PINE_SIGN_TEXTURE = new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "entity/signs/pine");
    public static final Identifier PINE_HANGING_SIGN_TEXTURE = new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "entity/signs/hanging/pine");
    public static final Identifier PINE_HANGING_GUI_SIGN_TEXTURE = new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "textures/gui/hanging_sign/pine");

    /*
    Signs
     */
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

    /*
    Block Families
     */
    public static final BlockFamily PINE_WOOD_FAMILY = BlockFamilies.register(ModWoodBlocks.PINE_WOOD)
            .stairs(ModWoodBlocks.PINE_WOOD_STAIRS)
            .slab(ModWoodBlocks.PINE_WOOD_SLAB)
            .button(ModWoodBlocks.PINE_WOOD_BUTTON)
            .pressurePlate(ModWoodBlocks.PINE_WOOD_PRESSURE_PLATE)
            .door(ModWoodBlocks.PINE_WOOD_DOOR)
            .trapdoor(ModWoodBlocks.PINE_WOOD_TRAPDOOR)
            .group("wooden").unlockCriterionName("has_wood").build();

    public static final BlockFamily STRIPPED_PINE_FAMILY = BlockFamilies.register(ModWoodBlocks.STRIPPED_PINE_WOOD)
            .stairs(ModWoodBlocks.STRIPPED_PINE_STAIRS)
            .slab(ModWoodBlocks.STRIPPED_PINE_SLAB)
            .button(ModWoodBlocks.STRIPPED_PINE_WOOD_BUTTON)
            .pressurePlate(ModWoodBlocks.STRIPPED_PINE_WOOD_PRESSURE_PLATE)
            .door(ModWoodBlocks.STRIPPED_PINE_DOOR)
            .trapdoor(ModWoodBlocks.STRIPPED_PINE_TRAPDOOR)
            .group("wooden").unlockCriterionName("has_stripped_wood").build();

    public static final BlockFamily PINE_PLANKS_FAMILY = BlockFamilies.register(ModWoodBlocks.PINE_PLANKS)
            .stairs(ModWoodBlocks.PINE_PLANKS_STAIRS)
            .slab(ModWoodBlocks.PINE_PLANKS_SLAB)
            .fence(ModWoodBlocks.PINE_PLANKS_FENCE)
            .fenceGate(ModWoodBlocks.PINE_PLANKS_FENCE_GATE)
            .button(ModWoodBlocks.PINE_PLANKS_BUTTON)
            .pressurePlate(ModWoodBlocks.PINE_PLANKS_PRESSURE_PLATE)
            .sign(ModWoodBlocks.STANDING_PINE_SIGN, ModWoodBlocks.WALL_PINE_SIGN)
            .door(ModWoodBlocks.PINE_PLANKS_DOOR)
            .trapdoor(ModWoodBlocks.PINE_PLANKS_TRAPDOOR)
            .group("wooden").unlockCriterionName("has_planks").build();
    
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

    public static void registerModWoodBlocks () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod Wood Blocks for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}
