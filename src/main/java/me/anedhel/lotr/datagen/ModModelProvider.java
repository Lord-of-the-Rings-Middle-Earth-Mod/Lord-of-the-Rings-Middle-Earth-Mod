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
                .registerCubeAllModelTexturePool(ModBlocks.CHALK_STONE);

        chalkStonePool.stairs(ModBlocks.CHALK_STONE_STAIRS);
        chalkStonePool.slab(ModBlocks.CHALK_STONE_SLAB);
        chalkStonePool.wall(ModBlocks.CHALK_STONE_WALL);
        chalkStonePool.button(ModBlocks.CHALK_STONE_BUTTON);
        chalkStonePool.pressurePlate(ModBlocks.CHALK_STONE_PRESSUREPLATE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
