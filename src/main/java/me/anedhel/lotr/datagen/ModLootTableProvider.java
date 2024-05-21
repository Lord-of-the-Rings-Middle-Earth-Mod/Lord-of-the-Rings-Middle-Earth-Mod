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
        addDrop(ModBlocks.CHALK_STONE);
        addDrop(ModBlocks.CHALK_STONE_STAIRS);
        addDrop(ModBlocks.CHALK_STONE_WALL);
        addDrop(ModBlocks.CHALK_STONE_BUTTON);
        addDrop(ModBlocks.CHALK_STONE_PRESSUREPLATE);

        addDrop(ModBlocks.CHALK_STONE_SLAB, slabDrops(ModBlocks.CHALK_STONE_SLAB));
    }
}
