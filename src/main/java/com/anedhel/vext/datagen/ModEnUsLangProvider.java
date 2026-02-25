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

import com.anedhel.vext.block.ModBlockTags;
import com.anedhel.vext.block.ModBlocks;
import com.anedhel.vext.block.stonetypes.ModStoneSet;
import com.anedhel.vext.block.stonetypes.ModStoneTypes;
import com.anedhel.vext.block.woodtypes.ModWoodSet;
import com.anedhel.vext.block.woodtypes.ModWoodTypes;
import com.anedhel.vext.datagen.util.DataGenUtils;
import com.anedhel.vext.item.ModGearType;
import com.anedhel.vext.item.ModItemTags;
import com.anedhel.vext.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

/**
 * Data generator for English (US) language translations.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModEnUsLangProvider extends FabricLanguageProvider {

	public ModEnUsLangProvider(FabricDataOutput dataOutput,
			CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}

	/**
	 * Generates translations for various mod elements.
	 * @param registryLookup the {@link RegistryWrapper.WrapperLookup} for registry access
	 * @param translationBuilder the {@link TranslationBuilder} to add translations to
	 */
	@Override
	public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup,
			TranslationBuilder translationBuilder) {
		generateItemGroupTranslations(translationBuilder);
		generateTagTranslations(translationBuilder);
		generateGearTypeTranslations(translationBuilder);
		generateWoodTypeTranslations(translationBuilder);
		generateStoneTypeTranslations(translationBuilder);

		translationBuilder.add(ModItems.OAK_BARK, "Oak Bark");
		translationBuilder.add(ModItems.SPRUCE_BARK, "Spruce Bark");
		translationBuilder.add(ModItems.BIRCH_BARK, "Birch Bark");
		translationBuilder.add(ModItems.JUNGLE_BARK, "Jungle Bark");
		translationBuilder.add(ModItems.ACACIA_BARK, "Acacia Bark");
		translationBuilder.add(ModItems.DARK_OAK_BARK, "Dark Oak Bark");
		translationBuilder.add(ModItems.PALE_OAK_BARK, "Pale Oak Bark");
		translationBuilder.add(ModItems.MANGROVE_BARK, "Mangrove Bark");
		translationBuilder.add(ModItems.CHERRY_BARK, "Cherry Bark");
		translationBuilder.add(ModItems.BAMBOO_BARK, "Bamboo Bark");
		translationBuilder.add(ModItems.WARPED_BARK, "Warped Bark");
		translationBuilder.add(ModItems.CRIMSON_BARK, "Crimson Bark");

		translationBuilder.add(ModItems.TOMATO_SEEDS, "Tomato Seeds");
		translationBuilder.add(ModBlocks.TOMATO_CROP, "Tomato Crop");
		translationBuilder.add(ModBlocks.WILD_TOMATO, "Wild Tomato");
		translationBuilder.add(ModBlocks.POTTED_WILD_TOMATO, "Potted Wild Tomato");
		translationBuilder.add(ModItems.CORN_SEEDS, "Corn Seeds");
		translationBuilder.add(ModBlocks.CORN_CROP, "Corn Crop");
		translationBuilder.add(ModBlocks.WILD_CORN, "Wild Corn");

		translationBuilder.add(ModItems.TIN_INGOT, "Tin Ingot");
		translationBuilder.add(ModItems.SILVER_INGOT, "Silver Ingot");
		translationBuilder.add(ModItems.SILVER_NUGGET, "Silver Nugget");
		translationBuilder.add(ModItems.BRONZE_INGOT, "Bronze Ingot");
		translationBuilder.add(ModItems.RAW_TIN, "Raw Tin");
		translationBuilder.add(ModItems.RAW_SILVER, "Raw Silver");
		translationBuilder.add(ModItems.TOMATO, "Tomato");
		translationBuilder.add(ModItems.BAKED_TOMATO, "Baked Tomato");
		translationBuilder.add(ModItems.CORN, "Corn");
		translationBuilder.add(ModItems.COOKED_CORN, "Cooked Corn");

		translationBuilder.add(ModBlocks.RAW_TIN_BLOCK, "Block of Raw Tin");
		translationBuilder.add(ModBlocks.TIN_BLOCK, "Block of Tin");
		translationBuilder.add(ModBlocks.RAW_SILVER_BLOCK, "Block of Raw Silver");
		translationBuilder.add(ModBlocks.SILVER_BLOCK, "Block of Silver");
		translationBuilder.add(ModBlocks.BRONZE_BLOCK, "Block of Bronze");
		translationBuilder.add(ModBlocks.TIN_ORE, "Tin Ore");
		translationBuilder.add(ModBlocks.DEEPSLATE_TIN_ORE, "Deepslate Tin Ore");
		translationBuilder.add(ModBlocks.SILVER_ORE, "Silver Ore");
		translationBuilder.add(ModBlocks.DEEPSLATE_SILVER_ORE, "Deepslate Silver Ore");

		translationBuilder.add(ModBlocks.CARPENTRY_TABLE, "Carpentry Table");
		translationBuilder.add("vext.container.carpentry_table", "Carpentry Table");
	}

	/**
	 * Generates translations for item groups.
	 * @param translationBuilder the {@link TranslationBuilder} to add translations to
	 */
	private void generateItemGroupTranslations(TranslationBuilder translationBuilder) {
		translationBuilder.add("itemgroup.vext_blocks", "VExt Blocks");
		translationBuilder.add("itemgroup.vext_stone", "VExt Stone");
		translationBuilder.add("itemgroup.vext_ingredients", "VExt Ingredients");
		translationBuilder.add("itemgroup.vext_tools", "VExt Tools");
		translationBuilder.add("itemgroup.vext_combat", "VExt Combat");
		translationBuilder.add("itemgroup.vext_plants", "VExt Plants");
		translationBuilder.add("itemgroup.vext_food", "VExt Food");
		translationBuilder.add("itemgroup.vext_spawns", "VExt Spawns");
	}

	/**
	 * Generates translations for tags.
	 * @param translationBuilder the {@link TranslationBuilder} to add translations to
	 */
	private void generateTagTranslations(TranslationBuilder translationBuilder) {
		translationBuilder.add(ModBlockTags.PILLARS, "Pillars");
		translationBuilder.add(ModBlockTags.FRIEZES, "Friezes");
		translationBuilder.add(ModBlockTags.PINE_LOGS, "Pine Logs");
		translationBuilder.add(ModBlockTags.INCORRECT_FOR_BRONZE_TOOL, "Incorrect for Bronze Tool");
		translationBuilder.add(ModItemTags.PINE_LOGS, "Pine Logs");
		translationBuilder.add(ModItemTags.BRONZE_MATERIALS, "Bronze Materials");
	}

	/**
	 * Generates translations for all gear types.
	 * @param translationBuilder the {@link TranslationBuilder} to add translations to
	 */
	private void generateGearTypeTranslations(TranslationBuilder translationBuilder) {
		for(ModGearType gearType: ModGearType.values()) {
			translationBuilder.add(gearType.getHelmet(), generateNameFromItem(gearType.getHelmet()));
			translationBuilder.add(gearType.getChestplate(), generateNameFromItem(gearType.getChestplate()));
			translationBuilder.add(gearType.getLeggings(), generateNameFromItem(gearType.getLeggings()));
			translationBuilder.add(gearType.getBoots(), generateNameFromItem(gearType.getBoots()));

			translationBuilder.add(gearType.getSword(), generateNameFromItem(gearType.getSword()));
			translationBuilder.add(gearType.getAxe(), generateNameFromItem(gearType.getAxe()));
			translationBuilder.add(gearType.getPickaxe(), generateNameFromItem(gearType.getPickaxe()));
			translationBuilder.add(gearType.getShovel(), generateNameFromItem(gearType.getShovel()));
			translationBuilder.add(gearType.getHoe(), generateNameFromItem(gearType.getHoe()));
		}
	}

	/**
	 * Generates translations for all wood types.
	 * @param translationBuilder the {@link TranslationBuilder} to add translations to
	 */
	private void generateWoodTypeTranslations(TranslationBuilder translationBuilder) {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();
			translationBuilder.add(woodSet.getLog(), generateNameFromBlock(woodSet.getLog()));
			generateBlockFamilyTranslations(translationBuilder, woodSet.getWoodFamily());

			translationBuilder.add(woodSet.getStrippedLog(), generateNameFromBlock(woodSet.getStrippedLog()));
			generateBlockFamilyTranslations(translationBuilder, woodSet.getStrippedWoodFamily());

			generateBlockFamilyTranslations(translationBuilder, woodSet.getPlanksFamily());

			translationBuilder.add(woodSet.getSapling(), generateNameFromBlock(woodSet.getSapling()));
			translationBuilder.add(woodSet.getLeaves(), generateNameFromBlock(woodSet.getLeaves()));
			translationBuilder.add(woodSet.getBark(), generateNameFromItem(woodSet.getBark()));
		}
	}

	/**
	 * Generates translations for all stone types.
	 * @param translationBuilder the {@link TranslationBuilder} to add translations to
	 */
	private void generateStoneTypeTranslations(TranslationBuilder translationBuilder) {
		for(ModStoneTypes stoneType : ModStoneTypes.values()) {
			ModStoneSet stoneSet = stoneType.getModStoneSet();
			stoneSet.getAllBlockFamilies().forEach(family -> generateBlockFamilyTranslations(translationBuilder, family));

			stoneSet.getAllStoneSubSets().forEach(subSet -> subSet.getAllBlockFamilies().forEach(family -> generateBlockFamilyTranslations(translationBuilder, family)));
		}
	}

	/**
	 * Generates translations for a block family.
	 * @param translationBuilder the {@link TranslationBuilder} to add translations to
	 * @param family the {@link BlockFamily} to generate translations for
	 */
	private void generateBlockFamilyTranslations(TranslationBuilder translationBuilder, BlockFamily family) {
		translationBuilder.add(family.getBaseBlock(),
				generateNameFromTranslationKey(family.getBaseBlock().getTranslationKey()));
		family.getVariants().values().forEach(block -> {
			String name = generateNameFromTranslationKey(block.getTranslationKey());
			translationBuilder.add(block, name);
		});
	}

	/**
	 * Generates a human-readable name from a {@link Block}.
	 *
	 * @param block the block
	 * @return the generated name
	 * @see #generateNameFromTranslationKey(String)
	 */
	private String generateNameFromBlock(Block block) {
		return generateNameFromTranslationKey(block.getTranslationKey());
	}

	/**
	 * Generates a human-readable name from an {@link Item}.
	 *
	 * @param item the item
	 * @return the generated name
	 * @see #generateNameFromTranslationKey(String)
	 */
	private String generateNameFromItem(Item item) {
		return generateNameFromTranslationKey(item.getTranslationKey());
	}

	/**
	 * Generates a human-readable name from a translation key.
	 *
	 * @param translationKey the translation key
	 * @return the generated name
	 * @see DataGenUtils#extractNameFromTranslationKey(String)
	 */
	private String generateNameFromTranslationKey(String translationKey) {
		String name = DataGenUtils.extractNameFromTranslationKey(translationKey).replace('_', ' ');
		return DataGenUtils.capitalizeWords(name);
	}
}
