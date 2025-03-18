package me.anedhel.lotr.datagen;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModOreType;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.block.custom.ModPillarBlock;
import me.anedhel.lotr.block.custom.ModPillarType;
import me.anedhel.lotr.block.custom.crops.CornCropBlock;
import me.anedhel.lotr.block.custom.crops.LettuceCropBlock;
import me.anedhel.lotr.block.custom.crops.TomatoCropBlock;
import me.anedhel.lotr.datagen.util.ModModelType;
import me.anedhel.lotr.datagen.util.ModModels;
import me.anedhel.lotr.item.ModGearType;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.Optional;

/**
 * This class is used to generate all models the mod provides.
 */
public class ModModelProvider extends FabricModelProvider {



    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * This Method is used to generate all BlockStateModels
     * @param blockStateModelGenerator a BlockStateModelGenerator provided by minecraft
     */
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_BLOCK);

        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.LETTUCE_CROP, LettuceCropBlock.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.CORN_CROP, CornCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_BEETROOT, ModBlocks.POTTED_WILD_BEETROOT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_CARROT, ModBlocks.POTTED_WILD_CARROT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_POTATO, ModBlocks.POTTED_WILD_POTATO, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_LETTUCE, ModBlocks.POTTED_WILD_LETTUCE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_TOMATO, ModBlocks.POTTED_WILD_TOMATO, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.WILD_CORN, BlockStateModelGenerator.TintType.NOT_TINTED);

        generateModStoneTypeModels(blockStateModelGenerator);
        generateModWoodTypesBlockModels(blockStateModelGenerator);
        generateModOreTypeModels(blockStateModelGenerator);
    }

    /**
     * This Method is used to generate all ItemModels
     * @param itemModelGenerator an ItemModelGenerator provided by minecraft
     */
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAKED_TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_CORN, Models.GENERATED);

        itemModelGenerator.register(ModItems.HANGING_PINE_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.HOBBIT_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

        generateModGearTypeModels(ModGearType.BRONZE, itemModelGenerator);

        generateModWoodTypesItemModels(itemModelGenerator);
    }

    /**
     * This Method is used to generate all the Models for the given GearType
     * @param gearType The ModGearType the models should be generated for.
     * @param itemModelGenerator an ItemModelGenerator provided by minecraft
     */
    private void generateModGearTypeModels(ModGearType gearType, ItemModelGenerator itemModelGenerator) {
        Item helmet = gearType.getHelmet();
        Item chestplate = gearType.getChestplate();
        Item leggings = gearType.getLeggings();
        Item boots = gearType.getBoots();
        Item sword = gearType.getSword();
        Item axe = gearType.getAxe();
        Item pickaxe = gearType.getPickaxe();
        Item shovel = gearType.getShovel();
        Item hoe = gearType.getHoe();

        if (helmet != null) {
            itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_HELMET);
        }
        if (chestplate != null) {
            itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_CHESTPLATE);
        }
        if (leggings != null) {
            itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_LEGGINGS);
        }
        if (boots != null) {
            itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_BOOTS);
        }
        if (sword != null) {
            itemModelGenerator.register(ModItems.BRONZE_SWORD, Models.HANDHELD);
        }
        if (axe != null) {
            itemModelGenerator.register(ModItems.BRONZE_AXE, Models.HANDHELD);
        }
        if (pickaxe != null) {
            itemModelGenerator.register(ModItems.BRONZE_PICKAXE, Models.HANDHELD);
        }
        if (shovel != null) {
            itemModelGenerator.register(ModItems.BRONZE_SHOVEL, Models.HANDHELD);
        }
        if (hoe != null) {
            itemModelGenerator.register(ModItems.BRONZE_HOE, Models.HANDHELD);
        }
    }

    /**
     * This Method is used to generate all the models for the given stone type.
     * It only works for blocks completely added by the mod, adding Models for additions made based on vanilla blocks does not work with this method.
     * @param blockStateModelGenerator a BlockStateModelGenerator provided by minecraft
     */
    private void generateModStoneTypeModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (ModStoneType stoneType : ModStoneType.values()) {
            BlockStateModelGenerator.BlockTexturePool stonePool =
                    blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getStoneVariant("base"));
            stonePool.family(stoneType.getStoneFamily());

            BlockStateModelGenerator.BlockTexturePool cobbledPool =
                    blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getCobbledVariant("base"));
            cobbledPool.family(stoneType.getCobbledFamily());

            BlockStateModelGenerator.BlockTexturePool cobbledBricksPool =
                    blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getCobbledBrickVariant("base"));
            cobbledBricksPool.family(stoneType.getCobbledBrickFamily());

            BlockStateModelGenerator.BlockTexturePool bricksPool =
                    blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getBrickVariant("base"));
            bricksPool.family(stoneType.getBrickFamily());

            BlockStateModelGenerator.BlockTexturePool crackedBricksPool =
                    blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getCrackedBrickVariant("base"));
            crackedBricksPool.family(stoneType.getCrackedBrickFamily());

            BlockStateModelGenerator.BlockTexturePool tilesPool =
                    blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getTilesVariant("base"));
            tilesPool.family(stoneType.getTilesFamily());

            BlockStateModelGenerator.BlockTexturePool crackedTilesPool =
                    blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getCrackedTilesVariant("base"));
            crackedTilesPool.family(stoneType.getCrackedTilesFamily());

            BlockStateModelGenerator.BlockTexturePool fancyBricksPool =
                    blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getFancyBrickVariant("base"));
            fancyBricksPool.family(stoneType.getFancyBricksFamily());

            BlockStateModelGenerator.BlockTexturePool crackedFancyBricksPool =
                    blockStateModelGenerator.registerCubeAllModelTexturePool(
                            stoneType.getCrackedFancyBrickVariant("base"));
            crackedFancyBricksPool.family(stoneType.getCrackedFancyBricksFamily());

            if (stoneType.getSmooth() != null && stoneType.getSmoothSlab() != null) {
                registerSmoothStone(blockStateModelGenerator, stoneType.getSmooth(), stoneType.getSmoothSlab());
            }
            if (stoneType.getCrackedSmooth() != null && stoneType.getCrackedSmoothSlab() != null) {
                registerSmoothStone(blockStateModelGenerator, stoneType.getCrackedSmooth(), stoneType.getCrackedSmoothSlab());
            }

            if (stoneType.getCobbledVariant("base") != null) {
                if (stoneType.getMossyCobbledVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCobbledVariant("base"),
                            stoneType.getMossyCobbledFamily(), "mossy_overlay_one", ModModelType.CUBE_ALL);
                }
                if (stoneType.getOvergrownCobbledVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCobbledVariant("base"),
                            stoneType.getOvergrownCobbledFamily(), "overgrown_overlay", ModModelType.CUBE_ALL);
                }
            }

            if (stoneType.getCobbledBrickVariant("base") != null) {
                if (stoneType.getMossyCobbledBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCobbledBrickVariant("base"),
                            stoneType.getMossyCobbledBrickFamily(), "mossy_overlay_two", ModModelType.CUBE_ALL);
                }
                if (stoneType.getOvergrownCobbledBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCobbledBrickVariant("base"),
                            stoneType.getOvergrownCobbledBrickFamily(), "overgrown_overlay", ModModelType.CUBE_ALL);
                }
            }

            if (stoneType.getBrickVariant("base") != null) {
                if (stoneType.getMossyBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getBrickVariant("base"),
                            stoneType.getMossyBrickFamily(), "mossy_overlay_two", ModModelType.CUBE_ALL);
                }
                if (stoneType.getOvergrownBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getBrickVariant("base"),
                            stoneType.getOvergrownBrickFamily(), "overgrown_overlay", ModModelType.CUBE_ALL);
                }
                if (stoneType.getGoldOrnamentedBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getBrickVariant("base"),
                            stoneType.getGoldOrnamentedBrickFamily(), "gold_ornamented_brick_overlay", ModModelType.CUBE_ALL);
                }
            }

            if (stoneType.getCrackedBrickVariant("base") != null) {
                if (stoneType.getMossyBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedBrickVariant(
                            "base"), stoneType.getCrackedMossyBrickFamily(), "mossy_overlay_two", ModModelType.CUBE_ALL);
                }
                if (stoneType.getCrackedOvergrownBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedBrickVariant(
                            "base"), stoneType.getCrackedOvergrownBrickFamily(), "overgrown_overlay", ModModelType.CUBE_ALL);
                }
                if (stoneType.getCrackedGoldOrnamentedBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedBrickVariant(
                            "base"), stoneType.getCrackedGoldOrnamentedBrickFamily(),
                            "cracked_gold_ornamented_brick_overlay", ModModelType.CUBE_ALL);
                }
            }

            if(stoneType.getTilesVariant("base") != null) {
                if(stoneType.getMossyTilesVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getTilesVariant("base"),
                            stoneType.getMossyTilesFamily(), "mossy_overlay_two", ModModelType.CUBE_ALL);
                }
                if(stoneType.getOvergrownTilesVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getTilesVariant("base"),
                            stoneType.getOvergrownTilesFamily(), "overgrown_overlay", ModModelType.CUBE_ALL);
                }
                if(stoneType.getGoldOrnamentedTilesVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getTilesVariant("base"),
                            stoneType.getGoldOrnamentedTilesFamily(), "gold_ornamented_tiles_overlay", ModModelType.CUBE_ALL);
                }
            }

            if (stoneType.getCrackedTilesVariant("base") != null) {
                if (stoneType.getCrackedMossyTilesVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedTilesVariant(
                            "base"), stoneType.getCrackedMossyTilesFamily(), "mossy_overlay_two", ModModelType.CUBE_ALL);
                }
                if (stoneType.getCrackedOvergrownTilesVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedTilesVariant(
                            "base"), stoneType.getCrackedOvergrownTilesFamily(), "overgrown_overlay", ModModelType.CUBE_ALL);
                }
                if (stoneType.getCrackedGoldOrnamentedTilesVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedTilesVariant(
                            "base"), stoneType.getCrackedGoldOrnamentedTilesFamily(),
                            "cracked_gold_ornamented_tiles_overlay", ModModelType.CUBE_ALL);
                }
            }

            if (stoneType.getFancyBrickVariant("base") != null) {
                if(stoneType.getMossyFancyBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getFancyBrickVariant("base"),
                            stoneType.getMossyFancyBricksFamily(), "mossy_overlay_two", ModModelType.CUBE_ALL);
                }
                if(stoneType.getOvergrownFancyBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getFancyBrickVariant("base"),
                            stoneType.getOvergrownFancyBricksFamily(), "overgrown_overlay", ModModelType.CUBE_ALL);
                }
                if(stoneType.getGoldOrnamentedFancyBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getFancyBrickVariant("base"),
                            stoneType.getGoldOrnamentedFancyBricksFamily(), "gold_ornamented_fancy_bricks_overlay", ModModelType.CUBE_ALL);
                }
            }

            if(stoneType.getCrackedFancyBrickVariant("base") != null) {
                if(stoneType.getCrackedMossyFancyBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator,
                            stoneType.getCrackedFancyBrickVariant("base"), stoneType.getCrackedMossyFancyBricksFamily(),
                            "mossy_overlay_two", ModModelType.CUBE_ALL);
                }
                if(stoneType.getCrackedOvergrownFancyBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator,
                            stoneType.getCrackedFancyBrickVariant("base"),
                            stoneType.getCrackedOvergrownFancyBricksFamily(), "overgrown_overlay",
                            ModModelType.CUBE_ALL);
                }
                if(stoneType.getCrackedGoldOrnamentedFancyBrickVariant("base") != null) {
                    registerOneOverlayBlockFamilyModel(blockStateModelGenerator,
                            stoneType.getCrackedFancyBrickVariant("base"),
                            stoneType.getCrackedGoldOrnamentedFancyBricksFamily(),
                            "cracked_gold_ornamented_fancy_bricks_overlay", ModModelType.CUBE_ALL);
                }
            }

            if (stoneType.getPillar() != null && stoneType.getPillarSlab() != null) {
                String topTexture = stoneType.getPillar().getTranslationKey()
                        .substring(stoneType.getPillar().getTranslationKey().indexOf('.')+6).concat("_end");
                String sideTexture = stoneType.getPillar().getTranslationKey()
                        .substring(stoneType.getPillar().getTranslationKey().indexOf('.')+6).concat("_side");
                registerPillarBlock(blockStateModelGenerator, stoneType.getPillar(), stoneType.getPillarSlab(), topTexture, sideTexture);
            }
            if (stoneType.getCrackedPillar() != null) {
                String topTexture = stoneType.getCrackedPillar().getTranslationKey()
                        .substring(stoneType.getCrackedPillar().getTranslationKey().indexOf('.')+6).concat("_end");
                String sideTexture = stoneType.getCrackedPillar().getTranslationKey()
                        .substring(stoneType.getCrackedPillar().getTranslationKey().indexOf('.')+6).concat("_side");
                registerPillarBlock(blockStateModelGenerator, stoneType.getCrackedPillar(), stoneType.getCrackedPillarSlab(), topTexture, sideTexture);
            }
            if (stoneType.getPavementVariant("base") != null) {
                String topTexture = stoneType.getPavementVariant("base").getTranslationKey()
                        .substring(stoneType.getPavementVariant("base").getTranslationKey().indexOf('.')+6);
                String sideTexture = stoneType.getTilesVariant("base").getTranslationKey()
                        .substring(stoneType.getTilesVariant("base").getTranslationKey().indexOf('.')+6);
                registerPavement(blockStateModelGenerator, stoneType.getPavementFamily(), topTexture, sideTexture);
            }
            if (stoneType.getCrackedPavementVariant("base") != null) {
                String topTexture = stoneType.getCrackedPavementVariant("base").getTranslationKey()
                        .substring(stoneType.getCrackedPavementVariant("base").getTranslationKey().indexOf('.')+6);
                String sideTexture = stoneType.getCrackedTilesVariant("base").getTranslationKey()
                        .substring(stoneType.getCrackedTilesVariant("base").getTranslationKey().indexOf('.')+6);
                registerPavement(blockStateModelGenerator, stoneType.getCrackedPavementFamily(), topTexture, sideTexture);
            }
        }
    }

    /**
     * This Method is used to generate all the models for all woodTypes
     * It only works for blocks completely added by the mod, adding Models for additions made based on vanilla blocks does not work with this method.
     * @param blockStateModelGenerator a BlockStateModelGenerator provided by minecraft
     */
    private void generateModWoodTypesBlockModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (ModWoodType woodType : ModWoodType.values()) {
            if (!woodType.isVanillaAddition()) {
                blockStateModelGenerator.registerLog(woodType.getLog()).log(woodType.getLog());
                blockStateModelGenerator.registerLog(woodType.getStrippedLog()).log(woodType.getStrippedLog());

                BlockStateModelGenerator.BlockTexturePool woodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(woodType.getWoodFamily().getBaseBlock());
                woodPool.family(woodType.getWoodFamily());

                BlockStateModelGenerator.BlockTexturePool strippedWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(woodType.getStrippedWoodFamily().getBaseBlock());
                strippedWoodPool.family(woodType.getStrippedWoodFamily());

                BlockStateModelGenerator.BlockTexturePool planksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(woodType.getPlanksFamily().getBaseBlock());
                planksPool.family(woodType.getPlanksFamily());

                blockStateModelGenerator.registerSimpleCubeAll(woodType.getLeaves());
                blockStateModelGenerator.registerTintableCross(woodType.getSapling(), BlockStateModelGenerator.TintType.NOT_TINTED);
            }
        }
    }

    private void generateModWoodTypesItemModels(ItemModelGenerator itemModelGenerator) {
        for (ModWoodType woodType : ModWoodType.values()) {
            itemModelGenerator.register(woodType.getPlanksBoat(), Models.GENERATED);
            itemModelGenerator.register(woodType.getPlanksChestBoat(), Models.GENERATED);
        }
    }

    private void generateModOreTypeModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (ModOreType oreType : ModOreType.values()) {
            if (!oreType.isVanillaAddition()) {
                if (oreType.getStoneOre() != null) {
                    blockStateModelGenerator.registerSimpleCubeAll(oreType.getStoneOre());
                }
                if (oreType.getDeepslateOre() != null) {
                    blockStateModelGenerator.registerSimpleCubeAll(oreType.getDeepslateOre());
                }
            }
            if (oreType.getAndesiteOre() != null) {
                blockStateModelGenerator.registerSimpleCubeAll(oreType.getAndesiteOre());
            }
            if (oreType.getDioriteOre() != null) {
                blockStateModelGenerator.registerSimpleCubeAll(oreType.getDioriteOre());
            }
            if (oreType.getGraniteOre() != null) {
                blockStateModelGenerator.registerSimpleCubeAll(oreType.getGraniteOre());
            }

            if (oreType.getBlueslateOre() != null) {
                blockStateModelGenerator.registerSimpleCubeAll(oreType.getBlueslateOre());
            }
            if (oreType.getChalkOre() != null) {
                blockStateModelGenerator.registerSimpleCubeAll(oreType.getChalkOre());
            }
        }
    }

    /**
     * Generates the Models for OneOverlay Block Families
     * @param blockStateModelGenerator the blockStateModelGenerator
     * @param baseBlock the base block, which texture should be used below the overlay.
     * @param overlayFamily the blockFamily that should have overlay Models
     * @param texture the overlay texture
     * @param modModelType the modModelType that is used
     */
    private void registerOneOverlayBlockFamilyModel(BlockStateModelGenerator blockStateModelGenerator,
            Block baseBlock, BlockFamily overlayFamily, String texture, ModModelType modModelType) {
        TextureMap overlayTextureMap = createOneOverlayTextureMap(baseBlock,
                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + texture),
                modModelType);
        oneOverlayBlock(overlayFamily.getBaseBlock(), overlayTextureMap, blockStateModelGenerator,
                modModelType);
        oneOverlayStairs(overlayFamily.getVariant(BlockFamily.Variant.STAIRS), overlayTextureMap,
                blockStateModelGenerator, modModelType);
        oneOverlaySlab(overlayFamily.getVariant(BlockFamily.Variant.SLAB), overlayTextureMap,
                blockStateModelGenerator, modModelType);
        if (overlayFamily.getVariants().containsKey(BlockFamily.Variant.WALL)) {
            oneOverlayWall(overlayFamily.getVariant(BlockFamily.Variant.WALL), overlayTextureMap,
                    blockStateModelGenerator, modModelType);
        }
        if (overlayFamily.getVariants().containsKey(BlockFamily.Variant.BUTTON)) {
            oneOverlayButton(overlayFamily.getVariant(BlockFamily.Variant.BUTTON), overlayTextureMap,
                    blockStateModelGenerator, modModelType);
        }
        if (overlayFamily.getVariants().containsKey(BlockFamily.Variant.PRESSURE_PLATE)) {
            oneOverlayPressurePlate(overlayFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE), overlayTextureMap,
                    blockStateModelGenerator, modModelType);
        }
    }

    private void registerPavement (BlockStateModelGenerator blockStateModelGenerator,
            BlockFamily blockFamily,
            String topTexture,
            String sideTexture) {

        TextureMap textureMap = new TextureMap()
                .put(TextureKey.TOP, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + topTexture))
                .put(TextureKey.SIDE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + sideTexture))
                .put(TextureKey.BOTTOM, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + sideTexture));

        blockStateModelGenerator.registerSingleton(blockFamily.getBaseBlock(), textureMap, Models.CUBE_TOP);

        Identifier innerStairModelId = Models.INNER_STAIRS.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
                blockStateModelGenerator.modelCollector);
        Identifier regularStairModelId = Models.STAIRS.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
                blockStateModelGenerator.modelCollector);
        Identifier outerStairModelId = Models.OUTER_STAIRS.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
                blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createStairsBlockState(blockFamily.getVariant(BlockFamily.Variant.STAIRS),
                innerStairModelId, regularStairModelId, outerStairModelId));

        Identifier slabModelId = Models.SLAB.upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
                blockStateModelGenerator.modelCollector);
        Identifier slabTopModelId = Models.SLAB_TOP.upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
                blockStateModelGenerator.modelCollector);
        Identifier doubleSlabModelId = Models.CUBE_TOP.uploadWithoutVariant(blockFamily.getVariant(
                        BlockFamily.Variant.SLAB), "_double",
                textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createSlabBlockState(blockFamily.getVariant(BlockFamily.Variant.SLAB),
                slabModelId, slabTopModelId, doubleSlabModelId));
    }

    private void registerSmoothStone(BlockStateModelGenerator blockStateModelGenerator, Block smoothStone, Block smoothStoneSlab) {
        TextureMap textureMap = TextureMap.all(smoothStone);
        TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(smoothStoneSlab, "_side"),
                textureMap.getTexture(TextureKey.TOP));
        Identifier identifier = Models.SLAB.upload(smoothStoneSlab, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = Models.SLAB_TOP.upload(smoothStoneSlab, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(smoothStoneSlab, "_double", textureMap2,
                blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(smoothStoneSlab, identifier,
                identifier2,
                identifier3));
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(smoothStone,
                Models.CUBE_ALL.upload(smoothStone, textureMap, blockStateModelGenerator.modelCollector)));
    }

    private void registerPillarBlock(BlockStateModelGenerator blockStateModelGenerator, Block pillar,
            Block pillarSlab, String topTexture, String sideTexture) {
        TextureMap singlePillarTM = new TextureMap()
                .put(TextureKey.END, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + topTexture))
                .put(TextureKey.SIDE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + sideTexture +
                        "_single"));
        TextureMap basePillarTM = new TextureMap()
                .put(TextureKey.END, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + topTexture))
                .put(TextureKey.SIDE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + sideTexture +
                        "_base"));
        TextureMap middlePillarTM = new TextureMap()
                .put(TextureKey.END, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + topTexture))
                .put(TextureKey.SIDE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + sideTexture +
                        "_middle"));
        TextureMap topPillarTM = new TextureMap()
                .put(TextureKey.END, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + topTexture))
                .put(TextureKey.SIDE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + sideTexture +
                        "_top"));
        Identifier singlePillarIdentifier = ModModels.PILLAR.upload(pillar, singlePillarTM,
                blockStateModelGenerator.modelCollector);
        Identifier basePillarIdentifier = ModModels.PILLAR_BASE.upload(pillar, basePillarTM,
                blockStateModelGenerator.modelCollector);
        Identifier middlePillarIdentifier = ModModels.PILLAR_MIDDLE.upload(pillar, middlePillarTM,
                blockStateModelGenerator.modelCollector);
        Identifier topPillarIdentifier = ModModels.PILLAR_TOP.upload(pillar, topPillarTM, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createPillarBlockState(pillar, singlePillarIdentifier, topPillarIdentifier,
                middlePillarIdentifier, basePillarIdentifier));

        TextureMap slabTM = new TextureMap()
                .put(TextureKey.END, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + topTexture))
                .put(TextureKey.SIDE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + sideTexture +
                        "_single"));
        Identifier slabIdentifier = Models.SLAB.upload(pillarSlab, slabTM, blockStateModelGenerator.modelCollector);
        Identifier slabTopIdentifier = Models.SLAB_TOP.upload(pillarSlab, slabTM, blockStateModelGenerator.modelCollector);
        Identifier doubleSlabIdentifier = Models.CUBE_TOP.uploadWithoutVariant(pillarSlab, "_double", slabTM,
                blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(pillarSlab,
                slabIdentifier, slabTopIdentifier, doubleSlabIdentifier));
    }

    private BlockStateSupplier createPillarBlockState(Block pillar, Identifier singlePillarIdentifier, Identifier topPillarIdentifier,
            Identifier middlePillarIdentifier, Identifier basePillarIdentifier) {
        return VariantsBlockStateSupplier.create(pillar).coordinate(BlockStateVariantMap.create(ModPillarBlock.PILLAR_TYPE)
                .register(ModPillarType.SINGLE, BlockStateVariant.create().put(VariantSettings.MODEL, singlePillarIdentifier))
                .register(ModPillarType.TOP, BlockStateVariant.create().put(VariantSettings.MODEL, topPillarIdentifier))
                .register(ModPillarType.MIDDLE, BlockStateVariant.create().put(VariantSettings.MODEL, middlePillarIdentifier))
                .register(ModPillarType.BASE, BlockStateVariant.create().put(VariantSettings.MODEL, basePillarIdentifier)));
    }

    /**
     * This Method is used to generate the Overlay Texture Map for the Block and the given overlay1Id
     *
     * For the overlay1Id´s, that are not explicitly named by a block, the following should be used:
     * mossy_overlay_one: base, cobbled, smooth, smooth slab
     * mossy_overlay_two: bricks, tiles, fancy bricks, pavement
     * overgrown_overlay: base, cobbled, smooth, smooth slab, bricks, tiles, fancy bricks, pavement
     *
     * @param baseBlock The block the TextureMap is based on
     * @param overlay1Id The Identifier of the overlay texture
     * @param modelType The model type the textureMap is meant for
     */
    private static TextureMap createOneOverlayTextureMap (Block baseBlock, Identifier overlay1Id, ModModelType modelType) {
        switch(modelType) {
            case CUBE_ALL -> {
                return new TextureMap()
                        .put(TextureKey.ALL, TextureMap.getId(baseBlock)).put(TextureKey.LAYER1, overlay1Id);
            }
            default -> {
                return null;
            }
        }
    }

    private static void oneOverlayBlock(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator, ModModelType modelType) {
        Identifier modelId = null;
        switch(modelType) {
            case CUBE_ALL -> modelId = ModModels.CUBE_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        }
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, modelId));
        blockStateModelGenerator.registerParentedItemModel(block, modelId);
    }

    private static void oneOverlayStairs(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator, ModModelType modelType) {
        Identifier innerModelId = null;
        Identifier outerModelId = null;
        Identifier regularModelId = null;
        switch(modelType) {
            case CUBE_ALL -> {
                innerModelId = ModModels.INNER_STAIRS_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
                regularModelId = ModModels.STAIRS_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
                outerModelId = ModModels.OUTER_STAIRS_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
            }
        }
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(block, innerModelId, regularModelId, outerModelId));
        blockStateModelGenerator.registerParentedItemModel(block, regularModelId);
    }

    private static void oneOverlaySlab(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator, ModModelType modelType) {
        Identifier slabModelId = null;
        Identifier slabTopModelId = null;
        Identifier doubleSlabModelId = null;
        switch(modelType) {
            case CUBE_ALL -> {
                slabModelId = ModModels.SLAB_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
                slabTopModelId = ModModels.SLAB_TOP_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
                doubleSlabModelId = ModModels.CUBE_ALL_OVERLAY.uploadWithoutVariant(block,"_double",
                        textureMap, blockStateModelGenerator.modelCollector);
            }
        }
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(block, slabModelId, slabTopModelId, doubleSlabModelId));
        blockStateModelGenerator.registerParentedItemModel(block, slabModelId);
    }

    private static void oneOverlayWall(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator, ModModelType modelType) {
        Identifier wallPostModelId = null;
        Identifier wallSideModelId = null;
        Identifier wallSideTallModelId = null;
        Identifier wallInventoryModelId = null;
        switch(modelType) {
            case CUBE_ALL -> {
                wallPostModelId = ModModels.WALL_POST_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
                wallSideModelId = ModModels.WALL_SIDE_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
                wallSideTallModelId = ModModels.WALL_SIDE_TALL_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
                wallInventoryModelId = ModModels.WALL_INVENTORY_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
            }
        }
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(block, wallPostModelId, wallSideModelId, wallSideTallModelId));
        blockStateModelGenerator.registerParentedItemModel(block, wallInventoryModelId);
    }

    private static void oneOverlayButton(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator, ModModelType modelType) {
        Identifier buttonModelId = null;
        Identifier buttonPressedModelId = null;
        Identifier buttonInventoryModelId = null;
        switch(modelType) {
            case CUBE_ALL -> {
                buttonModelId = ModModels.BUTTON_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
                buttonPressedModelId = ModModels.BUTTON_PRESSED_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
                buttonInventoryModelId = ModModels.BUTTON_INVENTORY_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
            }
        }
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createButtonBlockState(block, buttonModelId, buttonPressedModelId));
        blockStateModelGenerator.registerParentedItemModel(block, buttonInventoryModelId);
    }

    private static void oneOverlayPressurePlate(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator, ModModelType modelType) {
        Identifier pressurePlateUpModelId = null;
        Identifier pressurePlateDownModelId = null;
        switch(modelType) {
            case CUBE_ALL -> {
                pressurePlateUpModelId = ModModels.PRESSURE_PLATE_UP_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
                pressurePlateDownModelId = ModModels.PRESSURE_PLATE_DOWN_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
            }
        }
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(block, pressurePlateUpModelId, pressurePlateDownModelId));
        blockStateModelGenerator.registerParentedItemModel(block, pressurePlateUpModelId);
    }
}