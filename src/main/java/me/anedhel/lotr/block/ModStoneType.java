package me.anedhel.lotr.block;

import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public enum ModStoneType {
    BLUESLATE(ModStoneBlocks.BLUESLATE_FAMILY,
            ModStoneBlocks.COBBLED_BLUESLATE_FAMILY, ModStoneBlocks.MOSSY_COBBLED_BLUESLATE_FAMILY,
            ModStoneBlocks.OVERGROWN_COBBLED_BLUESLATE_FAMILY,
            ModStoneBlocks.COBBLED_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.MOSSY_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.MOSSY_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.GOLD_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_GOLD_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.MOSSY_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_MOSSY_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.OVERGROWN_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.GOLD_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_GOLD_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.MOSSY_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.OVERGROWN_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.GOLD_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_GOLD_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.SMOOTH_BLUESLATE, ModStoneBlocks.SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.BLUESLATE_PILLAR, ModStoneBlocks.BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.MOSSY_BLUESLATE_PILLAR, ModStoneBlocks.MOSSY_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_MOSSY_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_MOSSY_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.OVERGROWN_BLUESLATE_PILLAR, ModStoneBlocks.OVERGROWN_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_OVERGROWN_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_OVERGROWN_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.GOLD_BLUESLATE_PILLAR, ModStoneBlocks.GOLD_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_GOLD_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_GOLD_BLUESLATE_PILLAR_SLAB,
            false);

    //CHALK(ModStoneBlocks.CHALK_FAMILY, ModStoneBlocks.COBBLED_CHALK_FAMILY, ModStoneBlocks.CHALK_BRICK_FAMILY, false);

    private final Block stone;
    private final Block stoneStairs;
    private final Block stoneSlab;
    private final Block stoneWall;
    private final Block stoneButton;
    private final Block stonePressurePlate;
    private final BlockFamily stoneFamily;

    private final Block cobbled;
    private final Block cobbledStairs;
    private final Block cobbledSlab;
    private final Block cobbledWall;
    private final Block cobbledButton;
    private final Block cobbledPressurePlate;
    private final BlockFamily cobbledFamily;

    private final Block mossyCobbled;
    private final Block mossyCobbledStairs;
    private final Block mossyCobbledSlab;
    private final Block mossyCobbledWall;
    private final Block mossyCobbledButton;
    private final Block mossyCobbledPressurePlate;
    private final BlockFamily mossyCobbledFamily;

    private final Block overgrownCobbled;
    private final Block overgrownCobbledStairs;
    private final Block overgrownCobbledSlab;
    private final Block overgrownCobbledWall;
    private final Block overgrownCobbledButton;
    private final Block overgrownCobbledPressurePlate;
    private final BlockFamily overgrownCobbledFamily;

    private final Block cobbledBrick;
    private final Block cobbledBrickStairs;
    private final Block cobbledBrickSlab;
    private final Block cobbledBrickWall;
    private final BlockFamily cobbledBrickFamily;

    private final Block mossyCobbledBrick;
    private final Block mossyCobbledBrickStairs;
    private final Block mossyCobbledBrickSlab;
    private final Block mossyCobbledBrickWall;
    private final BlockFamily mossyCobbledBrickFamily;

    private final Block overgrownCobbledBrick;
    private final Block overgrownCobbledBrickStairs;
    private final Block overgrownCobbledBrickSlab;
    private final Block overgrownCobbledBrickWall;
    private final BlockFamily overgrownCobbledBrickFamily;

    private final Block smooth;
    private final Block smoothSlab;
    private final Block crackedSmooth;
    private final Block crackedSmoothSlab;

    private final Block brick;
    private final Block brickStairs;
    private final Block brickSlab;
    private final Block brickWall;
    private final Block chiseledBrick;
    private final BlockFamily brickFamily;
    private final Block crackedBrick;
    private final Block crackedBrickStairs;
    private final Block crackedBrickSlab;
    private final Block crackedBrickWall;
    private final BlockFamily crackedBrickFamily;

    private final Block mossyBrick;
    private final Block mossyBrickStairs;
    private final Block mossyBrickSlab;
    private final Block mossyBrickWall;
    private final Block chiseledMossyBrick;
    private final BlockFamily mossyBrickFamily;
    private final Block crackedMossyBrick;
    private final Block crackedMossyBrickStairs;
    private final Block crackedMossyBrickSlab;
    private final Block crackedMossyBrickWall;
    private final BlockFamily crackedMossyBrickFamily;

    private final Block overgrownBrick;
    private final Block overgrownBrickStairs;
    private final Block overgrownBrickSlab;
    private final Block overgrownBrickWall;
    private final Block chiseledOvergrownBrick;
    private final BlockFamily overgrownBrickFamily;
    private final Block crackedOvergrownBrick;
    private final Block crackedOvergrownBrickStairs;
    private final Block crackedOvergrownBrickSlab;
    private final Block crackedOvergrownBrickWall;
    private final BlockFamily crackedOvergrownBrickFamily;

    private final Block goldOrnamentedBrick;
    private final Block goldOrnamentedBrickStairs;
    private final Block goldOrnamentedBrickSlab;
    private final Block goldOrnamentedBrickWall;
    private final Block chiseledGoldOrnamentedBrick;
    private final BlockFamily goldOrnamentedBrickFamily;
    private final Block crackedGoldOrnamentedBrick;
    private final Block crackedGoldOrnamentedBrickStairs;
    private final Block crackedGoldOrnamentedBrickSlab;
    private final Block crackedGoldOrnamentedBrickWall;
    private final BlockFamily crackedGoldOrnamentedBrickFamily;

    private final Block tiles;
    private final Block tilesStairs;
    private final Block tilesSlab;
    private final Block tilesWall;
    private final BlockFamily tilesFamily;
    private final Block crackedTiles;
    private final Block crackedTilesStairs;
    private final Block crackedTilesSlab;
    private final Block crackedTilesWall;
    private final BlockFamily crackedTilesFamily;

    private final Block mossyTiles;
    private final Block mossyTilesStairs;
    private final Block mossyTilesSlab;
    private final Block mossyTilesWall;
    private final BlockFamily mossyTilesFamily;
    private final Block crackedMossyTiles;
    private final Block crackedMossyTilesStairs;
    private final Block crackedMossyTilesSlab;
    private final Block crackedMossyTilesWall;
    private final BlockFamily crackedMossyTilesFamily;

    private final Block overgrownTiles;
    private final Block overgrownTilesStairs;
    private final Block overgrownTilesSlab;
    private final Block overgrownTilesWall;
    private final BlockFamily overgrownTilesFamily;
    private final Block crackedOvergrownTiles;
    private final Block crackedOvergrownTilesStairs;
    private final Block crackedOvergrownTilesSlab;
    private final Block crackedOvergrownTilesWall;
    private final BlockFamily crackedOvergrownTilesFamily;

    private final Block goldOrnamentedTiles;
    private final Block goldOrnamentedTilesStairs;
    private final Block goldOrnamentedTilesSlab;
    private final Block goldOrnamentedTilesWall;
    private final BlockFamily goldOrnamentedTilesFamily;
    private final Block crackedGoldOrnamentedTiles;
    private final Block crackedGoldOrnamentedTilesStairs;
    private final Block crackedGoldOrnamentedTilesSlab;
    private final Block crackedGoldOrnamentedTilesWall;
    private final BlockFamily crackedGoldOrnamentedTilesFamily;

    private final Block pillar;
    private final Block pillarSlab;
    private final Block crackedPillar;
    private final Block crackedPillarSlab;

    private final Block mossyPillar;
    private final Block mossyPillarSlab;
    private final Block crackedMossyPillar;
    private final Block crackedMossyPillarSlab;

    private final Block overgrownPillar;
    private final Block overgrownPillarSlab;
    private final Block crackedOvergrownPillar;
    private final Block crackedOvergrownPillarSlab;

    private final Block goldOrnamentedPillar;
    private final Block goldOrnamentedPillarSlab;
    private final Block crackedGoldOrnamentedPillar;
    private final Block crackedGoldOrnamentedPillarSlab;

    private final Block pavement;
    private final Block pavementStairs;
    private final Block pavementSlab;
    private final BlockFamily pavementFamily;
    private final Block crackedPavement;
    private final Block crackedPavementStairs;
    private final Block crackedPavementSlab;
    private final BlockFamily crackedPavementFamily;

    private final Block fancyBricks;
    private final Block fancyBricksStairs;
    private final Block fancyBricksSlab;
    private final Block fancyBricksWall;
    private final BlockFamily fancyBricksFamily;
    private final Block crackedFancyBricks;
    private final Block crackedFancyBricksStairs;
    private final Block crackedFancyBricksSlab;
    private final Block crackedFancyBricksWall;
    private final BlockFamily crackedFancyBricksFamily;

    private final Block mossyFancyBricks;
    private final Block mossyFancyBrickStairs;
    private final Block mossyFancyBrickSlab;
    private final Block mossyFancyBrickWall;
    private final BlockFamily mossyFancyBricksFamily;
    private final Block crackedMossyFancyBricks;
    private final Block crackedMossyFancyBricksStairs;
    private final Block crackedMossyFancyBricksSlab;
    private final Block crackedMossyFancyBricksWall;
    private final BlockFamily crackedMossyFancyBricksFamily;

    private final Block overgrownFancyBricks;
    private final Block overgrownFancyBrickStairs;
    private final Block overgrownFancyBrickSlab;
    private final Block overgrownFancyBrickWall;
    private final BlockFamily overgrownFancyBricksFamily;
    private final Block crackedOvergrownFancyBricks;
    private final Block crackedOvergrownFancyBricksStairs;
    private final Block crackedOvergrownFancyBricksSlab;
    private final Block crackedOvergrownFancyBricksWall;
    private final BlockFamily crackedOvergrownFancyBricksFamily;

    private final Block goldOrnamentedFancyBricks;
    private final Block goldOrnamentedFancyBrickStairs;
    private final Block goldOrnamentedFancyBrickSlab;
    private final Block goldOrnamentedFancyBrickWall;
    private final BlockFamily goldOrnamentedFancyBricksFamily;
    private final Block crackedGoldOrnamentedFancyBricks;
    private final Block crackedGoldOrnamentedFancyBricksStairs;
    private final Block crackedGoldOrnamentedFancyBricksSlab;
    private final Block crackedGoldOrnamentedFancyBricksWall;
    private final BlockFamily crackedGoldOrnamentedFancyBricksFamily;

    private final boolean vanillaAddition;

    ModStoneType(BlockFamily stoneFamily,
            BlockFamily cobbledFamily, BlockFamily mossyCobbledFamily, BlockFamily overgrownCobbledFamily,
            BlockFamily cobbledBrickFamily, BlockFamily mossyCobbledBrickFamily, BlockFamily overgrownCobbledBrickFamily,
            BlockFamily brickFamily, BlockFamily crackedBrickFamily,
            BlockFamily mossyBrickFamily, BlockFamily crackedMossyBrickFamily,
            BlockFamily overgrownBrickFamily, BlockFamily crackedOvergrownBrickFamily,
            BlockFamily goldOrnamentedBrickFamily, BlockFamily crackedGoldOrnamentedBrickFamily,
            BlockFamily tilesFamily, BlockFamily crackedTilesFamily,
            BlockFamily mossyTilesFamily, BlockFamily crackedMossyTilesFamily,
            BlockFamily overgrownTilesFamily, BlockFamily crackedOvergrownTilesFamily,
            BlockFamily goldOrnamentedTilesFamily, BlockFamily crackedGoldOrnamentedTilesFamily,
            BlockFamily pavementFamily, BlockFamily crackedPavementFamily,
            BlockFamily fancyBricksFamily, BlockFamily crackedFancyBricksFamily,
            BlockFamily mossyFancyBricksFamily, BlockFamily crackedMossyFancyBricksFamily,
            BlockFamily overgrownFancyBricksFamily, BlockFamily crackedOvergrownFancyBricksFamily,
            BlockFamily goldOrnamentedFancyBricksFamily, BlockFamily crackedGoldOrnamentedFancyBricksFamily,
            Block smooth, Block smoothSlab, Block crackedSmooth, Block crackedSmoothSlab,
            Block pillar, Block pillarSlab, Block crackedPillar, Block crackedPillarSlab,
            Block mossyPillar, Block mossyPillarSlab, Block crackedMossyPillar, Block crackedMossyPillarSlab,
            Block overgrownPillar, Block overgrownPillarSlab, Block crackedOvergrownPillar, Block crackedOvergrownPillarSlab,
            Block goldOrnamentedPillar, Block goldOrnamentedPillarSlab, Block crackedGoldOrnamentedPillar, Block crackedGoldOrnamentedPillarSlab,
            boolean vanillaAddition) {
        this.stone = stoneFamily.getBaseBlock();
        this.stoneStairs = stoneFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.stoneSlab = stoneFamily.getVariant(BlockFamily.Variant.SLAB);
        this.stoneWall = stoneFamily.getVariant(BlockFamily.Variant.WALL);
        this.stoneButton = stoneFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.stonePressurePlate = stoneFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.stoneFamily = stoneFamily;

        this.cobbled = cobbledFamily.getBaseBlock();
        this.cobbledStairs = cobbledFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.cobbledSlab = cobbledFamily.getVariant(BlockFamily.Variant.SLAB);
        this.cobbledWall = cobbledFamily.getVariant(BlockFamily.Variant.WALL);
        this.cobbledButton = cobbledFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.cobbledPressurePlate = cobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.cobbledFamily = cobbledFamily;

        this.mossyCobbled = mossyCobbledFamily.getBaseBlock();
        this.mossyCobbledStairs = mossyCobbledFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyCobbledSlab = mossyCobbledFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyCobbledWall = mossyCobbledFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyCobbledButton = mossyCobbledFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.mossyCobbledPressurePlate = mossyCobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.mossyCobbledFamily = mossyCobbledFamily;

        this.overgrownCobbled = overgrownCobbledFamily.getBaseBlock();
        this.overgrownCobbledStairs = overgrownCobbledFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownCobbledSlab = overgrownCobbledFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownCobbledWall = overgrownCobbledFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownCobbledButton = overgrownCobbledFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.overgrownCobbledPressurePlate = overgrownCobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.overgrownCobbledFamily = overgrownCobbledFamily;

        this.cobbledBrick = cobbledBrickFamily.getBaseBlock();
        this.cobbledBrickStairs = cobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.cobbledBrickSlab = cobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.cobbledBrickWall = cobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.cobbledBrickFamily = cobbledBrickFamily;

        this.mossyCobbledBrick = mossyCobbledBrickFamily.getBaseBlock();
        this.mossyCobbledBrickStairs = mossyCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyCobbledBrickSlab = mossyCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyCobbledBrickWall = mossyCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyCobbledBrickFamily = mossyCobbledBrickFamily;

        this.overgrownCobbledBrick = overgrownCobbledBrickFamily.getBaseBlock();
        this.overgrownCobbledBrickStairs = overgrownCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownCobbledBrickSlab = overgrownCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownCobbledBrickWall = overgrownCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownCobbledBrickFamily = overgrownCobbledBrickFamily;

        this.smooth = smooth;
        this.smoothSlab = smoothSlab;
        this.crackedSmooth = crackedSmooth;
        this.crackedSmoothSlab = crackedSmoothSlab;

        this.brick = brickFamily.getBaseBlock();
        this.brickStairs = brickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.brickSlab = brickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.brickWall = brickFamily.getVariant(BlockFamily.Variant.WALL);
        this.chiseledBrick = brickFamily.getVariant(BlockFamily.Variant.CHISELED);
        this.brickFamily = brickFamily;
        this.crackedBrick = crackedBrickFamily.getBaseBlock();
        this.crackedBrickStairs = crackedBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedBrickSlab = crackedBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedBrickWall = crackedBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedBrickFamily = crackedBrickFamily;

        this.mossyBrick = mossyBrickFamily.getBaseBlock();
        this.mossyBrickStairs = mossyBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyBrickSlab = mossyBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyBrickWall = mossyBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.chiseledMossyBrick = mossyBrickFamily.getVariant(BlockFamily.Variant.CHISELED);
        this.mossyBrickFamily = mossyBrickFamily;
        this.crackedMossyBrick = crackedMossyBrickFamily.getBaseBlock();
        this.crackedMossyBrickStairs = crackedMossyBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyBrickSlab = crackedMossyBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyBrickWall = crackedMossyBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyBrickFamily = crackedMossyBrickFamily;

        this.overgrownBrick = overgrownBrickFamily.getBaseBlock();
        this.overgrownBrickStairs = overgrownBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownBrickSlab = overgrownBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownBrickWall = overgrownBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.chiseledOvergrownBrick = overgrownBrickFamily.getVariant(BlockFamily.Variant.CHISELED);
        this.overgrownBrickFamily = overgrownBrickFamily;
        this.crackedOvergrownBrick = crackedOvergrownBrickFamily.getBaseBlock();
        this.crackedOvergrownBrickStairs = crackedOvergrownBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownBrickSlab = crackedOvergrownBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownBrickWall = crackedOvergrownBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownBrickFamily = crackedOvergrownBrickFamily;

        this.goldOrnamentedBrick = goldOrnamentedBrickFamily.getBaseBlock();
        this.goldOrnamentedBrickStairs = goldOrnamentedBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.goldOrnamentedBrickSlab = goldOrnamentedBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.goldOrnamentedBrickWall = goldOrnamentedBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.chiseledGoldOrnamentedBrick = goldOrnamentedBrickFamily.getVariant(BlockFamily.Variant.CHISELED);
        this.goldOrnamentedBrickFamily = goldOrnamentedBrickFamily;
        this.crackedGoldOrnamentedBrick = crackedGoldOrnamentedBrickFamily.getBaseBlock();
        this.crackedGoldOrnamentedBrickStairs = crackedGoldOrnamentedBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedGoldOrnamentedBrickSlab = crackedGoldOrnamentedBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedGoldOrnamentedBrickWall = crackedGoldOrnamentedBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedGoldOrnamentedBrickFamily = crackedGoldOrnamentedBrickFamily;

        this.tiles = tilesFamily.getBaseBlock();
        this.tilesStairs = tilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.tilesSlab = tilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.tilesWall = tilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.tilesFamily = tilesFamily;
        this.crackedTiles = crackedTilesFamily.getBaseBlock();
        this.crackedTilesStairs = crackedTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedTilesSlab = crackedTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedTilesWall = crackedTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedTilesFamily = crackedTilesFamily;

        this.mossyTiles = mossyTilesFamily.getBaseBlock();
        this.mossyTilesStairs = mossyTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyTilesSlab = mossyTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyTilesWall = mossyTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyTilesFamily = mossyTilesFamily;
        this.crackedMossyTiles = crackedMossyTilesFamily.getBaseBlock();
        this.crackedMossyTilesStairs = crackedMossyTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyTilesSlab = crackedMossyTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyTilesWall = crackedMossyTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyTilesFamily = crackedMossyTilesFamily;

        this.overgrownTiles = overgrownTilesFamily.getBaseBlock();
        this.overgrownTilesStairs = overgrownTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownTilesSlab = overgrownTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownTilesWall = overgrownTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownTilesFamily = overgrownTilesFamily;
        this.crackedOvergrownTiles = crackedOvergrownTilesFamily.getBaseBlock();
        this.crackedOvergrownTilesStairs = crackedOvergrownTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownTilesSlab = crackedOvergrownTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownTilesWall = crackedOvergrownTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownTilesFamily = crackedOvergrownTilesFamily;

        this.goldOrnamentedTiles = goldOrnamentedTilesFamily.getBaseBlock();
        this.goldOrnamentedTilesStairs = goldOrnamentedTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.goldOrnamentedTilesSlab = goldOrnamentedTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.goldOrnamentedTilesWall = goldOrnamentedTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.goldOrnamentedTilesFamily = goldOrnamentedTilesFamily;
        this.crackedGoldOrnamentedTiles = crackedGoldOrnamentedTilesFamily.getBaseBlock();
        this.crackedGoldOrnamentedTilesStairs = crackedGoldOrnamentedTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedGoldOrnamentedTilesSlab = crackedGoldOrnamentedTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedGoldOrnamentedTilesWall = crackedGoldOrnamentedTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedGoldOrnamentedTilesFamily = crackedGoldOrnamentedTilesFamily;

        this.pillar = pillar;
        this.pillarSlab = pillarSlab;
        this.crackedPillar = crackedPillar;
        this.crackedPillarSlab = crackedPillarSlab;

        this.mossyPillar = mossyPillar;
        this.mossyPillarSlab = mossyPillarSlab;
        this.crackedMossyPillar = crackedMossyPillar;
        this.crackedMossyPillarSlab = crackedMossyPillarSlab;

        this.overgrownPillar = overgrownPillar;
        this.overgrownPillarSlab = overgrownPillarSlab;
        this.crackedOvergrownPillar = crackedOvergrownPillar;
        this.crackedOvergrownPillarSlab = crackedOvergrownPillarSlab;

        this.goldOrnamentedPillar = goldOrnamentedPillar;
        this.goldOrnamentedPillarSlab = goldOrnamentedPillarSlab;
        this.crackedGoldOrnamentedPillar = crackedGoldOrnamentedPillar;
        this.crackedGoldOrnamentedPillarSlab = crackedGoldOrnamentedPillarSlab;

        this.pavement = pavementFamily.getBaseBlock();
        this.pavementStairs = pavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.pavementSlab = pavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.pavementFamily = pavementFamily;
        this.crackedPavement = crackedPavementFamily.getBaseBlock();
        this.crackedPavementStairs = crackedPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedPavementSlab = crackedPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedPavementFamily = crackedPavementFamily;

        this.fancyBricks = fancyBricksFamily.getBaseBlock();
        this.fancyBricksStairs = fancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.fancyBricksSlab = fancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.fancyBricksWall = fancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.fancyBricksFamily = fancyBricksFamily;
        this.crackedFancyBricks = crackedFancyBricksFamily.getBaseBlock();
        this.crackedFancyBricksStairs = crackedFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedFancyBricksSlab = crackedFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedFancyBricksWall = crackedFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedFancyBricksFamily = crackedFancyBricksFamily;

        this.mossyFancyBricks = mossyFancyBricksFamily.getBaseBlock();
        this.mossyFancyBrickStairs = mossyFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyFancyBrickSlab = mossyFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyFancyBrickWall = mossyFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyFancyBricksFamily = mossyFancyBricksFamily;
        this.crackedMossyFancyBricks = crackedMossyFancyBricksFamily.getBaseBlock();
        this.crackedMossyFancyBricksStairs = crackedMossyFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyFancyBricksSlab = crackedMossyFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyFancyBricksWall = crackedMossyFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyFancyBricksFamily = crackedMossyFancyBricksFamily;

        this.overgrownFancyBricks = overgrownFancyBricksFamily.getBaseBlock();
        this.overgrownFancyBrickStairs = overgrownFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownFancyBrickSlab = overgrownFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownFancyBrickWall = overgrownFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownFancyBricksFamily = overgrownFancyBricksFamily;
        this.crackedOvergrownFancyBricks = crackedOvergrownFancyBricksFamily.getBaseBlock();
        this.crackedOvergrownFancyBricksStairs = crackedOvergrownFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownFancyBricksSlab = crackedOvergrownFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownFancyBricksWall = crackedOvergrownFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownFancyBricksFamily = crackedOvergrownFancyBricksFamily;

        this.goldOrnamentedFancyBricks = goldOrnamentedFancyBricksFamily.getBaseBlock();
        this.goldOrnamentedFancyBrickStairs = goldOrnamentedFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.goldOrnamentedFancyBrickSlab = goldOrnamentedFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.goldOrnamentedFancyBrickWall = goldOrnamentedFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.goldOrnamentedFancyBricksFamily = goldOrnamentedFancyBricksFamily;
        this.crackedGoldOrnamentedFancyBricks = crackedGoldOrnamentedFancyBricksFamily.getBaseBlock();
        this.crackedGoldOrnamentedFancyBricksStairs = crackedGoldOrnamentedFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedGoldOrnamentedFancyBricksSlab = crackedGoldOrnamentedFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedGoldOrnamentedFancyBricksWall = crackedGoldOrnamentedFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedGoldOrnamentedFancyBricksFamily = crackedGoldOrnamentedFancyBricksFamily;

        this.vanillaAddition = vanillaAddition;
    }

    public @NotNull List<ItemStack> getItemGroupList() {
        List<ItemStack> itemGroupList = new ArrayList<>();

        itemGroupList.addAll(blockFamilyList(stoneFamily));
        itemGroupList.addAll(blockFamilyList(cobbledFamily));
        itemGroupList.addAll(blockFamilyList(mossyCobbledFamily));
        itemGroupList.addAll(blockFamilyList(overgrownCobbledFamily));
        itemGroupList.addAll(blockFamilyList(cobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(mossyCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(overgrownCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(brickFamily));
        itemGroupList.addAll(blockFamilyList(crackedBrickFamily));
        itemGroupList.addAll(blockFamilyList(mossyBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyBrickFamily));
        itemGroupList.addAll(blockFamilyList(overgrownBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownBrickFamily));
        itemGroupList.addAll(blockFamilyList(goldOrnamentedBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedGoldOrnamentedBrickFamily));
        itemGroupList.addAll(blockFamilyList(tilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedTilesFamily));
        itemGroupList.addAll(blockFamilyList(mossyTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyTilesFamily));
        itemGroupList.addAll(blockFamilyList(overgrownTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownTilesFamily));
        itemGroupList.addAll(blockFamilyList(goldOrnamentedTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedGoldOrnamentedTilesFamily));
        itemGroupList.addAll(blockFamilyList(fancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(mossyFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(overgrownFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(goldOrnamentedFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedGoldOrnamentedFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(pavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedPavementFamily));

        if(smooth != null) {
            if(!vanillaAddition) {
                itemGroupList.add(new ItemStack(smooth));
            }
            if(smoothSlab != null) {
                itemGroupList.add(new ItemStack(smoothSlab));
            }
        }
        if(crackedSmooth != null) {
            if(!vanillaAddition) {
                itemGroupList.add(new ItemStack(crackedSmooth));
            }
            if(crackedSmoothSlab != null) {
                itemGroupList.add(new ItemStack(crackedSmoothSlab));
            }
        }
        if(pillar != null) {
            itemGroupList.add(new ItemStack(pillar));
            if(pillarSlab != null) {
                itemGroupList.add(new ItemStack(pillarSlab));
            }
        }
        if(crackedPillar != null) {
            itemGroupList.add(new ItemStack(crackedPillar));
            if(crackedPillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedPillarSlab));
            }
        }
        if(mossyPillar != null) {
            itemGroupList.add(new ItemStack(mossyPillar));
            if(mossyPillarSlab != null) {
                itemGroupList.add(new ItemStack(mossyPillarSlab));
            }
        }
        if(crackedMossyPillar != null) {
            itemGroupList.add(new ItemStack(crackedMossyPillar));
            if(crackedMossyPillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedMossyPillarSlab));
            }
        }
        if(overgrownPillar != null) {
            itemGroupList.add(new ItemStack(overgrownPillar));
            if(overgrownPillarSlab != null) {
                itemGroupList.add(new ItemStack(overgrownPillarSlab));
            }
        }
        if(crackedOvergrownPillar != null) {
            itemGroupList.add(new ItemStack(crackedOvergrownPillar));
            if(crackedOvergrownPillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedOvergrownPillarSlab));
            }
        }
        if(goldOrnamentedPillar != null) {
            itemGroupList.add(new ItemStack(goldOrnamentedPillar));
            if(goldOrnamentedPillarSlab != null) {
                itemGroupList.add(new ItemStack(goldOrnamentedPillarSlab));
            }
        }
        if(crackedGoldOrnamentedPillar != null) {
            itemGroupList.add(new ItemStack(crackedGoldOrnamentedPillar));
            if(crackedGoldOrnamentedPillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedGoldOrnamentedPillarSlab));
            }
        }
        return itemGroupList;
    }

    /**
     * This Method is used to add all variants of a Block Family to a List for the itemGroupList
     * @param family The Block Family which is to be put into a list
     * @return A List of ItemStack Objects containing all variants of the BlockFamily
     */
    private List<ItemStack> blockFamilyList(@NotNull BlockFamily family) {
        List<ItemStack> familyList = new ArrayList<>();
        familyList.add(new ItemStack(family.getBaseBlock()));
        for(Block block : family.getVariants().values()) {
            familyList.add(new ItemStack(block));
        }
        return familyList;
    }

    public BlockFamily getStoneFamily() {
        return stoneFamily;
    }

    /**
     * Returns the given variant of the baseStone
     * @param variant the variantBlock to be returned (base, stairs, slab, wall, button or pressure_plate)
     * @return the Block, that is the given variant of the baseStone
     */
    public Block getStoneVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return stone;
		    }
		    case "stairs" -> {
				return stoneStairs;
		    }
		    case "slab" -> {
				return stoneSlab;
		    }
		    case "wall" -> {
				return stoneWall;
		    }
		    case "button" -> {
				return stoneButton;
		    }
		    case "pressure_plate" -> {
				return stonePressurePlate;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getCobbledFamily() {
        return cobbledFamily;
    }

    /**
     * Returns the given variant of the cobbledStone
     * @param variant the variantBlock to be returned (base, stairs, slab, wall, button or pressure_plate)
     * @return the Block, that is the given variant of the cobbledStone
     */
    public Block getCobbledVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return cobbled;
		    }
		    case "stairs" -> {
				return cobbledStairs;
		    }
		    case "slab" -> {
				return cobbledSlab;
		    }
		    case "wall" -> {
				return cobbledWall;
		    }
		    case "button" -> {
				return cobbledButton;
		    }
		    case "pressure_plate" -> {
				return cobbledPressurePlate;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getMossyCobbledFamily() {
        return mossyCobbledFamily;
    }

    /**
     * Returns the given variant of the mossyCobbledStone
     * @param variant the variantBlock to be returned (base, stairs, slab, wall, button or pressure_plate)
     * @return the Block, that is the given variant of the mossyCobbledStone
     */
    public Block getMossyCobbledVariant(String variant) {
        switch (variant) {
	        case "base" -> {
		        return mossyCobbled;
	        }
            case "stairs" -> {
                return mossyCobbledStairs;
            }
	        case "slab" -> {
		        return mossyCobbledSlab;
	        }
            case "wall" -> {
                return mossyCobbledWall;
            }
            case "button" -> {
                return mossyCobbledButton;
            }
            case "pressure_plate" -> {
                return mossyCobbledPressurePlate;
            }
	        default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownCobbledFamily() {
        return overgrownCobbledFamily;
    }

    /**
     * Returns the given variant of the overgrownCobbledStone
     * @param variant the variantBlock to be returned (base, stairs, slab, wall, button or pressure_plate)
     * @return the Block, that is the given variant of the overgrownCobbledStone
     */
    public Block getOvergrownCobbledVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return overgrownCobbled;
		    }
		    case "stairs" -> {
				return overgrownCobbledStairs;
		    }
		    case "slab" -> {
				return overgrownCobbledSlab;
		    }
		    case "wall" -> {
				return overgrownCobbledWall;
		    }
		    case "button" -> {
				return overgrownCobbledButton;
		    }
		    case "pressure_plate" -> {
				return overgrownCobbledPressurePlate;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getCobbledBrickFamily() {
        return cobbledBrickFamily;
    }

    /**
     * Returns the given variant of the cobbledBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the cobbledBrick
     */
    public Block getCobbledBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return cobbledBrick;
		    }
		    case "stairs" -> {
				return cobbledBrickStairs;
		    }
		    case "slab" -> {
				return cobbledBrickSlab;
		    }
		    case "wall" -> {
				return cobbledBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getMossyCobbledBrickFamily() {
        return mossyCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the mossyCobbledBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossyCobbledBrick
     */
    public Block getMossyCobbledBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return mossyCobbledBrick;
		    }
		    case "stairs" -> {
				return mossyCobbledBrickStairs;
		    }
		    case "slab" -> {
				return mossyCobbledBrickSlab;
		    }
		    case "wall" -> {
				return mossyCobbledBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getOvergrownCobbledBrickFamily() {
        return overgrownCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the overgrownCobbledBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownCobbledBrick
     */
    public Block getOvergrownCobbledBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return overgrownCobbledBrick;
		    }
		    case "stairs" -> {
				return overgrownCobbledBrickStairs;
		    }
		    case "slab" -> {
				return overgrownCobbledBrickSlab;
		    }
		    case "wall" -> {
				return overgrownCobbledBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getBrickFamily() {
        return brickFamily;
    }

    /**
     * Returns the given variant of the brick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the brick
     */
    public Block getBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return brick;
		    }
		    case "stairs" -> {
				return brickStairs;
		    }
		    case "slab" -> {
				return brickSlab;
		    }
		    case "wall" -> {
				return brickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getCrackedBrickFamily() {
        return crackedBrickFamily;
    }

    /**
     * Returns the given variant of the crackedBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedBrick
     */
    public Block getCrackedBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return crackedBrick;
		    }
		    case "stairs" -> {
				return crackedBrickStairs;
		    }
		    case "slab" -> {
				return crackedBrickSlab;
		    }
		    case "wall" -> {
				return crackedBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getMossyBrickFamily() {
        return mossyBrickFamily;
    }

    /**
     * Returns the given variant of the mossyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossyBrick
     */
    public Block getMossyBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return mossyBrick;
		    }
		    case "stairs" -> {
				return mossyBrickStairs;
		    }
		    case "slab" -> {
				return mossyBrickSlab;
		    }
		    case "wall" -> {
				return mossyBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getCrackedMossyBrickFamily() {
        return crackedMossyBrickFamily;
    }

    /**
     * Returns the given variant of the crackedMossyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossyBrick
     */
    public Block getCrackedMossyBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return crackedMossyBrick;
		    }
		    case "stairs" -> {
				return crackedMossyBrickStairs;
		    }
		    case "slab" -> {
				return crackedMossyBrickSlab;
		    }
		    case "wall" -> {
				return crackedMossyBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getOvergrownBrickFamily() {
        return overgrownBrickFamily;
    }

    /**
     * Returns the given variant of the overgrownBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownBrick
     */
    public Block getOvergrownBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return overgrownBrick;
		    }
		    case "stairs" -> {
				return overgrownBrickStairs;
		    }
		    case "slab" -> {
				return overgrownBrickSlab;
		    }
		    case "wall" -> {
				return overgrownBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getCrackedOvergrownBrickFamily() {
        return crackedOvergrownBrickFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownbrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownBrick
     */
    public Block getCrackedOvergrownBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return crackedOvergrownBrick;
		    }
		    case "stairs" -> {
				return crackedOvergrownBrickStairs;
		    }
		    case "slab" -> {
				return crackedOvergrownBrickSlab;
		    }
		    case "wall" -> {
				return crackedOvergrownBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getGoldBrickFamily() {
        return goldOrnamentedBrickFamily;
    }

    /**
     * Returns the given variant of the goldOrnamentedBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the goldOrnamentedBrick
     */
    public Block getGoldBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return goldOrnamentedBrick;
		    }
		    case "stairs" -> {
				return goldOrnamentedBrickStairs;
		    }
		    case "slab" -> {
				return goldOrnamentedBrickSlab;
		    }
		    case "wall" -> {
				return goldOrnamentedBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getCrackedGoldBrickFamily() {
        return crackedGoldOrnamentedBrickFamily;
    }

    /**
     * Returns the given variant of the crackedGoldOrnamentedBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedGoldOrnamentedBrick
     */
    public Block getCrackedGoldBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return crackedGoldOrnamentedBrick;
		    }
		    case "stairs" -> {
				return crackedGoldOrnamentedBrickStairs;
		    }
		    case "slab" -> {
				return crackedGoldOrnamentedBrickSlab;
		    }
		    case "wall" -> {
				return crackedGoldOrnamentedBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getTilesFamily() {
        return tilesFamily;
    }

    /**
     * Returns the given variant of the tiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the tiles
     */
    public Block getTilesVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return tiles;
		    }
		    case "stairs" -> {
				return tilesStairs;
		    }
		    case "slab" -> {
				return tilesSlab;
		    }
		    case "wall" -> {
				return tilesWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getCrackedTilesFamily() {
        return crackedTilesFamily;
    }

    /**
     * Returns the given variant of the crackedTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedTiles
     */
    public Block getCrackedTilesVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return crackedTiles;
		    }
		    case "stairs" -> {
				return crackedTilesStairs;
		    }
		    case "slab" -> {
				return crackedTilesSlab;
		    }
		    case "wall" -> {
				return crackedTilesWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getMossyTilesFamily() {
        return mossyTilesFamily;
    }

    /**
     * Returns the given variant of the mossyTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossyTiles
     */
    public Block getMossyTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyTiles;
            }
            case "stairs" -> {
                return mossyTilesStairs;
            }
            case "slab" -> {
                return mossyTilesSlab;
            }
            case "wall" -> {
                return mossyTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyTilesFamily() {
        return crackedMossyTilesFamily;
    }

    /**
     * Returns the given variant of the crackedMossyTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossyTiles
     */
    public Block getCrackedMossyTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyTiles;
            }
            case "stairs" -> {
                return crackedMossyTilesStairs;
            }
            case "slab" -> {
                return crackedMossyTilesSlab;
            }
            case "wall" -> {
                return crackedMossyTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownTilesFamily() {
        return overgrownTilesFamily;
    }

    /**
     * Returns the given variant of the overgrownTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownTiles
     */
    public Block getOvergrownTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownTiles;
            }
            case "stairs" -> {
                return overgrownTilesStairs;
            }
            case "slab" -> {
                return overgrownTilesSlab;
            }
            case "wall" -> {
                return overgrownTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownTilesFamily() {
        return crackedOvergrownTilesFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownTiles
     */
    public Block getCrackedOvergrownTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownTiles;
            }
            case "stairs" -> {
                return crackedOvergrownTilesStairs;
            }
            case "slab" -> {
                return crackedOvergrownTilesSlab;
            }
            case "wall" -> {
                return crackedOvergrownTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getGoldTilesFamily() {
        return goldOrnamentedTilesFamily;
    }

    /**
     * Returns the given variant of the goldOrnamentedTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the goldOrnamentedTiles
     */
    public Block getGoldTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return goldOrnamentedTiles;
            }
            case "stairs" -> {
                return goldOrnamentedTilesStairs;
            }
            case "slab" -> {
                return goldOrnamentedTilesSlab;
            }
            case "wall" -> {
                return goldOrnamentedTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedGoldTilesFamily() {
        return crackedGoldOrnamentedTilesFamily;
    }

    /**
     * Returns the given variant of the crackedGoldOrnamentedTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedGoldOrnamentedTiles
     */
    public Block getCrackedGoldTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedGoldOrnamentedTiles;
            }
            case "stairs" -> {
                return crackedGoldOrnamentedTilesStairs;
            }
            case "slab" -> {
                return crackedGoldOrnamentedTilesSlab;
            }
            case "wall" -> {
                return crackedGoldOrnamentedTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getPavementFamily() {
        return pavementFamily;
    }

    /**
     * Returns the given variant of the pavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the pavement
     */
    public Block getPavementVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return pavement;
		    }
		    case "stairs" -> {
				return pavementStairs;
		    }
		    case "slab" -> {
				return pavementSlab;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getCrackedPavementFamily() {
        return crackedPavementFamily;
    }

    /**
     * Returns the given variant of the crackedPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedPavement
     */
    public Block getCrackedPavementVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return crackedPavement;
		    }
		    case "stairs" -> {
				return crackedPavementStairs;
		    }
		    case "slab" -> {
				return crackedPavementSlab;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getFancyBricksFamily() {
        return fancyBricksFamily;
    }

    /**
     * Returns the given variant of the fancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the fancyBrick
     */
    public Block getFancyBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return fancyBricks;
		    }
		    case "stairs" -> {
				return fancyBricksStairs;
		    }
		    case "slab" -> {
				return fancyBricksSlab;
		    }
		    case "wall" -> {
				return fancyBricksWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getCrackedFancyBricksFamily() {
        return crackedFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedFancyBrick
     */
    public Block getCrackedFancyBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return crackedFancyBricks;
		    }
		    case "stairs" -> {
				return crackedFancyBricksStairs;
		    }
		    case "slab" -> {
				return crackedFancyBricksSlab;
		    }
		    case "wall" -> {
				return crackedFancyBricksWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getMossyFancyBricksFamily() {
        return mossyFancyBricksFamily;
    }

    /**
     * Returns the given variant of the mossyFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossyFancyBrick
     */
    public Block getMossyFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyFancyBricks;
            }
            case "stairs" -> {
                return mossyFancyBrickStairs;
            }
            case "slab" -> {
                return mossyFancyBrickSlab;
            }
            case "wall" -> {
                return mossyFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyFancyBricksFamily() {
        return crackedMossyFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedMossyFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossyFancyBrick
     */
    public Block getCrackedMossyFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyFancyBricks;
            }
            case "stairs" -> {
                return crackedMossyFancyBricksStairs;
            }
            case "slab" -> {
                return crackedMossyFancyBricksSlab;
            }
            case "wall" -> {
                return crackedMossyFancyBricksWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownFancyBricksFamily() {
        return overgrownFancyBricksFamily;
    }

    /**
     * Returns the given variant of the overgrownFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownFancyBrick
     */
    public Block getOvergrownFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownFancyBricks;
            }
            case "stairs" -> {
                return overgrownFancyBrickStairs;
            }
            case "slab" -> {
                return overgrownFancyBrickSlab;
            }
            case "wall" -> {
                return overgrownFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownFancyBricksFamily() {
        return crackedOvergrownFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownFancyBrick
     */
    public Block getCrackedOvergrownFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownFancyBricks;
            }
            case "stairs" -> {
                return crackedOvergrownFancyBricksStairs;
            }
            case "slab" -> {
                return crackedOvergrownFancyBricksSlab;
            }
            case "wall" -> {
                return crackedOvergrownFancyBricksWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getGoldFancyBricksFamily() {
        return goldOrnamentedFancyBricksFamily;
    }

    /**
     * Returns the given variant of the goldOrnamentedFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the goldOrnamentedFancyBrick
     */
    public Block getGoldFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return goldOrnamentedFancyBricks;
            }
            case "stairs" -> {
                return goldOrnamentedFancyBrickStairs;
            }
            case "slab" -> {
                return goldOrnamentedFancyBrickSlab;
            }
            case "wall" -> {
                return goldOrnamentedFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedGoldFancyBricksFamily() {
        return crackedGoldOrnamentedFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedGoldOrnamentedFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedGoldOrnamentedFancyBrick
     */
    public Block getCrackedGoldFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedGoldOrnamentedFancyBricks;
            }
            case "stairs" -> {
                return crackedGoldOrnamentedFancyBricksStairs;
            }
            case "slab" -> {
                return crackedGoldOrnamentedFancyBricksSlab;
            }
            case "wall" -> {
                return crackedGoldOrnamentedFancyBricksWall;
            }
            default -> {
                return null;
            }
        }
    }

    public Block getSmooth() {
        return smooth;
    }

    public Block getSmoothSlab() {
        return smoothSlab;
    }

    public Block getCrackedSmooth() {
        return crackedSmooth;
    }

    public Block getCrackedSmoothSlab() {
        return crackedSmoothSlab;
    }

    public Block getPillar() {
        return pillar;
    }

    public Block getPillarSlab() {
        return pillarSlab;
    }

    public Block getCrackedPillar() {
        return crackedPillar;
    }

    public Block getCrackedPillarSlab() {
        return crackedPillarSlab;
    }

    public Block getMossyPillar() {
        return mossyPillar;
    }

    public Block getMossyPillarSlab() {
        return mossyPillarSlab;
    }

    public Block getCrackedMossyPillar() {
        return crackedMossyPillar;
    }

    public Block getCrackedMossyPillarSlab() {
        return crackedMossyPillarSlab;
    }

    public Block getOvergrownPillar() {
        return overgrownPillar;
    }

    public Block getOvergrownPillarSlab() {
        return overgrownPillarSlab;
    }

    public Block getCrackedOvergrownPillar() {
        return crackedOvergrownPillar;
    }

    public Block getCrackedOvergrownPillarSlab() {
        return crackedOvergrownPillarSlab;
    }

    public Block getGoldPillar() {
        return goldOrnamentedPillar;
    }

    public Block getGoldPillarSlab() {
        return goldOrnamentedPillarSlab;
    }

    public Block getCrackedGoldPillar() {
        return crackedGoldOrnamentedPillar;
    }

    public Block getCrackedGoldPillarSlab() {
        return crackedGoldOrnamentedPillarSlab;
    }

    public boolean isVanillaAddition() {
        return vanillaAddition;
    }
}