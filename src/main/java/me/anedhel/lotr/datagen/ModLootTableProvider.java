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
            generateStoneBlockFamilyLootTables(stoneType.getMossyStoneFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownStoneFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCobbledFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyCobbledFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownCobbledFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getBronzeCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyBronzeCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownBronzeCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getSilverCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossySilverCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownSilverCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getGoldCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyGoldCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownGoldCobbledBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getBronzeBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedBronzeBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyBronzeBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyBronzeBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownBronzeBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownBronzeBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getSilverBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedSilverBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossySilverBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossySilverBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownSilverBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownSilverBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getGoldBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedGoldBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyGoldBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyGoldBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownGoldBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownGoldBrickFamily());
            generateStoneBlockFamilyLootTables(stoneType.getTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getBronzeTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedBronzeTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyBronzeTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyBronzeTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownBronzeTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownBronzeTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getSilverTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedSilverTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossySilverTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossySilverTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownSilverTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownSilverTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getGoldTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedGoldTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyGoldTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyGoldTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownGoldTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownGoldTilesFamily());
            generateStoneBlockFamilyLootTables(stoneType.getPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getBronzePavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedBronzePavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyBronzePavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyBronzePavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownBronzePavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownBronzePavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getSilverPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedSilverPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossySilverPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossySilverPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownSilverPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownSilverPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getGoldPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedGoldPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyGoldPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyGoldPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownGoldPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownGoldPavementFamily());
            generateStoneBlockFamilyLootTables(stoneType.getFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getBronzeFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedBronzeFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyBronzeFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyBronzeFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownBronzeFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownBronzeFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getSilverFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedSilverFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossySilverFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossySilverFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownSilverFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownSilverFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getGoldFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedGoldFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getMossyGoldFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedMossyGoldFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getOvergrownGoldFancyBricksFamily());
            generateStoneBlockFamilyLootTables(stoneType.getCrackedOvergrownGoldFancyBricksFamily());

            if (stoneType.getSmooth() != null) {
                addDrop(stoneType.getSmooth());
                addDrop(stoneType.getSmoothSlab(), slabDrops(stoneType.getSmoothSlab()));
            }
            if (stoneType.getCrackedSmooth() != null) {
                addDrop(stoneType.getCrackedSmooth());
                addDrop(stoneType.getCrackedSmoothSlab(), slabDrops(stoneType.getCrackedSmoothSlab()));
            }
            if (stoneType.getMossySmooth() != null) {
                addDrop(stoneType.getMossySmooth());
                addDrop(stoneType.getMossySmoothSlab(), slabDrops(stoneType.getMossySmoothSlab()));
            }
            if (stoneType.getCrackedMossySmooth() != null) {
                addDrop(stoneType.getCrackedMossySmooth());
                addDrop(stoneType.getCrackedMossySmoothSlab(), slabDrops(stoneType.getCrackedMossySmoothSlab()));
            }
            if (stoneType.getOvergrownSmooth() != null) {
                addDrop(stoneType.getOvergrownSmooth());
                addDrop(stoneType.getOvergrownSmoothSlab(), slabDrops(stoneType.getOvergrownSmoothSlab()));
            }
            if (stoneType.getCrackedOvergrownSmooth() != null) {
                addDrop(stoneType.getCrackedOvergrownSmooth());
                addDrop(stoneType.getCrackedOvergrownSmoothSlab(), slabDrops(stoneType.getCrackedOvergrownSmoothSlab()));
            }
            if (stoneType.getBronzeSmooth() != null) {
                addDrop(stoneType.getBronzeSmooth());
                addDrop(stoneType.getBronzeSmoothSlab(), slabDrops(stoneType.getBronzeSmoothSlab()));
            }
            if (stoneType.getCrackedBronzeSmooth() != null) {
                addDrop(stoneType.getCrackedBronzeSmooth());
                addDrop(stoneType.getCrackedBronzeSmoothSlab(), slabDrops(stoneType.getCrackedBronzeSmoothSlab()));
            }
            if (stoneType.getMossyBronzeSmooth() != null) {
                addDrop(stoneType.getMossyBronzeSmooth());
                addDrop(stoneType.getMossyBronzeSmoothSlab(), slabDrops(stoneType.getMossyBronzeSmoothSlab()));
            }
            if (stoneType.getCrackedMossyBronzeSmooth() != null) {
                addDrop(stoneType.getCrackedMossyBronzeSmooth());
                addDrop(stoneType.getCrackedMossyBronzeSmoothSlab(), slabDrops(stoneType.getCrackedMossyBronzeSmoothSlab()));
            }
            if (stoneType.getOvergrownBronzeSmooth() != null) {
                addDrop(stoneType.getOvergrownBronzeSmooth());
                addDrop(stoneType.getOvergrownBronzeSmoothSlab(), slabDrops(stoneType.getOvergrownBronzeSmoothSlab()));
            }
            if (stoneType.getCrackedOvergrownBronzeSmooth() != null) {
                addDrop(stoneType.getCrackedOvergrownBronzeSmooth());
                addDrop(stoneType.getCrackedOvergrownBronzeSmoothSlab(), slabDrops(stoneType.getCrackedOvergrownSmoothSlab()));
            }
            if (stoneType.getSilverSmooth() != null) {
                addDrop(stoneType.getSilverSmooth());
                addDrop(stoneType.getSilverSmoothSlab(), slabDrops(stoneType.getSilverSmoothSlab()));
            }
            if (stoneType.getCrackedSilverSmooth() != null) {
                addDrop(stoneType.getCrackedSilverSmooth());
                addDrop(stoneType.getCrackedSilverSmoothSlab(), slabDrops(stoneType.getCrackedSilverSmoothSlab()));
            }
            if (stoneType.getMossySilverSmooth() != null) {
                addDrop(stoneType.getMossySilverSmooth());
                addDrop(stoneType.getMossySilverSmoothSlab(), slabDrops(stoneType.getMossySilverSmoothSlab()));
            }
            if (stoneType.getCrackedMossySilverSmooth() != null) {
                addDrop(stoneType.getCrackedMossySilverSmooth());
                addDrop(stoneType.getCrackedMossySilverSmoothSlab(), slabDrops(stoneType.getCrackedMossySilverSmoothSlab()));
            }
            if (stoneType.getOvergrownSilverSmooth() != null) {
                addDrop(stoneType.getOvergrownSilverSmooth());
                addDrop(stoneType.getOvergrownSilverSmoothSlab(), slabDrops(stoneType.getOvergrownSilverSmoothSlab()));
            }
            if (stoneType.getCrackedOvergrownSilverSmooth() != null) {
                addDrop(stoneType.getCrackedOvergrownSilverSmooth());
                addDrop(stoneType.getCrackedOvergrownSilverSmoothSlab(), slabDrops(stoneType.getCrackedOvergrownSmoothSlab()));
            }
            if (stoneType.getGoldSmooth() != null) {
                addDrop(stoneType.getGoldSmooth());
                addDrop(stoneType.getGoldSmoothSlab(), slabDrops(stoneType.getGoldSmoothSlab()));
            }
            if (stoneType.getCrackedGoldSmooth() != null) {
                addDrop(stoneType.getCrackedGoldSmooth());
                addDrop(stoneType.getCrackedGoldSmoothSlab(), slabDrops(stoneType.getCrackedGoldSmoothSlab()));
            }
            if (stoneType.getMossyGoldSmooth() != null) {
                addDrop(stoneType.getMossyGoldSmooth());
                addDrop(stoneType.getMossyGoldSmoothSlab(), slabDrops(stoneType.getMossyGoldSmoothSlab()));
            }
            if (stoneType.getCrackedMossyGoldSmooth() != null) {
                addDrop(stoneType.getCrackedMossyGoldSmooth());
                addDrop(stoneType.getCrackedMossyGoldSmoothSlab(), slabDrops(stoneType.getCrackedMossyGoldSmoothSlab()));
            }
            if (stoneType.getOvergrownGoldSmooth() != null) {
                addDrop(stoneType.getOvergrownGoldSmooth());
                addDrop(stoneType.getOvergrownGoldSmoothSlab(), slabDrops(stoneType.getOvergrownGoldSmoothSlab()));
            }
            if (stoneType.getCrackedOvergrownGoldSmooth() != null) {
                addDrop(stoneType.getCrackedOvergrownGoldSmooth());
                addDrop(stoneType.getCrackedOvergrownGoldSmoothSlab(), slabDrops(stoneType.getCrackedOvergrownSmoothSlab()));
            }
            if (stoneType.getPillar() != null) {
                addDrop(stoneType.getPillar());
                addDrop(stoneType.getPillarSlab(), slabDrops(stoneType.getPillarSlab()));
            }
            if (stoneType.getCrackedPillar() != null) {
                addDrop(stoneType.getCrackedPillar());
                addDrop(stoneType.getCrackedPillarSlab(), slabDrops(stoneType.getCrackedPillarSlab()));
            }
            if (stoneType.getMossyPillar() != null) {
                addDrop(stoneType.getMossyPillar());
                addDrop(stoneType.getMossyPillarSlab(), slabDrops(stoneType.getMossyPillarSlab()));
            }
            if (stoneType.getCrackedMossyPillar() != null) {
                addDrop(stoneType.getCrackedMossyPillar());
                addDrop(stoneType.getCrackedMossyPillarSlab(), slabDrops(stoneType.getCrackedMossyPillarSlab()));
            }
            if (stoneType.getOvergrownPillar() != null) {
                addDrop(stoneType.getOvergrownPillar());
                addDrop(stoneType.getOvergrownPillarSlab(), slabDrops(stoneType.getOvergrownPillarSlab()));
            }
            if (stoneType.getCrackedOvergrownPillar() != null) {
                addDrop(stoneType.getCrackedOvergrownPillar());
                addDrop(stoneType.getCrackedOvergrownPillarSlab(), slabDrops(stoneType.getCrackedOvergrownPillarSlab()));
            }
            if (stoneType.getBronzePillar() != null) {
                addDrop(stoneType.getBronzePillar());
                addDrop(stoneType.getBronzePillarSlab(), slabDrops(stoneType.getBronzePillarSlab()));
            }
            if (stoneType.getCrackedBronzePillar() != null) {
                addDrop(stoneType.getCrackedBronzePillar());
                addDrop(stoneType.getCrackedBronzePillarSlab(), slabDrops(stoneType.getCrackedBronzePillarSlab()));
            }
            if (stoneType.getMossyBronzePillar() != null) {
                addDrop(stoneType.getMossyBronzePillar());
                addDrop(stoneType.getMossyBronzePillarSlab(), slabDrops(stoneType.getMossyBronzePillarSlab()));
            }
            if (stoneType.getCrackedMossyBronzePillar() != null) {
                addDrop(stoneType.getCrackedMossyBronzePillar());
                addDrop(stoneType.getCrackedMossyBronzePillarSlab(), slabDrops(stoneType.getCrackedMossyBronzePillarSlab()));
            }
            if (stoneType.getOvergrownBronzePillar() != null) {
                addDrop(stoneType.getOvergrownBronzePillar());
                addDrop(stoneType.getOvergrownBronzePillarSlab(), slabDrops(stoneType.getOvergrownBronzePillarSlab()));
            }
            if (stoneType.getCrackedOvergrownBronzePillar() != null) {
                addDrop(stoneType.getCrackedOvergrownBronzePillar());
                addDrop(stoneType.getCrackedOvergrownBronzePillarSlab(), slabDrops(stoneType.getCrackedOvergrownBronzePillarSlab()));
            }
            if (stoneType.getSilverPillar() != null) {
                addDrop(stoneType.getSilverPillar());
                addDrop(stoneType.getSilverPillarSlab(), slabDrops(stoneType.getSilverPillarSlab()));
            }
            if (stoneType.getCrackedSilverPillar() != null) {
                addDrop(stoneType.getCrackedSilverPillar());
                addDrop(stoneType.getCrackedSilverPillarSlab(), slabDrops(stoneType.getCrackedSilverPillarSlab()));
            }
            if (stoneType.getMossySilverPillar() != null) {
                addDrop(stoneType.getMossySilverPillar());
                addDrop(stoneType.getMossySilverPillarSlab(), slabDrops(stoneType.getMossySilverPillarSlab()));
            }
            if (stoneType.getCrackedMossySilverPillar() != null) {
                addDrop(stoneType.getCrackedMossySilverPillar());
                addDrop(stoneType.getCrackedMossySilverPillarSlab(), slabDrops(stoneType.getCrackedMossySilverPillarSlab()));
            }
            if (stoneType.getOvergrownSilverPillar() != null) {
                addDrop(stoneType.getOvergrownSilverPillar());
                addDrop(stoneType.getOvergrownSilverPillarSlab(), slabDrops(stoneType.getOvergrownSilverPillarSlab()));
            }
            if (stoneType.getCrackedOvergrownSilverPillar() != null) {
                addDrop(stoneType.getCrackedOvergrownSilverPillar());
                addDrop(stoneType.getCrackedOvergrownSilverPillarSlab(), slabDrops(stoneType.getCrackedOvergrownSilverPillarSlab()));
            }
            if (stoneType.getGoldPillar() != null) {
                addDrop(stoneType.getGoldPillar());
                addDrop(stoneType.getGoldPillarSlab(), slabDrops(stoneType.getGoldPillarSlab()));
            }
            if (stoneType.getCrackedGoldPillar() != null) {
                addDrop(stoneType.getCrackedGoldPillar());
                addDrop(stoneType.getCrackedGoldPillarSlab(), slabDrops(stoneType.getCrackedGoldPillarSlab()));
            }
            if (stoneType.getMossyGoldPillar() != null) {
                addDrop(stoneType.getMossyGoldPillar());
                addDrop(stoneType.getMossyGoldPillarSlab(), slabDrops(stoneType.getMossyGoldPillarSlab()));
            }
            if (stoneType.getCrackedMossyGoldPillar() != null) {
                addDrop(stoneType.getCrackedMossyGoldPillar());
                addDrop(stoneType.getCrackedMossyGoldPillarSlab(), slabDrops(stoneType.getCrackedMossyGoldPillarSlab()));
            }
            if (stoneType.getOvergrownGoldPillar() != null) {
                addDrop(stoneType.getOvergrownGoldPillar());
                addDrop(stoneType.getOvergrownGoldPillarSlab(), slabDrops(stoneType.getOvergrownGoldPillarSlab()));
            }
            if (stoneType.getCrackedOvergrownGoldPillar() != null) {
                addDrop(stoneType.getCrackedOvergrownGoldPillar());
                addDrop(stoneType.getCrackedOvergrownGoldPillarSlab(), slabDrops(stoneType.getCrackedOvergrownGoldPillarSlab()));
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
