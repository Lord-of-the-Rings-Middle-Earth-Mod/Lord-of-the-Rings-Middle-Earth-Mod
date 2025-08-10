package me.anedhel.lotrmiddleearth.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import me.anedhel.lotrmiddleearth.LordOfTheRingsMiddleEarthMod;

public class ModBlocks {
    
    // Chalk blocks
    public static final Block CHALK = registerBlock("chalk",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALK_BRICK = registerBlock("chalk_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALK_PAVEMENT = registerBlock("chalk_pavement",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALK_TILES = registerBlock("chalk_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_CHALK_BRICK = registerBlock("chiseled_chalk_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_CHALK = registerBlock("cobbled_chalk",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_CHALK_BRICKS = registerBlock("cobbled_chalk_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_CHALK = registerBlock("smooth_chalk",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block FANCY_CHALK_BRICKS = registerBlock("fancy_chalk_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE)));

    // Cracked variants
    public static final Block CRACKED_CHALK_BRICK = registerBlock("cracked_chalk_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_CHALK_PAVEMENT = registerBlock("cracked_chalk_pavement",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_CHALK_TILES = registerBlock("cracked_chalk_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_COBBLED_CHALK_BRICKS = registerBlock("cracked_cobbled_chalk_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_FANCY_CHALK_BRICKS = registerBlock("cracked_fancy_chalk_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_SMOOTH_CHALK = registerBlock("cracked_smooth_chalk",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).sounds(BlockSoundGroup.STONE)));

    // Pillar blocks
    public static final Block CHALK_PILLAR = registerBlock("chalk_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_CHALK_PILLAR = registerBlock("cracked_chalk_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    // Slabs
    public static final Block CHALK_SLAB = registerBlock("chalk_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALK_BRICK_SLAB = registerBlock("chalk_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALK_PAVEMENT_SLAB = registerBlock("chalk_pavement_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALK_TILES_SLAB = registerBlock("chalk_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_CHALK_SLAB = registerBlock("cobbled_chalk_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB).sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_CHALK_BRICKS_SLAB = registerBlock("cobbled_chalk_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_CHALK_SLAB = registerBlock("smooth_chalk_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB).sounds(BlockSoundGroup.STONE)));
    public static final Block FANCY_CHALK_BRICKS_SLAB = registerBlock("fancy_chalk_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).sounds(BlockSoundGroup.STONE)));

    // Stairs
    public static final Block CHALK_STAIRS = registerBlock("chalk_stairs",
            new StairsBlock(CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALK_BRICK_STAIRS = registerBlock("chalk_brick_stairs",
            new StairsBlock(CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALK_PAVEMENT_STAIRS = registerBlock("chalk_pavement_stairs",
            new StairsBlock(CHALK_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALK_TILES_STAIRS = registerBlock("chalk_tiles_stairs",
            new StairsBlock(CHALK_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_CHALK_STAIRS = registerBlock("cobbled_chalk_stairs",
            new StairsBlock(COBBLED_CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS).sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_CHALK_BRICKS_STAIRS = registerBlock("cobbled_chalk_bricks_stairs",
            new StairsBlock(COBBLED_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_CHALK_STAIRS = registerBlock("smooth_chalk_stairs",
            new StairsBlock(SMOOTH_CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).sounds(BlockSoundGroup.STONE)));
    public static final Block FANCY_CHALK_BRICKS_STAIRS = registerBlock("fancy_chalk_bricks_stairs",
            new StairsBlock(FANCY_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).sounds(BlockSoundGroup.STONE)));

    // Walls
    public static final Block CHALK_WALL = registerBlock("chalk_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALK_BRICK_WALL = registerBlock("chalk_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALK_PAVEMENT_WALL = registerBlock("chalk_pavement_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_CHALK_WALL = registerBlock("cobbled_chalk_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_CHALK_BRICKS_WALL = registerBlock("cobbled_chalk_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering ModBlocks for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}