package me.anedhel.lotrmiddleearth.datagen;

import me.anedhel.lotrmiddleearth.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.StonecuttingRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // Basic crafting recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK, 4)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlocks.CHALK)
                .criterion(hasItem(ModBlocks.CHALK), conditionsFromItem(ModBlocks.CHALK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHALK_BRICK)));

        // Stonecutter recipes for efficiency
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_SLAB, ModBlocks.CHALK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_STAIRS, ModBlocks.CHALK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_WALL, ModBlocks.CHALK);
        
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK, ModBlocks.CHALK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_SLAB, ModBlocks.CHALK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_SLAB, ModBlocks.CHALK_BRICK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_STAIRS, ModBlocks.CHALK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_STAIRS, ModBlocks.CHALK_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_WALL, ModBlocks.CHALK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICK_WALL, ModBlocks.CHALK_BRICK);
        
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CHALK_BRICK, ModBlocks.CHALK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_CHALK_BRICK, ModBlocks.CHALK_BRICK);
        
        // Slabs to blocks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK)
                .pattern("X")
                .pattern("X")
                .input('X', ModBlocks.CHALK_SLAB)
                .criterion(hasItem(ModBlocks.CHALK_SLAB), conditionsFromItem(ModBlocks.CHALK_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHALK) + "_from_slab"));
        
        // Standard slab recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_SLAB, 6)
                .pattern("XXX")
                .input('X', ModBlocks.CHALK)
                .criterion(hasItem(ModBlocks.CHALK), conditionsFromItem(ModBlocks.CHALK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHALK_SLAB)));
        
        // Standard stair recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_STAIRS, 4)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .input('X', ModBlocks.CHALK)
                .criterion(hasItem(ModBlocks.CHALK), conditionsFromItem(ModBlocks.CHALK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHALK_STAIRS)));
        
        
        // Additional stonecutter recipes for cracked variants
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CHALK_BRICK_SLAB, ModBlocks.CRACKED_CHALK_BRICK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CHALK_BRICK_STAIRS, ModBlocks.CRACKED_CHALK_BRICK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CHALK_BRICK_WALL, ModBlocks.CRACKED_CHALK_BRICK);
        
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CHALK_PAVEMENT_SLAB, ModBlocks.CRACKED_CHALK_PAVEMENT, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CHALK_PAVEMENT_STAIRS, ModBlocks.CRACKED_CHALK_PAVEMENT);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CHALK_PAVEMENT_WALL, ModBlocks.CRACKED_CHALK_PAVEMENT);
        
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CHALK_TILES_SLAB, ModBlocks.CRACKED_CHALK_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_CHALK_TILES_STAIRS, ModBlocks.CRACKED_CHALK_TILES);
        
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_COBBLED_CHALK_BRICKS_SLAB, ModBlocks.CRACKED_COBBLED_CHALK_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_COBBLED_CHALK_BRICKS_STAIRS, ModBlocks.CRACKED_COBBLED_CHALK_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_COBBLED_CHALK_BRICKS_WALL, ModBlocks.CRACKED_COBBLED_CHALK_BRICKS);
        
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_FANCY_CHALK_BRICKS_SLAB, ModBlocks.CRACKED_FANCY_CHALK_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_FANCY_CHALK_BRICKS_STAIRS, ModBlocks.CRACKED_FANCY_CHALK_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_FANCY_CHALK_BRICKS_WALL, ModBlocks.CRACKED_FANCY_CHALK_BRICKS);
        
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SMOOTH_CHALK_SLAB, ModBlocks.CRACKED_SMOOTH_CHALK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_SMOOTH_CHALK_STAIRS, ModBlocks.CRACKED_SMOOTH_CHALK);
    }
}