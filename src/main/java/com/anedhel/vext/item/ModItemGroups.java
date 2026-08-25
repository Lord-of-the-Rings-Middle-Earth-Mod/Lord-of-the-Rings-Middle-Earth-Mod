/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.item;

import com.anedhel.vext.VExtMod;
import com.anedhel.vext.block.ModBlocks;
import com.anedhel.vext.block.stonetypes.BlueslateBlocks;
import com.anedhel.vext.block.woodtypes.PineBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * This class is responsible for creating and registering custom item groups for the mod.
 * <p>
 * The order of the items within each group is determined by the order they are added in the entries method.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModItemGroups {

	public static final ItemGroup VEXT_BLOCKS = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(VExtMod.MOD_ID, "vext_blocks"), FabricItemGroup.builder().displayName(
							Text.translatableWithFallback("itemgroup.vext_blocks", "VEXT Blocks"))
					.icon(() -> new ItemStack(ModBlocks.TIN_BLOCK))
					.entries(((displayContext, entries) -> {
						entries.addAll(PineBlocks.PINE_SET.getWoodItemGroupList());
						entries.add(ModBlocks.CARPENTRY_TABLE);
						entries.add(ModBlocks.TIN_ORE);
						entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
						entries.add(ModBlocks.SILVER_ORE);
						entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
						entries.add(ModBlocks.RAW_TIN_BLOCK);
						entries.add(ModBlocks.TIN_BLOCK);
						entries.add(ModBlocks.RAW_SILVER_BLOCK);
						entries.add(ModBlocks.SILVER_BLOCK);
						entries.add(ModBlocks.BRONZE_BLOCK);
					})).build());

	public static final ItemGroup VEXT_STONE = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(VExtMod.MOD_ID, "vext_stone"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.vext_stone", "VEXT Stone"))
					.icon(() -> new ItemStack(BlueslateBlocks.BLUESLATE))
					.entries(((displayContext, entries) -> {
						entries.addAll(BlueslateBlocks.BLUESLATE_SET.getStoneItemGroupList());
					})).build());

	public static final ItemGroup VEXT_INGREDIENTS = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(VExtMod.MOD_ID, "vext_ingredients"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.vext_ingredients", "VEXT Ingredients"))
					.icon(ModItems.TIN_INGOT::getDefaultStack)
					.entries(((displayContext, entries) -> {
						entries.add(ModItems.RAW_TIN);
						entries.add(ModItems.TIN_INGOT);
						entries.add(ModItems.RAW_SILVER);
						entries.add(ModItems.SILVER_INGOT);
						entries.add(ModItems.SILVER_NUGGET);
						entries.add(ModItems.BRONZE_INGOT);
					})).build());

	public static final ItemGroup VEXT_TOOLS = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(VExtMod.MOD_ID, "vext_tools"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.vext_tools", "VEXT Tools"))
					.icon(ModItems.BRONZE_AXE::getDefaultStack)
					.entries(((displayContext, entries) -> {
						entries.addAll(ModGearType.BRONZE.getToolItemGroupList());
					}
			)).build());

	public static final ItemGroup VEXT_COMBAT = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(VExtMod.MOD_ID, "vext_combat"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.vext_combat", "VEXT Combat"))
					.icon(ModItems.BRONZE_SWORD::getDefaultStack)
					.entries(((displayContext, entries) -> {
						entries.addAll(ModGearType.BRONZE.getArmorItemGroupList());
					}
			)).build());

	public static final ItemGroup VEXT_PLANTS = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(VExtMod.MOD_ID, "vext_plants"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.vext_plants", "VEXT Plants"))
					.icon(ModItems.TOMATO_SEEDS::getDefaultStack)
					.entries(((displayContext, entries) -> {
						entries.add(ModBlocks.WILD_TOMATO);
						entries.add(ModItems.TOMATO_SEEDS);
						entries.add(ModBlocks.WILD_CORN);
						entries.add(ModItems.CORN_SEEDS);
						entries.add(PineBlocks.PINE_LEAVES);
						entries.add(PineBlocks.PINE_SAPLING);
					})).build());

	public static final ItemGroup VEXT_FOOD = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(VExtMod.MOD_ID, "vext_food"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.vext_food", "VEXT Food"))
					.icon(ModItems.COOKED_CORN::getDefaultStack)
					.entries(((displayContext, entries) -> {
						entries.add(ModItems.TOMATO);
						entries.add(ModItems.BAKED_TOMATO);
						entries.add(ModItems.CORN);
						entries.add(ModItems.COOKED_CORN);
					})).build());

	public static final ItemGroup VEXT_Nature_Deco = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(VExtMod.MOD_ID, "nature_deco"), FabricItemGroup.builder().displayName(
							Text.translatableWithFallback("itemgroup.vext_naturedeco", "VEXT Nature Deco"))
					.icon(() -> new ItemStack(ModBlocks.SPIDER_WEB))
					.entries(((displayContext, entries) -> {
						entries.add(ModBlocks.SPIDER_WEB);
					})).build());
	/**
	 * Currently disable to not include the Hobbit_Spawn Egg into the game, as Hobbits are bugged without fix.
	 *
	 * public static final ItemGroup VEXT_SPAWNS = Registry.register(Registries.ITEM_GROUP,
	 * 			Identifier.of(VExtMod.MOD_ID, "vext_spawns"), FabricItemGroup.builder().displayName(
	 * 					Text.translatableWithFallback("itemgroup.vext_spawns", "VEXT Spawns"))
	 * 					.icon(ModItems.HOBBIT_SPAWN_EGG::getDefaultStack)
	 * 					.entries(((displayContext, entries) -> {
	 * 						entries.add(ModItems.HOBBIT_SPAWN_EGG);
	 * 					                    })).build());
	 */

	/**
	 * This method is called during the mod initialization to ensure that the item groups are registered.
	 */
	public static void registerItemGroups() {
		VExtMod.LOGGER.info("Registering Item Groups for " + VExtMod.MOD_ID);
	}
}
