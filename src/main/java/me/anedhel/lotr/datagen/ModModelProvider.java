package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

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

        itemModelGenerator.register(ModItems.BRONZE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_BOOTS);
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
}
