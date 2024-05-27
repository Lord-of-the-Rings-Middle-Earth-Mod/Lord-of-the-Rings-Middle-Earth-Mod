package me.anedhel.lotr.datagen;

import me.anedhel.lotr.blocks.ModBlocks;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

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

    private void createBricksRecipe (Block input, Block output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("##")
                .pattern("##")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

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

    private void createButtonRecipe (Block input, Block output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1)
                .pattern(" # ")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

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
