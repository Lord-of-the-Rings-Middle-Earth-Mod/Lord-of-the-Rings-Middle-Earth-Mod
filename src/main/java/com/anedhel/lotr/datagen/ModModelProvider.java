/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.datagen;

import com.anedhel.lotr.LotRMEMod;
import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.block.custom.ModPillarBlock;
import com.anedhel.lotr.block.custom.ModPillarType;
import com.anedhel.lotr.block.custom.crops.TomatoCropBlock;
import com.anedhel.lotr.block.stonetypes.ModStoneSubSet;
import com.anedhel.lotr.block.stonetypes.ModStoneTypes;
import com.anedhel.lotr.block.woodtypes.ModWoodSet;
import com.anedhel.lotr.block.woodtypes.ModWoodTypes;
import com.anedhel.lotr.block.stonetypes.ModStoneSet;
import com.anedhel.lotr.datagen.util.ModModels;
import com.anedhel.lotr.datagen.util.ModTextureKeys;
import com.anedhel.lotr.datagen.util.ModTextures;
import com.anedhel.lotr.item.ModGearType;
import com.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.client.data.BlockStateModelGenerator.*;

public class ModModelProvider extends FabricModelProvider {

	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		generateModWoodTypeBlockStateModels(blockStateModelGenerator);
		generateModStoneTypeBlockStateModels(blockStateModelGenerator);

		blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
		blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILD_TOMATO, ModBlocks.POTTED_WILD_TOMATO, BlockStateModelGenerator.CrossType.NOT_TINTED);

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

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		generateModGearTypeItemModels(itemModelGenerator);

		itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
		itemModelGenerator.register(ModItems.BAKED_TOMATO, Models.GENERATED);
		itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
		itemModelGenerator.register(ModItems.COOKED_CORN, Models.GENERATED);

		itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
		itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
		itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
		itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
		itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);
	}

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
		}
	}

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

			stoneSet.getFriezeSet(); //mossy two ToDo: Set up the frieze models soon

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

	private void registerCubeAllOverlayBlockFamilyModel(BlockStateModelGenerator blockStateModelGenerator,
			Block baseBlock, BlockFamily overlayFamily, ModTextures... textures){
		String[] textureNames = new String[textures.length];
		for(int i = 0; i < textures.length; i++) {
			textureNames[i] = textures[i].getTextureName();
		}
		registerCubeAllOverlayBlockFamilyModel(blockStateModelGenerator, baseBlock, overlayFamily, textureNames);
	}

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

	private void registerOneOverlayPavement (BlockStateModelGenerator blockStateModelGenerator,
			BlockFamily blockFamily, String sideTexture, String topTexture, ModTextures... overlays) {
		String[] overlayNames = new String[overlays.length];
		for(int i = 0; i < overlays.length; i++) {
			overlayNames[i] = overlays[i].getTextureName();
		}
		registerOneOverlayPavement(blockStateModelGenerator, blockFamily, sideTexture, topTexture, overlayNames);
	}

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

	private void registerTwoOverlayPavement (BlockStateModelGenerator blockStateModelGenerator,
			BlockFamily blockFamily, String sideTexture, String topTexture, ModTextures... overlays) {
		String[] overlayNames = new String[overlays.length];
		for(int i = 0; i < overlays.length; i++) {
			overlayNames[i] = overlays[i].getTextureName();
		}
		registerTwoOverlayPavement(blockStateModelGenerator, blockFamily, sideTexture, topTexture, overlayNames);
	}

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

	private TextureMap createPavementTextureMap(String topTexture, String sideTexture, boolean ornamented,
			String... overlays) {
		TextureMap textureMap = new TextureMap()
				.put(TextureKey.TOP, Identifier.of(LotRMEMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(LotRMEMod.MOD_ID, "block/" + sideTexture))
				.put(TextureKey.BOTTOM, Identifier.of(LotRMEMod.MOD_ID, "block/" + sideTexture))
				.put(TextureKey.PARTICLE, Identifier.of(LotRMEMod.MOD_ID, "block/" + topTexture));
		if(overlays.length == 1 && !ornamented) {
			textureMap.put(TextureKey.LAYER1, Identifier.of(LotRMEMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMap.put(ModTextureKeys.TOP_LAYER1, Identifier.of(LotRMEMod.MOD_ID,
					"block/overlays/" + overlays[0]));
		} else if(overlays.length == 2 && ornamented) {
			textureMap.put(TextureKey.LAYER1, Identifier.of(LotRMEMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMap.put(ModTextureKeys.TOP_LAYER1, Identifier.of(LotRMEMod.MOD_ID, "block"
					+ "/overlays/" + overlays[1]));
		} else if(overlays.length == 3 && ornamented) {
			textureMap.put(TextureKey.LAYER1, Identifier.of(LotRMEMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMap.put(ModTextureKeys.TOP_LAYER1, Identifier.of(LotRMEMod.MOD_ID, "block"
					+ "/overlays/" + overlays[1]));
			textureMap.put(TextureKey.LAYER2, Identifier.of(LotRMEMod.MOD_ID,
					"block/overlays/" + overlays[2]));
		}
		return textureMap;
	}

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

	private void registerOneOverlayPolishedStone(BlockStateModelGenerator blockStateModelGenerator,
			Block polishedStone, Block polishedStoneSlab,
			Block overlayPolishedStone, Block overlayPolishedStoneSlab, boolean ornamented, String... overlays) {
		TextureMap textureMap = TextureMap.all(polishedStone);
		textureMap.put(TextureKey.LAYER1, Identifier.of(LotRMEMod.MOD_ID,
				"block/overlays/" + overlays[0]));

		TextureMap textureMapSlab = TextureMap.sideEnd(TextureMap.getSubId(polishedStoneSlab, "_side"),
				textureMap.getTexture(TextureKey.TOP));
		if(ornamented) {
			textureMapSlab.put(ModTextureKeys.END_LAYER1, Identifier.of(LotRMEMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMapSlab.put(TextureKey.LAYER1, Identifier.of(LotRMEMod.MOD_ID,
					"block/overlays/" + overlays[1]));
		} else {
			textureMapSlab.put(TextureKey.LAYER1, Identifier.of(LotRMEMod.MOD_ID,
					"block/overlays/" + overlays[0]));
			textureMapSlab.put(ModTextureKeys.END_LAYER1, Identifier.of(LotRMEMod.MOD_ID,
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

	private void registerTwoOverlayPolishedStone(BlockStateModelGenerator blockStateModelGenerator,
			Block polishedStone, Block polishedStoneSlab,
			Block overlayPolishedStone, Block overlayPolishedStoneSlab, String... overlays) {
		TextureMap textureMap = TextureMap.all(polishedStone);
		textureMap.put(TextureKey.LAYER1, Identifier.of(LotRMEMod.MOD_ID, "block/overlays/" + overlays[0]));
		textureMap.put(TextureKey.LAYER2, Identifier.of(LotRMEMod.MOD_ID, "block/overlays/" + overlays[2]));

		TextureMap textureMapSlab = TextureMap.sideEnd(TextureMap.getSubId(polishedStoneSlab, "_side"),
				textureMap.getTexture(TextureKey.TOP));
		textureMapSlab.put(ModTextureKeys.END_LAYER1, Identifier.of(LotRMEMod.MOD_ID,
				"block/overlays/" + overlays[0]));
		textureMapSlab.put(TextureKey.LAYER1, Identifier.of(LotRMEMod.MOD_ID,
				"block/overlays/" + overlays[1]));
		textureMapSlab.put(TextureKey.LAYER2, Identifier.of(LotRMEMod.MOD_ID,
				"block/overlays/" + overlays[2]));
		textureMapSlab.put(ModTextureKeys.END_LAYER2, Identifier.of(LotRMEMod.MOD_ID,
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

	private void registerPillarBlock(BlockStateModelGenerator blockStateModelGenerator, Block pillar,
			Block pillarSlab, String topTexture, String sideTexture) {
		TextureMap singlePillarTM = new TextureMap()
				.put(TextureKey.END, Identifier.of(LotRMEMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(LotRMEMod.MOD_ID, "block/" + sideTexture +
						"_single"));
		TextureMap basePillarTM = new TextureMap()
				.put(TextureKey.END, Identifier.of(LotRMEMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(LotRMEMod.MOD_ID, "block/" + sideTexture +
						"_base"));
		TextureMap middlePillarTM = new TextureMap()
				.put(TextureKey.END, Identifier.of(LotRMEMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(LotRMEMod.MOD_ID, "block/" + sideTexture +
						"_middle"));
		TextureMap topPillarTM = new TextureMap()
				.put(TextureKey.END, Identifier.of(LotRMEMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(LotRMEMod.MOD_ID, "block/" + sideTexture +
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
				.put(TextureKey.END, Identifier.of(LotRMEMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE, Identifier.of(LotRMEMod.MOD_ID, "block/" + sideTexture +
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

	private TextureMap createPillarTextureMap(String topTexture, String sideTexture, String position,
			boolean ornamented, String... overlays) {
		TextureMap textureMap = new TextureMap()
				.put(TextureKey.END,Identifier.of(LotRMEMod.MOD_ID, "block/" + topTexture))
				.put(TextureKey.SIDE,Identifier.of(LotRMEMod.MOD_ID, "block/" + sideTexture +
						position))
				.put(TextureKey.PARTICLE,Identifier.of(LotRMEMod.MOD_ID, "block/" + sideTexture +
						position));
		if(overlays.length == 1) {
			if (ornamented) {
				textureMap.put(TextureKey.LAYER1,Identifier.of(LotRMEMod.MOD_ID,
						"block/overlays/" + overlays[0] + "_side" + position + "_overlay"));
				textureMap.put(ModTextureKeys.END_LAYER1,Identifier.of(LotRMEMod.MOD_ID,
						"block/overlays/" + overlays[0] + "_end" + "_overlay"));
			} else {
				textureMap.put(TextureKey.LAYER1,Identifier.of(LotRMEMod.MOD_ID, "block/overlays"
						+ "/" + overlays[0]));
				textureMap.put(ModTextureKeys.END_LAYER1,Identifier.of(LotRMEMod.MOD_ID,
						"block/overlays/" + overlays[0]));
			}
		} else if(overlays.length == 2) {
			textureMap.put(TextureKey.LAYER1,Identifier.of(LotRMEMod.MOD_ID,
							"block/overlays/" + overlays[0] + "_side" + position + "_overlay"))
					.put(TextureKey.LAYER2,Identifier.of(LotRMEMod.MOD_ID, "block/overlays/" + overlays[1]))
					.put(ModTextureKeys.END_LAYER1,Identifier.of(LotRMEMod.MOD_ID,
							"block/overlays/" + overlays[0] + "_end" + "_overlay"))
					.put(ModTextureKeys.END_LAYER2,Identifier.of(LotRMEMod.MOD_ID,
							"block/overlays/" + overlays[1]));
		}
		return textureMap;
	}

	private VariantsBlockModelDefinitionCreator createPillarBlockState(Block pillar, Identifier singlePillarIdentifier, Identifier topPillarIdentifier,
			Identifier middlePillarIdentifier, Identifier basePillarIdentifier) {
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

	private static TextureMap createCubeAllOverlayTextureMap(Block baseBlock, String... overlays) {
		TextureMap textureMap = new TextureMap().put(TextureKey.ALL, TextureMap.getId(baseBlock))
				.put(TextureKey.PARTICLE, TextureMap.getId(baseBlock));
		if(overlays.length == 1) {
			textureMap
					.put(TextureKey.LAYER1, Identifier.of(LotRMEMod.MOD_ID, "block/overlays/" + overlays[0]));
		} else if(overlays.length == 2) {
			textureMap
					.put(TextureKey.LAYER1, Identifier.of(LotRMEMod.MOD_ID, "block/overlays/" + overlays[0]))
					.put(TextureKey.LAYER2, Identifier.of(LotRMEMod.MOD_ID, "block/overlays/" + overlays[1]));
		}
		return textureMap;
	}

	private static void oneOverlayBlock(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier modelId = ModModels.CUBE_ALL_OVERLAY.upload(block, textureMap, blockStateModelGenerator.modelCollector);
		WeightedVariant variant = createWeightedVariant(modelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSingletonBlockState(block, variant));
		blockStateModelGenerator.registerParentedItemModel(block, modelId);
	}

	private static void twoOverlayBlock(BlockStateModelGenerator blockStateModelGenerator,
			Block block, TextureMap textureMap) {
		Identifier modelId = ModModels.CUBE_ALL_TWO_OVERLAY.upload(block, textureMap,
				blockStateModelGenerator.modelCollector);
		WeightedVariant variant = createWeightedVariant(modelId);
		blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
				.createSingletonBlockState(block, variant));
		blockStateModelGenerator.registerParentedItemModel(block, modelId);
	}

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
