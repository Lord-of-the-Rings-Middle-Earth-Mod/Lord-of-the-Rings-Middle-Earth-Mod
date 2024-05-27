package me.anedhel.lotr.datagen;

import me.anedhel.lotr.blocks.ModBlocks;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TIN_ORE, oreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN, UniformLootNumberProvider
                .create(2.0f, 5.0f)));

        addDrop(ModBlocks.RAW_TIN_BLOCK);
        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.BRONZE_BLOCK);

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

    /**
     *
     * @param drop The block dropped with SilkTouch
     * @param item The item dropped without SilkTouch
     * @param dropRange The range of how many items can drop from one ore
     * @return The LootTable.Builder that can be added to the addDrop()-Methods
     */
    private LootTable.Builder oreDrops(Block drop, Item item, UniformLootNumberProvider dropRange) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(dropRange)))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
