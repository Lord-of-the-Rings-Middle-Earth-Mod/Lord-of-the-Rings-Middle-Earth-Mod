package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.item.ModGearType;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

/**
 * This class is used to register all crafting recipes the mod provides.
 */
public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * This method is where all crafting recipes are added via code.
     * @param exporter A RecipeJsonProvider, which is provided by minecraft
     */
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 200, "tin");
        offerBlasting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 100, "tin");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_INGOT)
                .input(ModItems.TIN_INGOT)
                .input(Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.TIN_INGOT), conditionsFromItem(ModItems.TIN_INGOT))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_INGOT) + "_crafting"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN, RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.MISC, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT, RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK);

        createModGearTypeRecipes(ModGearType.BRONZE, exporter);

        createModStoneTypeRecipes(ModStoneType.ANDESITE, exporter, ModStoneType.COBBLED_ANDESITE, ModStoneType.ANDESITE_BRICK);
        createModStoneTypeRecipes(ModStoneType.POLISHED_ANDESITE, exporter, null, null);
        createModStoneTypeRecipes(ModStoneType.COBBLED_ANDESITE, exporter, null, null);
        createModStoneTypeRecipes(ModStoneType.ANDESITE_BRICK, exporter, null, null);

        createModStoneTypeRecipes(ModStoneType.DIORITE, exporter, ModStoneType.COBBLED_DIORITE, ModStoneType.DIORITE_BRICK);
        createModStoneTypeRecipes(ModStoneType.POLISHED_DIORITE, exporter, null, null);
        createModStoneTypeRecipes(ModStoneType.COBBLED_DIORITE, exporter, null, null);
        createModStoneTypeRecipes(ModStoneType.DIORITE_BRICK, exporter, null, null);

        createModStoneTypeRecipes(ModStoneType.GRANITE, exporter, ModStoneType.COBBLED_GRANITE, ModStoneType.GRANITE_BRICK);
        createModStoneTypeRecipes(ModStoneType.POLISHED_GRANITE, exporter, null, null);
        createModStoneTypeRecipes(ModStoneType.COBBLED_GRANITE, exporter, null, null);
        createModStoneTypeRecipes(ModStoneType.GRANITE_BRICK, exporter, null, null);

        createModStoneTypeRecipes(ModStoneType.SMOOTH_BASALT, exporter, null, ModStoneType.BASALT_BRICKS);
        createModStoneTypeRecipes(ModStoneType.BASALT_BRICKS, exporter, null, null);

        createModStoneTypeRecipes(ModStoneType.BLUESLATE, exporter, ModStoneType.COBBLED_BLUESLATE, ModStoneType.BLUESLATE_BRICK);
        createModStoneTypeRecipes(ModStoneType.COBBLED_BLUESLATE, exporter, null, null);
        createModStoneTypeRecipes(ModStoneType.BLUESLATE_BRICK, exporter, null, null);

        createModStoneTypeRecipes(ModStoneType.CHALK, exporter, ModStoneType.COBBLED_CHALK, ModStoneType.CHALK_BRICK);
        createModStoneTypeRecipes(ModStoneType.COBBLED_CHALK, exporter, null, null);
        createModStoneTypeRecipes(ModStoneType.CHALK_BRICK, exporter, null, null);
    }

    /**
     * This Method is used to generate all Crafting Recipes for the given GearType
     * @param gearType The ModGearType that all craftingRecipes are to be generated for
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createModGearTypeRecipes (ModGearType gearType, Consumer<RecipeJsonProvider> exporter) {
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

        if (!gearType.isVanillaAddition()){
            if (helmet != null) {
                createHelmetRecipe(material, helmet, exporter);
            }
            if (chestplate != null) {
                createChestplateRecipe(material, chestplate, exporter);
            }
            if (leggings != null) {
                createLegginsRecipe(material, leggings, exporter);
            }
            if (boots != null) {
                createBootsRecipe(material, boots, exporter);
            }
            if (sword != null) {
                createSwordRecipe(material, sword, exporter);
            }
            if (axe != null) {
                createAxeRecipe(material, axe, exporter);
            }
            if (pickaxe != null) {
                createPickaxeRecipe(material, pickaxe, exporter);
            }
            if (shovel != null) {
                createShovelRecipe(material, shovel, exporter);
            }
            if (hoe != null) {
                createHoeRecipe(material, hoe, exporter);
            }
        }
    }

    /**
     * This Method is used to create all crafting recipes using the given ModStoneType
     * @param stoneType The ModStoneType, for which all Recipes are to be created
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     * @param cobbledVariant The cobbled version of the stoneType, null if there is none
     * @param brickVariant The bricks of the stoneType, null if there is none
     */
    private void createModStoneTypeRecipes (ModStoneType stoneType, Consumer<RecipeJsonProvider> exporter, ModStoneType cobbledVariant, ModStoneType brickVariant) {
        Block baseBlock = stoneType.getBaseBlock();
        Block stairBlock = stoneType.getStairBlock();
        Block slabBlock = stoneType.getSlabBlock();
        Block wallBlock = stoneType.getWallBlock();
        Block buttonBlock = stoneType.getButtonBlock();
        Block pressurePlateBlock = stoneType.getPressurePlateBlock();

        if (baseBlock != null) {
            if (stairBlock != null) {
                createStairRecipe(baseBlock, stairBlock, exporter);
                offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stairBlock, baseBlock, 1);
            }
            if (slabBlock != null) {
                offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, slabBlock, baseBlock);
                offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, slabBlock, baseBlock, 2);
            }
            if (wallBlock != null) {
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, wallBlock, baseBlock);
                offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, wallBlock, baseBlock, 1);
            }
            if (buttonBlock != null) {
                createButtonRecipe(baseBlock, buttonBlock, exporter);
            }
            if (pressurePlateBlock != null) {
                offerPressurePlateRecipe(exporter, pressurePlateBlock, baseBlock);
            }
            if (cobbledVariant != null && !cobbledVariant.isVanillaAddition()) {
                createCobbledStoneTypeRecipe(baseBlock, cobbledVariant.getBaseBlock(), exporter);
            }
            if (brickVariant != null) {
                if (!brickVariant.isVanillaAddition()) {
                    createBricksRecipe(baseBlock, brickVariant.getBaseBlock(), exporter);
                    offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, brickVariant.getBaseBlock(), baseBlock);
                }
                if (brickVariant.getStairBlock() != null) {
                    offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, brickVariant.getStairBlock(), baseBlock, 1);
                }
                if (brickVariant.getSlabBlock() != null) {
                    offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, brickVariant.getSlabBlock(), baseBlock, 2);
                }
                if (brickVariant.getWallBlock() != null) {
                    offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, brickVariant.getWallBlock(), baseBlock, 1);
                }
            }
        }
    }

    /**
     * This Method creates a BrickRecipe for the given input-stone which will be turned into 4 of the given output-stone
     * @param input a blank stone type
     * @param output the brick of the blank stone type
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createBricksRecipe (Block input, Block output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("##")
                .pattern("##")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This Method creates a Crafting Recipe, that uses 2 input-stone and 2 cobble to create 4 output-cobbled-stone
     * @param input a blank stone type
     * @param output the cobbled variant of the blank stone type
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createCobbledStoneTypeRecipe (Block input, Block output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("#C")
                .pattern("C#")
                .input('#', input)
                .input('C', Items.COBBLESTONE)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This Method creates a ButtonRecipe for the given input stone, which will be turned into 1 button.
     * @param input a blank stone type
     * @param output the button of the blank stone type
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createButtonRecipe (Block input, Block output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1)
                .pattern(" # ")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This Method creates a StairRecipe for the given input block.
     * @param input a base block (stone, planks, etc.)
     * @param output the stairs of the input
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createStairRecipe (Block input, Block output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a SwordRecipe for the given input.
     * @param input Ingredient, that should be a ModToolMaterial
     * @param output The sword made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createSwordRecipe (Item input, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .input('#', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a AxeRecipe for the given input.
     * @param input Ingredient, that should be a ModToolMaterial
     * @param output The axe made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createAxeRecipe (Item input, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a PickaxeRecipe for the given input.
     * @param input Ingredient, that should be a ModToolMaterial
     * @param output The pickaxe made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createPickaxeRecipe (Item input, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a ShovelRecipe for the given input.
     * @param input Ingredient, that should be a ModToolMaterial
     * @param output The shovel made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createShovelRecipe (Item input, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .input('#', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a HoeRecipe for the given input.
     * @param input Ingredient, that should be a ModToolMaterial
     * @param output The how made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createHoeRecipe (Item input, Item output, Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a HelmetRecipe for the given input
     * @param input Ingredient, that should be a ModArmorMaterial
     * @param output The helmet made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createHelmetRecipe(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a ChestplateRecipe for the given input
     * @param input Ingredient, that should be a ModArmorMaterial
     * @param output The chestplate made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createChestplateRecipe(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a LegginsRecipe for the given input
     * @param input Ingredient, that should be a ModArmorMaterial
     * @param output The leggins made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createLegginsRecipe(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a BootsRecipe for the given input
     * @param input Ingredient, that should be a ModArmorMaterial
     * @param output The boots made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createBootsRecipe(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
}