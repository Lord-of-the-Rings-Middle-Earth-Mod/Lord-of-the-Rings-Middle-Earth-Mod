package me.anedhel.lotr.datagen;

import me.anedhel.lotr.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //createStairsRecipe(ModBlocks.CHALK_STONE_STAIRS, ModBlocks.CHALK_STONE)
        //        .criterion(hasItem(ModBlocks.CHALK_STONE), conditionsFromItem(ModBlocks.CHALK_STONE))
        //        .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHALK_STONE_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_STONE_SLAB, ModBlocks.CHALK_STONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_STONE_WALL, ModBlocks.CHALK_STONE);
        offerPressurePlateRecipe(exporter, ModBlocks.CHALK_STONE_PRESSUREPLATE, ModBlocks.CHALK_STONE);

        createButtonRecipe(ModBlocks.CHALK_STONE, ModBlocks.CHALK_STONE_BUTTON, 1, RecipeCategory.REDSTONE, exporter);
        createStairRecipe(ModBlocks.CHALK_STONE, ModBlocks.CHALK_STONE_STAIRS, 4, RecipeCategory.BUILDING_BLOCKS, exporter);
    }

    private void createButtonRecipe (Block input, Block output, int count, RecipeCategory category, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(category, output, count)
                .pattern(" # ")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    private void createStairRecipe (Block input, Block output, int count, RecipeCategory category, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(category, output, count)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
}
