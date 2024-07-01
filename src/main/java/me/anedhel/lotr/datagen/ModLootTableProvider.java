package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.custom.crops.CornCropBlock;
import me.anedhel.lotr.block.custom.crops.LettuceCropBlock;
import me.anedhel.lotr.block.custom.crops.TomatoCropBlock;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

/**
 * This class is used to add all LootTables the mod provides and edit existing ones.
 */
public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    /**
     * This method is used to add all LootTables
     */
    @Override
    public void generate() {
        addDrop(ModBlocks.TIN_ORE, oreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN, UniformLootNumberProvider
                .create(2.0f, 5.0f)));

        addDrop(ModBlocks.WILD_BEETROOT, wildFlowerDrops(ModBlocks.WILD_BEETROOT, Items.BEETROOT, UniformLootNumberProvider.create(1.0f, 3.0f)));
        addPottedPlantDrops(ModBlocks.POTTED_WILD_BEETROOT);
        addDrop(ModBlocks.WILD_CARROT, wildFlowerDrops(ModBlocks.WILD_CARROT, Items.CARROT, UniformLootNumberProvider.create(1.0f, 3.0f)));
        addPottedPlantDrops(ModBlocks.POTTED_WILD_CARROT);
        addDrop(ModBlocks.WILD_POTATO, wildFlowerDrops(ModBlocks.WILD_POTATO, Items.POTATO, UniformLootNumberProvider.create(1.0f, 3.0f)));
        addPottedPlantDrops(ModBlocks.POTTED_WILD_POTATO);
        addDrop(ModBlocks.WILD_CORN, wildFlowerDrops(ModBlocks.WILD_CORN, ModItems.CORN, UniformLootNumberProvider.create(1.0f, 3.0f)));
        addPottedPlantDrops(ModBlocks.POTTED_WILD_CORN);
        addDrop(ModBlocks.WILD_LETTUCE, wildFlowerDrops(ModBlocks.WILD_LETTUCE, ModItems.LETTUCE, UniformLootNumberProvider.create(1.0f, 3.0f)));
        addPottedPlantDrops(ModBlocks.POTTED_WILD_LETTUCE);
        addDrop(ModBlocks.WILD_TOMATO, wildFlowerDrops(ModBlocks.WILD_TOMATO, ModItems.TOMATO, UniformLootNumberProvider.create(1.0f, 3.0f)));
        addPottedPlantDrops(ModBlocks.POTTED_WILD_TOMATO);

        BlockStatePropertyLootCondition.Builder tomatoCropBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TomatoCropBlock.AGE, TomatoCropBlock.MAX_AGE));
        addDrop(ModBlocks.TOMATO_CROP, cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, tomatoCropBuilder));

        BlockStatePropertyLootCondition.Builder lettuceCropBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.LETTUCE_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(LettuceCropBlock.AGE, LettuceCropBlock.MAX_AGE));
        addDrop(ModBlocks.LETTUCE_CROP, cropDrops(ModBlocks.LETTUCE_CROP, ModItems.LETTUCE, ModItems.LETTUCE, lettuceCropBuilder));

        AnyOfLootCondition.Builder builder2 =
                BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create()
                                .exactMatch(CornCropBlock.AGE, 7))
                        .or(BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create()
                                .exactMatch(CornCropBlock.AGE, 8)));

        // BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create()
        //         .exactMatch(CornCropBlock.AGE, 8));

        addDrop(ModBlocks.CORN_CROP, cropDrops(ModBlocks.CORN_CROP, ModItems.CORN, ModItems.CORN_SEEDS, builder2));

        addDrop(ModBlocks.TOMATO_CRATE);
        addDrop(ModBlocks.LETTUCE_CRATE);
        addDrop(ModBlocks.CORN_CRATE);
        addDrop(ModBlocks.POTATO_CRATE);
        addDrop(ModBlocks.CARROT_CRATE);
        addDrop(ModBlocks.BEETROOT_CRATE);

        addDrop(ModBlocks.RAW_TIN_BLOCK);
        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.BRONZE_BLOCK);

        addDrop(ModBlocks.PINE_LOG);
        addDrop(ModBlocks.PINE_WOOD);
        addDrop(ModBlocks.STRIPPED_PINE_LOG);
        addDrop(ModBlocks.STRIPPED_PINE_WOOD);
        /*addDrop(ModBlocks.PINE_PLANKS);
        addDrop(ModBlocks.PINE_PLANKS_FENCE);
        addDrop(ModBlocks.PINE_PLANKS_FENCE_GATE);
        addDrop(ModBlocks.PINE_PLANKS_DOOR, doorDrops(ModBlocks.PINE_PLANKS_DOOR));
        addDrop(ModBlocks.PINE_PLANKS_TRAPDOOR);*/
        addDrop(ModBlocks.PINE_LEAVES, leavesDrops(ModBlocks.PINE_LEAVES, ModBlocks.WILD_CORN, 0.0025f)); //ToDo: Add proper Sapling

        addDrop(ModBlocks.ANDESITE_BUTTON);
        addDrop(ModBlocks.ANDESITE_PRESSURE_PLATE);

        addDrop(ModBlocks.POLISHED_ANDESITE_WALL);
        addDrop(ModBlocks.POLISHED_ANDESITE_BUTTON);
        addDrop(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);

        addDrop(ModBlocks.COBBLED_ANDESITE);
        addDrop(ModBlocks.COBBLED_ANDESITE_STAIRS);
        addDrop(ModBlocks.COBBLED_ANDESITE_WALL);
        addDrop(ModBlocks.COBBLED_ANDESITE_BUTTON);
        addDrop(ModBlocks.COBBLED_ANDESITE_PRESSURE_PLATE);
        addDrop(ModBlocks.COBBLED_ANDESITE_SLAB, slabDrops(ModBlocks.COBBLED_ANDESITE_SLAB));

        addDrop(ModBlocks.ANDESITE_BRICK);
        addDrop(ModBlocks.ANDESITE_BRICK_STAIRS);
        addDrop(ModBlocks.ANDESITE_BRICK_WALL);
        addDrop(ModBlocks.ANDESITE_BRICK_SLAB, slabDrops(ModBlocks.ANDESITE_BRICK_SLAB));

        addDrop(ModBlocks.DIORITE_BUTTON);
        addDrop(ModBlocks.DIORITE_PRESSURE_PLATE);

        addDrop(ModBlocks.POLISHED_DIORITE_WALL);
        addDrop(ModBlocks.POLISHED_DIORITE_BUTTON);
        addDrop(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);

        addDrop(ModBlocks.COBBLED_DIORITE);
        addDrop(ModBlocks.COBBLED_DIORITE_STAIRS);
        addDrop(ModBlocks.COBBLED_DIORITE_WALL);
        addDrop(ModBlocks.COBBLED_DIORITE_BUTTON);
        addDrop(ModBlocks.COBBLED_DIORITE_PRESSURE_PLATE);
        addDrop(ModBlocks.COBBLED_DIORITE_SLAB, slabDrops(ModBlocks.COBBLED_DIORITE_SLAB));

        addDrop(ModBlocks.DIORITE_BRICK);
        addDrop(ModBlocks.DIORITE_BRICK_STAIRS);
        addDrop(ModBlocks.DIORITE_BRICK_WALL);
        addDrop(ModBlocks.DIORITE_BRICK_SLAB, slabDrops(ModBlocks.DIORITE_BRICK_SLAB));

        addDrop(ModBlocks.GRANITE_BUTTON);
        addDrop(ModBlocks.GRANITE_PRESSURE_PLATE);

        addDrop(ModBlocks.POLISHED_GRANITE_WALL);
        addDrop(ModBlocks.POLISHED_GRANITE_BUTTON);
        addDrop(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);

        addDrop(ModBlocks.COBBLED_GRANITE);
        addDrop(ModBlocks.COBBLED_GRANITE_STAIRS);
        addDrop(ModBlocks.COBBLED_GRANITE_WALL);
        addDrop(ModBlocks.COBBLED_GRANITE_BUTTON);
        addDrop(ModBlocks.COBBLED_GRANITE_PRESSURE_PLATE);
        addDrop(ModBlocks.COBBLED_GRANITE_SLAB, slabDrops(ModBlocks.COBBLED_GRANITE_SLAB));

        addDrop(ModBlocks.GRANITE_BRICK);
        addDrop(ModBlocks.GRANITE_BRICK_STAIRS);
        addDrop(ModBlocks.GRANITE_BRICK_WALL);
        addDrop(ModBlocks.GRANITE_BRICK_SLAB, slabDrops(ModBlocks.GRANITE_BRICK_SLAB));

        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.SMOOTH_BASALT_SLAB, slabDrops(ModBlocks.SMOOTH_BASALT_SLAB));
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);
        addDrop(ModBlocks.SMOOTH_BASALT_BUTTON);
        addDrop(ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE);

        addDrop(ModBlocks.BASALT_BRICK);
        addDrop(ModBlocks.BASALT_BRICK_STAIRS);
        addDrop(ModBlocks.BASALT_BRICK_SLAB, slabDrops(ModBlocks.BASALT_BRICK_SLAB));
        addDrop(ModBlocks.BASALT_BRICK_WALL);

        addDrop(ModBlocks.BLUESLATE);
        addDrop(ModBlocks.BLUESLATE_STAIRS);
        addDrop(ModBlocks.BLUESLATE_SLAB);
        addDrop(ModBlocks.BLUESLATE_WALL);
        addDrop(ModBlocks.BLUESLATE_BUTTON);
        addDrop(ModBlocks.BLUESLATE_PRESSURE_PLATE);

        addDrop(ModBlocks.COBBLED_BLUESLATE);
        addDrop(ModBlocks.COBBLED_BLUESLATE_STAIRS);
        addDrop(ModBlocks.COBBLED_BLUESLATE_SLAB);
        addDrop(ModBlocks.COBBLED_BLUESLATE_WALL);
        addDrop(ModBlocks.COBBLED_BLUESLATE_BUTTON);
        addDrop(ModBlocks.COBBLED_BLUESLATE_PRESSURE_PLATE);

        addDrop(ModBlocks.BLUESLATE_BRICK);
        addDrop(ModBlocks.BLUESLATE_BRICK_STAIRS);
        addDrop(ModBlocks.BLUESLATE_BRICK_SLAB);
        addDrop(ModBlocks.BLUESLATE_BRICK_WALL);

        addDrop(ModBlocks.CHALK);
        addDrop(ModBlocks.CHALK_STAIRS);
        addDrop(ModBlocks.CHALK_WALL);
        addDrop(ModBlocks.CHALK_BUTTON);
        addDrop(ModBlocks.CHALK_PRESSURE_PLATE);
        addDrop(ModBlocks.CHALK_SLAB, slabDrops(ModBlocks.CHALK_SLAB));

        addDrop(ModBlocks.CHALK_BRICK);
        addDrop(ModBlocks.CHALK_BRICK_STAIRS);
        addDrop(ModBlocks.CHALK_BRICK_WALL);
        addDrop(ModBlocks.CHALK_BRICK_SLAB, slabDrops(ModBlocks.CHALK_BRICK_SLAB));

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

    /**
     *
     * @param drop The block dropped with SilkTouch
     * @param item The item dropped without SilkTouch
     * @param dropRange The range of how many items can drop from one flower
     * @return The LootTable.Builder that can be added to the addDrop()-Methods
     */
    private LootTable.Builder wildFlowerDrops (Block drop, Item item, UniformLootNumberProvider dropRange) {
        return BlockLootTableGenerator.dropsWithShears(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                    ItemEntry.builder(item)
                        .apply(SetCountLootFunction.builder(dropRange)))));
    }
}
