/*
 * Copyright (c)
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * lord-of-the-rings-middle-earth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * lord-of-the-rings-middle-earth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

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
import me.anedhel.lotr.datagen.util.ModModels;
import me.anedhel.lotr.datagen.util.ModTextureKeys;
import me.anedhel.lotr.item.ModGearType;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ArmorItem;
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
     * This Method is used to generate all BlockStateModels.
     * It is called when the DataGen is started.
     * @param blockStateModelGenerator a BlockStateModelGenerator provided by minecraft
     */
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
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

        TextureMap tomatoMap = new TextureMap()
                .put(TextureKey.BOTTOM, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/crate_bottom"))
                .put(TextureKey.TOP, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/tomato_crate_top"))
                .put(TextureKey.SIDE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/tomato_crate_side"));
        blockStateModelGenerator.registerSingleton(ModBlocks.TOMATO_CRATE, tomatoMap, Models.CUBE_BOTTOM_TOP);

        TextureMap cornMap = new TextureMap().put(TextureKey.BOTTOM,
                        new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/crate_bottom"))
                .put(TextureKey.TOP, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/corn_crate_top"))
                .put(TextureKey.SIDE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/corn_crate_side"));
        blockStateModelGenerator.registerSingleton(ModBlocks.CORN_CRATE, cornMap, Models.CUBE_BOTTOM_TOP);

        generateModStoneTypeBlockModels(blockStateModelGenerator);
        generateModWoodTypesBlockModels(blockStateModelGenerator);
        generateModOreTypeBlockModels(blockStateModelGenerator);
    }

    /**
     * This Method is used to generate all ItemModels
     * @param itemModelGenerator an ItemModelGenerator provided by minecraft
     */
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAKED_TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_CORN, Models.GENERATED);

        itemModelGenerator.register(ModItems.HANGING_PINE_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.HOBBIT_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

        generateModGearTypeModels(itemModelGenerator);
        generateModOreTypeItemModels(itemModelGenerator);
        generateModWoodTypesItemModels(itemModelGenerator);
    }

    /**
     * This Method is used to generate all the Models for all ModGearTypes
     *
     * @param itemModelGenerator an ItemModelGenerator provided by minecraft
     */
    private void generateModGearTypeModels(ItemModelGenerator itemModelGenerator) {
        for(ModGearType gearType : ModGearType.values()) {
            if(gearType.getHelmet() != null) {
                itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_HELMET);
            }
            if(gearType.getChestplate() != null) {
                itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_CHESTPLATE);
            }
            if(gearType.getLeggings() != null) {
                itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_LEGGINGS);
            }
            if(gearType.getBoots() != null) {
                itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_BOOTS);
            }
            if(gearType.getSword() != null) {
                itemModelGenerator.register(ModItems.BRONZE_SWORD, Models.HANDHELD);
            }
            if(gearType.getAxe() != null) {
                itemModelGenerator.register(ModItems.BRONZE_AXE, Models.HANDHELD);
            }
            if(gearType.getPickaxe() != null) {
                itemModelGenerator.register(ModItems.BRONZE_PICKAXE, Models.HANDHELD);
            }
            if(gearType.getShovel() != null) {
                itemModelGenerator.register(ModItems.BRONZE_SHOVEL, Models.HANDHELD);
            }
            if(gearType.getHoe() != null) {
                itemModelGenerator.register(ModItems.BRONZE_HOE, Models.HANDHELD);
            }
        }
    }

    /**
     * This Method is used to generate all the models for the given stone type.
     * It only works for blocks completely added by the mod, adding Models for additions made based on vanilla blocks does not work with this method.
     * </p>
     * The warning, that <code>getTranslationKey</code> may produce <code>NullPointerException</code>, can be
     * ignored, as the TranslationKeys are always set when registering the Block.
     *
     * @param blockStateModelGenerator a BlockStateModelGenerator provided by minecraft
     */
    private void generateModStoneTypeBlockModels(BlockStateModelGenerator blockStateModelGenerator) {
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

            BlockStateModelGenerator.BlockTexturePool crackedCobbledBricksPool =
                    blockStateModelGenerator.registerCubeAllModelTexturePool(stoneType.getCrackedCobbledBrickVariant(
                            "base"));
            crackedCobbledBricksPool.family(stoneType.getCrackedCobbledBrickFamily());

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

            if (stoneType.getStoneVariant("base") != null) {
                if (stoneType.getMossyStoneVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getStoneVariant("base"),
                            stoneType.getMossyStoneFamily(), "mossy_overlay_one");
                }
                if (stoneType.getOvergrownStoneVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getStoneVariant("base"),
                            stoneType.getOvergrownStoneFamily(), "overgrown_overlay");
                }
            }

            if (stoneType.getCobbledVariant("base") != null) {
                if (stoneType.getMossyCobbledVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCobbledVariant("base"),
                            stoneType.getMossyCobbledFamily(), "mossy_overlay_one");
                }
                if (stoneType.getOvergrownCobbledVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCobbledVariant("base"),
                            stoneType.getOvergrownCobbledFamily(), "overgrown_overlay");
                }
            }

            if (stoneType.getCobbledBrickVariant("base") != null) {
                if (stoneType.getMossyCobbledBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCobbledBrickVariant("base"),
                            stoneType.getMossyCobbledBrickFamily(), "mossy_overlay_three");
                }
                if (stoneType.getOvergrownCobbledBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCobbledBrickVariant("base"),
                            stoneType.getOvergrownCobbledBrickFamily(), "overgrown_overlay");
                }
                if (stoneType.getBronzeCobbledBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCobbledBrickVariant("base"),
                            stoneType.getBronzeCobbledBrickFamily(), "bronze_cobbled_brick_overlay");
                    if(stoneType.getMossyBronzeCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCobbledBrickVariant("base"),
                                stoneType.getMossyBronzeCobbledBrickFamily(), "bronze_cobbled_brick_overlay",
                                "mossy_overlay_three");
                    }
                    if(stoneType.getOvergrownBronzeCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCobbledBrickVariant("base"),
                                stoneType.getOvergrownBronzeCobbledBrickFamily(), "bronze_cobbled_brick_overlay",
                                "overgrown_overlay");
                    }
                }
                if(stoneType.getSilverCobbledBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCobbledBrickVariant("base"),
                            stoneType.getSilverCobbledBrickFamily(), "silver_cobbled_brick_overlay");
                    if(stoneType.getMossySilverCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCobbledBrickVariant("base"),
                                stoneType.getMossySilverCobbledBrickFamily(), "silver_cobbled_brick_overlay",
                                "mossy_overlay_three");
                    }
                    if(stoneType.getOvergrownSilverCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCobbledBrickVariant("base"),
                                stoneType.getOvergrownSilverCobbledBrickFamily(), "silver_cobbled_brick_overlay",
                                "overgrown_overlay");
                    }
                }
                if(stoneType.getGoldCobbledBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCobbledBrickVariant("base"),
                            stoneType.getGoldCobbledBrickFamily(), "gold_cobbled_brick_overlay");
                    if(stoneType.getMossyGoldCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCobbledBrickVariant("base"),
                                stoneType.getMossyGoldCobbledBrickFamily(), "gold_cobbled_brick_overlay",
                                "mossy_overlay_three");
                    }
                    if(stoneType.getOvergrownGoldCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCobbledBrickVariant("base"),
                                stoneType.getOvergrownGoldCobbledBrickFamily(), "gold_cobbled_brick_overlay",
                                "overgrown_overlay");
                    }
                }
            }

            if (stoneType.getCrackedCobbledBrickVariant("base") != null) {
                if (stoneType.getCrackedMossyCobbledBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedCobbledBrickVariant("base"),
                            stoneType.getCrackedMossyCobbledBrickFamily(), "mossy_overlay_three");
                }
                if (stoneType.getCrackedOvergrownCobbledBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedCobbledBrickVariant("base"),
                            stoneType.getCrackedOvergrownCobbledBrickFamily(), "overgrown_overlay");
                }
                if (stoneType.getCrackedBronzeCobbledBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedCobbledBrickVariant("base"),
                            stoneType.getCrackedBronzeCobbledBrickFamily(), "cracked_bronze_cobbled_brick_overlay");
                    if(stoneType.getCrackedMossyBronzeCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedCobbledBrickVariant("base"),
                                stoneType.getCrackedMossyBronzeCobbledBrickFamily(),
                                "cracked_bronze_cobbled_brick_overlay", "mossy_overlay_three");
                    }
                    if(stoneType.getCrackedOvergrownBronzeCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedCobbledBrickVariant("base"),
                                stoneType.getCrackedOvergrownBronzeCobbledBrickFamily(),
                                "cracked_bronze_cobbled_brick_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getCrackedSilverCobbledBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedCobbledBrickVariant("base"),
                            stoneType.getCrackedSilverCobbledBrickFamily(), "cracked_silver_cobbled_brick_overlay");
                    if(stoneType.getCrackedMossySilverCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedCobbledBrickVariant("base"),
                                stoneType.getCrackedMossySilverCobbledBrickFamily(),
                                "cracked_silver_cobbled_brick_overlay", "mossy_overlay_three");
                    }
                    if(stoneType.getCrackedOvergrownSilverCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedCobbledBrickVariant("base"),
                                stoneType.getCrackedOvergrownSilverCobbledBrickFamily(),
                                "cracked_silver_cobbled_brick_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getCrackedGoldCobbledBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedCobbledBrickVariant("base"),
                            stoneType.getCrackedGoldCobbledBrickFamily(), "cracked_gold_cobbled_brick_overlay");
                    if(stoneType.getCrackedMossyGoldCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedCobbledBrickVariant("base"),
                                stoneType.getCrackedMossyGoldCobbledBrickFamily(), "cracked_gold_cobbled_brick_overlay",
                                "mossy_overlay_three");
                    }
                    if(stoneType.getCrackedOvergrownGoldCobbledBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedCobbledBrickVariant("base"),
                                stoneType.getCrackedOvergrownGoldCobbledBrickFamily(),
                                "cracked_gold_cobbled_brick_overlay", "overgrown_overlay");
                    }
                }
            }

            if (stoneType.getBrickVariant("base") != null) {
                if (stoneType.getMossyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getBrickVariant("base"),
                            stoneType.getMossyBrickFamily(), "mossy_overlay_two");
                }
                if (stoneType.getOvergrownBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getBrickVariant("base"),
                            stoneType.getOvergrownBrickFamily(), "overgrown_overlay");
                }
                if (stoneType.getBronzeBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getBrickVariant("base"),
                            stoneType.getBronzeBrickFamily(), "bronze_brick_overlay");
                    if(stoneType.getMossyBronzeBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getBrickVariant("base"),
                                stoneType.getMossyBronzeBrickFamily(), "bronze_brick_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownBronzeBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getBrickVariant("base"), stoneType.getOvergrownBronzeBrickFamily(),
                                "bronze_brick_overlay", "overgrown_overlay");
                    }
                }
                if (stoneType.getSilverBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getBrickVariant("base"),
                            stoneType.getSilverBrickFamily(), "silver_brick_overlay");
                    if(stoneType.getMossySilverBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getBrickVariant("base"),
                                stoneType.getMossySilverBrickFamily(), "silver_brick_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownSilverBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getBrickVariant("base"), stoneType.getOvergrownSilverBrickFamily(),
                                "silver_brick_overlay", "overgrown_overlay");
                    }
                }
                if (stoneType.getGoldBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getBrickVariant("base"),
                            stoneType.getGoldBrickFamily(), "gold_brick_overlay");
                    if(stoneType.getMossyGoldBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getBrickVariant("base"),
                                stoneType.getMossyGoldBrickFamily(), "gold_brick_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownGoldBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getBrickVariant("base"), stoneType.getOvergrownGoldBrickFamily(),
                                "gold_brick_overlay", "overgrown_overlay");
                    }
                }
            }

            if (stoneType.getCrackedBrickVariant("base") != null) {
                if (stoneType.getMossyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedBrickVariant(
                            "base"), stoneType.getCrackedMossyBrickFamily(), "mossy_overlay_two");
                }
                if (stoneType.getCrackedOvergrownBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedBrickVariant(
                            "base"), stoneType.getCrackedOvergrownBrickFamily(), "overgrown_overlay");
                }
                if (stoneType.getCrackedBronzeBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedBrickVariant(
                                    "base"), stoneType.getCrackedBronzeBrickFamily(),
                            "cracked_bronze_brick_overlay");
                    if(stoneType.getCrackedMossyBronzeBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedBrickVariant("base"),
                                stoneType.getCrackedMossyBronzeBrickFamily(),
                                "cracked_bronze_brick_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownBronzeBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedBrickVariant("base"),
                                stoneType.getCrackedOvergrownBronzeBrickFamily(),
                                "cracked_bronze_brick_overlay", "overgrown_overlay");
                    }
                }
                if (stoneType.getCrackedSilverBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedBrickVariant(
                                    "base"), stoneType.getCrackedSilverBrickFamily(),
                            "cracked_silver_brick_overlay");
                    if(stoneType.getCrackedMossySilverBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedBrickVariant("base"),
                                stoneType.getCrackedMossySilverBrickFamily(),
                                "cracked_silver_brick_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownSilverBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedBrickVariant("base"),
                                stoneType.getCrackedOvergrownSilverBrickFamily(),
                                "cracked_silver_brick_overlay", "overgrown_overlay");
                    }
                }
                if (stoneType.getCrackedGoldBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedBrickVariant(
                            "base"), stoneType.getCrackedGoldBrickFamily(),
                            "cracked_gold_brick_overlay");
                    if(stoneType.getCrackedMossyGoldBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedBrickVariant("base"),
                                stoneType.getCrackedMossyGoldBrickFamily(),
                                "cracked_gold_brick_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownGoldBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedBrickVariant("base"),
                                stoneType.getCrackedOvergrownGoldBrickFamily(),
                                "cracked_gold_brick_overlay", "overgrown_overlay");
                    }
                }
            }

            if(stoneType.getTilesVariant("base") != null) {
                if(stoneType.getMossyTilesVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getTilesVariant("base"),
                            stoneType.getMossyTilesFamily(), "mossy_overlay_two");
                }
                if(stoneType.getOvergrownTilesVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getTilesVariant("base"),
                            stoneType.getOvergrownTilesFamily(), "overgrown_overlay");
                }
                if(stoneType.getBronzeTilesVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getTilesVariant("base"),
                            stoneType.getBronzeTilesFamily(), "bronze_tiles_overlay");
                    if(stoneType.getMossyBronzeTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getTilesVariant("base"), stoneType.getMossyBronzeTilesFamily(),
                                "bronze_tiles_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownBronzeTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getTilesVariant("base"), stoneType.getOvergrownBronzeTilesFamily(),
                                "bronze_tiles_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getSilverTilesVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getTilesVariant("base"),
                            stoneType.getSilverTilesFamily(), "silver_tiles_overlay");
                    if(stoneType.getMossySilverTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getTilesVariant("base"), stoneType.getMossySilverTilesFamily(),
                                "silver_tiles_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownSilverTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getTilesVariant("base"), stoneType.getOvergrownSilverTilesFamily(),
                                "silver_tiles_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getGoldTilesVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getTilesVariant("base"),
                            stoneType.getGoldTilesFamily(), "gold_tiles_overlay");
                    if(stoneType.getMossyGoldTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getTilesVariant("base"), stoneType.getMossyGoldTilesFamily(),
                                "gold_tiles_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownGoldTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getTilesVariant("base"), stoneType.getOvergrownGoldTilesFamily(),
                                "gold_tiles_overlay", "overgrown_overlay");
                    }
                }
            }

            if (stoneType.getCrackedTilesVariant("base") != null) {
                if (stoneType.getCrackedMossyTilesVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedTilesVariant(
                            "base"), stoneType.getCrackedMossyTilesFamily(), "mossy_overlay_two");
                }
                if (stoneType.getCrackedOvergrownTilesVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedTilesVariant(
                            "base"), stoneType.getCrackedOvergrownTilesFamily(), "overgrown_overlay");
                }
                if (stoneType.getCrackedBronzeTilesVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedTilesVariant(
                            "base"), stoneType.getCrackedBronzeTilesFamily(), "cracked_bronze_tiles_overlay");
                    if(stoneType.getCrackedMossyBronzeTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedTilesVariant("base"),
                                stoneType.getCrackedMossyBronzeTilesFamily(),
                                "cracked_bronze_tiles_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownBronzeTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedTilesVariant("base"),
                                stoneType.getCrackedOvergrownBronzeTilesFamily(),
                                "cracked_bronze_tiles_overlay", "overgrown_overlay");
                    }
                }
                if (stoneType.getCrackedSilverTilesVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedTilesVariant(
                            "base"), stoneType.getCrackedSilverTilesFamily(), "cracked_silver_tiles_overlay");
                    if(stoneType.getCrackedMossySilverTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedTilesVariant("base"),
                                stoneType.getCrackedMossySilverTilesFamily(),
                                "cracked_silver_tiles_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownSilverTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedTilesVariant("base"),
                                stoneType.getCrackedOvergrownSilverTilesFamily(),
                                "cracked_silver_tiles_overlay", "overgrown_overlay");
                    }
                }
                if (stoneType.getCrackedGoldTilesVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getCrackedTilesVariant(
                            "base"), stoneType.getCrackedGoldTilesFamily(),
                            "cracked_gold_tiles_overlay");
                    if(stoneType.getCrackedMossyGoldTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedTilesVariant("base"),
                                stoneType.getCrackedMossyGoldTilesFamily(),
                                "cracked_gold_tiles_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownGoldTilesVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedTilesVariant("base"),
                                stoneType.getCrackedOvergrownGoldTilesFamily(),
                                "cracked_gold_tiles_overlay", "overgrown_overlay");
                    }
                }
            }

            if (stoneType.getFancyBrickVariant("base") != null) {
                if(stoneType.getMossyFancyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getFancyBrickVariant("base"),
                            stoneType.getMossyFancyBricksFamily(), "mossy_overlay_two");
                }
                if(stoneType.getOvergrownFancyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getFancyBrickVariant("base"),
                            stoneType.getOvergrownFancyBricksFamily(), "overgrown_overlay");
                }
                if(stoneType.getBronzeFancyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getFancyBrickVariant("base"),
                            stoneType.getBronzeFancyBricksFamily(), "bronze_fancy_bricks_overlay");
                    if(stoneType.getMossyBronzeFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getFancyBrickVariant("base"), stoneType.getMossyBronzeFancyBricksFamily(),
                                "bronze_fancy_bricks_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownBronzeFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getFancyBrickVariant("base"), stoneType.getOvergrownBronzeFancyBricksFamily(),
                                "bronze_fancy_bricks_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getSilverFancyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getFancyBrickVariant("base"),
                            stoneType.getSilverFancyBricksFamily(), "silver_fancy_bricks_overlay");
                    if(stoneType.getMossySilverFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getFancyBrickVariant("base"), stoneType.getMossySilverFancyBricksFamily(),
                                "silver_fancy_bricks_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownSilverFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getFancyBrickVariant("base"),
                                stoneType.getOvergrownSilverFancyBricksFamily(),
                                "silver_fancy_bricks_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getGoldFancyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneType.getFancyBrickVariant("base"),
                            stoneType.getGoldFancyBricksFamily(), "gold_fancy_bricks_overlay");
                    if(stoneType.getMossyGoldFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getFancyBrickVariant("base"), stoneType.getMossyGoldFancyBricksFamily(),
                                "gold_fancy_bricks_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownGoldFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getFancyBrickVariant("base"), stoneType.getOvergrownGoldFancyBricksFamily(),
                                "gold_fancy_bricks_overlay", "overgrown_overlay");
                    }
                }
            }

            if(stoneType.getCrackedFancyBrickVariant("base") != null) {
                if(stoneType.getCrackedMossyFancyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                            stoneType.getCrackedFancyBrickVariant("base"), stoneType.getCrackedMossyFancyBricksFamily(),
                            "mossy_overlay_two");
                }
                if(stoneType.getCrackedOvergrownFancyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                            stoneType.getCrackedFancyBrickVariant("base"),
                            stoneType.getCrackedOvergrownFancyBricksFamily(), "overgrown_overlay");
                }
                if(stoneType.getCrackedBronzeFancyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                            stoneType.getCrackedFancyBrickVariant("base"),
                            stoneType.getCrackedBronzeFancyBricksFamily(), "cracked_bronze_fancy_bricks_overlay");
                    if(stoneType.getCrackedMossyBronzeFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedFancyBrickVariant("base"),
                                stoneType.getCrackedMossyBronzeFancyBricksFamily(),
                                "cracked_bronze_fancy_bricks_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownBronzeFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedFancyBrickVariant("base"),
                                stoneType.getCrackedOvergrownBronzeFancyBricksFamily(),
                                "cracked_bronze_fancy_bricks_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getCrackedSilverFancyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                            stoneType.getCrackedFancyBrickVariant("base"),
                            stoneType.getCrackedSilverFancyBricksFamily(), "cracked_silver_fancy_bricks_overlay");
                    if(stoneType.getCrackedMossySilverFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedFancyBrickVariant("base"),
                                stoneType.getCrackedMossySilverFancyBricksFamily(),
                                "cracked_silver_fancy_bricks_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownSilverFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedFancyBrickVariant("base"),
                                stoneType.getCrackedOvergrownSilverFancyBricksFamily(),
                                "cracked_silver_fancy_bricks_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getCrackedGoldFancyBrickVariant("base") != null) {
                    registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                            stoneType.getCrackedFancyBrickVariant("base"),
                            stoneType.getCrackedGoldFancyBricksFamily(),
                            "cracked_gold_fancy_bricks_overlay");
                    if(stoneType.getCrackedMossyGoldFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedFancyBrickVariant("base"),
                                stoneType.getCrackedMossyGoldFancyBricksFamily(),
                                "cracked_gold_fancy_bricks_overlay", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownGoldFancyBrickVariant("base") != null) {
                        registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator,
                                stoneType.getCrackedFancyBrickVariant("base"),
                                stoneType.getCrackedOvergrownGoldFancyBricksFamily(),
                                "cracked_gold_fancy_bricks_overlay", "overgrown_overlay");
                    }
                }
            }

            if (stoneType.getPillar() != null && stoneType.getPillarSlab() != null) {
                String topTexture = stoneType.getPillar().getTranslationKey()
                        .substring(stoneType.getPillar().getTranslationKey().indexOf('.')+6).concat("_end");
                String sideTexture = stoneType.getPillar().getTranslationKey()
                        .substring(stoneType.getPillar().getTranslationKey().indexOf('.')+6).concat("_side");
                registerPillarBlock(blockStateModelGenerator, stoneType.getPillar(), stoneType.getPillarSlab(), topTexture, sideTexture);
                if(stoneType.getMossyPillar() != null) {
                    registerOneOverlayPillarBlock(blockStateModelGenerator, stoneType.getMossyPillar(),
                            stoneType.getMossyPillarSlab(), topTexture, sideTexture,
                            false, "mossy_overlay_two");
                }
                if(stoneType.getOvergrownPillar() != null) {
                    registerOneOverlayPillarBlock(blockStateModelGenerator, stoneType.getOvergrownPillar(),
                            stoneType.getOvergrownPillarSlab(), topTexture, sideTexture,
                            false, "overgrown_overlay");
                }
                if(stoneType.getBronzePillar() != null) {
                    registerOneOverlayPillarBlock(blockStateModelGenerator, stoneType.getBronzePillar(),
                            stoneType.getBronzePillarSlab(), topTexture, sideTexture,
                            true, "bronze_pillar");
                    if(stoneType.getMossyBronzePillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator, stoneType.getMossyBronzePillar(),
                                stoneType.getMossyBronzePillarSlab(), topTexture, sideTexture,
                                "bronze_pillar", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownBronzePillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator, stoneType.getOvergrownBronzePillar(),
                                stoneType.getOvergrownBronzePillarSlab(), topTexture, sideTexture,
                                "bronze_pillar", "overgrown_overlay");
                    }
                }
                if(stoneType.getSilverPillar() != null) {
                    registerOneOverlayPillarBlock(blockStateModelGenerator, stoneType.getSilverPillar(),
                            stoneType.getSilverPillarSlab(), topTexture, sideTexture,
                            true, "silver_pillar");
                    if(stoneType.getMossySilverPillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator, stoneType.getMossySilverPillar(),
                                stoneType.getMossySilverPillarSlab(), topTexture, sideTexture,
                                "silver_pillar", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownSilverPillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator, stoneType.getOvergrownSilverPillar(),
                                stoneType.getOvergrownSilverPillarSlab(), topTexture, sideTexture,
                                "silver_pillar", "overgrown_overlay");
                    }
                }
                if (stoneType.getGoldPillar() != null) {
                    registerOneOverlayPillarBlock(blockStateModelGenerator, stoneType.getGoldPillar(),
                            stoneType.getGoldPillarSlab(), topTexture, sideTexture,
                            true, "gold_pillar");
                    if(stoneType.getMossyGoldPillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator, stoneType.getMossyGoldPillar(),
                                stoneType.getMossyGoldPillarSlab(), topTexture, sideTexture,
                                "gold_pillar", "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownGoldPillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator, stoneType.getOvergrownGoldPillar(),
                                stoneType.getOvergrownGoldPillarSlab(), topTexture, sideTexture,
                                "gold_pillar", "overgrown_overlay");
                    }
                }
            }

            if (stoneType.getCrackedPillar() != null) {
                String topTexture = stoneType.getCrackedPillar().getTranslationKey()
                        .substring(stoneType.getCrackedPillar().getTranslationKey().indexOf('.')+6).concat("_end");
                String sideTexture = stoneType.getCrackedPillar().getTranslationKey()
                        .substring(stoneType.getCrackedPillar().getTranslationKey().indexOf('.')+6).concat("_side");
                registerPillarBlock(blockStateModelGenerator, stoneType.getCrackedPillar(), stoneType.getCrackedPillarSlab(), topTexture, sideTexture);
                if(stoneType.getCrackedMossyPillar() != null) {
                    registerOneOverlayPillarBlock(blockStateModelGenerator, stoneType.getCrackedMossyPillar(),
                            stoneType.getCrackedMossyPillarSlab(), topTexture, sideTexture,
                            false, "mossy_overlay_two");
                }
                if(stoneType.getCrackedOvergrownPillar() != null) {
                    registerOneOverlayPillarBlock(blockStateModelGenerator, stoneType.getCrackedOvergrownPillar(),
                            stoneType.getCrackedOvergrownPillarSlab(), topTexture, sideTexture,
                            false, "overgrown_overlay");
                }
                if(stoneType.getCrackedBronzePillar() != null) {
                    registerOneOverlayPillarBlock(blockStateModelGenerator, stoneType.getCrackedBronzePillar(),
                            stoneType.getCrackedBronzePillarSlab(), topTexture, sideTexture, true, "bronze_pillar");
                    if(stoneType.getCrackedMossyBronzePillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator, stoneType.getCrackedMossyBronzePillar(),
                                stoneType.getCrackedMossyBronzePillarSlab(), topTexture, sideTexture,
                                "cracked_bronze_pillar", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownBronzePillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator,
                                stoneType.getCrackedOvergrownBronzePillar(),
                                stoneType.getCrackedOvergrownBronzePillarSlab(), topTexture, sideTexture,
                                "cracked_bronze_pillar", "overgrown_overlay");
                    }
                }
                if(stoneType.getCrackedSilverPillar() != null) {
                    registerOneOverlayPillarBlock(blockStateModelGenerator, stoneType.getCrackedSilverPillar(),
                            stoneType.getCrackedSilverPillarSlab(), topTexture, sideTexture, true, "silver_pillar");
                    if(stoneType.getCrackedMossySilverPillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator, stoneType.getCrackedMossySilverPillar(),
                                stoneType.getCrackedMossySilverPillarSlab(), topTexture, sideTexture,
                                "cracked_silver_pillar", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownSilverPillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator,
                                stoneType.getCrackedOvergrownSilverPillar(),
                                stoneType.getCrackedOvergrownSilverPillarSlab(), topTexture, sideTexture,
                                "cracked_silver_pillar", "overgrown_overlay");
                    }
                }
                if(stoneType.getCrackedGoldPillar() != null) {
                    registerOneOverlayPillarBlock(blockStateModelGenerator, stoneType.getCrackedGoldPillar(),
                            stoneType.getCrackedGoldPillarSlab(),
                            topTexture, sideTexture,
                            true, "cracked_gold_pillar");
                    if(stoneType.getCrackedMossyGoldPillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator, stoneType.getCrackedMossyGoldPillar(),
                                stoneType.getCrackedMossyGoldPillarSlab(), topTexture, sideTexture,
                                "cracked_gold_pillar", "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownGoldPillar() != null) {
                        registerTwoOverlayPillarBlock(blockStateModelGenerator,
                                stoneType.getCrackedOvergrownGoldPillar(),
                                stoneType.getCrackedOvergrownGoldPillarSlab(), topTexture, sideTexture,
                                "cracked_gold_pillar", "overgrown_overlay");
                    }
                }
            }

            if (stoneType.getPavementVariant("base") != null) {
                String topTexture = stoneType.getPavementVariant("base").getTranslationKey()
                        .substring(stoneType.getPavementVariant("base").getTranslationKey().indexOf('.')+6);
                String sideTexture = stoneType.getTilesVariant("base").getTranslationKey()
                        .substring(stoneType.getTilesVariant("base").getTranslationKey().indexOf('.')+6);
                registerPavement(blockStateModelGenerator, stoneType.getPavementFamily(), topTexture, sideTexture);
                if(stoneType.getMossyPavementVariant("base") != null) {
                    registerOneOverlayPavement(blockStateModelGenerator, stoneType.getMossyPavementFamily(),
                            sideTexture, topTexture, "mossy_overlay_two");
                }
                if(stoneType.getOvergrownPavementVariant("base") != null) {
                    registerOneOverlayPavement(blockStateModelGenerator, stoneType.getOvergrownPavementFamily(),
                            sideTexture, topTexture, "overgrown_overlay");
                }
                if(stoneType.getBronzePavementVariant("base") != null) {
                    registerOneOverlayPavement(blockStateModelGenerator, stoneType.getBronzePavementFamily(),
                            sideTexture, topTexture, "bronze_tiles_overlay", "bronze_pavement_overlay");
                    if(stoneType.getMossyBronzePavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator, stoneType.getMossyBronzePavementFamily(),
                                sideTexture, topTexture, "bronze_tiles_overlay", "bronze_pavement_overlay",
                                "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownBronzePavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator,
                                stoneType.getOvergrownBronzePavementFamily(),
                                sideTexture, topTexture, "bronze_tiles_overlay", "bronze_pavement_overlay",
                                "overgrown_overlay");
                    }
                }
                if(stoneType.getSilverPavementVariant("base") != null) {
                    registerOneOverlayPavement(blockStateModelGenerator, stoneType.getSilverPavementFamily(),
                            sideTexture, topTexture, "silver_tiles_overlay", "silver_pavement_overlay");
                    if(stoneType.getMossySilverPavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator, stoneType.getMossySilverPavementFamily(),
                                sideTexture, topTexture, "silver_tiles_overlay", "silver_pavement_overlay",
                                "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownSilverPavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator,
                                stoneType.getOvergrownSilverPavementFamily(),
                                sideTexture, topTexture, "silver_tiles_overlay", "silver_pavement_overlay",
                                "overgrown_overlay");
                    }
                }
                if(stoneType.getGoldPavementVariant("base") != null) {
                    registerOneOverlayPavement(blockStateModelGenerator, stoneType.getGoldPavementFamily(),
                            sideTexture, topTexture, "gold_tiles_overlay", "gold_pavement_overlay");
                    if(stoneType.getMossyGoldPavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator, stoneType.getMossyGoldPavementFamily(),
                                sideTexture, topTexture, "gold_tiles_overlay", "gold_pavement_overlay",
                                "mossy_overlay_two");
                    }
                    if(stoneType.getOvergrownGoldPavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator,
                                stoneType.getOvergrownGoldPavementFamily(),
                                sideTexture, topTexture, "gold_tiles_overlay", "gold_pavement_overlay",
                                "overgrown_overlay");
                    }
                }
            }

            if (stoneType.getCrackedPavementVariant("base") != null) {
                String topTexture = stoneType.getCrackedPavementVariant("base").getTranslationKey()
                        .substring(stoneType.getCrackedPavementVariant("base").getTranslationKey().indexOf('.')+6);
                String sideTexture = stoneType.getCrackedTilesVariant("base").getTranslationKey()
                        .substring(stoneType.getCrackedTilesVariant("base").getTranslationKey().indexOf('.')+6);
                registerPavement(blockStateModelGenerator, stoneType.getCrackedPavementFamily(), topTexture, sideTexture);
                if(stoneType.getCrackedMossyPavementVariant("base") != null) {
                    registerOneOverlayPavement(blockStateModelGenerator, stoneType.getCrackedMossyPavementFamily(),
                            sideTexture, topTexture,"mossy_overlay_two");
                }
                if(stoneType.getCrackedOvergrownPavementVariant("base") != null) {
                    registerOneOverlayPavement(blockStateModelGenerator, stoneType.getCrackedOvergrownPavementFamily(),
                            sideTexture, topTexture,"overgrown_overlay");
                }
                if(stoneType.getCrackedBronzePavementVariant("base") != null) {
                    registerOneOverlayPavement(blockStateModelGenerator, stoneType.getCrackedBronzePavementFamily(),
                            sideTexture, topTexture, "cracked_bronze_tiles_overlay", "cracked_bronze_pavement_overlay");
                    if(stoneType.getCrackedMossyBronzePavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator,
                                stoneType.getCrackedMossyBronzePavementFamily(),
                                sideTexture, topTexture, "cracked_bronze_tiles_overlay",
                                "cracked_bronze_pavement_overlay",
                                "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownBronzePavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator,
                                stoneType.getCrackedOvergrownBronzePavementFamily(),
                                sideTexture, topTexture, "cracked_bronze_tiles_overlay",
                                "cracked_bronze_pavement_overlay",
                                "overgrown_overlay");
                    }
                }
                if(stoneType.getCrackedSilverPavementVariant("base") != null) {
                    registerOneOverlayPavement(blockStateModelGenerator, stoneType.getCrackedSilverPavementFamily(),
                            sideTexture, topTexture, "cracked_silver_tiles_overlay", "cracked_silver_pavement_overlay");
                    if(stoneType.getCrackedMossySilverPavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator,
                                stoneType.getCrackedMossySilverPavementFamily(),
                                sideTexture, topTexture, "cracked_silver_tiles_overlay",
                                "cracked_silver_pavement_overlay",
                                "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownSilverPavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator,
                                stoneType.getCrackedOvergrownSilverPavementFamily(),
                                sideTexture, topTexture, "cracked_silver_tiles_overlay",
                                "cracked_silver_pavement_overlay",
                                "overgrown_overlay");
                    }
                }
                if(stoneType.getCrackedGoldPavementVariant("base") != null) {
                    registerOneOverlayPavement(blockStateModelGenerator, stoneType.getCrackedGoldPavementFamily(),
                            sideTexture, topTexture, "cracked_gold_tiles_overlay", "cracked_gold_pavement_overlay");
                    if(stoneType.getCrackedMossyGoldPavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator,
                                stoneType.getCrackedMossyGoldPavementFamily(),
                                sideTexture, topTexture, "cracked_gold_tiles_overlay",
                                "cracked_gold_pavement_overlay",
                                "mossy_overlay_two");
                    }
                    if(stoneType.getCrackedOvergrownGoldPavementVariant("base") != null) {
                        registerTwoOverlayPavement(blockStateModelGenerator,
                                stoneType.getCrackedOvergrownGoldPavementFamily(),
                                sideTexture, topTexture, "cracked_gold_tiles_overlay",
                                "cracked_gold_pavement_overlay",
                                "overgrown_overlay");
                    }
                }
            }

            if (stoneType.getSmooth() != null && stoneType.getSmoothSlab() != null) {
                registerSmoothStone(blockStateModelGenerator, stoneType.getSmooth(), stoneType.getSmoothSlab());
                if(stoneType.getMossySmooth() != null && stoneType.getMossySmoothSlab() != null) {
                    registerOneOverlaySmoothStone(blockStateModelGenerator, stoneType.getSmooth(),
                            stoneType.getSmoothSlab() ,
                            stoneType.getMossySmooth(),
                            stoneType.getMossySmoothSlab(),false, "mossy_overlay_one");
                }
                if(stoneType.getOvergrownSmooth() != null && stoneType.getOvergrownSmoothSlab() != null) {
                    registerOneOverlaySmoothStone(blockStateModelGenerator, stoneType.getSmooth(),
                            stoneType.getSmoothSlab() ,stoneType.getOvergrownSmooth(),
                            stoneType.getOvergrownSmoothSlab(), false, "overgrown_overlay");
                }
                if(stoneType.getBronzeSmooth() != null && stoneType.getBronzeSmoothSlab() != null) {
                    registerOneOverlaySmoothStone(blockStateModelGenerator, stoneType.getSmooth(),
                            stoneType.getSmoothSlab() ,stoneType.getBronzeSmooth(),
                            stoneType.getBronzeSmoothSlab(), true, "bronze_smooth_overlay",
                            "bronze_smooth_slab_overlay");
                    if(stoneType.getMossyBronzeSmooth() != null && stoneType.getMossyBronzeSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getSmooth(), stoneType.getSmoothSlab(),
                                stoneType.getMossyBronzeSmooth(), stoneType.getMossyBronzeSmoothSlab(),
                                "bronze_smooth_overlay", "bronze_smooth_slab_overlay", "mossy_overlay_one");
                    }
                    if(stoneType.getOvergrownBronzeSmooth() != null && stoneType.getOvergrownBronzeSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getSmooth(), stoneType.getSmoothSlab(),
                                stoneType.getOvergrownBronzeSmooth(), stoneType.getOvergrownBronzeSmoothSlab(),
                                "bronze_smooth_overlay", "bronze_smooth_slab_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getSilverSmooth() != null && stoneType.getSilverSmoothSlab() != null) {
                    registerOneOverlaySmoothStone(blockStateModelGenerator, stoneType.getSmooth(),
                            stoneType.getSmoothSlab() ,stoneType.getSilverSmooth(),
                            stoneType.getSilverSmoothSlab(), true, "silver_smooth_overlay",
                            "silver_smooth_slab_overlay");
                    if(stoneType.getMossySilverSmooth() != null && stoneType.getMossySilverSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getSmooth(), stoneType.getSmoothSlab(),
                                stoneType.getMossySilverSmooth(), stoneType.getMossySilverSmoothSlab(),
                                "silver_smooth_overlay", "silver_smooth_slab_overlay", "mossy_overlay_one");
                    }
                    if(stoneType.getOvergrownSilverSmooth() != null && stoneType.getOvergrownSilverSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getSmooth(), stoneType.getSmoothSlab(),
                                stoneType.getOvergrownSilverSmooth(), stoneType.getOvergrownSilverSmoothSlab(),
                                "silver_smooth_overlay", "silver_smooth_slab_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getGoldSmooth() != null && stoneType.getGoldSmoothSlab() != null) {
                    registerOneOverlaySmoothStone(blockStateModelGenerator, stoneType.getSmooth(),
                            stoneType.getSmoothSlab() ,stoneType.getGoldSmooth(),
                            stoneType.getGoldSmoothSlab(), true, "gold_smooth_overlay",
                            "gold_smooth_slab_overlay");
                    if(stoneType.getMossyGoldSmooth() != null && stoneType.getMossyGoldSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getSmooth(), stoneType.getSmoothSlab(),
                                stoneType.getMossyGoldSmooth(), stoneType.getMossyGoldSmoothSlab(),
                                "gold_smooth_overlay", "gold_smooth_slab_overlay", "mossy_overlay_one");
                    }
                    if(stoneType.getOvergrownGoldSmooth() != null && stoneType.getOvergrownGoldSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getSmooth(), stoneType.getSmoothSlab(),
                                stoneType.getOvergrownGoldSmooth(), stoneType.getOvergrownGoldSmoothSlab(),
                                "gold_smooth_overlay", "gold_smooth_slab_overlay", "overgrown_overlay");
                    }
                }
            }

            if (stoneType.getCrackedSmooth() != null && stoneType.getCrackedSmoothSlab() != null) {
                registerSmoothStone(blockStateModelGenerator, stoneType.getCrackedSmooth(), stoneType.getCrackedSmoothSlab());
                if(stoneType.getCrackedMossySmooth() != null && stoneType.getCrackedMossySmoothSlab() != null) {
                    registerOneOverlaySmoothStone(blockStateModelGenerator, stoneType.getCrackedSmooth(),
                            stoneType.getCrackedSmoothSlab() ,
                            stoneType.getCrackedMossySmooth(),
                            stoneType.getCrackedMossySmoothSlab(),false, "mossy_overlay_one");
                }
                if(stoneType.getCrackedOvergrownSmooth() != null && stoneType.getCrackedOvergrownSmoothSlab() != null) {
                    registerOneOverlaySmoothStone(blockStateModelGenerator, stoneType.getCrackedSmooth(),
                            stoneType.getCrackedSmoothSlab() ,
                            stoneType.getCrackedOvergrownSmooth(),
                            stoneType.getCrackedOvergrownSmoothSlab(),false, "overgrown_overlay");
                }
                if(stoneType.getCrackedBronzeSmooth() != null && stoneType.getCrackedBronzeSmoothSlab() != null) {
                    registerOneOverlaySmoothStone(blockStateModelGenerator, stoneType.getCrackedSmooth(),
                            stoneType.getCrackedSmoothSlab() ,
                            stoneType.getCrackedBronzeSmooth(),
                            stoneType.getCrackedBronzeSmoothSlab(),true,
                            "cracked_bronze_smooth_overlay", "cracked_bronze_smooth_slab_overlay");
                    if(stoneType.getCrackedMossyBronzeSmooth() != null && stoneType.getCrackedMossyBronzeSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getCrackedSmooth(), stoneType.getCrackedSmoothSlab(),
                                stoneType.getCrackedMossyBronzeSmooth(), stoneType.getCrackedMossyBronzeSmoothSlab(),
                                "cracked_bronze_smooth_overlay", "cracked_bronze_smooth_slab_overlay", "mossy_overlay_one");
                    }
                    if(stoneType.getCrackedOvergrownBronzeSmooth() != null && stoneType.getCrackedOvergrownBronzeSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getCrackedSmooth(), stoneType.getCrackedSmoothSlab(),
                                stoneType.getCrackedOvergrownBronzeSmooth(),
                                stoneType.getCrackedOvergrownBronzeSmoothSlab(),
                                "cracked_bronze_smooth_overlay", "cracked_bronze_smooth_slab_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getCrackedSilverSmooth() != null && stoneType.getCrackedSilverSmoothSlab() != null) {
                    registerOneOverlaySmoothStone(blockStateModelGenerator, stoneType.getCrackedSmooth(),
                            stoneType.getCrackedSmoothSlab() ,
                            stoneType.getCrackedSilverSmooth(),
                            stoneType.getCrackedSilverSmoothSlab(),true,
                            "cracked_silver_smooth_overlay", "cracked_silver_smooth_slab_overlay");
                    if(stoneType.getCrackedMossySilverSmooth() != null && stoneType.getCrackedMossySilverSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getCrackedSmooth(), stoneType.getCrackedSmoothSlab(),
                                stoneType.getCrackedMossySilverSmooth(), stoneType.getCrackedMossySilverSmoothSlab(),
                                "cracked_silver_smooth_overlay", "cracked_silver_smooth_slab_overlay", "mossy_overlay_one");
                    }
                    if(stoneType.getCrackedOvergrownSilverSmooth() != null && stoneType.getCrackedOvergrownSilverSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getCrackedSmooth(), stoneType.getCrackedSmoothSlab(),
                                stoneType.getCrackedOvergrownSilverSmooth(),
                                stoneType.getCrackedOvergrownSilverSmoothSlab(),
                                "cracked_silver_smooth_overlay", "cracked_silver_smooth_slab_overlay", "overgrown_overlay");
                    }
                }
                if(stoneType.getCrackedGoldSmooth() != null && stoneType.getCrackedGoldSmoothSlab() != null) {
                    registerOneOverlaySmoothStone(blockStateModelGenerator, stoneType.getCrackedSmooth(),
                            stoneType.getCrackedSmoothSlab() ,
                            stoneType.getCrackedGoldSmooth(),
                            stoneType.getCrackedGoldSmoothSlab(),true,
                            "cracked_gold_smooth_overlay", "cracked_gold_smooth_slab_overlay");
                    if(stoneType.getCrackedMossyGoldSmooth() != null && stoneType.getCrackedMossyGoldSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getCrackedSmooth(), stoneType.getCrackedSmoothSlab(),
                                stoneType.getCrackedMossyGoldSmooth(), stoneType.getCrackedMossyGoldSmoothSlab(),
                                "cracked_gold_smooth_overlay", "cracked_gold_smooth_slab_overlay", "mossy_overlay_one");
                    }
                    if(stoneType.getCrackedOvergrownGoldSmooth() != null && stoneType.getCrackedOvergrownGoldSmoothSlab() != null) {
                        registerTwoOverlaySmoothStone(blockStateModelGenerator,
                                stoneType.getCrackedSmooth(), stoneType.getCrackedSmoothSlab(),
                                stoneType.getCrackedOvergrownGoldSmooth(),
                                stoneType.getCrackedOvergrownGoldSmoothSlab(),
                                "cracked_gold_smooth_overlay", "cracked_gold_smooth_slab_overlay", "overgrown_overlay");
                    }
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

    /**
     * This method generates the models for all ores added by the mod.
     *
     * @param blockStateModelGenerator the blockStateModelGenerator provided by minecraft
     */
    private void generateModOreTypeBlockModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (ModOreType oreType : ModOreType.values()) {
            if(oreType.getStoneOre() != null) {
                blockStateModelGenerator.registerSimpleCubeAll(oreType.getStoneOre());
            }
            if(oreType.getDeepslateOre() != null) {
                blockStateModelGenerator.registerSimpleCubeAll(oreType.getDeepslateOre());
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
            if(oreType.getOreDropBlock() != null) {
                blockStateModelGenerator.registerSimpleCubeAll(oreType.getOreDropBlock());
            }
            if(oreType.getSmeltingBlock() != null) {
                blockStateModelGenerator.registerSimpleCubeAll(oreType.getSmeltingBlock());
            }
        }
    }

    /**
     * Generates item models for all ore types added by the mod.
     *
     * @param itemModelGenerator the ItemModelGenerator provided by Minecraft
     */
    private void generateModOreTypeItemModels(ItemModelGenerator itemModelGenerator) {
        for(ModOreType oreType : ModOreType.values()) {
            if(oreType.getOreDrop() != null) {
                itemModelGenerator.register(oreType.getOreDrop(), Models.GENERATED);
            }
            if(oreType.getNugget() != null) {
                itemModelGenerator.register(oreType.getNugget(), Models.GENERATED);
            }
            if(oreType.getSmeltingItem() != null) {
                itemModelGenerator.register(oreType.getSmeltingItem(), Models.GENERATED);
            }
        }
    }

    /**
     * Generates the Models for OneOverlay Block Families
     * @param blockStateModelGenerator the blockStateModelGenerator
     * @param baseBlock the base block, which texture should be used below the overlay.
     * @param overlayFamily the blockFamily that should have overlay Models
     * @param textures the overlay textures, if it´s mossy-ornamented or overgrown-ornamented, the ornamented
     * textures should be the first one provided
     */
    private void registerCubeAllOverlayBlockFamilyModel(BlockStateModelGenerator blockStateModelGenerator,
            Block baseBlock, BlockFamily overlayFamily, String... textures) {
        TextureMap overlayTextureMap;
        if(textures.length == 2) {
            overlayTextureMap = createCubeAllOverlayTextureMap(baseBlock, textures[0], textures[1]);
            twoOverlayBlock(overlayFamily.getBaseBlock(), overlayTextureMap, blockStateModelGenerator);
            twoOverlayStairs(overlayFamily.getVariant(BlockFamily.Variant.STAIRS), overlayTextureMap,
                    blockStateModelGenerator);
            twoOverlaySlab(overlayFamily.getVariant(BlockFamily.Variant.SLAB), overlayTextureMap,
                    blockStateModelGenerator);
            if (overlayFamily.getVariants().containsKey(BlockFamily.Variant.WALL)) {
                twoOverlayWall(overlayFamily.getVariant(BlockFamily.Variant.WALL), overlayTextureMap,
                        blockStateModelGenerator);
            }
        } else if(textures.length == 1) {
            overlayTextureMap = createCubeAllOverlayTextureMap(baseBlock, textures[0]);
            oneOverlayBlock(overlayFamily.getBaseBlock(), overlayTextureMap, blockStateModelGenerator);
            oneOverlayStairs(overlayFamily.getVariant(BlockFamily.Variant.STAIRS), overlayTextureMap,
                    blockStateModelGenerator);
            oneOverlaySlab(overlayFamily.getVariant(BlockFamily.Variant.SLAB), overlayTextureMap,
                    blockStateModelGenerator);
            if (overlayFamily.getVariants().containsKey(BlockFamily.Variant.WALL)) {
                oneOverlayWall(overlayFamily.getVariant(BlockFamily.Variant.WALL), overlayTextureMap,
                        blockStateModelGenerator);
            }
            if (overlayFamily.getVariants().containsKey(BlockFamily.Variant.BUTTON)) {
                oneOverlayButton(overlayFamily.getVariant(BlockFamily.Variant.BUTTON), overlayTextureMap,
                        blockStateModelGenerator);
            }
            if (overlayFamily.getVariants().containsKey(BlockFamily.Variant.PRESSURE_PLATE)) {
                oneOverlayPressurePlate(overlayFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE), overlayTextureMap,
                        blockStateModelGenerator);
            }
        }

    }

    /**
     * Registers the pavement block family models with the given textures.
     *
     * @param blockStateModelGenerator the block state model generator
     * @param blockFamily the block family to register
     * @param topTexture the texture for the top of the block
     * @param sideTexture the texture for the side of the block
     */
    private void registerPavement (BlockStateModelGenerator blockStateModelGenerator,
            BlockFamily blockFamily,
            String topTexture,
            String sideTexture) {

        TextureMap textureMap = createPavementTextureMap(topTexture, sideTexture, false);

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

    /**
     * Registers the models for a block family with one overlay texture.
     *
     * @param blockStateModelGenerator the block state model generator
     * @param blockFamily the block family to register
     * @param sideTexture the texture for the side of the block
     * @param topTexture the texture for the top of the block
     * @param overlays the overlay textures, if more than one overlay is provided, the first one is used as the primary overlay
     */
    private void registerOneOverlayPavement (BlockStateModelGenerator blockStateModelGenerator,
            BlockFamily blockFamily, String sideTexture, String topTexture, String... overlays) {
        TextureMap textureMap = createPavementTextureMap(topTexture, sideTexture, overlays.length > 1, overlays);
        blockStateModelGenerator.registerSingleton(blockFamily.getBaseBlock(), textureMap, ModModels.PAVEMENT_OVERLAY);

        Identifier innerStairModelId = ModModels.PAVEMENT_INNER_STAIRS_OVERLAY
                .upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier regularStairModelId = ModModels.PAVEMENT_STAIRS_OVERLAY
                .upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier outerStairModelId = ModModels.PAVEMENT_OUTER_STAIRS_OVERLAY
                .upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
                        blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createStairsBlockState(blockFamily.getVariant(BlockFamily.Variant.STAIRS),
                innerStairModelId, regularStairModelId, outerStairModelId));

        Identifier slabModelId = ModModels.PAVEMENT_SLAB_OVERLAY
                .upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier slabTopModelId = ModModels.PAVEMENT_SLAB_TOP_OVERLAY
                .upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier doubleSlabModelId = ModModels.PAVEMENT_OVERLAY
                .uploadWithoutVariant(blockFamily.getVariant(BlockFamily.Variant.SLAB), "_double",
                        textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createSlabBlockState(blockFamily.getVariant(BlockFamily.Variant.SLAB),
                slabModelId, slabTopModelId, doubleSlabModelId));
    }

    /**
     * Registers the models for a block family with two overlay textures.
     *
     * @param blockStateModelGenerator the block state model generator
     * @param blockFamily the block family to register
     * @param sideTexture the texture for the side of the block
     * @param topTexture the texture for the top of the block
     * @param overlays the overlay textures, if more than one overlay is provided, the first one is used as the primary overlay
     */
    private void registerTwoOverlayPavement (BlockStateModelGenerator blockStateModelGenerator,
            BlockFamily blockFamily, String sideTexture, String topTexture, String... overlays) {
        TextureMap textureMap = createPavementTextureMap(topTexture, sideTexture, true, overlays);
        blockStateModelGenerator.registerSingleton(blockFamily.getBaseBlock(), textureMap,
                ModModels.PAVEMENT_TWO_OVERLAY);

        Identifier innerStairModelId = ModModels.PAVEMENT_INNER_STAIRS_TWO_OVERLAY
                .upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier regularStairModelId = ModModels.PAVEMENT_STAIRS_TWO_OVERLAY
                .upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier outerStairModelId = ModModels.PAVEMENT_OUTER_STAIRS_TWO_OVERLAY
                .upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
                        blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createStairsBlockState(blockFamily.getVariant(BlockFamily.Variant.STAIRS),
                        innerStairModelId, regularStairModelId, outerStairModelId));

        Identifier slabModelId = ModModels.PAVEMENT_SLAB_TWO_OVERLAY
                .upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier slabTopModelId = ModModels.PAVEMENT_SLAB_TOP_TWO_OVERLAY
                .upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier doubleSlabModelId = ModModels.PAVEMENT_TWO_OVERLAY
                .uploadWithoutVariant(blockFamily.getVariant(BlockFamily.Variant.SLAB), "_double",
                        textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createSlabBlockState(blockFamily.getVariant(BlockFamily.Variant.SLAB),
                        slabModelId, slabTopModelId, doubleSlabModelId));
    }

    /**
     * Creates a TextureMap for pavement blocks with optional overlays.
     *
     * @param topTexture The texture for the top of the block.
     * @param sideTexture The texture for the sides of the block.
     * @param ornamented Indicates if the block is ornamented.
     * @param overlays The overlay textures.
     * @return The created TextureMap.
     */
    private TextureMap createPavementTextureMap(String topTexture, String sideTexture, boolean ornamented,
            String... overlays) {
        TextureMap textureMap = new TextureMap()
                .put(TextureKey.TOP, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + topTexture))
                .put(TextureKey.SIDE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + sideTexture))
                .put(TextureKey.BOTTOM, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + sideTexture));
        if(overlays.length == 1 && !ornamented) {
            textureMap.put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                    "block/overlays/" + overlays[0]));
        } else if(overlays.length == 2 && ornamented) {
            textureMap.put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                    "block/overlays/" + overlays[0]));
            textureMap.put(ModTextureKeys.TOP_LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block"
                    + "/overlays/" + overlays[1]));
        } else if(overlays.length == 3 && ornamented) {
            textureMap.put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                    "block/overlays/" + overlays[0]));
            textureMap.put(ModTextureKeys.TOP_LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block"
                    + "/overlays/" + overlays[1]));
            textureMap.put(TextureKey.LAYER2, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                    "block/overlays/" + overlays[2]));
        }
        return textureMap;
    }

    /**
     * Registers the models for smooth stone and smooth stone slabs.
     *
     * @param blockStateModelGenerator The BlockStateModelGenerator.
     * @param smoothStone The smooth stone block.
     * @param smoothStoneSlab The smooth stone slab.
     */
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

    /**
     * Registers the models for smooth stone with one overlay and smooth stone slabs with one overlay.
     *
     * @param blockStateModelGenerator The BlockStateModelGenerator.
     * @param smoothStone The smooth stone block.
     * @param smoothStoneSlab The smooth stone slab.
     * @param overlaySmoothStone The smooth stone block with overlay.
     * @param overlaySmoothStoneSlab The smooth stone slab with overlay.
     * @param ornamented Indicates if the block is ornamented.
     * @param overlays The overlay textures.
     */
    private void registerOneOverlaySmoothStone(BlockStateModelGenerator blockStateModelGenerator,
            Block smoothStone, Block smoothStoneSlab,
            Block overlaySmoothStone, Block overlaySmoothStoneSlab, boolean ornamented, String... overlays) {
        TextureMap textureMap = TextureMap.all(smoothStone);
        textureMap.put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                "block/overlays/" + overlays[0]));

        TextureMap textureMapSlab = TextureMap.sideEnd(TextureMap.getSubId(smoothStoneSlab, "_side"),
                textureMap.getTexture(TextureKey.TOP));
        if(ornamented) {
            textureMapSlab.put(ModTextureKeys.END_LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                    "block/overlays/" + overlays[0]));
            textureMapSlab.put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                    "block/overlays/" + overlays[1]));
        } else {
            textureMapSlab.put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                    "block/overlays/" + overlays[0]));
        }

        Identifier identifier = ModModels.SMOOTH_SLAB_OVERLAY.upload(overlaySmoothStoneSlab, textureMapSlab,
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.SMOOTH_SLAB_TOP_OVERLAY.upload(overlaySmoothStoneSlab, textureMapSlab,
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.DOUBLE_SMOOTH_OVERLAY.uploadWithoutVariant(overlaySmoothStoneSlab, "_double",
                textureMapSlab,
                blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(overlaySmoothStoneSlab, identifier, identifier2, identifier3));
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(overlaySmoothStone,
                ModModels.CUBE_ALL_OVERLAY.upload(overlaySmoothStone, textureMap,
                        blockStateModelGenerator.modelCollector)));
    }

    /**
     * Registers the models for smooth stone with two overlays and smooth stone slabs with two overlays.
     *
     * @param blockStateModelGenerator The BlockStateModelGenerator.
     * @param smoothStone The smooth stone block.
     * @param smoothStoneSlab The smooth stone slab.
     * @param overlaySmoothStone The smooth stone block with overlays.
     * @param overlaySmoothStoneSlab The smooth stone slab with overlays.
     * @param overlays The overlay textures.
     */
    private void registerTwoOverlaySmoothStone(BlockStateModelGenerator blockStateModelGenerator,
            Block smoothStone, Block smoothStoneSlab,
            Block overlaySmoothStone, Block overlaySmoothStoneSlab, String... overlays) {
        TextureMap textureMap = TextureMap.all(smoothStone);
        textureMap.put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/overlays/" + overlays[0]));
        textureMap.put(TextureKey.LAYER2, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/overlays/" + overlays[2]));

        TextureMap textureMapSlab = TextureMap.sideEnd(TextureMap.getSubId(smoothStoneSlab, "_side"),
                textureMap.getTexture(TextureKey.TOP));
        textureMapSlab.put(ModTextureKeys.END_LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                "block/overlays/" + overlays[0]));
        textureMapSlab.put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                "block/overlays/" + overlays[1]));
        textureMapSlab.put(TextureKey.LAYER2, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                "block/overlays/" + overlays[2]));

        Identifier identifier = ModModels.SMOOTH_SLAB_TWO_OVERLAY.upload(overlaySmoothStoneSlab, textureMapSlab,
                blockStateModelGenerator.modelCollector);
        Identifier identifier2 = ModModels.SMOOTH_SLAB_TOP_TWO_OVERLAY.upload(overlaySmoothStoneSlab, textureMapSlab,
                blockStateModelGenerator.modelCollector);
        Identifier identifier3 = ModModels.DOUBLE_SMOOTH_TWO_OVERLAY.uploadWithoutVariant(overlaySmoothStoneSlab, "_double",
                textureMapSlab, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(overlaySmoothStoneSlab, identifier, identifier2, identifier3));
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(overlaySmoothStone,
                ModModels.CUBE_ALL_TWO_OVERLAY.upload(overlaySmoothStone, textureMap,
                        blockStateModelGenerator.modelCollector)));
    }

    /**
     * Registers the models for pillar blocks and pillar slabs.
     *
     * @param blockStateModelGenerator The BlockStateModelGenerator.
     * @param pillar The pillar block.
     * @param pillarSlab The pillar slab.
     * @param topTexture The texture for the top of the block.
     * @param sideTexture The texture for the sides of the block.
     */
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

    /**
     * Registers the models for pillar blocks with one overlay and pillar slabs with one overlay.
     *
     * @param blockStateModelGenerator The BlockStateModelGenerator.
     * @param pillar The pillar block.
     * @param pillarSlab The pillar slab.
     * @param topTexture The texture for the top of the block.
     * @param sideTexture The texture for the sides of the block.
     * @param ornamented Indicates if the block is ornamented.
     * @param overlays The overlay textures.
     */
    private void registerOneOverlayPillarBlock(BlockStateModelGenerator blockStateModelGenerator, Block pillar,
            Block pillarSlab, String topTexture, String sideTexture, boolean ornamented, String overlays) {
        TextureMap singlePillarTM = createPillarTextureMap(topTexture, sideTexture, "_single", ornamented, overlays);
        TextureMap basePillarTM = createPillarTextureMap(topTexture, sideTexture, "_base", ornamented, overlays);
        TextureMap middlePillarTM = createPillarTextureMap(topTexture, sideTexture, "_middle", ornamented, overlays);
        TextureMap topPillarTM = createPillarTextureMap(topTexture, sideTexture, "_top", ornamented, overlays);

        Identifier singlePillarId = ModModels.PILLAR_OVERLAY.upload(pillar, singlePillarTM, blockStateModelGenerator.modelCollector);
        Identifier basePillarId = ModModels.PILLAR_BASE_OVERLAY.upload(pillar, basePillarTM, blockStateModelGenerator.modelCollector);
        Identifier middlePillarId = ModModels.PILLAR_MIDDLE_OVERLAY.upload(pillar, middlePillarTM, blockStateModelGenerator.modelCollector);
        Identifier topPillarId = ModModels.PILLAR_TOP_OVERLAY.upload(pillar, topPillarTM, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createPillarBlockState(pillar, singlePillarId,
                topPillarId, middlePillarId, basePillarId));

        TextureMap slabTM = createPillarTextureMap(topTexture, sideTexture, "_single", ornamented, overlays);
        Identifier slabId = ModModels.PILLAR_SLAB_OVERLAY.upload(pillarSlab, slabTM, blockStateModelGenerator.modelCollector);
        Identifier slabTopId = ModModels.PILLAR_SLAB_TOP_OVERLAY.upload(pillarSlab, slabTM, blockStateModelGenerator.modelCollector);
        Identifier doubleSlabId = ModModels.PILLAR_OVERLAY.uploadWithoutVariant(pillarSlab, "_double", slabTM,
                blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(pillarSlab,
                slabId, slabTopId, doubleSlabId));
    }

    /**
     * Registers the models for pillar blocks with two overlays and pillar slabs with two overlays.
     *
     * @param blockStateModelGenerator The BlockStateModelGenerator.
     * @param pillar The pillar block.
     * @param pillarSlab The pillar slab.
     * @param topTexture The texture for the top of the block.
     * @param sideTexture The texture for the sides of the block.
     * @param layer1 The first overlay texture.
     * @param layer2 The second overlay texture.
     */
    private void registerTwoOverlayPillarBlock(BlockStateModelGenerator blockStateModelGenerator, Block pillar,
            Block pillarSlab, String topTexture, String sideTexture, String layer1, String layer2) {
        TextureMap singlePillarTM = createPillarTextureMap(topTexture, sideTexture, "_single", true, layer1, layer2);
        TextureMap basePillarTM = createPillarTextureMap(topTexture, sideTexture, "_base", true, layer1, layer2);
        TextureMap middlePillarTM = createPillarTextureMap(topTexture, sideTexture, "_middle", true, layer1, layer2);
        TextureMap topPillarTM = createPillarTextureMap(topTexture, sideTexture, "_top", true, layer1, layer2);

        Identifier singlePillarId = ModModels.PILLAR_TWO_OVERLAY.upload(pillar, singlePillarTM, blockStateModelGenerator.modelCollector);
        Identifier basePillarId = ModModels.PILLAR_BASE_TWO_OVERLAY.upload(pillar, basePillarTM, blockStateModelGenerator.modelCollector);
        Identifier middlePillarId = ModModels.PILLAR_MIDDLE_TWO_OVERLAY.upload(pillar, middlePillarTM, blockStateModelGenerator.modelCollector);
        Identifier topPillarId = ModModels.PILLAR_TOP_TWO_OVERLAY.upload(pillar, topPillarTM, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createPillarBlockState(pillar, singlePillarId, topPillarId,
                middlePillarId, basePillarId));

        TextureMap slabTM = createPillarTextureMap(topTexture, sideTexture, "_single", true, layer1, layer2);
        Identifier slabId = ModModels.PILLAR_SLAB_TWO_OVERLAY.upload(pillarSlab, slabTM, blockStateModelGenerator.modelCollector);
        Identifier slabTopId = ModModels.PILLAR_SLAB_TOP_TWO_OVERLAY.upload(pillarSlab, slabTM, blockStateModelGenerator.modelCollector);
        Identifier doubleSlabId = ModModels.PILLAR_TWO_OVERLAY.uploadWithoutVariant(pillarSlab, "_double", slabTM,
                blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(pillarSlab,
                slabId, slabTopId, doubleSlabId));
    }

    /**
     * Creates a TextureMap for pillars with optional overlays.
     *
     * @param topTexture The texture for the top of the block.
     * @param sideTexture The texture for the sides of the block.
     * @param position The position of the texture (e.g. "_single", "_base").
     * @param ornamented Indicates if the block is ornamented.
     * @param overlays The overlay textures.
     * @return The created TextureMap.
     */
    private TextureMap createPillarTextureMap(String topTexture, String sideTexture, String position,
            boolean ornamented, String... overlays) {
        TextureMap textureMap = new TextureMap()
                .put(TextureKey.END, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + topTexture))
                .put(TextureKey.SIDE, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + sideTexture +
                        position));
        if(overlays.length == 1) {
            if (ornamented) {
                textureMap.put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                        "block/overlays/" + overlays[0] + "_side" + position + "_overlay"));
                textureMap.put(ModTextureKeys.END_LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                        "block/overlays/" + overlays[0] + "_end" + "_overlay"));
            } else {
                textureMap.put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/overlays"
                        + "/" + overlays[0]));
                textureMap.put(ModTextureKeys.END_LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                        "block/overlays/" + overlays[0]));
            }
        } else if(overlays.length == 2) {
            textureMap.put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                            "block/overlays/" + overlays[0] + "_side" + position + "_overlay"))
                    .put(TextureKey.LAYER2, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/overlays/" + overlays[1]))
                    .put(ModTextureKeys.END_LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                            "block/overlays/" + overlays[0] + "_end" + "_overlay"))
                    .put(ModTextureKeys.END_LAYER2, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID,
                            "block/overlays/" + overlays[1]));
        }
        return textureMap;
    }

    /**
     * Creates a BlockStateSupplier for a pillar block with different variants.
     *
     * @param pillar The pillar block.
     * @param singlePillarIdentifier The identifier for the single pillar model.
     * @param topPillarIdentifier The identifier for the top pillar model.
     * @param middlePillarIdentifier The identifier for the middle pillar model.
     * @param basePillarIdentifier The identifier for the base pillar model.
     * @return A BlockStateSupplier for the pillar block.
     */
    private BlockStateSupplier createPillarBlockState(Block pillar, Identifier singlePillarIdentifier, Identifier topPillarIdentifier,
            Identifier middlePillarIdentifier, Identifier basePillarIdentifier) {
        return VariantsBlockStateSupplier.create(pillar).coordinate(BlockStateVariantMap.create(ModPillarBlock.PILLAR_TYPE)
                .register(ModPillarType.SINGLE, BlockStateVariant.create().put(VariantSettings.MODEL, singlePillarIdentifier))
                .register(ModPillarType.TOP, BlockStateVariant.create().put(VariantSettings.MODEL, topPillarIdentifier))
                .register(ModPillarType.MIDDLE, BlockStateVariant.create().put(VariantSettings.MODEL, middlePillarIdentifier))
                .register(ModPillarType.BASE, BlockStateVariant.create().put(VariantSettings.MODEL, basePillarIdentifier)));
    }

    /**
     * This Method is used to generate the Overlay Texture Map for the Block and the given overlays
     * </p>
     * For the overlays´s, that are not explicitly named by a block, the following should be used:
     * mossy_overlay_one: base, cobbled, smooth, smooth slab
     * mossy_overlay_two: bricks, tiles, fancy bricks, pavement, pillar
     * overgrown_overlay: base, cobbled, smooth, smooth slab, bricks, tiles, fancy bricks, pavement
     *
     * @param baseBlock The block the TextureMap is based on
     * @param overlays The Identifier of the overlay textures
     */
    private static TextureMap createCubeAllOverlayTextureMap(Block baseBlock, String... overlays) {
        TextureMap textureMap = new TextureMap().put(TextureKey.ALL, TextureMap.getId(baseBlock));
        if(overlays.length == 1) {
            textureMap
                    .put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/overlays/" + overlays[0]));
        } else if(overlays.length == 2) {
            textureMap
                    .put(TextureKey.LAYER1, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/overlays/" + overlays[0]))
                    .put(TextureKey.LAYER2, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/overlays/" + overlays[1]));
        }
        return textureMap;
    }

    /**
     * Registers a block with a single overlay texture.
     *
     * @param block The block to register.
     * @param textureMap The texture map containing the overlay texture.
     * @param blockStateModelGenerator The block state model generator.
     */
    private static void oneOverlayBlock(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator) {
        Identifier modelId = ModModels.CUBE_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, modelId));
        blockStateModelGenerator.registerParentedItemModel(block, modelId);
    }

    /**
     * Registers a block with two overlay textures.
     *
     * @param block The block to register.
     * @param textureMap The texture map containing the overlay textures.
     * @param blockStateModelGenerator The block state model generator.
     */
    private static void twoOverlayBlock(Block block, TextureMap textureMap, BlockStateModelGenerator blockStateModelGenerator) {
        Identifier modelId = ModModels.CUBE_ALL_TWO_OVERLAY.upload(block, textureMap,
                blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, modelId));
        blockStateModelGenerator.registerParentedItemModel(block, modelId);
    }

    /**
     * Registers a block with one overlay texture for stairs.
     *
     * @param block The block to register.
     * @param textureMap The texture map containing the overlay texture.
     * @param blockStateModelGenerator The block state model generator.
     */
    private static void oneOverlayStairs(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator) {
        Identifier innerModelId = ModModels.INNER_STAIRS_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier regularModelId = ModModels.STAIRS_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier outerModelId = ModModels.OUTER_STAIRS_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(block, innerModelId, regularModelId, outerModelId));
        blockStateModelGenerator.registerParentedItemModel(block, regularModelId);
    }

    /**
     * Registers a block with two overlay textures for stairs.
     *
     * @param block The block to register.
     * @param textureMap The texture map containing the overlay textures.
     * @param blockStateModelGenerator The block state model generator.
     */
    private static void twoOverlayStairs(Block block, TextureMap textureMap, BlockStateModelGenerator blockStateModelGenerator) {
        Identifier innerModelId = ModModels.INNER_STAIRS_ALL_TWO_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier regularModelId = ModModels.STAIRS_ALL_TWO_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier outerModelId = ModModels.OUTER_STAIRS_ALL_TWO_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(block, innerModelId, regularModelId, outerModelId));
        blockStateModelGenerator.registerParentedItemModel(block, regularModelId);
    }

    /**
     * Registers a block with one overlay texture for slabs.
     *
     * @param block The block to register.
     * @param textureMap The texture map containing the overlay texture.
     * @param blockStateModelGenerator The block state model generator.
     */
    private static void oneOverlaySlab(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator) {
        Identifier slabModelId =  ModModels.SLAB_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier slabTopModelId = ModModels.SLAB_TOP_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier doubleSlabModelId = ModModels.CUBE_ALL_OVERLAY.uploadWithoutVariant(block,"_double",
                        textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(block, slabModelId, slabTopModelId, doubleSlabModelId));
        blockStateModelGenerator.registerParentedItemModel(block, slabModelId);
    }

    /**
     * Registers a block with two overlay textures for slabs.
     *
     * @param block The block to register.
     * @param textureMap The texture map containing the overlay textures.
     * @param blockStateModelGenerator The block state model generator.
     */
    private static void twoOverlaySlab(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator) {
        Identifier slabModelId =  ModModels.SLAB_ALL_TWO_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier slabTopModelId = ModModels.SLAB_TOP_ALL_TWO_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier doubleSlabModelId = ModModels.CUBE_ALL_TWO_OVERLAY.uploadWithoutVariant(block,"_double",
                        textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(block, slabModelId, slabTopModelId, doubleSlabModelId));
        blockStateModelGenerator.registerParentedItemModel(block, slabModelId);
    }

    /**
     * Registers a block with one overlay texture for walls.
     *
     * @param block The block to register.
     * @param textureMap The texture map containing the overlay texture.
     * @param blockStateModelGenerator The block state model generator.
     */
    private static void oneOverlayWall(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator) {
	    Identifier wallPostModelId = ModModels.WALL_POST_ALL_OVERLAY.upload(block, textureMap,
                blockStateModelGenerator.modelCollector);
        Identifier wallSideModelId = ModModels.WALL_SIDE_ALL_OVERLAY.upload(block, textureMap,
                blockStateModelGenerator.modelCollector);
        Identifier wallSideTallModelId = ModModels.WALL_SIDE_TALL_ALL_OVERLAY.upload(block, textureMap,
                blockStateModelGenerator.modelCollector);
        Identifier wallInventoryModelId = ModModels.WALL_INVENTORY_ALL_OVERLAY.upload(block, textureMap,
                blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(block, wallPostModelId, wallSideModelId, wallSideTallModelId));
        blockStateModelGenerator.registerParentedItemModel(block, wallInventoryModelId);
    }

    /**
     * Registers a block with two overlay textures for walls.
     *
     * @param block The block to register.
     * @param textureMap The texture map containing the overlay textures.
     * @param blockStateModelGenerator The block state model generator.
     */
    private static void twoOverlayWall(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator) {
        Identifier wallPostModelId = ModModels.WALL_POST_ALL_TWO_OVERLAY.upload(block, textureMap,
                blockStateModelGenerator.modelCollector);
        Identifier wallSideModelId = ModModels.WALL_SIDE_ALL_TWO_OVERLAY.upload(block, textureMap,
                blockStateModelGenerator.modelCollector);
        Identifier wallSideTallModelId = ModModels.WALL_SIDE_TALL_ALL_TWO_OVERLAY.upload(block, textureMap,
                blockStateModelGenerator.modelCollector);
        Identifier wallInventoryModelId = ModModels.WALL_INVENTORY_ALL_TWO_OVERLAY.upload(block, textureMap,
                blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(block, wallPostModelId, wallSideModelId, wallSideTallModelId));
        blockStateModelGenerator.registerParentedItemModel(block, wallInventoryModelId);
    }

    /**
     * Registers a block with one overlay texture for buttons.
     *
     * @param block The block to register.
     * @param textureMap The texture map containing the overlay texture.
     * @param blockStateModelGenerator The block state model generator.
     */
    private static void oneOverlayButton(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator) {
        Identifier buttonModelId = ModModels.BUTTON_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier buttonPressedModelId = ModModels.BUTTON_PRESSED_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier buttonInventoryModelId = ModModels.BUTTON_INVENTORY_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createButtonBlockState(block, buttonModelId, buttonPressedModelId));
        blockStateModelGenerator.registerParentedItemModel(block, buttonInventoryModelId);
    }

    /**
     * Registers a block with one overlay texture for pressure plates.
     *
     * @param block The block to register.
     * @param textureMap The texture map containing the overlay texture.
     * @param blockStateModelGenerator The block state model generator.
     */
    private static void oneOverlayPressurePlate(Block block, TextureMap textureMap,
            BlockStateModelGenerator blockStateModelGenerator) {
        Identifier pressurePlateUpModelId =  ModModels.PRESSURE_PLATE_UP_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
        Identifier pressurePlateDownModelId = ModModels.PRESSURE_PLATE_DOWN_ALL_OVERLAY.upload(block, textureMap,
                        blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(block, pressurePlateUpModelId, pressurePlateDownModelId));
        blockStateModelGenerator.registerParentedItemModel(block, pressurePlateUpModelId);
    }
}