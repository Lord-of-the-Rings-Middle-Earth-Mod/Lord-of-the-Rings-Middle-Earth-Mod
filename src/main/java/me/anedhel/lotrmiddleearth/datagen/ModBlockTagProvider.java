package me.anedhel.lotrmiddleearth.datagen;

import me.anedhel.lotrmiddleearth.block.ModBlocks;
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
        // Add blocks that can be mined with pickaxe
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHALK)
                .add(ModBlocks.CHALK_BRICK)
                .add(ModBlocks.CHALK_PAVEMENT)
                .add(ModBlocks.CHALK_TILES)
                .add(ModBlocks.CHISELED_CHALK_BRICK)
                .add(ModBlocks.COBBLED_CHALK)
                .add(ModBlocks.COBBLED_CHALK_BRICKS)
                .add(ModBlocks.SMOOTH_CHALK)
                .add(ModBlocks.FANCY_CHALK_BRICKS)
                .add(ModBlocks.CRACKED_CHALK_BRICK)
                .add(ModBlocks.CRACKED_CHALK_PAVEMENT)
                .add(ModBlocks.CRACKED_CHALK_TILES)
                .add(ModBlocks.CRACKED_COBBLED_CHALK_BRICKS)
                .add(ModBlocks.CRACKED_FANCY_CHALK_BRICKS)
                .add(ModBlocks.CRACKED_SMOOTH_CHALK)
                .add(ModBlocks.CHALK_PILLAR)
                .add(ModBlocks.CRACKED_CHALK_PILLAR)
                .add(ModBlocks.CHALK_SLAB)
                .add(ModBlocks.CHALK_BRICK_SLAB)
                .add(ModBlocks.CHALK_PAVEMENT_SLAB)
                .add(ModBlocks.CHALK_TILES_SLAB)
                .add(ModBlocks.COBBLED_CHALK_SLAB)
                .add(ModBlocks.COBBLED_CHALK_BRICKS_SLAB)
                .add(ModBlocks.SMOOTH_CHALK_SLAB)
                .add(ModBlocks.FANCY_CHALK_BRICKS_SLAB)
                .add(ModBlocks.CHALK_STAIRS)
                .add(ModBlocks.CHALK_BRICK_STAIRS)
                .add(ModBlocks.CHALK_PAVEMENT_STAIRS)
                .add(ModBlocks.CHALK_TILES_STAIRS)
                .add(ModBlocks.COBBLED_CHALK_STAIRS)
                .add(ModBlocks.COBBLED_CHALK_BRICKS_STAIRS)
                .add(ModBlocks.SMOOTH_CHALK_STAIRS)
                .add(ModBlocks.FANCY_CHALK_BRICKS_STAIRS)
                .add(ModBlocks.CHALK_WALL)
                .add(ModBlocks.CHALK_BRICK_WALL)
                .add(ModBlocks.CHALK_PAVEMENT_WALL)
                .add(ModBlocks.COBBLED_CHALK_WALL)
                .add(ModBlocks.COBBLED_CHALK_BRICKS_WALL);

        // Add walls to walls tag
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.CHALK_WALL)
                .add(ModBlocks.CHALK_BRICK_WALL)
                .add(ModBlocks.CHALK_PAVEMENT_WALL)
                .add(ModBlocks.COBBLED_CHALK_WALL)
                .add(ModBlocks.COBBLED_CHALK_BRICKS_WALL);
    }
}