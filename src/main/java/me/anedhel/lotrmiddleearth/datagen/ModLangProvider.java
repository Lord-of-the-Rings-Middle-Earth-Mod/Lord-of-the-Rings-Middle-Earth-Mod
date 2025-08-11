package me.anedhel.lotrmiddleearth.datagen;

import me.anedhel.lotrmiddleearth.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLangProvider extends FabricLanguageProvider {
    public ModLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        // Creative tab
        translationBuilder.add("itemgroup.lotr_stone", "LotR Stone");

        // Basic blocks
        translationBuilder.add(ModBlocks.CHALK, "Chalk");
        translationBuilder.add(ModBlocks.CHALK_BRICK, "Chalk Brick");
        translationBuilder.add(ModBlocks.CHALK_PAVEMENT, "Chalk Pavement");
        translationBuilder.add(ModBlocks.CHALK_TILES, "Chalk Tiles");
        translationBuilder.add(ModBlocks.CHISELED_CHALK_BRICK, "Chiseled Chalk Brick");
        translationBuilder.add(ModBlocks.COBBLED_CHALK, "Cobbled Chalk");
        translationBuilder.add(ModBlocks.COBBLED_CHALK_BRICKS, "Cobbled Chalk Bricks");
        translationBuilder.add(ModBlocks.SMOOTH_CHALK, "Smooth Chalk");
        translationBuilder.add(ModBlocks.FANCY_CHALK_BRICKS, "Fancy Chalk Bricks");

        // Cracked variants
        translationBuilder.add(ModBlocks.CRACKED_CHALK_BRICK, "Cracked Chalk Brick");
        translationBuilder.add(ModBlocks.CRACKED_CHALK_PAVEMENT, "Cracked Chalk Pavement");
        translationBuilder.add(ModBlocks.CRACKED_CHALK_TILES, "Cracked Chalk Tiles");
        translationBuilder.add(ModBlocks.CRACKED_COBBLED_CHALK_BRICKS, "Cracked Cobbled Chalk Bricks");
        translationBuilder.add(ModBlocks.CRACKED_FANCY_CHALK_BRICKS, "Cracked Fancy Chalk Bricks");
        translationBuilder.add(ModBlocks.CRACKED_SMOOTH_CHALK, "Cracked Smooth Chalk");

        // Pillars
        translationBuilder.add(ModBlocks.CHALK_PILLAR, "Chalk Pillar");
        translationBuilder.add(ModBlocks.CRACKED_CHALK_PILLAR, "Cracked Chalk Pillar");

        // Slabs
        translationBuilder.add(ModBlocks.CHALK_SLAB, "Chalk Slab");
        translationBuilder.add(ModBlocks.CHALK_BRICK_SLAB, "Chalk Brick Slab");
        translationBuilder.add(ModBlocks.CHALK_PAVEMENT_SLAB, "Chalk Pavement Slab");
        translationBuilder.add(ModBlocks.CHALK_TILES_SLAB, "Chalk Tiles Slab");
        translationBuilder.add(ModBlocks.COBBLED_CHALK_SLAB, "Cobbled Chalk Slab");
        translationBuilder.add(ModBlocks.COBBLED_CHALK_BRICKS_SLAB, "Cobbled Chalk Bricks Slab");
        translationBuilder.add(ModBlocks.SMOOTH_CHALK_SLAB, "Smooth Chalk Slab");
        translationBuilder.add(ModBlocks.FANCY_CHALK_BRICKS_SLAB, "Fancy Chalk Bricks Slab");

        // Stairs
        translationBuilder.add(ModBlocks.CHALK_STAIRS, "Chalk Stairs");
        translationBuilder.add(ModBlocks.CHALK_BRICK_STAIRS, "Chalk Brick Stairs");
        translationBuilder.add(ModBlocks.CHALK_PAVEMENT_STAIRS, "Chalk Pavement Stairs");
        translationBuilder.add(ModBlocks.CHALK_TILES_STAIRS, "Chalk Tiles Stairs");
        translationBuilder.add(ModBlocks.COBBLED_CHALK_STAIRS, "Cobbled Chalk Stairs");
        translationBuilder.add(ModBlocks.COBBLED_CHALK_BRICKS_STAIRS, "Cobbled Chalk Bricks Stairs");
        translationBuilder.add(ModBlocks.SMOOTH_CHALK_STAIRS, "Smooth Chalk Stairs");
        translationBuilder.add(ModBlocks.FANCY_CHALK_BRICKS_STAIRS, "Fancy Chalk Bricks Stairs");

        // Walls
        translationBuilder.add(ModBlocks.CHALK_WALL, "Chalk Wall");
        translationBuilder.add(ModBlocks.CHALK_BRICK_WALL, "Chalk Brick Wall");
        translationBuilder.add(ModBlocks.CHALK_PAVEMENT_WALL, "Chalk Pavement Wall");
        translationBuilder.add(ModBlocks.COBBLED_CHALK_WALL, "Cobbled Chalk Wall");
        translationBuilder.add(ModBlocks.COBBLED_CHALK_BRICKS_WALL, "Cobbled Chalk Bricks Wall");
        
        // Cracked variants derived blocks
        translationBuilder.add(ModBlocks.CRACKED_CHALK_BRICK_SLAB, "Cracked Chalk Brick Slab");
        translationBuilder.add(ModBlocks.CRACKED_CHALK_BRICK_STAIRS, "Cracked Chalk Brick Stairs");
        translationBuilder.add(ModBlocks.CRACKED_CHALK_BRICK_WALL, "Cracked Chalk Brick Wall");
        
        translationBuilder.add(ModBlocks.CRACKED_CHALK_PAVEMENT_SLAB, "Cracked Chalk Pavement Slab");
        translationBuilder.add(ModBlocks.CRACKED_CHALK_PAVEMENT_STAIRS, "Cracked Chalk Pavement Stairs");
        translationBuilder.add(ModBlocks.CRACKED_CHALK_PAVEMENT_WALL, "Cracked Chalk Pavement Wall");
        
        translationBuilder.add(ModBlocks.CRACKED_CHALK_TILES_SLAB, "Cracked Chalk Tiles Slab");
        translationBuilder.add(ModBlocks.CRACKED_CHALK_TILES_STAIRS, "Cracked Chalk Tiles Stairs");
        
        translationBuilder.add(ModBlocks.CRACKED_COBBLED_CHALK_BRICKS_SLAB, "Cracked Cobbled Chalk Bricks Slab");
        translationBuilder.add(ModBlocks.CRACKED_COBBLED_CHALK_BRICKS_STAIRS, "Cracked Cobbled Chalk Bricks Stairs");
        translationBuilder.add(ModBlocks.CRACKED_COBBLED_CHALK_BRICKS_WALL, "Cracked Cobbled Chalk Bricks Wall");
        
        translationBuilder.add(ModBlocks.CRACKED_FANCY_CHALK_BRICKS_SLAB, "Cracked Fancy Chalk Bricks Slab");
        translationBuilder.add(ModBlocks.CRACKED_FANCY_CHALK_BRICKS_STAIRS, "Cracked Fancy Chalk Bricks Stairs");
        translationBuilder.add(ModBlocks.CRACKED_FANCY_CHALK_BRICKS_WALL, "Cracked Fancy Chalk Bricks Wall");
        
        translationBuilder.add(ModBlocks.CRACKED_SMOOTH_CHALK_SLAB, "Cracked Smooth Chalk Slab");
        translationBuilder.add(ModBlocks.CRACKED_SMOOTH_CHALK_STAIRS, "Cracked Smooth Chalk Stairs");
    }
}