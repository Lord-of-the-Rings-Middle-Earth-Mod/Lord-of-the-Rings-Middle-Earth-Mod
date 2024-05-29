package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
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

        BlockStateModelGenerator.BlockTexturePool chalkPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.CHALK);

        chalkPool.stairs(ModBlocks.CHALK_STAIRS);
        chalkPool.slab(ModBlocks.CHALK_SLAB);
        chalkPool.wall(ModBlocks.CHALK_WALL);
        chalkPool.button(ModBlocks.CHALK_BUTTON);
        chalkPool.pressurePlate(ModBlocks.CHALK_PRESSURE_PLATE);

        BlockStateModelGenerator.BlockTexturePool chalkBrickPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.CHALK_BRICK);

        chalkBrickPool.stairs(ModBlocks.CHALK_BRICK_STAIRS);
        chalkBrickPool.slab(ModBlocks.CHALK_BRICK_SLAB);
        chalkBrickPool.wall(ModBlocks.CHALK_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool cobblesChalkPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.COBBLED_CHALK);

        cobblesChalkPool.stairs(ModBlocks.COBBLED_CHALK_STAIRS);
        cobblesChalkPool.slab(ModBlocks.COBBLED_CHALK_SLAB);
        cobblesChalkPool.wall(ModBlocks.COBBLED_CHALK_WALL);
        cobblesChalkPool.button(ModBlocks.COBBLED_CHALK_BUTTON);
        cobblesChalkPool.pressurePlate(ModBlocks.COBBLED_CHALK_PRESSURE_PLATE);
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
}
