package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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

        createSwordRecipe(ModItems.BRONZE_INGOT, ModItems.BRONZE_SWORD, exporter);
        createAxeRecipe(ModItems.BRONZE_INGOT, ModItems.BRONZE_AXE, exporter);
        createPickaxeRecipe(ModItems.BRONZE_INGOT, ModItems.BRONZE_PICKAXE, exporter);
        createShovelRecipe(ModItems.BRONZE_INGOT, ModItems.BRONZE_SHOVEL, exporter);
        createHoeRecipe(ModItems.BRONZE_INGOT, ModItems.BRONZE_HOE, exporter);

        createHelmetRecipe(ModItems.BRONZE_INGOT, ModItems.BRONZE_HELMET, exporter);
        createChestplateRecipe(ModItems.BRONZE_INGOT, ModItems.BRONZE_CHESTPLATE, exporter);
        createLegginsRecipe(ModItems.BRONZE_INGOT, ModItems.BRONZE_LEGGINGS, exporter);
        createBootsRecipe(ModItems.BRONZE_INGOT, ModItems.BRONZE_BOOTS, exporter);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN, RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.MISC, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT, RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK);

        /*
         * Andesite
         */
        offerPressurePlateRecipe(exporter, ModBlocks.ANDESITE_PRESSURE_PLATE, Blocks.ANDESITE);
        createButtonRecipe(Blocks.ANDESITE, ModBlocks.ANDESITE_BUTTON, exporter);
        /*
         * Cobbled Andesite
         */
        createCobbledStoneTypeRecipe(Blocks.ANDESITE, ModBlocks.COBBLED_ANDESITE, exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ANDESITE_SLAB, ModBlocks.COBBLED_ANDESITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ANDESITE_WALL, ModBlocks.COBBLED_ANDESITE);
        offerPressurePlateRecipe(exporter, ModBlocks.COBBLED_ANDESITE_PRESSURE_PLATE, ModBlocks.COBBLED_ANDESITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ANDESITE_STAIRS, ModBlocks.COBBLED_ANDESITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ANDESITE_SLAB, ModBlocks.COBBLED_ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ANDESITE_WALL, ModBlocks.COBBLED_ANDESITE, 1);

        createButtonRecipe(ModBlocks.COBBLED_ANDESITE, ModBlocks.COBBLED_ANDESITE_BUTTON, exporter);
        createStairRecipe(ModBlocks.COBBLED_ANDESITE, ModBlocks.COBBLED_ANDESITE_STAIRS, exporter);
        /*
         * Andesite Bricks
         */
        createBricksRecipe(Blocks.ANDESITE, ModBlocks.ANDESITE_BRICK, exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK, Blocks.ANDESITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.ANDESITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICK, 1);

        createStairRecipe(ModBlocks.ANDESITE_BRICK, ModBlocks.ANDESITE_BRICK_STAIRS, exporter);
        /*
         * Chalk
         */
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_SLAB, ModBlocks.CHALK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_WALL, ModBlocks.CHALK);
        offerPressurePlateRecipe(exporter, ModBlocks.CHALK_PRESSURE_PLATE, ModBlocks.CHALK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_STAIRS, ModBlocks.CHALK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_SLAB, ModBlocks.CHALK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_WALL, ModBlocks.CHALK, 1);

        createButtonRecipe(ModBlocks.CHALK, ModBlocks.CHALK_BUTTON, exporter);
        createStairRecipe(ModBlocks.CHALK, ModBlocks.CHALK_STAIRS, exporter);
        /*
         * Chalk Brick
         */
        createBricksRecipe(ModBlocks.CHALK, ModBlocks.CHALK_BRICK, exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_SLAB, ModBlocks.CHALK_BRICK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_WALL, ModBlocks.CHALK_BRICK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK, ModBlocks.CHALK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_STAIRS, ModBlocks.CHALK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_SLAB, ModBlocks.CHALK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_WALL, ModBlocks.CHALK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_STAIRS, ModBlocks.CHALK_BRICK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_SLAB, ModBlocks.CHALK_BRICK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_WALL, ModBlocks.CHALK_BRICK, 1);

        createStairRecipe(ModBlocks.CHALK_BRICK, ModBlocks.CHALK_BRICK_STAIRS, exporter);
        /*
         * Cobbled Chalk
         */
        createCobbledStoneTypeRecipe(ModBlocks.CHALK, ModBlocks.COBBLED_CHALK, exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_CHALK_SLAB, ModBlocks.COBBLED_CHALK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_CHALK_WALL, ModBlocks.COBBLED_CHALK);
        offerPressurePlateRecipe(exporter, ModBlocks.COBBLED_CHALK_PRESSURE_PLATE, ModBlocks.COBBLED_CHALK);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_CHALK_STAIRS, ModBlocks.COBBLED_CHALK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_CHALK_SLAB, ModBlocks.COBBLED_CHALK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_CHALK_WALL, ModBlocks.COBBLED_CHALK, 1);

        createButtonRecipe(ModBlocks.COBBLED_CHALK, ModBlocks.COBBLED_CHALK_BUTTON, exporter);
        createStairRecipe(ModBlocks.COBBLED_CHALK, ModBlocks.COBBLED_CHALK_STAIRS, exporter);
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
