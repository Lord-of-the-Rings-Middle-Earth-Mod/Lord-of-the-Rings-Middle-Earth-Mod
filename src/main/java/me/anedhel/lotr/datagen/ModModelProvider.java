package me.anedhel.lotr.datagen;

import me.anedhel.lotr.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
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

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
