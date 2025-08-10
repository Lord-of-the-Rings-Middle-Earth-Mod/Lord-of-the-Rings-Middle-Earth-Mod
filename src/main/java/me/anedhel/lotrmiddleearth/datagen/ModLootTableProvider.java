package me.anedhel.lotrmiddleearth.datagen;

import me.anedhel.lotrmiddleearth.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // Basic blocks drop themselves
        addDrop(ModBlocks.CHALK);
        addDrop(ModBlocks.CHALK_BRICK);
        addDrop(ModBlocks.CHALK_PAVEMENT);
        addDrop(ModBlocks.CHALK_TILES);
        addDrop(ModBlocks.CHISELED_CHALK_BRICK);
        addDrop(ModBlocks.COBBLED_CHALK);
        addDrop(ModBlocks.COBBLED_CHALK_BRICKS);
        addDrop(ModBlocks.SMOOTH_CHALK);
        addDrop(ModBlocks.FANCY_CHALK_BRICKS);

        // Cracked variants
        addDrop(ModBlocks.CRACKED_CHALK_BRICK);
        addDrop(ModBlocks.CRACKED_CHALK_PAVEMENT);
        addDrop(ModBlocks.CRACKED_CHALK_TILES);
        addDrop(ModBlocks.CRACKED_COBBLED_CHALK_BRICKS);
        addDrop(ModBlocks.CRACKED_FANCY_CHALK_BRICKS);
        addDrop(ModBlocks.CRACKED_SMOOTH_CHALK);

        // Pillars
        addDrop(ModBlocks.CHALK_PILLAR);
        addDrop(ModBlocks.CRACKED_CHALK_PILLAR);

        // Slabs - use slab drops
        addDrop(ModBlocks.CHALK_SLAB, slabDrops(ModBlocks.CHALK_SLAB));
        addDrop(ModBlocks.CHALK_BRICK_SLAB, slabDrops(ModBlocks.CHALK_BRICK_SLAB));
        addDrop(ModBlocks.CHALK_PAVEMENT_SLAB, slabDrops(ModBlocks.CHALK_PAVEMENT_SLAB));
        addDrop(ModBlocks.CHALK_TILES_SLAB, slabDrops(ModBlocks.CHALK_TILES_SLAB));
        addDrop(ModBlocks.COBBLED_CHALK_SLAB, slabDrops(ModBlocks.COBBLED_CHALK_SLAB));
        addDrop(ModBlocks.COBBLED_CHALK_BRICKS_SLAB, slabDrops(ModBlocks.COBBLED_CHALK_BRICKS_SLAB));
        addDrop(ModBlocks.SMOOTH_CHALK_SLAB, slabDrops(ModBlocks.SMOOTH_CHALK_SLAB));
        addDrop(ModBlocks.FANCY_CHALK_BRICKS_SLAB, slabDrops(ModBlocks.FANCY_CHALK_BRICKS_SLAB));

        // Stairs
        addDrop(ModBlocks.CHALK_STAIRS);
        addDrop(ModBlocks.CHALK_BRICK_STAIRS);
        addDrop(ModBlocks.CHALK_PAVEMENT_STAIRS);
        addDrop(ModBlocks.CHALK_TILES_STAIRS);
        addDrop(ModBlocks.COBBLED_CHALK_STAIRS);
        addDrop(ModBlocks.COBBLED_CHALK_BRICKS_STAIRS);
        addDrop(ModBlocks.SMOOTH_CHALK_STAIRS);
        addDrop(ModBlocks.FANCY_CHALK_BRICKS_STAIRS);

        // Walls
        addDrop(ModBlocks.CHALK_WALL);
        addDrop(ModBlocks.CHALK_BRICK_WALL);
        addDrop(ModBlocks.CHALK_PAVEMENT_WALL);
        addDrop(ModBlocks.COBBLED_CHALK_WALL);
        addDrop(ModBlocks.COBBLED_CHALK_BRICKS_WALL);
    }
}