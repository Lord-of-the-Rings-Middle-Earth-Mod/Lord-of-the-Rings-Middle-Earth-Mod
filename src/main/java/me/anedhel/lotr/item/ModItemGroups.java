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

package me.anedhel.lotr.item;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.block.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * This class is used to manage all ItemGroups the Mod uses and adds.
 *
 * The warnings, that the ItemGroups are not used, can be ignored.
 */
public class ModItemGroups {

    public static final ItemGroup LOTR_STONES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_stones"),
            FabricItemGroup.builder()
                    .displayName(Text.translatableWithFallback("itemgroup.lotr_stone", "LotR Stones"))
                    .icon(() -> new ItemStack(ModStoneBlocks.BLUESLATE)).entries(((displayContext, entries) -> {
                        //There will be more lines in this lambda statement hence we don´t use an expression
                        entries.addAll(ModStoneType.BLUESLATE.getLotRStoneItemGroupList());
                    })).build());

    public static final ItemGroup LOTR_WOOD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_wood"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_wood", "LotR Wood"))
                    .icon(() -> new ItemStack(ModWoodBlocks.PINE_LOG)).entries(((displayContext, entries) -> {
                        //There will be more lines in this lambda statement hence we don´t use an expression
                        entries.addAll(ModWoodType.PINE.getItemGroupList());
                    })).build());

    public static final ItemGroup LOTR_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_blocks"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_blocks", "LotR Blocks"))
                    .icon(() -> new ItemStack(ModStoneBlocks.BLUESLATE)).entries((displayContext, entries) -> {
                        entries.addAll(ModOreType.TIN_ORE.getBlockItemGroupList());
                        entries.add(ModBlocks.BRONZE_BLOCK);
                    }).build());

    public static final ItemGroup LOTR_FOOD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_food"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_food", "LotR Food"))
                    .icon(() -> new ItemStack(ModItems.TOMATO)).entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.BEETROOT_CRATE);
                        entries.add(ModBlocks.CARROT_CRATE);
                        entries.add(ModBlocks.POTATO_CRATE);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.BAKED_TOMATO);
                        entries.add(ModBlocks.TOMATO_CRATE);
                        entries.add(ModItems.CORN);
                        entries.add(ModItems.COOKED_CORN);
                        entries.add(ModBlocks.CORN_CRATE);
                    })).build());

    public static final ItemGroup LOTR_PLANTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_plants"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_plants", "LotR Plants"))
                    .icon(() -> new ItemStack(ModItems.TOMATO_SEEDS)).entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.WILD_BEETROOT);
                        entries.add(ModBlocks.WILD_CARROT);
                        entries.add(ModBlocks.WILD_POTATO);
                        entries.add(ModBlocks.WILD_CORN);
                        entries.add(ModBlocks.WILD_LETTUCE);
                        entries.add(ModBlocks.WILD_TOMATO);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.LETTUCE);
                        entries.add(ModBlocks.LETTUCE_CRATE);
                        entries.add(ModItems.CORN_SEEDS);
                        entries.addAll(ModWoodType.PINE.getItemGroupPlantList());
                    })).build());

    public static final ItemGroup LOTR_INGREDIENTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_ingredients"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_ingredients", "LotR Ingredients"))
                    .icon(() -> new ItemStack(ModItems.TIN_INGOT)).entries((displayContext, entries) -> {
                        entries.addAll(ModOreType.TIN_ORE.getIngredientsItemGroupList());
			            entries.add(ModGearType.BRONZE.getMaterial());
                    }).build());

    public static final ItemGroup LOTR_TOOLS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_tools"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_tools", "LotR Tools"))
                    .icon(() -> new ItemStack(ModItems.BRONZE_AXE)).entries((displayContext, entries) -> {
                        //There will be more lines in this lambda statement hence we don´t use an expression
                        entries.addAll(ModGearType.BRONZE.getToolItemGroupList());
                    }).build());

    public static final ItemGroup LOTR_TRANSPORT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_transport"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_transport", "LotR Transport"))
                    .icon(() -> new ItemStack(ModItems.PINE_BOAT)).entries(((displayContext, entries) -> {
                        //There will be more lines in this lambda statement hence we don´t use an expression
                        entries.addAll(ModWoodType.PINE.getItemGroupTransportList());
                    })).build());

    public static final ItemGroup LOTR_COMBAT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_combat"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_combat", "LotR Combar"))
                    .icon(() -> new ItemStack(ModItems.BRONZE_SWORD)).entries((displayContext, entries) -> {
                        //There will be more lines in this lambda statement hence we don´t use an expression
                        entries.addAll(ModGearType.BRONZE.getCombatItemGroupList());
                    }).build());

    public static final ItemGroup LOTR_SPAWNING = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_spawning"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_spawning", "LotR Spawning"))
                    .icon(() -> new ItemStack(ModItems.HOBBIT_SPAWN_EGG)).entries((displayContext, entries) -> {
                        //There will be more lines in this lambda statement hence we don´t use an expression
                        entries.add(ModItems.HOBBIT_SPAWN_EGG);
                    }).build());

    /**
     * This Method is run on startup and informs that ItemGroups are being registered.
     */
    public static void registerModItemGroups () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod ItemGroups for " + LordOfTheRingsMiddleEarthMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(content -> {
            for(ModStoneType stoneType : ModStoneType.values()) {
                content.addAll(stoneType.getRedstoneItemGroupList());
            }
        });
    }
}
