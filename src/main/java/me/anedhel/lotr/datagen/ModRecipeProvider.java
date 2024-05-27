package me.anedhel.lotr.datagen;

import me.anedhel.lotr.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

/**
 * This class is used to register all crafting recipes the mod provides.
 */
public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * This method is where all crafting recipes are added via code.
     * @param exporter A RecipeJsonProvider, which is provided by minecraft
     */
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
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
}
