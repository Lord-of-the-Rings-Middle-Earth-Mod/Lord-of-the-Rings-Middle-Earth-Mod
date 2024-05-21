package me.anedhel.lotr.datagen;

import me.anedhel.lotr.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHALK_STONE)
                .add(ModBlocks.CHALK_STONE_STAIRS)
                .add(ModBlocks.CHALK_STONE_SLAB)
                .add(ModBlocks.CHALK_STONE_WALL)
                .add(ModBlocks.CHALK_STONE_BUTTON)
                .add(ModBlocks.CHALK_STONE_PRESSUREPLATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.CHALK_STONE_WALL);
    }
}
