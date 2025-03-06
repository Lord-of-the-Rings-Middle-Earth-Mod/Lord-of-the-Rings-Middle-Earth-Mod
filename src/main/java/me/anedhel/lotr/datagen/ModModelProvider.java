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

    public static final Model PILLAR = new Model(Optional.of(new Identifier("minecraft", "block/" + "cube_column")),
                    Optional.empty() ,TextureKey.END, TextureKey.SIDE);
    public static final Model PILLAR_TOP = new Model(Optional.of(new Identifier("minecraft", "block/" + "cube_column")),
            Optional.of("_top") ,TextureKey.END, TextureKey.SIDE);
    public static final Model PILLAR_MIDDLE = new Model(Optional.of(new Identifier("minecraft", "block/" +
            "cube_column")), Optional.of("_middle") ,TextureKey.END, TextureKey.SIDE);
    public static final Model PILLAR_BASE = new Model(Optional.of(new Identifier("minecraft", "block/" + "cube_column")),
            Optional.of("_base") ,TextureKey.END, TextureKey.SIDE);

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
                }
                if (stoneType.getSmooth() != null && stoneType.getSmoothSlab() != null) {
                    registerSmoothStone(blockStateModelGenerator, stoneType.getSmooth(), stoneType.getSmoothSlab());
                }
                if (stoneType.getBrick() != null) {
                    BlockStateModelGenerator.BlockTexturePool bricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getBrick());
                    bricksPool.family(stoneType.getBrickFamily());
                }
                if (stoneType.getTiles() != null) {
                    BlockStateModelGenerator.BlockTexturePool tilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getTiles());
                    tilesPool.family(stoneType.getTilesFamily());
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
                if (stoneType.getPavement() != null) {
                    String topTexture = stoneType.getPavement().getTranslationKey()
                            .substring(stoneType.getPavement().getTranslationKey().indexOf('.')+6);
                    String sideTexture = stoneType.getTiles().getTranslationKey()
                            .substring(stoneType.getTiles().getTranslationKey().indexOf('.')+6);

                    registerPavement(blockStateModelGenerator, stoneType.getPavementFamily(), topTexture, sideTexture);
                }
                if (stoneType.getFancyBricks() != null) {
                    BlockStateModelGenerator.BlockTexturePool fancyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getFancyBricks());
                    fancyBricksPool.family(stoneType.getFancyBricksFamily());
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
        Identifier singlePillarIdentifier = PILLAR.upload(pillar, singlePillarTM, blockStateModelGenerator.modelCollector);
        Identifier basePillarIdentifier = PILLAR_BASE.upload(pillar, basePillarTM,
                blockStateModelGenerator.modelCollector);
        Identifier middlePillarIdentifier = PILLAR_MIDDLE.upload(pillar, middlePillarTM,
                blockStateModelGenerator.modelCollector);
        Identifier topPillarIdentifier = PILLAR_TOP.upload(pillar, topPillarTM, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createPillarBlockState(pillar, singlePillarIdentifier, topPillarIdentifier,
                middlePillarIdentifier, basePillarIdentifier));
    }

    private BlockStateSupplier createPillarBlockState(Block pillar, Identifier singlePillarIdentifier, Identifier topPillarIdentifier,
            Identifier middlePillarIdentifier, Identifier basePillarIdentifier) {
        return VariantsBlockStateSupplier.create(pillar).coordinate(BlockStateVariantMap.create(ModPillarBlock.PILLAR_TYPE)
                .register(ModPillarType.SINGLE, BlockStateVariant.create().put(VariantSettings.MODEL, singlePillarIdentifier))
                .register(ModPillarType.TOP, BlockStateVariant.create().put(VariantSettings.MODEL, topPillarIdentifier))
                .register(ModPillarType.MIDDLE, BlockStateVariant.create().put(VariantSettings.MODEL, middlePillarIdentifier))
                .register(ModPillarType.BASE, BlockStateVariant.create().put(VariantSettings.MODEL, basePillarIdentifier)));
    }
}