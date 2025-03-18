package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModOreType;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.block.ModWoodType;
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

import java.util.List;

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
			createStoneBlockFamilyRecipes(exporter, stoneType.getStoneFamily());

			createStoneBlockFamilyRecipes(exporter, stoneType.getCobbledFamily());
			createMossyRecipe(stoneType.getCobbledVariant("base"),
					stoneType.getMossyCobbledVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getMossyCobbledFamily());
			createMossyRecipe(stoneType.getMossyCobbledVariant("base"),
					stoneType.getOvergrownCobbledVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getCobbledVariant("base"),
					stoneType.getOvergrownCobbledVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getOvergrownCobbledFamily());

			createStoneBlockFamilyRecipes(exporter, stoneType.getCobbledBrickFamily(),
					stoneType.getCobbledVariant("base"));
			createMossyRecipe(stoneType.getCobbledBrickVariant("base"),
					stoneType.getMossyCobbledBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getMossyCobbledBrickFamily(),
					stoneType.getMossyCobbledVariant("base"));
			createMossyRecipe(stoneType.getMossyCobbledBrickVariant("base"),
					stoneType.getOvergrownCobbledBrickVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getCobbledBrickVariant("base"),
					stoneType.getOvergrownCobbledBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getOvergrownCobbledBrickFamily(),
					stoneType.getOvergrownCobbledVariant("base"));

			createBricksRecipe(stoneType.getStoneVariant("base"), stoneType.getBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getBrickFamily(),
					stoneType.getStoneVariant("base"));
			createMossyRecipe(stoneType.getBrickVariant("base"),
					stoneType.getMossyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getMossyBrickFamily());
			createMossyRecipe(stoneType.getMossyBrickVariant("base"),
					stoneType.getOvergrownBrickVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getBrickVariant("base"),
					stoneType.getOvergrownBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getOvergrownBrickFamily());
			createOrnamentedRecipe(stoneType.getBrickVariant("base"), Items.GOLD_INGOT,
					stoneType.getGoldOrnamentedBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getGoldOrnamentedBrickFamily());

			CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getBrickVariant("base")),
							RecipeCategory.BUILDING_BLOCKS,stoneType.getCrackedBrickVariant("base").asItem(),
							0.1f, 200)
					.criterion("has_stone_bricks", VanillaRecipeProvider
							.conditionsFromItem(stoneType.getBrickVariant("base"))).offerTo(exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedBrickFamily());
			createMossyRecipe(stoneType.getCrackedBrickVariant("base"),
					stoneType.getCrackedMossyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedMossyBrickFamily());
			createMossyRecipe(stoneType.getCrackedMossyBrickVariant("base"),
					stoneType.getCrackedOvergrownBrickVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getCrackedBrickVariant("base"),
					stoneType.getCrackedOvergrownBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedOvergrownBrickFamily());
			createOrnamentedRecipe(stoneType.getCrackedBrickVariant("base"), Items.GOLD_INGOT,
					stoneType.getCrackedGoldOrnamentedBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedGoldOrnamentedBrickFamily());

			createBricksRecipe(stoneType.getBrickVariant("base"), stoneType.getTilesVariant("base"), exporter);
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getTilesVariant("base"),
					stoneType.getBrickVariant("base"));
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getTilesVariant("base"),
					stoneType.getStoneVariant("base"));
			createStoneBlockFamilyRecipes(exporter, stoneType.getTilesFamily(), stoneType.getBrickVariant("base"),
					stoneType.getStoneVariant("base"));
			createMossyRecipe(stoneType.getTilesVariant("base"), stoneType.getMossyTilesVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getMossyTilesFamily());
			createMossyRecipe(stoneType.getMossyTilesVariant("base"), stoneType.getOvergrownTilesVariant("base"),
					exporter);
			createOvergrownRecipe(stoneType.getTilesVariant("base"), stoneType.getOvergrownTilesVariant("base"),
					exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getOvergrownTilesFamily());
			createOrnamentedRecipe(stoneType.getTilesVariant("base"), Items.GOLD_INGOT,
					stoneType.getGoldOrnamentedTilesVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getGoldOrnamentedTilesFamily());

			CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getTilesVariant("base")),
							RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedTilesVariant("base").asItem(),
							0.1f, 200)
					.criterion("has_tiles", VanillaRecipeProvider
							.conditionsFromItem(stoneType.getTilesVariant("base"))).offerTo(exporter);
			createBricksRecipe(stoneType.getCrackedBrickVariant("base"), stoneType.getCrackedTilesVariant("base"), exporter);
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getCrackedTilesVariant("base"), stoneType.getCrackedBrickVariant("base"));
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedTilesFamily(),
					stoneType.getCrackedBrickVariant("base"));
			createMossyRecipe(stoneType.getCrackedTilesVariant("base"), stoneType.getCrackedMossyTilesVariant("base"),
					exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedMossyTilesFamily());
			createMossyRecipe(stoneType.getCrackedMossyTilesVariant("base"),
					stoneType.getCrackedOvergrownTilesVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getCrackedTilesVariant("base"),
					stoneType.getCrackedOvergrownTilesVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedOvergrownTilesFamily());
			createOrnamentedRecipe(stoneType.getCrackedTilesVariant("base"), Items.GOLD_INGOT,
					stoneType.getCrackedGoldOrnamentedTilesVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedGoldOrnamentedTilesFamily());

			ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stoneType.getPavementVariant("base"), 2)
					.pattern("#").pattern("#").input('#', stoneType.getTilesVariant("base"))
					.criterion(hasItem(stoneType.getTilesVariant("base")), conditionsFromItem(stoneType.getTilesVariant("base")))
					.offerTo(exporter, new Identifier(getRecipeName(stoneType.getPavementVariant("base"))));
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getPavementVariant("base"), stoneType.getTilesVariant("base"));
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getPavementVariant("base"), stoneType.getBrickVariant("base"));
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getPavementVariant("base"), stoneType.getStoneVariant("base"));
			createStoneBlockFamilyRecipes(exporter, stoneType.getPavementFamily(),
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
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedPavementFamily(),
					stoneType.getCrackedTilesVariant("base"), stoneType.getCrackedBrickVariant("base"));

			createBricksRecipe(stoneType.getTilesVariant("base"), stoneType.getFancyBrickVariant("base"), exporter);
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getFancyBrickVariant("base"), stoneType.getTilesVariant("base"));
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getFancyBrickVariant("base"), stoneType.getBrickVariant("base"));
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					stoneType.getFancyBrickVariant("base"), stoneType.getStoneVariant("base"));
			createStoneBlockFamilyRecipes(exporter, stoneType.getFancyBricksFamily(),
					stoneType.getTilesVariant("base"), stoneType.getBrickVariant("base"),
					stoneType.getStoneVariant("base"));
			createMossyRecipe(stoneType.getFancyBrickVariant("base"), stoneType.getMossyFancyBrickVariant("base"),
					exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getMossyFancyBricksFamily());
			createMossyRecipe(stoneType.getMossyFancyBrickVariant("base"),
					stoneType.getOvergrownFancyBrickVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getFancyBrickVariant("base"),
					stoneType.getOvergrownFancyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getOvergrownFancyBricksFamily());
			createOrnamentedRecipe(stoneType.getFancyBrickVariant("base"), Items.GOLD_INGOT,
					stoneType.getGoldOrnamentedFancyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getGoldOrnamentedFancyBricksFamily());

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
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedFancyBricksFamily(),
					stoneType.getCrackedTilesVariant("base"), stoneType.getCrackedBrickVariant("base"));
			createMossyRecipe(stoneType.getCrackedFancyBrickVariant("base"),
					stoneType.getCrackedMossyFancyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedMossyFancyBricksFamily());
			createMossyRecipe(stoneType.getCrackedMossyFancyBrickVariant("base"),
					stoneType.getCrackedOvergrownFancyBrickVariant("base"), exporter);
			createOvergrownRecipe(stoneType.getCrackedFancyBrickVariant("base"),
					stoneType.getCrackedOvergrownFancyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedOvergrownFancyBricksFamily());
			createOrnamentedRecipe(stoneType.getCrackedFancyBrickVariant("base"), Items.GOLD_INGOT,
					stoneType.getCrackedGoldOrnamentedFancyBrickVariant("base"), exporter);
			createStoneBlockFamilyRecipes(exporter, stoneType.getCrackedGoldOrnamentedFancyBricksFamily());

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

			if (stoneType.getPillar() != null) {
				createPillarRecipe(stoneType.getStoneVariant("base"), stoneType.getPillar(), exporter);
				offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						stoneType.getPillar(), stoneType.getStoneVariant("base"));
				if (stoneType.getPillarSlab() != null) {
					offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getPillarSlab(), stoneType.getPillar());
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getPillarSlab(), stoneType.getPillar(), 2);
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getPillarSlab(), stoneType.getStoneVariant("base"), 2);
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

	/**
	 * Generates all CT-Recipes for the given family, as well as all Stonecutter-Recipes for the family also from the
	 * given baseBlocks
	 * @param exporter the recipe exporter
	 * @param family the blockFamily for which Crafting Recipes should be generated
	 * @param baseBlocks the blocks from which the blockFamily should be craftable in the stonecutter
	 */
	private void createStoneBlockFamilyRecipes(RecipeExporter exporter, BlockFamily family, Block... baseBlocks) {
		createStairRecipe(family.getBaseBlock(), family.getVariant(BlockFamily.Variant.STAIRS), exporter);
		offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
				family.getVariant(BlockFamily.Variant.STAIRS), family.getBaseBlock());
		for (Block block : baseBlocks) {
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					family.getVariant(BlockFamily.Variant.STAIRS), block);
		}
		offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, family.getVariant(BlockFamily.Variant.SLAB),
				family.getBaseBlock());
		offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
				family.getVariant(BlockFamily.Variant.SLAB), family.getBaseBlock(), 2);
		for (Block block : baseBlocks) {
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					family.getVariant(BlockFamily.Variant.SLAB), block, 2);
		}
		if (family.getVariant(BlockFamily.Variant.WALL) != null) {
			offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, family.getVariant(BlockFamily.Variant.WALL),
					family.getBaseBlock());
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					family.getVariant(BlockFamily.Variant.WALL), family.getBaseBlock());
			for (Block block : baseBlocks) {
				offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						family.getVariant(BlockFamily.Variant.WALL), block);
			}
		}
		if (family.getVariant(BlockFamily.Variant.BUTTON) != null) {
			createButtonRecipe(family.getBaseBlock(), family.getVariant(BlockFamily.Variant.BUTTON), exporter);
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					family.getVariant(BlockFamily.Variant.BUTTON), family.getBaseBlock());
			for (Block block : baseBlocks) {
				offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						family.getVariant(BlockFamily.Variant.BUTTON), block);
			}
		}
		if (family.getVariant(BlockFamily.Variant.PRESSURE_PLATE) != null) {
			offerPressurePlateRecipe(exporter, family.getVariant(BlockFamily.Variant.PRESSURE_PLATE),
					family.getBaseBlock());
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					family.getVariant(BlockFamily.Variant.PRESSURE_PLATE), family.getBaseBlock());
			for (Block block : baseBlocks) {
				offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						family.getVariant(BlockFamily.Variant.PRESSURE_PLATE), block);
			}
		}
		if (family.getVariant(BlockFamily.Variant.CHISELED) != null) {
			createChiseledRecipe(family.getBaseBlock(), family.getVariant(BlockFamily.Variant.CHISELED), exporter);
			offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					family.getVariant(BlockFamily.Variant.CHISELED), family.getBaseBlock());
			for (Block block : baseBlocks) {
				offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						family.getVariant(BlockFamily.Variant.CHISELED), block);
			}
		}
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

	private void createPillarRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3).pattern("#")
		                       .pattern("#").pattern("#").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	private void createChiseledRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("#")
				               .pattern("#").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This Method creates a Crafting Recipe, that uses 2 input-stone and 2 cobble to create 4
	 * output-cobbled-stone
	 *
	 * @param input a blank stone type
	 * @param output the cobbled variant of the blank stone type
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createCobbledStoneTypeRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).pattern("#C")
		                       .pattern("C#").input('#', input).input('C', Items.COBBLESTONE)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.COBBLESTONE),
		                                  conditionsFromItem(Items.COBBLESTONE))
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
	             .offerTo(exporter, new Identifier(getRecipeName(output)));
	 }

	 private void createOvergrownRecipe(Block input, Block output, RecipeExporter exporter) {
		 ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
				 .input(input)
				 .input(Items.VINE)
				 .input(Items.VINE)
				 .criterion(hasItem(input), conditionsFromItem(input))
				 .offerTo(exporter, new Identifier(getRecipeName(output) + "_doublevines"));
	 }

	 private void createOrnamentedRecipe(Block inputBlock, Item inputItem, Block output, RecipeExporter exporter) {
		 ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
				 .pattern("OOO")
				 .pattern("O#O")
				 .pattern("OOO")
				 .input('#', inputBlock)
				 .input('O', inputItem)
				 .criterion(hasItem(inputItem), conditionsFromItem(inputItem))
				 .criterion(hasItem(inputBlock), conditionsFromItem(inputBlock))
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

	private String turnBlockIntoTag(Block block) {
		return block.getName().getString().replace(' ', '_').toLowerCase();
	}
}