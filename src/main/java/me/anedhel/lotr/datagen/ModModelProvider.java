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
            if (stoneType.getStone() != null) {
                BlockStateModelGenerator.BlockTexturePool stoneTypePool = blockStateModelGenerator
                        .registerCubeAllModelTexturePool(stoneType.getStone());
                if (stoneType.getStoneStairs() != null) {
                    stoneTypePool.stairs(stoneType.getStoneStairs());
                }
                if (stoneType.getStoneSlab() != null) {
                    stoneTypePool.slab(stoneType.getStoneSlab());
                }
                if (stoneType.getStoneWall() != null) {
                    stoneTypePool.wall(stoneType.getStoneWall());
                }
                if (stoneType.getStoneButton() != null) {
                    stoneTypePool.button(stoneType.getStoneButton());
                }
                if (stoneType.getStonePressurePlate() != null) {
                    stoneTypePool.pressurePlate(stoneType.getStonePressurePlate());
                }
                if (stoneType.getCobbled() != null) {
                    BlockStateModelGenerator.BlockTexturePool cobbledPool = blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getCobbled());
                    cobbledPool.family(stoneType.getCobbledFamily());

                    if(stoneType.getMossyCobbled() != null) {
                        TextureMap mossyCobbledTM = createOneOverlayTextureMap(stoneType.getCobbled(),
                                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/mossy_overlay_one"),
                                ModModelType.CUBE_ALL);
                        oneOverlayBlock(stoneType.getMossyCobbled(), mossyCobbledTM, blockStateModelGenerator, ModModelType.CUBE_ALL);
                        oneOverlayStairs(stoneType.getMossyCobbledStairs(), mossyCobbledTM, blockStateModelGenerator, ModModelType.CUBE_ALL);
                        oneOverlaySlab(stoneType.getMossyCobbledSlab(), mossyCobbledTM, blockStateModelGenerator, ModModelType.CUBE_ALL);
                        oneOverlayWall(stoneType.getMossyCobbledWall(), mossyCobbledTM, blockStateModelGenerator, ModModelType.CUBE_ALL);
                        oneOverlayButton(stoneType.getMossyCobbledButton(), mossyCobbledTM, blockStateModelGenerator, ModModelType.CUBE_ALL);
                        oneOverlayPressurePlate(stoneType.getMossyCobbledPressurePlate(), mossyCobbledTM, blockStateModelGenerator, ModModelType.CUBE_ALL);
                    }
                }
                if (stoneType.getSmooth() != null && stoneType.getSmoothSlab() != null) {
                    registerSmoothStone(blockStateModelGenerator, stoneType.getSmooth(), stoneType.getSmoothSlab());
                }
                if (stoneType.getCrackedSmooth() != null && stoneType.getCrackedSmoothSlab() != null) {
                    registerSmoothStone(blockStateModelGenerator, stoneType.getCrackedSmooth(), stoneType.getCrackedSmoothSlab());
                }
                if (stoneType.getBrick() != null) {
                    BlockStateModelGenerator.BlockTexturePool bricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getBrick());
                    bricksPool.family(stoneType.getBrickFamily());
                }
                if (stoneType.getCrackedBrick() != null) {
                    BlockStateModelGenerator.BlockTexturePool crackedBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getCrackedBrick());
                    crackedBricksPool.family(stoneType.getCrackedBrickFamily());
                }
                if (stoneType.getTiles() != null) {
                    BlockStateModelGenerator.BlockTexturePool tilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getTiles());
                    tilesPool.family(stoneType.getTilesFamily());
                }
                if (stoneType.getCrackedTiles() != null) {
                    BlockStateModelGenerator.BlockTexturePool crackedTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getCrackedTiles());
                    crackedTilesPool.family(stoneType.getCrackedTilesFamily());
                }
                if (stoneType.getCobbledBrick() != null) {
                    BlockStateModelGenerator.BlockTexturePool cobbledBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getCobbledBrick());
                    cobbledBricksPool.family(stoneType.getCobbledBrickFamily());
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
                if (stoneType.getPavement() != null) {
                    String topTexture = stoneType.getPavement().getTranslationKey()
                            .substring(stoneType.getPavement().getTranslationKey().indexOf('.')+6);
                    String sideTexture = stoneType.getTiles().getTranslationKey()
                            .substring(stoneType.getTiles().getTranslationKey().indexOf('.')+6);
                    registerPavement(blockStateModelGenerator, stoneType.getPavementFamily(), topTexture, sideTexture);
                }
                if (stoneType.getCrackedPavement() != null) {
                    String topTexture = stoneType.getCrackedPavement().getTranslationKey()
                            .substring(stoneType.getCrackedPavement().getTranslationKey().indexOf('.')+6);
                    String sideTexture = stoneType.getCrackedTiles().getTranslationKey()
                            .substring(stoneType.getCrackedTiles().getTranslationKey().indexOf('.')+6);
                    registerPavement(blockStateModelGenerator, stoneType.getCrackedPavementFamily(), topTexture, sideTexture);
                }
                if (stoneType.getFancyBricks() != null) {
                    BlockStateModelGenerator.BlockTexturePool fancyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getFancyBricks());
                    fancyBricksPool.family(stoneType.getFancyBricksFamily());
                }
                if (stoneType.getCrackedFancyBricks() != null) {
                    BlockStateModelGenerator.BlockTexturePool crackedFancyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getCrackedFancyBricks());
                    crackedFancyBricksPool.family(stoneType.getCrackedFancyBricksFamily());
                }
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
     * For the overlay1Id´s the following should be used:
     * mossy_overlay_one: base, cobbled, smooth, smooth slab
     * mossy_overlay_two: bricks, tiles, fancy bricks, pavement
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