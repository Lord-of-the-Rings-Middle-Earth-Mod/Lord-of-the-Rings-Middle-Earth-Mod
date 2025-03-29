package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModOreType;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.block.custom.StoneTypeVariants;
import me.anedhel.lotr.item.ModGearType;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class is used to register all crafting recipes the mod provides.
 */
public class ModRecipeProvider extends FabricRecipeProvider {

	private static final List<ItemConvertible> TIN_BLOCK_SMELTABLES = List.of(
			ModBlocks.RAW_TIN_BLOCK);
	private static final List<ItemConvertible> IRON_BLOCK_SMELTABLES = List.of(
			Blocks.RAW_IRON_BLOCK);
	private static final List<ItemConvertible> GOLD_BLOCK_SMELTABLES = List.of(
			Blocks.RAW_GOLD_BLOCK);
	private static final List<ItemConvertible> COPPER_BLOCK_SMELTABLES = List.of(
			Blocks.RAW_COPPER_BLOCK);

	public ModRecipeProvider(FabricDataOutput output) {
		super(output);
	}

	/**
	 * This method is where all crafting recipes are added via code.
	 *
	 * @param exporter A RecipeJsonProvider, which is provided by minecraft
	 */
	@Override
	public void generate(RecipeExporter exporter) {
		offerSmelting(exporter, TIN_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.TIN_BLOCK,
		              5.6f, 1600, "tin_block");
		offerBlasting(exporter, TIN_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.TIN_BLOCK,
		              5.6f, 800, "tin_block");
		offerSmelting(exporter, IRON_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.IRON_BLOCK,
                      5.6f,
		              1600, "iron_block");
		offerBlasting(exporter, IRON_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.IRON_BLOCK,
                      5.6f,
		              800, "iron_block");
		offerSmelting(exporter, GOLD_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.GOLD_BLOCK,
                      5.6f,
		              1600, "gold_block");
		offerBlasting(exporter, GOLD_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.GOLD_BLOCK,
                      5.6f,
		              800, "gold_block");
		offerSmelting(exporter, COPPER_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.COPPER_BLOCK,
		              5.6f, 1600, "copper_block");
		offerBlasting(exporter, COPPER_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.COPPER_BLOCK,
		              5.6f, 800, "copper_block");

		createCookedFoodRecipes(exporter, ModItems.CORN, ModItems.COOKED_CORN);
		createCookedFoodRecipes(exporter, ModItems.TOMATO, ModItems.BAKED_TOMATO);

		ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_INGOT)
		                          .input(ModItems.TIN_INGOT).input(Items.COPPER_INGOT)
		                          .criterion(hasItem(ModItems.TIN_INGOT),
		                                     conditionsFromItem(ModItems.TIN_INGOT))
		                          .criterion(hasItem(Items.COPPER_INGOT),
		                                     conditionsFromItem(Items.COPPER_INGOT))
		                          .offerTo(exporter, new Identifier(
				                          getRecipeName(ModItems.BRONZE_INGOT) + "_crafting"));

		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                                         ModItems.RAW_TIN,
		                                 RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK);
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
		                                 ModItems.TIN_INGOT, RecipeCategory.MISC,
		                                 ModBlocks.TIN_BLOCK);
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
		                                 ModItems.BRONZE_INGOT, RecipeCategory.MISC,
		                                 ModBlocks.BRONZE_BLOCK);

		ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOMATO_SEEDS, 1)
		                          .input(ModItems.TOMATO).criterion(hasItem(ModItems.TOMATO),
		                                                            conditionsFromItem(
				                                                            ModItems.TOMATO))
		                          .offerTo(exporter,
		                                   new Identifier(getRecipeName(ModItems.TOMATO_SEEDS)));

		ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORN_SEEDS, 1)
		                          .input(ModItems.CORN).criterion(hasItem(ModItems.CORN),
		                                                          conditionsFromItem(ModItems.CORN))
		                          .offerTo(exporter,
		                                   new Identifier(getRecipeName(ModItems.CORN_SEEDS)));

		createCrateRecipe(ModItems.TOMATO, ModBlocks.TOMATO_CRATE, exporter);
		createCrateRecipe(ModItems.LETTUCE, ModBlocks.LETTUCE_CRATE, exporter);
		createCrateRecipe(ModItems.CORN, ModBlocks.CORN_CRATE, exporter);
		createCrateRecipe(Items.POTATO, ModBlocks.POTATO_CRATE, exporter);
		createCrateRecipe(Items.CARROT, ModBlocks.CARROT_CRATE, exporter);
		createCrateRecipe(Items.BEETROOT, ModBlocks.BEETROOT_CRATE, exporter);

		createModGearTypeRecipes(ModGearType.BRONZE, exporter);
		createModStoneTypeRecipes(exporter);
		createModWoodTypesRecipes(exporter);
		createOreSmeltingRecipes(exporter);
	}

	/**
	 * This Method is used to generate all Crafting Recipes for the given GearType
	 *
	 * @param gearType The ModGearType that all craftingRecipes are to be generated for
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createModGearTypeRecipes(ModGearType gearType, RecipeExporter exporter) {
		Item material = gearType.getMaterial();
		Item helmet = gearType.getHelmet();
		Item chestplate = gearType.getChestplate();
		Item leggings = gearType.getLeggings();
		Item boots = gearType.getBoots();
		Item sword = gearType.getSword();
		Item axe = gearType.getAxe();
		Item pickaxe = gearType.getPickaxe();
		Item shovel = gearType.getShovel();
		Item hoe = gearType.getHoe();

		if(!gearType.isVanillaAddition()) {
			if(helmet != null) {
				createHelmetRecipe(material, helmet, exporter);
			}
			if(chestplate != null) {
				createChestplateRecipe(material, chestplate, exporter);
			}
			if(leggings != null) {
				createLegginsRecipe(material, leggings, exporter);
			}
			if(boots != null) {
				createBootsRecipe(material, boots, exporter);
			}
			if(sword != null) {
				createSwordRecipe(material, sword, exporter);
			}
			if(axe != null) {
				createAxeRecipe(material, axe, exporter);
			}
			if(pickaxe != null) {
				createPickaxeRecipe(material, pickaxe, exporter);
			}
			if(shovel != null) {
				createShovelRecipe(material, shovel, exporter);
			}
			if(hoe != null) {
				createHoeRecipe(material, hoe, exporter);
			}
		}
	}

	/**
	 * This Method is used to create all crafting recipes using the given ModStoneType
	 *
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createModStoneTypeRecipes(RecipeExporter exporter) {
		for(ModStoneType stoneType : ModStoneType.values()) {

			generateStoneTypeVariantStoneCuttingRecipes(exporter, stoneType.getStoneFamily(),
					stoneType.getBrickFamily(), stoneType.getTilesFamily(),
					stoneType.getFancyBricksFamily(),	stoneType.getPavementFamily(),
					stoneType.getPillar(), stoneType.getPillarSlab(), StoneTypeVariants.STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, stoneType.getMossyStoneFamily(),
					stoneType.getMossyBrickFamily(), stoneType.getMossyTilesFamily(),
					stoneType.getMossyFancyBricksFamily(), stoneType.getMossyPavementFamily(),
					stoneType.getMossyPillar(), stoneType.getMossyPillarSlab(), StoneTypeVariants.MOSSY_STONE,
					stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, stoneType.getOvergrownStoneFamily(),
					stoneType.getOvergrownBrickFamily(), stoneType.getOvergrownTilesFamily(),
					stoneType.getOvergrownFancyBricksFamily(), stoneType.getOvergrownPavementFamily(),
					stoneType.getOvergrownPillar(), stoneType.getOvergrownPillarSlab(), StoneTypeVariants.OVERGROWN_STONE,
					stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedBrickFamily(), stoneType.getCrackedTilesFamily(),
					stoneType.getCrackedFancyBricksFamily(), stoneType.getCrackedPavementFamily(),
					stoneType.getCrackedPillar(), stoneType.getCrackedPillarSlab(),
					StoneTypeVariants.CRACKED_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedMossyBrickFamily(), stoneType.getCrackedMossyTilesFamily(),
					stoneType.getCrackedMossyFancyBricksFamily(), stoneType.getCrackedMossyPavementFamily(),
					stoneType.getCrackedMossyPillar(), stoneType.getCrackedMossyPillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedOvergrownBrickFamily(), stoneType.getCrackedOvergrownTilesFamily(),
					stoneType.getCrackedOvergrownFancyBricksFamily(), stoneType.getCrackedOvergrownPavementFamily(),
					stoneType.getCrackedOvergrownPillar(), stoneType.getCrackedOvergrownPillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getBronzeBrickFamily(), stoneType.getBronzeTilesFamily(),
					stoneType.getBronzeFancyBricksFamily(), stoneType.getBronzePavementFamily(),
					stoneType.getBronzePillar(), stoneType.getBronzePillarSlab(), StoneTypeVariants.BRONZE_STONE,
					stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getMossyBronzeBrickFamily(), stoneType.getMossyBronzeTilesFamily(),
					stoneType.getMossyBronzeFancyBricksFamily(), stoneType.getMossyBronzePavementFamily(),
					stoneType.getMossyBronzePillar(), stoneType.getMossyBronzePillarSlab(),
					StoneTypeVariants.MOSSY_BRONZE_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getOvergrownBronzeBrickFamily(), stoneType.getOvergrownBronzeTilesFamily(),
					stoneType.getOvergrownBronzeFancyBricksFamily(), stoneType.getOvergrownBronzePavementFamily(),
					stoneType.getOvergrownBronzePillar(), stoneType.getOvergrownBronzePillarSlab(),
					StoneTypeVariants.OVERGROWN_BRONZE_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedBronzeBrickFamily(), stoneType.getCrackedBronzeTilesFamily(),
					stoneType.getCrackedBronzeFancyBricksFamily(), stoneType.getCrackedBronzePavementFamily(),
					stoneType.getCrackedBronzePillar(), stoneType.getCrackedBronzePillarSlab(),
					StoneTypeVariants.CRACKED_BRONZE_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedMossyBronzeBrickFamily(), stoneType.getCrackedMossyBronzeTilesFamily(),
					stoneType.getCrackedMossyBronzeFancyBricksFamily(), stoneType.getCrackedMossyBronzePavementFamily(),
					stoneType.getCrackedMossyBronzePillar(), stoneType.getCrackedMossyBronzePillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedOvergrownBronzeBrickFamily(), stoneType.getCrackedOvergrownBronzeTilesFamily(),
					stoneType.getCrackedOvergrownBronzeFancyBricksFamily(), stoneType.getCrackedOvergrownBronzePavementFamily(),
					stoneType.getCrackedOvergrownBronzePillar(), stoneType.getCrackedOvergrownBronzePillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getSilverBrickFamily(), stoneType.getSilverTilesFamily(),
					stoneType.getSilverFancyBricksFamily(), stoneType.getSilverPavementFamily(),
					stoneType.getSilverPillar(), stoneType.getSilverPillarSlab(), StoneTypeVariants.SILVER_STONE,
					stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getMossySilverBrickFamily(), stoneType.getMossySilverTilesFamily(),
					stoneType.getMossySilverFancyBricksFamily(), stoneType.getMossySilverPavementFamily(),
					stoneType.getMossySilverPillar(), stoneType.getMossySilverPillarSlab(),
					StoneTypeVariants.MOSSY_SILVER_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getOvergrownSilverBrickFamily(), stoneType.getOvergrownSilverTilesFamily(),
					stoneType.getOvergrownSilverFancyBricksFamily(), stoneType.getOvergrownSilverPavementFamily(),
					stoneType.getOvergrownSilverPillar(), stoneType.getOvergrownSilverPillarSlab(),
					StoneTypeVariants.OVERGROWN_SILVER_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedSilverBrickFamily(), stoneType.getCrackedSilverTilesFamily(),
					stoneType.getCrackedSilverFancyBricksFamily(), stoneType.getCrackedSilverPavementFamily(),
					stoneType.getCrackedSilverPillar(), stoneType.getCrackedSilverPillarSlab(),
					StoneTypeVariants.CRACKED_SILVER_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedMossySilverBrickFamily(), stoneType.getCrackedMossySilverTilesFamily(),
					stoneType.getCrackedMossySilverFancyBricksFamily(), stoneType.getCrackedMossySilverPavementFamily(),
					stoneType.getCrackedMossySilverPillar(), stoneType.getCrackedMossySilverPillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedOvergrownSilverBrickFamily(), stoneType.getCrackedOvergrownSilverTilesFamily(),
					stoneType.getCrackedOvergrownSilverFancyBricksFamily(), stoneType.getCrackedOvergrownSilverPavementFamily(),
					stoneType.getCrackedOvergrownSilverPillar(), stoneType.getCrackedOvergrownSilverPillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getGoldBrickFamily(), stoneType.getGoldTilesFamily(),
					stoneType.getGoldFancyBricksFamily(), stoneType.getGoldPavementFamily(),
					stoneType.getGoldPillar(), stoneType.getGoldPillarSlab(),
					StoneTypeVariants.GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getMossyGoldBrickFamily(), stoneType.getMossyGoldTilesFamily(),
					stoneType.getMossyGoldFancyBricksFamily(), stoneType.getMossyGoldPavementFamily(),
					stoneType.getMossyGoldPillar(), stoneType.getMossyGoldPillarSlab(),
					StoneTypeVariants.MOSSY_GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getOvergrownGoldBrickFamily(), stoneType.getOvergrownGoldTilesFamily(),
					stoneType.getOvergrownGoldFancyBricksFamily(), stoneType.getOvergrownGoldPavementFamily(),
					stoneType.getOvergrownGoldPillar(), stoneType.getOvergrownGoldPillarSlab(),
					StoneTypeVariants.OVERGROWN_GOLD_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedGoldBrickFamily(), stoneType.getCrackedGoldTilesFamily(),
					stoneType.getCrackedGoldFancyBricksFamily(), stoneType.getCrackedGoldPavementFamily(),
					stoneType.getCrackedGoldPillar(), stoneType.getCrackedGoldPillarSlab(),
					StoneTypeVariants.CRACKED_GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedMossyGoldBrickFamily(), stoneType.getCrackedMossyGoldTilesFamily(),
					stoneType.getCrackedMossyGoldFancyBricksFamily(), stoneType.getCrackedMossyGoldPavementFamily(),
					stoneType.getCrackedMossyGoldPillar(), stoneType.getCrackedMossyGoldPillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedOvergrownGoldBrickFamily(), stoneType.getCrackedOvergrownGoldTilesFamily(),
					stoneType.getCrackedOvergrownGoldFancyBricksFamily(), stoneType.getCrackedOvergrownGoldPavementFamily(),
					stoneType.getCrackedOvergrownGoldPillar(), stoneType.getCrackedOvergrownGoldPillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, stoneType.getName().toLowerCase());

			//Stone, MossyStone, OvergrownStone
			createStoneBlockFamilyRecipes(exporter, stoneType.getStoneFamily(), stoneType.getName());

			//Cobbled, MossyCobbled, OvergrownCobbled
			createStoneBlockFamilyRecipes(exporter, stoneType.getCobbledFamily(), stoneType.getName());
			createMossyRecipe(stoneType.getCobbledVariant("base"),
					stoneType.getMossyCobbledVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getMossyCobbledFamily(), stoneType.getName());
			createMossyRecipe(stoneType.getMossyCobbledVariant("base"),
					stoneType.getOvergrownCobbledVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getCobbledVariant("base"),
					stoneType.getOvergrownCobbledVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getOvergrownCobbledFamily(), stoneType.getName());

			//CobbledBrick, MossyCobbledBrick, OvergrownCobbledBrick
			//BronzeCobbledBrick, MossyBronzeCobbledBrick, OvergrownBronzeCobbledBrick
			//SilverCobbledBrick, MossySilverCobbledBrick, OvergrownSilverCobbledBrick
			//GoldCobbledBrick, MossyGoldCobbledBrick, OvergrownGoldCobbledBrick
			//CrackedCobbledBrick, CrackedMossyCobbledBrick, CrackedOvergrownCobbledBrick
			//CrackedBronzeCobbledBrick, CrackedMossyBronzeCobbledBrick, CrackedOvergrownBronzeCobbledBrick
			//CrackedSilverCobbledBrick, CrackedMossySilverCobbledBrick, CrackedOvergrownSilverCobbledBrick
			//CrackedGoldCobbledBrick, CrackedMossyGoldCobbledBrick, CrackedOvergrownGoldCobbledBrick
			createStoneBlockFamilyRecipes(exporter, stoneType.getCobbledBrickFamily(), stoneType.getName(),
					stoneType.getCobbledVariant("base"));
			createMossyRecipe(stoneType.getCobbledBrickVariant("base"),
					stoneType.getMossyCobbledBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getMossyCobbledBrickFamily(), stoneType.getName(),
					stoneType.getMossyCobbledVariant("base"));
			createMossyRecipe(stoneType.getMossyCobbledBrickVariant("base"),
					stoneType.getOvergrownCobbledBrickVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getCobbledBrickVariant("base"),
					stoneType.getOvergrownCobbledBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getOvergrownCobbledBrickFamily(), stoneType.getName(),
					stoneType.getOvergrownCobbledVariant("base"));

			//Smooth, MossySmooth, OvergrownSmooth
			//BronzeSmooth, MossyBronzeSmooth, OvergrownBronzeSmooth
			//SilverSmooth, MossySilverSmooth, OvergrownSilverSmooth
			//GoldSmooth, MossyGoldSmooth, OvergrownGoldSmooth
			//CrackedSmooth, CrackedMossySmooth, CrackedOvergrownSmooth
			//CrackedBronzeSmooth, CrackedMossyBronzeSmooth, CrackedOvergrownBronzeSmooth
			//CrackedSilverSmooth, CrackedMossySilverSmooth, CrackedOvergrownSilverSmooth
			//CrackedGoldSmooth, CrackedMossyGoldSmooth, CrackedOvergrownGoldSmooth
			if (stoneType.getSmooth() != null) {
				CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getStoneVariant("base")),
								RecipeCategory.BUILDING_BLOCKS, stoneType.getSmooth().asItem(),
								0.1f, 200)
						.criterion("has_stone", VanillaRecipeProvider
								.conditionsFromItem(stoneType.getStoneVariant("base"))).offerTo(exporter);
				if (stoneType.getSmoothSlab() != null) {
					offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getSmoothSlab(), stoneType.getSmooth());
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getSmoothSlab(), stoneType.getSmooth(), 1);
				}
				if (stoneType.getCrackedSmooth() != null) {
					CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getSmooth()),
									RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedSmooth().asItem(),
									0.1f, 200)
							.criterion("has_smooth_stone", VanillaRecipeProvider
									.conditionsFromItem(stoneType.getSmooth())).offerTo(exporter);
					if (stoneType.getCrackedSmoothSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedSmoothSlab(), stoneType.getCrackedSmooth());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedSmoothSlab(), stoneType.getCrackedSmooth(), 2);
					}
				}
			}

			//Brick, MossyBrick, OvergrownBrick
			//BronzeBrick, MossyBronzeBrick, OvergrownBronzeBrick
			//SilverBrick, MossySilverBrick, OvergrownSilverBrick
			//GoldBrick, MossyGoldBrick, OvergrownGoldBrick
			//CrackedBrick, CrackedMossyBrick, CrackedOvergrownBrick
			//CrackedBronzeBrick, CrackedMossyBronzeBrick, CrackedOvergrownBronzeBrick
			//CrackedSilverBrick, CrackedMossySilverBrick, CrackedOvergrownSilverBrick
			//CrackedGoldBrick, CrackedMossyGoldBrick, CrackedOvergrownGoldBrick
			createBricksRecipe(stoneType.getStoneVariant("base"), stoneType.getBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getBrickFamily(), stoneType.getName(),
					stoneType.getStoneVariant("base"));
			createMossyRecipe(stoneType.getBrickVariant("base"),
					stoneType.getMossyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getMossyBrickFamily(), stoneType.getName());
			createMossyRecipe(stoneType.getMossyBrickVariant("base"),
					stoneType.getOvergrownBrickVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getBrickVariant("base"),
					stoneType.getOvergrownBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getOvergrownBrickFamily(), stoneType.getName());
			createOrnamentedRecipe(stoneType.getBrickVariant("base"), Items.GOLD_INGOT,
					stoneType.getGoldBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getGoldBrickFamily(), stoneType.getName());

			CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getBrickVariant("base")),
							RecipeCategory.BUILDING_BLOCKS,stoneType.getCrackedBrickVariant("base").asItem(),
							0.1f, 200)
					.criterion("has_stone_bricks", VanillaRecipeProvider
							.conditionsFromItem(stoneType.getBrickVariant("base"))).offerTo(exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedBrickFamily(), stoneType.getName());
			createMossyRecipe(stoneType.getCrackedBrickVariant("base"),
					stoneType.getCrackedMossyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedMossyBrickFamily(), stoneType.getName());
			createMossyRecipe(stoneType.getCrackedMossyBrickVariant("base"),
					stoneType.getCrackedOvergrownBrickVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getCrackedBrickVariant("base"),
					stoneType.getCrackedOvergrownBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedOvergrownBrickFamily(), stoneType.getName());
			createOrnamentedRecipe(stoneType.getCrackedBrickVariant("base"), Items.GOLD_INGOT,
					stoneType.getCrackedGoldBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedGoldBrickFamily(), stoneType.getName());

			//Tiles, MossyTiles, OvergrownTiles
			//BronzeTiles, MossyBronzeTiles, OvergrownBronzeTiles
			//SilverTiles, MossySilverTiles, OvergrownSilverTiles
			//GoldTiles, MossyGoldTiles, OvergrownGoldTiles
			//CrackedTiles, CrackedMossyTiles, CrackedOvergrownTiles
			//CrackedBronzeTiles, CrackedMossyBronzeTiles, CrackedOvergrownBronzeTiles
			//CrackedSilverTiles, CrackedMossySilverTiles, CrackedOvergrownSilverTiles
			//CrackedGoldTiles, CrackedMossyGoldTiles, CrackedOvergrownGoldTiles
			createBricksRecipe(stoneType.getBrickVariant("base"), stoneType.getTilesVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getTilesFamily(), stoneType.getName(), stoneType.getBrickVariant("base"),
					stoneType.getStoneVariant("base"));
			createMossyRecipe(stoneType.getTilesVariant("base"), stoneType.getMossyTilesVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getMossyTilesFamily(), stoneType.getName());
			createMossyRecipe(stoneType.getMossyTilesVariant("base"), stoneType.getOvergrownTilesVariant("base"),
					exporter);
			createOvergrownRecipe(stoneType.getTilesVariant("base"), stoneType.getOvergrownTilesVariant("base"),
					exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getOvergrownTilesFamily(), stoneType.getName());
			createOrnamentedRecipe(stoneType.getTilesVariant("base"), Items.GOLD_INGOT,
					stoneType.getGoldTilesVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getGoldTilesFamily(), stoneType.getName());

			CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getTilesVariant("base")),
							RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedTilesVariant("base").asItem(),
							0.1f, 200)
					.criterion("has_tiles", VanillaRecipeProvider
							.conditionsFromItem(stoneType.getTilesVariant("base"))).offerTo(exporter);
			createBricksRecipe(stoneType.getCrackedBrickVariant("base"), stoneType.getCrackedTilesVariant("base"), exporter);
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getCrackedTilesVariant("base"), stoneType.getCrackedBrickVariant("base"));
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedTilesFamily(), stoneType.getName(),
					stoneType.getCrackedBrickVariant("base"));
			createMossyRecipe(stoneType.getCrackedTilesVariant("base"), stoneType.getCrackedMossyTilesVariant("base"),
					exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedMossyTilesFamily(), stoneType.getName());
			createMossyRecipe(stoneType.getCrackedMossyTilesVariant("base"),
					stoneType.getCrackedOvergrownTilesVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getCrackedTilesVariant("base"),
					stoneType.getCrackedOvergrownTilesVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedOvergrownTilesFamily(), stoneType.getName());
			createOrnamentedRecipe(stoneType.getCrackedTilesVariant("base"), Items.GOLD_INGOT,
					stoneType.getCrackedGoldTilesVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedGoldTilesFamily(), stoneType.getName());

			//Pavement, MossyPavement, OvergrownPavement
			//BronzePavement, MossyBronzePavement, OvergrownBronzePavement
			//SilverPavement, MossySilverPavement, OvergrownSilverPavement
			//GoldPavement, MossyGoldPavement, OvergrownGoldPavement
			//CrackedPavement, CrackedMossyPavement, CrackedOvergrownPavement
			//CrackedBronzePavement, CrackedMossyBronzePavement, CrackedOvergrownBronzePavement
			//CrackedSilverPavement, CrackedMossySilverPavement, CrackedOvergrownSilverPavement
			//CrackedGoldPavement, CrackedMossyGoldPavement, CrackedOvergrownGoldPavement
			ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stoneType.getPavementVariant("base"), 2)
					.pattern("#").pattern("#").input('#', stoneType.getTilesVariant("base"))
					.criterion(hasItem(stoneType.getTilesVariant("base")), conditionsFromItem(stoneType.getTilesVariant("base")))
					.offerTo(exporter, new Identifier(getRecipeName(stoneType.getPavementVariant("base"))));
			createStoneBlockFamilyRecipes(exporter, stoneType.getPavementFamily(), stoneType.getName(),
					stoneType.getTilesVariant("base"), stoneType.getBrickVariant("base"),
					stoneType.getStoneVariant("base"));

			CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getPavementVariant("base")),
							RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedPavementVariant("base").asItem(),
							0.1f, 200)
					.criterion("has_pavement", VanillaRecipeProvider
							.conditionsFromItem(stoneType.getPavementVariant("base"))).offerTo(exporter);
			ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedPavementVariant("base")
							, 2)
					.pattern("#").pattern("#").input('#', stoneType.getCrackedTilesVariant("base"))
					.criterion(hasItem(stoneType.getPavementVariant("base")),
							conditionsFromItem(stoneType.getPavementVariant("base")))
					.offerTo(exporter,
							new Identifier(getRecipeName(stoneType.getCrackedPavementVariant("base")) + "_crafting"));
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getCrackedPavementVariant("base"), stoneType.getCrackedTilesVariant("base"));
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getCrackedPavementVariant("base"), stoneType.getCrackedBrickVariant("base"));
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedPavementFamily(), stoneType.getName(),
					stoneType.getCrackedTilesVariant("base"), stoneType.getCrackedBrickVariant("base"));

			//FancyBricks, MossyFancyBricks, OvergrownFancyBricks
			//BronzeFancyBricks, MossyBronzeFancyBricks, OvergrownBronzeFancyBricks
			//SilverFancyBricks, MossySilverFancyBricks, OvergrownSilverFancyBricks
			//GoldFancyBricks, MossyGoldFancyBricks, OvergrownGoldFancyBricks
			//CrackedFancyBricks, CrackedMossyFancyBricks, CrackedOvergrownFancyBricks
			//CrackedBronzeFancyBricks, CrackedMossyBronzeFancyBricks, CrackedOvergrownBronzeFancyBricks
			//CrackedSilverFancyBricks, CrackedMossySilverFancyBricks, CrackedOvergrownSilverFancyBricks
			//CrackedGoldFancyBricks, CrackedMossyGoldFancyBricks, CrackedOvergrownGoldFancyBricks
			createBricksRecipe(stoneType.getTilesVariant("base"), stoneType.getFancyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getFancyBricksFamily(), stoneType.getName(),
					stoneType.getTilesVariant("base"), stoneType.getBrickVariant("base"),
					stoneType.getStoneVariant("base"));
			createMossyRecipe(stoneType.getFancyBrickVariant("base"), stoneType.getMossyFancyBrickVariant("base"),
					exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getMossyFancyBricksFamily(), stoneType.getName());
			createMossyRecipe(stoneType.getMossyFancyBrickVariant("base"),
					stoneType.getOvergrownFancyBrickVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getFancyBrickVariant("base"),
					stoneType.getOvergrownFancyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getOvergrownFancyBricksFamily(), stoneType.getName());
			createOrnamentedRecipe(stoneType.getFancyBrickVariant("base"), Items.GOLD_INGOT,
					stoneType.getGoldFancyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getGoldFancyBricksFamily(), stoneType.getName());

			CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getFancyBrickVariant("base")),
							RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedFancyBrickVariant("base").asItem(),
							0.1f, 200)
					.criterion("has_fancy_bricks", VanillaRecipeProvider
							.conditionsFromItem(stoneType.getFancyBrickVariant("base"))).offerTo(exporter);
			createBricksRecipe(stoneType.getCrackedTilesVariant("base"), stoneType.getCrackedFancyBrickVariant("base"),
					exporter);
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getCrackedFancyBrickVariant("base"), stoneType.getCrackedTilesVariant("base"));
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getCrackedFancyBrickVariant("base"), stoneType.getCrackedBrickVariant("base"));
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedFancyBricksFamily(), stoneType.getName(),
					stoneType.getCrackedTilesVariant("base"), stoneType.getCrackedBrickVariant("base"));
			createMossyRecipe(stoneType.getCrackedFancyBrickVariant("base"),
					stoneType.getCrackedMossyFancyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedMossyFancyBricksFamily(), stoneType.getName());
			createMossyRecipe(stoneType.getCrackedMossyFancyBrickVariant("base"),
					stoneType.getCrackedOvergrownFancyBrickVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getCrackedFancyBrickVariant("base"),
					stoneType.getCrackedOvergrownFancyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedOvergrownFancyBricksFamily(), stoneType.getName());
			createOrnamentedRecipe(stoneType.getCrackedFancyBrickVariant("base"), Items.GOLD_INGOT,
					stoneType.getCrackedGoldFancyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedGoldFancyBricksFamily(), stoneType.getName());

			//Pillar, MossyPillar, OvergrownPillar
			//BronzePillar, MossyBronzePillar, OvergrownBronzePillar
			//SilverPillar, MossySilverPillar, OvergrownSilverPillar
			//GoldPillar, MossyGoldPillar, OvergrownGoldPillar
			//CrackedPillar, CrackedMossyPillar, CrackedOvergrownPillar
			//CrackedBronzePillar, CrackedMossyBronzePillar, CrackedOvergrownBronzePillar
			//CrackedSilverPillar, CrackedMossySilverPillar, CrackedOvergrownSilverPillar
			//CrackedGoldPillar, CrackedMossyGoldPillar, CrackedOvergrownGoldPillar
			if (stoneType.getPillar() != null) {
				createPillarRecipe(stoneType.getStoneVariant("base"), stoneType.getPillar(), exporter);
				if (stoneType.getPillarSlab() != null) {
					offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getPillarSlab(), stoneType.getPillar());
				}
				if (stoneType.getCrackedPillar() != null) {
					CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getPillar()),
									RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedPillar().asItem(),
									0.1f, 200)
							.criterion("has_pillar", VanillaRecipeProvider
									.conditionsFromItem(stoneType.getPillar())).offerTo(exporter);
					if (stoneType.getCrackedPillarSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedPillarSlab(), stoneType.getCrackedPillar());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedPillarSlab(), stoneType.getCrackedPillar(), 2);
					}
				}
				if (stoneType.getMossyPillar() != null) {
					createMossyRecipe(stoneType.getPillar(), stoneType.getMossyPillar(), exporter);
					if (stoneType.getMossyPillarSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getMossyPillarSlab(), stoneType.getMossyPillar());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getMossyPillarSlab(), stoneType.getMossyPillar(), 2);
					}
					if (stoneType.getCrackedMossyPillar() != null) {
						CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getMossyPillar()),
								RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedMossyPillar().asItem(),
								0.1f, 200)
							.criterion("has_mossy_pillar", VanillaRecipeProvider
									.conditionsFromItem(stoneType.getMossyPillar())).offerTo(exporter);
						createMossyRecipe(stoneType.getCrackedPillar(), stoneType.getCrackedMossyPillar(), exporter);
						if(stoneType.getCrackedMossyPillarSlab() != null) {
							offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedMossyPillarSlab(), stoneType.getCrackedMossyPillar());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedMossyPillarSlab(), stoneType.getCrackedMossyPillar(), 2);
						}
					}
				}
				if (stoneType.getOvergrownPillar() != null) {
					createMossyRecipe(stoneType.getMossyPillar(), stoneType.getOvergrownPillar(), exporter);
					createOvergrownRecipe(stoneType.getPillar(), stoneType.getOvergrownPillar(), exporter);
					if (stoneType.getOvergrownPillarSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getOvergrownPillarSlab(), stoneType.getOvergrownPillar());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getOvergrownPillarSlab(), stoneType.getOvergrownPillar(), 2);
					}
					if (stoneType.getCrackedOvergrownPillar() != null) {
						CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getOvergrownPillar()),
										RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedOvergrownPillar().asItem(),
										0.1f, 200)
								.criterion("has_overgrown_pillar", VanillaRecipeProvider
										.conditionsFromItem(stoneType.getOvergrownPillar())).offerTo(exporter);
						createMossyRecipe(stoneType.getCrackedMossyPillar(), stoneType.getCrackedOvergrownPillar(),
								exporter);
						createOvergrownRecipe(stoneType.getCrackedPillar(), stoneType.getCrackedOvergrownPillar(), exporter);
						if(stoneType.getCrackedOvergrownPillarSlab() != null) {
							offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedOvergrownPillarSlab(), stoneType.getCrackedOvergrownPillar());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedOvergrownPillarSlab(), stoneType.getCrackedOvergrownPillar(), 2);
						}
					}
				}
				if (stoneType.getGoldPillar() != null) {
					createOrnamentedRecipe(stoneType.getPillar(), Items.GOLD_INGOT, stoneType.getGoldPillar(),
							exporter);
					if (stoneType.getGoldPillarSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getGoldPillarSlab(), stoneType.getGoldPillar());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getGoldPillarSlab(), stoneType.getGoldPillar(), 2);
					}
					if (stoneType.getCrackedGoldPillar() != null) {
						CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getGoldPillar()),
										RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedGoldPillar().asItem(),
										0.1f, 200)
								.criterion("has_goldOrnamented_pillar", VanillaRecipeProvider
										.conditionsFromItem(stoneType.getGoldPillar())).offerTo(exporter);
						createOrnamentedRecipe(stoneType.getCrackedPillar(), Items.GOLD_INGOT, stoneType.getCrackedGoldPillar(), exporter);
						if(stoneType.getCrackedGoldPillarSlab() != null) {
							offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedGoldPillarSlab(), stoneType.getCrackedGoldPillar());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedGoldPillarSlab(), stoneType.getCrackedGoldPillar(), 2);
						}
					}
				}
			}
		}
	}

	/**
	 * This Method is used to create all crafting recipes for all ModWoodTypes
	 *
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createModWoodTypesRecipes(RecipeExporter exporter) {
		for(ModWoodType woodType : ModWoodType.values()) {
			if(!woodType.isVanillaAddition()) {
				generateFamily(exporter, woodType.getWoodFamily());
				generateFamily(exporter, woodType.getStrippedWoodFamily());
				generateFamily(exporter, woodType.getPlanksFamily());
				if(woodType.getLog() != null && woodType.getWood() != null
				   && woodType.getStrippedLog() != null && woodType.getStrippedWood() != null) {
					offerBarkBlockRecipe(exporter, woodType.getWood(), woodType.getLog());
					offerBarkBlockRecipe(exporter, woodType.getStrippedWood(),
					                     woodType.getStrippedLog());
					if(woodType.getPlanks() != null) {
						offerPlanksRecipe(exporter, woodType.getPlanks(),
						                  TagKey.of(RegistryKeys.ITEM, new Identifier("lotr",
						                                                              turnBlockIntoTag(
								                                                              woodType.getLog()))),
						                  4);
					}
				}
				if(woodType.getPlanksBoat() != null) {
					offerBoatRecipe(exporter, woodType.getPlanksBoat(), woodType.getPlanks());
					if(woodType.getPlanksChestBoat() != null) {
						offerChestBoatRecipe(exporter, woodType.getPlanksChestBoat(),
						                     woodType.getPlanksBoat());
					}
				}
			}
		}
	}

	/**
	 * This Method is used to create all smelting recipes for all ModOreTypes, that should have a
	 * smelting recipe
	 *
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createOreSmeltingRecipes(RecipeExporter exporter) {
		for(ModOreType oreType : ModOreType.values()) {
			ItemConvertible smeltedDrop;
			String smeltingGroup = switch(oreType) {
				case TIN_ORE -> {
					smeltedDrop = ModItems.TIN_INGOT;
					yield "tin";
				}
				default -> {
					smeltedDrop = null;
					yield "";
				}
			};
			if(smeltedDrop != null) {
				offerSmelting(exporter, oreType.getSmeltables(), RecipeCategory.MISC, smeltedDrop,
				              0.7f, 200, smeltingGroup);
				offerBlasting(exporter, oreType.getSmeltables(), RecipeCategory.MISC, smeltedDrop,
				              0.7f, 100, smeltingGroup);
			}
		}
	}

	private void createCookedFoodRecipes(RecipeExporter exporter, Item rawItem, Item cookedItem) {
		offerFoodCookingRecipe(exporter, "smooking", RecipeSerializer.SMOKING, 100, rawItem,
		                       cookedItem, 0.35f);
		offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING,
                               600,
		                       rawItem, cookedItem, 0.35f);
		CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(rawItem), RecipeCategory.FOOD,
		                                        cookedItem, 0.35f, 200).criterion("has_food",
		                                                                          VanillaRecipeProvider.conditionsFromItem(
				                                                                          rawItem))
		                        .offerTo(exporter);
	}

	/**
	 * This Method is used to generate a Crafting Recipe for a StorageCrate of the FarmItem
	 *
	 * @param item The Farm Item you wish to compact into a crate
	 * @param crate The Crate for the Farm Item
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createCrateRecipe(Item item, Block crate, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, crate, 1).pattern("###")
		                       .pattern("###").pattern("###").input('#', item)
		                       .criterion(hasItem(item), conditionsFromItem(item))
		                       .offerTo(exporter, new Identifier(getRecipeName(item) + "_crate"));

		ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, item, 9).input(crate)
		                          .criterion(hasItem(crate), conditionsFromItem(crate))
		                          .offerTo(exporter, new Identifier(getRecipeName(item)));

	}

	//ToDo: Make null checks for stone(Ornamented Variants) and null checks for tiles, fancyBricks, pavement pillar
	// and pillarSlab for Cobbled
	private void generateStoneTypeVariantStoneCuttingRecipes(RecipeExporter exporter,
			BlockFamily stone, BlockFamily bricks,
			BlockFamily tiles, BlockFamily fancyBricks, BlockFamily pavement, Block pillar, Block pillarSlab,
			StoneTypeVariants variant, String name) {
		if(stone != null) {
			createBlockFamilyStoneCutting(exporter, stone, variant, name, name);
		}
		createBlockFamilyStoneCutting(exporter, bricks, variant, name + "_bricks", name,
				stone != null ? stone.getBaseBlock() : null);
		createBlockFamilyStoneCutting(exporter, tiles, variant, name + "_tiles", name,
				stone != null ? stone.getBaseBlock() : null, bricks.getBaseBlock());
		createBlockFamilyStoneCutting(exporter, fancyBricks, variant, name + "_fancy_bricks", name,
				stone != null ? stone.getBaseBlock() : null, bricks.getBaseBlock(), tiles.getBaseBlock());
		createBlockFamilyStoneCutting(exporter, pavement, variant, name + "_pavement", name,
				stone != null ? stone.getBaseBlock() : null, bricks.getBaseBlock(), tiles.getBaseBlock());

		if(pillar != null && stone != null) {
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS, stone.getBaseBlock(), pillar, 1,
					createModRecipeName(name + "_pillar", name, variant, "_sc"), exporter);
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS, stone.getBaseBlock(), pillarSlab, 1,
					createModRecipeName(name + "_pillar_slab", name, variant, "_sc"), exporter);
		}
		offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS, pillar, pillarSlab, 2,
				createModRecipeName(name + "_pillar_slab", name + "_pillar", variant, "_sc"), exporter);
	}

	private void createBlockFamilyStoneCutting (RecipeExporter exporter, BlockFamily family,
			StoneTypeVariants variant, String familyName, String stoneTypeName, Block... baseBlocks) {
		List<Block> filteredBaseBlocks =
				Arrays.stream(baseBlocks).filter(baseBlock -> baseBlock != null).collect(Collectors.toList());
		for(Block block : filteredBaseBlocks) {
			String inputName = definedInputName(variant, filteredBaseBlocks, block);
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
					block, family.getBaseBlock(), 1,
					createModRecipeName(familyName, stoneTypeName + inputName, variant, "_sc"), exporter);
		}
		if(family.getVariant(BlockFamily.Variant.CHISELED) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.CHISELED), 1,
					createModRecipeName(stoneTypeName + "_chiseled_bricks", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = definedInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
						block, family.getVariant(BlockFamily.Variant.CHISELED), 1,
						createModRecipeName(stoneTypeName + "_chiseled_bricks", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
		if(family.getVariant(BlockFamily.Variant.STAIRS) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.STAIRS), 1,
					createModRecipeName(familyName + "_stairs", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = definedInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
						block, family.getVariant(BlockFamily.Variant.STAIRS), 1,
						createModRecipeName(familyName + "_stairs", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
		if(family.getVariant(BlockFamily.Variant.SLAB) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.SLAB), 2,
					createModRecipeName(familyName + "_slab", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = definedInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
						block, family.getVariant(BlockFamily.Variant.SLAB), 2,
						createModRecipeName(familyName + "_slab", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
		if(family.getVariant(BlockFamily.Variant.WALL) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.WALL), 1,
					createModRecipeName(familyName + "_wall", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = definedInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
						block, family.getVariant(BlockFamily.Variant.WALL), 1,
						createModRecipeName(familyName + "_wall", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
		if(family.getVariant(BlockFamily.Variant.BUTTON) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.REDSTONE,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.BUTTON), 1,
					createModRecipeName(familyName + "_button", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = definedInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.REDSTONE,
						block, family.getVariant(BlockFamily.Variant.BUTTON), 1,
						createModRecipeName(familyName + "_button", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
		if(family.getVariant(BlockFamily.Variant.PRESSURE_PLATE) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.REDSTONE,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.PRESSURE_PLATE), 1,
					createModRecipeName(familyName + "_pressure_plate", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = definedInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.REDSTONE,
						block, family.getVariant(BlockFamily.Variant.PRESSURE_PLATE), 1,
						createModRecipeName(familyName + "_pressure_plate", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
	}

	private String definedInputName(StoneTypeVariants variant, List<Block> filteredBaseBlocks, Block block) {
		int blockIndex = filteredBaseBlocks.indexOf(block);
		String inputName = "";
		if(!StoneTypeVariants.isOrnamented(variant) && !StoneTypeVariants.isCracked(variant)) {
			inputName = blockIndex == 0 ? "" : blockIndex == 1 ? "_bricks" : "_tiles";
		} else {
			inputName = blockIndex == 0 ? "_bricks" : "tiles";
		}
		return inputName;
	}

	//ToDo: Remove following Method
	/**
	 * Generates all CT-Recipes for the given family, as well as all Stonecutter-Recipes for the family also from the
	 * given baseBlocks
	 * @param exporter the recipe exporter
	 * @param family the blockFamily for which Crafting Recipes should be generated
	 * @param baseBlocks the blocks from which the blockFamily should be craftable in the stonecutter
	 */
	private void createStoneBlockFamilyRecipes(RecipeExporter exporter, BlockFamily family, String name,
			Block... baseBlocks) {
		createStairRecipe(family.getBaseBlock(), family.getVariant(BlockFamily.Variant.STAIRS), exporter);
		offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, family.getVariant(BlockFamily.Variant.SLAB),
				family.getBaseBlock());
		if (family.getVariant(BlockFamily.Variant.WALL) != null) {
			offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, family.getVariant(BlockFamily.Variant.WALL),
					family.getBaseBlock());
		}
		if (family.getVariant(BlockFamily.Variant.BUTTON) != null) {
			createButtonRecipe(family.getBaseBlock(), family.getVariant(BlockFamily.Variant.BUTTON), exporter);
		}
		if (family.getVariant(BlockFamily.Variant.PRESSURE_PLATE) != null) {
			offerPressurePlateRecipe(exporter, family.getVariant(BlockFamily.Variant.PRESSURE_PLATE),
					family.getBaseBlock());
		}
		if (family.getVariant(BlockFamily.Variant.CHISELED) != null) {
			createChiseledRecipe(family.getBaseBlock(), family.getVariant(BlockFamily.Variant.CHISELED), exporter);
		}
	}

	/**
	 * Creates a Chiseled Recipe
	 * @param input The Block to be used in the Recipe, should be brick slabs
	 * @param output The resulting Chiseled Block
	 * @param exporter The exporter to which the recipe will be offered.
	 */
	private void createChiseledRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("#")
				.pattern("#").input('#', input)
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This Method creates a ButtonRecipe for the given input stone, which will be turned into 1
	 * button.
	 *
	 * @param input a blank stone type
	 * @param output the button of the blank stone type
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createButtonRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1).pattern(" # ")
				.input('#', input)
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This Method creates a StairRecipe for the given input block.
	 *
	 * @param input a base block (stone, planks, etc.)
	 * @param output the stairs of the input
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createStairRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).pattern("#  ")
				.pattern("## ").pattern("###").input('#', input)
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This Method creates a BrickRecipe for the given input-stone which will be turned into 4 of
	 * the given output-stone
	 *
	 * @param input a blank stone type
	 * @param output the brick of the blank stone type
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createBricksRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).pattern("##")
		                       .pattern("##").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output) + "_crafting"));
	}

	/**
	 * Creates a pillar recipe for the given input block.
	 *
	 * @param input    The base block to be used in the recipe.
	 * @param output   The resulting pillar block.
	 * @param exporter The exporter to which the recipe will be offered.
	 */
	private void createPillarRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3).pattern("#")
		                       .pattern("#").pattern("#").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	* Creates a shapeless crafting recipe for a mossy variant of a block.
	*
	* @param input The base block to be combined with a vine to create the mossy variant.
	* @param output The resulting mossy block.
	* @param exporter The exporter to which the recipe will be offered.
	*/
	private void createMossyRecipe(Block input, Block output, RecipeExporter exporter) {
	 ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
	         .input(input)
	         .input(Items.VINE)
	         .criterion(hasItem(input), conditionsFromItem(input))
	         .offerTo(exporter, new Identifier(getRecipeName(output) + "_crafting"));
	}

	/**
	* Creates a shapeless crafting recipe for an overgrown variant of a block.
	*
	* @param input The base block to be combined with vines to create the overgrown variant.
	* @param output The resulting overgrown block.
	* @param exporter The exporter to which the recipe will be offered.
	*/
	private void createOvergrownRecipe(Block input, Block output, RecipeExporter exporter) {
	ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
	    .input(input)
	    .input(Items.VINE)
	    .input(Items.VINE)
	    .criterion(hasItem(input), conditionsFromItem(input))
	    .offerTo(exporter, new Identifier(getRecipeName(output) + "_doublevines"));
	}

	/**
	* Creates a crafting recipe for an ornamented block.
	*
	* @param inputBlock The base block to be ornamented.
	* @param inputItem The item used for ornamentation.
	* @param output The resulting ornamented block.
	* @param exporter The exporter to which the recipe will be offered.
	*/
	private void createOrnamentedRecipe(Block inputBlock, Item inputItem, Block output, RecipeExporter exporter) {
	 ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
	         .pattern("OOO")
	         .pattern("O#O")
	         .pattern("OOO")
	         .input('#', inputBlock)
	         .input('O', inputItem)
	         .criterion(hasItem(inputItem), conditionsFromItem(inputItem))
	         .criterion(hasItem(inputBlock), conditionsFromItem(inputBlock))
	         .offerTo(exporter, new Identifier(getRecipeName(output) + "_crafting"));
	}

	/**
	 * This method creates a SwordRecipe for the given input.
	 *
	 * @param input Ingredient, that should be a ModToolMaterial
	 * @param output The sword made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createSwordRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("#")
		                       .pattern("#").pattern("S").input('#', input).input('S', Items.STICK)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a AxeRecipe for the given input.
	 *
	 * @param input Ingredient, that should be a ModToolMaterial
	 * @param output The axe made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createAxeRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("## ")
		                       .pattern("#S ").pattern(" S ").input('#', input)
		                       .input('S', Items.STICK)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a PickaxeRecipe for the given input.
	 *
	 * @param input Ingredient, that should be a ModToolMaterial
	 * @param output The pickaxe made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createPickaxeRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("###")
		                       .pattern(" S ").pattern(" S ").input('#', input)
		                       .input('S', Items.STICK)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a ShovelRecipe for the given input.
	 *
	 * @param input Ingredient, that should be a ModToolMaterial
	 * @param output The shovel made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createShovelRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("#")
		                       .pattern("S").pattern("S").input('#', input).input('S', Items.STICK)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a HoeRecipe for the given input.
	 *
	 * @param input Ingredient, that should be a ModToolMaterial
	 * @param output The how made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createHoeRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("## ")
		                       .pattern(" S ").pattern(" S ").input('#', input)
		                       .input('S', Items.STICK)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a HelmetRecipe for the given input
	 *
	 * @param input Ingredient, that should be a ModArmorMaterial
	 * @param output The helmet made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createHelmetRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("###")
		                       .pattern("# #").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a ChestplateRecipe for the given input
	 *
	 * @param input Ingredient, that should be a ModArmorMaterial
	 * @param output The chestplate made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createChestplateRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("# #")
		                       .pattern("###").pattern("###").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a LegginsRecipe for the given input
	 *
	 * @param input Ingredient, that should be a ModArmorMaterial
	 * @param output The leggins made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createLegginsRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("###")
		                       .pattern("# #").pattern("# #").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a BootsRecipe for the given input
	 *
	 * @param input Ingredient, that should be a ModArmorMaterial
	 * @param output The boots made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createBootsRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("# #")
		                       .pattern("# #").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * Offers a stonecutting recipe to the exporter. The difference between this and the vanilla method, is that a name
	 * can be defined.
	 *
	 * @param category The category of the recipe.
	 * @param input The input block for the stonecutting recipe.
	 * @param output The output block for the stonecutting recipe.
	 * @param count The number of output items produced.
	 * @param recipePath The path identifier for the recipe.
	 * @param exporter The exporter to which the recipe will be offered.
	 */
	private void offerModStoneCuttingRecipe(RecipeCategory category, Block input, Block output, int count,
			String recipePath, RecipeExporter exporter) {
		SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(input), category, output, count)
				.criterion(RecipeProvider.hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, recipePath);
	}

	/**
	 * Creates a stone cutting recipe name based on various attributes.
	 *
	 * @param outputName The name of the output block.
	 * @param inputName The name of the input block.
	 * @param variant The variant of the stone type.
	 * @param recipeType The type of recipe ("_sc" for stonecutting, "_ct" for crafting grid, "_f" for furnace).
	 * @return The generated stone cutting recipe name.
	 */
	private String createModRecipeName(String outputName, String inputName, StoneTypeVariants variant, String recipeType) {
		String outputPath = StoneTypeVariants.getRecipePath(variant, outputName);
		String inputPath = StoneTypeVariants.getRecipePath(variant, inputName);
		return outputPath + "_from_" + inputPath + recipeType;
	}

	private String turnBlockIntoTag(Block block) {
		return block.getName().getString().replace(' ', '_').toLowerCase();
	}
}