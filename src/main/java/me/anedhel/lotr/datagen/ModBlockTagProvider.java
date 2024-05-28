package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

/**
 * This class is used to add custom BlockTags and edit existing ones.
 */
public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    /**
     * This Method is used to configure existing BlockTags and add new ones.
     * @param arg This argument is provided by minecraft
     */
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHALK)
                .add(ModBlocks.CHALK_STAIRS)
                .add(ModBlocks.CHALK_SLAB)
                .add(ModBlocks.CHALK_WALL)
                .add(ModBlocks.CHALK_BUTTON)
                .add(ModBlocks.CHALK_PRESSURE_PLATE)
                .add(ModBlocks.CHALK_BRICK)
                .add(ModBlocks.CHALK_BRICK_STAIRS)
                .add(ModBlocks.CHALK_BRICK_SLAB)
                .add(ModBlocks.CHALK_BRICK_WALL)
                .add(ModBlocks.COBBLED_CHALK)
                .add(ModBlocks.COBBLED_CHALK_STAIRS)
                .add(ModBlocks.COBBLED_CHALK_SLAB)
                .add(ModBlocks.COBBLED_CHALK_WALL)
                .add(ModBlocks.COBBLED_CHALK_BUTTON)
                .add(ModBlocks.COBBLED_CHALK_PRESSURE_PLATE)
                .add(ModBlocks.ANDESITE_BUTTON)
                .add(ModBlocks.ANDESITE_PRESSURE_PLATE)
                .add(ModBlocks.ANDESITE_BRICK)
                .add(ModBlocks.ANDESITE_BRICK_STAIRS)
                .add(ModBlocks.ANDESITE_BRICK_SLAB)
                .add(ModBlocks.ANDESITE_BRICK_WALL)
                .add(ModBlocks.COBBLED_ANDESITE)
                .add(ModBlocks.COBBLED_ANDESITE_STAIRS)
                .add(ModBlocks.COBBLED_ANDESITE_SLAB)
                .add(ModBlocks.COBBLED_ANDESITE_WALL)
                .add(ModBlocks.COBBLED_ANDESITE_BUTTON)
                .add(ModBlocks.COBBLED_ANDESITE_PRESSURE_PLATE)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.BRONZE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.BRONZE_BLOCK);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.CHALK_WALL)
                .add(ModBlocks.COBBLED_CHALK_WALL)
                .add(ModBlocks.CHALK_BRICK_WALL)
                .add(ModBlocks.COBBLED_ANDESITE_WALL)
                .add(ModBlocks.ANDESITE_BRICK_WALL);
    }
}
