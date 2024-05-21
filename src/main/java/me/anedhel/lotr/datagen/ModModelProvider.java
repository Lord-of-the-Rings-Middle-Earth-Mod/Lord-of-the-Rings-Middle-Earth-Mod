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
        BlockStateModelGenerator.BlockTexturePool chalkStonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.CHALK);

        chalkStonePool.stairs(ModBlocks.CHALK_STAIRS);
        chalkStonePool.slab(ModBlocks.CHALK_SLAB);
        chalkStonePool.wall(ModBlocks.CHALK_WALL);
        chalkStonePool.button(ModBlocks.CHALK_BUTTON);
        chalkStonePool.pressurePlate(ModBlocks.CHALK_PRESSURE_PLATE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
