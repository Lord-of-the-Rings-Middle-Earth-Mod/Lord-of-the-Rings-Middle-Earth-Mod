/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.datagen;

import com.anedhel.vext.VExtMod;
import com.anedhel.vext.block.ModBlocks;
import com.anedhel.vext.block.custom.ModPillarBlock;
import com.anedhel.vext.block.custom.ModPillarType;
import com.anedhel.vext.block.custom.crops.CornCropBlock;
import com.anedhel.vext.block.custom.ModFriezeBlock;
import com.anedhel.vext.block.custom.ModFriezeType;
import com.anedhel.vext.block.custom.crops.TomatoCropBlock;
import com.anedhel.vext.block.stonetypes.ModStoneSubSet;
import com.anedhel.vext.block.stonetypes.ModStoneTypes;
import com.anedhel.vext.block.woodtypes.ModWoodSet;
import com.anedhel.vext.block.woodtypes.ModWoodTypes;
import com.anedhel.vext.block.stonetypes.ModStoneSet;
import com.anedhel.vext.datagen.util.ModModels;
import com.anedhel.vext.datagen.util.ModTextureKeys;
import com.anedhel.vext.datagen.util.ModTextures;
import com.anedhel.vext.item.ModGearType;
import com.anedhel.vext.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.util.Identifier;

import java.util.Optional;
import java.util.function.Function;

import static net.minecraft.client.data.BlockStateModelGenerator.*;

/**
 * Data generator for block and item models.
 *
 * @author Moritz Rohleder, AnoJedt
 * @since 0.1.0
 */
public class ModModelProvider extends FabricModelProvider {

	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	/**
	 * Generates block state models for mod blocks.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 */
	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		generateModWoodTypeBlockStateModels(blockStateModelGenerator);
		generateModStoneTypeBlockStateModels(blockStateModelGenerator);

		blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
		blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_TOMATO, ModBlocks.POTTED_WILD_TOMATO, BlockStateModelGenerator.CrossType.NOT_TINTED);
		blockStateModelGenerator.registerCrop(ModBlocks.CORN_CROP, CornCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8);
		blockStateModelGenerator.registerDoubleBlockAndItem(ModBlocks.WILD_CORN, CrossType.NOT_TINTED);

		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SILVER_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVER_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_BLOCK);
	}

	/**
	 * Generates item models for mod items.
	 *
	 * @param itemModelGenerator the {@link ItemModelGenerator}.
	 */
	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		generateModGearTypeItemModels(itemModelGenerator);
		generateModWoodTypeItemModels(itemModelGenerator);

		itemModelGenerator.register(ModItems.OAK_BARK, Models.GENERATED);
		itemModelGenerator.register(ModItems.BIRCH_BARK, Models.GENERATED);
		itemModelGenerator.register(ModItems.SPRUCE_BARK, Models.GENERATED);
		itemModelGenerator.register(ModItems.JUNGLE_BARK, Models.GENERATED);
		itemModelGenerator.register(ModItems.ACACIA_BARK, Models.GENERATED);
		itemModelGenerator.register(ModItems.DARK_OAK_BARK, Models.GENERATED);
		itemModelGenerator.register(ModItems.PALE_OAK_BARK, Models.GENERATED);
		itemModelGenerator.register(ModItems.CHERRY_BARK, Models.GENERATED);
		itemModelGenerator.register(ModItems.MANGROVE_BARK, Models.GENERATED);
		itemModelGenerator.register(ModItems.BAMBOO_BARK, Models.GENERATED);
		itemModelGenerator.register(ModItems.WARPED_BARK, Models.GENERATED);
		itemModelGenerator.register(ModItems.CRIMSON_BARK, Models.GENERATED);

		itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
		itemModelGenerator.register(ModItems.BAKED_TOMATO, Models.GENERATED);
		itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
		itemModelGenerator.register(ModItems.COOKED_CORN, Models.GENERATED);

		itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
		itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
		itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
		itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
		itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);

		itemModelGenerator.register(ModItems.HOBBIT_SPAWN_EGG,
				new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
	}

	/**
	 * Generates item models for all mod wood types.
	 *
	 * @param itemModelGenerator the {@link ItemModelGenerator}
	 */
	private void generateModWoodTypeItemModels(ItemModelGenerator itemModelGenerator) {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();
			itemModelGenerator.register(woodSet.getBark(), Models.GENERATED);
		}
	}

	/**
	 * Generates block state models for all mod wood types.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 */
	private void generateModWoodTypeBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();
			blockStateModelGenerator.createLogTexturePool(woodSet.getLog()).log(woodSet.getLog());
			BlockStateModelGenerator.BlockTexturePool pineWoodTexturePool =
					blockStateModelGenerator.registerCubeAllModelTexturePool(woodSet.getWoodVariant("base"));
			pineWoodTexturePool.family(woodSet.getWoodFamily());

			blockStateModelGenerator.createLogTexturePool(woodSet.getStrippedLog()).log(woodSet.getStrippedLog());
			BlockStateModelGenerator.BlockTexturePool strippedPineWoodTexturePool =
					blockStateModelGenerator.registerCubeAllModelTexturePool(woodSet.getStrippedWoodVariant("base"));
			strippedPineWoodTexturePool.family(woodSet.getStrippedWoodFamily());

			BlockStateModelGenerator.BlockTexturePool pinePlanksTexturePool =
					blockStateModelGenerator.registerCubeAllModelTexturePool(woodSet.getPlanksVariant("base"));
			pinePlanksTexturePool.family(woodSet.getPlanksFamily());

			blockStateModelGenerator.registerSingleton(woodSet.getLeaves(), TexturedModel.LEAVES);
			blockStateModelGenerator.registerTintableCrossBlockState(woodSet.getSapling(),
					CrossType.NOT_TINTED);
		}
	}

	/**
	 * Generates block state models for all mod stone types.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 */
	private void generateModStoneTypeBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		for(ModStoneTypes stoneType : ModStoneTypes.values()) {
			ModStoneSet stoneSet = stoneType.getModStoneSet();

			blockStateModelGenerator.registerCubeAllModelTexturePool(stoneSet.getStoneVariant("base"))
					.family(stoneSet.getStoneFamily());
			registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneSet.getStoneVariant("base"),
					stoneSet.getMossyStoneFamily(), ModTextures.MOSSY_OVERLAY_ONE.getTextureName());
			registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneSet.getStoneVariant("base"),
					stoneSet.getOvergrownStoneFamily(), "overgrown_overlay");

			blockStateModelGenerator.registerCubeAllModelTexturePool(stoneSet.getCobbledVariant("base"))
					.family(stoneSet.getCobbledFamily());
			registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneSet.getCobbledVariant("base"),
					stoneSet.getMossyCobbledFamily(), "mossy_overlay_one");
			registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneSet.getCobbledVariant("base"),
					stoneSet.getOvergrownCobbledFamily(), "overgrown_overlay");

			blockStateModelGenerator.registerCubeAllModelTexturePool(stoneSet.getSmoothVariant("base"))
					.family(stoneSet.getSmoothFamily());
			registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneSet.getSmoothVariant("base"),
					stoneSet.getMossySmoothFamily(), "mossy_overlay_one");
			registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneSet.getSmoothVariant("base"),
					stoneSet.getOvergrownSmoothFamily(), "overgrown_overlay");

			blockStateModelGenerator.registerCubeAllModelTexturePool(stoneSet.getCrackedSmoothVariant("base"))
					.family(stoneSet.getCrackedSmoothFamily());
			registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneSet.getCrackedSmoothVariant("base"),
					stoneSet.getMossyCrackedSmoothFamily(), "mossy_overlay_one");
			registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, stoneSet.getCrackedSmoothVariant("base"),
					stoneSet.getOvergrownCrackedSmoothFamily(), "overgrown_overlay");

			generatePolishedSubSetBlockStateModels(blockStateModelGenerator, stoneSet.getPolishedSet());

			generatePillarSubSetBlockStateModels(blockStateModelGenerator, stoneSet.getPillarSet(),
					"bronze_pillar","silver_pillar","gold_pillar");

			generateFriezeSubSetBlockStateModels(blockStateModelGenerator, stoneSet.getFriezeSet(),
					stoneSet.getPolishedSet(), "bronze_frieze", "silver_frieze", "gold_frieze");

			generateCubeAllSubSetBlockStateModels(blockStateModelGenerator, stoneSet.getCobbledBrickSet(),
					ModTextures.BRONZE_COBBLED_BRICK_OVERLAY, ModTextures.SILVER_COBBLED_BRICK_OVERLAY,
					ModTextures.GOLD_COBBLED_BRICK_OVERLAY, ModTextures.MOSSY_OVERLAY_THREE);

			generateCubeAllSubSetBlockStateModels(blockStateModelGenerator, stoneSet.getRusticBrickSet(),
					ModTextures.BRONZE_BRICK_OVERLAY, ModTextures.SILVER_BRICK_OVERLAY,
					ModTextures.GOLD_BRICK_OVERLAY, ModTextures.MOSSY_OVERLAY_ONE);

			generateCubeAllSubSetBlockStateModels(blockStateModelGenerator, stoneSet.getBrickSet(),
					ModTextures.BRONZE_BRICK_OVERLAY, ModTextures.SILVER_BRICK_OVERLAY,
					ModTextures.GOLD_BRICK_OVERLAY, ModTextures.MOSSY_OVERLAY_ONE);

			generateCubeAllSubSetBlockStateModels(blockStateModelGenerator, stoneSet.getTileSet(),
					ModTextures.BRONZE_TILES_OVERLAY, ModTextures.SILVER_TILES_OVERLAY,
					ModTextures.GOLD_TILES_OVERLAY, ModTextures.MOSSY_OVERLAY_TWO);

			generatePavementSubSetBlockStateModels(blockStateModelGenerator, stoneSet.getPavementSet(),
					stoneSet.getTileSet().getBaseFamilyVariant("base"),
					stoneSet.getTileSet().getCrackedFamilyVariant("base"));

			generateCubeAllSubSetBlockStateModels(blockStateModelGenerator, stoneSet.getFancyBrickSet(),
					ModTextures.BRONZE_FANCY_BRICKS_OVERLAY, ModTextures.SILVER_FANCY_BRICKS_OVERLAY,
					ModTextures.GOLD_FANCY_BRICKS_OVERLAY, ModTextures.MOSSY_OVERLAY_TWO);
		}
	}

	/**
	 * Generates item models for all mod gear types.
	 *
	 * @param itemModelGenerator the {@link ItemModelGenerator}
	 */
	private void generateModGearTypeItemModels(ItemModelGenerator itemModelGenerator) {
		for(ModGearType gearType : ModGearType.values()) {
			itemModelGenerator.register(gearType.getMaterial(), Models.GENERATED);

			itemModelGenerator.register(gearType.getSword(), Models.HANDHELD);
			itemModelGenerator.register(gearType.getAxe(), Models.HANDHELD);
			itemModelGenerator.register(gearType.getPickaxe(), Models.HANDHELD);
			itemModelGenerator.register(gearType.getShovel(), Models.HANDHELD);
			itemModelGenerator.register(gearType.getHoe(), Models.HANDHELD);

			itemModelGenerator.registerArmor(gearType.getHelmet(), gearType.getArmorMaterialKey(),
					ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
			itemModelGenerator.registerArmor(gearType.getChestplate(), gearType.getArmorMaterialKey(),
					ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
			itemModelGenerator.registerArmor(gearType.getLeggings(), gearType.getArmorMaterialKey(),
					ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
			itemModelGenerator.registerArmor(gearType.getBoots(), gearType.getArmorMaterialKey(),
					ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
		}
	}

	/**
	 * Generates block state models for polished stone sub sets.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param subSet                   the {@link ModStoneSubSet}
	 */
	private void generatePolishedSubSetBlockStateModels(BlockStateModelGenerator blockStateModelGenerator,
			ModStoneSubSet subSet) {

		registerPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"));
		registerOneOverlayPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), subSet.getMossyFamilyVariant("base"),
				subSet.getMossyFamilyVariant("slab"),
				false, ModTextures.MOSSY_OVERLAY_ONE);
		registerOneOverlayPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), subSet.getOvergrownFamilyVariant("base"),
				subSet.getOvergrownFamilyVariant("slab"),
				false, ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), subSet.getBronzeFamilyVariant("base"),
				subSet.getBronzeFamilyVariant("slab"),
				true, ModTextures.BRONZE_POLISHED_OVERLAY, ModTextures.BRONZE_POLISHED_SLAB_OVERLAY);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), subSet.getMossyBronzeFamilyVariant("base"),
				subSet.getMossyBronzeFamilyVariant("slab"),
				ModTextures.BRONZE_POLISHED_OVERLAY, ModTextures.BRONZE_POLISHED_SLAB_OVERLAY,
				ModTextures.MOSSY_OVERLAY_ONE);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), subSet.getOvergrownBronzeFamilyVariant("base"),
				subSet.getOvergrownBronzeFamilyVariant("slab"),
				ModTextures.BRONZE_POLISHED_OVERLAY, ModTextures.BRONZE_POLISHED_SLAB_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), subSet.getSilverFamilyVariant("base"),
				subSet.getSilverFamilyVariant("slab"), true,
				ModTextures.SILVER_POLISHED_OVERLAY, ModTextures.SILVER_POLISHED_SLAB_OVERLAY);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), subSet.getMossySilverFamilyVariant("base"),
				subSet.getMossySilverFamilyVariant("slab"),
				ModTextures.SILVER_POLISHED_OVERLAY, ModTextures.SILVER_POLISHED_SLAB_OVERLAY,
				ModTextures.MOSSY_OVERLAY_ONE);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), subSet.getOvergrownSilverFamilyVariant("base"),
				subSet.getOvergrownSilverFamilyVariant("slab"),
				ModTextures.SILVER_POLISHED_OVERLAY, ModTextures.SILVER_POLISHED_SLAB_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), subSet.getGoldFamilyVariant("base"),
				subSet.getGoldFamilyVariant("slab"), true,
				ModTextures.GOLD_POLISHED_OVERLAY, ModTextures.GOLD_POLISHED_SLAB_OVERLAY);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), subSet.getMossyGoldFamilyVariant("base"),
				subSet.getMossyGoldFamilyVariant("slab"),
				ModTextures.GOLD_POLISHED_OVERLAY, ModTextures.GOLD_POLISHED_SLAB_OVERLAY,
				ModTextures.MOSSY_OVERLAY_ONE);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), subSet.getOvergrownGoldFamilyVariant("base"),
				subSet.getOvergrownGoldFamilyVariant("slab"),
				ModTextures.GOLD_POLISHED_OVERLAY, ModTextures.GOLD_POLISHED_SLAB_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);

		registerPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"));
		registerOneOverlayPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), subSet.getMossyCrackedFamilyVariant("base"),
				subSet.getMossyCrackedFamilyVariant("slab"),
				false, ModTextures.MOSSY_OVERLAY_ONE);
		registerOneOverlayPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), subSet.getOvergrownCrackedFamilyVariant("base"),
				subSet.getOvergrownCrackedFamilyVariant("slab"),
				false, ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), subSet.getCrackedBronzeFamilyVariant("base"),
				subSet.getCrackedBronzeFamilyVariant("slab"),
				true, ModTextures.CRACKED_BRONZE_POLISHED_OVERLAY, ModTextures.CRACKED_BRONZE_POLISHED_SLAB_OVERLAY);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), subSet.getMossyCrackedBronzeFamilyVariant("base"),
				subSet.getMossyCrackedBronzeFamilyVariant("slab"),
				ModTextures.CRACKED_BRONZE_POLISHED_OVERLAY, ModTextures.CRACKED_BRONZE_POLISHED_SLAB_OVERLAY,
				ModTextures.MOSSY_OVERLAY_ONE);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), subSet.getOvergrownCrackedBronzeFamilyVariant("base"),
				subSet.getOvergrownCrackedBronzeFamilyVariant("slab"),
				ModTextures.CRACKED_BRONZE_POLISHED_OVERLAY, ModTextures.CRACKED_BRONZE_POLISHED_SLAB_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), subSet.getCrackedSilverFamilyVariant("base"),
				subSet.getCrackedSilverFamilyVariant("slab"), true,
				ModTextures.CRACKED_SILVER_POLISHED_OVERLAY, ModTextures.CRACKED_SILVER_POLISHED_SLAB_OVERLAY);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), subSet.getMossyCrackedSilverFamilyVariant("base"),
				subSet.getMossyCrackedSilverFamilyVariant("slab"),
				ModTextures.CRACKED_SILVER_POLISHED_OVERLAY, ModTextures.CRACKED_SILVER_POLISHED_SLAB_OVERLAY,
				ModTextures.MOSSY_OVERLAY_ONE);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), subSet.getOvergrownCrackedSilverFamilyVariant("base"),
				subSet.getOvergrownCrackedSilverFamilyVariant("slab"),
				ModTextures.CRACKED_SILVER_POLISHED_OVERLAY, ModTextures.CRACKED_SILVER_POLISHED_SLAB_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), subSet.getCrackedGoldFamilyVariant("base"),
				subSet.getCrackedGoldFamilyVariant("slab"), true,
				ModTextures.CRACKED_GOLD_POLISHED_OVERLAY, ModTextures.CRACKED_GOLD_POLISHED_SLAB_OVERLAY);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), subSet.getMossyCrackedGoldFamilyVariant("base"),
				subSet.getMossyCrackedGoldFamilyVariant("slab"),
				ModTextures.CRACKED_GOLD_POLISHED_OVERLAY, ModTextures.CRACKED_GOLD_POLISHED_SLAB_OVERLAY,
				ModTextures.MOSSY_OVERLAY_ONE);
		registerTwoOverlayPolishedStone(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), subSet.getOvergrownCrackedGoldFamilyVariant("base"),
				subSet.getOvergrownCrackedGoldFamilyVariant("slab"),
				ModTextures.CRACKED_GOLD_POLISHED_OVERLAY, ModTextures.CRACKED_GOLD_POLISHED_SLAB_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);
	}

	/**
	 * Generates block state models for pillar stone sub sets.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param subSet 				 the {@link ModStoneSubSet}
	 * @param bronze the name for the bronze overlay texture without the face-suffix
	 * @param silver the name for the silver overlay texture without the face-suffix
	 * @param gold the name for the gold overlay texture without the face-suffix
	 * @see ModTextures
	 */
	private void generatePillarSubSetBlockStateModels(BlockStateModelGenerator blockStateModelGenerator,
			ModStoneSubSet subSet, String bronze, String silver, String gold) {
		String topTexture = subSet.getBaseFamilyVariant("base").getTranslationKey()
				.substring(subSet.getBaseFamilyVariant("base").getTranslationKey().indexOf('.')+6)
				.concat("_end");
		String sideTexture = subSet.getBaseFamilyVariant("base").getTranslationKey()
				.substring(subSet.getBaseFamilyVariant("base").getTranslationKey().indexOf('.')+6)
				.concat("_side");

		registerPillarBlock(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBaseFamilyVariant("slab"), topTexture, sideTexture);
		registerOneOverlayPillarBlock(blockStateModelGenerator, subSet.getMossyFamilyVariant("base"),
				subSet.getMossyFamilyVariant("slab"), topTexture, sideTexture,
				false, ModTextures.MOSSY_OVERLAY_TWO.getTextureName());
		registerOneOverlayPillarBlock(blockStateModelGenerator, subSet.getOvergrownFamilyVariant("base"),
				subSet.getOvergrownFamilyVariant("slab"), topTexture, sideTexture,
				false, ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerOneOverlayPillarBlock(blockStateModelGenerator, subSet.getBronzeFamilyVariant("base"),
				subSet.getBronzeFamilyVariant("slab"), topTexture,
				sideTexture, true, bronze);
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getMossyBronzeFamilyVariant("base"),
				subSet.getMossyBronzeFamilyVariant("slab"), topTexture,
				sideTexture, bronze,
				ModTextures.MOSSY_OVERLAY_TWO.getTextureName());
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getOvergrownBronzeFamilyVariant("base"),
				subSet.getOvergrownBronzeFamilyVariant("slab"), topTexture, sideTexture, bronze,
				ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerOneOverlayPillarBlock(blockStateModelGenerator, subSet.getSilverFamilyVariant("base"),
				subSet.getSilverFamilyVariant("slab"), topTexture, sideTexture, true,
				silver);
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getMossySilverFamilyVariant("base"),
				subSet.getMossySilverFamilyVariant("slab"), topTexture, sideTexture,
				silver,
				ModTextures.MOSSY_OVERLAY_TWO.getTextureName());
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getOvergrownSilverFamilyVariant("base"),
				subSet.getOvergrownSilverFamilyVariant("slab"), topTexture, sideTexture,
				silver,
				ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerOneOverlayPillarBlock(blockStateModelGenerator, subSet.getGoldFamilyVariant("base"),
				subSet.getGoldFamilyVariant("slab"), topTexture, sideTexture, true,
				gold);
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getMossyGoldFamilyVariant("base"),
				subSet.getMossyGoldFamilyVariant("slab"), topTexture, sideTexture,
				gold,
				ModTextures.MOSSY_OVERLAY_TWO.getTextureName());
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getOvergrownGoldFamilyVariant("base"),
				subSet.getOvergrownGoldFamilyVariant("slab"), topTexture, sideTexture,
				gold,
				ModTextures.OVERGROWN_OVERLAY.getTextureName());

		String crackedTopTexture = subSet.getCrackedFamilyVariant("base").getTranslationKey()
				.substring(subSet.getCrackedFamilyVariant("base").getTranslationKey().indexOf('.')+6)
				.concat("_end");
		String crackedSideTexture = subSet.getCrackedFamilyVariant("base").getTranslationKey()
				.substring(subSet.getCrackedFamilyVariant("base").getTranslationKey().indexOf('.')+6)
				.concat("_side");

		registerPillarBlock(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedFamilyVariant("slab"), crackedTopTexture, crackedSideTexture);
		registerOneOverlayPillarBlock(blockStateModelGenerator, subSet.getMossyCrackedFamilyVariant("base"),
				subSet.getMossyCrackedFamilyVariant("slab"), crackedTopTexture, crackedSideTexture,
				false, ModTextures.MOSSY_OVERLAY_TWO.getTextureName());
		registerOneOverlayPillarBlock(blockStateModelGenerator, subSet.getOvergrownCrackedFamilyVariant("base"),
				subSet.getOvergrownCrackedFamilyVariant("slab"), crackedTopTexture, crackedSideTexture,
				false, ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerOneOverlayPillarBlock(blockStateModelGenerator, subSet.getCrackedBronzeFamilyVariant("base"),
				subSet.getCrackedBronzeFamilyVariant("slab"), crackedTopTexture,
				crackedSideTexture, true, bronze);
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getMossyCrackedBronzeFamilyVariant("base"),
				subSet.getMossyCrackedBronzeFamilyVariant("slab"), crackedTopTexture,
				crackedSideTexture, bronze,
				ModTextures.MOSSY_OVERLAY_TWO.getTextureName());
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getOvergrownCrackedBronzeFamilyVariant("base"),
				subSet.getOvergrownCrackedBronzeFamilyVariant("slab"), crackedTopTexture, crackedSideTexture, bronze,
				ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerOneOverlayPillarBlock(blockStateModelGenerator, subSet.getCrackedSilverFamilyVariant("base"),
				subSet.getCrackedSilverFamilyVariant("slab"), crackedTopTexture, crackedSideTexture, true,
				silver);
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getMossyCrackedSilverFamilyVariant("base"),
				subSet.getMossyCrackedSilverFamilyVariant("slab"), crackedTopTexture, crackedSideTexture,
				silver,
				ModTextures.MOSSY_OVERLAY_TWO.getTextureName());
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getOvergrownCrackedSilverFamilyVariant("base"),
				subSet.getOvergrownCrackedSilverFamilyVariant("slab"), crackedTopTexture, crackedSideTexture,
				silver,
				ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerOneOverlayPillarBlock(blockStateModelGenerator, subSet.getCrackedGoldFamilyVariant("base"),
				subSet.getCrackedGoldFamilyVariant("slab"), crackedTopTexture, crackedSideTexture, true,
				gold);
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getMossyCrackedGoldFamilyVariant("base"),
				subSet.getMossyCrackedGoldFamilyVariant("slab"), crackedTopTexture, crackedSideTexture,
				gold,
				ModTextures.MOSSY_OVERLAY_TWO.getTextureName());
		registerTwoOverlayPillarBlock(blockStateModelGenerator, subSet.getOvergrownCrackedGoldFamilyVariant("base"),
				subSet.getOvergrownCrackedGoldFamilyVariant("slab"), crackedTopTexture, crackedSideTexture,
				gold,
				ModTextures.OVERGROWN_OVERLAY.getTextureName());
	}

	/**
	 * Generates block state models for frieze stone sub sets.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param friezeSet 				 the {@link ModStoneSubSet} containing the frieze blocks
	 * @param polishedSet				 the {@link ModStoneSubSet} containing the polished blocks for the end texture
	 * @param bronze the name for the bronze overlay texture without the face-suffix
	 * @param silver the name for the silver overlay texture without the face-suffix
	 * @param gold the name for the gold overlay texture without the face-suffix
	 * @see ModTextures
	 */
	private void generateFriezeSubSetBlockStateModels(BlockStateModelGenerator blockStateModelGenerator,
		  ModStoneSubSet friezeSet, ModStoneSubSet polishedSet, String bronze, String silver, String gold) {
		String endTexture = polishedSet.getBaseFamilyVariant("base").getTranslationKey()
				.substring(polishedSet.getBaseFamilyVariant("base").getTranslationKey().indexOf('.')+6);
		String northTexture = friezeSet.getBaseFamilyVariant("base").getTranslationKey()
				.substring(friezeSet.getBaseFamilyVariant("base").getTranslationKey().indexOf('.')+6);
		String eastTexture = friezeSet.getBaseFamilyVariant("base").getTranslationKey()
				.substring(friezeSet.getBaseFamilyVariant("base").getTranslationKey().indexOf('.')+6);
		String southTexture = friezeSet.getBaseFamilyVariant("base").getTranslationKey()
				.substring(friezeSet.getBaseFamilyVariant("base").getTranslationKey().indexOf('.')+6);
		String westTexture = friezeSet.getBaseFamilyVariant("base").getTranslationKey()
				.substring(friezeSet.getBaseFamilyVariant("base").getTranslationKey().indexOf('.')+6);

		registerFriezeBlock(blockStateModelGenerator, friezeSet.getBaseFamilyVariant("base"),
				friezeSet.getBaseFamilyVariant("slab"), endTexture, northTexture, eastTexture, southTexture, westTexture);
		registerOneOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getMossyFamilyVariant("base"),
				friezeSet.getMossyFamilyVariant("slab"), endTexture, northTexture, eastTexture, southTexture,
				westTexture, false, ModTextures.MOSSY_OVERLAY_ONE.getTextureName());
		registerOneOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getOvergrownFamilyVariant("base"),
				friezeSet.getOvergrownFamilyVariant("slab"), endTexture, northTexture, eastTexture, southTexture,
				westTexture, false, ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerOneOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getBronzeFamilyVariant("base"),
				friezeSet.getBronzeFamilyVariant("slab"), endTexture, northTexture, eastTexture, southTexture,
				westTexture, true, bronze);
		registerOneOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getSilverFamilyVariant("base"),
				friezeSet.getSilverFamilyVariant("slab"), endTexture, northTexture, eastTexture, southTexture,
				westTexture,true, silver);
		registerOneOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getGoldFamilyVariant("base"),
				friezeSet.getGoldFamilyVariant("slab"), endTexture, northTexture, eastTexture, southTexture,
				westTexture, true, gold);
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getMossyBronzeFamilyVariant("base"),
				friezeSet.getMossyBronzeFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true, bronze, ModTextures.MOSSY_OVERLAY_ONE.getTextureName());
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getOvergrownBronzeFamilyVariant("base"),
				friezeSet.getOvergrownBronzeFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true, bronze, ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getMossySilverFamilyVariant("base"),
				friezeSet.getMossySilverFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true, silver, ModTextures.MOSSY_OVERLAY_ONE.getTextureName());
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getOvergrownSilverFamilyVariant("base"),
				friezeSet.getOvergrownSilverFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true, silver, ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getMossyGoldFamilyVariant("base"),
				friezeSet.getMossyGoldFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true, gold, ModTextures.MOSSY_OVERLAY_ONE.getTextureName());
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getOvergrownGoldFamilyVariant("base"),
				friezeSet.getOvergrownGoldFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true, gold, ModTextures.OVERGROWN_OVERLAY.getTextureName());

		String crackedEndTexture = polishedSet.getCrackedFamilyVariant("base").getTranslationKey()
				.substring(polishedSet.getCrackedFamilyVariant("base").getTranslationKey().indexOf('.')+6);
		String crackedNorthTexture = friezeSet.getCrackedFamilyVariant("base").getTranslationKey()
				.substring(friezeSet.getCrackedFamilyVariant("base").getTranslationKey().indexOf('.')+6);
		String crackedEastTexture = friezeSet.getCrackedFamilyVariant("base").getTranslationKey()
				.substring(friezeSet.getCrackedFamilyVariant("base").getTranslationKey().indexOf('.')+6);
		String crackedSouthTexture = friezeSet.getCrackedFamilyVariant("base").getTranslationKey()
				.substring(friezeSet.getCrackedFamilyVariant("base").getTranslationKey().indexOf('.')+6);
		String crackedWestTexture = friezeSet.getCrackedFamilyVariant("base").getTranslationKey()
				.substring(friezeSet.getCrackedFamilyVariant("base").getTranslationKey().indexOf('.')+6);

		registerFriezeBlock(blockStateModelGenerator, friezeSet.getCrackedFamilyVariant("base"),
				friezeSet.getCrackedFamilyVariant("slab"), crackedEndTexture, crackedNorthTexture, crackedEastTexture,
				 crackedSouthTexture, crackedWestTexture);
		registerOneOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getMossyCrackedFamilyVariant("base"),
				friezeSet.getMossyCrackedFamilyVariant("slab"), crackedEndTexture, crackedNorthTexture, crackedEastTexture,
				crackedSouthTexture, crackedWestTexture, false, ModTextures.MOSSY_OVERLAY_ONE.getTextureName());
		registerOneOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getOvergrownCrackedFamilyVariant("base"),
				friezeSet.getOvergrownCrackedFamilyVariant("slab"), crackedEndTexture, crackedNorthTexture, crackedEastTexture,
				crackedSouthTexture, crackedWestTexture, false, ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerOneOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getCrackedBronzeFamilyVariant("base"),
				friezeSet.getCrackedBronzeFamilyVariant("slab"), crackedEndTexture, crackedNorthTexture, crackedEastTexture, crackedSouthTexture,
				crackedWestTexture, true, "cracked_" + bronze);
		registerOneOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getCrackedSilverFamilyVariant("base"),
				friezeSet.getCrackedSilverFamilyVariant("slab"), crackedEndTexture, crackedNorthTexture, crackedEastTexture,
				crackedSouthTexture, crackedWestTexture, true, "cracked_" + silver);
		registerOneOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getCrackedGoldFamilyVariant("base"),
				friezeSet.getCrackedGoldFamilyVariant("slab"), crackedEndTexture, crackedNorthTexture, crackedEastTexture,
				crackedSouthTexture, crackedWestTexture, true, "cracked_" + gold);
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getMossyCrackedBronzeFamilyVariant("base"),
				friezeSet.getMossyCrackedBronzeFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true, "cracked_" + bronze, ModTextures.MOSSY_OVERLAY_ONE.getTextureName());
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getOvergrownCrackedBronzeFamilyVariant("base"),
				friezeSet.getOvergrownCrackedBronzeFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true, "cracked_" + bronze, ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getMossyCrackedSilverFamilyVariant("base"),
				friezeSet.getMossyCrackedSilverFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true,"cracked_" +  silver, ModTextures.MOSSY_OVERLAY_ONE.getTextureName());
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getOvergrownCrackedSilverFamilyVariant("base"),
				friezeSet.getOvergrownCrackedSilverFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true, "cracked_" + silver, ModTextures.OVERGROWN_OVERLAY.getTextureName());
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getMossyCrackedGoldFamilyVariant("base"),
				friezeSet.getMossyCrackedGoldFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true, "cracked_" + gold, ModTextures.MOSSY_OVERLAY_ONE.getTextureName());
		registerTwoOverlayFriezeBlock(blockStateModelGenerator, friezeSet.getOvergrownCrackedGoldFamilyVariant("base"),
				friezeSet.getOvergrownCrackedGoldFamilyVariant("slab"), endTexture,  northTexture, eastTexture, southTexture,
				westTexture, true, "cracked_" + gold, ModTextures.OVERGROWN_OVERLAY.getTextureName());
	}

	/**
	 * Generates block state models for cube all stone sub sets with overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param subSet 				 the {@link ModStoneSubSet}
	 * @param bronzeOverlay the name for the bronze overlay texture
	 * @param silverOverlay the name for the silver overlay texture
	 * @param goldOverlay the name for the gold overlay texture
	 * @param mossyOverlay the name for the mossy overlay texture
	 * @see ModTextures
	 */
	private void generateCubeAllSubSetBlockStateModels(BlockStateModelGenerator blockStateModelGenerator,
			ModStoneSubSet subSet, ModTextures bronzeOverlay, ModTextures silverOverlay, ModTextures goldOverlay,
			ModTextures mossyOverlay) {
		blockStateModelGenerator.registerCubeAllModelTexturePool(subSet.getBaseFamilyVariant("base"))
				.family(subSet.getBaseFamily());
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getMossyFamily(), mossyOverlay);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getOvergrownFamily(), ModTextures.OVERGROWN_OVERLAY);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getBronzeFamily(), bronzeOverlay);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getMossyBronzeFamily(), bronzeOverlay, mossyOverlay);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getOvergrownBronzeFamily(), bronzeOverlay, ModTextures.OVERGROWN_OVERLAY);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getSilverFamily(), silverOverlay);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getMossySilverFamily(), silverOverlay, mossyOverlay);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getOvergrownSilverFamily(), silverOverlay, ModTextures.OVERGROWN_OVERLAY);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getGoldFamily(), goldOverlay);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getMossyGoldFamily(), goldOverlay, mossyOverlay);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getBaseFamilyVariant("base"),
				subSet.getOvergrownGoldFamily(), goldOverlay, ModTextures.OVERGROWN_OVERLAY);

		blockStateModelGenerator.registerCubeAllModelTexturePool(subSet.getCrackedFamilyVariant("base"))
				.family(subSet.getCrackedFamily());
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getMossyCrackedFamily(), mossyOverlay);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getOvergrownCrackedFamily(), ModTextures.OVERGROWN_OVERLAY);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedBronzeFamily(), bronzeOverlay.getCrackedVariant());
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getMossyCrackedBronzeFamily(), bronzeOverlay.getCrackedVariant(), mossyOverlay);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getOvergrownCrackedBronzeFamily(), bronzeOverlay.getCrackedVariant(), ModTextures.OVERGROWN_OVERLAY);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedSilverFamily(), silverOverlay.getCrackedVariant());
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getMossyCrackedSilverFamily(), silverOverlay.getCrackedVariant(), mossyOverlay);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getOvergrownCrackedSilverFamily(), silverOverlay.getCrackedVariant(), ModTextures.OVERGROWN_OVERLAY);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getCrackedGoldFamily(), goldOverlay.getCrackedVariant());
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getMossyCrackedGoldFamily(), goldOverlay.getCrackedVariant(), mossyOverlay);
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, subSet.getCrackedFamilyVariant("base"),
				subSet.getOvergrownCrackedGoldFamily(), goldOverlay.getCrackedVariant(), ModTextures.OVERGROWN_OVERLAY);
	}

	/**
	 * Generates block state models for pavement stone sub sets with overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param subSet 				 the {@link ModStoneSubSet}
	 * @param tiles 				 the base tiles {@link Block}
	 * @param crackedTiles 		 the cracked tiles {@link Block}
	 */
	private void generatePavementSubSetBlockStateModels(BlockStateModelGenerator blockStateModelGenerator,
			ModStoneSubSet subSet, Block tiles, Block crackedTiles) {
		String topTexture = subSet.getBaseFamilyVariant("base").getTranslationKey()
				.substring(subSet.getBaseFamilyVariant("base").getTranslationKey().indexOf('.')+6);
		String sideTexture = tiles.getTranslationKey()
				.substring(tiles.getTranslationKey().indexOf('.')+6);
		registerPavement(blockStateModelGenerator, subSet.getBaseFamily(), topTexture, sideTexture);
		registerOneOverlayPavement(blockStateModelGenerator, subSet.getMossyFamily(), topTexture, sideTexture,
				ModTextures.MOSSY_OVERLAY_TWO);
		registerOneOverlayPavement(blockStateModelGenerator, subSet.getOvergrownFamily(), topTexture, sideTexture,
				ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPavement(blockStateModelGenerator, subSet.getBronzeFamily(), topTexture, sideTexture,
				ModTextures.BRONZE_TILES_OVERLAY, ModTextures.BRONZE_PAVEMENT_OVERLAY);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getMossyBronzeFamily(), topTexture, sideTexture,
				ModTextures.BRONZE_TILES_OVERLAY, ModTextures.BRONZE_PAVEMENT_OVERLAY,
				ModTextures.MOSSY_OVERLAY_TWO);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getOvergrownBronzeFamily(), topTexture, sideTexture,
				ModTextures.BRONZE_TILES_OVERLAY, ModTextures.BRONZE_PAVEMENT_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPavement(blockStateModelGenerator, subSet.getSilverFamily(), topTexture, sideTexture,
				ModTextures.SILVER_TILES_OVERLAY, ModTextures.SILVER_PAVEMENT_OVERLAY);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getMossySilverFamily(), topTexture, sideTexture,
				ModTextures.SILVER_TILES_OVERLAY, ModTextures.SILVER_PAVEMENT_OVERLAY,
				ModTextures.MOSSY_OVERLAY_TWO);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getOvergrownSilverFamily(), topTexture, sideTexture,
				ModTextures.SILVER_TILES_OVERLAY, ModTextures.SILVER_PAVEMENT_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPavement(blockStateModelGenerator, subSet.getGoldFamily(), topTexture, sideTexture,
				ModTextures.GOLD_TILES_OVERLAY, ModTextures.GOLD_PAVEMENT_OVERLAY);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getMossyGoldFamily(), topTexture, sideTexture,
				ModTextures.GOLD_TILES_OVERLAY, ModTextures.GOLD_PAVEMENT_OVERLAY,
				ModTextures.MOSSY_OVERLAY_TWO);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getOvergrownGoldFamily(), topTexture, sideTexture,
				ModTextures.GOLD_TILES_OVERLAY, ModTextures.GOLD_PAVEMENT_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);

		String crackedTopTexture = subSet.getCrackedFamilyVariant("base").getTranslationKey()
				.substring(subSet.getCrackedFamilyVariant("base").getTranslationKey().indexOf('.')+6);
		String crackedSideTexture = crackedTiles.getTranslationKey()
				.substring(crackedTiles.getTranslationKey().indexOf('.')+6);
		registerPavement(blockStateModelGenerator, subSet.getCrackedFamily(), crackedTopTexture, crackedSideTexture);
		registerOneOverlayPavement(blockStateModelGenerator, subSet.getMossyCrackedFamily(), crackedTopTexture,
				crackedSideTexture, ModTextures.MOSSY_OVERLAY_TWO);
		registerOneOverlayPavement(blockStateModelGenerator, subSet.getOvergrownCrackedFamily(), crackedTopTexture,
				crackedSideTexture, ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPavement(blockStateModelGenerator, subSet.getCrackedBronzeFamily(), crackedTopTexture,
				crackedSideTexture, ModTextures.CRACKED_BRONZE_TILES_OVERLAY, ModTextures.CRACKED_BRONZE_PAVEMENT_OVERLAY);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getMossyCrackedBronzeFamily(), crackedTopTexture,
				crackedSideTexture, ModTextures.CRACKED_BRONZE_TILES_OVERLAY, ModTextures.CRACKED_BRONZE_PAVEMENT_OVERLAY,
				ModTextures.MOSSY_OVERLAY_TWO);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getOvergrownCrackedBronzeFamily(), crackedTopTexture,
				crackedSideTexture, ModTextures.CRACKED_BRONZE_TILES_OVERLAY, ModTextures.CRACKED_BRONZE_PAVEMENT_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPavement(blockStateModelGenerator, subSet.getCrackedSilverFamily(), crackedTopTexture,
				crackedSideTexture, ModTextures.CRACKED_SILVER_TILES_OVERLAY, ModTextures.CRACKED_SILVER_PAVEMENT_OVERLAY);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getMossyCrackedSilverFamily(), crackedTopTexture,
				crackedSideTexture, ModTextures.CRACKED_SILVER_TILES_OVERLAY, ModTextures.CRACKED_SILVER_PAVEMENT_OVERLAY,
				ModTextures.MOSSY_OVERLAY_TWO);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getOvergrownCrackedSilverFamily(), crackedTopTexture,
				crackedSideTexture, ModTextures.CRACKED_SILVER_TILES_OVERLAY, ModTextures.CRACKED_SILVER_PAVEMENT_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);
		registerOneOverlayPavement(blockStateModelGenerator, subSet.getCrackedGoldFamily(), crackedTopTexture,
				crackedSideTexture, ModTextures.CRACKED_GOLD_TILES_OVERLAY, ModTextures.CRACKED_GOLD_PAVEMENT_OVERLAY);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getMossyCrackedGoldFamily(), crackedTopTexture,
				crackedSideTexture, ModTextures.CRACKED_GOLD_TILES_OVERLAY, ModTextures.CRACKED_GOLD_PAVEMENT_OVERLAY,
				ModTextures.MOSSY_OVERLAY_TWO);
		registerTwoOverlayPavement(blockStateModelGenerator, subSet.getOvergrownCrackedGoldFamily(), crackedTopTexture,
				crackedSideTexture, ModTextures.CRACKED_GOLD_TILES_OVERLAY, ModTextures.CRACKED_GOLD_PAVEMENT_OVERLAY,
				ModTextures.OVERGROWN_OVERLAY);
	}

	/**
	 * Generates block state models for cube all {@link BlockFamily} with one or two overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param baseBlock the {@link Block} that provides the base texture
	 * @param overlayFamily the {@link BlockFamily} to register the overlay models for
	 * @param textures the overlay {@link ModTextures} to use, in a comma serparated list
	 */
	private void registerCubeAllOverlayBlockFamilyModel(BlockStateModelGenerator blockStateModelGenerator,
			Block baseBlock, BlockFamily overlayFamily, ModTextures... textures){
		String[] textureNames = new String[textures.length];
		for(int i = 0; i < textures.length; i++) {
			textureNames[i] = textures[i].getTextureName();
		}
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, baseBlock, overlayFamily, textureNames);
	}

	/**
	 * Generates block state models for cube all {@link BlockFamily} with one or two overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param baseBlock the {@link Block} that provides the base texture
	 * @param overlayFamily the {@link BlockFamily} to register the overlay models for
	 * @param textures the overlay texture names to use, in a comma serparated list
	 * @see ModTextures
	 */
	private void registerCubeAllOverlayBlockFamilyModel(BlockStateModelGenerator blockStateModelGenerator,
			Block baseBlock, BlockFamily overlayFamily, String... textures) {
		TextureMap overlayTextureMap;
		if(textures.length == 2) {
			overlayTextureMap = createCubeAllOverlayTextureMap(baseBlock, textures[0], textures[1]);
			twoOverlayBlock(blockStateModelGenerator, overlayFamily.getBaseBlock(), overlayTextureMap);
			if(overlayFamily.getVariants().containsKey(BlockFamily.Variant.STAIRS)) {
				twoOverlayStairs(blockStateModelGenerator, overlayFamily.getVariant(BlockFamily.Variant.STAIRS),
						overlayTextureMap);
			} if(overlayFamily.getVariants().containsKey(BlockFamily.Variant.SLAB)) {
				twoOverlaySlab(blockStateModelGenerator, overlayFamily.getVariant(BlockFamily.Variant.SLAB),
						overlayTextureMap);
			} if (overlayFamily.getVariants().containsKey(BlockFamily.Variant.WALL)) {
				twoOverlayWall(blockStateModelGenerator, overlayFamily.getVariant(BlockFamily.Variant.WALL),
						overlayTextureMap);
			}
		} else if(textures.length == 1) {
			overlayTextureMap = createCubeAllOverlayTextureMap(baseBlock, textures[0]);
			oneOverlayBlock(blockStateModelGenerator, overlayFamily.getBaseBlock(), overlayTextureMap);
			if(overlayFamily.getVariants().containsKey(BlockFamily.Variant.STAIRS)) {
				oneOverlayStairs(blockStateModelGenerator, overlayFamily.getVariant(BlockFamily.Variant.STAIRS),
						overlayTextureMap);
			} if(overlayFamily.getVariants().containsKey(BlockFamily.Variant.SLAB)) {
				oneOverlaySlab(blockStateModelGenerator, overlayFamily.getVariant(BlockFamily.Variant.SLAB),
						overlayTextureMap);
			} if (overlayFamily.getVariants().containsKey(BlockFamily.Variant.WALL)) {
				oneOverlayWall(blockStateModelGenerator, overlayFamily.getVariant(BlockFamily.Variant.WALL),
						overlayTextureMap);
			}
			if (overlayFamily.getVariants().containsKey(BlockFamily.Variant.BUTTON)) {
				oneOverlayButton(blockStateModelGenerator, overlayFamily.getVariant(BlockFamily.Variant.BUTTON),
						overlayTextureMap);
			}
			if (overlayFamily.getVariants().containsKey(BlockFamily.Variant.PRESSURE_PLATE)) {
				oneOverlayPressurePlate(blockStateModelGenerator,
						overlayFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE), overlayTextureMap);
			}
		}

	}

	/**
	 * Generates block state models for pavement.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param blockFamily the pavement {@link BlockFamily}
	 * @param topTexture the top texture name, usually the pavement texture
	 * @param sideTexture the side texture name, usually the tile texture
	 */
	private void registerPavement (BlockStateModelGenerator blockStateModelGenerator,
			BlockFamily blockFamily,
			String topTexture,
			String sideTexture) {

		TextureMap textureMap = createPavementTextureMap(topTexture, sideTexture, false);
		Function<Block, TextureMap> texturesGetter = block -> textureMap;
		blockStateModelGenerator.registerSingleton(blockFamily.getBaseBlock(),
				TexturedModel.makeFactory(texturesGetter, Models.CUBE_TOP));

		Identifier innerStairModelId = Models.INNER_STAIRS.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier regularStairModelId = Models.STAIRS.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier outerStairModelId = Models.OUTER_STAIRS.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
				blockStateModelGenerator.modelCollector);
		WeightedVariant innerVariant = createWeightedVariant(innerStairModelId);
		WeightedVariant regularVariant = createWeightedVariant(regularStairModelId);
		WeightedVariant outerVariant = createWeightedVariant(outerStairModelId);

		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createStairsBlockState(blockFamily.getVariant(BlockFamily.Variant.STAIRS),
						innerVariant, regularVariant, outerVariant));

		Identifier slabModelId = Models.SLAB.upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier slabTopModelId = Models.SLAB_TOP.upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier doubleSlabModelId = Models.CUBE_TOP.uploadWithoutVariant(blockFamily.getVariant(
						BlockFamily.Variant.SLAB), "_double",
				textureMap, blockStateModelGenerator.modelCollector);
		WeightedVariant slabVariant = createWeightedVariant(slabModelId);
		WeightedVariant slabTopVariant = createWeightedVariant(slabTopModelId);
		WeightedVariant doubleSlabVariant = createWeightedVariant(doubleSlabModelId);

		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSlabBlockState(blockFamily.getVariant(BlockFamily.Variant.SLAB),
						slabVariant, slabTopVariant, doubleSlabVariant));
	}

	/**
	 * Generates block state models for pavement with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param blockFamily the pavement {@link BlockFamily}
	 * @param sideTexture the side texture name, usually the tile texture
	 * @param topTexture the top texture name, usually the pavement texture
	 * @param overlays the overlay {@link ModTextures} to use, in a comma serparated list
	 */
	private void registerOneOverlayPavement (BlockStateModelGenerator blockStateModelGenerator,
			BlockFamily blockFamily, String sideTexture, String topTexture, ModTextures... overlays) {
		String[] overlayNames = new String[overlays.length];
		for(int i = 0; i < overlays.length; i++) {
			overlayNames[i] = overlays[i].getTextureName();
		}
		registerOneOverlayPavement(blockStateModelGenerator, blockFamily, sideTexture, topTexture, overlayNames);
	}

	/**
	 * Generates block state models for pavement with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param blockFamily the pavement {@link BlockFamily}
	 * @param sideTexture the side texture name, usually the tile texture
	 * @param topTexture the top texture name, usually the pavement texture
	 * @param overlays the overlay texture names to use, in a comma serparated list
	 * @see ModTextures
	 */
	private void registerOneOverlayPavement (BlockStateModelGenerator blockStateModelGenerator,
			BlockFamily blockFamily, String sideTexture, String topTexture, String... overlays) {
		TextureMap textureMap = createPavementTextureMap(topTexture, sideTexture, overlays.length > 1, overlays);
		Function<Block, TextureMap> texturesGetter = block -> textureMap;
		blockStateModelGenerator.registerSingleton(blockFamily.getBaseBlock(),
				TexturedModel.makeFactory(texturesGetter, ModModels.PAVEMENT_OVERLAY));

		Identifier innerStairModelId = ModModels.PAVEMENT_INNER_STAIRS_OVERLAY
				.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
						blockStateModelGenerator.modelCollector);
		Identifier regularStairModelId = ModModels.PAVEMENT_STAIRS_OVERLAY
				.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
						blockStateModelGenerator.modelCollector);
		Identifier outerStairModelId = ModModels.PAVEMENT_OUTER_STAIRS_OVERLAY
				.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
						blockStateModelGenerator.modelCollector);
		WeightedVariant innerVariant = createWeightedVariant(innerStairModelId);
		WeightedVariant regularVariant = createWeightedVariant(regularStairModelId);
		WeightedVariant outerVariant = createWeightedVariant(outerStairModelId);

		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createStairsBlockState(blockFamily.getVariant(BlockFamily.Variant.STAIRS),
						innerVariant, regularVariant, outerVariant));

		Identifier slabModelId = ModModels.PAVEMENT_SLAB_OVERLAY
				.upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
						blockStateModelGenerator.modelCollector);
		Identifier slabTopModelId = ModModels.PAVEMENT_SLAB_TOP_OVERLAY
				.upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
						blockStateModelGenerator.modelCollector);
		Identifier doubleSlabModelId = ModModels.PAVEMENT_OVERLAY
				.uploadWithoutVariant(blockFamily.getVariant(BlockFamily.Variant.SLAB), "_double",
						textureMap, blockStateModelGenerator.modelCollector);
		WeightedVariant slabVariant = createWeightedVariant(slabModelId);
		WeightedVariant slabTopVariant = createWeightedVariant(slabTopModelId);
		WeightedVariant doubleSlabVariant = createWeightedVariant(doubleSlabModelId);

		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSlabBlockState(blockFamily.getVariant(BlockFamily.Variant.SLAB),
						slabVariant, slabTopVariant, doubleSlabVariant));
	}

	/**
	 * Generates block state models for pavement with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param blockFamily the pavement {@link BlockFamily}
	 * @param sideTexture the side texture name, usually the tile texture
	 * @param topTexture the top texture name, usually the pavement texture
	 * @param overlays the overlay {@link ModTextures} to use, in a comma serparated list
	 */
	private void registerTwoOverlayPavement (BlockStateModelGenerator blockStateModelGenerator,
			BlockFamily blockFamily, String sideTexture, String topTexture, ModTextures... overlays) {
		String[] overlayNames = new String[overlays.length];
		for(int i = 0; i < overlays.length; i++) {
			overlayNames[i] = overlays[i].getTextureName();
		}
		registerTwoOverlayPavement(blockStateModelGenerator, blockFamily, sideTexture, topTexture, overlayNames);
	}

	/**
	 * Generates block state models for pavement with two overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param blockFamily the pavement {@link BlockFamily}
	 * @param sideTexture the side texture name, usually the tile texture
	 * @param topTexture the top texture name, usually the pavement texture
	 * @param overlays the overlay texture names to use, in a comma serparated list
	 * @see ModTextures
	 */
	private void registerTwoOverlayPavement (BlockStateModelGenerator blockStateModelGenerator,
			BlockFamily blockFamily, String sideTexture, String topTexture, String... overlays) {
		TextureMap textureMap = createPavementTextureMap(topTexture, sideTexture, true, overlays);
		Function<Block, TextureMap> texturesGetter = block -> textureMap;
		blockStateModelGenerator.registerSingleton(blockFamily.getBaseBlock(),
				TexturedModel.makeFactory(texturesGetter, ModModels.PAVEMENT_TWO_OVERLAY));

		Identifier innerStairModelId = ModModels.PAVEMENT_INNER_STAIRS_TWO_OVERLAY
				.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
						blockStateModelGenerator.modelCollector);
		Identifier regularStairModelId = ModModels.PAVEMENT_STAIRS_TWO_OVERLAY
				.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
						blockStateModelGenerator.modelCollector);
		Identifier outerStairModelId = ModModels.PAVEMENT_OUTER_STAIRS_TWO_OVERLAY
				.upload(blockFamily.getVariant(BlockFamily.Variant.STAIRS), textureMap,
						blockStateModelGenerator.modelCollector);
		WeightedVariant innerVariant = createWeightedVariant(innerStairModelId);
		WeightedVariant regularVariant = createWeightedVariant(regularStairModelId);
		WeightedVariant outerVariant = createWeightedVariant(outerStairModelId);

		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createStairsBlockState(blockFamily.getVariant(BlockFamily.Variant.STAIRS),
						innerVariant, regularVariant, outerVariant));

		Identifier slabModelId = ModModels.PAVEMENT_SLAB_TWO_OVERLAY
				.upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
						blockStateModelGenerator.modelCollector);
		Identifier slabTopModelId = ModModels.PAVEMENT_SLAB_TOP_TWO_OVERLAY
				.upload(blockFamily.getVariant(BlockFamily.Variant.SLAB), textureMap,
						blockStateModelGenerator.modelCollector);
		Identifier doubleSlabModelId = ModModels.PAVEMENT_TWO_OVERLAY
				.uploadWithoutVariant(blockFamily.getVariant(BlockFamily.Variant.SLAB), "_double",
						textureMap, blockStateModelGenerator.modelCollector);
		WeightedVariant slabVariant = createWeightedVariant(slabModelId);
		WeightedVariant slabTopVariant = createWeightedVariant(slabTopModelId);
		WeightedVariant doubleSlabVariant = createWeightedVariant(doubleSlabModelId);

		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSlabBlockState(blockFamily.getVariant(BlockFamily.Variant.SLAB),
						slabVariant, slabTopVariant, doubleSlabVariant));
	}

	/**
	 * Creates a pavement texture map with overlays, if given.
	 *
	 * @param topTexture the top texture, usually the pavement texture
	 * @param sideTexture the side texture, usually the tile texture
	 * @param ornamented whether the pavement is ornamented
	 * @param overlays the overlay texture names to use, in a comma serparated list
	 * @return the created {@link TextureMap}
	 * @see ModTextures
	 */
	private TextureMap createPavementTextureMap(String topTexture, String sideTexture, boolean ornamented,
			String... overlays) {
		TextureMap textureMap = new TextureMap()
				.put(TextureKey.TOP, Identifier.of(VExtMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(VExtMod.MOD_ID, "block/" + sideTexture))
				.put(TextureKey.BOTTOM, Identifier.of(VExtMod.MOD_ID, "block/" + sideTexture))
				.put(TextureKey.PARTICLE, Identifier.of(VExtMod.MOD_ID, "block/" + topTexture));
		if(overlays.length == 1 && !ornamented) {
			textureMap.put(TextureKey.LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMap.put(ModTextureKeys.TOP_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
		} else if(overlays.length == 2 && ornamented) {
			textureMap.put(TextureKey.LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMap.put(ModTextureKeys.TOP_LAYER1, Identifier.of(VExtMod.MOD_ID, "block"
					+ "/overlays/" + overlays[1]));
		} else if(overlays.length == 3 && ornamented) {
			textureMap.put(TextureKey.LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMap.put(ModTextureKeys.TOP_LAYER1, Identifier.of(VExtMod.MOD_ID, "block"
					+ "/overlays/" + overlays[1]));
			textureMap.put(TextureKey.LAYER2, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[2]));
		}
		return textureMap;
	}

	/**
	 * Generates block state models for polished stone.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param polishedStone the polished stone {@link Block}
	 * @param polishedStoneSlab the polished stone slab {@link Block}
	 */
	private void registerPolishedStone(BlockStateModelGenerator blockStateModelGenerator, Block polishedStone, Block polishedStoneSlab) {
		TextureMap textureMap = TextureMap.all(polishedStone);
		TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(polishedStoneSlab, "_side"),
				textureMap.getTexture(TextureKey.TOP));
		Identifier identifier = Models.SLAB.upload(polishedStoneSlab, textureMap2, blockStateModelGenerator.modelCollector);
		Identifier identifier2 = Models.SLAB_TOP.upload(polishedStoneSlab, textureMap2, blockStateModelGenerator.modelCollector);
		Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(polishedStoneSlab, "_double", textureMap2,
				blockStateModelGenerator.modelCollector);
		WeightedVariant slabVariant = createWeightedVariant(identifier);
		WeightedVariant slabTopVariant = createWeightedVariant(identifier2);
		WeightedVariant doubleSlabVariant = createWeightedVariant(identifier3);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSlabBlockState(polishedStoneSlab, slabVariant,
				slabTopVariant, doubleSlabVariant));
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSingletonBlockState(polishedStone, createWeightedVariant(
						Models.CUBE_ALL.upload(polishedStone, textureMap, blockStateModelGenerator.modelCollector)
				)));
	}

	/**
	 * Generates block state models for polished stone with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param polishedStone the polished stone {@link Block}
	 * @param polishedStoneSlab the polished stone slab {@link Block}
	 * @param overlayPolishedStone the overlay polished stone {@link Block}
	 * @param overlayPolishedStoneSlab the overlay polished stone slab {@link Block}
	 * @param ornamented whether the overlay polished stone is ornamented
	 * @param overlays the overlay {@link ModTextures} to use, in a comma serparated list
	 */
	private void registerOneOverlayPolishedStone(BlockStateModelGenerator blockStateModelGenerator,
			Block polishedStone, Block polishedStoneSlab,
			Block overlayPolishedStone, Block overlayPolishedStoneSlab, boolean ornamented, ModTextures... overlays) {
		String[] overlayNames = new String[overlays.length];
		for(int i = 0; i < overlays.length; i++) {
			overlayNames[i] = overlays[i].getTextureName();
		}
		registerOneOverlayPolishedStone(blockStateModelGenerator, polishedStone, polishedStoneSlab,
				overlayPolishedStone, overlayPolishedStoneSlab, ornamented, overlayNames);
	}

	/**
	 * Generates block state models for polished stone with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param polishedStone the polished stone {@link Block}
	 * @param polishedStoneSlab the polished stone slab {@link Block}
	 * @param overlayPolishedStone the overlay polished stone {@link Block}
	 * @param overlayPolishedStoneSlab the overlay polished stone slab {@link Block}
	 * @param ornamented whether the overlay polished stone is ornamented
	 * @param overlays the overlay texture names to use, in a comma serparated list
	 * @see ModTextures
	 */
	private void registerOneOverlayPolishedStone(BlockStateModelGenerator blockStateModelGenerator,
			Block polishedStone, Block polishedStoneSlab,
			Block overlayPolishedStone, Block overlayPolishedStoneSlab, boolean ornamented, String... overlays) {
		TextureMap textureMap = TextureMap.all(polishedStone);
		textureMap.put(TextureKey.LAYER1, Identifier.of(VExtMod.MOD_ID,
				"block/overlays/" + overlays[0]));

		TextureMap textureMapSlab = TextureMap.sideEnd(TextureMap.getSubId(polishedStoneSlab, "_side"),
				textureMap.getTexture(TextureKey.TOP));
		if(ornamented) {
			textureMapSlab.put(ModTextureKeys.END_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMapSlab.put(TextureKey.LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[1]));
		} else {
			textureMapSlab.put(TextureKey.LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMapSlab.put(ModTextureKeys.END_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
		}

		Identifier identifier = ModModels.POLISHED_SLAB_OVERLAY.upload(overlayPolishedStoneSlab, textureMapSlab,
				blockStateModelGenerator.modelCollector);
		Identifier identifier2 = ModModels.POLISHED_SLAB_TOP_OVERLAY.upload(overlayPolishedStoneSlab, textureMapSlab,
				blockStateModelGenerator.modelCollector);
		Identifier identifier3 = ModModels.DOUBLE_POLISHED_OVERLAY.uploadWithoutVariant(overlayPolishedStoneSlab, "_double",
				textureMapSlab,
				blockStateModelGenerator.modelCollector);
		WeightedVariant slabVariant = createWeightedVariant(identifier);
		WeightedVariant slabTopVariant = createWeightedVariant(identifier2);
		WeightedVariant doubleSlabVariant = createWeightedVariant(identifier3);

		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSlabBlockState(overlayPolishedStoneSlab, slabVariant, slabTopVariant, doubleSlabVariant));
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSingletonBlockState(overlayPolishedStone,
				createWeightedVariant(ModModels.CUBE_ALL_OVERLAY
						.upload(overlayPolishedStone, textureMap, blockStateModelGenerator.modelCollector))));
	}

	/**
	 * Generates block state models for polished stone with two overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param polishedStone the polished stone {@link Block}
	 * @param polishedStoneSlab the polished stone slab {@link Block}
	 * @param overlayPolishedStone the overlay polished stone {@link Block}
	 * @param overlayPolishedStoneSlab the overlay polished stone slab {@link Block}
	 * @param overlays the overlay {@link ModTextures} to use, in a comma serparated list
	 */
	private void registerTwoOverlayPolishedStone(BlockStateModelGenerator blockStateModelGenerator,
			Block polishedStone, Block polishedStoneSlab,
			Block overlayPolishedStone, Block overlayPolishedStoneSlab, ModTextures... overlays) {
		String[] overlayNames = new String[overlays.length];
		for(int i = 0; i < overlays.length; i++) {
			overlayNames[i] = overlays[i].getTextureName();
		}
		registerTwoOverlayPolishedStone(blockStateModelGenerator, polishedStone, polishedStoneSlab,
				overlayPolishedStone, overlayPolishedStoneSlab, overlayNames);
	}

	/**
	 * Generates block state models for polished stone with two overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param polishedStone the polished stone {@link Block}
	 * @param polishedStoneSlab the polished stone slab {@link Block}
	 * @param overlayPolishedStone the overlay polished stone {@link Block}
	 * @param overlayPolishedStoneSlab the overlay polished stone slab {@link Block}
	 * @param overlays the overlay texture names to use, in a comma serparated list
	 * @see ModTextures
	 */
	private void registerTwoOverlayPolishedStone(BlockStateModelGenerator blockStateModelGenerator,
			Block polishedStone, Block polishedStoneSlab,
			Block overlayPolishedStone, Block overlayPolishedStoneSlab, String... overlays) {
		TextureMap textureMap = TextureMap.all(polishedStone);
		textureMap.put(TextureKey.LAYER1, Identifier.of(VExtMod.MOD_ID, "block/overlays/" + overlays[0]));
		textureMap.put(TextureKey.LAYER2, Identifier.of(VExtMod.MOD_ID, "block/overlays/" + overlays[2]));

		TextureMap textureMapSlab = TextureMap.sideEnd(TextureMap.getSubId(polishedStoneSlab, "_side"),
				textureMap.getTexture(TextureKey.TOP));
		textureMapSlab.put(ModTextureKeys.END_LAYER1, Identifier.of(VExtMod.MOD_ID,
				"block/overlays/" + overlays[0]));
		textureMapSlab.put(TextureKey.LAYER1, Identifier.of(VExtMod.MOD_ID,
				"block/overlays/" + overlays[1]));
		textureMapSlab.put(TextureKey.LAYER2, Identifier.of(VExtMod.MOD_ID,
				"block/overlays/" + overlays[2]));
		textureMapSlab.put(ModTextureKeys.END_LAYER2, Identifier.of(VExtMod.MOD_ID,
				"block/overlays/" + overlays[2]));

		Identifier identifier = ModModels.POLISHED_SLAB_TWO_OVERLAY.upload(overlayPolishedStoneSlab, textureMapSlab,
				blockStateModelGenerator.modelCollector);
		Identifier identifier2 = ModModels.POLISHED_SLAB_TOP_TWO_OVERLAY.upload(overlayPolishedStoneSlab, textureMapSlab,
				blockStateModelGenerator.modelCollector);
		Identifier identifier3 = ModModels.DOUBLE_POLISHED_TWO_OVERLAY.uploadWithoutVariant(overlayPolishedStoneSlab, "_double",
				textureMapSlab, blockStateModelGenerator.modelCollector);

		WeightedVariant slabVariant = createWeightedVariant(identifier);
		WeightedVariant slabTopVariant = createWeightedVariant(identifier2);
		WeightedVariant doubleSlabVariant = createWeightedVariant(identifier3);

		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSlabBlockState(overlayPolishedStoneSlab, slabVariant, slabTopVariant, doubleSlabVariant));
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSingletonBlockState(overlayPolishedStone,
				createWeightedVariant(
						ModModels.CUBE_ALL_TWO_OVERLAY.upload(overlayPolishedStone, textureMap,
								blockStateModelGenerator.modelCollector))));
	}

	/**
	 * Generates block state models for {@link ModPillarBlock}.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param pillar the pillar {@link Block}
	 * @param pillarSlab the pillar slab {@link Block}
	 * @param topTexture the top texture name
	 * @param sideTexture the side texture name
	 */
	private void registerPillarBlock(BlockStateModelGenerator blockStateModelGenerator, Block pillar,
			Block pillarSlab, String topTexture, String sideTexture) {
		TextureMap singlePillarTM = new TextureMap()
				.put(TextureKey.END, Identifier.of(VExtMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(VExtMod.MOD_ID, "block/" + sideTexture +
						"_single"));
		TextureMap basePillarTM = new TextureMap()
				.put(TextureKey.END, Identifier.of(VExtMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(VExtMod.MOD_ID, "block/" + sideTexture +
						"_base"));
		TextureMap middlePillarTM = new TextureMap()
				.put(TextureKey.END, Identifier.of(VExtMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(VExtMod.MOD_ID, "block/" + sideTexture +
						"_middle"));
		TextureMap topPillarTM = new TextureMap()
				.put(TextureKey.END, Identifier.of(VExtMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(VExtMod.MOD_ID, "block/" + sideTexture +
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
				.put(TextureKey.END, Identifier.of(VExtMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(VExtMod.MOD_ID, "block/" + sideTexture +
						"_single"));
		Identifier slabIdentifier = Models.SLAB.upload(pillarSlab, slabTM, blockStateModelGenerator.modelCollector);
		Identifier slabTopIdentifier = Models.SLAB_TOP.upload(pillarSlab, slabTM, blockStateModelGenerator.modelCollector);
		Identifier doubleSlabIdentifier = Models.CUBE_TOP.uploadWithoutVariant(pillarSlab, "_double", slabTM,
				blockStateModelGenerator.modelCollector);
		WeightedVariant slabVariant = createWeightedVariant(slabIdentifier);
		WeightedVariant slabTopVariant = createWeightedVariant(slabTopIdentifier);
		WeightedVariant doubleSlabVariant = createWeightedVariant(doubleSlabIdentifier);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(pillarSlab,
				slabVariant, slabTopVariant, doubleSlabVariant));
	}

	/**
	 * Generates block state models for {@link ModPillarBlock} with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param pillar the pillar {@link Block}
	 * @param pillarSlab the pillar slab {@link Block}
	 * @param topTexture the top texture name
	 * @param sideTexture the side texture name
	 * @param ornamented whether the pillar is ornamented
	 * @param overlays the overlays to use, in a comma serparated list
	 * @see ModTextures
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
		WeightedVariant slabVariant = createWeightedVariant(slabId);
		WeightedVariant slabTopVariant = createWeightedVariant(slabTopId);
		WeightedVariant doubleSlabVariant = createWeightedVariant(doubleSlabId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(pillarSlab,
				slabVariant, slabTopVariant, doubleSlabVariant));
	}

	/**
	 * Generates block state models for {@link ModPillarBlock} with two overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param pillar the pillar {@link Block}
	 * @param pillarSlab the pillar slab {@link Block}
	 * @param topTexture the top texture name
	 * @param sideTexture the side texture name
	 * @param layer1 the first overlay texture name
	 * @param layer2 the second overlay texture name
	 * @see ModTextures
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
		WeightedVariant slabVariant = createWeightedVariant(slabId);
		WeightedVariant slabTopVariant = createWeightedVariant(slabTopId);
		WeightedVariant doubleSlabVariant = createWeightedVariant(doubleSlabId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(pillarSlab,
				slabVariant, slabTopVariant, doubleSlabVariant));
	}

	/**
	 * Creates a pillar texture map with overlays, if given.
	 *
	 * @param topTexture the top texture name
	 * @param sideTexture the side texture name
	 * @param position the pillar position suffix
	 * @param ornamented whether the pillar is ornamented
	 * @param overlays the overlay texture names to use, in a comma serparated list
	 * @return the created {@link TextureMap}
	 * @see ModTextures
	 */
	private TextureMap createPillarTextureMap(String topTexture, String sideTexture, String position,
			boolean ornamented, String... overlays) {
		TextureMap textureMap = new TextureMap()
				.put(TextureKey.END,Identifier.of(VExtMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE,Identifier.of(VExtMod.MOD_ID, "block/" + sideTexture +
						position))
				.put(TextureKey.PARTICLE,Identifier.of(VExtMod.MOD_ID, "block/" + sideTexture +
						position));
		if(overlays.length == 1) {
			if (ornamented) {
				textureMap.put(TextureKey.LAYER1,Identifier.of(VExtMod.MOD_ID,
						"block/overlays/" + overlays[0] + "_side" + position + "_overlay"));
				textureMap.put(ModTextureKeys.END_LAYER1,Identifier.of(VExtMod.MOD_ID,
						"block/overlays/" + overlays[0] + "_end" + "_overlay"));
			} else {
				textureMap.put(TextureKey.LAYER1,Identifier.of(VExtMod.MOD_ID, "block/overlays"
						+ "/" + overlays[0]));
				textureMap.put(ModTextureKeys.END_LAYER1,Identifier.of(VExtMod.MOD_ID,
						"block/overlays/" + overlays[0]));
			}
		} else if(overlays.length == 2) {
			textureMap.put(TextureKey.LAYER1,Identifier.of(VExtMod.MOD_ID,
							"block/overlays/" + overlays[0] + "_side" + position + "_overlay"))
					.put(TextureKey.LAYER2,Identifier.of(VExtMod.MOD_ID, "block/overlays/" + overlays[1]))
					.put(ModTextureKeys.END_LAYER1,Identifier.of(VExtMod.MOD_ID,
							"block/overlays/" + overlays[0] + "_end" + "_overlay"))
					.put(ModTextureKeys.END_LAYER2,Identifier.of(VExtMod.MOD_ID,
							"block/overlays/" + overlays[1]));
		}
		return textureMap;
	}

	/**
	 * Creates a {@link ModPillarBlock} state model definition.
	 *
	 * @param pillar the pillar {@link Block}
	 * @param singlePillarIdentifier the single pillar model {@link Identifier}
	 * @param topPillarIdentifier the top pillar model {@link Identifier}
	 * @param middlePillarIdentifier the middle pillar model {@link Identifier}
	 * @param basePillarIdentifier the base pillar model {@link Identifier}
	 * @return the created {@link VariantsBlockModelDefinitionCreator}
	 */
	private VariantsBlockModelDefinitionCreator createPillarBlockState(Block pillar, Identifier singlePillarIdentifier,
			Identifier topPillarIdentifier, Identifier middlePillarIdentifier, Identifier basePillarIdentifier) {
		WeightedVariant singleVariant = createWeightedVariant(singlePillarIdentifier);
		WeightedVariant topVariant = createWeightedVariant(topPillarIdentifier);
		WeightedVariant middleVariant = createWeightedVariant(middlePillarIdentifier);
		WeightedVariant baseVariant = createWeightedVariant(basePillarIdentifier);
		return VariantsBlockModelDefinitionCreator.of(pillar)
				.with(BlockStateVariantMap.models(ModPillarBlock.PILLAR_TYPE)
				.register(ModPillarType.SINGLE, singleVariant)
				.register(ModPillarType.TOP, topVariant)
				.register(ModPillarType.MIDDLE, middleVariant)
				.register(ModPillarType.BASE, baseVariant));
	}

	/**
	 * Generates block state models for {@link ModFriezeBlock}.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param frieze the frieze {@link Block}
	 * @param friezeSlab the frieze slab {@link Block}
	 * @param endTexture the top texture name
	 * @param northTexture the north texture name
	 * @param eastTexture the east texture name
	 * @param southTexture the south texture name
	 * @param westTexture the west texture name
	 */
	private void registerFriezeBlock(BlockStateModelGenerator blockStateModelGenerator, Block frieze,
			Block friezeSlab, String endTexture, String northTexture, String eastTexture, String southTexture, String westTexture) {
		TextureMap singleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single", eastTexture, "_single",
				southTexture, "_single", westTexture, "_single", false);
		TextureMap northEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single", eastTexture,
				"_right", southTexture, "_single", westTexture, "_left", false);
		TextureMap eastEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_left", eastTexture, "_single",
				southTexture, "_right", westTexture, "_single", false);
		TextureMap southEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single", eastTexture,
				"_left", southTexture, "_single", westTexture, "_right", false);
		TextureMap westEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_right", eastTexture,
				"_single", southTexture, "_left", westTexture, "_single", false);
		TextureMap northEastCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_single", southTexture, "_left", westTexture, "_right", false);
		TextureMap northWestCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_left", southTexture, "_right", westTexture, "_single", false);
		TextureMap southEastCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_right",
				eastTexture, "_single", southTexture, "_single", westTexture, "_left", false);
		TextureMap southWestCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_left",
				eastTexture, "_right", southTexture, "_single", westTexture, "_single", false);
		TextureMap tNorthMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_middle",
				eastTexture, "_single", southTexture, "_single", westTexture, "_single", false);
		TextureMap tEastMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "single",
				eastTexture, "_middle", southTexture, "_single", westTexture, "_single", false);
		TextureMap tSouthMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_single", southTexture, "_middle", westTexture, "_single", false);
		TextureMap tWestMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_single", southTexture, "_single", westTexture, "_middle", false);
		TextureMap northSouthMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_middle", southTexture, "_single", westTexture, "_middle", false);
		TextureMap eastWestMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_middle",
				eastTexture, "_single", southTexture, "_middle", westTexture, "_single", false);
		TextureMap crossMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_middle",
				eastTexture, "_middle", southTexture, "_middle", westTexture, "_middle", false);

		Identifier singleFriezeIdentifier = ModModels.FRIEZE.upload(frieze, singleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northEndFriezeIdentifier = ModModels.FRIEZE_NORTHEND.upload(frieze,northEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier eastEndFriezeIdentifier = ModModels.FRIEZE_EASTEND.upload(frieze, eastEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier southEndFriezeIdentifier = ModModels.FRIEZE_SOUTHEND.upload(frieze, southEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier westEndFriezeIdentifier = ModModels.FRIEZE_WESTEND.upload(frieze, westEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northEastCornerFriezeIdentifier = ModModels.FRIEZE_NORTHEASTCORNER.upload(frieze,northEastCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northWestCornerFriezeIdentifier = ModModels.FRIEZE_NORTHWESTCORNER.upload(frieze, northWestCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier southEastCornerFriezeIdentifier = ModModels.FRIEZE_SOUTHEASTCORNER.upload(frieze, southEastCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier southWestCornerFriezeIdentifier = ModModels.FRIEZE_SOUTHWESTCORNER.upload(frieze, southWestCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tNorthMiddleFriezeIdentifier = ModModels.FRIEZE_TNORTHMIDDLE.upload(frieze, tNorthMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tEastMiddleFriezeIdentifier = ModModels.FRIEZE_TEASTMIDDLE.upload(frieze, tEastMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tSouthMiddleFriezeIdentifier = ModModels.FRIEZE_TSOUTHMIDDLE.upload(frieze, tSouthMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tWestMiddleFriezeIdentifier = ModModels.FRIEZE_TWESTMIDDLE.upload(frieze, tWestMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northSouthMiddleFriezeIdentifier = ModModels.FRIEZE_NORTHSOUTHMIDDLE.upload(frieze, northSouthMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier eastWestMiddleFriezeIdentifier = ModModels.FRIEZE_EASTWESTMIDDLE.upload(frieze, eastWestMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier crossMiddleFriezeIdentifier = ModModels.FRIEZE_CROSSMIDDLE.upload(frieze, crossMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);

		blockStateModelGenerator.blockStateCollector.accept(createFriezeBlockState(frieze, singleFriezeIdentifier, northEndFriezeIdentifier,
				eastEndFriezeIdentifier, southEndFriezeIdentifier, westEndFriezeIdentifier, northEastCornerFriezeIdentifier,
				northWestCornerFriezeIdentifier, southEastCornerFriezeIdentifier, southWestCornerFriezeIdentifier,
				tNorthMiddleFriezeIdentifier, tEastMiddleFriezeIdentifier, tSouthMiddleFriezeIdentifier, tWestMiddleFriezeIdentifier,
				northSouthMiddleFriezeIdentifier, eastWestMiddleFriezeIdentifier, crossMiddleFriezeIdentifier));

		TextureMap slabTM = new TextureMap()
				.put(TextureKey.END, Identifier.of(VExtMod.MOD_ID, "block/" + endTexture))
				.put(TextureKey.SIDE, Identifier.of(VExtMod.MOD_ID, "block/" + westTexture + "_single"));
		Identifier slabIdentifier = Models.SLAB.upload(friezeSlab, slabTM, blockStateModelGenerator.modelCollector);
		Identifier slabTopIdentifier = Models.SLAB_TOP.upload(friezeSlab, slabTM, blockStateModelGenerator.modelCollector);
		Identifier doubleSlabIdentifier = Models.CUBE_TOP.uploadWithoutVariant(friezeSlab, "_double", slabTM,
				blockStateModelGenerator.modelCollector);
		WeightedVariant slabVariant = createWeightedVariant(slabIdentifier);
		WeightedVariant slabTopVariant = createWeightedVariant(slabTopIdentifier);
		WeightedVariant doubleSlabVariant = createWeightedVariant(doubleSlabIdentifier);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(friezeSlab,
				slabVariant, slabTopVariant, doubleSlabVariant));
	}

	/**
	 * Generates block state models for {@link ModFriezeBlock} with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param frieze the frieze {@link Block}
	 * @param friezeSlab the frieze slab {@link Block}
	 * @param endTexture the top texture name
	 * @param northTexture the north texture name
	 * @param eastTexture the east texture name
	 * @param southTexture the south texture name
	 * @param westTexture the west texture name
	 * @param ornamented whether the frieze is ornamented
	 * @param overlaysInput the overlays to use, in a comma serparated list
	 * @see ModTextures
	 */
	private void registerOneOverlayFriezeBlock(BlockStateModelGenerator blockStateModelGenerator, Block frieze,
		Block friezeSlab, String endTexture, String northTexture, String eastTexture, String southTexture, String westTexture,
		boolean ornamented, String... overlaysInput) {
		String[] overlays = overlaysInput.clone();
		if(ornamented) {
			overlays = new String[overlays.length + 1];
			overlays[0] = overlaysInput[0].contains("bronze_frieze") ? "bronze_polished" :
					overlaysInput[0].contains("silver_frieze") ? "silver_polished" : "gold_polished";
			System.arraycopy(overlaysInput, 0, overlays, 1, overlaysInput.length);
		}
		TextureMap singleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single", eastTexture, "_single",
				southTexture, "_single", westTexture, "_single", ornamented, overlays);
		TextureMap northEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single", eastTexture,
				"_right", southTexture, "_single", westTexture, "_left", ornamented, overlays);
		TextureMap eastEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_left", eastTexture, "_single",
				southTexture, "_right", westTexture, "_single", ornamented, overlays);
		TextureMap southEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single", eastTexture,
				"_left", southTexture, "_single", westTexture, "_right", ornamented, overlays);
		TextureMap westEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_right", eastTexture,
				"_single", southTexture, "_left", westTexture, "_single", ornamented, overlays);
		TextureMap northEastCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_single", southTexture, "_left", westTexture, "_right", ornamented, overlays);
		TextureMap northWestCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_left", southTexture, "_right", westTexture, "_single", ornamented, overlays);
		TextureMap southEastCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_right",
				eastTexture, "_single", southTexture, "_single", westTexture, "_left", ornamented, overlays);
		TextureMap southWestCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_left",
				eastTexture, "_right", southTexture, "_single", westTexture, "_single", ornamented, overlays);
		TextureMap tNorthMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_middle",
				eastTexture, "_single", southTexture, "_single", westTexture, "_single", ornamented, overlays);
		TextureMap tEastMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "single",
				eastTexture, "_middle", southTexture, "_single", westTexture, "_single", ornamented, overlays);
		TextureMap tSouthMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_single", southTexture, "_middle", westTexture, "_single", ornamented, overlays);
		TextureMap tWestMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_single", southTexture, "_single", westTexture, "_middle", ornamented, overlays);
		TextureMap northSouthMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_middle", southTexture, "_single", westTexture, "_middle", ornamented, overlays);
		TextureMap eastWestMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_middle",
				eastTexture, "_single", southTexture, "_middle", westTexture, "_single", ornamented, overlays);
		TextureMap crossMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_middle",
				eastTexture, "_middle", southTexture, "_middle", westTexture, "_middle", ornamented, overlays);

		Identifier singleFriezeIdentifier = ModModels.FRIEZE_OVERLAY.upload(frieze, singleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northEndFriezeIdentifier = ModModels.FRIEZE_NORTHEND_OVERLAY.upload(frieze,northEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier eastEndFriezeIdentifier = ModModels.FRIEZE_EASTEND_OVERLAY.upload(frieze, eastEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier southEndFriezeIdentifier = ModModels.FRIEZE_SOUTHEND_OVERLAY.upload(frieze, southEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier westEndFriezeIdentifier = ModModels.FRIEZE_WESTEND_OVERLAY.upload(frieze, westEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northEastCornerFriezeIdentifier = ModModels.FRIEZE_NORTHEASTCORNER_OVERLAY.upload(frieze,northEastCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northWestCornerFriezeIdentifier = ModModels.FRIEZE_NORTHWESTCORNER_OVERLAY.upload(frieze, northWestCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier southEastCornerFriezeIdentifier = ModModels.FRIEZE_SOUTHEASTCORNER_OVERLAY.upload(frieze, southEastCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier southWestCornerFriezeIdentifier = ModModels.FRIEZE_SOUTHWESTCORNER_OVERLAY.upload(frieze, southWestCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tNorthMiddleFriezeIdentifier = ModModels.FRIEZE_TNORTHMIDDLE_OVERLAY.upload(frieze, tNorthMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tEastMiddleFriezeIdentifier = ModModels.FRIEZE_TEASTMIDDLE_OVERLAY.upload(frieze, tEastMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tSouthMiddleFriezeIdentifier = ModModels.FRIEZE_TSOUTHMIDDLE_OVERLAY.upload(frieze, tSouthMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tWestMiddleFriezeIdentifier = ModModels.FRIEZE_TWESTMIDDLE_OVERLAY.upload(frieze, tWestMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northSouthMiddleFriezeIdentifier = ModModels.FRIEZE_NORTHSOUTHMIDDLE_OVERLAY.upload(frieze, northSouthMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier eastWestMiddleFriezeIdentifier = ModModels.FRIEZE_EASTWESTMIDDLE_OVERLAY.upload(frieze, eastWestMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier crossMiddleFriezeIdentifier = ModModels.FRIEZE_CROSSMIDDLE_OVERLAY.upload(frieze, crossMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);

		blockStateModelGenerator.blockStateCollector.accept(createFriezeBlockState(frieze, singleFriezeIdentifier, northEndFriezeIdentifier,
				eastEndFriezeIdentifier, southEndFriezeIdentifier, westEndFriezeIdentifier, northEastCornerFriezeIdentifier,
				northWestCornerFriezeIdentifier, southEastCornerFriezeIdentifier, southWestCornerFriezeIdentifier,
				tNorthMiddleFriezeIdentifier, tEastMiddleFriezeIdentifier, tSouthMiddleFriezeIdentifier, tWestMiddleFriezeIdentifier,
				northSouthMiddleFriezeIdentifier, eastWestMiddleFriezeIdentifier, crossMiddleFriezeIdentifier));

		TextureMap slabTM = createFriezeTextureMap(endTexture, northTexture, "_single", eastTexture, "_single",
				southTexture, "_single", westTexture, "_single", ornamented, overlays);
		Identifier slabIdentifier = ModModels.FRIEZE_SLAB_OVERLAY.upload(friezeSlab, slabTM,
				blockStateModelGenerator.modelCollector);
		Identifier slabTopIdentifier = ModModels.FRIEZE_SLAB_TOP_OVERLAY.upload(friezeSlab, slabTM,
				blockStateModelGenerator.modelCollector);
		Identifier doubleSlabIdentifier = ModModels.FRIEZE_OVERLAY.uploadWithoutVariant(friezeSlab, "_double", slabTM,
				blockStateModelGenerator.modelCollector);
		WeightedVariant slabVariant = createWeightedVariant(slabIdentifier);
		WeightedVariant slabTopVariant = createWeightedVariant(slabTopIdentifier);
		WeightedVariant doubleSlabVariant = createWeightedVariant(doubleSlabIdentifier);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(friezeSlab,
				slabVariant, slabTopVariant, doubleSlabVariant));
	}

	/**
	 * Generates block state models for {@link ModFriezeBlock} with two overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param frieze the frieze {@link Block}
	 * @param friezeSlab the frieze slab {@link Block}
	 * @param endTexture the top texture name
	 * @param northTexture the north texture name
	 * @param eastTexture the east texture name
	 * @param southTexture the south texture name
	 * @param westTexture the west texture name
	 * @param ornamented whether the frieze is ornamented
	 * @param overlaysInput the overlays to use, in a comma serparated list
	 * @see ModTextures
	 */
	private void registerTwoOverlayFriezeBlock(BlockStateModelGenerator blockStateModelGenerator, Block frieze,
			Block friezeSlab, String endTexture, String northTexture, String eastTexture, String southTexture,
			String westTexture, boolean ornamented, String... overlaysInput) {
		String[] overlays = overlaysInput.clone();

		overlays = new String[overlays.length + 1];
		overlays[0] = overlaysInput[0].contains("bronze_frieze") ? "bronze_polished" :
				overlaysInput[0].contains("silver_frieze") ? "silver_polished" : "gold_polished";
		System.arraycopy(overlaysInput, 0, overlays, 1, overlaysInput.length);

		TextureMap singleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single", eastTexture, "_single",
				southTexture, "_single", westTexture, "_single", ornamented, overlays);
		TextureMap northEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single", eastTexture,
				"_right", southTexture, "_single", westTexture, "_left", ornamented, overlays);
		TextureMap eastEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_left", eastTexture, "_single",
				southTexture, "_right", westTexture, "_single", ornamented, overlays);
		TextureMap southEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single", eastTexture,
				"_left", southTexture, "_single", westTexture, "_right", ornamented, overlays);
		TextureMap westEndFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_right", eastTexture,
				"_single", southTexture, "_left", westTexture, "_single", ornamented, overlays);
		TextureMap northEastCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_single", southTexture, "_left", westTexture, "_right", ornamented, overlays);
		TextureMap northWestCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_left", southTexture, "_right", westTexture, "_single", ornamented, overlays);
		TextureMap southEastCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_right",
				eastTexture, "_single", southTexture, "_single", westTexture, "_left", ornamented, overlays);
		TextureMap southWestCornerFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_left",
				eastTexture, "_right", southTexture, "_single", westTexture, "_single", ornamented, overlays);
		TextureMap tNorthMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_middle",
				eastTexture, "_single", southTexture, "_single", westTexture, "_single", ornamented, overlays);
		TextureMap tEastMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "single",
				eastTexture, "_middle", southTexture, "_single", westTexture, "_single", ornamented, overlays);
		TextureMap tSouthMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_single", southTexture, "_middle", westTexture, "_single", ornamented, overlays);
		TextureMap tWestMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_single", southTexture, "_single", westTexture, "_middle", ornamented, overlays);
		TextureMap northSouthMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_single",
				eastTexture, "_middle", southTexture, "_single", westTexture, "_middle", ornamented, overlays);
		TextureMap eastWestMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_middle",
				eastTexture, "_single", southTexture, "_middle", westTexture, "_single", ornamented, overlays);
		TextureMap crossMiddleFriezeTM = createFriezeTextureMap(endTexture, northTexture, "_middle",
				eastTexture, "_middle", southTexture, "_middle", westTexture, "_middle", ornamented, overlays);

		Identifier singleFriezeIdentifier = ModModels.FRIEZE_TWO_OVERLAY.upload(frieze, singleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northEndFriezeIdentifier = ModModels.FRIEZE_NORTHEND_TWO_OVERLAY.upload(frieze,northEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier eastEndFriezeIdentifier = ModModels.FRIEZE_EASTEND_TWO_OVERLAY.upload(frieze, eastEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier southEndFriezeIdentifier = ModModels.FRIEZE_SOUTHEND_TWO_OVERLAY.upload(frieze, southEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier westEndFriezeIdentifier = ModModels.FRIEZE_WESTEND_TWO_OVERLAY.upload(frieze, westEndFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northEastCornerFriezeIdentifier = ModModels.FRIEZE_NORTHEASTCORNER_TWO_OVERLAY.upload(frieze,northEastCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northWestCornerFriezeIdentifier = ModModels.FRIEZE_NORTHWESTCORNER_TWO_OVERLAY.upload(frieze, northWestCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier southEastCornerFriezeIdentifier = ModModels.FRIEZE_SOUTHEASTCORNER_TWO_OVERLAY.upload(frieze, southEastCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier southWestCornerFriezeIdentifier = ModModels.FRIEZE_SOUTHWESTCORNER_TWO_OVERLAY.upload(frieze, southWestCornerFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tNorthMiddleFriezeIdentifier = ModModels.FRIEZE_TNORTHMIDDLE_TWO_OVERLAY.upload(frieze, tNorthMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tEastMiddleFriezeIdentifier = ModModels.FRIEZE_TEASTMIDDLE_TWO_OVERLAY.upload(frieze, tEastMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tSouthMiddleFriezeIdentifier = ModModels.FRIEZE_TSOUTHMIDDLE_TWO_OVERLAY.upload(frieze, tSouthMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier tWestMiddleFriezeIdentifier = ModModels.FRIEZE_TWESTMIDDLE_TWO_OVERLAY.upload(frieze, tWestMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier northSouthMiddleFriezeIdentifier = ModModels.FRIEZE_NORTHSOUTHMIDDLE_TWO_OVERLAY.upload(frieze, northSouthMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier eastWestMiddleFriezeIdentifier = ModModels.FRIEZE_EASTWESTMIDDLE_TWO_OVERLAY.upload(frieze, eastWestMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);
		Identifier crossMiddleFriezeIdentifier = ModModels.FRIEZE_CROSSMIDDLE_TWO_OVERLAY.upload(frieze, crossMiddleFriezeTM,
				blockStateModelGenerator.modelCollector);

		blockStateModelGenerator.blockStateCollector.accept(createFriezeBlockState(frieze, singleFriezeIdentifier, northEndFriezeIdentifier,
				eastEndFriezeIdentifier, southEndFriezeIdentifier, westEndFriezeIdentifier, northEastCornerFriezeIdentifier,
				northWestCornerFriezeIdentifier, southEastCornerFriezeIdentifier, southWestCornerFriezeIdentifier,
				tNorthMiddleFriezeIdentifier, tEastMiddleFriezeIdentifier, tSouthMiddleFriezeIdentifier, tWestMiddleFriezeIdentifier,
				northSouthMiddleFriezeIdentifier, eastWestMiddleFriezeIdentifier, crossMiddleFriezeIdentifier));

		TextureMap slabTM = createFriezeTextureMap(endTexture, northTexture, "_single", eastTexture, "_single",
				southTexture, "_single", westTexture, "_single", ornamented, overlays);
		Identifier slabIdentifier = ModModels.FRIEZE_SLAB_TWO_OVERLAY.upload(friezeSlab, slabTM,
				blockStateModelGenerator.modelCollector);
		Identifier slabTopIdentifier = ModModels.FRIEZE_SLAB_TOP_TWO_OVERLAY.upload(friezeSlab, slabTM,
				blockStateModelGenerator.modelCollector);
		Identifier doubleSlabIdentifier = ModModels.FRIEZE_TWO_OVERLAY.uploadWithoutVariant(friezeSlab, "_double", slabTM,
				blockStateModelGenerator.modelCollector);
		WeightedVariant slabVariant = createWeightedVariant(slabIdentifier);
		WeightedVariant slabTopVariant = createWeightedVariant(slabTopIdentifier);
		WeightedVariant doubleSlabVariant = createWeightedVariant(doubleSlabIdentifier);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(friezeSlab,
				slabVariant, slabTopVariant, doubleSlabVariant));
	}

	/**
	 * Creates a frieze texture map with overlays, if given.
	 * Without Overlays no overlay is to be given
	 * For Mossy/Overgrown variants, one overlay is expected.
	 * For Ornamented variants, five overlays are expected:
	 * - overlays[0] = end overlay
	 * - overlays[1-4] = north/east/south/west side overlay
	 * For Mossy/Overgrown Ornamented variants 6 overlays are expected:
	 * - overlays[0] = end overlay
	 * - overlays[1-4] = north/east/south/west side overlay
	 * - overlays[5] = mossy/overgrown overlay
	 *
	 * @param endTexture the top texture name
	 * @param northTexture the north texture name
	 * @param northPos the north texture position suffix
	 * @param eastTexture the east texture name
	 * @param eastPos the east texture position suffix
	 * @param southTexture the south texture name
	 * @param southPos the south texture position suffix
	 * @param westTexture the west texture name
	 * @param westPos the west texture position suffix
	 * @param overlays the overlay texture names to use, in a comma serparated list
	 * @return the created {@link TextureMap}
	 * @throws IllegalArgumentException if the number of overlays is invalid for a frieze block.
	 */
	private TextureMap createFriezeTextureMap(String endTexture, String northTexture, String northPos,
			String eastTexture, String eastPos, String southTexture, String southPos, String westTexture,
			String westPos, boolean ornamented, String... overlays) {
		TextureMap textureMap = new TextureMap()
				.put(TextureKey.END, Identifier.of(VExtMod.MOD_ID, "block/" + endTexture))
				.put(TextureKey.NORTH, Identifier.of(VExtMod.MOD_ID, "block/" + northTexture + northPos))
				.put(TextureKey.EAST, Identifier.of(VExtMod.MOD_ID, "block/" + eastTexture + eastPos))
				.put(TextureKey.SOUTH, Identifier.of(VExtMod.MOD_ID, "block/" + southTexture + southPos))
				.put(TextureKey.WEST, Identifier.of(VExtMod.MOD_ID, "block/" + westTexture + westPos))
				.put(TextureKey.PARTICLE, Identifier.of(VExtMod.MOD_ID, "block/" + endTexture));
		if(overlays.length == 1) {
			textureMap.put(ModTextureKeys.END_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMap.put(ModTextureKeys.NORTH_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMap.put(ModTextureKeys.EAST_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMap.put(ModTextureKeys.SOUTH_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMap.put(ModTextureKeys.WEST_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0]));
		} else if (overlays.length == 2) {
			textureMap.put(ModTextureKeys.END_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0] + "_overlay"));
			textureMap.put(ModTextureKeys.NORTH_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[1] + northPos + "_overlay"));
			textureMap.put(ModTextureKeys.EAST_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[1] + eastPos + "_overlay"));
			textureMap.put(ModTextureKeys.SOUTH_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[1] + southPos + "_overlay"));
			textureMap.put(ModTextureKeys.WEST_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[1] + westPos + "_overlay"));
		} else if (overlays.length == 3) {
			textureMap.put(ModTextureKeys.END_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[0] + "_overlay"));
			textureMap.put(ModTextureKeys.NORTH_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[1] + northPos + "_overlay"));
			textureMap.put(ModTextureKeys.EAST_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[1] + eastPos + "_overlay"));
			textureMap.put(ModTextureKeys.SOUTH_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[1] + southPos + "_overlay"));
			textureMap.put(ModTextureKeys.WEST_LAYER1, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[1] + westPos + "_overlay"));
			textureMap.put(TextureKey.LAYER2, Identifier.of(VExtMod.MOD_ID,
					"block/overlays/" + overlays[2]));
		} else if (overlays.length != 0) {
			throw new IllegalArgumentException("Invalid number of overlays for frieze block: " + overlays.length);
		}
		return textureMap;
	}

	/**
	 * Creates a {@link ModFriezeBlock} state model definition.
	 *
	 * @param frieze the frieze {@link Block}
	 * @param singleFriezeIdentifier the single frieze model {@link Identifier}
	 * @param northEndFriezeIdentifier the north end frieze model {@link Identifier}
	 * @param eastEndFriezeIdentifier the east end frieze model {@link Identifier}
	 * @param southEndFriezeIdentifier the south end frieze model {@link Identifier}
	 * @param westEndFriezeIdentifier the west end frieze model {@link Identifier}
	 * @param northEastCornerFriezeIdentifier the north east corner frieze model {@link Identifier}
	 * @param northWestCornerFriezeIdentifier the north west corner frieze model {@link Identifier}
	 * @param southEastCornerFriezeIdentifier the south east corner frieze model {@link Identifier}
	 * @param southWestCornerFriezeIdentifier the south west corner frieze model {@link Identifier}
	 * @param tNorthMiddleFriezeIdentifier the t-cross north middle frieze model {@link Identifier}
	 * @param tEastMiddleFriezeIdentifier the t-cross east middle frieze model {@link Identifier}
	 * @param tSouthMiddleFriezeIdentifier the t-cross south middle frieze model {@link Identifier}
	 * @param tWestMiddleFriezeIdentifier the t-cross west middle frieze model {@link Identifier}
	 * @param northSouthMiddleFriezeIdentifier the north-south middle frieze model {@link Identifier}
	 * @param eastWestMiddleFriezeIdentifier the east-west middle frieze model {@link Identifier}
	 * @param crossMiddleFriezeIdentifier the cross middle frieze model {@link Identifier}
	 * @return the created {@link VariantsBlockModelDefinitionCreator}
	 */
	private VariantsBlockModelDefinitionCreator createFriezeBlockState(Block frieze, Identifier singleFriezeIdentifier,
		Identifier northEndFriezeIdentifier, Identifier eastEndFriezeIdentifier, Identifier southEndFriezeIdentifier, Identifier westEndFriezeIdentifier,
		Identifier northEastCornerFriezeIdentifier, Identifier northWestCornerFriezeIdentifier, Identifier southEastCornerFriezeIdentifier,
		Identifier southWestCornerFriezeIdentifier, Identifier tNorthMiddleFriezeIdentifier, Identifier tEastMiddleFriezeIdentifier,
		Identifier tSouthMiddleFriezeIdentifier,Identifier tWestMiddleFriezeIdentifier, Identifier northSouthMiddleFriezeIdentifier,
		Identifier eastWestMiddleFriezeIdentifier, Identifier crossMiddleFriezeIdentifier) {
		WeightedVariant singleVariant = createWeightedVariant(singleFriezeIdentifier);
		WeightedVariant northEndVariant = createWeightedVariant(northEndFriezeIdentifier);
		WeightedVariant eastEndVariant = createWeightedVariant(eastEndFriezeIdentifier);
		WeightedVariant southEndVariant = createWeightedVariant(southEndFriezeIdentifier);
		WeightedVariant westEndVariant = createWeightedVariant(westEndFriezeIdentifier);
		WeightedVariant northEastCornerVariant = createWeightedVariant(northEastCornerFriezeIdentifier);
		WeightedVariant northWestCornerVariant = createWeightedVariant(northWestCornerFriezeIdentifier);
		WeightedVariant southEastCornerVariant = createWeightedVariant(southEastCornerFriezeIdentifier);
		WeightedVariant southWestCornerVariant = createWeightedVariant(southWestCornerFriezeIdentifier);
		WeightedVariant tNorthMiddleVariant = createWeightedVariant(tNorthMiddleFriezeIdentifier);
		WeightedVariant tEastMiddleVariant = createWeightedVariant(tEastMiddleFriezeIdentifier);
		WeightedVariant tSouthMiddleVariant = createWeightedVariant(tSouthMiddleFriezeIdentifier);
		WeightedVariant tWestMiddleVariant = createWeightedVariant(tWestMiddleFriezeIdentifier);
		WeightedVariant northSouthMiddleVariant = createWeightedVariant(northSouthMiddleFriezeIdentifier);
		WeightedVariant eastWestMiddleVariant = createWeightedVariant(eastWestMiddleFriezeIdentifier);
		WeightedVariant crossMiddleVariant = createWeightedVariant(crossMiddleFriezeIdentifier);
		return VariantsBlockModelDefinitionCreator.of(frieze)
				.with(BlockStateVariantMap.models(ModFriezeBlock.FRIEZE_TYPE)
				.register(ModFriezeType.SINGLE, singleVariant)
				.register(ModFriezeType.NORTH_END, northEndVariant)
				.register(ModFriezeType.EAST_END, eastEndVariant)
				.register(ModFriezeType.SOUTH_END, southEndVariant)
				.register(ModFriezeType.WEST_END, westEndVariant)
				.register(ModFriezeType.NORTH_EAST_CORNER, northEastCornerVariant)
				.register(ModFriezeType.NORTH_WEST_CORNER, northWestCornerVariant)
				.register(ModFriezeType.SOUTH_EAST_CORNER, southEastCornerVariant)
				.register(ModFriezeType.SOUTH_WEST_CORNER, southWestCornerVariant)
				.register(ModFriezeType.T_NORTH_MIDDLE, tNorthMiddleVariant)
				.register(ModFriezeType.T_EAST_MIDDLE, tEastMiddleVariant)
				.register(ModFriezeType.T_SOUTH_MIDDLE, tSouthMiddleVariant)
				.register(ModFriezeType.T_WEST_MIDDLE, tWestMiddleVariant)
				.register(ModFriezeType.NORTH_SOUTH_MIDDLE, northSouthMiddleVariant)
				.register(ModFriezeType.EAST_WEST_MIDDLE, eastWestMiddleVariant)
				.register(ModFriezeType.CROSS_MIDDLE, crossMiddleVariant));
	}

	/**
	 * Creates a cube all overlay texture map with overlays.
	 *
	 * @param baseBlock the base {@link Block}
	 * @param overlays the overlay texture names to use, in a comma serparated list.
	 * @return the created {@link TextureMap}
	 * @see ModTextures
	 */
	private static TextureMap createCubeAllOverlayTextureMap(Block baseBlock, String... overlays) {
		TextureMap textureMap = new TextureMap().put(TextureKey.ALL, TextureMap.getId(baseBlock))
				.put(TextureKey.PARTICLE, TextureMap.getId(baseBlock));
		if(overlays.length == 1) {
			textureMap
					.put(TextureKey.LAYER1, Identifier.of(VExtMod.MOD_ID, "block/overlays/" + overlays[0]));
		} else if(overlays.length == 2) {
			textureMap
					.put(TextureKey.LAYER1, Identifier.of(VExtMod.MOD_ID, "block/overlays/" + overlays[0]))
					.put(TextureKey.LAYER2, Identifier.of(VExtMod.MOD_ID, "block/overlays/" + overlays[1]));
		}
		return textureMap;
	}

	/**
	 * Generates block state models for a block with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param block the {@link Block}
	 * @param textureMap the {@link TextureMap}
	 */
	private static void oneOverlayBlock(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier modelId = ModModels.CUBE_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
		WeightedVariant variant = createWeightedVariant(modelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSingletonBlockState(block, variant));
		blockStateModelGenerator.registerParentedItemModel(block, modelId);
	}

	/**
	 * Generates block state models for a block with two overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param block the {@link Block}
	 * @param textureMap the {@link TextureMap}
	 */
	private static void twoOverlayBlock(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier modelId = ModModels.CUBE_ALL_TWO_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		WeightedVariant variant = createWeightedVariant(modelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSingletonBlockState(block, variant));
		blockStateModelGenerator.registerParentedItemModel(block, modelId);
	}

	/**
	 * Generates block state models for {@link net.minecraft.block.StairsBlock} with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param block the {@link Block}
	 * @param textureMap the {@link TextureMap}
	 */
	private static void oneOverlayStairs(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier innerModelId = ModModels.INNER_STAIRS_ALL_OVERLAY
				.upload(block, textureMap, blockStateModelGenerator.modelCollector);
		Identifier regularModelId = ModModels.STAIRS_ALL_OVERLAY
				.upload(block, textureMap, blockStateModelGenerator.modelCollector);
		Identifier outerModelId = ModModels.OUTER_STAIRS_ALL_OVERLAY
				.upload(block, textureMap, blockStateModelGenerator.modelCollector);
		WeightedVariant innerVariant = createWeightedVariant(innerModelId);
		WeightedVariant regularVariant = createWeightedVariant(regularModelId);
		WeightedVariant outerVariant = createWeightedVariant(outerModelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createStairsBlockState(block, innerVariant, regularVariant, outerVariant));
		blockStateModelGenerator.registerParentedItemModel(block, regularModelId);
	}

	/**
	 * Generates block state models for {@link net.minecraft.block.StairsBlock} with two overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param block the {@link Block}
	 * @param textureMap the {@link TextureMap}
	 */
	private static void twoOverlayStairs(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier innerModelId = ModModels.INNER_STAIRS_ALL_TWO_OVERLAY
				.upload(block, textureMap, blockStateModelGenerator.modelCollector);
		Identifier regularModelId = ModModels.STAIRS_ALL_TWO_OVERLAY
				.upload(block, textureMap, blockStateModelGenerator.modelCollector);
		Identifier outerModelId = ModModels.OUTER_STAIRS_ALL_TWO_OVERLAY
				.upload(block, textureMap, blockStateModelGenerator.modelCollector);
		WeightedVariant innerVariant = createWeightedVariant(innerModelId);
		WeightedVariant regularVariant = createWeightedVariant(regularModelId);
		WeightedVariant outerVariant = createWeightedVariant(outerModelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createStairsBlockState(block, innerVariant, regularVariant, outerVariant));
		blockStateModelGenerator.registerParentedItemModel(block, regularModelId);
	}

	/**
	 * Generates block state models for {@link net.minecraft.block.SlabBlock} with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param block the {@link Block}
	 * @param textureMap the {@link TextureMap}
	 */
	private static void oneOverlaySlab(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier slabModelId =  ModModels.SLAB_ALL_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier slabTopModelId = ModModels.SLAB_TOP_ALL_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier doubleSlabModelId = ModModels.CUBE_ALL_OVERLAY.uploadWithoutVariant(block,"_double",
				textureMap, blockStateModelGenerator.modelCollector);
		WeightedVariant slabVariant = createWeightedVariant(slabModelId);
		WeightedVariant slabTopVariant = createWeightedVariant(slabTopModelId);
		WeightedVariant doubleSlabVariant = createWeightedVariant(doubleSlabModelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSlabBlockState(block, slabVariant, slabTopVariant, doubleSlabVariant));
		blockStateModelGenerator.registerParentedItemModel(block, slabModelId);
	}

	/**
	 * Generates block state models for {@link net.minecraft.block.SlabBlock} with two overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param block the {@link Block}
	 * @param textureMap the {@link TextureMap}
	 */
	private static void twoOverlaySlab(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier slabModelId =  ModModels.SLAB_ALL_TWO_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier slabTopModelId = ModModels.SLAB_TOP_ALL_TWO_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier doubleSlabModelId = ModModels.CUBE_ALL_TWO_OVERLAY.uploadWithoutVariant(block,"_double",
				textureMap, blockStateModelGenerator.modelCollector);
		WeightedVariant slabVariant = createWeightedVariant(slabModelId);
		WeightedVariant slabTopVariant = createWeightedVariant(slabTopModelId);
		WeightedVariant doubleSlabVariant = createWeightedVariant(doubleSlabModelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSlabBlockState(block, slabVariant, slabTopVariant, doubleSlabVariant));
		blockStateModelGenerator.registerParentedItemModel(block, slabModelId);
	}

	/**
	 * Generates block state models for {@link net.minecraft.block.WallBlock} with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param block the {@link Block}
	 * @param textureMap the {@link TextureMap}
	 */
	private static void oneOverlayWall(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier wallPostModelId = ModModels.WALL_POST_ALL_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier wallSideModelId = ModModels.WALL_SIDE_ALL_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier wallSideTallModelId = ModModels.WALL_SIDE_TALL_ALL_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier wallInventoryModelId = ModModels.WALL_INVENTORY_ALL_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		WeightedVariant wallPostVariant = createWeightedVariant(wallPostModelId);
		WeightedVariant wallSideVariant = createWeightedVariant(wallSideModelId);
		WeightedVariant wallSideTallVariant = createWeightedVariant(wallSideTallModelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createWallBlockState(block, wallPostVariant, wallSideVariant, wallSideTallVariant));
		blockStateModelGenerator.registerParentedItemModel(block, wallInventoryModelId);
	}

	/**
	 * Generates block state models for {@link net.minecraft.block.WallBlock} with two overlays.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param block the {@link Block}
	 * @param textureMap the {@link TextureMap}
	 */
	private static void twoOverlayWall(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier wallPostModelId = ModModels.WALL_POST_ALL_TWO_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier wallSideModelId = ModModels.WALL_SIDE_ALL_TWO_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier wallSideTallModelId = ModModels.WALL_SIDE_TALL_ALL_TWO_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		Identifier wallInventoryModelId = ModModels.WALL_INVENTORY_ALL_TWO_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		WeightedVariant wallPostVariant = createWeightedVariant(wallPostModelId);
		WeightedVariant wallSideVariant = createWeightedVariant(wallSideModelId);
		WeightedVariant wallSideTallVariant = createWeightedVariant(wallSideTallModelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createWallBlockState(block, wallPostVariant, wallSideVariant, wallSideTallVariant));
		blockStateModelGenerator.registerParentedItemModel(block, wallInventoryModelId);
	}

	/**
	 * Generates block state models for {@link net.minecraft.block.ButtonBlock} with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param block the {@link Block}
	 * @param textureMap the {@link TextureMap}
	 */
	private static void oneOverlayButton(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier buttonModelId = ModModels.BUTTON_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
		Identifier buttonPressedModelId = ModModels.BUTTON_PRESSED_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
		Identifier buttonInventoryModelId = ModModels.BUTTON_INVENTORY_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
		WeightedVariant buttonModelVariant = createWeightedVariant(buttonModelId);
		WeightedVariant buttonPressedModelVariant = createWeightedVariant(buttonPressedModelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createButtonBlockState(block, buttonModelVariant, buttonPressedModelVariant));
		blockStateModelGenerator.registerParentedItemModel(block, buttonInventoryModelId);
	}

	/**
	 * Generates block state models for {@link PressurePlateBlock} with one overlay.
	 *
	 * @param blockStateModelGenerator the {@link BlockStateModelGenerator}
	 * @param block the {@link Block}
	 * @param textureMap the {@link TextureMap}
	 */
	private static void oneOverlayPressurePlate(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier pressurePlateUpModelId = ModModels.PRESSURE_PLATE_UP_ALL_OVERLAY.upload(block, textureMap
			, blockStateModelGenerator.modelCollector);
		Identifier pressurePlateDownModelId = ModModels.PRESSURE_PLATE_DOWN_ALL_OVERLAY.upload(block, textureMap
			, blockStateModelGenerator.modelCollector);
		WeightedVariant pressurePlateUpVariant = createWeightedVariant(pressurePlateUpModelId);
		WeightedVariant pressurePlateDownVariant = createWeightedVariant(pressurePlateDownModelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(
			block, pressurePlateUpVariant, pressurePlateDownVariant));
		blockStateModelGenerator.registerParentedItemModel(block, pressurePlateUpModelId);
	}
}
