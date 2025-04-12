package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModOreType;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.block.ModWoodType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

/**
 * This class is used to add custom BlockTags and edit existing ones.
 */
public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public static final TagKey<Block> PILLARS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c",
            "pillars"));

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    /**
     * This Method is used to configure existing BlockTags and add new ones.
     * @param arg This argument is provided by minecraft
     */
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        configureModStoneType();
        configureModWoodTypes();
        configureModOreTypes();

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.BRONZE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.BRONZE_BLOCK);
    }

    /**
     * This Method configures all required tags for all ModStoneTypes.
     */
    private void configureModStoneType() {
        for (ModStoneType stoneType : ModStoneType.values()) {
            FabricTagBuilder pickaxeTag = getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);
            FabricTagBuilder wallTag = getOrCreateTagBuilder(BlockTags.WALLS);
            FabricTagBuilder pillarTag = getOrCreateTagBuilder(PILLARS);

            configureStoneBlockFamilyTags(stoneType.getStoneFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyStoneFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownStoneFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCobbledFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyCobbledFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownCobbledFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCobbledBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyCobbledBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownCobbledBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedCobbledBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyCobbledBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownCobbledBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getBronzeBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedBronzeBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyBronzeBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyBronzeBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownBronzeBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownBronzeBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getSilverBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedSilverBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossySilverBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossySilverBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownSilverBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownSilverBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getGoldBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedGoldBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyGoldBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyGoldBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownGoldBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownGoldBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getBronzeTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedBronzeTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyBronzeTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyBronzeTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownBronzeTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownBronzeTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getSilverTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedSilverTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossySilverTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossySilverTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownSilverTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownSilverTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getGoldTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedGoldTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyGoldTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyGoldTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownGoldTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownGoldTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getBronzePavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedBronzePavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyBronzePavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyBronzePavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownBronzePavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownBronzePavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getSilverPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedSilverPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossySilverPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossySilverPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownSilverPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownSilverPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getGoldPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedGoldPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyGoldPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyGoldPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownGoldPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownGoldPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getBronzeFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedBronzeFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyBronzeFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyBronzeFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownBronzeFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownBronzeFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getSilverFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedSilverFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossySilverFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossySilverFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownSilverFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownSilverFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getGoldFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedGoldFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyGoldFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyGoldFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownGoldFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownGoldFancyBricksFamily(), pickaxeTag, wallTag);

            if (stoneType.getSmooth() != null) {
                pickaxeTag.add(stoneType.getSmooth());
                pickaxeTag.add(stoneType.getSmoothSlab());
            }
            if (stoneType.getCrackedSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedSmooth());
                pickaxeTag.add(stoneType.getCrackedSmoothSlab());
            }
            if (stoneType.getMossySmooth() != null) {
                pickaxeTag.add(stoneType.getMossySmooth());
                pickaxeTag.add(stoneType.getMossySmoothSlab());
            }
            if (stoneType.getCrackedMossySmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedMossySmooth());
                pickaxeTag.add(stoneType.getCrackedMossySmoothSlab());
            }
            if (stoneType.getOvergrownSmooth() != null) {
                pickaxeTag.add(stoneType.getOvergrownSmooth());
                pickaxeTag.add(stoneType.getOvergrownSmoothSlab());
            }
            if (stoneType.getCrackedOvergrownSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedOvergrownSmooth());
                pickaxeTag.add(stoneType.getCrackedOvergrownSmoothSlab());
            }
            if (stoneType.getBronzeSmooth() != null) {
                pickaxeTag.add(stoneType.getBronzeSmooth());
                pickaxeTag.add(stoneType.getBronzeSmoothSlab());
            }
            if (stoneType.getCrackedBronzeSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedBronzeSmooth());
                pickaxeTag.add(stoneType.getCrackedBronzeSmoothSlab());
            }
            if (stoneType.getMossyBronzeSmooth() != null) {
                pickaxeTag.add(stoneType.getMossyBronzeSmooth());
                pickaxeTag.add(stoneType.getMossyBronzeSmoothSlab());
            }
            if (stoneType.getCrackedMossyBronzeSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedMossyBronzeSmooth());
                pickaxeTag.add(stoneType.getCrackedMossyBronzeSmoothSlab());
            }
            if (stoneType.getOvergrownBronzeSmooth() != null) {
                pickaxeTag.add(stoneType.getOvergrownBronzeSmooth());
                pickaxeTag.add(stoneType.getOvergrownBronzeSmoothSlab());
            }
            if (stoneType.getCrackedOvergrownBronzeSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedOvergrownBronzeSmooth());
                pickaxeTag.add(stoneType.getCrackedOvergrownBronzeSmoothSlab());
            }
            if (stoneType.getSilverSmooth() != null) {
                pickaxeTag.add(stoneType.getSilverSmooth());
                pickaxeTag.add(stoneType.getSilverSmoothSlab());
            }
            if (stoneType.getCrackedSilverSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedSilverSmooth());
                pickaxeTag.add(stoneType.getCrackedSilverSmoothSlab());
            }
            if (stoneType.getMossySilverSmooth() != null) {
                pickaxeTag.add(stoneType.getMossySilverSmooth());
                pickaxeTag.add(stoneType.getMossySilverSmoothSlab());
            }
            if (stoneType.getCrackedMossySilverSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedMossySilverSmooth());
                pickaxeTag.add(stoneType.getCrackedMossySilverSmoothSlab());
            }
            if (stoneType.getOvergrownSilverSmooth() != null) {
                pickaxeTag.add(stoneType.getOvergrownSilverSmooth());
                pickaxeTag.add(stoneType.getOvergrownSilverSmoothSlab());
            }
            if (stoneType.getCrackedOvergrownSilverSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedOvergrownSilverSmooth());
                pickaxeTag.add(stoneType.getCrackedOvergrownSilverSmoothSlab());
            }
            if (stoneType.getGoldSmooth() != null) {
                pickaxeTag.add(stoneType.getGoldSmooth());
                pickaxeTag.add(stoneType.getGoldSmoothSlab());
            }
            if (stoneType.getCrackedGoldSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedGoldSmooth());
                pickaxeTag.add(stoneType.getCrackedGoldSmoothSlab());
            }
            if (stoneType.getMossyGoldSmooth() != null) {
                pickaxeTag.add(stoneType.getMossyGoldSmooth());
                pickaxeTag.add(stoneType.getMossyGoldSmoothSlab());
            }
            if (stoneType.getCrackedMossyGoldSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedMossyGoldSmooth());
                pickaxeTag.add(stoneType.getCrackedMossyGoldSmoothSlab());
            }
            if (stoneType.getOvergrownGoldSmooth() != null) {
                pickaxeTag.add(stoneType.getOvergrownGoldSmooth());
                pickaxeTag.add(stoneType.getOvergrownGoldSmoothSlab());
            }
            if (stoneType.getCrackedOvergrownGoldSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedOvergrownGoldSmooth());
                pickaxeTag.add(stoneType.getCrackedOvergrownGoldSmoothSlab());
            }
            if (stoneType.getPillar() != null) {
                pickaxeTag.add(stoneType.getPillar());
                pickaxeTag.add(stoneType.getPillarSlab());
                pillarTag.add(stoneType.getPillar());

            }
            if (stoneType.getCrackedPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedPillar());
                pickaxeTag.add(stoneType.getCrackedPillarSlab());
                pillarTag.add(stoneType.getCrackedPillar());
            }
            if (stoneType.getMossyPillar() != null) {
                pickaxeTag.add(stoneType.getMossyPillar());
                pickaxeTag.add(stoneType.getMossyPillarSlab());
                pillarTag.add(stoneType.getMossyPillar());
            }
            if (stoneType.getCrackedMossyPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedMossyPillar());
                pickaxeTag.add(stoneType.getCrackedMossyPillarSlab());
                pillarTag.add(stoneType.getCrackedMossyPillar());
            }
            if (stoneType.getOvergrownPillar() != null) {
                pickaxeTag.add(stoneType.getOvergrownPillar());
                pickaxeTag.add(stoneType.getOvergrownPillarSlab());
                pillarTag.add(stoneType.getOvergrownPillar());
            }
            if (stoneType.getCrackedOvergrownPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedOvergrownPillar());
                pickaxeTag.add(stoneType.getCrackedOvergrownPillarSlab());
                pillarTag.add(stoneType.getCrackedOvergrownPillar());
            }
            if (stoneType.getBronzePillar() != null) {
                pickaxeTag.add(stoneType.getBronzePillar());
                pickaxeTag.add(stoneType.getBronzePillarSlab());
                pillarTag.add(stoneType.getBronzePillar());
            }
            if (stoneType.getCrackedBronzePillar() != null) {
                pickaxeTag.add(stoneType.getCrackedBronzePillar());
                pickaxeTag.add(stoneType.getCrackedBronzePillarSlab());
                pillarTag.add(stoneType.getCrackedBronzePillar());
            }
            if (stoneType.getMossyBronzePillar() != null) {
                pickaxeTag.add(stoneType.getMossyBronzePillar());
                pickaxeTag.add(stoneType.getBronzePillarSlab());
                pillarTag.add(stoneType.getMossyBronzePillar());
            }
            if (stoneType.getCrackedMossyBronzePillar() != null) {
                pickaxeTag.add(stoneType.getCrackedMossyBronzePillar());
                pickaxeTag.add(stoneType.getCrackedMossyBronzePillarSlab());
                pillarTag.add(stoneType.getCrackedMossyBronzePillar());
            }
            if (stoneType.getOvergrownBronzePillar() != null) {
                pickaxeTag.add(stoneType.getOvergrownBronzePillar());
                pickaxeTag.add(stoneType.getOvergrownBronzePillarSlab());
                pillarTag.add(stoneType.getOvergrownBronzePillar());
            }
            if (stoneType.getCrackedOvergrownBronzePillar() != null) {
                pickaxeTag.add(stoneType.getCrackedOvergrownBronzePillar());
                pickaxeTag.add(stoneType.getCrackedOvergrownBronzePillarSlab());
                pillarTag.add(stoneType.getCrackedOvergrownBronzePillar());
            }
            if (stoneType.getSilverPillar() != null) {
                pickaxeTag.add(stoneType.getSilverPillar());
                pickaxeTag.add(stoneType.getSilverPillarSlab());
                pillarTag.add(stoneType.getSilverPillar());
            }
            if (stoneType.getCrackedSilverPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedSilverPillar());
                pickaxeTag.add(stoneType.getCrackedSilverPillarSlab());
                pillarTag.add(stoneType.getCrackedSilverPillar());
            }
            if (stoneType.getMossySilverPillar() != null) {
                pickaxeTag.add(stoneType.getMossySilverPillar());
                pickaxeTag.add(stoneType.getSilverPillarSlab());
                pillarTag.add(stoneType.getMossySilverPillar());
            }
            if (stoneType.getCrackedMossySilverPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedMossySilverPillar());
                pickaxeTag.add(stoneType.getCrackedMossySilverPillarSlab());
                pillarTag.add(stoneType.getCrackedMossySilverPillar());
            }
            if (stoneType.getOvergrownSilverPillar() != null) {
                pickaxeTag.add(stoneType.getOvergrownSilverPillar());
                pickaxeTag.add(stoneType.getOvergrownSilverPillarSlab());
                pillarTag.add(stoneType.getOvergrownSilverPillar());
            }
            if (stoneType.getCrackedOvergrownSilverPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedOvergrownSilverPillar());
                pickaxeTag.add(stoneType.getCrackedOvergrownSilverPillarSlab());
                pillarTag.add(stoneType.getCrackedOvergrownSilverPillar());
            }
            if (stoneType.getGoldPillar() != null) {
                pickaxeTag.add(stoneType.getGoldPillar());
                pickaxeTag.add(stoneType.getGoldPillarSlab());
                pillarTag.add(stoneType.getGoldPillar());
            }
            if (stoneType.getCrackedGoldPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedGoldPillar());
                pickaxeTag.add(stoneType.getCrackedGoldPillarSlab());
                pillarTag.add(stoneType.getCrackedGoldPillar());
            }
            if (stoneType.getMossyGoldPillar() != null) {
                pickaxeTag.add(stoneType.getMossyGoldPillar());
                pickaxeTag.add(stoneType.getGoldPillarSlab());
                pillarTag.add(stoneType.getMossyGoldPillar());
            }
            if (stoneType.getCrackedMossyGoldPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedMossyGoldPillar());
                pickaxeTag.add(stoneType.getCrackedMossyGoldPillarSlab());
                pillarTag.add(stoneType.getCrackedMossyGoldPillar());
            }
            if (stoneType.getOvergrownGoldPillar() != null) {
                pickaxeTag.add(stoneType.getOvergrownGoldPillar());
                pickaxeTag.add(stoneType.getOvergrownGoldPillarSlab());
                pillarTag.add(stoneType.getOvergrownGoldPillar());
            }
            if (stoneType.getCrackedOvergrownGoldPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedOvergrownGoldPillar());
                pickaxeTag.add(stoneType.getCrackedOvergrownGoldPillarSlab());
                pillarTag.add(stoneType.getCrackedOvergrownGoldPillar());
            }
        }
    }

    /**
     * This Method configures all required tags for all ModWoodTypes.
     */
    private void configureModWoodTypes() {
        FabricTagBuilder axeTag = getOrCreateTagBuilder(BlockTags.AXE_MINEABLE);
        FabricTagBuilder logsThatBurnTag = getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN);
        FabricTagBuilder fenceTag = getOrCreateTagBuilder(BlockTags.FENCES);
        FabricTagBuilder fenceGateTag = getOrCreateTagBuilder(BlockTags.FENCE_GATES);

        for (ModWoodType value : ModWoodType.values()) {
            if (!value.isVanillaAddition()) {
                if (value.getLog() != null) {
                    logsThatBurnTag.add(value.getLog());
                }
            }
            if (value.getWood() != null) {
                logsThatBurnTag.add(value.getWood());
            }
            if (value.getWoodStairs() != null) {
                axeTag.add(value.getWoodStairs());
            }
            if (value.getWoodSlab() != null) {
                axeTag.add(value.getWoodSlab());
            }
            if (value.getWoodButton() != null) {
                axeTag.add(value.getWoodButton());
            }
            if (value.getWoodPressurePlate() != null) {
                axeTag.add(value.getWoodPressurePlate());
            }
            if (value.getWoodDoor() != null) {
                axeTag.add(value.getWoodDoor());
            }
            if (value.getWoodTrapdoor() != null) {
                axeTag.add(value.getWoodTrapdoor());
            }
            if (value.getStrippedLog() != null) {
                logsThatBurnTag.add(value.getStrippedLog());
            }
            if (value.getStrippedWood() != null) {
                logsThatBurnTag.add(value.getStrippedWood());
            }
            if (value.getStrippedWoodStairs() != null) {
                axeTag.add(value.getStrippedWoodStairs());
            }
            if (value.getStrippedWoodSlab() != null) {
                axeTag.add(value.getStrippedWoodSlab());
            }
            if (value.getStrippedWoodButton() != null) {
                axeTag.add(value.getStrippedWoodButton());
            }
            if (value.getStrippedWoodPressurePlate() != null) {
                axeTag.add(value.getStrippedWoodPressurePlate());
            }
            if (value.getStrippedWoodDoor() != null) {
                axeTag.add(value.getStrippedWoodDoor());
            }
            if (value.getStrippedWoodTrapdoor() != null) {
                axeTag.add(value.getStrippedWoodTrapdoor());
            }
            if (value.getPlanks() != null) {
                axeTag.add(value.getPlanks());
            }
            if (value.getPlanksStairs() != null) {
                axeTag.add(value.getPlanksStairs());
            }
            if (value.getPlanksSlab() != null) {
                axeTag.add(value.getPlanksSlab());
            }
            if (value.getPlanksButton() != null) {
                axeTag.add(value.getPlanksButton());
            }
            if (value.getPlanksPressurePlate() != null) {
                axeTag.add(value.getPlanksPressurePlate());
            }
            if (value.getPlanksDoor() != null) {
                axeTag.add(value.getPlanksDoor());
            }
            if (value.getPlanksTrapdoor() != null) {
                axeTag.add(value.getPlanksTrapdoor());
            }
            if (value.getPlanksFence() != null) {
                axeTag.add(value.getPlanksFence());
                fenceTag.add(value.getPlanksFence());
            }
            if (value.getPlanksFenceGate() != null) {
                axeTag.add(value.getPlanksFenceGate());
                fenceGateTag.add(value.getPlanksFenceGate());
            }
        }
    }

    /**
     * This Method configures all required tags for all ModOreTypes.
     */
    private void configureModOreTypes() {
        for (ModOreType oreType : ModOreType.values()) {
            FabricTagBuilder pickaxeTag = getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);
            FabricTagBuilder toolLevelTag;
            switch (oreType.getMiningLevel()) {
                case MiningLevels.STONE -> toolLevelTag = getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);
                case MiningLevels.IRON -> toolLevelTag = getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);
                case MiningLevels.DIAMOND -> toolLevelTag = getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);
                default -> toolLevelTag = null;
            }

            if (!oreType.isVanillaAddition()) {
                if (oreType.getStoneOre() != null) {
                    pickaxeTag.add(oreType.getStoneOre());
                    if (toolLevelTag != null) {
                        toolLevelTag.add(oreType.getStoneOre());
                    }
                }
                if (oreType.getDeepslateOre() != null) {
                    pickaxeTag.add(oreType.getDeepslateOre());
                    if (toolLevelTag != null) {
                        toolLevelTag.add(oreType.getDeepslateOre());
                    }
                }
            }
            if (oreType.getAndesiteOre() != null) {
                pickaxeTag.add(oreType.getAndesiteOre());
                if (toolLevelTag != null) {
                    toolLevelTag.add(oreType.getAndesiteOre());
                }
            }
            if (oreType.getDioriteOre() != null) {
                pickaxeTag.add(oreType.getDioriteOre());
                if (toolLevelTag != null) {
                    toolLevelTag.add(oreType.getDioriteOre());
                }
            }
            if (oreType.getGraniteOre() != null) {
                pickaxeTag.add(oreType.getGraniteOre());
                if (toolLevelTag != null) {
                    toolLevelTag.add(oreType.getGraniteOre());
                }
            }

            if (oreType.getBlueslateOre() != null) {
                pickaxeTag.add(oreType.getBlueslateOre());
                if (toolLevelTag != null) {
                    toolLevelTag.add(oreType.getBlueslateOre());
                }
            }
            if (oreType.getChalkOre() != null) {
                pickaxeTag.add(oreType.getChalkOre());
                if (toolLevelTag != null) {
                    toolLevelTag.add(oreType.getChalkOre());
                }
            }
        }
    }

    /**
     * Configures the tags for the given blockFamily
     * @param family the blockFamily for which the tags should be configured
     * @param pickaxeTag the pickaxe tag for all blocks
     * @param wallTag the wall tag for the wall block
     */
    private void configureStoneBlockFamilyTags(@NotNull BlockFamily family, @NotNull FabricTagBuilder pickaxeTag,
            @NotNull FabricTagBuilder wallTag) {
        pickaxeTag.add(family.getBaseBlock());
        for(Block block : family.getVariants().values()) {
            pickaxeTag.add(block);
            if(block instanceof WallBlock) {
                wallTag.add(block);
            }
        }
    }
}
