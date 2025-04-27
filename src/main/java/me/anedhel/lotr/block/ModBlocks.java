/*
 * Copyright (c)
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * lord-of-the-rings-middle-earth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * lord-of-the-rings-middle-earth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotr.block;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.block.custom.crops.CornCropBlock;
import me.anedhel.lotr.block.custom.crops.LettuceCropBlock;
import me.anedhel.lotr.block.custom.crops.TomatoCropBlock;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * This class is used to register all Custom Blocks.
 */
public class ModBlocks {

    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK)));
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));

    public static final Block WILD_BEETROOT = registerBlock("wild_beetroot",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_WILD_BEETROOT = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "potted_wild_beetroot"),
            new FlowerPotBlock(WILD_BEETROOT, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block WILD_CARROT = registerBlock("wild_carrot",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_WILD_CARROT = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "potted_wild_carrot"),
            new FlowerPotBlock(WILD_CARROT, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block WILD_POTATO = registerBlock("wild_potato",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_WILD_POTATO = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "potted_wild_potato"),
            new FlowerPotBlock(WILD_POTATO, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block WILD_CORN = registerBlock("wild_corn",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)));
    public static final Block WILD_LETTUCE = registerBlock("wild_lettuce",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_WILD_LETTUCE = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "potted_wild_lettuce"),
            new FlowerPotBlock(WILD_LETTUCE, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block WILD_TOMATO = registerBlock("wild_tomato",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_WILD_TOMATO = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "potted_wild_tomato"),
            new FlowerPotBlock(WILD_TOMATO, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block POTATO_CRATE = registerBlock("potato_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));
    public static final Block CARROT_CRATE = registerBlock("carrot_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));
    public static final Block BEETROOT_CRATE = registerBlock("beetroot_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));

    public static final Block TOMATO_CRATE = registerBlock("tomato_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));
    public static final Block LETTUCE_CRATE = registerBlock("lettuce_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));
    public static final Block CORN_CRATE = registerBlock("corn_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));

    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block LETTUCE_CROP = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lettuce_crop"),
            new LettuceCropBlock(FabricBlockSettings.copyOf(Blocks.BEETROOTS)));
    public static final Block CORN_CROP = Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "corn_crop"),
            new CornCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    /**
     * This Method is used to register a Block with minecraft and also register the Item for the block
     * @param name the name of the Block
     * @param block the Block to be registered
     * @return The Block after it has been registered
     */

    private static Block registerBlock (String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,
                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name),
                block);
    }

    /**
     * This Method is used to register a Block Item with minecraft
     * @param name The name of the Block
     * @param block The Block to be registered as Item
     * @return The BlockItem after it has been registered
     */
    private static Item registerBlockItem (String name, Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    /**
     * This Method is run on startup and informs that Blocks are being registered.
     */
    public static void registerModBlocks () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod Blocks for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
        ModWoodBlocks.registerModWoodBlocks();
        ModStoneBlocks.registerModStoneBlocks();
    }
}
