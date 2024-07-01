package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.block.custom.crops.CornCropBlock;
import me.anedhel.lotr.block.custom.crops.LettuceCropBlock;
import me.anedhel.lotr.block.custom.crops.TomatoCropBlock;
import me.anedhel.lotr.item.ModGearType;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.Optional;

/**
 * This class is used to generate all models the mod provides.
 */
public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * This Method is used to generate all BlockStateModels
     * @param blockStateModelGenerator a BlockStateModelGenerator provided by minecraft
     */
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_BLOCK);

        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.LETTUCE_CROP, LettuceCropBlock.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.CORN_CROP, CornCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_BEETROOT, ModBlocks.POTTED_WILD_BEETROOT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_CARROT, ModBlocks.POTTED_WILD_CARROT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_POTATO, ModBlocks.POTTED_WILD_POTATO, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_CORN, ModBlocks.POTTED_WILD_CORN, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_LETTUCE, ModBlocks.POTTED_WILD_LETTUCE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_TOMATO, ModBlocks.POTTED_WILD_TOMATO, BlockStateModelGenerator.TintType.NOT_TINTED);

        generateModWoodTypeModels(ModWoodType.PINE, blockStateModelGenerator);

        generateModStoneTypeModels(ModStoneType.ANDESITE, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.POLISHED_ANDESITE, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.COBBLED_ANDESITE, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.ANDESITE_BRICK, blockStateModelGenerator);

        generateModStoneTypeModels(ModStoneType.DIORITE, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.POLISHED_DIORITE, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.COBBLED_DIORITE, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.DIORITE_BRICK, blockStateModelGenerator);

        generateModStoneTypeModels(ModStoneType.GRANITE, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.POLISHED_GRANITE, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.COBBLED_GRANITE, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.GRANITE_BRICK, blockStateModelGenerator);

        generateModStoneTypeModels(ModStoneType.SMOOTH_BASALT, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.BASALT_BRICKS, blockStateModelGenerator);

        generateModStoneTypeModels(ModStoneType.BLUESLATE, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.COBBLED_BLUESLATE, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.BLUESLATE_BRICK, blockStateModelGenerator);

        generateModStoneTypeModels(ModStoneType.CHALK, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.COBBLED_CHALK, blockStateModelGenerator);
        generateModStoneTypeModels(ModStoneType.CHALK_BRICK, blockStateModelGenerator);
    }

    /**
     * This Method is used to generate all ItemModels
     * @param itemModelGenerator an ItemModelGenerator provided by minecraft
     */
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);

        itemModelGenerator.register(ModItems.HANGING_PINE_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.HOBBIT_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

        generateModGearTypeModels(ModGearType.BRONZE, itemModelGenerator);
    }

    /**
     * This Method is used to generate all the Models for the given GearType
     * @param gearType The ModGearType the models should be generated for.
     * @param itemModelGenerator an ItemModelGenerator provided by minecraft
     */
    private void generateModGearTypeModels(ModGearType gearType, ItemModelGenerator itemModelGenerator) {
        Item helmet = gearType.getHelmet();
        Item chestplate = gearType.getChestplate();
        Item leggings = gearType.getLeggings();
        Item boots = gearType.getBoots();
        Item sword = gearType.getSword();
        Item axe = gearType.getAxe();
        Item pickaxe = gearType.getPickaxe();
        Item shovel = gearType.getShovel();
        Item hoe = gearType.getHoe();

        if (helmet != null) {
            itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_HELMET);
        }
        if (chestplate != null) {
            itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_CHESTPLATE);
        }
        if (leggings != null) {
            itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_LEGGINGS);
        }
        if (boots != null) {
            itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_BOOTS);
        }
        if (sword != null) {
            itemModelGenerator.register(ModItems.BRONZE_SWORD, Models.HANDHELD);
        }
        if (axe != null) {
            itemModelGenerator.register(ModItems.BRONZE_AXE, Models.HANDHELD);
        }
        if (pickaxe != null) {
            itemModelGenerator.register(ModItems.BRONZE_PICKAXE, Models.HANDHELD);
        }
        if (shovel != null) {
            itemModelGenerator.register(ModItems.BRONZE_SHOVEL, Models.HANDHELD);
        }
        if (hoe != null) {
            itemModelGenerator.register(ModItems.BRONZE_HOE, Models.HANDHELD);
        }
    }

    /**
     * This Method is used to generate all the models for the given stone type.
     * It only works for blocks completely added by the mod, adding Models for additions made based on vanilla blocks does not work with this method.
     * @param stoneType The ModStoneType, for which the models should be created
     * @param blockStateModelGenerator a BlockStateModelGenerator provided by minecraft
     */
    private void generateModStoneTypeModels(ModStoneType stoneType, BlockStateModelGenerator blockStateModelGenerator) {
        Block baseBlock = stoneType.getBaseBlock();
        Block stairBlock = stoneType.getStairBlock();
        Block slabBlock = stoneType.getSlabBlock();
        Block wallBlock = stoneType.getWallBlock();
        Block buttonBlock = stoneType.getButtonBlock();
        Block pressurePlateBlock = stoneType.getPressurePlateBlock();

        if (baseBlock != null) {
            BlockStateModelGenerator.BlockTexturePool stoneTypePool = blockStateModelGenerator
                    .registerCubeAllModelTexturePool(baseBlock);
            if (stairBlock != null) {
                stoneTypePool.stairs(stairBlock);
            }
            if (slabBlock != null) {
                stoneTypePool.slab(slabBlock);
            }
            if (wallBlock != null) {
                stoneTypePool.wall(wallBlock);
            }
            if (buttonBlock != null) {
                stoneTypePool.button(buttonBlock);
            }
            if (pressurePlateBlock != null) {
                stoneTypePool.pressurePlate(pressurePlateBlock);
            }
        }
    }

    /**
     * This Method is used to generate all the models for the given wood type.
     * It only works for blocks completely added by the mod, adding Models for additions made based on vanilla blocks does not work with this method.
     * @param woodType The ModWoodType, for which the models should be created
     * @param blockStateModelGenerator a BlockStateModelGenerator provided by minecraft
     */
    private void generateModWoodTypeModels(ModWoodType woodType, BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool planksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(woodType.getPlanksFamily().getBaseBlock());
        planksPool.family(woodType.getPlanksFamily());

        blockStateModelGenerator.registerLog(woodType.getLog()).log(woodType.getLog()).wood(woodType.getWood());
        blockStateModelGenerator.registerLog(woodType.getStrippedLog()).log(woodType.getStrippedLog()).wood(woodType.getStrippedWood());

        blockStateModelGenerator.registerSimpleCubeAll(woodType.getLeaves());
    }
}
