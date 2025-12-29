package com.anedhel.lotr.item;

import com.anedhel.lotr.LotRMEMod;
import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.block.stonetypes.BlueslateBlocks;
import com.anedhel.lotr.block.woodtypes.PineBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * This class is responsible for creating and registering custom item groups for the mod.
 * The order of the itemgroups being registered is also the order they appear ingame.
 * The order of the items within each group is determined by the order they are added in the entries method.
 */
public class ModItemGroups {

	public static final ItemGroup LOTR_BLOCKS = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(LotRMEMod.MOD_ID, "lotr_blocks"), FabricItemGroup.builder().displayName(
							Text.translatableWithFallback("itemgroup.lotr_blocks", "LOTR Blocks"))
					.icon(() -> new ItemStack(ModBlocks.TIN_BLOCK))
					.entries(((displayContext, entries) -> {
						entries.addAll(PineBlocks.PINE_SET.getWoodItemGroupList());
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

	public static final ItemGroup LOTR_STONE = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(LotRMEMod.MOD_ID, "lotr_stone"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.lotr_stone", "LOTR Stone"))
					.icon(() -> new ItemStack(BlueslateBlocks.BLUESLATE))
					.entries(((displayContext, entries) -> {
						entries.addAll(BlueslateBlocks.BLUESLATE_SET.getStoneItemGroupList());
					})).build());

	public static final ItemGroup LOTR_INGREDIENTS = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(LotRMEMod.MOD_ID, "lotr_ingredients"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.lotr_ingredients", "LOTR Ingredients"))
					.icon(ModItems.TIN_INGOT::getDefaultStack)
					.entries(((displayContext, entries) -> {
						entries.add(ModItems.RAW_TIN);
						entries.add(ModItems.TIN_INGOT);
						entries.add(ModItems.RAW_SILVER);
						entries.add(ModItems.SILVER_INGOT);
						entries.add(ModItems.SILVER_NUGGET);
						entries.add(ModItems.BRONZE_INGOT);
					})).build());

	public static final ItemGroup LOTR_TOOLS = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(LotRMEMod.MOD_ID, "lotr_tools"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.lotr_tools", "LOTR Tools"))
					.icon(ModItems.BRONZE_AXE::getDefaultStack)
					.entries(((displayContext, entries) -> {
						entries.addAll(ModGearType.BRONZE.getToolItemGroupList());
					}
			)).build());

	public static final ItemGroup LOTR_COMBAT = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(LotRMEMod.MOD_ID, "lotr_combat"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.lotr_combat", "LOTR Combat"))
					.icon(ModItems.BRONZE_SWORD::getDefaultStack)
					.entries(((displayContext, entries) -> {
						entries.addAll(ModGearType.BRONZE.getArmorItemGroupList());
					}
			)).build());

	public static final ItemGroup LOTR_PLANTS = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(LotRMEMod.MOD_ID, "lotr_plants"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.lotr_plants", "LOTR Plants"))
					.icon(ModItems.TOMATO_SEEDS::getDefaultStack)
					.entries(((displayContext, entries) -> {
						entries.add(ModBlocks.WILD_TOMATO);
						entries.add(ModItems.TOMATO_SEEDS);
					})).build());

	public static final ItemGroup LOTR_FOOD = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(LotRMEMod.MOD_ID, "lotr_food"), FabricItemGroup.builder().displayName(
					Text.translatableWithFallback("itemgroup.lotr_food", "LOTR Food"))
					.icon(ModItems.COOKED_CORN::getDefaultStack)
					.entries(((displayContext, entries) -> {
						entries.add(ModItems.TOMATO);
						entries.add(ModItems.BAKED_TOMATO);
						entries.add(ModItems.CORN);
						entries.add(ModItems.COOKED_CORN);
					})).build());

	public static void registerItemGroups() {
		LotRMEMod.LOGGER.info("Registering Item Groups for " + LotRMEMod.MOD_ID);
	}
}
