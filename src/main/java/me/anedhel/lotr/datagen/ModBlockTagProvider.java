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
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

/**
 * This class is used to add custom BlockTags and edit existing ones.
 */
public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

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

            configureStoneBlockFamilyTags(stoneType.getStoneFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCobbledFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyCobbledFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownCobbledFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCobbledBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyCobbledBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownCobbledBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getGoldBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedGoldBrickFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getGoldTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedGoldTilesFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedPavementFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getMossyFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedMossyFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getOvergrownFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedOvergrownFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getGoldFancyBricksFamily(), pickaxeTag, wallTag);
            configureStoneBlockFamilyTags(stoneType.getCrackedGoldFancyBricksFamily(), pickaxeTag, wallTag);

            if (stoneType.getSmooth() != null) {
                pickaxeTag.add(stoneType.getSmooth());
                pickaxeTag.add(stoneType.getSmoothSlab());
            }
            if (stoneType.getCrackedSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedSmooth());
                pickaxeTag.add(stoneType.getCrackedSmoothSlab());
            }
            if (stoneType.getPillar() != null) {
                pickaxeTag.add(stoneType.getPillar());
                pickaxeTag.add(stoneType.getPillarSlab());
            }
            if (stoneType.getCrackedPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedPillar());
                pickaxeTag.add(stoneType.getCrackedPillarSlab());
            }
            if (stoneType.getMossyPillar() != null) {
                pickaxeTag.add(stoneType.getMossyPillar());
                pickaxeTag.add(stoneType.getMossyPillarSlab());
            }
            if (stoneType.getCrackedMossyPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedMossyPillar());
                pickaxeTag.add(stoneType.getCrackedMossyPillarSlab());
            }
            if (stoneType.getOvergrownPillar() != null) {
                pickaxeTag.add(stoneType.getOvergrownPillar());
                pickaxeTag.add(stoneType.getOvergrownPillarSlab());
            }
            if (stoneType.getCrackedOvergrownPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedOvergrownPillar());
                pickaxeTag.add(stoneType.getCrackedOvergrownPillarSlab());
            }
            if (stoneType.getGoldPillar() != null) {
                pickaxeTag.add(stoneType.getGoldPillar());
                pickaxeTag.add(stoneType.getGoldPillarSlab());
            }
            if (stoneType.getCrackedGoldPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedGoldPillar());
                pickaxeTag.add(stoneType.getCrackedGoldPillarSlab());
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
     * Configures the tags for the goven blockFamily
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
