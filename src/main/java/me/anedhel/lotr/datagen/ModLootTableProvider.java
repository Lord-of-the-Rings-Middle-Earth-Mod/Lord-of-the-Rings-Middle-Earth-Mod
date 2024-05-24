package me.anedhel.lotr.datagen;

import me.anedhel.lotr.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CHALK);
        addDrop(ModBlocks.CHALK_STAIRS);
        addDrop(ModBlocks.CHALK_WALL);
        addDrop(ModBlocks.CHALK_BUTTON);
        addDrop(ModBlocks.CHALK_PRESSURE_PLATE);
        addDrop(ModBlocks.CHALK_SLAB, slabDrops(ModBlocks.CHALK_SLAB));

        addDrop(ModBlocks.CHALK_BRICK);
        addDrop(ModBlocks.CHALK_BRICK_STAIRS);
        addDrop(ModBlocks.CHALK_BRICK_WALL);

        addDrop(ModBlocks.COBBLED_CHALK);
        addDrop(ModBlocks.COBBLED_CHALK_STAIRS);
        addDrop(ModBlocks.COBBLED_CHALK_WALL);
        addDrop(ModBlocks.COBBLED_CHALK_BUTTON);
        addDrop(ModBlocks.COBBLED_CHALK_PRESSURE_PLATE);
        addDrop(ModBlocks.COBBLED_CHALK_SLAB, slabDrops(ModBlocks.COBBLED_CHALK_SLAB));
    }
}
