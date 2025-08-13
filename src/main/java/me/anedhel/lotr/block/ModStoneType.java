package me.anedhel.lotr.block;

import me.anedhel.lotr.block.custom.StoneTypeVariants;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Enum representing different types of stone blocks in the game.
 * Each type has its own set associated blocks.
 */
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
            "Blueslate"),
    CHALK(ModStoneBlocks.CHALK_FAMILY, ModStoneBlocks.MOSSY_CHALK_FAMILY, ModStoneBlocks.OVERGROWN_CHALK_FAMILY,
            ModStoneBlocks.COBBLED_CHALK_FAMILY, ModStoneBlocks.MOSSY_COBBLED_CHALK_FAMILY, ModStoneBlocks.OVERGROWN_COBBLED_CHALK_FAMILY,
            ModStoneBlocks.COBBLED_CHALK_BRICKS_FAMILY, ModStoneBlocks.MOSSY_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.OVERGROWN_COBBLED_CHALK_BRICK_FAMILY,
            ModStoneBlocks.CRACKED_COBBLED_CHALK_BRICKS_FAMILY, ModStoneBlocks.CRACKED_MOSSY_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_COBBLED_CHALK_BRICK_FAMILY,
            ModStoneBlocks.BRONZE_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.MOSSY_BRONZE_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_FAMILY,
            ModStoneBlocks.CRACKED_BRONZE_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_BRONZE_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_FAMILY,
            ModStoneBlocks.SILVER_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.MOSSY_SILVER_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.OVERGROWN_SILVER_COBBLED_CHALK_BRICK_FAMILY,
            ModStoneBlocks.CRACKED_SILVER_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_SILVER_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_SILVER_COBBLED_CHALK_BRICK_FAMILY,
            ModStoneBlocks.GOLD_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.MOSSY_GOLD_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.OVERGROWN_GOLD_COBBLED_CHALK_BRICK_FAMILY,
            ModStoneBlocks.CRACKED_GOLD_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_GOLD_COBBLED_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_GOLD_COBBLED_CHALK_BRICK_FAMILY,
            ModStoneBlocks.CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_CHALK_BRICK_FAMILY,
            ModStoneBlocks.MOSSY_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_CHALK_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_CHALK_BRICK_FAMILY,
            ModStoneBlocks.BRONZE_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_BRONZE_CHALK_BRICK_FAMILY,
            ModStoneBlocks.MOSSY_BRONZE_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_BRONZE_CHALK_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_BRONZE_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_BRONZE_CHALK_BRICK_FAMILY,
            ModStoneBlocks.SILVER_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_SILVER_CHALK_BRICK_FAMILY,
            ModStoneBlocks.MOSSY_SILVER_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_SILVER_CHALK_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_SILVER_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_SILVER_CHALK_BRICK_FAMILY,
            ModStoneBlocks.GOLD_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_GOLD_CHALK_BRICK_FAMILY,
            ModStoneBlocks.MOSSY_GOLD_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_MOSSY_GOLD_CHALK_BRICK_FAMILY,
            ModStoneBlocks.OVERGROWN_GOLD_CHALK_BRICK_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_GOLD_CHALK_BRICK_FAMILY,
            ModStoneBlocks.CHALK_TILES_FAMILY, ModStoneBlocks.CRACKED_CHALK_TILES_FAMILY,
            ModStoneBlocks.MOSSY_CHALK_TILES_FAMILY, ModStoneBlocks.CRACKED_MOSSY_CHALK_TILES_FAMILY,
            ModStoneBlocks.OVERGROWN_CHALK_TILES_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_CHALK_TILES_FAMILY,
            null, null, null, null, null, null, // Bronze tiles families (not implemented yet)
            null, null, null, null, null, null, // Silver tiles families (not implemented yet)
            null, null, null, null, null, null, // Gold tiles families (not implemented yet)
            ModStoneBlocks.CHALK_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_CHALK_PAVEMENT_FAMILY,
            ModStoneBlocks.MOSSY_CHALK_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_MOSSY_CHALK_PAVEMENT_FAMILY,
            ModStoneBlocks.OVERGROWN_CHALK_PAVEMENT_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_CHALK_PAVEMENT_FAMILY,
            null, null, null, null, null, null, // Bronze pavement families (not implemented yet)
            null, null, null, null, null, null, // Silver pavement families (not implemented yet)
            null, null, null, null, null, null, // Gold pavement families (not implemented yet)
            ModStoneBlocks.FANCY_CHALK_BRICKS_FAMILY, ModStoneBlocks.CRACKED_FANCY_CHALK_BRICKS_FAMILY,
            ModStoneBlocks.MOSSY_FANCY_CHALK_BRICKS_FAMILY, ModStoneBlocks.CRACKED_MOSSY_FANCY_CHALK_BRICKS_FAMILY,
            ModStoneBlocks.OVERGROWN_FANCY_CHALK_BRICKS_FAMILY, ModStoneBlocks.CRACKED_OVERGROWN_FANCY_CHALK_BRICKS_FAMILY,
            null, null, null, null, null, null, // Bronze fancy brick families (not implemented yet)
            null, null, null, null, null, null, // Silver fancy brick families (not implemented yet)
            null, null, null, null, null, null, // Gold fancy brick families (not implemented yet)
            ModStoneBlocks.SMOOTH_CHALK, ModStoneBlocks.SMOOTH_CHALK_SLAB,
            ModStoneBlocks.CRACKED_SMOOTH_CHALK, ModStoneBlocks.CRACKED_SMOOTH_CHALK_SLAB,
            ModStoneBlocks.MOSSY_SMOOTH_CHALK, ModStoneBlocks.MOSSY_SMOOTH_CHALK_SLAB,
            ModStoneBlocks.CRACKED_MOSSY_SMOOTH_CHALK, ModStoneBlocks.CRACKED_MOSSY_SMOOTH_CHALK_SLAB,
            ModStoneBlocks.OVERGROWN_SMOOTH_CHALK, ModStoneBlocks.OVERGROWN_SMOOTH_CHALK_SLAB,
            ModStoneBlocks.CRACKED_OVERGROWN_SMOOTH_CHALK, ModStoneBlocks.CRACKED_OVERGROWN_SMOOTH_CHALK_SLAB,
            null, null, null, null, null, null, null, null, // Bronze smooth blocks (not implemented yet)
            null, null, null, null, null, null, null, null, // Silver smooth blocks (not implemented yet)
            null, null, null, null, null, null, null, null, // Gold smooth blocks (not implemented yet)
            ModStoneBlocks.CHALK_PILLAR, ModStoneBlocks.CHALK_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_CHALK_PILLAR, ModStoneBlocks.CRACKED_CHALK_PILLAR_SLAB,
            ModStoneBlocks.MOSSY_CHALK_PILLAR, ModStoneBlocks.MOSSY_CHALK_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_MOSSY_CHALK_PILLAR, ModStoneBlocks.CRACKED_MOSSY_CHALK_PILLAR_SLAB,
            ModStoneBlocks.OVERGROWN_CHALK_PILLAR, ModStoneBlocks.OVERGROWN_CHALK_PILLAR_SLAB,
            ModStoneBlocks.CRACKED_OVERGROWN_CHALK_PILLAR, ModStoneBlocks.CRACKED_OVERGROWN_CHALK_PILLAR_SLAB,
            null, null, null, null, null, null, null, null, // Bronze pillar blocks (not implemented yet)
            null, null, null, null, null, null, null, null, // Silver pillar blocks (not implemented yet)
            null, null, null, null, null, null, null, null, // Gold pillar blocks (not implemented yet)
            "Chalk");

    private final BlockFamily stoneFamily;

    private final BlockFamily mossyStoneFamily;

    private final BlockFamily overgrownStoneFamily;

    private final BlockFamily cobbledFamily;

    private final BlockFamily mossyCobbledFamily;

    private final BlockFamily overgrownCobbledFamily;

    private final BlockFamily cobbledBrickFamily;
    private final BlockFamily crackedCobbledBrickFamily;

    private final BlockFamily mossyCobbledBrickFamily;
    private final BlockFamily crackedMossyCobbledBrickFamily;

    private final BlockFamily overgrownCobbledBrickFamily;
    private final BlockFamily crackedOvergrownCobbledBrickFamily;

    private final BlockFamily bronzeCobbledBrickFamily;
    private final BlockFamily crackedBronzeCobbledBrickFamily;

    private final BlockFamily mossyBronzeCobbledBrickFamily;
    private final BlockFamily crackedMossyBronzeCobbledBrickFamily;

    private final BlockFamily overgrownBronzeCobbledBrickFamily;
    private final BlockFamily crackedOvergrownBronzeCobbledBrickFamily;

    private final BlockFamily silverCobbledBrickFamily;
    private final BlockFamily crackedSilverCobbledBrickFamily;

    private final BlockFamily mossySilverCobbledBrickFamily;
    private final BlockFamily crackedMossySilverCobbledBrickFamily;

    private final BlockFamily overgrownSilverCobbledBrickFamily;
    private final BlockFamily crackedOvergrownSilverCobbledBrickFamily;

    private final BlockFamily goldCobbledBrickFamily;
    private final BlockFamily crackedGoldCobbledBrickFamily;

    private final BlockFamily mossyGoldCobbledBrickFamily;
    private final BlockFamily crackedMossyGoldCobbledBrickFamily;

    private final BlockFamily overgrownGoldCobbledBrickFamily;
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

    private final BlockFamily brickFamily;
    private final BlockFamily crackedBrickFamily;

    private final BlockFamily mossyBrickFamily;
    private final BlockFamily crackedMossyBrickFamily;

    private final BlockFamily overgrownBrickFamily;
    private final BlockFamily crackedOvergrownBrickFamily;

    private final BlockFamily bronzeBrickFamily;
    private final BlockFamily crackedBronzeBrickFamily;

    private final BlockFamily mossyBronzeBrickFamily;
    private final BlockFamily crackedMossyBronzeBrickFamily;

    private final BlockFamily overgrownBronzeBrickFamily;
    private final BlockFamily crackedOvergrownBronzeBrickFamily;

    private final BlockFamily silverBrickFamily;
    private final BlockFamily crackedSilverBrickFamily;

    private final BlockFamily mossySilverBrickFamily;
    private final BlockFamily crackedMossySilverBrickFamily;

    private final BlockFamily overgrownSilverBrickFamily;
    private final BlockFamily crackedOvergrownSilverBrickFamily;

    private final BlockFamily goldBrickFamily;
    private final BlockFamily crackedGoldBrickFamily;

    private final BlockFamily mossyGoldBrickFamily;
    private final BlockFamily crackedMossyGoldBrickFamily;

    private final BlockFamily overgrownGoldBrickFamily;
    private final BlockFamily crackedOvergrownGoldBrickFamily;

    private final BlockFamily tilesFamily;
    private final BlockFamily crackedTilesFamily;

    private final BlockFamily mossyTilesFamily;
    private final BlockFamily crackedMossyTilesFamily;

    private final BlockFamily overgrownTilesFamily;
    private final BlockFamily crackedOvergrownTilesFamily;

    private final BlockFamily bronzeTilesFamily;
    private final BlockFamily crackedBronzeTilesFamily;

    private final BlockFamily mossyBronzeTilesFamily;
    private final BlockFamily crackedMossyBronzeTilesFamily;

    private final BlockFamily overgrownBronzeTilesFamily;
    private final BlockFamily crackedOvergrownBronzeTilesFamily;

    private final BlockFamily silverTilesFamily;
    private final BlockFamily crackedSilverTilesFamily;

    private final BlockFamily mossySilverTilesFamily;
    private final BlockFamily crackedMossySilverTilesFamily;

    private final BlockFamily overgrownSilverTilesFamily;
    private final BlockFamily crackedOvergrownSilverTilesFamily;

    private final BlockFamily goldTilesFamily;
    private final BlockFamily crackedGoldTilesFamily;

    private final BlockFamily mossyGoldTilesFamily;
    private final BlockFamily crackedMossyGoldTilesFamily;

    private final BlockFamily overgrownGoldTilesFamily;
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

    private final BlockFamily pavementFamily;
    private final BlockFamily crackedPavementFamily;

    private final BlockFamily mossyPavementFamily;
    private final BlockFamily crackedMossyPavementFamily;

    private final BlockFamily overgrownPavementFamily;
    private final BlockFamily crackedOvergrownPavementFamily;

    private final BlockFamily bronzePavementFamily;
    private final BlockFamily crackedBronzePavementFamily;

    private final BlockFamily mossyBronzePavementFamily;
    private final BlockFamily crackedMossyBronzePavementFamily;

    private final BlockFamily overgrownBronzePavementFamily;
    private final BlockFamily crackedOvergrownBronzePavementFamily;

    private final BlockFamily silverPavementFamily;
    private final BlockFamily crackedSilverPavementFamily;

    private final BlockFamily mossySilverPavementFamily;
    private final BlockFamily crackedMossySilverPavementFamily;

    private final BlockFamily overgrownSilverPavementFamily;
    private final BlockFamily crackedOvergrownSilverPavementFamily;

    private final BlockFamily goldPavementFamily;
    private final BlockFamily crackedGoldPavementFamily;

    private final BlockFamily mossyGoldPavementFamily;
    private final BlockFamily crackedMossyGoldPavementFamily;

    private final BlockFamily overgrownGoldPavementFamily;
    private final BlockFamily crackedOvergrownGoldPavementFamily;

    private final BlockFamily fancyBricksFamily;
    private final BlockFamily crackedFancyBricksFamily;

    private final BlockFamily mossyFancyBricksFamily;
    private final BlockFamily crackedMossyFancyBricksFamily;

    private final BlockFamily overgrownFancyBricksFamily;
    private final BlockFamily crackedOvergrownFancyBricksFamily;

    private final BlockFamily bronzeFancyBricksFamily;
    private final BlockFamily crackedBronzeFancyBricksFamily;

    private final BlockFamily mossyBronzeFancyBricksFamily;
    private final BlockFamily crackedMossyBronzeFancyBricksFamily;

    private final BlockFamily overgrownBronzeFancyBricksFamily;
    private final BlockFamily crackedOvergrownBronzeFancyBricksFamily;

    private final BlockFamily silverFancyBricksFamily;
    private final BlockFamily crackedSilverFancyBricksFamily;

    private final BlockFamily mossySilverFancyBricksFamily;
    private final BlockFamily crackedMossySilverFancyBricksFamily;

    private final BlockFamily overgrownSilverFancyBricksFamily;
    private final BlockFamily crackedOvergrownSilverFancyBricksFamily;

    private final BlockFamily goldFancyBricksFamily;
    private final BlockFamily crackedGoldFancyBricksFamily;

    private final BlockFamily mossyGoldFancyBricksFamily;
    private final BlockFamily crackedMossyGoldFancyBricksFamily;

    private final BlockFamily overgrownGoldFancyBricksFamily;
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
        this.stoneFamily = stoneFamily;
        this.mossyStoneFamily = mossyStoneFamily;
        this.overgrownStoneFamily = overgrownStoneFamily;

        this.cobbledFamily = cobbledFamily;
        this.mossyCobbledFamily = mossyCobbledFamily;
        this.overgrownCobbledFamily = overgrownCobbledFamily;

        this.cobbledBrickFamily = cobbledBrickFamily;
        this.crackedCobbledBrickFamily = crackedCobbledBrickFamily;
        this.mossyCobbledBrickFamily = mossyCobbledBrickFamily;
        this.crackedMossyCobbledBrickFamily = crackedMossyCobbledBrickFamily;
        this.overgrownCobbledBrickFamily = overgrownCobbledBrickFamily;
        this.crackedOvergrownCobbledBrickFamily = crackedOvergrownCobbledBrickFamily;

        this.bronzeCobbledBrickFamily = bronzeCobbledBrickFamily;
        this.crackedBronzeCobbledBrickFamily = crackedBronzeCobbledBrickFamily;
        this.mossyBronzeCobbledBrickFamily = mossyBronzeCobbledBrickFamily;
        this.crackedMossyBronzeCobbledBrickFamily = crackedMossyBronzeCobbledBrickFamily;
        this.overgrownBronzeCobbledBrickFamily = overgrownBronzeCobbledBrickFamily;
        this.crackedOvergrownBronzeCobbledBrickFamily = crackedOvergrownBronzeCobbledBrickFamily;

        this.silverCobbledBrickFamily = silverCobbledBrickFamily;
        this.crackedSilverCobbledBrickFamily = crackedSilverCobbledBrickFamily;
        this.mossySilverCobbledBrickFamily = mossySilverCobbledBrickFamily;
        this.crackedMossySilverCobbledBrickFamily = crackedMossySilverCobbledBrickFamily;
        this.overgrownSilverCobbledBrickFamily = overgrownSilverCobbledBrickFamily;
        this.crackedOvergrownSilverCobbledBrickFamily = crackedOvergrownSilverCobbledBrickFamily;

        this.goldCobbledBrickFamily = goldCobbledBrickFamily;
        this.crackedGoldCobbledBrickFamily = crackedGoldCobbledBrickFamily;
        this.mossyGoldCobbledBrickFamily = mossyGoldCobbledBrickFamily;
        this.crackedMossyGoldCobbledBrickFamily = crackedMossyGoldCobbledBrickFamily;
        this.overgrownGoldCobbledBrickFamily = overgrownGoldCobbledBrickFamily;
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

        this.brickFamily = brickFamily;
        this.crackedBrickFamily = crackedBrickFamily;
        this.mossyBrickFamily = mossyBrickFamily;
        this.crackedMossyBrickFamily = crackedMossyBrickFamily;
        this.overgrownBrickFamily = overgrownBrickFamily;
        this.crackedOvergrownBrickFamily = crackedOvergrownBrickFamily;

        this.bronzeBrickFamily = bronzeBrickFamily;
        this.crackedBronzeBrickFamily = crackedBronzeBrickFamily;
        this.mossyBronzeBrickFamily = mossyBronzeBrickFamily;
        this.crackedMossyBronzeBrickFamily = crackedMossyBronzeBrickFamily;
        this.overgrownBronzeBrickFamily = overgrownBronzeBrickFamily;
        this.crackedOvergrownBronzeBrickFamily = crackedOvergrownBronzeBrickFamily;

        this.silverBrickFamily = silverBrickFamily;
        this.crackedSilverBrickFamily = crackedSilverBrickFamily;
        this.mossySilverBrickFamily = mossySilverBrickFamily;
        this.crackedMossySilverBrickFamily = crackedMossySilverBrickFamily;
        this.overgrownSilverBrickFamily = overgrownSilverBrickFamily;
        this.crackedOvergrownSilverBrickFamily = crackedOvergrownSilverBrickFamily;

        this.goldBrickFamily = goldBrickFamily;
        this.crackedGoldBrickFamily = crackedGoldBrickFamily;
        this.mossyGoldBrickFamily = mossyGoldBrickFamily;
        this.crackedMossyGoldBrickFamily = crackedMossyGoldBrickFamily;
        this.overgrownGoldBrickFamily = overgrownGoldBrickFamily;
        this.crackedOvergrownGoldBrickFamily = crackedOvergrownGoldBrickFamily;

        this.tilesFamily = tilesFamily;
        this.crackedTilesFamily = crackedTilesFamily;
        this.mossyTilesFamily = mossyTilesFamily;
        this.crackedMossyTilesFamily = crackedMossyTilesFamily;
        this.overgrownTilesFamily = overgrownTilesFamily;
        this.crackedOvergrownTilesFamily = crackedOvergrownTilesFamily;

        this.bronzeTilesFamily = bronzeTilesFamily;
        this.crackedBronzeTilesFamily = crackedBronzeTilesFamily;
        this.mossyBronzeTilesFamily = mossyBronzeTilesFamily;
        this.crackedMossyBronzeTilesFamily = crackedMossyBronzeTilesFamily;
        this.overgrownBronzeTilesFamily = overgrownBronzeTilesFamily;
        this.crackedOvergrownBronzeTilesFamily = crackedOvergrownBronzeTilesFamily;

        this.silverTilesFamily = silverTilesFamily;
        this.crackedSilverTilesFamily = crackedSilverTilesFamily;
        this.mossySilverTilesFamily = mossySilverTilesFamily;
        this.crackedMossySilverTilesFamily = crackedMossySilverTilesFamily;
        this.overgrownSilverTilesFamily = overgrownSilverTilesFamily;
        this.crackedOvergrownSilverTilesFamily = crackedOvergrownSilverTilesFamily;

        this.goldTilesFamily = goldTilesFamily;
        this.crackedGoldTilesFamily = crackedGoldTilesFamily;
        this.mossyGoldTilesFamily = mossyGoldTilesFamily;
        this.crackedMossyGoldTilesFamily = crackedMossyGoldTilesFamily;
        this.overgrownGoldTilesFamily = overgrownGoldTilesFamily;
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

        this.pavementFamily = pavementFamily;
        this.crackedPavementFamily = crackedPavementFamily;
        this.mossyPavementFamily = mossyPavementFamily;
        this.crackedMossyPavementFamily = crackedMossyPavementFamily;
        this.overgrownPavementFamily = overgrownPavementFamily;
        this.crackedOvergrownPavementFamily = crackedOvergrownPavementFamily;

        this.bronzePavementFamily = bronzePavementFamily;
        this.crackedBronzePavementFamily = crackedBronzePavementFamily;
        this.mossyBronzePavementFamily = mossyBronzePavementFamily;
        this.crackedMossyBronzePavementFamily = crackedMossyBronzePavementFamily;
        this.overgrownBronzePavementFamily = overgrownBronzePavementFamily;
        this.crackedOvergrownBronzePavementFamily = crackedOvergrownBronzePavementFamily;

        this.silverPavementFamily = silverPavementFamily;
        this.crackedSilverPavementFamily = crackedSilverPavementFamily;
        this.mossySilverPavementFamily = mossySilverPavementFamily;
        this.crackedMossySilverPavementFamily = crackedMossySilverPavementFamily;
        this.overgrownSilverPavementFamily = overgrownSilverPavementFamily;
        this.crackedOvergrownSilverPavementFamily = crackedOvergrownSilverPavementFamily;

        this.goldPavementFamily = goldPavementFamily;
        this.crackedGoldPavementFamily = crackedGoldPavementFamily;
        this.mossyGoldPavementFamily = mossyGoldPavementFamily;
        this.crackedMossyGoldPavementFamily = crackedMossyGoldPavementFamily;
        this.overgrownGoldPavementFamily = overgrownGoldPavementFamily;
        this.crackedOvergrownGoldPavementFamily = crackedOvergrownGoldPavementFamily;

        this.fancyBricksFamily = fancyBricksFamily;
        this.crackedFancyBricksFamily = crackedFancyBricksFamily;
        this.mossyFancyBricksFamily = mossyFancyBricksFamily;
        this.crackedMossyFancyBricksFamily = crackedMossyFancyBricksFamily;
        this.overgrownFancyBricksFamily = overgrownFancyBricksFamily;
        this.crackedOvergrownFancyBricksFamily = crackedOvergrownFancyBricksFamily;

        this.bronzeFancyBricksFamily = bronzeFancyBricksFamily;
        this.crackedBronzeFancyBricksFamily = crackedBronzeFancyBricksFamily;
        this.mossyBronzeFancyBricksFamily = mossyBronzeFancyBricksFamily;
        this.crackedMossyBronzeFancyBricksFamily = crackedMossyBronzeFancyBricksFamily;
        this.overgrownBronzeFancyBricksFamily = overgrownBronzeFancyBricksFamily;
        this.crackedOvergrownBronzeFancyBricksFamily = crackedOvergrownBronzeFancyBricksFamily;

        this.silverFancyBricksFamily = silverFancyBricksFamily;
        this.crackedSilverFancyBricksFamily = crackedSilverFancyBricksFamily;
        this.mossySilverFancyBricksFamily = mossySilverFancyBricksFamily;
        this.crackedMossySilverFancyBricksFamily = crackedMossySilverFancyBricksFamily;
        this.overgrownSilverFancyBricksFamily = overgrownSilverFancyBricksFamily;
        this.crackedOvergrownSilverFancyBricksFamily = crackedOvergrownSilverFancyBricksFamily;

        this.goldFancyBricksFamily = goldFancyBricksFamily;
        this.crackedGoldFancyBricksFamily = crackedGoldFancyBricksFamily;
        this.mossyGoldFancyBricksFamily = mossyGoldFancyBricksFamily;
        this.crackedMossyGoldFancyBricksFamily = crackedMossyGoldFancyBricksFamily;
        this.overgrownGoldFancyBricksFamily = overgrownGoldFancyBricksFamily;
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

        itemGroupList.add(new ItemStack(stoneFamily.getVariant(BlockFamily.Variant.BUTTON)));
        itemGroupList.add(new ItemStack(stoneFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE)));
        itemGroupList.add(new ItemStack(mossyStoneFamily.getVariant(BlockFamily.Variant.BUTTON)));
        itemGroupList.add(new ItemStack(mossyStoneFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE)));
		itemGroupList.add(new ItemStack(overgrownStoneFamily.getVariant(BlockFamily.Variant.BUTTON)));
		itemGroupList.add(new ItemStack(overgrownStoneFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE)));
	    itemGroupList.add(new ItemStack(cobbledFamily.getVariant(BlockFamily.Variant.BUTTON)));
	    itemGroupList.add(new ItemStack(cobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE)));
	    itemGroupList.add(new ItemStack(mossyCobbledFamily.getVariant(BlockFamily.Variant.BUTTON)));
	    itemGroupList.add(new ItemStack(mossyCobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE)));
	    itemGroupList.add(new ItemStack(overgrownCobbledFamily.getVariant(BlockFamily.Variant.BUTTON)));
	    itemGroupList.add(new ItemStack(overgrownCobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE)));

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
        HashMap<StoneTypeVariants, Block> pillarBlocks = new HashMap<>();

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
        HashMap<StoneTypeVariants, Block> pillarSlabs = new HashMap<>();

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
        HashMap<StoneTypeVariants, Block> smoothStones = new HashMap<>();

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
        HashMap<StoneTypeVariants, Block> smoothStoneSlabs = new HashMap<>();

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
				return stoneFamily.getBaseBlock();
		    }
		    case "stairs" -> {
				return stoneFamily.getVariant(BlockFamily.Variant.STAIRS);
		    }
		    case "slab" -> {
				return stoneFamily.getVariant(BlockFamily.Variant.SLAB);
		    }
		    case "wall" -> {
				return stoneFamily.getVariant(BlockFamily.Variant.WALL);
		    }
		    case "button" -> {
				return stoneFamily.getVariant(BlockFamily.Variant.BUTTON);
		    }
		    case "pressure_plate" -> {
				return stoneFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
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
			    return mossyStoneFamily.getBaseBlock();
		    }
		    case "stairs" -> {
			    return mossyStoneFamily.getVariant(BlockFamily.Variant.STAIRS);
		    }
		    case "slab" -> {
			    return mossyStoneFamily.getVariant(BlockFamily.Variant.SLAB);
		    }
		    case "wall" -> {
			    return mossyStoneFamily.getVariant(BlockFamily.Variant.WALL);
		    }
		    case "button" -> {
			    return mossyStoneFamily.getVariant(BlockFamily.Variant.BUTTON);
		    }
		    case "pressure_plate" -> {
			    return mossyStoneFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
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
		        return overgrownStoneFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return overgrownStoneFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return overgrownStoneFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return overgrownStoneFamily.getVariant(BlockFamily.Variant.WALL);
	        }
	        case "button" -> {
		        return overgrownStoneFamily.getVariant(BlockFamily.Variant.BUTTON);
	        }
	        case "pressure_plate" -> {
		        return overgrownStoneFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
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
			    return cobbledFamily.getBaseBlock();
		    }
		    case "stairs" -> {
			    return cobbledFamily.getVariant(BlockFamily.Variant.STAIRS);
		    }
		    case "slab" -> {
			    return cobbledFamily.getVariant(BlockFamily.Variant.SLAB);
		    }
		    case "wall" -> {
			    return cobbledFamily.getVariant(BlockFamily.Variant.WALL);
		    }
		    case "button" -> {
			    return cobbledFamily.getVariant(BlockFamily.Variant.BUTTON);
		    }
		    case "pressure_plate" -> {
			    return cobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
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
		        return mossyCobbledFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return mossyCobbledFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return mossyCobbledFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return mossyCobbledFamily.getVariant(BlockFamily.Variant.WALL);
	        }
	        case "button" -> {
		        return mossyCobbledFamily.getVariant(BlockFamily.Variant.BUTTON);
	        }
	        case "pressure_plate" -> {
		        return mossyCobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
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
			    return overgrownCobbledFamily.getBaseBlock();
		    }
		    case "stairs" -> {
			    return overgrownCobbledFamily.getVariant(BlockFamily.Variant.STAIRS);
		    }
		    case "slab" -> {
			    return overgrownCobbledFamily.getVariant(BlockFamily.Variant.SLAB);
		    }
		    case "wall" -> {
			    return overgrownCobbledFamily.getVariant(BlockFamily.Variant.WALL);
		    }
		    case "button" -> {
			    return overgrownCobbledFamily.getVariant(BlockFamily.Variant.BUTTON);
		    }
		    case "pressure_plate" -> {
			    return overgrownCobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
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
				return cobbledBrickFamily.getBaseBlock();
		    }
		    case "stairs" -> {
				return cobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
		    }
		    case "slab" -> {
				return cobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
		    }
		    case "wall" -> {
				return cobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
			    return mossyCobbledBrickFamily.getBaseBlock();
		    }
		    case "stairs" -> {
			    return mossyCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
		    }
		    case "slab" -> {
			    return mossyCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
		    }
		    case "wall" -> {
			    return mossyCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedMossyCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedMossyCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedMossyCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedMossyCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
			    return overgrownCobbledBrickFamily.getBaseBlock();
		    }
		    case "stairs" -> {
			    return overgrownCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
		    }
		    case "slab" -> {
			    return overgrownCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
		    }
		    case "wall" -> {
			    return overgrownCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedOvergrownCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedOvergrownCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedOvergrownCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedOvergrownCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return bronzeCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return bronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return bronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return bronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedBronzeCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return mossyBronzeCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return mossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return mossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return mossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedMossyBronzeCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedMossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedMossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedMossyBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return overgrownBronzeCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return overgrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return overgrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return overgrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedOvergrownBronzeCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedOvergrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedOvergrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedOvergrownBronzeCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return silverCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return silverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return silverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return silverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedSilverCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return mossySilverCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return mossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return mossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return mossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedMossySilverCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedMossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedMossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedMossySilverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return overgrownSilverCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return overgrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return overgrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return overgrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedOvergrownSilverCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedOvergrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedOvergrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedOvergrownSilverCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return goldCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return goldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return goldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return goldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedGoldCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return mossyGoldCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return mossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return mossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return mossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedMossyGoldCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedMossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedMossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedMossyGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return overgrownGoldCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return overgrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return overgrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return overgrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
		        return crackedOvergrownGoldCobbledBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
		        return crackedOvergrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
		        return crackedOvergrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
		        return crackedOvergrownGoldCobbledBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return brickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return brickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return brickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return brickFamily.getVariant(BlockFamily.Variant.WALL);
	        }
	        case "chiseled" -> {
	            return brickFamily.getVariant(BlockFamily.Variant.CHISELED);
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
	            return crackedBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossyBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossyBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossyBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossyBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return bronzeBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return bronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return bronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return bronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedBronzeBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedBronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedBronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedBronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossyBronzeBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyBronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyBronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossyBronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossyBronzeBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyBronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyBronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossyBronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownBronzeBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownBronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownBronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownBronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownBronzeBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownBronzeBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownBronzeBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownBronzeBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return silverBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return silverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return silverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return silverBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedSilverBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedSilverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedSilverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedSilverBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossySilverBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossySilverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossySilverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossySilverBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossySilverBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossySilverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossySilverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossySilverBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownSilverBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownSilverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownSilverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownSilverBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownSilverBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownSilverBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownSilverBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownSilverBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return goldBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return goldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return goldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return goldBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedGoldBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedGoldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedGoldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedGoldBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossyGoldBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyGoldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyGoldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossyGoldBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossyGoldBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyGoldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyGoldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossyGoldBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownGoldBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownGoldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownGoldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownGoldBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownGoldBrickFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownGoldBrickFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownGoldBrickFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownGoldBrickFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return tilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return tilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return tilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return tilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossyTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossyTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossyTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossyTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return bronzeTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return bronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return bronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return bronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedBronzeTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedBronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedBronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedBronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossyBronzeTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyBronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyBronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossyBronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossyBronzeTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyBronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyBronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossyBronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownBronzeTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownBronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownBronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownBronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownBronzeTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownBronzeTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownBronzeTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownBronzeTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return silverTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return silverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return silverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return silverTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedSilverTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedSilverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedSilverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedSilverTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossySilverTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossySilverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossySilverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossySilverTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossySilverTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossySilverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossySilverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossySilverTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownSilverTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownSilverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownSilverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownSilverTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownSilverTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownSilverTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownSilverTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownSilverTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return goldTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return goldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return goldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return goldTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedGoldTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedGoldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedGoldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedGoldTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossyGoldTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyGoldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyGoldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossyGoldTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossyGoldTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyGoldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyGoldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossyGoldTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownGoldTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownGoldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownGoldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownGoldTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownGoldTilesFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownGoldTilesFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownGoldTilesFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownGoldTilesFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return pavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return pavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return pavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return mossyPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedMossyPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return overgrownPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedOvergrownPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return bronzePavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return bronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return bronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedBronzePavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedBronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedBronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return mossyBronzePavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyBronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyBronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedMossyBronzePavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyBronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyBronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return overgrownBronzePavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownBronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownBronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedOvergrownBronzePavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownBronzePavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownBronzePavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return silverPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return silverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return silverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedSilverPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedSilverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedSilverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return mossySilverPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossySilverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossySilverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedMossySilverPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossySilverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossySilverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return overgrownSilverPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownSilverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownSilverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedOvergrownSilverPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownSilverPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownSilverPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return goldPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return goldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return goldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedGoldPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedGoldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedGoldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return mossyGoldPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyGoldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyGoldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedMossyGoldPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyGoldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyGoldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return overgrownGoldPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownGoldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownGoldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return crackedOvergrownGoldPavementFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownGoldPavementFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownGoldPavementFamily.getVariant(BlockFamily.Variant.SLAB);
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
	            return fancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return fancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return fancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return fancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossyFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossyFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossyFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossyFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return bronzeFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return bronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return bronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return bronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedBronzeFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossyBronzeFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossyBronzeFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossyBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownBronzeFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownBronzeFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownBronzeFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return silverFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return silverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return silverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return silverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedSilverFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedSilverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedSilverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedSilverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossySilverFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossySilverFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossySilverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownSilverFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownSilverFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownSilverFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return goldFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return goldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return goldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return goldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedGoldFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedGoldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedGoldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedGoldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return mossyGoldFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return mossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return mossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return mossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedMossyGoldFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedMossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedMossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedMossyGoldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return overgrownGoldFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return overgrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return overgrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return overgrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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
	            return crackedOvergrownGoldFancyBricksFamily.getBaseBlock();
	        }
	        case "stairs" -> {
	            return crackedOvergrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.STAIRS);
	        }
	        case "slab" -> {
	            return crackedOvergrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.SLAB);
	        }
	        case "wall" -> {
	            return crackedOvergrownGoldFancyBricksFamily.getVariant(BlockFamily.Variant.WALL);
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