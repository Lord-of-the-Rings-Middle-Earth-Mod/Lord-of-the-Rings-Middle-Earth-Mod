package me.anedhel.lotr.block;

import me.anedhel.lotr.block.custom.StoneTypeVariants;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public enum ModStoneType {
    BLUESLATE(ModStoneBlocks.BLUESLATE_FAMILY, ModStoneBlocks.MOSSY_BLUESLATE_FAMILY, ModStoneBlocks.OVERGROWN_BLUESLATE_FAMILY,
            ModStoneBlocks.COBBLED_BLUESLATE_FAMILY, ModStoneBlocks.MOSSY_COBBLED_BLUESLATE_FAMILY,
            ModStoneBlocks.OVERGROWN_COBBLED_BLUESLATE_FAMILY,
            ModStoneBlocks.COBBLED_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.MOSSY_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.CRACKED_COBBLED_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.CRACKED_MOSSY_COBBLED_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.CRACKED_OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.SILVER_COBBLED_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.CRACKED_OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.GOLD_COBBLED_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.CRACKED_OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.MOSSY_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.BRONZE_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_BRONZE_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.MOSSY_BRONZE_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_BRONZE_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_BRONZE_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_BRONZE_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.SILVER_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_SILVER_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.MOSSY_SILVER_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_SILVER_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_SILVER_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_SILVER_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.GOLD_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_GOLD_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.MOSSY_GOLD_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_GOLD_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_GOLD_BLUESLATE_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_GOLD_BLUESLATE_BRICK_FAMILY,
            ModStoneBlocks.BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.MOSSY_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_MOSSY_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.OVERGROWN_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.BRONZE_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_BRONZE_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.MOSSY_BRONZE_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_MOSSY_BRONZE_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.OVERGROWN_BRONZE_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_BRONZE_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.SILVER_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_SILVER_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.MOSSY_SILVER_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_MOSSY_SILVER_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.OVERGROWN_SILVER_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_SILVER_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.GOLD_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_GOLD_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.MOSSY_GOLD_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_MOSSY_GOLD_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.OVERGROWN_GOLD_BLUESLATE_TILES_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_GOLD_BLUESLATE_TILES_FAMILY,
            ModStoneBlocks.BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.MOSSY_BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_MOSSY_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.OVERGROWN_BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.BRONZE_BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_BRONZE_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.MOSSY_BRONZE_BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_MOSSY_BRONZE_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.SILVER_BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_SILVER_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.MOSSY_SILVER_BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_MOSSY_SILVER_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.OVERGROWN_SILVER_BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_SILVER_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.GOLD_BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_GOLD_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.MOSSY_GOLD_BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_MOSSY_GOLD_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.OVERGROWN_GOLD_BLUESLATE_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_GOLD_BLUESLATE_PAVEMENT_FAMILY,
            ModStoneBlocks.FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.MOSSY_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.OVERGROWN_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.CRACKED_MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.CRACKED_OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.SILVER_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_SILVER_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.GOLD_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_GOLD_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_FAMILY,
            ModStoneBlocks.SMOOTH_BLUESLATE, ModStoneBlocks.SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.MOSSY_SMOOTH_BLUESLATE, ModStoneBlocks.MOSSY_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_MOSSY_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_MOSSY_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.OVERGROWN_SMOOTH_BLUESLATE, ModStoneBlocks.OVERGROWN_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_OVERGROWN_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_OVERGROWN_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.BRONZE_SMOOTH_BLUESLATE, ModStoneBlocks.BRONZE_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_BRONZE_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_BRONZE_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.MOSSY_BRONZE_SMOOTH_BLUESLATE, ModStoneBlocks.MOSSY_BRONZE_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_MOSSY_BRONZE_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_MOSSY_BRONZE_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.OVERGROWN_BRONZE_SMOOTH_BLUESLATE, ModStoneBlocks.OVERGROWN_BRONZE_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_OVERGROWN_BRONZE_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_OVERGROWN_BRONZE_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.SILVER_SMOOTH_BLUESLATE, ModStoneBlocks.SILVER_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_SILVER_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_SILVER_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.MOSSY_SILVER_SMOOTH_BLUESLATE, ModStoneBlocks.MOSSY_SILVER_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_MOSSY_SILVER_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_MOSSY_SILVER_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.OVERGROWN_SILVER_SMOOTH_BLUESLATE, ModStoneBlocks.OVERGROWN_SILVER_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_OVERGROWN_SILVER_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_OVERGROWN_SILVER_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.GOLD_SMOOTH_BLUESLATE, ModStoneBlocks.GOLD_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_GOLD_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_GOLD_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.MOSSY_GOLD_SMOOTH_BLUESLATE, ModStoneBlocks.MOSSY_GOLD_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_MOSSY_GOLD_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_MOSSY_GOLD_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.OVERGROWN_GOLD_SMOOTH_BLUESLATE, ModStoneBlocks.OVERGROWN_GOLD_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.CRACKED_OVERGROWN_GOLD_SMOOTH_BLUESLATE, ModStoneBlocks.CRACKED_OVERGROWN_GOLD_SMOOTH_BLUESLATE_SLAB,
            ModStoneBlocks.BLUESLATE_PILLAR, ModStoneBlocks.BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.MOSSY_BLUESLATE_PILLAR, ModStoneBlocks.MOSSY_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_MOSSY_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_MOSSY_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.OVERGROWN_BLUESLATE_PILLAR, ModStoneBlocks.OVERGROWN_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_OVERGROWN_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_OVERGROWN_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.BRONZE_BLUESLATE_PILLAR, ModStoneBlocks.BRONZE_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_BRONZE_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_BRONZE_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.MOSSY_BRONZE_BLUESLATE_PILLAR, ModStoneBlocks.MOSSY_BRONZE_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_MOSSY_BRONZE_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_MOSSY_BRONZE_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.OVERGROWN_BRONZE_BLUESLATE_PILLAR, ModStoneBlocks.OVERGROWN_BRONZE_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_OVERGROWN_BRONZE_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_OVERGROWN_BRONZE_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.SILVER_BLUESLATE_PILLAR, ModStoneBlocks.SILVER_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_SILVER_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_SILVER_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.MOSSY_SILVER_BLUESLATE_PILLAR, ModStoneBlocks.MOSSY_SILVER_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_MOSSY_SILVER_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_MOSSY_SILVER_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.OVERGROWN_SILVER_BLUESLATE_PILLAR, ModStoneBlocks.OVERGROWN_SILVER_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_OVERGROWN_SILVER_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_OVERGROWN_SILVER_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.GOLD_BLUESLATE_PILLAR, ModStoneBlocks.GOLD_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_GOLD_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_GOLD_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.MOSSY_GOLD_BLUESLATE_PILLAR, ModStoneBlocks.MOSSY_GOLD_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_MOSSY_GOLD_BLUESLATE_PILLAR, ModStoneBlocks.CRACKED_MOSSY_GOLD_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.OVERGROWN_GOLD_BLUESLATE_PILLAR, ModStoneBlocks.OVERGROWN_GOLD_BLUESLATE_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_OVERGROWN_GOLD_BLUESLATE_PILLAR,
            ModStoneBlocks.CRACKED_OVERGROWN_GOLD_BLUESLATE_PILLAR_SLAB,
            "Blueslate");

    private final Block stone;
    private final Block stoneStairs;
    private final Block stoneSlab;
    private final Block stoneWall;
    private final Block stoneButton;
    private final Block stonePressurePlate;
    private final BlockFamily stoneFamily;

    private final Block mossyStone;
    private final Block mossyStoneStairs;
    private final Block mossyStoneSlab;
    private final Block mossyStoneWall;
    private final Block mossyStoneButton;
    private final Block mossyStonePressurePlate;
    private final BlockFamily mossyStoneFamily;

    private final Block overgrownStone;
    private final Block overgrownStoneStairs;
    private final Block overgrownStoneSlab;
    private final Block overgrownStoneWall;
    private final Block overgrownStoneButton;
    private final Block overgrownStonePressurePlate;
    private final BlockFamily overgrownStoneFamily;

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
    private final Block crackedCobbledBrick;
    private final Block crackedCobbledBrickStairs;
    private final Block crackedCobbledBrickSlab;
    private final Block crackedCobbledBrickWall;
    private final BlockFamily crackedCobbledBrickFamily;

    private final Block mossyCobbledBrick;
    private final Block mossyCobbledBrickStairs;
    private final Block mossyCobbledBrickSlab;
    private final Block mossyCobbledBrickWall;
    private final BlockFamily mossyCobbledBrickFamily;
    private final Block crackedMossyCobbledBrick;
    private final Block crackedMossyCobbledBrickStairs;
    private final Block crackedMossyCobbledBrickSlab;
    private final Block crackedMossyCobbledBrickWall;
    private final BlockFamily crackedMossyCobbledBrickFamily;

    private final Block overgrownCobbledBrick;
    private final Block overgrownCobbledBrickStairs;
    private final Block overgrownCobbledBrickSlab;
    private final Block overgrownCobbledBrickWall;
    private final BlockFamily overgrownCobbledBrickFamily;
    private final Block crackedOvergrownCobbledBrick;
    private final Block crackedOvergrownCobbledBrickStairs;
    private final Block crackedOvergrownCobbledBrickSlab;
    private final Block crackedOvergrownCobbledBrickWall;
    private final BlockFamily crackedOvergrownCobbledBrickFamily;

    private final Block bronzeCobbledBrick;
    private final Block bronzeCobbledBrickStairs;
    private final Block bronzeCobbledBrickSlab;
    private final Block bronzeCobbledBrickWall;
    private final BlockFamily bronzeCobbledBrickFamily;
    private final Block crackedBronzeCobbledBrick;
    private final Block crackedBronzeCobbledBrickStairs;
    private final Block crackedBronzeCobbledBrickSlab;
    private final Block crackedBronzeCobbledBrickWall;
    private final BlockFamily crackedBronzeCobbledBrickFamily;

    private final Block mossyBronzeCobbledBrick;
    private final Block mossyBronzeCobbledBrickStairs;
    private final Block mossyBronzeCobbledBrickSlab;
    private final Block mossyBronzeCobbledBrickWall;
    private final BlockFamily mossyBronzeCobbledBrickFamily;
    private final Block crackedMossyBronzeCobbledBrick;
    private final Block crackedMossyBronzeCobbledBrickStairs;
    private final Block crackedMossyBronzeCobbledBrickSlab;
    private final Block crackedMossyBronzeCobbledBrickWall;
    private final BlockFamily crackedMossyBronzeCobbledBrickFamily;

    private final Block overgrownBronzeCobbledBrick;
    private final Block overgrownBronzeCobbledBrickStairs;
    private final Block overgrownBronzeCobbledBrickSlab;
    private final Block overgrownBronzeCobbledBrickWall;
    private final BlockFamily overgrownBronzeCobbledBrickFamily;
    private final Block crackedOvergrownBronzeCobbledBrick;
    private final Block crackedOvergrownBronzeCobbledBrickStairs;
    private final Block crackedOvergrownBronzeCobbledBrickSlab;
    private final Block crackedOvergrownBronzeCobbledBrickWall;
    private final BlockFamily crackedOvergrownBronzeCobbledBrickFamily;

    private final Block silverCobbledBrick;
    private final Block silverCobbledBrickStairs;
    private final Block silverCobbledBrickSlab;
    private final Block silverCobbledBrickWall;
    private final BlockFamily silverCobbledBrickFamily;
    private final Block crackedSilverCobbledBrick;
    private final Block crackedSilverCobbledBrickStairs;
    private final Block crackedSilverCobbledBrickSlab;
    private final Block crackedSilverCobbledBrickWall;
    private final BlockFamily crackedSilverCobbledBrickFamily;

    private final Block mossySilverCobbledBrick;
    private final Block mossySilverCobbledBrickStairs;
    private final Block mossySilverCobbledBrickSlab;
    private final Block mossySilverCobbledBrickWall;
    private final BlockFamily mossySilverCobbledBrickFamily;
    private final Block crackedMossySilverCobbledBrick;
    private final Block crackedMossySilverCobbledBrickStairs;
    private final Block crackedMossySilverCobbledBrickSlab;
    private final Block crackedMossySilverCobbledBrickWall;
    private final BlockFamily crackedMossySilverCobbledBrickFamily;

    private final Block overgrownSilverCobbledBrick;
    private final Block overgrownSilverCobbledBrickStairs;
    private final Block overgrownSilverCobbledBrickSlab;
    private final Block overgrownSilverCobbledBrickWall;
    private final BlockFamily overgrownSilverCobbledBrickFamily;
    private final Block crackedOvergrownSilverCobbledBrick;
    private final Block crackedOvergrownSilverCobbledBrickStairs;
    private final Block crackedOvergrownSilverCobbledBrickSlab;
    private final Block crackedOvergrownSilverCobbledBrickWall;
    private final BlockFamily crackedOvergrownSilverCobbledBrickFamily;

    private final Block goldCobbledBrick;
    private final Block goldCobbledBrickStairs;
    private final Block goldCobbledBrickSlab;
    private final Block goldCobbledBrickWall;
    private final BlockFamily goldCobbledBrickFamily;
    private final Block crackedGoldCobbledBrick;
    private final Block crackedGoldCobbledBrickStairs;
    private final Block crackedGoldCobbledBrickSlab;
    private final Block crackedGoldCobbledBrickWall;
    private final BlockFamily crackedGoldCobbledBrickFamily;

    private final Block mossyGoldCobbledBrick;
    private final Block mossyGoldCobbledBrickStairs;
    private final Block mossyGoldCobbledBrickSlab;
    private final Block mossyGoldCobbledBrickWall;
    private final BlockFamily mossyGoldCobbledBrickFamily;
    private final Block crackedMossyGoldCobbledBrick;
    private final Block crackedMossyGoldCobbledBrickStairs;
    private final Block crackedMossyGoldCobbledBrickSlab;
    private final Block crackedMossyGoldCobbledBrickWall;
    private final BlockFamily crackedMossyGoldCobbledBrickFamily;

    private final Block overgrownGoldCobbledBrick;
    private final Block overgrownGoldCobbledBrickStairs;
    private final Block overgrownGoldCobbledBrickSlab;
    private final Block overgrownGoldCobbledBrickWall;
    private final BlockFamily overgrownGoldCobbledBrickFamily;
    private final Block crackedOvergrownGoldCobbledBrick;
    private final Block crackedOvergrownGoldCobbledBrickStairs;
    private final Block crackedOvergrownGoldCobbledBrickSlab;
    private final Block crackedOvergrownGoldCobbledBrickWall;
    private final BlockFamily crackedOvergrownGoldCobbledBrickFamily;

    private final Block smooth;
    private final Block smoothSlab;
    private final Block crackedSmooth;
    private final Block crackedSmoothSlab;

    private final Block mossySmooth;
    private final Block mossySmoothSlab;
    private final Block crackedMossySmooth;
    private final Block crackedMossySmoothSlab;

    private final Block overgrownSmooth;
    private final Block overgrownSmoothSlab;
    private final Block crackedOvergrownSmooth;
    private final Block crackedOvergrownSmoothSlab;

    private final Block bronzeSmooth;
    private final Block bronzeSmoothSlab;
    private final Block crackedBronzeSmooth;
    private final Block crackedBronzeSmoothSlab;

    private final Block mossyBronzeSmooth;
    private final Block mossyBronzeSmoothSlab;
    private final Block crackedMossyBronzeSmooth;
    private final Block crackedMossyBronzeSmoothSlab;

    private final Block overgrownBronzeSmooth;
    private final Block overgrownBronzeSmoothSlab;
    private final Block crackedOvergrownBronzeSmooth;
    private final Block crackedOvergrownBronzeSmoothSlab;

    private final Block silverSmooth;
    private final Block silverSmoothSlab;
    private final Block crackedSilverSmooth;
    private final Block crackedSilverSmoothSlab;

    private final Block mossySilverSmooth;
    private final Block mossySilverSmoothSlab;
    private final Block crackedMossySilverSmooth;
    private final Block crackedMossySilverSmoothSlab;

    private final Block overgrownSilverSmooth;
    private final Block overgrownSilverSmoothSlab;
    private final Block crackedOvergrownSilverSmooth;
    private final Block crackedOvergrownSilverSmoothSlab;

    private final Block goldSmooth;
    private final Block goldSmoothSlab;
    private final Block crackedGoldSmooth;
    private final Block crackedGoldSmoothSlab;

    private final Block mossyGoldSmooth;
    private final Block mossyGoldSmoothSlab;
    private final Block crackedMossyGoldSmooth;
    private final Block crackedMossyGoldSmoothSlab;

    private final Block overgrownGoldSmooth;
    private final Block overgrownGoldSmoothSlab;
    private final Block crackedOvergrownGoldSmooth;
    private final Block crackedOvergrownGoldSmoothSlab;

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
    private final BlockFamily overgrownBrickFamily;
    private final Block crackedOvergrownBrick;
    private final Block crackedOvergrownBrickStairs;
    private final Block crackedOvergrownBrickSlab;
    private final Block crackedOvergrownBrickWall;
    private final BlockFamily crackedOvergrownBrickFamily;

    private final Block bronzeBrick;
    private final Block bronzeBrickStairs;
    private final Block bronzeBrickSlab;
    private final Block bronzeBrickWall;
    private final BlockFamily bronzeBrickFamily;
    private final Block crackedBronzeBrick;
    private final Block crackedBronzeBrickStairs;
    private final Block crackedBronzeBrickSlab;
    private final Block crackedBronzeBrickWall;
    private final BlockFamily crackedBronzeBrickFamily;

    private final Block mossyBronzeBrick;
    private final Block mossyBronzeBrickStairs;
    private final Block mossyBronzeBrickSlab;
    private final Block mossyBronzeBrickWall;
    private final BlockFamily mossyBronzeBrickFamily;
    private final Block crackedMossyBronzeBrick;
    private final Block crackedMossyBronzeBrickStairs;
    private final Block crackedMossyBronzeBrickSlab;
    private final Block crackedMossyBronzeBrickWall;
    private final BlockFamily crackedMossyBronzeBrickFamily;

    private final Block overgrownBronzeBrick;
    private final Block overgrownBronzeBrickStairs;
    private final Block overgrownBronzeBrickSlab;
    private final Block overgrownBronzeBrickWall;
    private final BlockFamily overgrownBronzeBrickFamily;
    private final Block crackedOvergrownBronzeBrick;
    private final Block crackedOvergrownBronzeBrickStairs;
    private final Block crackedOvergrownBronzeBrickSlab;
    private final Block crackedOvergrownBronzeBrickWall;
    private final BlockFamily crackedOvergrownBronzeBrickFamily;

    private final Block silverBrick;
    private final Block silverBrickStairs;
    private final Block silverBrickSlab;
    private final Block silverBrickWall;
    private final BlockFamily silverBrickFamily;
    private final Block crackedSilverBrick;
    private final Block crackedSilverBrickStairs;
    private final Block crackedSilverBrickSlab;
    private final Block crackedSilverBrickWall;
    private final BlockFamily crackedSilverBrickFamily;

    private final Block mossySilverBrick;
    private final Block mossySilverBrickStairs;
    private final Block mossySilverBrickSlab;
    private final Block mossySilverBrickWall;
    private final BlockFamily mossySilverBrickFamily;
    private final Block crackedMossySilverBrick;
    private final Block crackedMossySilverBrickStairs;
    private final Block crackedMossySilverBrickSlab;
    private final Block crackedMossySilverBrickWall;
    private final BlockFamily crackedMossySilverBrickFamily;

    private final Block overgrownSilverBrick;
    private final Block overgrownSilverBrickStairs;
    private final Block overgrownSilverBrickSlab;
    private final Block overgrownSilverBrickWall;
    private final BlockFamily overgrownSilverBrickFamily;
    private final Block crackedOvergrownSilverBrick;
    private final Block crackedOvergrownSilverBrickStairs;
    private final Block crackedOvergrownSilverBrickSlab;
    private final Block crackedOvergrownSilverBrickWall;
    private final BlockFamily crackedOvergrownSilverBrickFamily;

    private final Block goldBrick;
    private final Block goldBrickStairs;
    private final Block goldBrickSlab;
    private final Block goldBrickWall;
    private final BlockFamily goldBrickFamily;
    private final Block crackedGoldBrick;
    private final Block crackedGoldBrickStairs;
    private final Block crackedGoldBrickSlab;
    private final Block crackedGoldBrickWall;
    private final BlockFamily crackedGoldBrickFamily;

    private final Block mossyGoldBrick;
    private final Block mossyGoldBrickStairs;
    private final Block mossyGoldBrickSlab;
    private final Block mossyGoldBrickWall;
    private final BlockFamily mossyGoldBrickFamily;
    private final Block crackedMossyGoldBrick;
    private final Block crackedMossyGoldBrickStairs;
    private final Block crackedMossyGoldBrickSlab;
    private final Block crackedMossyGoldBrickWall;
    private final BlockFamily crackedMossyGoldBrickFamily;

    private final Block overgrownGoldBrick;
    private final Block overgrownGoldBrickStairs;
    private final Block overgrownGoldBrickSlab;
    private final Block overgrownGoldBrickWall;
    private final BlockFamily overgrownGoldBrickFamily;
    private final Block crackedOvergrownGoldBrick;
    private final Block crackedOvergrownGoldBrickStairs;
    private final Block crackedOvergrownGoldBrickSlab;
    private final Block crackedOvergrownGoldBrickWall;
    private final BlockFamily crackedOvergrownGoldBrickFamily;

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

    private final Block bronzeTiles;
    private final Block bronzeTilesStairs;
    private final Block bronzeTilesSlab;
    private final Block bronzeTilesWall;
    private final BlockFamily bronzeTilesFamily;
    private final Block crackedBronzeTiles;
    private final Block crackedBronzeTilesStairs;
    private final Block crackedBronzeTilesSlab;
    private final Block crackedBronzeTilesWall;
    private final BlockFamily crackedBronzeTilesFamily;

    private final Block mossyBronzeTiles;
    private final Block mossyBronzeTilesStairs;
    private final Block mossyBronzeTilesSlab;
    private final Block mossyBronzeTilesWall;
    private final BlockFamily mossyBronzeTilesFamily;
    private final Block crackedMossyBronzeTiles;
    private final Block crackedMossyBronzeTilesStairs;
    private final Block crackedMossyBronzeTilesSlab;
    private final Block crackedMossyBronzeTilesWall;
    private final BlockFamily crackedMossyBronzeTilesFamily;

    private final Block overgrownBronzeTiles;
    private final Block overgrownBronzeTilesStairs;
    private final Block overgrownBronzeTilesSlab;
    private final Block overgrownBronzeTilesWall;
    private final BlockFamily overgrownBronzeTilesFamily;
    private final Block crackedOvergrownBronzeTiles;
    private final Block crackedOvergrownBronzeTilesStairs;
    private final Block crackedOvergrownBronzeTilesSlab;
    private final Block crackedOvergrownBronzeTilesWall;
    private final BlockFamily crackedOvergrownBronzeTilesFamily;

    private final Block silverTiles;
    private final Block silverTilesStairs;
    private final Block silverTilesSlab;
    private final Block silverTilesWall;
    private final BlockFamily silverTilesFamily;
    private final Block crackedSilverTiles;
    private final Block crackedSilverTilesStairs;
    private final Block crackedSilverTilesSlab;
    private final Block crackedSilverTilesWall;
    private final BlockFamily crackedSilverTilesFamily;

    private final Block mossySilverTiles;
    private final Block mossySilverTilesStairs;
    private final Block mossySilverTilesSlab;
    private final Block mossySilverTilesWall;
    private final BlockFamily mossySilverTilesFamily;
    private final Block crackedMossySilverTiles;
    private final Block crackedMossySilverTilesStairs;
    private final Block crackedMossySilverTilesSlab;
    private final Block crackedMossySilverTilesWall;
    private final BlockFamily crackedMossySilverTilesFamily;

    private final Block overgrownSilverTiles;
    private final Block overgrownSilverTilesStairs;
    private final Block overgrownSilverTilesSlab;
    private final Block overgrownSilverTilesWall;
    private final BlockFamily overgrownSilverTilesFamily;
    private final Block crackedOvergrownSilverTiles;
    private final Block crackedOvergrownSilverTilesStairs;
    private final Block crackedOvergrownSilverTilesSlab;
    private final Block crackedOvergrownSilverTilesWall;
    private final BlockFamily crackedOvergrownSilverTilesFamily;

    private final Block goldTiles;
    private final Block goldTilesStairs;
    private final Block goldTilesSlab;
    private final Block goldTilesWall;
    private final BlockFamily goldTilesFamily;
    private final Block crackedGoldTiles;
    private final Block crackedGoldTilesStairs;
    private final Block crackedGoldTilesSlab;
    private final Block crackedGoldTilesWall;
    private final BlockFamily crackedGoldTilesFamily;

    private final Block mossyGoldTiles;
    private final Block mossyGoldTilesStairs;
    private final Block mossyGoldTilesSlab;
    private final Block mossyGoldTilesWall;
    private final BlockFamily mossyGoldTilesFamily;
    private final Block crackedMossyGoldTiles;
    private final Block crackedMossyGoldTilesStairs;
    private final Block crackedMossyGoldTilesSlab;
    private final Block crackedMossyGoldTilesWall;
    private final BlockFamily crackedMossyGoldTilesFamily;

    private final Block overgrownGoldTiles;
    private final Block overgrownGoldTilesStairs;
    private final Block overgrownGoldTilesSlab;
    private final Block overgrownGoldTilesWall;
    private final BlockFamily overgrownGoldTilesFamily;
    private final Block crackedOvergrownGoldTiles;
    private final Block crackedOvergrownGoldTilesStairs;
    private final Block crackedOvergrownGoldTilesSlab;
    private final Block crackedOvergrownGoldTilesWall;
    private final BlockFamily crackedOvergrownGoldTilesFamily;

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

    private final Block bronzePillar;
    private final Block bronzePillarSlab;
    private final Block crackedBronzePillar;
    private final Block crackedBronzePillarSlab;

    private final Block mossyBronzePillar;
    private final Block mossyBronzePillarSlab;
    private final Block crackedMossyBronzePillar;
    private final Block crackedMossyBronzePillarSlab;

    private final Block overgrownBronzePillar;
    private final Block overgrownBronzePillarSlab;
    private final Block crackedOvergrownBronzePillar;
    private final Block crackedOvergrownBronzePillarSlab;

    private final Block silverPillar;
    private final Block silverPillarSlab;
    private final Block crackedSilverPillar;
    private final Block crackedSilverPillarSlab;

    private final Block mossySilverPillar;
    private final Block mossySilverPillarSlab;
    private final Block crackedMossySilverPillar;
    private final Block crackedMossySilverPillarSlab;

    private final Block overgrownSilverPillar;
    private final Block overgrownSilverPillarSlab;
    private final Block crackedOvergrownSilverPillar;
    private final Block crackedOvergrownSilverPillarSlab;

    private final Block goldPillar;
    private final Block goldPillarSlab;
    private final Block crackedGoldPillar;
    private final Block crackedGoldPillarSlab;

    private final Block mossyGoldPillar;
    private final Block mossyGoldPillarSlab;
    private final Block crackedMossyGoldPillar;
    private final Block crackedMossyGoldPillarSlab;

    private final Block overgrownGoldPillar;
    private final Block overgrownGoldPillarSlab;
    private final Block crackedOvergrownGoldPillar;
    private final Block crackedOvergrownGoldPillarSlab;

    private final Block pavement;
    private final Block pavementStairs;
    private final Block pavementSlab;
    private final BlockFamily pavementFamily;
    private final Block crackedPavement;
    private final Block crackedPavementStairs;
    private final Block crackedPavementSlab;
    private final BlockFamily crackedPavementFamily;

    private final Block mossyPavement;
    private final Block mossyPavementStairs;
    private final Block mossyPavementSlab;
    private final BlockFamily mossyPavementFamily;
    private final Block crackedMossyPavement;
    private final Block crackedMossyPavementStairs;
    private final Block crackedMossyPavementSlab;
    private final BlockFamily crackedMossyPavementFamily;

    private final Block overgrownPavement;
    private final Block overgrownPavementStairs;
    private final Block overgrownPavementSlab;
    private final BlockFamily overgrownPavementFamily;
    private final Block crackedOvergrownPavement;
    private final Block crackedOvergrownPavementStairs;
    private final Block crackedOvergrownPavementSlab;
    private final BlockFamily crackedOvergrownPavementFamily;

    private final Block bronzePavement;
    private final Block bronzePavementStairs;
    private final Block bronzePavementSlab;
    private final BlockFamily bronzePavementFamily;
    private final Block crackedBronzePavement;
    private final Block crackedBronzePavementStairs;
    private final Block crackedBronzePavementSlab;
    private final BlockFamily crackedBronzePavementFamily;

    private final Block mossyBronzePavement;
    private final Block mossyBronzePavementStairs;
    private final Block mossyBronzePavementSlab;
    private final BlockFamily mossyBronzePavementFamily;
    private final Block crackedMossyBronzePavement;
    private final Block crackedMossyBronzePavementStairs;
    private final Block crackedMossyBronzePavementSlab;
    private final BlockFamily crackedMossyBronzePavementFamily;

    private final Block overgrownBronzePavement;
    private final Block overgrownBronzePavementStairs;
    private final Block overgrownBronzePavementSlab;
    private final BlockFamily overgrownBronzePavementFamily;
    private final Block crackedOvergrownBronzePavement;
    private final Block crackedOvergrownBronzePavementStairs;
    private final Block crackedOvergrownBronzePavementSlab;
    private final BlockFamily crackedOvergrownBronzePavementFamily;

    private final Block silverPavement;
    private final Block silverPavementStairs;
    private final Block silverPavementSlab;
    private final BlockFamily silverPavementFamily;
    private final Block crackedSilverPavement;
    private final Block crackedSilverPavementStairs;
    private final Block crackedSilverPavementSlab;
    private final BlockFamily crackedSilverPavementFamily;

    private final Block mossySilverPavement;
    private final Block mossySilverPavementStairs;
    private final Block mossySilverPavementSlab;
    private final BlockFamily mossySilverPavementFamily;
    private final Block crackedMossySilverPavement;
    private final Block crackedMossySilverPavementStairs;
    private final Block crackedMossySilverPavementSlab;
    private final BlockFamily crackedMossySilverPavementFamily;

    private final Block overgrownSilverPavement;
    private final Block overgrownSilverPavementStairs;
    private final Block overgrownSilverPavementSlab;
    private final BlockFamily overgrownSilverPavementFamily;
    private final Block crackedOvergrownSilverPavement;
    private final Block crackedOvergrownSilverPavementStairs;
    private final Block crackedOvergrownSilverPavementSlab;
    private final BlockFamily crackedOvergrownSilverPavementFamily;

    private final Block goldPavement;
    private final Block goldPavementStairs;
    private final Block goldPavementSlab;
    private final BlockFamily goldPavementFamily;
    private final Block crackedGoldPavement;
    private final Block crackedGoldPavementStairs;
    private final Block crackedGoldPavementSlab;
    private final BlockFamily crackedGoldPavementFamily;

    private final Block mossyGoldPavement;
    private final Block mossyGoldPavementStairs;
    private final Block mossyGoldPavementSlab;
    private final BlockFamily mossyGoldPavementFamily;
    private final Block crackedMossyGoldPavement;
    private final Block crackedMossyGoldPavementStairs;
    private final Block crackedMossyGoldPavementSlab;
    private final BlockFamily crackedMossyGoldPavementFamily;

    private final Block overgrownGoldPavement;
    private final Block overgrownGoldPavementStairs;
    private final Block overgrownGoldPavementSlab;
    private final BlockFamily overgrownGoldPavementFamily;
    private final Block crackedOvergrownGoldPavement;
    private final Block crackedOvergrownGoldPavementStairs;
    private final Block crackedOvergrownGoldPavementSlab;
    private final BlockFamily crackedOvergrownGoldPavementFamily;

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

    private final Block bronzeFancyBricks;
    private final Block bronzeFancyBrickStairs;
    private final Block bronzeFancyBrickSlab;
    private final Block bronzeFancyBrickWall;
    private final BlockFamily bronzeFancyBricksFamily;
    private final Block crackedBronzeFancyBricks;
    private final Block crackedBronzeFancyBricksStairs;
    private final Block crackedBronzeFancyBricksSlab;
    private final Block crackedBronzeFancyBricksWall;
    private final BlockFamily crackedBronzeFancyBricksFamily;

    private final Block mossyBronzeFancyBricks;
    private final Block mossyBronzeFancyBrickStairs;
    private final Block mossyBronzeFancyBrickSlab;
    private final Block mossyBronzeFancyBrickWall;
    private final BlockFamily mossyBronzeFancyBricksFamily;
    private final Block crackedMossyBronzeFancyBricks;
    private final Block crackedMossyBronzeFancyBricksStairs;
    private final Block crackedMossyBronzeFancyBricksSlab;
    private final Block crackedMossyBronzeFancyBricksWall;
    private final BlockFamily crackedMossyBronzeFancyBricksFamily;

    private final Block overgrownBronzeFancyBricks;
    private final Block overgrownBronzeFancyBrickStairs;
    private final Block overgrownBronzeFancyBrickSlab;
    private final Block overgrownBronzeFancyBrickWall;
    private final BlockFamily overgrownBronzeFancyBricksFamily;
    private final Block crackedOvergrownBronzeFancyBricks;
    private final Block crackedOvergrownBronzeFancyBricksStairs;
    private final Block crackedOvergrownBronzeFancyBricksSlab;
    private final Block crackedOvergrownBronzeFancyBricksWall;
    private final BlockFamily crackedOvergrownBronzeFancyBricksFamily;

    private final Block silverFancyBricks;
    private final Block silverFancyBrickStairs;
    private final Block silverFancyBrickSlab;
    private final Block silverFancyBrickWall;
    private final BlockFamily silverFancyBricksFamily;
    private final Block crackedSilverFancyBricks;
    private final Block crackedSilverFancyBricksStairs;
    private final Block crackedSilverFancyBricksSlab;
    private final Block crackedSilverFancyBricksWall;
    private final BlockFamily crackedSilverFancyBricksFamily;

    private final Block mossySilverFancyBricks;
    private final Block mossySilverFancyBrickStairs;
    private final Block mossySilverFancyBrickSlab;
    private final Block mossySilverFancyBrickWall;
    private final BlockFamily mossySilverFancyBricksFamily;
    private final Block crackedMossySilverFancyBricks;
    private final Block crackedMossySilverFancyBricksStairs;
    private final Block crackedMossySilverFancyBricksSlab;
    private final Block crackedMossySilverFancyBricksWall;
    private final BlockFamily crackedMossySilverFancyBricksFamily;

    private final Block overgrownSilverFancyBricks;
    private final Block overgrownSilverFancyBrickStairs;
    private final Block overgrownSilverFancyBrickSlab;
    private final Block overgrownSilverFancyBrickWall;
    private final BlockFamily overgrownSilverFancyBricksFamily;
    private final Block crackedOvergrownSilverFancyBricks;
    private final Block crackedOvergrownSilverFancyBricksStairs;
    private final Block crackedOvergrownSilverFancyBricksSlab;
    private final Block crackedOvergrownSilverFancyBricksWall;
    private final BlockFamily crackedOvergrownSilverFancyBricksFamily;

    private final Block goldFancyBricks;
    private final Block goldFancyBrickStairs;
    private final Block goldFancyBrickSlab;
    private final Block goldFancyBrickWall;
    private final BlockFamily goldFancyBricksFamily;
    private final Block crackedGoldFancyBricks;
    private final Block crackedGoldFancyBricksStairs;
    private final Block crackedGoldFancyBricksSlab;
    private final Block crackedGoldFancyBricksWall;
    private final BlockFamily crackedGoldFancyBricksFamily;

    private final Block mossyGoldFancyBricks;
    private final Block mossyGoldFancyBrickStairs;
    private final Block mossyGoldFancyBrickSlab;
    private final Block mossyGoldFancyBrickWall;
    private final BlockFamily mossyGoldFancyBricksFamily;
    private final Block crackedMossyGoldFancyBricks;
    private final Block crackedMossyGoldFancyBricksStairs;
    private final Block crackedMossyGoldFancyBricksSlab;
    private final Block crackedMossyGoldFancyBricksWall;
    private final BlockFamily crackedMossyGoldFancyBricksFamily;

    private final Block overgrownGoldFancyBricks;
    private final Block overgrownGoldFancyBrickStairs;
    private final Block overgrownGoldFancyBrickSlab;
    private final Block overgrownGoldFancyBrickWall;
    private final BlockFamily overgrownGoldFancyBricksFamily;
    private final Block crackedOvergrownGoldFancyBricks;
    private final Block crackedOvergrownGoldFancyBricksStairs;
    private final Block crackedOvergrownGoldFancyBricksSlab;
    private final Block crackedOvergrownGoldFancyBricksWall;
    private final BlockFamily crackedOvergrownGoldFancyBricksFamily;

    private final String name;

    ModStoneType(BlockFamily stoneFamily, BlockFamily mossyStoneFamily, BlockFamily overgrownStoneFamily,
            BlockFamily cobbledFamily, BlockFamily mossyCobbledFamily, BlockFamily overgrownCobbledFamily,
            BlockFamily cobbledBrickFamily, BlockFamily mossyCobbledBrickFamily, BlockFamily overgrownCobbledBrickFamily,
            BlockFamily crackedCobbledBrickFamily, BlockFamily crackedMossyCobbledBrickFamily, BlockFamily crackedOvergrownCobbledBrickFamily,
            BlockFamily bronzeCobbledBrickFamily, BlockFamily mossyBronzeCobbledBrickFamily, BlockFamily overgrownBronzeCobbledBrickFamily,
            BlockFamily crackedBronzeCobbledBrickFamily, BlockFamily crackedMossyBronzeCobbledBrickFamily, BlockFamily crackedOvergrownBronzeCobbledBrickFamily,
            BlockFamily silverCobbledBrickFamily, BlockFamily mossySilverCobbledBrickFamily, BlockFamily overgrownSilverCobbledBrickFamily,
            BlockFamily crackedSilverCobbledBrickFamily, BlockFamily crackedMossySilverCobbledBrickFamily, BlockFamily crackedOvergrownSilverCobbledBrickFamily,
            BlockFamily goldCobbledBrickFamily, BlockFamily mossyGoldCobbledBrickFamily, BlockFamily overgrownGoldCobbledBrickFamily,
            BlockFamily crackedGoldCobbledBrickFamily, BlockFamily crackedMossyGoldCobbledBrickFamily, BlockFamily crackedOvergrownGoldCobbledBrickFamily,
            BlockFamily brickFamily, BlockFamily crackedBrickFamily,
            BlockFamily mossyBrickFamily, BlockFamily crackedMossyBrickFamily,
            BlockFamily overgrownBrickFamily, BlockFamily crackedOvergrownBrickFamily,
            BlockFamily bronzeBrickFamily, BlockFamily crackedBronzeBrickFamily,
            BlockFamily mossyBronzeBrickFamily, BlockFamily crackedMossyBronzeBrickFamily,
            BlockFamily overgrownBronzeBrickFamily, BlockFamily crackedOvergrownBronzeBrickFamily,
            BlockFamily silverBrickFamily, BlockFamily crackedSilverBrickFamily,
            BlockFamily mossySilverBrickFamily, BlockFamily crackedMossySilverBrickFamily,
            BlockFamily overgrownSilverBrickFamily, BlockFamily crackedOvergrownSilverBrickFamily,
            BlockFamily goldBrickFamily, BlockFamily crackedGoldBrickFamily,
            BlockFamily mossyGoldBrickFamily, BlockFamily crackedMossyGoldBrickFamily,
            BlockFamily overgrownGoldBrickFamily, BlockFamily crackedOvergrownGoldBrickFamily,
            BlockFamily tilesFamily, BlockFamily crackedTilesFamily,
            BlockFamily mossyTilesFamily, BlockFamily crackedMossyTilesFamily,
            BlockFamily overgrownTilesFamily, BlockFamily crackedOvergrownTilesFamily,
            BlockFamily bronzeTilesFamily, BlockFamily crackedBronzeTilesFamily,
            BlockFamily mossyBronzeTilesFamily, BlockFamily crackedMossyBronzeTilesFamily,
            BlockFamily overgrownBronzeTilesFamily, BlockFamily crackedOvergrownBronzeTilesFamily,
            BlockFamily silverTilesFamily, BlockFamily crackedSilverTilesFamily,
            BlockFamily mossySilverTilesFamily, BlockFamily crackedMossySilverTilesFamily,
            BlockFamily overgrownSilverTilesFamily, BlockFamily crackedOvergrownSilverTilesFamily,
            BlockFamily goldTilesFamily, BlockFamily crackedGoldTilesFamily,
            BlockFamily mossyGoldTilesFamily, BlockFamily crackedMossyGoldTilesFamily,
            BlockFamily overgrownGoldTilesFamily, BlockFamily crackedOvergrownGoldTilesFamily,
            BlockFamily pavementFamily, BlockFamily crackedPavementFamily,
            BlockFamily mossyPavementFamily, BlockFamily crackedMossyPavementFamily,
            BlockFamily overgrownPavementFamily, BlockFamily crackedOvergrownPavementFamily,
            BlockFamily bronzePavementFamily, BlockFamily crackedBronzePavementFamily,
            BlockFamily mossyBronzePavementFamily, BlockFamily crackedMossyBronzePavementFamily,
            BlockFamily overgrownBronzePavementFamily, BlockFamily crackedOvergrownBronzePavementFamily,
            BlockFamily silverPavementFamily, BlockFamily crackedSilverPavementFamily,
            BlockFamily mossySilverPavementFamily, BlockFamily crackedMossySilverPavementFamily,
            BlockFamily overgrownSilverPavementFamily, BlockFamily crackedOvergrownSilverPavementFamily,
            BlockFamily goldPavementFamily, BlockFamily crackedGoldPavementFamily,
            BlockFamily mossyGoldPavementFamily, BlockFamily crackedMossyGoldPavementFamily,
            BlockFamily overgrownGoldPavementFamily, BlockFamily crackedOvergrownGoldPavementFamily,
            BlockFamily fancyBricksFamily, BlockFamily crackedFancyBricksFamily,
            BlockFamily mossyFancyBricksFamily, BlockFamily crackedMossyFancyBricksFamily,
            BlockFamily overgrownFancyBricksFamily, BlockFamily crackedOvergrownFancyBricksFamily,
            BlockFamily bronzeFancyBricksFamily, BlockFamily crackedBronzeFancyBricksFamily,
            BlockFamily mossyBronzeFancyBricksFamily, BlockFamily crackedMossyBronzeFancyBricksFamily,
            BlockFamily overgrownBronzeFancyBricksFamily, BlockFamily crackedOvergrownBronzeFancyBricksFamily,
            BlockFamily silverFancyBricksFamily, BlockFamily crackedSilverFancyBricksFamily,
            BlockFamily mossySilverFancyBricksFamily, BlockFamily crackedMossySilverFancyBricksFamily,
            BlockFamily overgrownSilverFancyBricksFamily, BlockFamily crackedOvergrownSilverFancyBricksFamily,
            BlockFamily goldFancyBricksFamily, BlockFamily crackedGoldFancyBricksFamily,
            BlockFamily mossyGoldFancyBricksFamily, BlockFamily crackedMossyGoldFancyBricksFamily,
            BlockFamily overgrownGoldFancyBricksFamily, BlockFamily crackedOvergrownGoldFancyBricksFamily,
            Block smooth, Block smoothSlab, Block crackedSmooth, Block crackedSmoothSlab,
            Block mossySmooth, Block mossySmoothSlab, Block crackedMossySmooth, Block crackedMossySmoothSlab,
            Block overgrownSmooth, Block overgrownSmoothSlab, Block crackedOvergrownSmooth, Block crackedOvergrownSmoothSlab,
            Block bronzeSmooth, Block bronzeSmoothSlab, Block crackedBronzeSmooth, Block crackedBronzeSmoothSlab,
            Block mossyBronzeSmooth, Block mossyBronzeSmoothSlab, Block crackedMossyBronzeSmooth, Block crackedMossyBronzeSmoothSlab,
            Block overgrownBronzeSmooth, Block overgrownBronzeSmoothSlab, Block crackedOvergrownBronzeSmooth, Block crackedOvergrownBronzeSmoothSlab,
            Block silverSmooth, Block silverSmoothSlab, Block crackedSilverSmooth, Block crackedSilverSmoothSlab,
            Block mossySilverSmooth, Block mossySilverSmoothSlab, Block crackedMossySilverSmooth, Block crackedMossySilverSmoothSlab,
            Block overgrownSilverSmooth, Block overgrownSilverSmoothSlab, Block crackedOvergrownSilverSmooth, Block crackedOvergrownSilverSmoothSlab,
            Block goldSmooth, Block goldSmoothSlab, Block crackedGoldSmooth, Block crackedGoldSmoothSlab,
            Block mossyGoldSmooth, Block mossyGoldSmoothSlab, Block crackedMossyGoldSmooth, Block crackedMossyGoldSmoothSlab,
            Block overgrownGoldSmooth, Block overgrownGoldSmoothSlab, Block crackedOvergrownGoldSmooth, Block crackedOvergrownGoldSmoothSlab,
            Block pillar, Block pillarSlab, Block crackedPillar, Block crackedPillarSlab,
            Block mossyPillar, Block mossyPillarSlab, Block crackedMossyPillar, Block crackedMossyPillarSlab,
            Block overgrownPillar, Block overgrownPillarSlab, Block crackedOvergrownPillar, Block crackedOvergrownPillarSlab,
            Block bronzePillar, Block bronzePillarSlab, Block crackedBronzePillar, Block crackedBronzePillarSlab,
            Block mossyBronzePillar, Block mossyBronzePillarSlab, Block crackedMossyBronzePillar, Block crackedMossyBronzePillarSlab,
            Block overgrownBronzePillar, Block overgrownBronzePillarSlab, Block crackedOvergrownBronzePillar, Block crackedOvergrownBronzePillarSlab,
            Block silverPillar, Block silverPillarSlab, Block crackedSilverPillar, Block crackedSilverPillarSlab,
            Block mossySilverPillar, Block mossySilverPillarSlab, Block crackedMossySilverPillar, Block crackedMossySilverPillarSlab,
            Block overgrownSilverPillar, Block overgrownSilverPillarSlab, Block crackedOvergrownSilverPillar, Block crackedOvergrownSilverPillarSlab,
            Block goldPillar, Block goldPillarSlab, Block crackedGoldPillar, Block crackedGoldPillarSlab,
            Block mossyGoldPillar, Block mossyGoldPillarSlab, Block crackedMossyGoldPillar, Block crackedMossyGoldPillarSlab,
            Block overgrownGoldPillar, Block overgrownGoldPillarSlab, Block crackedOvergrownGoldPillar,
            Block crackedOvergrownGoldPillarSlab,
            String name) {
        this.stone = stoneFamily.getBaseBlock();
        this.stoneStairs = stoneFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.stoneSlab = stoneFamily.getVariant(BlockFamily.Variant.SLAB);
        this.stoneWall = stoneFamily.getVariant(BlockFamily.Variant.WALL);
        this.stoneButton = stoneFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.stonePressurePlate = stoneFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.stoneFamily = stoneFamily;

        this.mossyStone = mossyStoneFamily.getBaseBlock();
        this.mossyStoneStairs = mossyStoneFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyStoneSlab = mossyStoneFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyStoneWall = mossyStoneFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyStoneButton = mossyStoneFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.mossyStonePressurePlate = mossyStoneFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.mossyStoneFamily = mossyStoneFamily;

        this.overgrownStone = overgrownStoneFamily.getBaseBlock();
        this.overgrownStoneStairs = overgrownStoneFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownStoneSlab = overgrownStoneFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownStoneWall = overgrownStoneFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownStoneButton = overgrownStoneFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.overgrownStonePressurePlate = overgrownStoneFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.overgrownStoneFamily = overgrownStoneFamily;

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
        this.crackedCobbledBrick = crackedCobbledBrickFamily.getBaseBlock();
        this.crackedCobbledBrickStairs = crackedCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedCobbledBrickSlab = crackedCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedCobbledBrickWall = crackedCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedCobbledBrickFamily = crackedCobbledBrickFamily;

        this.mossyCobbledBrick = mossyCobbledBrickFamily.getBaseBlock();
        this.mossyCobbledBrickStairs = mossyCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyCobbledBrickSlab = mossyCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyCobbledBrickWall = mossyCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyCobbledBrickFamily = mossyCobbledBrickFamily;
        this.crackedMossyCobbledBrick = crackedMossyCobbledBrickFamily.getBaseBlock();
        this.crackedMossyCobbledBrickStairs = crackedMossyCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyCobbledBrickSlab = crackedMossyCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyCobbledBrickWall = crackedMossyCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyCobbledBrickFamily = crackedMossyCobbledBrickFamily;

        this.overgrownCobbledBrick = overgrownCobbledBrickFamily.getBaseBlock();
        this.overgrownCobbledBrickStairs = overgrownCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownCobbledBrickSlab = overgrownCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownCobbledBrickWall = overgrownCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownCobbledBrickFamily = overgrownCobbledBrickFamily;
        this.crackedOvergrownCobbledBrick = crackedOvergrownCobbledBrickFamily.getBaseBlock();
        this.crackedOvergrownCobbledBrickStairs = crackedOvergrownCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownCobbledBrickSlab = crackedOvergrownCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownCobbledBrickWall = crackedOvergrownCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownCobbledBrickFamily = crackedOvergrownCobbledBrickFamily;

        this.bronzeCobbledBrick = bronzeCobbledBrickFamily.getBaseBlock();
        this.bronzeCobbledBrickStairs = bronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.bronzeCobbledBrickSlab = bronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.bronzeCobbledBrickWall = bronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.bronzeCobbledBrickFamily = bronzeCobbledBrickFamily;
        this.crackedBronzeCobbledBrick = crackedBronzeCobbledBrickFamily.getBaseBlock();
        this.crackedBronzeCobbledBrickStairs = crackedBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedBronzeCobbledBrickSlab = crackedBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedBronzeCobbledBrickWall = crackedBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedBronzeCobbledBrickFamily = crackedBronzeCobbledBrickFamily;

        this.mossyBronzeCobbledBrick = mossyBronzeCobbledBrickFamily.getBaseBlock();
        this.mossyBronzeCobbledBrickStairs = mossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyBronzeCobbledBrickSlab = mossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyBronzeCobbledBrickWall = mossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyBronzeCobbledBrickFamily = mossyBronzeCobbledBrickFamily;
        this.crackedMossyBronzeCobbledBrick = crackedMossyBronzeCobbledBrickFamily.getBaseBlock();
        this.crackedMossyBronzeCobbledBrickStairs = crackedMossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyBronzeCobbledBrickSlab = crackedMossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyBronzeCobbledBrickWall = crackedMossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyBronzeCobbledBrickFamily = crackedMossyBronzeCobbledBrickFamily;

        this.overgrownBronzeCobbledBrick = overgrownBronzeCobbledBrickFamily.getBaseBlock();
        this.overgrownBronzeCobbledBrickStairs = overgrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownBronzeCobbledBrickSlab = overgrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownBronzeCobbledBrickWall = overgrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownBronzeCobbledBrickFamily = overgrownBronzeCobbledBrickFamily;
        this.crackedOvergrownBronzeCobbledBrick = crackedOvergrownBronzeCobbledBrickFamily.getBaseBlock();
        this.crackedOvergrownBronzeCobbledBrickStairs = crackedOvergrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownBronzeCobbledBrickSlab = crackedOvergrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownBronzeCobbledBrickWall = crackedOvergrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownBronzeCobbledBrickFamily = crackedOvergrownBronzeCobbledBrickFamily;

        this.silverCobbledBrick = silverCobbledBrickFamily.getBaseBlock();
        this.silverCobbledBrickStairs = silverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.silverCobbledBrickSlab = silverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.silverCobbledBrickWall = silverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.silverCobbledBrickFamily = silverCobbledBrickFamily;
        this.crackedSilverCobbledBrick = crackedSilverCobbledBrickFamily.getBaseBlock();
        this.crackedSilverCobbledBrickStairs = crackedSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedSilverCobbledBrickSlab = crackedSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedSilverCobbledBrickWall = crackedSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedSilverCobbledBrickFamily = crackedSilverCobbledBrickFamily;

        this.mossySilverCobbledBrick = mossySilverCobbledBrickFamily.getBaseBlock();
        this.mossySilverCobbledBrickStairs = mossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossySilverCobbledBrickSlab = mossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossySilverCobbledBrickWall = mossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossySilverCobbledBrickFamily = mossySilverCobbledBrickFamily;
        this.crackedMossySilverCobbledBrick = crackedMossySilverCobbledBrickFamily.getBaseBlock();
        this.crackedMossySilverCobbledBrickStairs = crackedMossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossySilverCobbledBrickSlab = crackedMossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossySilverCobbledBrickWall = crackedMossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossySilverCobbledBrickFamily = crackedMossySilverCobbledBrickFamily;

        this.overgrownSilverCobbledBrick = overgrownSilverCobbledBrickFamily.getBaseBlock();
        this.overgrownSilverCobbledBrickStairs = overgrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownSilverCobbledBrickSlab = overgrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownSilverCobbledBrickWall = overgrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownSilverCobbledBrickFamily = overgrownSilverCobbledBrickFamily;
        this.crackedOvergrownSilverCobbledBrick = crackedOvergrownSilverCobbledBrickFamily.getBaseBlock();
        this.crackedOvergrownSilverCobbledBrickStairs = crackedOvergrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownSilverCobbledBrickSlab = crackedOvergrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownSilverCobbledBrickWall = crackedOvergrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownSilverCobbledBrickFamily = crackedOvergrownSilverCobbledBrickFamily;

        this.goldCobbledBrick = goldCobbledBrickFamily.getBaseBlock();
        this.goldCobbledBrickStairs = goldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.goldCobbledBrickSlab = goldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.goldCobbledBrickWall = goldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.goldCobbledBrickFamily = goldCobbledBrickFamily;
        this.crackedGoldCobbledBrick = crackedGoldCobbledBrickFamily.getBaseBlock();
        this.crackedGoldCobbledBrickStairs = crackedGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedGoldCobbledBrickSlab = crackedGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedGoldCobbledBrickWall = crackedGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedGoldCobbledBrickFamily = crackedGoldCobbledBrickFamily;

        this.mossyGoldCobbledBrick = mossyGoldCobbledBrickFamily.getBaseBlock();
        this.mossyGoldCobbledBrickStairs = mossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyGoldCobbledBrickSlab = mossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyGoldCobbledBrickWall = mossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyGoldCobbledBrickFamily = mossyGoldCobbledBrickFamily;
        this.crackedMossyGoldCobbledBrick = crackedMossyGoldCobbledBrickFamily.getBaseBlock();
        this.crackedMossyGoldCobbledBrickStairs = crackedMossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyGoldCobbledBrickSlab = crackedMossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyGoldCobbledBrickWall = crackedMossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyGoldCobbledBrickFamily = crackedMossyGoldCobbledBrickFamily;

        this.overgrownGoldCobbledBrick = overgrownGoldCobbledBrickFamily.getBaseBlock();
        this.overgrownGoldCobbledBrickStairs = overgrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownGoldCobbledBrickSlab = overgrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownGoldCobbledBrickWall = overgrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownGoldCobbledBrickFamily = overgrownGoldCobbledBrickFamily;
        this.crackedOvergrownGoldCobbledBrick = crackedOvergrownGoldCobbledBrickFamily.getBaseBlock();
        this.crackedOvergrownGoldCobbledBrickStairs = crackedOvergrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownGoldCobbledBrickSlab = crackedOvergrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownGoldCobbledBrickWall = crackedOvergrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownGoldCobbledBrickFamily = crackedOvergrownGoldCobbledBrickFamily;

        this.smooth = smooth;
        this.smoothSlab = smoothSlab;
        this.crackedSmooth = crackedSmooth;
        this.crackedSmoothSlab = crackedSmoothSlab;

        this.mossySmooth = mossySmooth;
        this.mossySmoothSlab = mossySmoothSlab;
        this.crackedMossySmooth = crackedMossySmooth;
        this.crackedMossySmoothSlab = crackedMossySmoothSlab;

        this.overgrownSmooth = overgrownSmooth;
        this.overgrownSmoothSlab = overgrownSmoothSlab;
        this.crackedOvergrownSmooth = crackedOvergrownSmooth;
        this.crackedOvergrownSmoothSlab = crackedOvergrownSmoothSlab;

        this.bronzeSmooth = bronzeSmooth;
        this.bronzeSmoothSlab = bronzeSmoothSlab;
        this.crackedBronzeSmooth = crackedBronzeSmooth;
        this.crackedBronzeSmoothSlab = crackedBronzeSmoothSlab;

        this.mossyBronzeSmooth = mossyBronzeSmooth;
        this.mossyBronzeSmoothSlab = mossyBronzeSmoothSlab;
        this.crackedMossyBronzeSmooth = crackedMossyBronzeSmooth;
        this.crackedMossyBronzeSmoothSlab = crackedMossyBronzeSmoothSlab;

        this.overgrownBronzeSmooth = overgrownBronzeSmooth;
        this.overgrownBronzeSmoothSlab = overgrownBronzeSmoothSlab;
        this.crackedOvergrownBronzeSmooth = crackedOvergrownBronzeSmooth;
        this.crackedOvergrownBronzeSmoothSlab = crackedOvergrownBronzeSmoothSlab;

        this.silverSmooth = silverSmooth;
        this.silverSmoothSlab = silverSmoothSlab;
        this.crackedSilverSmooth = crackedSilverSmooth;
        this.crackedSilverSmoothSlab = crackedSilverSmoothSlab;

        this.mossySilverSmooth = mossySilverSmooth;
        this.mossySilverSmoothSlab = mossySilverSmoothSlab;
        this.crackedMossySilverSmooth = crackedMossySilverSmooth;
        this.crackedMossySilverSmoothSlab = crackedMossySilverSmoothSlab;

        this.overgrownSilverSmooth = overgrownSilverSmooth;
        this.overgrownSilverSmoothSlab = overgrownSilverSmoothSlab;
        this.crackedOvergrownSilverSmooth = crackedOvergrownSilverSmooth;
        this.crackedOvergrownSilverSmoothSlab = crackedOvergrownSilverSmoothSlab;

        this.goldSmooth = goldSmooth;
        this.goldSmoothSlab = goldSmoothSlab;
        this.crackedGoldSmooth = crackedGoldSmooth;
        this.crackedGoldSmoothSlab = crackedGoldSmoothSlab;

        this.mossyGoldSmooth = mossyGoldSmooth;
        this.mossyGoldSmoothSlab = mossyGoldSmoothSlab;
        this.crackedMossyGoldSmooth = crackedMossyGoldSmooth;
        this.crackedMossyGoldSmoothSlab = crackedMossyGoldSmoothSlab;

        this.overgrownGoldSmooth = overgrownGoldSmooth;
        this.overgrownGoldSmoothSlab = overgrownGoldSmoothSlab;
        this.crackedOvergrownGoldSmooth = crackedOvergrownGoldSmooth;
        this.crackedOvergrownGoldSmoothSlab = crackedOvergrownGoldSmoothSlab;

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
        this.overgrownBrickFamily = overgrownBrickFamily;
        this.crackedOvergrownBrick = crackedOvergrownBrickFamily.getBaseBlock();
        this.crackedOvergrownBrickStairs = crackedOvergrownBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownBrickSlab = crackedOvergrownBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownBrickWall = crackedOvergrownBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownBrickFamily = crackedOvergrownBrickFamily;

        this.bronzeBrick = bronzeBrickFamily.getBaseBlock();
        this.bronzeBrickStairs = bronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.bronzeBrickSlab = bronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.bronzeBrickWall = bronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.bronzeBrickFamily = bronzeBrickFamily;
        this.crackedBronzeBrick = crackedBronzeBrickFamily.getBaseBlock();
        this.crackedBronzeBrickStairs = crackedBronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedBronzeBrickSlab = crackedBronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedBronzeBrickWall = crackedBronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedBronzeBrickFamily = crackedBronzeBrickFamily;

        this.mossyBronzeBrick = mossyBronzeBrickFamily.getBaseBlock();
        this.mossyBronzeBrickStairs = mossyBronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyBronzeBrickSlab = mossyBronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyBronzeBrickWall = mossyBronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyBronzeBrickFamily = mossyBronzeBrickFamily;
        this.crackedMossyBronzeBrick = crackedMossyBronzeBrickFamily.getBaseBlock();
        this.crackedMossyBronzeBrickStairs = crackedMossyBronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyBronzeBrickSlab = crackedMossyBronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyBronzeBrickWall = crackedMossyBronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyBronzeBrickFamily = crackedMossyBronzeBrickFamily;

        this.overgrownBronzeBrick = overgrownBronzeBrickFamily.getBaseBlock();
        this.overgrownBronzeBrickStairs = overgrownBronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownBronzeBrickSlab = overgrownBronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownBronzeBrickWall = overgrownBronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownBronzeBrickFamily = overgrownBronzeBrickFamily;
        this.crackedOvergrownBronzeBrick = crackedOvergrownBronzeBrickFamily.getBaseBlock();
        this.crackedOvergrownBronzeBrickStairs = crackedOvergrownBronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownBronzeBrickSlab = crackedOvergrownBronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownBronzeBrickWall = crackedOvergrownBronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownBronzeBrickFamily = crackedOvergrownBronzeBrickFamily;

        this.silverBrick = silverBrickFamily.getBaseBlock();
        this.silverBrickStairs = silverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.silverBrickSlab = silverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.silverBrickWall = silverBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.silverBrickFamily = silverBrickFamily;
        this.crackedSilverBrick = crackedSilverBrickFamily.getBaseBlock();
        this.crackedSilverBrickStairs = crackedSilverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedSilverBrickSlab = crackedSilverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedSilverBrickWall = crackedSilverBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedSilverBrickFamily = crackedSilverBrickFamily;

        this.mossySilverBrick = mossySilverBrickFamily.getBaseBlock();
        this.mossySilverBrickStairs = mossySilverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossySilverBrickSlab = mossySilverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossySilverBrickWall = mossySilverBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossySilverBrickFamily = mossySilverBrickFamily;
        this.crackedMossySilverBrick = crackedMossySilverBrickFamily.getBaseBlock();
        this.crackedMossySilverBrickStairs = crackedMossySilverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossySilverBrickSlab = crackedMossySilverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossySilverBrickWall = crackedMossySilverBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossySilverBrickFamily = crackedMossySilverBrickFamily;

        this.overgrownSilverBrick = overgrownSilverBrickFamily.getBaseBlock();
        this.overgrownSilverBrickStairs = overgrownSilverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownSilverBrickSlab = overgrownSilverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownSilverBrickWall = overgrownSilverBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownSilverBrickFamily = overgrownSilverBrickFamily;
        this.crackedOvergrownSilverBrick = crackedOvergrownSilverBrickFamily.getBaseBlock();
        this.crackedOvergrownSilverBrickStairs = crackedOvergrownSilverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownSilverBrickSlab = crackedOvergrownSilverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownSilverBrickWall = crackedOvergrownSilverBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownSilverBrickFamily = crackedOvergrownSilverBrickFamily;

        this.goldBrick = goldBrickFamily.getBaseBlock();
        this.goldBrickStairs = goldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.goldBrickSlab = goldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.goldBrickWall = goldBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.goldBrickFamily = goldBrickFamily;
        this.crackedGoldBrick = crackedGoldBrickFamily.getBaseBlock();
        this.crackedGoldBrickStairs = crackedGoldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedGoldBrickSlab = crackedGoldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedGoldBrickWall = crackedGoldBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedGoldBrickFamily = crackedGoldBrickFamily;

        this.mossyGoldBrick = mossyGoldBrickFamily.getBaseBlock();
        this.mossyGoldBrickStairs = mossyGoldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyGoldBrickSlab = mossyGoldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyGoldBrickWall = mossyGoldBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyGoldBrickFamily = mossyGoldBrickFamily;
        this.crackedMossyGoldBrick = crackedMossyGoldBrickFamily.getBaseBlock();
        this.crackedMossyGoldBrickStairs = crackedMossyGoldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyGoldBrickSlab = crackedMossyGoldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyGoldBrickWall = crackedMossyGoldBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyGoldBrickFamily = crackedMossyGoldBrickFamily;

        this.overgrownGoldBrick = overgrownGoldBrickFamily.getBaseBlock();
        this.overgrownGoldBrickStairs = overgrownGoldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownGoldBrickSlab = overgrownGoldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownGoldBrickWall = overgrownGoldBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownGoldBrickFamily = overgrownGoldBrickFamily;
        this.crackedOvergrownGoldBrick = crackedOvergrownGoldBrickFamily.getBaseBlock();
        this.crackedOvergrownGoldBrickStairs = crackedOvergrownGoldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownGoldBrickSlab = crackedOvergrownGoldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownGoldBrickWall = crackedOvergrownGoldBrickFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownGoldBrickFamily = crackedOvergrownGoldBrickFamily;

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

        this.bronzeTiles = bronzeTilesFamily.getBaseBlock();
        this.bronzeTilesStairs = bronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.bronzeTilesSlab = bronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.bronzeTilesWall = bronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.bronzeTilesFamily = bronzeTilesFamily;
        this.crackedBronzeTiles = crackedBronzeTilesFamily.getBaseBlock();
        this.crackedBronzeTilesStairs = crackedBronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedBronzeTilesSlab = crackedBronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedBronzeTilesWall = crackedBronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedBronzeTilesFamily = crackedBronzeTilesFamily;

        this.mossyBronzeTiles = mossyBronzeTilesFamily.getBaseBlock();
        this.mossyBronzeTilesStairs = mossyBronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyBronzeTilesSlab = mossyBronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyBronzeTilesWall = mossyBronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyBronzeTilesFamily = mossyBronzeTilesFamily;
        this.crackedMossyBronzeTiles = crackedMossyBronzeTilesFamily.getBaseBlock();
        this.crackedMossyBronzeTilesStairs = crackedMossyBronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyBronzeTilesSlab = crackedMossyBronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyBronzeTilesWall = crackedMossyBronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyBronzeTilesFamily = crackedMossyBronzeTilesFamily;

        this.overgrownBronzeTiles = overgrownBronzeTilesFamily.getBaseBlock();
        this.overgrownBronzeTilesStairs = overgrownBronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownBronzeTilesSlab = overgrownBronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownBronzeTilesWall = overgrownBronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownBronzeTilesFamily = overgrownBronzeTilesFamily;
        this.crackedOvergrownBronzeTiles = crackedOvergrownBronzeTilesFamily.getBaseBlock();
        this.crackedOvergrownBronzeTilesStairs = crackedOvergrownBronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownBronzeTilesSlab = crackedOvergrownBronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownBronzeTilesWall = crackedOvergrownBronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownBronzeTilesFamily = crackedOvergrownBronzeTilesFamily;

        this.silverTiles = silverTilesFamily.getBaseBlock();
        this.silverTilesStairs = silverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.silverTilesSlab = silverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.silverTilesWall = silverTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.silverTilesFamily = silverTilesFamily;
        this.crackedSilverTiles = crackedSilverTilesFamily.getBaseBlock();
        this.crackedSilverTilesStairs = crackedSilverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedSilverTilesSlab = crackedSilverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedSilverTilesWall = crackedSilverTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedSilverTilesFamily = crackedSilverTilesFamily;

        this.mossySilverTiles = mossySilverTilesFamily.getBaseBlock();
        this.mossySilverTilesStairs = mossySilverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossySilverTilesSlab = mossySilverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossySilverTilesWall = mossySilverTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossySilverTilesFamily = mossySilverTilesFamily;
        this.crackedMossySilverTiles = crackedMossySilverTilesFamily.getBaseBlock();
        this.crackedMossySilverTilesStairs = crackedMossySilverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossySilverTilesSlab = crackedMossySilverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossySilverTilesWall = crackedMossySilverTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossySilverTilesFamily = crackedMossySilverTilesFamily;

        this.overgrownSilverTiles = overgrownSilverTilesFamily.getBaseBlock();
        this.overgrownSilverTilesStairs = overgrownSilverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownSilverTilesSlab = overgrownSilverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownSilverTilesWall = overgrownSilverTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownSilverTilesFamily = overgrownSilverTilesFamily;
        this.crackedOvergrownSilverTiles = crackedOvergrownSilverTilesFamily.getBaseBlock();
        this.crackedOvergrownSilverTilesStairs = crackedOvergrownSilverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownSilverTilesSlab = crackedOvergrownSilverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownSilverTilesWall = crackedOvergrownSilverTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownSilverTilesFamily = crackedOvergrownSilverTilesFamily;

        this.goldTiles = goldTilesFamily.getBaseBlock();
        this.goldTilesStairs = goldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.goldTilesSlab = goldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.goldTilesWall = goldTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.goldTilesFamily = goldTilesFamily;
        this.crackedGoldTiles = crackedGoldTilesFamily.getBaseBlock();
        this.crackedGoldTilesStairs = crackedGoldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedGoldTilesSlab = crackedGoldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedGoldTilesWall = crackedGoldTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedGoldTilesFamily = crackedGoldTilesFamily;

        this.mossyGoldTiles = mossyGoldTilesFamily.getBaseBlock();
        this.mossyGoldTilesStairs = mossyGoldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyGoldTilesSlab = mossyGoldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyGoldTilesWall = mossyGoldTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyGoldTilesFamily = mossyGoldTilesFamily;
        this.crackedMossyGoldTiles = crackedMossyGoldTilesFamily.getBaseBlock();
        this.crackedMossyGoldTilesStairs = crackedMossyGoldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyGoldTilesSlab = crackedMossyGoldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyGoldTilesWall = crackedMossyGoldTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyGoldTilesFamily = crackedMossyGoldTilesFamily;

        this.overgrownGoldTiles = overgrownGoldTilesFamily.getBaseBlock();
        this.overgrownGoldTilesStairs = overgrownGoldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownGoldTilesSlab = overgrownGoldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownGoldTilesWall = overgrownGoldTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownGoldTilesFamily = overgrownGoldTilesFamily;
        this.crackedOvergrownGoldTiles = crackedOvergrownGoldTilesFamily.getBaseBlock();
        this.crackedOvergrownGoldTilesStairs = crackedOvergrownGoldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownGoldTilesSlab = crackedOvergrownGoldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownGoldTilesWall = crackedOvergrownGoldTilesFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownGoldTilesFamily = crackedOvergrownGoldTilesFamily;

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

        this.bronzePillar = bronzePillar;
        this.bronzePillarSlab = bronzePillarSlab;
        this.crackedBronzePillar = crackedBronzePillar;
        this.crackedBronzePillarSlab = crackedBronzePillarSlab;

        this.mossyBronzePillar = mossyBronzePillar;
        this.mossyBronzePillarSlab = mossyBronzePillarSlab;
        this.crackedMossyBronzePillar = crackedMossyBronzePillar;
        this.crackedMossyBronzePillarSlab = crackedMossyBronzePillarSlab;

        this.overgrownBronzePillar = overgrownBronzePillar;
        this.overgrownBronzePillarSlab = overgrownBronzePillarSlab;
        this.crackedOvergrownBronzePillar = crackedOvergrownBronzePillar;
        this.crackedOvergrownBronzePillarSlab = crackedOvergrownBronzePillarSlab;

        this.silverPillar = silverPillar;
        this.silverPillarSlab = silverPillarSlab;
        this.crackedSilverPillar = crackedSilverPillar;
        this.crackedSilverPillarSlab = crackedSilverPillarSlab;

        this.mossySilverPillar = mossySilverPillar;
        this.mossySilverPillarSlab = mossySilverPillarSlab;
        this.crackedMossySilverPillar = crackedMossySilverPillar;
        this.crackedMossySilverPillarSlab = crackedMossySilverPillarSlab;

        this.overgrownSilverPillar = overgrownSilverPillar;
        this.overgrownSilverPillarSlab = overgrownSilverPillarSlab;
        this.crackedOvergrownSilverPillar = crackedOvergrownSilverPillar;
        this.crackedOvergrownSilverPillarSlab = crackedOvergrownSilverPillarSlab;

        this.goldPillar = goldPillar;
        this.goldPillarSlab = goldPillarSlab;
        this.crackedGoldPillar = crackedGoldPillar;
        this.crackedGoldPillarSlab = crackedGoldPillarSlab;

        this.mossyGoldPillar = mossyGoldPillar;
        this.mossyGoldPillarSlab = mossyGoldPillarSlab;
        this.crackedMossyGoldPillar = crackedMossyGoldPillar;
        this.crackedMossyGoldPillarSlab = crackedMossyGoldPillarSlab;

        this.overgrownGoldPillar = overgrownGoldPillar;
        this.overgrownGoldPillarSlab = overgrownGoldPillarSlab;
        this.crackedOvergrownGoldPillar = crackedOvergrownGoldPillar;
        this.crackedOvergrownGoldPillarSlab = crackedOvergrownGoldPillarSlab;

        this.pavement = pavementFamily.getBaseBlock();
        this.pavementStairs = pavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.pavementSlab = pavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.pavementFamily = pavementFamily;
        this.crackedPavement = crackedPavementFamily.getBaseBlock();
        this.crackedPavementStairs = crackedPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedPavementSlab = crackedPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedPavementFamily = crackedPavementFamily;

        this.mossyPavement = mossyPavementFamily.getBaseBlock();
        this.mossyPavementStairs = mossyPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyPavementSlab = mossyPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyPavementFamily = mossyPavementFamily;
        this.crackedMossyPavement = crackedMossyPavementFamily.getBaseBlock();
        this.crackedMossyPavementStairs = crackedMossyPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyPavementSlab = crackedMossyPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyPavementFamily = crackedMossyPavementFamily;

        this.overgrownPavement = overgrownPavementFamily.getBaseBlock();
        this.overgrownPavementStairs = overgrownPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownPavementSlab = overgrownPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownPavementFamily = overgrownPavementFamily;
        this.crackedOvergrownPavement = crackedOvergrownPavementFamily.getBaseBlock();
        this.crackedOvergrownPavementStairs = crackedOvergrownPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownPavementSlab = crackedOvergrownPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownPavementFamily = crackedOvergrownPavementFamily;

        this.bronzePavement = bronzePavementFamily.getBaseBlock();
        this.bronzePavementStairs = bronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.bronzePavementSlab = bronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.bronzePavementFamily = bronzePavementFamily;
        this.crackedBronzePavement = crackedBronzePavementFamily.getBaseBlock();
        this.crackedBronzePavementStairs = crackedBronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedBronzePavementSlab = crackedBronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedBronzePavementFamily = crackedBronzePavementFamily;

        this.mossyBronzePavement = mossyBronzePavementFamily.getBaseBlock();
        this.mossyBronzePavementStairs = mossyBronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyBronzePavementSlab = mossyBronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyBronzePavementFamily = mossyBronzePavementFamily;
        this.crackedMossyBronzePavement = crackedMossyBronzePavementFamily.getBaseBlock();
        this.crackedMossyBronzePavementStairs = crackedMossyBronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyBronzePavementSlab = crackedMossyBronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyBronzePavementFamily = crackedMossyBronzePavementFamily;

        this.overgrownBronzePavement = overgrownBronzePavementFamily.getBaseBlock();
        this.overgrownBronzePavementStairs = overgrownBronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownBronzePavementSlab = overgrownBronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownBronzePavementFamily = overgrownBronzePavementFamily;
        this.crackedOvergrownBronzePavement = crackedOvergrownBronzePavementFamily.getBaseBlock();
        this.crackedOvergrownBronzePavementStairs = crackedOvergrownBronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownBronzePavementSlab = crackedOvergrownBronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownBronzePavementFamily = crackedOvergrownBronzePavementFamily;

        this.silverPavement = silverPavementFamily.getBaseBlock();
        this.silverPavementStairs = silverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.silverPavementSlab = silverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.silverPavementFamily = silverPavementFamily;
        this.crackedSilverPavement = crackedSilverPavementFamily.getBaseBlock();
        this.crackedSilverPavementStairs = crackedSilverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedSilverPavementSlab = crackedSilverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedSilverPavementFamily = crackedSilverPavementFamily;

        this.mossySilverPavement = mossySilverPavementFamily.getBaseBlock();
        this.mossySilverPavementStairs = mossySilverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossySilverPavementSlab = mossySilverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossySilverPavementFamily = mossySilverPavementFamily;
        this.crackedMossySilverPavement = crackedMossySilverPavementFamily.getBaseBlock();
        this.crackedMossySilverPavementStairs = crackedMossySilverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossySilverPavementSlab = crackedMossySilverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossySilverPavementFamily = crackedMossySilverPavementFamily;

        this.overgrownSilverPavement = overgrownSilverPavementFamily.getBaseBlock();
        this.overgrownSilverPavementStairs = overgrownSilverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownSilverPavementSlab = overgrownSilverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownSilverPavementFamily = overgrownSilverPavementFamily;
        this.crackedOvergrownSilverPavement = crackedOvergrownSilverPavementFamily.getBaseBlock();
        this.crackedOvergrownSilverPavementStairs = crackedOvergrownSilverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownSilverPavementSlab = crackedOvergrownSilverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownSilverPavementFamily = crackedOvergrownSilverPavementFamily;

        this.goldPavement = goldPavementFamily.getBaseBlock();
        this.goldPavementStairs = goldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.goldPavementSlab = goldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.goldPavementFamily = goldPavementFamily;
        this.crackedGoldPavement = crackedGoldPavementFamily.getBaseBlock();
        this.crackedGoldPavementStairs = crackedGoldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedGoldPavementSlab = crackedGoldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedGoldPavementFamily = crackedGoldPavementFamily;

        this.mossyGoldPavement = mossyGoldPavementFamily.getBaseBlock();
        this.mossyGoldPavementStairs = mossyGoldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyGoldPavementSlab = mossyGoldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyGoldPavementFamily = mossyGoldPavementFamily;
        this.crackedMossyGoldPavement = crackedMossyGoldPavementFamily.getBaseBlock();
        this.crackedMossyGoldPavementStairs = crackedMossyGoldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyGoldPavementSlab = crackedMossyGoldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyGoldPavementFamily = crackedMossyGoldPavementFamily;

        this.overgrownGoldPavement = overgrownGoldPavementFamily.getBaseBlock();
        this.overgrownGoldPavementStairs = overgrownGoldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownGoldPavementSlab = overgrownGoldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownGoldPavementFamily = overgrownGoldPavementFamily;
        this.crackedOvergrownGoldPavement = crackedOvergrownGoldPavementFamily.getBaseBlock();
        this.crackedOvergrownGoldPavementStairs = crackedOvergrownGoldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownGoldPavementSlab = crackedOvergrownGoldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownGoldPavementFamily = crackedOvergrownGoldPavementFamily;

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

        this.bronzeFancyBricks = bronzeFancyBricksFamily.getBaseBlock();
        this.bronzeFancyBrickStairs = bronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.bronzeFancyBrickSlab = bronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.bronzeFancyBrickWall = bronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.bronzeFancyBricksFamily = bronzeFancyBricksFamily;
        this.crackedBronzeFancyBricks = crackedBronzeFancyBricksFamily.getBaseBlock();
        this.crackedBronzeFancyBricksStairs = crackedBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedBronzeFancyBricksSlab = crackedBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedBronzeFancyBricksWall = crackedBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedBronzeFancyBricksFamily = crackedBronzeFancyBricksFamily;

        this.mossyBronzeFancyBricks = mossyBronzeFancyBricksFamily.getBaseBlock();
        this.mossyBronzeFancyBrickStairs = mossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyBronzeFancyBrickSlab = mossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyBronzeFancyBrickWall = mossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyBronzeFancyBricksFamily = mossyBronzeFancyBricksFamily;
        this.crackedMossyBronzeFancyBricks = crackedMossyBronzeFancyBricksFamily.getBaseBlock();
        this.crackedMossyBronzeFancyBricksStairs = crackedMossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyBronzeFancyBricksSlab = crackedMossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyBronzeFancyBricksWall = crackedMossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyBronzeFancyBricksFamily = crackedMossyBronzeFancyBricksFamily;

        this.overgrownBronzeFancyBricks = overgrownBronzeFancyBricksFamily.getBaseBlock();
        this.overgrownBronzeFancyBrickStairs = overgrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownBronzeFancyBrickSlab = overgrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownBronzeFancyBrickWall = overgrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownBronzeFancyBricksFamily = overgrownBronzeFancyBricksFamily;
        this.crackedOvergrownBronzeFancyBricks = crackedOvergrownBronzeFancyBricksFamily.getBaseBlock();
        this.crackedOvergrownBronzeFancyBricksStairs = crackedOvergrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownBronzeFancyBricksSlab = crackedOvergrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownBronzeFancyBricksWall = crackedOvergrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownBronzeFancyBricksFamily = crackedOvergrownBronzeFancyBricksFamily;

        this.silverFancyBricks = silverFancyBricksFamily.getBaseBlock();
        this.silverFancyBrickStairs = silverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.silverFancyBrickSlab = silverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.silverFancyBrickWall = silverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.silverFancyBricksFamily = silverFancyBricksFamily;
        this.crackedSilverFancyBricks = crackedSilverFancyBricksFamily.getBaseBlock();
        this.crackedSilverFancyBricksStairs = crackedSilverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedSilverFancyBricksSlab = crackedSilverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedSilverFancyBricksWall = crackedSilverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedSilverFancyBricksFamily = crackedSilverFancyBricksFamily;

        this.mossySilverFancyBricks = mossySilverFancyBricksFamily.getBaseBlock();
        this.mossySilverFancyBrickStairs = mossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossySilverFancyBrickSlab = mossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossySilverFancyBrickWall = mossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossySilverFancyBricksFamily = mossySilverFancyBricksFamily;
        this.crackedMossySilverFancyBricks = crackedMossySilverFancyBricksFamily.getBaseBlock();
        this.crackedMossySilverFancyBricksStairs = crackedMossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossySilverFancyBricksSlab = crackedMossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossySilverFancyBricksWall = crackedMossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossySilverFancyBricksFamily = crackedMossySilverFancyBricksFamily;

        this.overgrownSilverFancyBricks = overgrownSilverFancyBricksFamily.getBaseBlock();
        this.overgrownSilverFancyBrickStairs = overgrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownSilverFancyBrickSlab = overgrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownSilverFancyBrickWall = overgrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownSilverFancyBricksFamily = overgrownSilverFancyBricksFamily;
        this.crackedOvergrownSilverFancyBricks = crackedOvergrownSilverFancyBricksFamily.getBaseBlock();
        this.crackedOvergrownSilverFancyBricksStairs = crackedOvergrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownSilverFancyBricksSlab = crackedOvergrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownSilverFancyBricksWall = crackedOvergrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownSilverFancyBricksFamily = crackedOvergrownSilverFancyBricksFamily;

        this.goldFancyBricks = goldFancyBricksFamily.getBaseBlock();
        this.goldFancyBrickStairs = goldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.goldFancyBrickSlab = goldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.goldFancyBrickWall = goldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.goldFancyBricksFamily = goldFancyBricksFamily;
        this.crackedGoldFancyBricks = crackedGoldFancyBricksFamily.getBaseBlock();
        this.crackedGoldFancyBricksStairs = crackedGoldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedGoldFancyBricksSlab = crackedGoldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedGoldFancyBricksWall = crackedGoldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedGoldFancyBricksFamily = crackedGoldFancyBricksFamily;

        this.mossyGoldFancyBricks = mossyGoldFancyBricksFamily.getBaseBlock();
        this.mossyGoldFancyBrickStairs = mossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.mossyGoldFancyBrickSlab = mossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.mossyGoldFancyBrickWall = mossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.mossyGoldFancyBricksFamily = mossyGoldFancyBricksFamily;
        this.crackedMossyGoldFancyBricks = crackedMossyGoldFancyBricksFamily.getBaseBlock();
        this.crackedMossyGoldFancyBricksStairs = crackedMossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedMossyGoldFancyBricksSlab = crackedMossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedMossyGoldFancyBricksWall = crackedMossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedMossyGoldFancyBricksFamily = crackedMossyGoldFancyBricksFamily;

        this.overgrownGoldFancyBricks = overgrownGoldFancyBricksFamily.getBaseBlock();
        this.overgrownGoldFancyBrickStairs = overgrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.overgrownGoldFancyBrickSlab = overgrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.overgrownGoldFancyBrickWall = overgrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.overgrownGoldFancyBricksFamily = overgrownGoldFancyBricksFamily;
        this.crackedOvergrownGoldFancyBricks = crackedOvergrownGoldFancyBricksFamily.getBaseBlock();
        this.crackedOvergrownGoldFancyBricksStairs = crackedOvergrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.crackedOvergrownGoldFancyBricksSlab = crackedOvergrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.crackedOvergrownGoldFancyBricksWall = crackedOvergrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
        this.crackedOvergrownGoldFancyBricksFamily = crackedOvergrownGoldFancyBricksFamily;

        this.name = name;
    }

    /**
     * Returns a list of all the blocks for the LotR Stone Itemgroup
     *
     * @return a list of all the blocks
     */
    public @NotNull List<ItemStack> getLotRStoneItemGroupList() {
        List<ItemStack> itemGroupList = new ArrayList<>();

        itemGroupList.addAll(blockFamilyList(stoneFamily));
        itemGroupList.addAll(blockFamilyList(mossyStoneFamily));
        itemGroupList.addAll(blockFamilyList(overgrownStoneFamily));
        itemGroupList.addAll(blockFamilyList(cobbledFamily));
        itemGroupList.addAll(blockFamilyList(mossyCobbledFamily));
        itemGroupList.addAll(blockFamilyList(overgrownCobbledFamily));
        itemGroupList.addAll(blockFamilyList(cobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(mossyCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(overgrownCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(bronzeCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(mossyBronzeCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(overgrownBronzeCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedBronzeCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyBronzeCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownBronzeCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(silverCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(mossySilverCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(overgrownSilverCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedSilverCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossySilverCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownSilverCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(goldCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(mossyGoldCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(overgrownGoldCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedGoldCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyGoldCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownGoldCobbledBrickFamily));
        itemGroupList.addAll(blockFamilyList(brickFamily));
        itemGroupList.addAll(blockFamilyList(crackedBrickFamily));
        itemGroupList.addAll(blockFamilyList(mossyBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyBrickFamily));
        itemGroupList.addAll(blockFamilyList(overgrownBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownBrickFamily));
        itemGroupList.addAll(blockFamilyList(bronzeBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedBronzeBrickFamily));
        itemGroupList.addAll(blockFamilyList(mossyBronzeBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyBronzeBrickFamily));
        itemGroupList.addAll(blockFamilyList(overgrownBronzeBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownBronzeBrickFamily));
        itemGroupList.addAll(blockFamilyList(silverBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedSilverBrickFamily));
        itemGroupList.addAll(blockFamilyList(mossySilverBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossySilverBrickFamily));
        itemGroupList.addAll(blockFamilyList(overgrownSilverBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownSilverBrickFamily));
        itemGroupList.addAll(blockFamilyList(goldBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedGoldBrickFamily));
        itemGroupList.addAll(blockFamilyList(mossyGoldBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyGoldBrickFamily));
        itemGroupList.addAll(blockFamilyList(overgrownGoldBrickFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownGoldBrickFamily));
        itemGroupList.addAll(blockFamilyList(tilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedTilesFamily));
        itemGroupList.addAll(blockFamilyList(mossyTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyTilesFamily));
        itemGroupList.addAll(blockFamilyList(overgrownTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownTilesFamily));
        itemGroupList.addAll(blockFamilyList(bronzeTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedBronzeTilesFamily));
        itemGroupList.addAll(blockFamilyList(mossyBronzeTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyBronzeTilesFamily));
        itemGroupList.addAll(blockFamilyList(overgrownBronzeTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownBronzeTilesFamily));
        itemGroupList.addAll(blockFamilyList(silverTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedSilverTilesFamily));
        itemGroupList.addAll(blockFamilyList(mossySilverTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossySilverTilesFamily));
        itemGroupList.addAll(blockFamilyList(overgrownSilverTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownSilverTilesFamily));
        itemGroupList.addAll(blockFamilyList(goldTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedGoldTilesFamily));
        itemGroupList.addAll(blockFamilyList(mossyGoldTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyGoldTilesFamily));
        itemGroupList.addAll(blockFamilyList(overgrownGoldTilesFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownGoldTilesFamily));
        itemGroupList.addAll(blockFamilyList(fancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(mossyFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(overgrownFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(bronzeFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedBronzeFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(mossyBronzeFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyBronzeFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(overgrownBronzeFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownBronzeFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(silverFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedSilverFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(mossySilverFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossySilverFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(overgrownSilverFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownSilverFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(goldFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedGoldFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(mossyGoldFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyGoldFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(overgrownGoldFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownGoldFancyBricksFamily));
        itemGroupList.addAll(blockFamilyList(pavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedPavementFamily));
        itemGroupList.addAll(blockFamilyList(mossyPavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyPavementFamily));
        itemGroupList.addAll(blockFamilyList(overgrownPavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownPavementFamily));
        itemGroupList.addAll(blockFamilyList(bronzePavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedBronzePavementFamily));
        itemGroupList.addAll(blockFamilyList(mossyBronzePavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyBronzePavementFamily));
        itemGroupList.addAll(blockFamilyList(overgrownBronzePavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownBronzePavementFamily));
        itemGroupList.addAll(blockFamilyList(silverPavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedSilverPavementFamily));
        itemGroupList.addAll(blockFamilyList(mossySilverPavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossySilverPavementFamily));
        itemGroupList.addAll(blockFamilyList(overgrownSilverPavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownSilverPavementFamily));
        itemGroupList.addAll(blockFamilyList(goldPavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedGoldPavementFamily));
        itemGroupList.addAll(blockFamilyList(mossyGoldPavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedMossyGoldPavementFamily));
        itemGroupList.addAll(blockFamilyList(overgrownGoldPavementFamily));
        itemGroupList.addAll(blockFamilyList(crackedOvergrownGoldPavementFamily));

        if(smooth != null) {
            itemGroupList.add(new ItemStack(smooth));
            if(smoothSlab != null) {
                itemGroupList.add(new ItemStack(smoothSlab));
            }
            if(mossySmooth != null) {
                itemGroupList.add(new ItemStack(mossySmooth));
                if(mossySmoothSlab != null) {
                    itemGroupList.add(new ItemStack(mossySmoothSlab));
                }
            }
            if(overgrownSmooth != null) {
                itemGroupList.add(new ItemStack(overgrownSmooth));
                if(overgrownSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(overgrownSmoothSlab));
                }
            }
        }
        if(crackedSmooth != null) {
            itemGroupList.add(new ItemStack(crackedSmooth));
            if(crackedSmoothSlab != null) {
                itemGroupList.add(new ItemStack(crackedSmoothSlab));
            }
            if(crackedMossySmooth != null) {
                itemGroupList.add(new ItemStack(crackedMossySmooth));
                if(crackedMossySmoothSlab != null) {
                    itemGroupList.add(new ItemStack(crackedMossySmoothSlab));
                }
            }
            if(crackedOvergrownSmooth != null) {
                itemGroupList.add(new ItemStack(crackedOvergrownSmooth));
                if(crackedOvergrownSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(crackedOvergrownSmoothSlab));
                }
            }
        }
        if(bronzeSmooth != null) {
            itemGroupList.add(new ItemStack(bronzeSmooth));
            if(bronzeSmoothSlab != null) {
                itemGroupList.add(new ItemStack(bronzeSmoothSlab));
            }
            if(mossyBronzeSmooth != null) {
                itemGroupList.add(new ItemStack(mossyBronzeSmooth));
                if(mossyBronzeSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(mossyBronzeSmoothSlab));
                }
            }
            if(overgrownBronzeSmooth != null) {
                itemGroupList.add(new ItemStack(overgrownBronzeSmooth));
                if(overgrownBronzeSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(overgrownBronzeSmoothSlab));
                }
            }
        }
        if(crackedBronzeSmooth != null) {
            itemGroupList.add(new ItemStack(crackedBronzeSmooth));
            if(crackedBronzeSmoothSlab != null) {
                itemGroupList.add(new ItemStack(crackedBronzeSmoothSlab));
            }
            if(crackedMossyBronzeSmooth != null) {
                itemGroupList.add(new ItemStack(crackedMossyBronzeSmooth));
                if(crackedMossyBronzeSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(crackedMossyBronzeSmoothSlab));
                }
            }
            if(crackedOvergrownBronzeSmooth != null) {
                itemGroupList.add(new ItemStack(crackedOvergrownBronzeSmooth));
                if(crackedOvergrownBronzeSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(crackedOvergrownBronzeSmoothSlab));
                }
            }
        }
        if(silverSmooth != null) {
            itemGroupList.add(new ItemStack(silverSmooth));
            if(silverSmoothSlab != null) {
                itemGroupList.add(new ItemStack(silverSmoothSlab));
            }
            if(mossySilverSmooth != null) {
                itemGroupList.add(new ItemStack(mossySilverSmooth));
                if(mossySilverSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(mossySilverSmoothSlab));
                }
            }
            if(overgrownSilverSmooth != null) {
                itemGroupList.add(new ItemStack(overgrownSilverSmooth));
                if(overgrownSilverSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(overgrownSilverSmoothSlab));
                }
            }
        }
        if(crackedSilverSmooth != null) {
            itemGroupList.add(new ItemStack(crackedSilverSmooth));
            if(crackedSilverSmoothSlab != null) {
                itemGroupList.add(new ItemStack(crackedSilverSmoothSlab));
            }
            if(crackedMossySilverSmooth != null) {
                itemGroupList.add(new ItemStack(crackedMossySilverSmooth));
                if(crackedMossySilverSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(crackedMossySilverSmoothSlab));
                }
            }
            if(crackedOvergrownSilverSmooth != null) {
                itemGroupList.add(new ItemStack(crackedOvergrownSilverSmooth));
                if(crackedOvergrownSilverSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(crackedOvergrownSilverSmoothSlab));
                }
            }
        }
        if(goldSmooth != null) {
            itemGroupList.add(new ItemStack(goldSmooth));
            if(goldSmoothSlab != null) {
                itemGroupList.add(new ItemStack(goldSmoothSlab));
            }
            if(mossyGoldSmooth != null) {
                itemGroupList.add(new ItemStack(mossyGoldSmooth));
                if(mossyGoldSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(mossyGoldSmoothSlab));
                }
            }
            if(overgrownGoldSmooth != null) {
                itemGroupList.add(new ItemStack(overgrownGoldSmooth));
                if(overgrownGoldSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(overgrownGoldSmoothSlab));
                }
            }
        }
        if(crackedGoldSmooth != null) {
            itemGroupList.add(new ItemStack(crackedGoldSmooth));
            if(crackedGoldSmoothSlab != null) {
                itemGroupList.add(new ItemStack(crackedGoldSmoothSlab));
            }
            if(crackedMossyGoldSmooth != null) {
                itemGroupList.add(new ItemStack(crackedMossyGoldSmooth));
                if(crackedMossyGoldSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(crackedMossyGoldSmoothSlab));
                }
            }
            if(crackedOvergrownGoldSmooth != null) {
                itemGroupList.add(new ItemStack(crackedOvergrownGoldSmooth));
                if(crackedOvergrownGoldSmoothSlab != null) {
                    itemGroupList.add(new ItemStack(crackedOvergrownGoldSmoothSlab));
                }
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
        if(bronzePillar != null) {
            itemGroupList.add(new ItemStack(bronzePillar));
            if(bronzePillarSlab != null) {
                itemGroupList.add(new ItemStack(bronzePillarSlab));
            }
        }
        if(crackedBronzePillar != null) {
            itemGroupList.add(new ItemStack(crackedBronzePillar));
            if(crackedBronzePillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedBronzePillarSlab));
            }
        }
        if(mossyBronzePillar != null) {
            itemGroupList.add(new ItemStack(mossyBronzePillar));
            if(mossyBronzePillarSlab != null) {
                itemGroupList.add(new ItemStack(mossyBronzePillarSlab));
            }
        }
        if(crackedMossyBronzePillar != null) {
            itemGroupList.add(new ItemStack(crackedMossyBronzePillar));
            if(crackedMossyBronzePillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedMossyBronzePillarSlab));
            }
        }
        if(overgrownBronzePillar != null) {
            itemGroupList.add(new ItemStack(overgrownBronzePillar));
            if(overgrownBronzePillarSlab != null) {
                itemGroupList.add(new ItemStack(overgrownBronzePillarSlab));
            }
        }
        if(crackedOvergrownBronzePillar != null) {
            itemGroupList.add(new ItemStack(crackedOvergrownBronzePillar));
            if(crackedOvergrownBronzePillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedOvergrownBronzePillarSlab));
            }
        }
        if(silverPillar != null) {
            itemGroupList.add(new ItemStack(silverPillar));
            if(silverPillarSlab != null) {
                itemGroupList.add(new ItemStack(silverPillarSlab));
            }
        }
        if(crackedSilverPillar != null) {
            itemGroupList.add(new ItemStack(crackedSilverPillar));
            if(crackedSilverPillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedSilverPillarSlab));
            }
        }
        if(mossySilverPillar != null) {
            itemGroupList.add(new ItemStack(mossySilverPillar));
            if(mossySilverPillarSlab != null) {
                itemGroupList.add(new ItemStack(mossySilverPillarSlab));
            }
        }
        if(crackedMossySilverPillar != null) {
            itemGroupList.add(new ItemStack(crackedMossySilverPillar));
            if(crackedMossySilverPillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedMossySilverPillarSlab));
            }
        }
        if(overgrownSilverPillar != null) {
            itemGroupList.add(new ItemStack(overgrownSilverPillar));
            if(overgrownSilverPillarSlab != null) {
                itemGroupList.add(new ItemStack(overgrownSilverPillarSlab));
            }
        }
        if(crackedOvergrownSilverPillar != null) {
            itemGroupList.add(new ItemStack(crackedOvergrownSilverPillar));
            if(crackedOvergrownSilverPillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedOvergrownSilverPillarSlab));
            }
        }
        if(goldPillar != null) {
            itemGroupList.add(new ItemStack(goldPillar));
            if(goldPillarSlab != null) {
                itemGroupList.add(new ItemStack(goldPillarSlab));
            }
        }
        if(crackedGoldPillar != null) {
            itemGroupList.add(new ItemStack(crackedGoldPillar));
            if(crackedGoldPillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedGoldPillarSlab));
            }
        }
        if(mossyGoldPillar != null) {
            itemGroupList.add(new ItemStack(mossyGoldPillar));
            if(mossyGoldPillarSlab != null) {
                itemGroupList.add(new ItemStack(mossyGoldPillarSlab));
            }
        }
        if(crackedMossyGoldPillar != null) {
            itemGroupList.add(new ItemStack(crackedMossyGoldPillar));
            if(crackedMossyGoldPillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedMossyGoldPillarSlab));
            }
        }
        if(overgrownGoldPillar != null) {
            itemGroupList.add(new ItemStack(overgrownGoldPillar));
            if(overgrownGoldPillarSlab != null) {
                itemGroupList.add(new ItemStack(overgrownGoldPillarSlab));
            }
        }
        if(crackedOvergrownGoldPillar != null) {
            itemGroupList.add(new ItemStack(crackedOvergrownGoldPillar));
            if(crackedOvergrownGoldPillarSlab != null) {
                itemGroupList.add(new ItemStack(crackedOvergrownGoldPillarSlab));
            }
        }

        return itemGroupList;
    }

    /**
     * Returns a list of all the redstone-related blocks for the LotR Redstone Itemgroup.
     *
     * @return a list of all the redstone-related blocks
     */
    public @NotNull List<ItemStack> getRedstoneItemGroupList() {
        List<ItemStack> itemGroupList = new ArrayList<>();

        itemGroupList.add(new ItemStack(stoneButton));
        itemGroupList.add(new ItemStack(stonePressurePlate));
        itemGroupList.add(new ItemStack(mossyStoneButton));
        itemGroupList.add(new ItemStack(mossyStonePressurePlate));
		itemGroupList.add(new ItemStack(overgrownStoneButton));
		itemGroupList.add(new ItemStack(overgrownStonePressurePlate));
        itemGroupList.add(new ItemStack(cobbledButton));
        itemGroupList.add(new ItemStack(cobbledPressurePlate));
        itemGroupList.add(new ItemStack(mossyCobbledButton));
        itemGroupList.add(new ItemStack(mossyCobbledPressurePlate));
        itemGroupList.add(new ItemStack(overgrownCobbledButton));
        itemGroupList.add(new ItemStack(overgrownCobbledPressurePlate));

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

    /**
     * Returns a map of all pillar blocks associated with their respective stone type variants.
     *
     * @return a map where the keys are StoneTypeVariants and the values are the corresponding pillar blocks
     */
    public HashMap<StoneTypeVariants, Block> getPillarBlocks() {
        HashMap pillarBlocks = new HashMap();

        pillarBlocks.put(StoneTypeVariants.STONE, pillar);
        pillarBlocks.put(StoneTypeVariants.MOSSY_STONE, mossyPillar);
        pillarBlocks.put(StoneTypeVariants.OVERGROWN_STONE, overgrownPillar);
        pillarBlocks.put(StoneTypeVariants.BRONZE_STONE, bronzePillar);
        pillarBlocks.put(StoneTypeVariants.MOSSY_BRONZE_STONE, mossyBronzePillar);
        pillarBlocks.put(StoneTypeVariants.OVERGROWN_BRONZE_STONE, overgrownBronzePillar);
        pillarBlocks.put(StoneTypeVariants.SILVER_STONE, silverPillar);
        pillarBlocks.put(StoneTypeVariants.MOSSY_SILVER_STONE, mossySilverPillar);
        pillarBlocks.put(StoneTypeVariants.OVERGROWN_SILVER_STONE, overgrownSilverPillar);
        pillarBlocks.put(StoneTypeVariants.GOLD_STONE, goldPillar);
        pillarBlocks.put(StoneTypeVariants.MOSSY_GOLD_STONE, mossyGoldPillar);
        pillarBlocks.put(StoneTypeVariants.OVERGROWN_GOLD_STONE, overgrownGoldPillar);

        pillarBlocks.put(StoneTypeVariants.CRACKED_STONE, crackedPillar);
        pillarBlocks.put(StoneTypeVariants.CRACKED_MOSSY_STONE, crackedMossyPillar);
        pillarBlocks.put(StoneTypeVariants.CRACKED_OVERGROWN_STONE, crackedOvergrownPillar);
        pillarBlocks.put(StoneTypeVariants.CRACKED_BRONZE_STONE, crackedBronzePillar);
        pillarBlocks.put(StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, crackedMossyBronzePillar);
        pillarBlocks.put(StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, crackedOvergrownBronzePillar);
        pillarBlocks.put(StoneTypeVariants.CRACKED_SILVER_STONE, crackedSilverPillar);
        pillarBlocks.put(StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, crackedMossySilverPillar);
        pillarBlocks.put(StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, crackedOvergrownSilverPillar);
        pillarBlocks.put(StoneTypeVariants.CRACKED_GOLD_STONE, crackedGoldPillar);
        pillarBlocks.put(StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, crackedMossyGoldPillar);
        pillarBlocks.put(StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, crackedOvergrownGoldPillar);

        return pillarBlocks;
    }

    /**
     * Returns a map of all pillar slab blocks associated with their respective stone type variants.
     *
     * @return a map where the keys are StoneTypeVariants and the values are the corresponding pillar slab blocks
     */
    public HashMap<StoneTypeVariants, Block> getPillarSlabs() {
        HashMap pillarSlabs = new HashMap();

        pillarSlabs.put(StoneTypeVariants.STONE, pillarSlab);
        pillarSlabs.put(StoneTypeVariants.MOSSY_STONE, mossyPillarSlab);
        pillarSlabs.put(StoneTypeVariants.OVERGROWN_STONE, overgrownPillarSlab);
        pillarSlabs.put(StoneTypeVariants.BRONZE_STONE, bronzePillarSlab);
        pillarSlabs.put(StoneTypeVariants.MOSSY_BRONZE_STONE, mossyBronzePillarSlab);
        pillarSlabs.put(StoneTypeVariants.OVERGROWN_BRONZE_STONE, overgrownBronzePillarSlab);
        pillarSlabs.put(StoneTypeVariants.SILVER_STONE, silverPillarSlab);
        pillarSlabs.put(StoneTypeVariants.MOSSY_SILVER_STONE, mossySilverPillarSlab);
        pillarSlabs.put(StoneTypeVariants.OVERGROWN_SILVER_STONE, overgrownSilverPillarSlab);
        pillarSlabs.put(StoneTypeVariants.GOLD_STONE, goldPillarSlab);
        pillarSlabs.put(StoneTypeVariants.MOSSY_GOLD_STONE, mossyGoldPillarSlab);
        pillarSlabs.put(StoneTypeVariants.OVERGROWN_GOLD_STONE, overgrownGoldPillarSlab);

        pillarSlabs.put(StoneTypeVariants.CRACKED_STONE, crackedPillarSlab);
        pillarSlabs.put(StoneTypeVariants.CRACKED_MOSSY_STONE, crackedMossyPillarSlab);
        pillarSlabs.put(StoneTypeVariants.CRACKED_OVERGROWN_STONE, crackedOvergrownPillarSlab);
        pillarSlabs.put(StoneTypeVariants.CRACKED_BRONZE_STONE, crackedBronzePillarSlab);
        pillarSlabs.put(StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, crackedMossyBronzePillarSlab);
        pillarSlabs.put(StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, crackedOvergrownBronzePillarSlab);
        pillarSlabs.put(StoneTypeVariants.CRACKED_SILVER_STONE, crackedSilverPillarSlab);
        pillarSlabs.put(StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, crackedMossySilverPillarSlab);
        pillarSlabs.put(StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, crackedOvergrownSilverPillarSlab);
        pillarSlabs.put(StoneTypeVariants.CRACKED_GOLD_STONE, crackedGoldPillarSlab);
        pillarSlabs.put(StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, crackedMossyGoldPillarSlab);
        pillarSlabs.put(StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, crackedOvergrownGoldPillarSlab);

        return pillarSlabs;
    }

    /**
     * Returns a map of all smooth stone blocks associated with their respective stone type variants.
     *
     * @return a map where the keys are StoneTypeVariants and the values are the corresponding smooth stone blocks
     */
    public HashMap<StoneTypeVariants, Block> getSmoothStone() {
        HashMap smoothStones = new HashMap();

        smoothStones.put(StoneTypeVariants.STONE, smooth);
        smoothStones.put(StoneTypeVariants.MOSSY_STONE, mossySmooth);
        smoothStones.put(StoneTypeVariants.OVERGROWN_STONE, overgrownSmooth);
        smoothStones.put(StoneTypeVariants.BRONZE_STONE, bronzeSmooth);
        smoothStones.put(StoneTypeVariants.MOSSY_BRONZE_STONE, mossyBronzeSmooth);
        smoothStones.put(StoneTypeVariants.OVERGROWN_BRONZE_STONE, overgrownBronzeSmooth);
        smoothStones.put(StoneTypeVariants.SILVER_STONE, silverSmooth);
        smoothStones.put(StoneTypeVariants.MOSSY_SILVER_STONE, mossySilverSmooth);
        smoothStones.put(StoneTypeVariants.OVERGROWN_SILVER_STONE, overgrownSilverSmooth);
        smoothStones.put(StoneTypeVariants.GOLD_STONE, goldSmooth);
        smoothStones.put(StoneTypeVariants.MOSSY_GOLD_STONE, mossyGoldSmooth);
        smoothStones.put(StoneTypeVariants.OVERGROWN_GOLD_STONE, overgrownGoldSmooth);

        smoothStones.put(StoneTypeVariants.CRACKED_STONE, crackedSmooth);
        smoothStones.put(StoneTypeVariants.CRACKED_MOSSY_STONE, crackedMossySmooth);
        smoothStones.put(StoneTypeVariants.CRACKED_OVERGROWN_STONE, crackedOvergrownSmooth);
        smoothStones.put(StoneTypeVariants.CRACKED_BRONZE_STONE, crackedBronzeSmooth);
        smoothStones.put(StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, crackedMossyBronzeSmooth);
        smoothStones.put(StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, crackedOvergrownBronzeSmooth);
        smoothStones.put(StoneTypeVariants.CRACKED_SILVER_STONE, crackedSilverSmooth);
        smoothStones.put(StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, crackedMossySilverSmooth);
        smoothStones.put(StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, crackedOvergrownSilverSmooth);
        smoothStones.put(StoneTypeVariants.CRACKED_GOLD_STONE, crackedGoldSmooth);
        smoothStones.put(StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, crackedMossyGoldSmooth);
        smoothStones.put(StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, crackedOvergrownGoldSmooth);

        return smoothStones;
    }

    /**
     * Returns a map of all smooth stone slab blocks associated with their respective stone type variants.
     *
     * @return a map where the keys are StoneTypeVariants and the values are the corresponding smooth stone slab blocks
     */
    public HashMap<StoneTypeVariants, Block> getSmoothStoneSlabs() {
        HashMap<StoneTypeVariants, Block> smoothStoneSlabs = new HashMap();

        smoothStoneSlabs.put(StoneTypeVariants.STONE, smoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.MOSSY_STONE, mossySmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.OVERGROWN_STONE, overgrownSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.BRONZE_STONE, bronzeSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.MOSSY_BRONZE_STONE, mossyBronzeSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.OVERGROWN_BRONZE_STONE, overgrownBronzeSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.SILVER_STONE, silverSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.MOSSY_SILVER_STONE, mossySilverSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.OVERGROWN_SILVER_STONE, overgrownSilverSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.GOLD_STONE, goldSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.MOSSY_GOLD_STONE, mossyGoldSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.OVERGROWN_GOLD_STONE, overgrownGoldSmoothSlab);

        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_STONE, crackedSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_MOSSY_STONE, crackedMossySmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_OVERGROWN_STONE, crackedOvergrownSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_BRONZE_STONE, crackedBronzeSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, crackedMossyBronzeSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, crackedOvergrownBronzeSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_SILVER_STONE, crackedSilverSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, crackedMossySilverSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, crackedOvergrownSilverSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_GOLD_STONE, crackedGoldSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, crackedMossyGoldSmoothSlab);
        smoothStoneSlabs.put(StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, crackedOvergrownGoldSmoothSlab);

        return smoothStoneSlabs;
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

    public BlockFamily getMossyStoneFamily() {
        return mossyStoneFamily;
    }

    /**
     * Returns the given variant of the mossyStone
     * @param variant the variantBlock to be returned (base, stairs, slab, wall, button or pressure_plate)
     * @return the Block, that is the given variant of the mossyStone
     */
    public Block getMossyStoneVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
			    return mossyStone;
		    }
		    case "stairs" -> {
			    return mossyStoneStairs;
		    }
		    case "slab" -> {
			    return mossyStoneSlab;
		    }
		    case "wall" -> {
			    return mossyStoneWall;
		    }
		    case "button" -> {
			    return mossyStoneButton;
		    }
		    case "pressure_plate" -> {
			    return mossyStonePressurePlate;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getOvergrownStoneFamily() {
        return overgrownStoneFamily;
    }

    /**
     * Returns the given variant of the overgrownStone.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, wall, button, or pressure_plate)
     * @return the Block that is the given variant of the overgrownStone, or null if the variant is not recognized
     */
    public Block getOvergrownStoneVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownStone;
            }
            case "stairs" -> {
                return overgrownStoneStairs;
            }
            case "slab" -> {
                return overgrownStoneSlab;
            }
            case "wall" -> {
                return overgrownStoneWall;
            }
            case "button" -> {
                return overgrownStoneButton;
            }
            case "pressure_plate" -> {
                return overgrownStonePressurePlate;
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

    public BlockFamily getCrackedCobbledBrickFamily() {
        return crackedCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedCobbledBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedCobbledBrick
     */
    public Block getCrackedCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedCobbledBrick;
            }
            case "stairs" -> {
                return crackedCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedCobbledBrickWall;
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

    public BlockFamily getCrackedMossyCobbledBrickFamily() {
        return crackedMossyCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedMossyCobbledBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossyCobbledBrick
     */
    public Block getCrackedMossyCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyCobbledBrick;
            }
            case "stairs" -> {
                return crackedMossyCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedMossyCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedMossyCobbledBrickWall;
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

    public BlockFamily getCrackedOvergrownCobbledBrickFamily() {
        return crackedOvergrownCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownCobbledBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownCobbledBrick
     */
    public Block getCrackedOvergrownCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownCobbledBrick;
            }
            case "stairs" -> {
                return crackedOvergrownCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedOvergrownCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedOvergrownCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getBronzeCobbledBrickFamily() {
        return bronzeCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the bronzeCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the bronzeCobbledBrick, or null if the variant is not recognized
     */
    public Block getBronzeCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return bronzeCobbledBrick;
            }
            case "stairs" -> {
                return bronzeCobbledBrickStairs;
            }
            case "slab" -> {
                return bronzeCobbledBrickSlab;
            }
            case "wall" -> {
                return bronzeCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedBronzeCobbledBrickFamily() {
        return crackedBronzeCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedBronzeCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the crackedBronzeCobbledBrick, or null if the variant is not recognized
     */
    public Block getCrackedBronzeCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedBronzeCobbledBrick;
            }
            case "stairs" -> {
                return crackedBronzeCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedBronzeCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedBronzeCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossyBronzeCobbledBrickFamily() {
        return mossyBronzeCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the mossyBronzeCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the mossyBronzeCobbledBrick, or null if the variant is not recognized
     */
    public Block getMossyBronzeCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyBronzeCobbledBrick;
            }
            case "stairs" -> {
                return mossyBronzeCobbledBrickStairs;
            }
            case "slab" -> {
                return mossyBronzeCobbledBrickSlab;
            }
            case "wall" -> {
                return mossyBronzeCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyBronzeCobbledBrickFamily() {
        return crackedMossyBronzeCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedMossyBronzeCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the crackedMossyBronzeCobbledBrick, or null if the variant is not recognized
     */
    public Block getCrackedMossyBronzeCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyBronzeCobbledBrick;
            }
            case "stairs" -> {
                return crackedMossyBronzeCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedMossyBronzeCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedMossyBronzeCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownBronzeCobbledBrickFamily() {
        return overgrownBronzeCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the overgrownBronzeCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the overgrownBronzeCobbledBrick, or null if the variant is not recognized
     */
    public Block getOvergrownBronzeCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownBronzeCobbledBrick;
            }
            case "stairs" -> {
                return overgrownBronzeCobbledBrickStairs;
            }
            case "slab" -> {
                return overgrownBronzeCobbledBrickSlab;
            }
            case "wall" -> {
                return overgrownBronzeCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownBronzeCobbledBrickFamily() {
        return crackedOvergrownBronzeCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownBronzeCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the crackedOvergrownBronzeCobbledBrick, or null if the variant is not recognized
     */
    public Block getCrackedOvergrownBronzeCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownBronzeCobbledBrick;
            }
            case "stairs" -> {
                return crackedOvergrownBronzeCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedOvergrownBronzeCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedOvergrownBronzeCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getSilverCobbledBrickFamily() {
        return silverCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the silverCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the silverCobbledBrick, or null if the variant is not recognized
     */
    public Block getSilverCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return silverCobbledBrick;
            }
            case "stairs" -> {
                return silverCobbledBrickStairs;
            }
            case "slab" -> {
                return silverCobbledBrickSlab;
            }
            case "wall" -> {
                return silverCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedSilverCobbledBrickFamily() {
        return crackedSilverCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedSilverCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the crackedSilverCobbledBrick, or null if the variant is not recognized
     */
    public Block getCrackedSilverCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedSilverCobbledBrick;
            }
            case "stairs" -> {
                return crackedSilverCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedSilverCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedSilverCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossySilverCobbledBrickFamily() {
        return mossySilverCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the mossySilverCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the mossySilverCobbledBrick, or null if the variant is not recognized
     */
    public Block getMossySilverCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossySilverCobbledBrick;
            }
            case "stairs" -> {
                return mossySilverCobbledBrickStairs;
            }
            case "slab" -> {
                return mossySilverCobbledBrickSlab;
            }
            case "wall" -> {
                return mossySilverCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossySilverCobbledBrickFamily() {
        return crackedMossySilverCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedMossySilverCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the crackedMossySilverCobbledBrick, or null if the variant is not recognized
     */
    public Block getCrackedMossySilverCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossySilverCobbledBrick;
            }
            case "stairs" -> {
                return crackedMossySilverCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedMossySilverCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedMossySilverCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownSilverCobbledBrickFamily() {
        return overgrownSilverCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the overgrownSilverCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the overgrownSilverCobbledBrick, or null if the variant is not recognized
     */
    public Block getOvergrownSilverCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownSilverCobbledBrick;
            }
            case "stairs" -> {
                return overgrownSilverCobbledBrickStairs;
            }
            case "slab" -> {
                return overgrownSilverCobbledBrickSlab;
            }
            case "wall" -> {
                return overgrownSilverCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownSilverCobbledBrickFamily() {
        return crackedOvergrownSilverCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownSilverCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the crackedOvergrownSilverCobbledBrick, or null if the variant is not recognized
     */
    public Block getCrackedOvergrownSilverCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownSilverCobbledBrick;
            }
            case "stairs" -> {
                return crackedOvergrownSilverCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedOvergrownSilverCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedOvergrownSilverCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getGoldCobbledBrickFamily() {
        return goldCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the goldCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the goldCobbledBrick, or null if the variant is not recognized
     */
    public Block getGoldCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return goldCobbledBrick;
            }
            case "stairs" -> {
                return goldCobbledBrickStairs;
            }
            case "slab" -> {
                return goldCobbledBrickSlab;
            }
            case "wall" -> {
                return goldCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedGoldCobbledBrickFamily() {
        return crackedGoldCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedGoldCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the crackedGoldCobbledBrick, or null if the variant is not recognized
     */
    public Block getCrackedGoldCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedGoldCobbledBrick;
            }
            case "stairs" -> {
                return crackedGoldCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedGoldCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedGoldCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossyGoldCobbledBrickFamily() {
        return mossyGoldCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the mossyGoldCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the mossyGoldCobbledBrick, or null if the variant is not recognized
     */
    public Block getMossyGoldCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyGoldCobbledBrick;
            }
            case "stairs" -> {
                return mossyGoldCobbledBrickStairs;
            }
            case "slab" -> {
                return mossyGoldCobbledBrickSlab;
            }
            case "wall" -> {
                return mossyGoldCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyGoldCobbledBrickFamily() {
        return crackedMossyGoldCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedMossyGoldCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the crackedMossyGoldCobbledBrick, or null if the variant is not recognized
     */
    public Block getCrackedMossyGoldCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyGoldCobbledBrick;
            }
            case "stairs" -> {
                return crackedMossyGoldCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedMossyGoldCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedMossyGoldCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownGoldCobbledBrickFamily() {
        return overgrownGoldCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the overgrownGoldCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the overgrownGoldCobbledBrick, or null if the variant is not recognized
     */
    public Block getOvergrownGoldCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownGoldCobbledBrick;
            }
            case "stairs" -> {
                return overgrownGoldCobbledBrickStairs;
            }
            case "slab" -> {
                return overgrownGoldCobbledBrickSlab;
            }
            case "wall" -> {
                return overgrownGoldCobbledBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownGoldCobbledBrickFamily() {
        return crackedOvergrownGoldCobbledBrickFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownGoldCobbledBrick.
     *
     * @param variant the variantBlock to be returned (base, stairs, slab, or wall)
     * @return the Block that is the given variant of the crackedOvergrownGoldCobbledBrick, or null if the variant is not recognized
     */
    public Block getCrackedOvergrownGoldCobbledBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownGoldCobbledBrick;
            }
            case "stairs" -> {
                return crackedOvergrownGoldCobbledBrickStairs;
            }
            case "slab" -> {
                return crackedOvergrownGoldCobbledBrickSlab;
            }
            case "wall" -> {
                return crackedOvergrownGoldCobbledBrickWall;
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
            case "chiseled" -> {
                return chiseledBrick;
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

    public BlockFamily getBronzeBrickFamily() {
        return bronzeBrickFamily;
    }

    /**
     * Returns the given variant of the bronzeBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the bronzeBrick
     */
    public Block getBronzeBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return bronzeBrick;
            }
            case "stairs" -> {
                return bronzeBrickStairs;
            }
            case "slab" -> {
                return bronzeBrickSlab;
            }
            case "wall" -> {
                return bronzeBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedBronzeBrickFamily() {
        return crackedBronzeBrickFamily;
    }

    /**
     * Returns the given variant of the crackedBronzeBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedBronzeBrick
     */
    public Block getCrackedBronzeBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedBronzeBrick;
            }
            case "stairs" -> {
                return crackedBronzeBrickStairs;
            }
            case "slab" -> {
                return crackedBronzeBrickSlab;
            }
            case "wall" -> {
                return crackedBronzeBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossyBronzeBrickFamily() {
        return mossyBronzeBrickFamily;
    }

    /**
     * Returns the given variant of the mossyBronzeBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossyBronzeBrick
     */
    public Block getMossyBronzeBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyBronzeBrick;
            }
            case "stairs" -> {
                return mossyBronzeBrickStairs;
            }
            case "slab" -> {
                return mossyBronzeBrickSlab;
            }
            case "wall" -> {
                return mossyBronzeBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyBronzeBrickFamily() {
        return crackedMossyBronzeBrickFamily;
    }

    /**
     * Returns the given variant of the crackedMossyBronzeBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossyBronzeBrick
     */
    public Block getCrackedMossyBronzeBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyBronzeBrick;
            }
            case "stairs" -> {
                return crackedMossyBronzeBrickStairs;
            }
            case "slab" -> {
                return crackedMossyBronzeBrickSlab;
            }
            case "wall" -> {
                return crackedMossyBronzeBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownBronzeBrickFamily() {
        return overgrownBronzeBrickFamily;
    }

    /**
     * Returns the given variant of the overgrownBronzeBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownBronzeBrick
     */
    public Block getOvergrownBronzeBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownBronzeBrick;
            }
            case "stairs" -> {
                return overgrownBronzeBrickStairs;
            }
            case "slab" -> {
                return overgrownBronzeBrickSlab;
            }
            case "wall" -> {
                return overgrownBronzeBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownBronzeBrickFamily() {
        return crackedOvergrownBronzeBrickFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownBronzeBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownBronzeBrick
     */
    public Block getCrackedOvergrownBronzeBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownBronzeBrick;
            }
            case "stairs" -> {
                return crackedOvergrownBronzeBrickStairs;
            }
            case "slab" -> {
                return crackedOvergrownBronzeBrickSlab;
            }
            case "wall" -> {
                return crackedOvergrownBronzeBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getSilverBrickFamily() {
        return silverBrickFamily;
    }

    /**
     * Returns the given variant of the silverBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the silverBrick
     */
    public Block getSilverBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return silverBrick;
            }
            case "stairs" -> {
                return silverBrickStairs;
            }
            case "slab" -> {
                return silverBrickSlab;
            }
            case "wall" -> {
                return silverBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedSilverBrickFamily() {
        return crackedSilverBrickFamily;
    }

    /**
     * Returns the given variant of the crackedSilverBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedSilverBrick
     */
    public Block getCrackedSilverBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedSilverBrick;
            }
            case "stairs" -> {
                return crackedSilverBrickStairs;
            }
            case "slab" -> {
                return crackedSilverBrickSlab;
            }
            case "wall" -> {
                return crackedSilverBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossySilverBrickFamily() {
        return mossySilverBrickFamily;
    }

    /**
     * Returns the given variant of the mossySilverBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossySilverBrick
     */
    public Block getMossySilverBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossySilverBrick;
            }
            case "stairs" -> {
                return mossySilverBrickStairs;
            }
            case "slab" -> {
                return mossySilverBrickSlab;
            }
            case "wall" -> {
                return mossySilverBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossySilverBrickFamily() {
        return crackedMossySilverBrickFamily;
    }

    /**
     * Returns the given variant of the crackedMossySilverBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossySilverBrick
     */
    public Block getCrackedMossySilverBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossySilverBrick;
            }
            case "stairs" -> {
                return crackedMossySilverBrickStairs;
            }
            case "slab" -> {
                return crackedMossySilverBrickSlab;
            }
            case "wall" -> {
                return crackedMossySilverBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownSilverBrickFamily() {
        return overgrownSilverBrickFamily;
    }

    /**
     * Returns the given variant of the overgrownSilverBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownSilverBrick
     */
    public Block getOvergrownSilverBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownSilverBrick;
            }
            case "stairs" -> {
                return overgrownSilverBrickStairs;
            }
            case "slab" -> {
                return overgrownSilverBrickSlab;
            }
            case "wall" -> {
                return overgrownSilverBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownSilverBrickFamily() {
        return crackedOvergrownSilverBrickFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownSilverBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownSilverBrick
     */
    public Block getCrackedOvergrownSilverBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownSilverBrick;
            }
            case "stairs" -> {
                return crackedOvergrownSilverBrickStairs;
            }
            case "slab" -> {
                return crackedOvergrownSilverBrickSlab;
            }
            case "wall" -> {
                return crackedOvergrownSilverBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getGoldBrickFamily() {
        return goldBrickFamily;
    }

    /**
     * Returns the given variant of the goldBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the goldBrick
     */
    public Block getGoldBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return goldBrick;
		    }
		    case "stairs" -> {
				return goldBrickStairs;
		    }
		    case "slab" -> {
				return goldBrickSlab;
		    }
		    case "wall" -> {
				return goldBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getCrackedGoldBrickFamily() {
        return crackedGoldBrickFamily;
    }

    /**
     * Returns the given variant of the crackedGoldBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedGoldBrick
     */
    public Block getCrackedGoldBrickVariant(String variant) {
	    switch (variant) {
		    case "base" -> {
				return crackedGoldBrick;
		    }
		    case "stairs" -> {
				return crackedGoldBrickStairs;
		    }
		    case "slab" -> {
				return crackedGoldBrickSlab;
		    }
		    case "wall" -> {
				return crackedGoldBrickWall;
		    }
		    default -> {
			    return null;
		    }
	    }
    }

    public BlockFamily getMossyGoldBrickFamily() {
        return mossyGoldBrickFamily;
    }

    /**
     * Returns the given variant of the mossyGoldBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossyGoldBrick
     */
    public Block getMossyGoldBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyGoldBrick;
            }
            case "stairs" -> {
                return mossyGoldBrickStairs;
            }
            case "slab" -> {
                return mossyGoldBrickSlab;
            }
            case "wall" -> {
                return mossyGoldBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyGoldBrickFamily() {
        return crackedMossyGoldBrickFamily;
    }

    /**
     * Returns the given variant of the crackedMossyGoldBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossyGoldBrick
     */
    public Block getCrackedMossyGoldBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyGoldBrick;
            }
            case "stairs" -> {
                return crackedMossyGoldBrickStairs;
            }
            case "slab" -> {
                return crackedMossyGoldBrickSlab;
            }
            case "wall" -> {
                return crackedMossyGoldBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownGoldBrickFamily() {
        return overgrownGoldBrickFamily;
    }

    /**
     * Returns the given variant of the overgrownGoldBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownGoldBrick
     */
    public Block getOvergrownGoldBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownGoldBrick;
            }
            case "stairs" -> {
                return overgrownGoldBrickStairs;
            }
            case "slab" -> {
                return overgrownGoldBrickSlab;
            }
            case "wall" -> {
                return overgrownGoldBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownGoldBrickFamily() {
        return crackedOvergrownGoldBrickFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownGoldBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownGoldBrick
     */
    public Block getCrackedOvergrownGoldBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownGoldBrick;
            }
            case "stairs" -> {
                return crackedOvergrownGoldBrickStairs;
            }
            case "slab" -> {
                return crackedOvergrownGoldBrickSlab;
            }
            case "wall" -> {
                return crackedOvergrownGoldBrickWall;
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

    public BlockFamily getBronzeTilesFamily() {
        return bronzeTilesFamily;
    }

    /**
     * Returns the given variant of the bronzeTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the bronzeTiles
     */
    public Block getBronzeTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return bronzeTiles;
            }
            case "stairs" -> {
                return bronzeTilesStairs;
            }
            case "slab" -> {
                return bronzeTilesSlab;
            }
            case "wall" -> {
                return bronzeTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedBronzeTilesFamily() {
        return crackedBronzeTilesFamily;
    }

    /**
     * Returns the given variant of the crackedBronzeTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedBronzeTiles
     */
    public Block getCrackedBronzeTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedBronzeTiles;
            }
            case "stairs" -> {
                return crackedBronzeTilesStairs;
            }
            case "slab" -> {
                return crackedBronzeTilesSlab;
            }
            case "wall" -> {
                return crackedBronzeTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossyBronzeTilesFamily() {
        return mossyBronzeTilesFamily;
    }

    /**
     * Returns the given variant of the mossyBronzeTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossyBronzeTiles
     */
    public Block getMossyBronzeTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyBronzeTiles;
            }
            case "stairs" -> {
                return mossyBronzeTilesStairs;
            }
            case "slab" -> {
                return mossyBronzeTilesSlab;
            }
            case "wall" -> {
                return mossyBronzeTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyBronzeTilesFamily() {
        return crackedMossyBronzeTilesFamily;
    }

    /**
     * Returns the given variant of the crackedMossyBronzeTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossyBronzeTiles
     */
    public Block getCrackedMossyBronzeTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyBronzeTiles;
            }
            case "stairs" -> {
                return crackedMossyBronzeTilesStairs;
            }
            case "slab" -> {
                return crackedMossyBronzeTilesSlab;
            }
            case "wall" -> {
                return crackedMossyBronzeTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownBronzeTilesFamily() {
        return overgrownBronzeTilesFamily;
    }

    /**
     * Returns the given variant of the overgrownBronzeTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownBronzeTiles
     */
    public Block getOvergrownBronzeTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownBronzeTiles;
            }
            case "stairs" -> {
                return overgrownBronzeTilesStairs;
            }
            case "slab" -> {
                return overgrownBronzeTilesSlab;
            }
            case "wall" -> {
                return overgrownBronzeTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownBronzeTilesFamily() {
        return crackedOvergrownBronzeTilesFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownBronzeTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownBronzeTiles
     */
    public Block getCrackedOvergrownBronzeTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownBronzeTiles;
            }
            case "stairs" -> {
                return crackedOvergrownBronzeTilesStairs;
            }
            case "slab" -> {
                return crackedOvergrownBronzeTilesSlab;
            }
            case "wall" -> {
                return crackedOvergrownBronzeTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getSilverTilesFamily() {
        return silverTilesFamily;
    }

    /**
     * Returns the given variant of the silverTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the silverTiles
     */
    public Block getSilverTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return silverTiles;
            }
            case "stairs" -> {
                return silverTilesStairs;
            }
            case "slab" -> {
                return silverTilesSlab;
            }
            case "wall" -> {
                return silverTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedSilverTilesFamily() {
        return crackedSilverTilesFamily;
    }

    /**
     * Returns the given variant of the crackedSilverTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedSilverTiles
     */
    public Block getCrackedSilverTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedSilverTiles;
            }
            case "stairs" -> {
                return crackedSilverTilesStairs;
            }
            case "slab" -> {
                return crackedSilverTilesSlab;
            }
            case "wall" -> {
                return crackedSilverTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossySilverTilesFamily() {
        return mossySilverTilesFamily;
    }

    /**
     * Returns the given variant of the mossySilverTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossySilverTiles
     */
    public Block getMossySilverTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossySilverTiles;
            }
            case "stairs" -> {
                return mossySilverTilesStairs;
            }
            case "slab" -> {
                return mossySilverTilesSlab;
            }
            case "wall" -> {
                return mossySilverTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossySilverTilesFamily() {
        return crackedMossySilverTilesFamily;
    }

    /**
     * Returns the given variant of the crackedMossySilverTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossySilverTiles
     */
    public Block getCrackedMossySilverTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossySilverTiles;
            }
            case "stairs" -> {
                return crackedMossySilverTilesStairs;
            }
            case "slab" -> {
                return crackedMossySilverTilesSlab;
            }
            case "wall" -> {
                return crackedMossySilverTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownSilverTilesFamily() {
        return overgrownSilverTilesFamily;
    }

    /**
     * Returns the given variant of the overgrownSilverTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownSilverTiles
     */
    public Block getOvergrownSilverTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownSilverTiles;
            }
            case "stairs" -> {
                return overgrownSilverTilesStairs;
            }
            case "slab" -> {
                return overgrownSilverTilesSlab;
            }
            case "wall" -> {
                return overgrownSilverTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownSilverTilesFamily() {
        return crackedOvergrownSilverTilesFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownSilverTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownSilverTiles
     */
    public Block getCrackedOvergrownSilverTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownSilverTiles;
            }
            case "stairs" -> {
                return crackedOvergrownSilverTilesStairs;
            }
            case "slab" -> {
                return crackedOvergrownSilverTilesSlab;
            }
            case "wall" -> {
                return crackedOvergrownSilverTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getGoldTilesFamily() {
        return goldTilesFamily;
    }

    /**
     * Returns the given variant of the goldTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the goldTiles
     */
    public Block getGoldTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return goldTiles;
            }
            case "stairs" -> {
                return goldTilesStairs;
            }
            case "slab" -> {
                return goldTilesSlab;
            }
            case "wall" -> {
                return goldTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedGoldTilesFamily() {
        return crackedGoldTilesFamily;
    }

    /**
     * Returns the given variant of the crackedGoldTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedGoldTiles
     */
    public Block getCrackedGoldTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedGoldTiles;
            }
            case "stairs" -> {
                return crackedGoldTilesStairs;
            }
            case "slab" -> {
                return crackedGoldTilesSlab;
            }
            case "wall" -> {
                return crackedGoldTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossyGoldTilesFamily() {
        return mossyGoldTilesFamily;
    }

    /**
     * Returns the given variant of the mossyGoldTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossyGoldTiles
     */
    public Block getMossyGoldTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyGoldTiles;
            }
            case "stairs" -> {
                return mossyGoldTilesStairs;
            }
            case "slab" -> {
                return mossyGoldTilesSlab;
            }
            case "wall" -> {
                return mossyGoldTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyGoldTilesFamily() {
        return crackedMossyGoldTilesFamily;
    }

    /**
     * Returns the given variant of the crackedMossyGoldTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossyGoldTiles
     */
    public Block getCrackedMossyGoldTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyGoldTiles;
            }
            case "stairs" -> {
                return crackedMossyGoldTilesStairs;
            }
            case "slab" -> {
                return crackedMossyGoldTilesSlab;
            }
            case "wall" -> {
                return crackedMossyGoldTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownGoldTilesFamily() {
        return overgrownGoldTilesFamily;
    }

    /**
     * Returns the given variant of the overgrownGoldTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownGoldTiles
     */
    public Block getOvergrownGoldTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownGoldTiles;
            }
            case "stairs" -> {
                return overgrownGoldTilesStairs;
            }
            case "slab" -> {
                return overgrownGoldTilesSlab;
            }
            case "wall" -> {
                return overgrownGoldTilesWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownGoldTilesFamily() {
        return crackedOvergrownGoldTilesFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownGoldTiles
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownGoldTiles
     */
    public Block getCrackedOvergrownGoldTilesVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownGoldTiles;
            }
            case "stairs" -> {
                return crackedOvergrownGoldTilesStairs;
            }
            case "slab" -> {
                return crackedOvergrownGoldTilesSlab;
            }
            case "wall" -> {
                return crackedOvergrownGoldTilesWall;
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

    public BlockFamily getMossyPavementFamily() {
        return mossyPavementFamily;
    }

    /**
     * Returns the given variant of the mossyPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the mossyPavement
     */
    public Block getMossyPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyPavement;
            }
            case "stairs" -> {
                return mossyPavementStairs;
            }
            case "slab" -> {
                return mossyPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyPavementFamily() {
        return crackedMossyPavementFamily;
    }

    /**
     * Returns the given variant of the crackedMossyPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedMossyPavement
     */
    public Block getCrackedMossyPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyPavement;
            }
            case "stairs" -> {
                return crackedMossyPavementStairs;
            }
            case "slab" -> {
                return crackedMossyPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownPavementFamily() {
        return overgrownPavementFamily;
    }

    /**
     * Returns the given variant of the overgrownPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the overgrownPavement
     */
    public Block getOvergrownPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownPavement;
            }
            case "stairs" -> {
                return overgrownPavementStairs;
            }
            case "slab" -> {
                return overgrownPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownPavementFamily() {
        return crackedOvergrownPavementFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedOvergrownPavement
     */
    public Block getCrackedOvergrownPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownPavement;
            }
            case "stairs" -> {
                return crackedOvergrownPavementStairs;
            }
            case "slab" -> {
                return crackedOvergrownPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getBronzePavementFamily() {
        return bronzePavementFamily;
    }

    /**
     * Returns the given variant of the bronzePavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the bronzePavement
     */
    public Block getBronzePavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return bronzePavement;
            }
            case "stairs" -> {
                return bronzePavementStairs;
            }
            case "slab" -> {
                return bronzePavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedBronzePavementFamily() {
        return crackedBronzePavementFamily;
    }

    /**
     * Returns the given variant of the crackedBronzePavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedBronzePavement
     */
    public Block getCrackedBronzePavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedBronzePavement;
            }
            case "stairs" -> {
                return crackedBronzePavementStairs;
            }
            case "slab" -> {
                return crackedBronzePavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossyBronzePavementFamily() {
        return mossyBronzePavementFamily;
    }

    /**
     * Returns the given variant of the mossyBronzePavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the mossyBronzePavement
     */
    public Block getMossyBronzePavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyBronzePavement;
            }
            case "stairs" -> {
                return mossyBronzePavementStairs;
            }
            case "slab" -> {
                return mossyBronzePavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyBronzePavementFamily() {
        return crackedMossyBronzePavementFamily;
    }

    /**
     * Returns the given variant of the crackedMossyBronzePavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedMossyBronzePavement
     */
    public Block getCrackedMossyBronzePavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyBronzePavement;
            }
            case "stairs" -> {
                return crackedMossyBronzePavementStairs;
            }
            case "slab" -> {
                return crackedMossyBronzePavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownBronzePavementFamily() {
        return overgrownBronzePavementFamily;
    }

    /**
     * Returns the given variant of the overgrownBronzePavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the overgrownBronzePavement
     */
    public Block getOvergrownBronzePavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownBronzePavement;
            }
            case "stairs" -> {
                return overgrownBronzePavementStairs;
            }
            case "slab" -> {
                return overgrownBronzePavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownBronzePavementFamily() {
        return crackedOvergrownBronzePavementFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownBronzePavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedOvergrownBronzePavement
     */
    public Block getCrackedOvergrownBronzePavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownBronzePavement;
            }
            case "stairs" -> {
                return crackedOvergrownBronzePavementStairs;
            }
            case "slab" -> {
                return crackedOvergrownBronzePavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getSilverPavementFamily() {
        return silverPavementFamily;
    }

    /**
     * Returns the given variant of the silverPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the silverPavement
     */
    public Block getSilverPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return silverPavement;
            }
            case "stairs" -> {
                return silverPavementStairs;
            }
            case "slab" -> {
                return silverPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedSilverPavementFamily() {
        return crackedSilverPavementFamily;
    }

    /**
     * Returns the given variant of the crackedSilverPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedSilverPavement
     */
    public Block getCrackedSilverPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedSilverPavement;
            }
            case "stairs" -> {
                return crackedSilverPavementStairs;
            }
            case "slab" -> {
                return crackedSilverPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossySilverPavementFamily() {
        return mossySilverPavementFamily;
    }

    /**
     * Returns the given variant of the mossySilverPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the mossySilverPavement
     */
    public Block getMossySilverPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossySilverPavement;
            }
            case "stairs" -> {
                return mossySilverPavementStairs;
            }
            case "slab" -> {
                return mossySilverPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossySilverPavementFamily() {
        return crackedMossySilverPavementFamily;
    }

    /**
     * Returns the given variant of the crackedMossySilverPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedMossySilverPavement
     */
    public Block getCrackedMossySilverPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossySilverPavement;
            }
            case "stairs" -> {
                return crackedMossySilverPavementStairs;
            }
            case "slab" -> {
                return crackedMossySilverPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownSilverPavementFamily() {
        return overgrownSilverPavementFamily;
    }

    /**
     * Returns the given variant of the overgrownSilverPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the overgrownSilverPavement
     */
    public Block getOvergrownSilverPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownSilverPavement;
            }
            case "stairs" -> {
                return overgrownSilverPavementStairs;
            }
            case "slab" -> {
                return overgrownSilverPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownSilverPavementFamily() {
        return crackedOvergrownSilverPavementFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownSilverPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedOvergrownSilverPavement
     */
    public Block getCrackedOvergrownSilverPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownSilverPavement;
            }
            case "stairs" -> {
                return crackedOvergrownSilverPavementStairs;
            }
            case "slab" -> {
                return crackedOvergrownSilverPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getGoldPavementFamily() {
        return goldPavementFamily;
    }

    /**
     * Returns the given variant of the goldPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the goldPavement
     */
    public Block getGoldPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return goldPavement;
            }
            case "stairs" -> {
                return goldPavementStairs;
            }
            case "slab" -> {
                return goldPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedGoldPavementFamily() {
        return crackedGoldPavementFamily;
    }

    /**
     * Returns the given variant of the crackedGoldPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedGoldPavement
     */
    public Block getCrackedGoldPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedGoldPavement;
            }
            case "stairs" -> {
                return crackedGoldPavementStairs;
            }
            case "slab" -> {
                return crackedGoldPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossyGoldPavementFamily() {
        return mossyGoldPavementFamily;
    }

    /**
     * Returns the given variant of the mossyGoldPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the mossyGoldPavement
     */
    public Block getMossyGoldPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyGoldPavement;
            }
            case "stairs" -> {
                return mossyGoldPavementStairs;
            }
            case "slab" -> {
                return mossyGoldPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyGoldPavementFamily() {
        return crackedMossyGoldPavementFamily;
    }

    /**
     * Returns the given variant of the crackedMossyGoldPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedMossyGoldPavement
     */
    public Block getCrackedMossyGoldPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyGoldPavement;
            }
            case "stairs" -> {
                return crackedMossyGoldPavementStairs;
            }
            case "slab" -> {
                return crackedMossyGoldPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownGoldPavementFamily() {
        return overgrownGoldPavementFamily;
    }

    /**
     * Returns the given variant of the overgrownGoldPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the overgrownGoldPavement
     */
    public Block getOvergrownGoldPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownGoldPavement;
            }
            case "stairs" -> {
                return overgrownGoldPavementStairs;
            }
            case "slab" -> {
                return overgrownGoldPavementSlab;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownGoldPavementFamily() {
        return crackedOvergrownGoldPavementFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownGoldPavement
     * @param variant the variantBlock to be returned (base, stairs or slab)
     * @return the Block, that is the given variant of the crackedOvergrownGoldPavement
     */
    public Block getCrackedOvergrownGoldPavementVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownGoldPavement;
            }
            case "stairs" -> {
                return crackedOvergrownGoldPavementStairs;
            }
            case "slab" -> {
                return crackedOvergrownGoldPavementSlab;
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

    public BlockFamily getBronzeFancyBricksFamily() {
        return bronzeFancyBricksFamily;
    }

    /**
     * Returns the given variant of the bronzeFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the bronzeFancyBrick
     */
    public Block getBronzeFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return bronzeFancyBricks;
            }
            case "stairs" -> {
                return bronzeFancyBrickStairs;
            }
            case "slab" -> {
                return bronzeFancyBrickSlab;
            }
            case "wall" -> {
                return bronzeFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedBronzeFancyBricksFamily() {
        return crackedBronzeFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedBronzeFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedBronzeFancyBrick
     */
    public Block getCrackedBronzeFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedBronzeFancyBricks;
            }
            case "stairs" -> {
                return crackedBronzeFancyBricksStairs;
            }
            case "slab" -> {
                return crackedBronzeFancyBricksSlab;
            }
            case "wall" -> {
                return crackedBronzeFancyBricksWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossyBronzeFancyBricksFamily() {
        return mossyBronzeFancyBricksFamily;
    }

    /**
     * Returns the given variant of the mossyBronzeFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossyBronzeFancyBrick
     */
    public Block getMossyBronzeFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyBronzeFancyBricks;
            }
            case "stairs" -> {
                return mossyBronzeFancyBrickStairs;
            }
            case "slab" -> {
                return mossyBronzeFancyBrickSlab;
            }
            case "wall" -> {
                return mossyBronzeFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyBronzeFancyBricksFamily() {
        return crackedMossyBronzeFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedMossyBronzeFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossyBronzeFancyBrick
     */
    public Block getCrackedMossyBronzeFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyBronzeFancyBricks;
            }
            case "stairs" -> {
                return crackedMossyBronzeFancyBricksStairs;
            }
            case "slab" -> {
                return crackedMossyBronzeFancyBricksSlab;
            }
            case "wall" -> {
                return crackedMossyBronzeFancyBricksWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownBronzeFancyBricksFamily() {
        return overgrownBronzeFancyBricksFamily;
    }

    /**
     * Returns the given variant of the overgrownBronzeFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownBronzeFancyBrick
     */
    public Block getOvergrownBronzeFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownBronzeFancyBricks;
            }
            case "stairs" -> {
                return overgrownBronzeFancyBrickStairs;
            }
            case "slab" -> {
                return overgrownBronzeFancyBrickSlab;
            }
            case "wall" -> {
                return overgrownBronzeFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownBronzeFancyBricksFamily() {
        return crackedOvergrownBronzeFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownBronzeFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownBronzeFancyBrick
     */
    public Block getCrackedOvergrownBronzeFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownBronzeFancyBricks;
            }
            case "stairs" -> {
                return crackedOvergrownBronzeFancyBricksStairs;
            }
            case "slab" -> {
                return crackedOvergrownBronzeFancyBricksSlab;
            }
            case "wall" -> {
                return crackedOvergrownBronzeFancyBricksWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getSilverFancyBricksFamily() {
        return silverFancyBricksFamily;
    }

    /**
     * Returns the given variant of the silverFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the silverFancyBrick
     */
    public Block getSilverFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return silverFancyBricks;
            }
            case "stairs" -> {
                return silverFancyBrickStairs;
            }
            case "slab" -> {
                return silverFancyBrickSlab;
            }
            case "wall" -> {
                return silverFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedSilverFancyBricksFamily() {
        return crackedSilverFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedSilverFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedSilverFancyBrick
     */
    public Block getCrackedSilverFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedSilverFancyBricks;
            }
            case "stairs" -> {
                return crackedSilverFancyBricksStairs;
            }
            case "slab" -> {
                return crackedSilverFancyBricksSlab;
            }
            case "wall" -> {
                return crackedSilverFancyBricksWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossySilverFancyBricksFamily() {
        return mossySilverFancyBricksFamily;
    }

    /**
     * Returns the given variant of the mossySilverFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossySilverFancyBrick
     */
    public Block getMossySilverFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossySilverFancyBricks;
            }
            case "stairs" -> {
                return mossySilverFancyBrickStairs;
            }
            case "slab" -> {
                return mossySilverFancyBrickSlab;
            }
            case "wall" -> {
                return mossySilverFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossySilverFancyBricksFamily() {
        return crackedMossySilverFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedMossySilverFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossySilverFancyBrick
     */
    public Block getCrackedMossySilverFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossySilverFancyBricks;
            }
            case "stairs" -> {
                return crackedMossySilverFancyBricksStairs;
            }
            case "slab" -> {
                return crackedMossySilverFancyBricksSlab;
            }
            case "wall" -> {
                return crackedMossySilverFancyBricksWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownSilverFancyBricksFamily() {
        return overgrownSilverFancyBricksFamily;
    }

    /**
     * Returns the given variant of the overgrownSilverFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownSilverFancyBrick
     */
    public Block getOvergrownSilverFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownSilverFancyBricks;
            }
            case "stairs" -> {
                return overgrownSilverFancyBrickStairs;
            }
            case "slab" -> {
                return overgrownSilverFancyBrickSlab;
            }
            case "wall" -> {
                return overgrownSilverFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownSilverFancyBricksFamily() {
        return crackedOvergrownSilverFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownSilverFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownSilverFancyBrick
     */
    public Block getCrackedOvergrownSilverFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownSilverFancyBricks;
            }
            case "stairs" -> {
                return crackedOvergrownSilverFancyBricksStairs;
            }
            case "slab" -> {
                return crackedOvergrownSilverFancyBricksSlab;
            }
            case "wall" -> {
                return crackedOvergrownSilverFancyBricksWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getGoldFancyBricksFamily() {
        return goldFancyBricksFamily;
    }

    /**
     * Returns the given variant of the goldFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the goldFancyBrick
     */
    public Block getGoldFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return goldFancyBricks;
            }
            case "stairs" -> {
                return goldFancyBrickStairs;
            }
            case "slab" -> {
                return goldFancyBrickSlab;
            }
            case "wall" -> {
                return goldFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedGoldFancyBricksFamily() {
        return crackedGoldFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedGoldFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedGoldFancyBrick
     */
    public Block getCrackedGoldFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedGoldFancyBricks;
            }
            case "stairs" -> {
                return crackedGoldFancyBricksStairs;
            }
            case "slab" -> {
                return crackedGoldFancyBricksSlab;
            }
            case "wall" -> {
                return crackedGoldFancyBricksWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getMossyGoldFancyBricksFamily() {
        return mossyGoldFancyBricksFamily;
    }

    /**
     * Returns the given variant of the mossyGoldFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the mossyGoldFancyBrick
     */
    public Block getMossyGoldFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return mossyGoldFancyBricks;
            }
            case "stairs" -> {
                return mossyGoldFancyBrickStairs;
            }
            case "slab" -> {
                return mossyGoldFancyBrickSlab;
            }
            case "wall" -> {
                return mossyGoldFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedMossyGoldFancyBricksFamily() {
        return crackedMossyGoldFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedMossyGoldFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedMossyGoldFancyBrick
     */
    public Block getCrackedMossyGoldFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedMossyGoldFancyBricks;
            }
            case "stairs" -> {
                return crackedMossyGoldFancyBricksStairs;
            }
            case "slab" -> {
                return crackedMossyGoldFancyBricksSlab;
            }
            case "wall" -> {
                return crackedMossyGoldFancyBricksWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getOvergrownGoldFancyBricksFamily() {
        return overgrownGoldFancyBricksFamily;
    }

    /**
     * Returns the given variant of the overgrownGoldFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the overgrownGoldFancyBrick
     */
    public Block getOvergrownGoldFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return overgrownGoldFancyBricks;
            }
            case "stairs" -> {
                return overgrownGoldFancyBrickStairs;
            }
            case "slab" -> {
                return overgrownGoldFancyBrickSlab;
            }
            case "wall" -> {
                return overgrownGoldFancyBrickWall;
            }
            default -> {
                return null;
            }
        }
    }

    public BlockFamily getCrackedOvergrownGoldFancyBricksFamily() {
        return crackedOvergrownGoldFancyBricksFamily;
    }

    /**
     * Returns the given variant of the crackedOvergrownGoldFancyBrick
     * @param variant the variantBlock to be returned (base, stairs, slab or wall)
     * @return the Block, that is the given variant of the crackedOvergrownGoldFancyBrick
     */
    public Block getCrackedOvergrownGoldFancyBrickVariant(String variant) {
        switch (variant) {
            case "base" -> {
                return crackedOvergrownGoldFancyBricks;
            }
            case "stairs" -> {
                return crackedOvergrownGoldFancyBricksStairs;
            }
            case "slab" -> {
                return crackedOvergrownGoldFancyBricksSlab;
            }
            case "wall" -> {
                return crackedOvergrownGoldFancyBricksWall;
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

    public Block getMossySmooth() {
        return mossySmooth;
    }

    public Block getMossySmoothSlab() {
        return mossySmoothSlab;
    }

    public Block getCrackedMossySmooth() {
        return crackedMossySmooth;
    }

    public Block getCrackedMossySmoothSlab() {
        return crackedMossySmoothSlab;
    }

    public Block getOvergrownSmooth() {
        return overgrownSmooth;
    }

    public Block getOvergrownSmoothSlab() {
        return overgrownSmoothSlab;
    }

    public Block getCrackedOvergrownSmooth() {
        return crackedOvergrownSmooth;
    }

    public Block getCrackedOvergrownSmoothSlab() {
        return crackedOvergrownSmoothSlab;
    }

    public Block getBronzeSmooth() {
        return bronzeSmooth;
    }

    public Block getBronzeSmoothSlab() {
        return bronzeSmoothSlab;
    }

    public Block getCrackedBronzeSmooth() {
        return crackedBronzeSmooth;
    }

    public Block getCrackedBronzeSmoothSlab() {
        return crackedBronzeSmoothSlab;
    }

    public Block getMossyBronzeSmoothSlab() {
        return mossyBronzeSmoothSlab;
    }

    public Block getMossyBronzeSmooth() {
        return mossyBronzeSmooth;
    }

    public Block getCrackedMossyBronzeSmooth() {
        return crackedMossyBronzeSmooth;
    }

    public Block getCrackedMossyBronzeSmoothSlab() {
        return crackedMossyBronzeSmoothSlab;
    }

    public Block getOvergrownBronzeSmooth() {
        return overgrownBronzeSmooth;
    }

    public Block getOvergrownBronzeSmoothSlab() {
        return overgrownBronzeSmoothSlab;
    }

    public Block getCrackedOvergrownBronzeSmooth() {
        return crackedOvergrownBronzeSmooth;
    }

    public Block getCrackedOvergrownBronzeSmoothSlab() {
        return crackedOvergrownBronzeSmoothSlab;
    }

    public Block getSilverSmooth() {
        return silverSmooth;
    }

    public Block getSilverSmoothSlab() {
        return silverSmoothSlab;
    }

    public Block getCrackedSilverSmoothSlab() {
        return crackedSilverSmoothSlab;
    }

    public Block getCrackedSilverSmooth() {
        return crackedSilverSmooth;
    }

    public Block getMossySilverSmooth() {
        return mossySilverSmooth;
    }

    public Block getMossySilverSmoothSlab() {
        return mossySilverSmoothSlab;
    }

    public Block getCrackedMossySilverSmooth() {
        return crackedMossySilverSmooth;
    }

    public Block getCrackedMossySilverSmoothSlab() {
        return crackedMossySilverSmoothSlab;
    }

    public Block getOvergrownSilverSmooth() {
        return overgrownSilverSmooth;
    }

    public Block getOvergrownSilverSmoothSlab() {
        return overgrownSilverSmoothSlab;
    }

    public Block getCrackedOvergrownSilverSmooth() {
        return crackedOvergrownSilverSmooth;
    }

    public Block getCrackedOvergrownSilverSmoothSlab() {
        return crackedOvergrownSilverSmoothSlab;
    }

    public Block getGoldSmooth() {
        return goldSmooth;
    }

    public Block getGoldSmoothSlab() {
        return goldSmoothSlab;
    }

    public Block getCrackedGoldSmooth() {
        return crackedGoldSmooth;
    }

    public Block getCrackedGoldSmoothSlab() {
        return crackedGoldSmoothSlab;
    }

    public Block getMossyGoldSmooth() {
        return mossyGoldSmooth;
    }

    public Block getMossyGoldSmoothSlab() {
        return mossyGoldSmoothSlab;
    }

    public Block getCrackedMossyGoldSmooth() {
        return crackedMossyGoldSmooth;
    }

    public Block getCrackedMossyGoldSmoothSlab() {
        return crackedMossyGoldSmoothSlab;
    }

    public Block getOvergrownGoldSmooth() {
        return overgrownGoldSmooth;
    }

    public Block getOvergrownGoldSmoothSlab() {
        return overgrownGoldSmoothSlab;
    }

    public Block getCrackedOvergrownGoldSmooth() {
        return crackedOvergrownGoldSmooth;
    }

    public Block getCrackedOvergrownGoldSmoothSlab() {
        return crackedOvergrownGoldSmoothSlab;
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

    public Block getBronzePillar() {
        return bronzePillar;
    }

    public Block getBronzePillarSlab() {
        return bronzePillarSlab;
    }

    public Block getCrackedBronzePillar() {
        return crackedBronzePillar;
    }

    public Block getCrackedBronzePillarSlab() {
        return crackedBronzePillarSlab;
    }

    public Block getMossyBronzePillar() {
        return mossyBronzePillar;
    }

    public Block getMossyBronzePillarSlab() {
        return mossyBronzePillarSlab;
    }

    public Block getCrackedMossyBronzePillar() {
        return crackedMossyBronzePillar;
    }

    public Block getCrackedMossyBronzePillarSlab() {
        return crackedMossyBronzePillarSlab;
    }

    public Block getOvergrownBronzePillar() {
        return overgrownBronzePillar;
    }

    public Block getOvergrownBronzePillarSlab() {
        return overgrownBronzePillarSlab;
    }

    public Block getCrackedOvergrownBronzePillar() {
        return crackedOvergrownBronzePillar;
    }

    public Block getCrackedOvergrownBronzePillarSlab() {
        return crackedOvergrownBronzePillarSlab;
    }

    public Block getCrackedOvergrownSilverPillarSlab() {
        return crackedOvergrownSilverPillarSlab;
    }

    public Block getCrackedOvergrownSilverPillar() {
        return crackedOvergrownSilverPillar;
    }

    public Block getOvergrownSilverPillarSlab() {
        return overgrownSilverPillarSlab;
    }

    public Block getOvergrownSilverPillar() {
        return overgrownSilverPillar;
    }

    public Block getCrackedMossySilverPillarSlab() {
        return crackedMossySilverPillarSlab;
    }

    public Block getCrackedMossySilverPillar() {
        return crackedMossySilverPillar;
    }

    public Block getMossySilverPillarSlab() {
        return mossySilverPillarSlab;
    }

    public Block getMossySilverPillar() {
        return mossySilverPillar;
    }

    public Block getCrackedSilverPillarSlab() {
        return crackedSilverPillarSlab;
    }

    public Block getCrackedSilverPillar() {
        return crackedSilverPillar;
    }

    public Block getSilverPillarSlab() {
        return silverPillarSlab;
    }

    public Block getSilverPillar() {
        return silverPillar;
    }

    public Block getGoldPillar() {
        return goldPillar;
    }

    public Block getGoldPillarSlab() {
        return goldPillarSlab;
    }

    public Block getCrackedGoldPillar() {
        return crackedGoldPillar;
    }

    public Block getCrackedGoldPillarSlab() {
        return crackedGoldPillarSlab;
    }

    public Block getMossyGoldPillar() {
        return mossyGoldPillar;
    }

    public Block getMossyGoldPillarSlab() {
        return mossyGoldPillarSlab;
    }

    public Block getCrackedMossyGoldPillar() {
        return crackedMossyGoldPillar;
    }

    public Block getCrackedMossyGoldPillarSlab() {
        return crackedMossyGoldPillarSlab;
    }

    public Block getOvergrownGoldPillar() {
        return overgrownGoldPillar;
    }

    public Block getOvergrownGoldPillarSlab() {
        return overgrownGoldPillarSlab;
    }

    public Block getCrackedOvergrownGoldPillar() {
        return crackedOvergrownGoldPillar;
    }

    public Block getCrackedOvergrownGoldPillarSlab() {
        return crackedOvergrownGoldPillarSlab;
    }

    public String getName() {
        return name;
    }
}