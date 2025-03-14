package me.anedhel.lotr.block;

import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public enum ModStoneType {
    /*
    ANDESITE(Blocks.ANDESITE, null, null, null,
            ModStoneBlocks.ANDESITE_BUTTON, ModStoneBlocks.ANDESITE_PRESSURE_PLATE, ModStoneBlocks.COBBLED_ANDESITE_FAMILY, ModStoneBlocks.ANDESITE_BRICK_FAMILY, true),
    POLISHED_ANDESITE(Blocks.POLISHED_ANDESITE, null, null, ModStoneBlocks.POLISHED_ANDESITE_WALL,
            ModStoneBlocks.POLISHED_ANDESITE_BUTTON, ModStoneBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, null, null, true),

    DIORITE(Blocks.DIORITE, null, null, null,
            ModStoneBlocks.DIORITE_BUTTON, ModStoneBlocks.DIORITE_PRESSURE_PLATE, ModStoneBlocks.COBBLED_DIORITE_FAMILY, ModStoneBlocks.DIORITE_BRICK_FAMILY, true),
    POLISHED_DIORITE(Blocks.POLISHED_DIORITE, null, null, ModStoneBlocks.POLISHED_DIORITE_WALL,
            ModStoneBlocks.POLISHED_DIORITE_BUTTON, ModStoneBlocks.POLISHED_DIORITE_PRESSURE_PLATE, null, null, true),

    GRANITE(Blocks.GRANITE, null, null, null,
            ModStoneBlocks.GRANITE_BUTTON, ModStoneBlocks.GRANITE_PRESSURE_PLATE, ModStoneBlocks.COBBLED_GRANITE_FAMILY, ModStoneBlocks.GRANITE_BRICK_FAMILY, true),
    POLISHED_GRANITE(Blocks.POLISHED_GRANITE, null, null, ModStoneBlocks.POLISHED_GRANITE_WALL,
            ModStoneBlocks.POLISHED_GRANITE_BUTTON, ModStoneBlocks.POLISHED_GRANITE_PRESSURE_PLATE, null, null, true),

    SMOOTH_BASALT(Blocks.SMOOTH_BASALT, ModStoneBlocks.SMOOTH_BASALT_STAIRS, ModStoneBlocks.SMOOTH_BASALT_SLAB,
            ModStoneBlocks.SMOOTH_BASALT_WALL,
            ModStoneBlocks.SMOOTH_BASALT_BUTTON, ModStoneBlocks.SMOOTH_BASALT_PRESSURE_PLATE, null, null, true),
    BASALT_BRICKS(ModStoneBlocks.BASALT_BRICK, ModStoneBlocks.BASALT_BRICK_STAIRS, ModStoneBlocks.BASALT_BRICK_SLAB,
            ModStoneBlocks.BASALT_BRICK_WALL,
            null, null, null, null, false),
     */

    BLUESLATE(ModStoneBlocks.BLUESLATE_FAMILY,
            ModStoneBlocks.COBBLED_BLUESLATE_FAMILY, ModStoneBlocks.MOSSY_COBBLED_BLUESLATE_FAMILY,
            ModStoneBlocks.OVERGROWN_COBBLED_BLUESLATE_FAMILY,
            ModStoneBlocks.BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.COBBLED_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.SMOOTH_BLUESLATE, ModStoneBlocks.SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.BLUESLATE_PILLAR, ModStoneBlocks.BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_BLUELATE_PILLAR, ModStoneBlocks.CRACKED_BLUELATE_PILLAR_SLAB,
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

    private final Block cobbledBrick;
    private final Block cobbledBrickStairs;
    private final Block cobbledBrickSlab;
    private final Block cobbledBrickWall;
    private final BlockFamily cobbledBrickFamily;

    private final Block pillar;
    private final Block pillarSlab;
    private final Block crackedPillar;
    private final Block crackedPillarSlab;

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

    private final boolean vanillaAddition;

    ModStoneType(BlockFamily stoneFamily,
            BlockFamily cobbledFamily, BlockFamily mossyCobbledFamily, BlockFamily overgrownCobbledFamily,
            BlockFamily brickFamily, BlockFamily crackedBrickFamily,
            BlockFamily tilesFamily, BlockFamily crackedTilesFamily,
            BlockFamily cobbledBrickFamily,
            BlockFamily pavementFamily, BlockFamily crackedPavementFamily,
            BlockFamily fancyBricksFamily, BlockFamily crackedFancyBricksFamily,
            Block smooth, Block smoothSlab, Block crackedSmooth, Block crackedSmoothSlab,
            Block pillar, Block pillarSlab, Block crackedPillar, Block crackedPillarSlab,
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

        this.cobbledBrick = cobbledBrickFamily.getBaseBlock();
        this.cobbledBrickStairs = cobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.cobbledBrickSlab = cobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.cobbledBrickWall = cobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.cobbledBrickFamily = cobbledBrickFamily;

        this.pillar = pillar;
        this.pillarSlab = pillarSlab;
        this.crackedPillar = crackedPillar;
        this.crackedPillarSlab = crackedPillarSlab;

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

        this.vanillaAddition = vanillaAddition;
    }

    /*
    ModStoneType(Block baseBlock, Block basestairBlock, Block baseslabBlock, Block basewallBlock, Block basebuttonBlock, Block basepressurePlateBlock,
            BlockFamily cobbledFamily, BlockFamily mossyCobbledFamily,
            BlockFamily brickFamily, BlockFamily crackedBrickFamily,
            BlockFamily tilesFamily, BlockFamily crackedTilesFamily,
            BlockFamily cobbledBrickFamily,
            BlockFamily pavementFamily, BlockFamily crackedPavementFamily,
            BlockFamily fancyBricksFamily, BlockFamily crackedFancyBricksFamily,
            Block smooth, Block smoothSlab, Block crackedSmooth, Block crackedSmoothSlab,
            Block pillar, Block pillarSlab, Block crackedPillar, Block crackedPillarSlab,
            boolean vanillaAddition) {
        this.stone = baseBlock;
        this.stoneStairs = basestairBlock;
        this.stoneSlab = baseslabBlock;
        this.stoneWall = basewallBlock;
        this.stoneButton = basebuttonBlock;
        this.stonePressurePlate = basepressurePlateBlock;
	    this.stoneFamily = null;

        this.cobbled = cobbledFamily != null ? cobbledFamily.getBaseBlock() : null;
        this.cobbledStairs = cobbledFamily != null ? cobbledFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.cobbledSlab = cobbledFamily != null ? cobbledFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.cobbledWall = cobbledFamily != null ? cobbledFamily.getVariant(BlockFamily.Variant.WALL) : null;
        this.cobbledButton = cobbledFamily != null ? cobbledFamily.getVariant(BlockFamily.Variant.BUTTON) : null;
        this.cobbledPressurePlate = cobbledFamily != null ? cobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE) : null;
        this.cobbledFamily = cobbledFamily;

        this.mossyCobbled = mossyCobbledFamily != null ? mossyCobbledFamily.getBaseBlock() : null;
        this.mossyCobbledStairs = mossyCobbledFamily != null ? mossyCobbledFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.mossyCobbledSlab = mossyCobbledFamily != null ? mossyCobbledFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.mossyCobbledWall = mossyCobbledFamily != null ? mossyCobbledFamily.getVariant(BlockFamily.Variant.WALL) : null;
        this.mossyCobbledButton = mossyCobbledFamily != null ? mossyCobbledFamily.getVariant(BlockFamily.Variant.BUTTON) : null;
        this.mossyCobbledPressurePlate = mossyCobbledFamily != null ? mossyCobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE) : null;
        this.mossyCobbledFamily = mossyCobbledFamily;

        this.smooth = smooth;
        this.smoothSlab = smoothSlab;
        this.crackedSmooth = crackedSmooth;
        this.crackedSmoothSlab = crackedSmoothSlab;

        this.brick = brickFamily != null ? brickFamily.getBaseBlock() : null;
        this.brickStairs = brickFamily != null ? brickFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.brickSlab = brickFamily != null ? brickFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.brickWall = brickFamily != null ? brickFamily.getVariant(BlockFamily.Variant.WALL) : null;
        this.chiseledBrick = brickFamily != null ? brickFamily.getVariant(BlockFamily.Variant.CHISELED) : null;
        this.brickFamily = brickFamily;
        this.crackedBrick = crackedBrickFamily != null ? crackedBrickFamily.getBaseBlock() : null;
        this.crackedBrickStairs = crackedBrickFamily != null ? crackedBrickFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.crackedBrickSlab = crackedBrickFamily != null ? crackedBrickFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.crackedBrickWall = crackedBrickFamily != null ? crackedBrickFamily.getVariant(BlockFamily.Variant.WALL) : null;
        this.crackedBrickFamily = crackedBrickFamily;

        this.tiles = tilesFamily != null ? tilesFamily.getBaseBlock() : null;
        this.tilesStairs = tilesFamily != null ? tilesFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.tilesSlab = tilesFamily != null ? tilesFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.tilesWall = tilesFamily != null ? tilesFamily.getVariant(BlockFamily.Variant.WALL) : null;
        this.tilesFamily = tilesFamily;
        this.crackedTiles = crackedTilesFamily != null ? crackedTilesFamily.getBaseBlock() : null;
        this.crackedTilesStairs = crackedTilesFamily != null ? crackedTilesFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.crackedTilesSlab = crackedTilesFamily != null ? crackedTilesFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.crackedTilesWall = crackedTilesFamily != null ? crackedTilesFamily.getVariant(BlockFamily.Variant.WALL) : null;
        this.crackedTilesFamily = crackedTilesFamily;

        this.cobbledBrick = cobbledBrickFamily != null ? cobbledBrickFamily.getBaseBlock() : null;
        this.cobbledBrickStairs = cobbledBrickFamily != null ? cobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.cobbledBrickSlab = cobbledBrickFamily != null ? cobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.cobbledBrickWall = cobbledBrickFamily != null ? cobbledBrickFamily.getVariant(BlockFamily.Variant.WALL) : null;
        this.cobbledBrickFamily = cobbledBrickFamily;

        this.pillar = pillar;
        this.pillarSlab = pillarSlab;
        this.crackedPillar = crackedPillar;
        this.crackedPillarSlab = crackedPillarSlab;

        this.pavement = pavementFamily != null ? pavementFamily.getBaseBlock() : null;
        this.pavementStairs = pavementFamily != null ? pavementFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.pavementSlab = pavementFamily != null ? pavementFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.pavementFamily = pavementFamily;
        this.crackedPavement = crackedPavementFamily != null ? crackedPavementFamily.getBaseBlock() : null;
        this.crackedPavementStairs = crackedPavementFamily != null ? crackedPavementFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.crackedPavementSlab = crackedPavementFamily != null ? crackedPavementFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.crackedPavementFamily = crackedPavementFamily;

        this.fancyBricks = fancyBricksFamily != null ? fancyBricksFamily.getBaseBlock() : null;
        this.fancyBricksStairs = fancyBricksFamily != null ? fancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.fancyBricksSlab = fancyBricksFamily != null ? fancyBricksFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.fancyBricksWall = fancyBricksFamily != null ? fancyBricksFamily.getVariant(BlockFamily.Variant.WALL) : null;
        this.fancyBricksFamily = fancyBricksFamily;
        this.crackedFancyBricks = crackedFancyBricksFamily != null ? crackedFancyBricksFamily.getBaseBlock() : null;
        this.crackedFancyBricksStairs = crackedFancyBricksFamily != null ? crackedFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.crackedFancyBricksSlab = crackedFancyBricksFamily != null ? crackedFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.crackedFancyBricksWall = crackedFancyBricksFamily != null ? crackedFancyBricksFamily.getVariant(BlockFamily.Variant.WALL) : null;
        this.crackedFancyBricksFamily = crackedFancyBricksFamily;

        this.vanillaAddition = vanillaAddition;
    }*/

    public @NotNull List<ItemStack> getItemGroupList() {
        List<ItemStack> itemGroupList = new ArrayList<>();

        if (stone != null && !vanillaAddition) {
            itemGroupList.add(new ItemStack(stone));
        }
        if (stoneStairs != null) {
            itemGroupList.add(new ItemStack(stoneStairs));
        }
        if (stoneSlab != null) {
            itemGroupList.add(new ItemStack(stoneSlab));
        }
        if (stoneWall != null) {
            itemGroupList.add(new ItemStack(stoneWall));
        }
        if (stoneButton != null) {
            itemGroupList.add(new ItemStack(stoneButton));
        }
        if (stonePressurePlate != null) {
            itemGroupList.add(new ItemStack(stonePressurePlate));
        }
        if (cobbled != null) {
            if (!vanillaAddition) {
                itemGroupList.add(new ItemStack(cobbled));
            }
            if (cobbledStairs != null) {
                itemGroupList.add(new ItemStack(cobbledStairs));
            }
            if (cobbledSlab != null) {
                itemGroupList.add(new ItemStack(cobbledSlab));
            }
            if (cobbledWall != null) {
                itemGroupList.add(new ItemStack(cobbledWall));
            }
            if (cobbledButton != null) {
                itemGroupList.add(new ItemStack(cobbledButton));
            }
            if (cobbledPressurePlate != null) {
                itemGroupList.add(new ItemStack(cobbledPressurePlate));
            }
        }
        if(mossyCobbled != null) {
            if(!vanillaAddition) {
                itemGroupList.add(new ItemStack(mossyCobbled));
            }
            if(mossyCobbledStairs != null) {
                itemGroupList.add(new ItemStack(mossyCobbledStairs));
            }
            if(mossyCobbledSlab != null) {
                itemGroupList.add(new ItemStack(mossyCobbledSlab));
            }
            if(mossyCobbledWall != null) {
                itemGroupList.add(new ItemStack(mossyCobbledWall));
            }
            if(mossyCobbledButton != null) {
                itemGroupList.add(new ItemStack(mossyCobbledButton));
            }
            if(mossyCobbledPressurePlate != null) {
                itemGroupList.add(new ItemStack(mossyCobbledPressurePlate));
            }
        }
        if(overgrownCobbled != null) {
            itemGroupList.add(new ItemStack(overgrownCobbled));
            if(overgrownCobbledStairs != null) {
                itemGroupList.add(new ItemStack(overgrownCobbledStairs));
            }
            if(overgrownCobbledSlab != null) {
                itemGroupList.add(new ItemStack(overgrownCobbledSlab));
            }
            if(overgrownCobbledWall != null) {
                itemGroupList.add(new ItemStack(overgrownCobbledWall));
            }
            if(overgrownCobbledButton != null) {
                itemGroupList.add(new ItemStack(overgrownCobbledButton));
            }
            if(overgrownCobbledPressurePlate != null) {
                itemGroupList.add(new ItemStack(overgrownCobbledPressurePlate));
            }
        }
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
        if (brick != null) {
            if (!vanillaAddition) {
                itemGroupList.add(new ItemStack(brick));
            }
            if (brickStairs != null) {
                itemGroupList.add(new ItemStack(brickStairs));
            }
            if (brickSlab != null) {
                itemGroupList.add(new ItemStack(brickSlab));
            }
            if (brickWall != null) {
                itemGroupList.add(new ItemStack(brickWall));
            }
            if(chiseledBrick != null) {
                itemGroupList.add(new ItemStack(chiseledBrick));
            }
        }
        if (crackedBrick != null) {
            if (!vanillaAddition) {
                itemGroupList.add(new ItemStack(crackedBrick));
            }
            if (crackedBrickStairs != null) {
                itemGroupList.add(new ItemStack(crackedBrickStairs));
            }
            if (crackedBrickSlab != null) {
                itemGroupList.add(new ItemStack(crackedBrickSlab));
            }
            if (crackedBrickWall != null) {
                itemGroupList.add(new ItemStack(crackedBrickWall));
            }
        }
        if(tiles != null) {
            if(!vanillaAddition) {
                itemGroupList.add(new ItemStack(tiles));
            }
            if(tilesStairs != null) {
                itemGroupList.add(new ItemStack(tilesStairs));
            }
            if(tilesSlab != null) {
                itemGroupList.add(new ItemStack(tilesSlab));
            }
            if(tilesWall != null) {
                itemGroupList.add(new ItemStack(tilesWall));
            }
        }
        if (crackedTiles != null) {
            if (!vanillaAddition) {
                itemGroupList.add(new ItemStack(crackedTiles));
            }
            if (crackedTilesStairs != null) {
                itemGroupList.add(new ItemStack(crackedTilesStairs));
            }
            if (crackedTilesSlab != null) {
                itemGroupList.add(new ItemStack(crackedTilesSlab));
            }
            if (crackedTilesWall != null) {
                itemGroupList.add(new ItemStack(crackedTilesWall));
            }
        }
        if(cobbledBrick != null) {
            if(!vanillaAddition) {
                itemGroupList.add(new ItemStack(cobbledBrick));
            }
            if(cobbledBrickStairs != null) {
                itemGroupList.add(new ItemStack(cobbledBrickStairs));
            }
            if(cobbledBrickSlab != null) {
                itemGroupList.add(new ItemStack(cobbledBrickSlab));
            }
            if(cobbledBrickWall != null) {
                itemGroupList.add(new ItemStack(cobbledBrickWall));
            }
        }
        if(pillar != null) {
            if(!vanillaAddition) {
                itemGroupList.add(new ItemStack(pillar));
            }
            if(pillarSlab != null) {
                itemGroupList.add(new ItemStack(pillarSlab));
            }
        }
        if(crackedPillar != null) {
            if(!vanillaAddition) {
                itemGroupList.add(new ItemStack(crackedPillar));
            }
            if(crackedPillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedPillarSlab));
            }
        }
        if(pavement != null) {
            if(!vanillaAddition) {
                itemGroupList.add(new ItemStack(pavement));
            }
            if(pavementStairs != null) {
                itemGroupList.add(new ItemStack(pavementStairs));
            }
            if(pavementSlab != null) {
                itemGroupList.add(new ItemStack(pavementSlab));
            }
        }
        if(crackedPavement != null) {
            if(!vanillaAddition) {
                itemGroupList.add(new ItemStack(crackedPavement));
            }
            if(crackedPavementStairs != null) {
                itemGroupList.add(new ItemStack(crackedPavementStairs));
            }
            if(crackedPavementSlab != null) {
                itemGroupList.add(new ItemStack(crackedPavementSlab));
            }
        }
        if(fancyBricks != null) {
            if(!vanillaAddition) {
                itemGroupList.add(new ItemStack(fancyBricks));
            }
            if(fancyBricksStairs != null) {
                itemGroupList.add(new ItemStack(fancyBricksStairs));
            }
            if(fancyBricksSlab != null) {
                itemGroupList.add(new ItemStack(fancyBricksSlab));
            }
            if(fancyBricksWall != null) {
                itemGroupList.add(new ItemStack(fancyBricksWall));
            }
        }
        if(crackedTiles != null) {
            if(!vanillaAddition) {
                itemGroupList.add(new ItemStack(crackedFancyBricks));
            }
            if(crackedFancyBricksStairs != null) {
                itemGroupList.add(new ItemStack(crackedFancyBricksStairs));
            }
            if(crackedFancyBricksSlab != null) {
                itemGroupList.add(new ItemStack(crackedFancyBricksSlab));
            }
            if(crackedFancyBricksWall != null) {
                itemGroupList.add(new ItemStack(crackedFancyBricksWall));
            }
        }

        return itemGroupList;
    }

    public Block getStone() {
        return stone;
    }

    public Block getStoneStairs() {
        return stoneStairs;
    }

    public Block getStoneSlab() {
        return stoneSlab;
    }

    public Block getStoneWall() {
        return stoneWall;
    }

    public Block getStoneButton() {
        return stoneButton;
    }

    public Block getStonePressurePlate() {
        return stonePressurePlate;
    }

    public BlockFamily getStoneFamily() {
        return stoneFamily;
    }

    public Block getCobbled() {
        return cobbled;
    }

    public Block getCobbledSlab() {
        return cobbledSlab;
    }

    public Block getCobbledStairs() {
        return cobbledStairs;
    }

    public Block getCobbledWall() {
        return cobbledWall;
    }

    public Block getCobbledPressurePlate() {
        return cobbledPressurePlate;
    }

    public Block getCobbledButton() {
        return cobbledButton;
    }

    public BlockFamily getCobbledFamily() {
        return cobbledFamily;
    }

    public Block getMossyCobbled() {
        return mossyCobbled;
    }

    public Block getMossyCobbledStairs() {
        return mossyCobbledStairs;
    }

    public Block getMossyCobbledSlab() {
        return mossyCobbledSlab;
    }

    public Block getMossyCobbledWall() {
        return mossyCobbledWall;
    }

    public Block getMossyCobbledButton() {
        return mossyCobbledButton;
    }

    public Block getMossyCobbledPressurePlate() {
        return mossyCobbledPressurePlate;
    }

    public BlockFamily getMossyCobbledFamily() {
        return mossyCobbledFamily;
    }

    public Block getOvergrownCobbled() {
        return overgrownCobbled;
    }

    public Block getOvergrownCobbledStairs() {
        return overgrownCobbledStairs;
    }

    public Block getOvergrownCobbledSlab() {
        return overgrownCobbledSlab;
    }

    public Block getOvergrownCobbledWall() {
        return overgrownCobbledWall;
    }

    public Block getOvergrownCobbledButton() {
        return overgrownCobbledButton;
    }

    public Block getOvergrownCobbledPressurePlate() {
        return overgrownCobbledPressurePlate;
    }

    public BlockFamily getOvergrownCobbledFamily() {
        return overgrownCobbledFamily;
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

    public Block getBrick() {
        return brick;
    }

    public Block getBrickStairs() {
        return brickStairs;
    }

    public Block getBrickSlab() {
        return brickSlab;
    }

    public Block getBrickWall() {
        return brickWall;
    }

    public Block getChiseledBrick() {
        return chiseledBrick;
    }

    public BlockFamily getBrickFamily() {
        return brickFamily;
    }

    public Block getCrackedBrick() {
        return crackedBrick;
    }

    public Block getCrackedBrickStairs() {
        return crackedBrickStairs;
    }

    public Block getCrackedBrickSlab() {
        return crackedBrickSlab;
    }

    public Block getCrackedBrickWall() {
        return crackedBrickWall;
    }

    public BlockFamily getCrackedBrickFamily() {
        return crackedBrickFamily;
    }

    public Block getTiles() {
        return tiles;
    }

    public Block getTilesStairs() {
        return tilesStairs;
    }

    public Block getTilesSlab() {
        return tilesSlab;
    }

    public Block getTilesWall() {
        return tilesWall;
    }

    public BlockFamily getTilesFamily() {
        return tilesFamily;
    }

    public Block getCrackedTiles() {
        return crackedTiles;
    }

    public Block getCrackedTilesStairs() {
        return crackedTilesStairs;
    }

    public Block getCrackedTilesSlab() {
        return crackedTilesSlab;
    }

    public Block getCrackedTilesWall() {
        return crackedTilesWall;
    }

    public BlockFamily getCrackedTilesFamily() {
        return crackedTilesFamily;
    }

    public Block getCobbledBrick() {
        return cobbledBrick;
    }

    public Block getCobbledBrickStairs() {
        return cobbledBrickStairs;
    }

    public Block getCobbledBrickSlab() {
        return cobbledBrickSlab;
    }

    public Block getCobbledBrickWall() {
        return cobbledBrickWall;
    }

    public BlockFamily getCobbledBrickFamily() {
        return cobbledBrickFamily;
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

    public Block getPavement() {
        return pavement;
    }

    public Block getPavementStairs() {
        return pavementStairs;
    }

    public Block getPavementSlab() {
        return pavementSlab;
    }

    public BlockFamily getPavementFamily() {
        return pavementFamily;
    }

    public Block getCrackedPavement() {
        return crackedPavement;
    }

    public Block getCrackedPavementStairs() {
        return crackedPavementStairs;
    }

    public Block getCrackedPavementSlab() {
        return crackedPavementSlab;
    }

    public BlockFamily getCrackedPavementFamily() {
        return crackedPavementFamily;
    }

    public Block getFancyBricks() {
        return fancyBricks;
    }

    public Block getFancyBricksStairs() {
        return fancyBricksStairs;
    }

    public Block getFancyBricksSlab() {
        return fancyBricksSlab;
    }

    public Block getFancyBricksWall() {
        return fancyBricksWall;
    }

    public BlockFamily getFancyBricksFamily() {
        return fancyBricksFamily;
    }

    public Block getCrackedFancyBricks() {
        return crackedFancyBricks;
    }

    public Block getCrackedFancyBricksStairs() {
        return crackedFancyBricksStairs;
    }

    public Block getCrackedFancyBricksSlab() {
        return crackedFancyBricksSlab;
    }

    public Block getCrackedFancyBricksWall() {
        return crackedFancyBricksWall;
    }

    public BlockFamily getCrackedFancyBricksFamily() {
        return crackedFancyBricksFamily;
    }

    public boolean isVanillaAddition() {
        return vanillaAddition;
    }
}