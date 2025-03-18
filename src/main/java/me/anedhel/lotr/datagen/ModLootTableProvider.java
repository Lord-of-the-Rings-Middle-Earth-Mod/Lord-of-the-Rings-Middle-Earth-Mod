package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModOreType;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.block.custom.crops.CornCropBlock;
import me.anedhel.lotr.block.custom.crops.LettuceCropBlock;
import me.anedhel.lotr.block.custom.crops.TomatoCropBlock;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.data.family.BlockFamily;
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
import org.jetbrains.annotations.NotNull;

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
        addDrop(ModBlocks.WILD_BEETROOT, wildFlowerDrops(ModBlocks.WILD_BEETROOT, Items.BEETROOT, UniformLootNumberProvider.create(1.0f, 3.0f)));
        addPottedPlantDrops(ModBlocks.POTTED_WILD_BEETROOT);
        addDrop(ModBlocks.WILD_CARROT, wildFlowerDrops(ModBlocks.WILD_CARROT, Items.CARROT, UniformLootNumberProvider.create(1.0f, 3.0f)));
        addPottedPlantDrops(ModBlocks.POTTED_WILD_CARROT);
        addDrop(ModBlocks.WILD_POTATO, wildFlowerDrops(ModBlocks.WILD_POTATO, Items.POTATO, UniformLootNumberProvider.create(1.0f, 3.0f)));
        addPottedPlantDrops(ModBlocks.POTTED_WILD_POTATO);
        addDrop(ModBlocks.WILD_CORN, (Block block) -> this.dropsWithProperty(block, TallPlantBlock.HALF, DoubleBlockHalf.LOWER));

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

        for (ModWoodType woodType : ModWoodType.values()) {
            addDrop(woodType.getLog());
            addDrop(woodType.getWood());
            addDrop(woodType.getWoodStairs());
            addDrop(woodType.getWoodSlab());
            addDrop(woodType.getWoodButton());
            addDrop(woodType.getWoodPressurePlate());
            addDrop(woodType.getWoodDoor(), doorDrops(woodType.getWoodDoor()));
            addDrop(woodType.getWoodTrapdoor());

            addDrop(woodType.getStrippedWood());
            addDrop(woodType.getStrippedWood());
            addDrop(woodType.getStrippedWoodStairs());
            addDrop(woodType.getStrippedWoodSlab());
            addDrop(woodType.getStrippedWoodButton());
            addDrop(woodType.getStrippedWoodPressurePlate());
            addDrop(woodType.getStrippedWoodDoor(), doorDrops(woodType.getStrippedWoodDoor()));
            addDrop(woodType.getStrippedWoodTrapdoor());

            addDrop(woodType.getPlanks());
            addDrop(woodType.getPlanksStairs());
            addDrop(woodType.getPlanksSlab());
            addDrop(woodType.getPlanksButton());
            addDrop(woodType.getPlanksPressurePlate());
            addDrop(woodType.getPlanksFence());
            addDrop(woodType.getPlanksFenceGate());
            addDrop(woodType.getPlanksDoor(), doorDrops(woodType.getPlanksDoor()));
            addDrop(woodType.getPlanksTrapdoor());

            addDrop(woodType.getLeaves(), leavesDrops(woodType.getLeaves(), woodType.getSapling(), 0.0025f));
            addDrop(woodType.getSapling());
        }

        generateStoneTypeLootTables();

        for (ModOreType oreType : ModOreType.values()) {
            if (!oreType.isVanillaAddition()) {
                if (oreType.getStoneOre() != null) {
                    addDrop(oreType.getStoneOre(), oreDrops(oreType.getStoneOre(), oreType.getOreDrop(), oreType.getDropRange()));
                }
                if (oreType.getDeepslateOre() != null) {
                    addDrop(oreType.getDeepslateOre(), oreDrops(oreType.getDeepslateOre(), oreType.getOreDrop(), oreType.getDropRange()));
                }
            }
            if (oreType.getAndesiteOre() != null) {
                addDrop(oreType.getAndesiteOre(), oreDrops(oreType.getAndesiteOre(), oreType.getOreDrop(), oreType.getDropRange()));
            }
            if (oreType.getDioriteOre() != null) {
                addDrop(oreType.getDioriteOre(), oreDrops(oreType.getDioriteOre(), oreType.getOreDrop(), oreType.getDropRange()));
            }
            if (oreType.getGraniteOre() != null) {
                addDrop(oreType.getGraniteOre(), oreDrops(oreType.getGraniteOre(), oreType.getOreDrop(), oreType.getDropRange()));
            }

            if (oreType.getBlueslateOre() != null) {
                addDrop(oreType.getBlueslateOre(), oreDrops(oreType.getBlueslateOre(), oreType.getOreDrop(), oreType.getDropRange()));
            }
            if (oreType.getChalkOre() != null) {
                addDrop(oreType.getChalkOre(), oreDrops(oreType.getChalkOre(), oreType.getOreDrop(), oreType.getDropRange()));
            }
        }
    }

    /**
     * Generate the Loot-Tables for all ModStoneTypes
     */
    private void generateStoneTypeLootTables () {
        for(ModStoneType stoneType : ModStoneType.values()) {
            generateStoneBlockFamilyLootTables(stoneType.getStoneFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCobbledFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyCobbledFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownCobbledFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getGoldOrnamentedBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedGoldOrnamentedBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getGoldOrnamentedTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedGoldOrnamentedTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getGoldOrnamentedFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedGoldOrnamentedFancyBricksFamily());

            if (stoneType.getSmooth() != null) {
                addDrop(stoneType.getSmooth());
                addDrop(stoneType.getSmoothSlab(), slabDrops(stoneType.getSmoothSlab()));
            }
            if (stoneType.getCrackedSmooth() != null) {
                addDrop(stoneType.getCrackedSmooth());
                addDrop(stoneType.getCrackedSmoothSlab(), slabDrops(stoneType.getCrackedSmoothSlab()));
            }
            if (stoneType.getPillar() != null) {
                addDrop(stoneType.getPillar());
                addDrop(stoneType.getPillarSlab(), slabDrops(stoneType.getPillarSlab()));
            }
            if (stoneType.getCrackedPillar() != null) {
                addDrop(stoneType.getCrackedPillar());
                addDrop(stoneType.getCrackedPillarSlab(), slabDrops(stoneType.getCrackedPillarSlab()));
            }
        }
    }

    /**
     * Generates the Loot-Tables for a Stone-BlockFamily
     * @param family the blockFamily for which the loot-tables should be generated
     */
    private void generateStoneBlockFamilyLootTables(@NotNull BlockFamily family) {
        addDrop(family.getBaseBlock());
        for(Block block : family.getVariants().values()) {
            if(block instanceof SlabBlock) {
                addDrop(block, slabDrops(block));
            } else {
                addDrop(block);
            }
        }
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
