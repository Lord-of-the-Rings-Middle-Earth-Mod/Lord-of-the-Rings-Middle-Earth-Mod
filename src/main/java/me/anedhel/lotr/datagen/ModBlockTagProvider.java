package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.block.ModWoodType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
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

        configureModWoodTypes();

        configureModStoneType(ModStoneType.ANDESITE);
        configureModStoneType(ModStoneType.POLISHED_ANDESITE);
        configureModStoneType(ModStoneType.COBBLED_ANDESITE);
        configureModStoneType(ModStoneType.ANDESITE_BRICK);

        configureModStoneType(ModStoneType.DIORITE);
        configureModStoneType(ModStoneType.POLISHED_DIORITE);
        configureModStoneType(ModStoneType.COBBLED_DIORITE);
        configureModStoneType(ModStoneType.DIORITE_BRICK);

        configureModStoneType(ModStoneType.GRANITE);
        configureModStoneType(ModStoneType.POLISHED_GRANITE);
        configureModStoneType(ModStoneType.COBBLED_GRANITE);
        configureModStoneType(ModStoneType.GRANITE_BRICK);

        configureModStoneType(ModStoneType.SMOOTH_BASALT);
        configureModStoneType(ModStoneType.BASALT_BRICKS);

        configureModStoneType(ModStoneType.BLUESLATE);
        configureModStoneType(ModStoneType.COBBLED_BLUESLATE);
        configureModStoneType(ModStoneType.BLUESLATE_BRICK);

        configureModStoneType(ModStoneType.CHALK);
        configureModStoneType(ModStoneType.COBBLED_CHALK);
        configureModStoneType(ModStoneType.CHALK_BRICK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.BRONZE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.BRONZE_BLOCK);
    }

    /**
     * This Method configures all required tags for the given ModStoneType.
     * @param stoneType The type, that all tags should be configured for
     */
    private void configureModStoneType(ModStoneType stoneType) {
        Block baseBlock = stoneType.getBaseBlock();
        Block stairBlock = stoneType.getStairBlock();
        Block slabBlock = stoneType.getSlabBlock();
        Block wallBlock = stoneType.getWallBlock();
        Block buttonBlock = stoneType.getButtonBlock();
        Block pressurePlateBlock = stoneType.getPressurePlateBlock();

        FabricTagBuilder pickaxeTag = getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);
        FabricTagBuilder wallTag = getOrCreateTagBuilder(BlockTags.WALLS);

        if (!stoneType.isVanillaAddition()) {
            if (baseBlock != null) {
                pickaxeTag.add(baseBlock);
            }
        }
        if (stairBlock != null) {
            pickaxeTag.add(stairBlock);
        }
        if (slabBlock != null) {
            pickaxeTag.add(slabBlock);
        }
        if (wallBlock != null) {
            pickaxeTag.add(wallBlock);
            wallTag.add(wallBlock);
        }
        if (buttonBlock != null) {
            pickaxeTag.add(buttonBlock);
        }
        if (pressurePlateBlock != null) {
            pickaxeTag.add(pressurePlateBlock);
        }
    }

    /**
     * This Method configures all required tags for the given ModWoodType.
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
}
