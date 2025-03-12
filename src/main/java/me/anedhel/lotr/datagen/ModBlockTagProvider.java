package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModOreType;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.block.ModWoodType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

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

            if (!stoneType.isVanillaAddition()) {
                if (stoneType.getStone() != null) {
                    pickaxeTag.add(stoneType.getStone());
                }
            }
            if (stoneType.getStoneStairs() != null) {
                pickaxeTag.add(stoneType.getStoneStairs());
            }
            if (stoneType.getStoneSlab() != null) {
                pickaxeTag.add(stoneType.getStoneSlab());
            }
            if (stoneType.getStoneWall() != null) {
                pickaxeTag.add(stoneType.getStoneWall());
                wallTag.add(stoneType.getStoneWall());
            }
            if (stoneType.getStoneButton() != null) {
                pickaxeTag.add(stoneType.getStoneButton());
            }
            if (stoneType.getStonePressurePlate() != null) {
                pickaxeTag.add(stoneType.getStonePressurePlate());
            }
            if (stoneType.getCobbled() != null) {
                pickaxeTag.add(stoneType.getCobbled());
                pickaxeTag.add(stoneType.getCobbledStairs());
                pickaxeTag.add(stoneType.getCobbledSlab());
                pickaxeTag.add(stoneType.getCobbledWall());
                wallTag.add(stoneType.getCobbledWall());
                pickaxeTag.add(stoneType.getCobbledButton());
                pickaxeTag.add(stoneType.getCobbledPressurePlate());
            }
            if (stoneType.getMossyCobbled() != null) {
                pickaxeTag.add(stoneType.getMossyCobbled());
                pickaxeTag.add(stoneType.getMossyCobbledStairs());
                pickaxeTag.add(stoneType.getMossyCobbledSlab());
                pickaxeTag.add(stoneType.getMossyCobbledWall());
                wallTag.add(stoneType.getMossyCobbledWall());
                pickaxeTag.add(stoneType.getMossyCobbledButton());
                pickaxeTag.add(stoneType.getMossyCobbledPressurePlate());
            }
            if (stoneType.getSmooth() != null) {
                pickaxeTag.add(stoneType.getSmooth());
                pickaxeTag.add(stoneType.getSmoothSlab());
            }
            if (stoneType.getCrackedSmooth() != null) {
                pickaxeTag.add(stoneType.getCrackedSmooth());
                pickaxeTag.add(stoneType.getCrackedSmoothSlab());
            }
            if (stoneType.getBrick() != null) {
                pickaxeTag.add(stoneType.getBrick());
                pickaxeTag.add(stoneType.getBrickStairs());
                pickaxeTag.add(stoneType.getBrickSlab());
                pickaxeTag.add(stoneType.getBrickWall());
                wallTag.add(stoneType.getBrickWall());
                pickaxeTag.add(stoneType.getChiseledBrick());
            }
            if (stoneType.getCrackedBrick() != null) {
                pickaxeTag.add(stoneType.getCrackedBrick());
                pickaxeTag.add(stoneType.getCrackedBrickStairs());
                pickaxeTag.add(stoneType.getCrackedBrickSlab());
                pickaxeTag.add(stoneType.getCrackedBrickWall());
                wallTag.add(stoneType.getCrackedBrickWall());
            }
            if (stoneType.getTiles() != null) {
                pickaxeTag.add(stoneType.getTiles());
                pickaxeTag.add(stoneType.getTilesStairs());
                pickaxeTag.add(stoneType.getTilesSlab());
                pickaxeTag.add(stoneType.getTilesWall());
                wallTag.add(stoneType.getTilesWall());
            }
            if (stoneType.getCrackedTiles() != null) {
                pickaxeTag.add(stoneType.getCrackedTiles());
                pickaxeTag.add(stoneType.getCrackedTilesStairs());
                pickaxeTag.add(stoneType.getCrackedTilesSlab());
                pickaxeTag.add(stoneType.getCrackedTilesWall());
                wallTag.add(stoneType.getCrackedTilesWall());
            }
            if (stoneType.getCobbledBrick() != null) {
                pickaxeTag.add(stoneType.getCobbledBrick());
                pickaxeTag.add(stoneType.getCobbledBrickStairs());
                pickaxeTag.add(stoneType.getCobbledBrickSlab());
                pickaxeTag.add(stoneType.getCobbledBrickWall());
                wallTag.add(stoneType.getCobbledBrickWall());
            }
            if (stoneType.getPillar() != null) {
                pickaxeTag.add(stoneType.getPillar());
                pickaxeTag.add(stoneType.getPillarSlab());
            }
            if (stoneType.getCrackedPillar() != null) {
                pickaxeTag.add(stoneType.getCrackedPillar());
                pickaxeTag.add(stoneType.getCrackedPillarSlab());
            }
            if (stoneType.getPavement() != null) {
                pickaxeTag.add(stoneType.getPavement());
                pickaxeTag.add(stoneType.getPavementStairs());
                pickaxeTag.add(stoneType.getPavementSlab());
            }
            if (stoneType.getCrackedPavement() != null) {
                pickaxeTag.add(stoneType.getCrackedPavement());
                pickaxeTag.add(stoneType.getCrackedPavementStairs());
                pickaxeTag.add(stoneType.getCrackedPavementSlab());
            }
            if (stoneType.getFancyBricks() != null) {
                pickaxeTag.add(stoneType.getFancyBricks());
                pickaxeTag.add(stoneType.getFancyBricksStairs());
                pickaxeTag.add(stoneType.getFancyBricksSlab());
                pickaxeTag.add(stoneType.getFancyBricksWall());
                wallTag.add(stoneType.getFancyBricksWall());
            }
            if (stoneType.getCrackedFancyBricks() != null) {
                pickaxeTag.add(stoneType.getCrackedFancyBricks());
                pickaxeTag.add(stoneType.getCrackedFancyBricksStairs());
                pickaxeTag.add(stoneType.getCrackedFancyBricksSlab());
                pickaxeTag.add(stoneType.getCrackedFancyBricksWall());
                wallTag.add(stoneType.getCrackedFancyBricksWall());
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
}
