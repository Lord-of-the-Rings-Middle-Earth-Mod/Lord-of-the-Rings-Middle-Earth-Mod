package me.anedhel.lotrmiddleearth.datagen;

import me.anedhel.lotrmiddleearth.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Basic blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHALK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHALK_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHALK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHALK_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_CHALK_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLED_CHALK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLED_CHALK_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_CHALK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FANCY_CHALK_BRICKS);

        // Cracked variants
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CHALK_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CHALK_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CHALK_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_COBBLED_CHALK_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_FANCY_CHALK_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_SMOOTH_CHALK);

        // Pillar blocks
        blockStateModelGenerator.registerAxisRotated(ModBlocks.CHALK_PILLAR, Models.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.CRACKED_CHALK_PILLAR, Models.CUBE_COLUMN);

        // Slabs, stairs, and walls
        blockStateModelGenerator.registerSlabStairsWall(ModBlocks.CHALK, ModBlocks.CHALK_SLAB, ModBlocks.CHALK_STAIRS, ModBlocks.CHALK_WALL);
        blockStateModelGenerator.registerSlabStairsWall(ModBlocks.CHALK_BRICK, ModBlocks.CHALK_BRICK_SLAB, ModBlocks.CHALK_BRICK_STAIRS, ModBlocks.CHALK_BRICK_WALL);
        blockStateModelGenerator.registerSlabStairsWall(ModBlocks.CHALK_PAVEMENT, ModBlocks.CHALK_PAVEMENT_SLAB, ModBlocks.CHALK_PAVEMENT_STAIRS, ModBlocks.CHALK_PAVEMENT_WALL);
        blockStateModelGenerator.registerSlabStairs(ModBlocks.CHALK_TILES, ModBlocks.CHALK_TILES_SLAB, ModBlocks.CHALK_TILES_STAIRS);
        blockStateModelGenerator.registerSlabStairsWall(ModBlocks.COBBLED_CHALK, ModBlocks.COBBLED_CHALK_SLAB, ModBlocks.COBBLED_CHALK_STAIRS, ModBlocks.COBBLED_CHALK_WALL);
        blockStateModelGenerator.registerSlabStairsWall(ModBlocks.COBBLED_CHALK_BRICKS, ModBlocks.COBBLED_CHALK_BRICKS_SLAB, ModBlocks.COBBLED_CHALK_BRICKS_STAIRS, ModBlocks.COBBLED_CHALK_BRICKS_WALL);
        blockStateModelGenerator.registerSlabStairs(ModBlocks.SMOOTH_CHALK, ModBlocks.SMOOTH_CHALK_SLAB, ModBlocks.SMOOTH_CHALK_STAIRS);
        blockStateModelGenerator.registerSlabStairs(ModBlocks.FANCY_CHALK_BRICKS, ModBlocks.FANCY_CHALK_BRICKS_SLAB, ModBlocks.FANCY_CHALK_BRICKS_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Items will be generated automatically from blocks
    }
}