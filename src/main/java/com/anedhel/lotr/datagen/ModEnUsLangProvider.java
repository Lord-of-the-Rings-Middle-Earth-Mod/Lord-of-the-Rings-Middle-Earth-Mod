package com.anedhel.lotr.datagen;

import com.anedhel.lotr.block.ModBlockTags;
import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.block.stonetypes.ModStoneSet;
import com.anedhel.lotr.block.stonetypes.ModStoneTypes;
import com.anedhel.lotr.block.woodtypes.ModWoodSet;
import com.anedhel.lotr.block.woodtypes.ModWoodTypes;
import com.anedhel.lotr.datagen.util.DataGenUtils;
import com.anedhel.lotr.item.ModGearType;
import com.anedhel.lotr.item.ModItemTags;
import com.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnUsLangProvider extends FabricLanguageProvider {

	public ModEnUsLangProvider(FabricDataOutput dataOutput,
			CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}

	/**
	 * Implement this method to register languages.
	 *
	 * <p>Call {@link TranslationBuilder#add(String, String)} to add a translation.
	 *
	 * @param registryLookup
	 * @param translationBuilder
	 */
	@Override
	public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup,
			TranslationBuilder translationBuilder) {
		generateItemGroupTranslations(translationBuilder);
		generateTagTranslations(translationBuilder);
		generateGearTypeTranslations(translationBuilder);
		generateWoodTypeTranslations(translationBuilder);
		generateStoneTypeTranslations(translationBuilder);

		translationBuilder.add(ModItems.TOMATO_SEEDS, "Tomato Seeds");
		translationBuilder.add(ModBlocks.TOMATO_CROP, "Tomato Crop");
		translationBuilder.add(ModBlocks.WILD_TOMATO, "Wild Tomato");
		translationBuilder.add(ModBlocks.POTTED_WILD_TOMATO, "Potted Wild Tomato");

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
		translationBuilder.add("lotr.container.carpentry_table", "Carpentry Table");
	}

	private void generateItemGroupTranslations(TranslationBuilder translationBuilder) {
		translationBuilder.add("itemgroup.lotr_blocks", "LotR Blocks");
		translationBuilder.add("itemgroup.lotr_stone", "LotR Stone");
		translationBuilder.add("itemgroup.lotr_ingredients", "LotR Ingredients");
		translationBuilder.add("itemgroup.lotr_tools", "LotR Tools");
		translationBuilder.add("itemgroup.lotr_combat", "LotR Combat");
		translationBuilder.add("itemgroup.lotr_plants", "LotR Plants");
		translationBuilder.add("itemgroup.lotr_food", "LotR Food");
	}

	private void generateTagTranslations(TranslationBuilder translationBuilder) {
		translationBuilder.add(ModBlockTags.PILLARS, "Pillars");
		translationBuilder.add(ModBlockTags.FRIEZES, "Friezes");
		translationBuilder.add(ModBlockTags.PINE_LOGS, "Pine Logs");
		translationBuilder.add(ModBlockTags.INCORRECT_FOR_BRONZE_TOOL, "Incorrect for Bronze Tool");
		translationBuilder.add(ModItemTags.PINE_LOGS, "Pine Logs");
		translationBuilder.add(ModItemTags.BRONZE_MATERIALS, "Bronze Materials");
	}

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

	private void generateWoodTypeTranslations(TranslationBuilder translationBuilder) {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();
			translationBuilder.add(woodSet.getLog(), generateNameFromBlock(woodSet.getLog()));
			generateBlockFamilyTranslations(translationBuilder, woodSet.getWoodFamily());

			translationBuilder.add(woodSet.getStrippedLog(), generateNameFromBlock(woodSet.getStrippedLog()));
			generateBlockFamilyTranslations(translationBuilder, woodSet.getStrippedWoodFamily());

			generateBlockFamilyTranslations(translationBuilder, woodSet.getPlanksFamily());
		}
	}

	private void generateStoneTypeTranslations(TranslationBuilder translationBuilder) {
		for(ModStoneTypes stoneType : ModStoneTypes.values()) {
			ModStoneSet stoneSet = stoneType.getModStoneSet();
			stoneSet.getAllBlockFamilies().forEach(family -> generateBlockFamilyTranslations(translationBuilder, family));

			stoneSet.getAllStoneSubSets().forEach(subSet -> subSet.getAllBlockFamilies().forEach(family -> generateBlockFamilyTranslations(translationBuilder, family)));
		}
	}

	private void generateBlockFamilyTranslations(TranslationBuilder translationBuilder, BlockFamily family) {
		translationBuilder.add(family.getBaseBlock(),
				generateNameFromTranslationKey(family.getBaseBlock().getTranslationKey()));
		family.getVariants().values().forEach(block -> {
			String name = generateNameFromTranslationKey(block.getTranslationKey());
			translationBuilder.add(block, name);
		});
	}

	private String generateNameFromBlock(Block block) {
		return generateNameFromTranslationKey(block.getTranslationKey());
	}

	private String generateNameFromItem(Item item) {
		return generateNameFromTranslationKey(item.getTranslationKey());
	}

	private String generateNameFromTranslationKey(String translationKey) {
		String name = DataGenUtils.extractNameFromTranslationKey(translationKey).replace('_', ' ');
		return DataGenUtils.capitalizeWords(name);
	}
}
