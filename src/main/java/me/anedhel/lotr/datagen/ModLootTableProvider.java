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
    }
}
