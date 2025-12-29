package com.anedhel.lotr.item;

import com.anedhel.lotr.LotRMEMod;
import com.anedhel.lotr.block.ModBlocks;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

	public static final Item RAW_TIN = registerItem("raw_tin", Item::new);
	public static final Item TIN_INGOT = registerItem("tin_ingot",Item::new);
	public static final Item RAW_SILVER = registerItem("raw_silver",Item::new);
	public static final Item SILVER_INGOT = registerItem("silver_ingot",Item::new);
	public static final Item SILVER_NUGGET = registerItem("silver_nugget",Item::new);
	public static final Item BRONZE_INGOT = registerItem("bronze_ingot",Item::new);

	public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
			settings -> new BlockItem(ModBlocks.TOMATO_CROP, settings));
	public static final Item TOMATO = registerItem("tomato",
			settings -> new Item(settings.food(ModFoodComponents.TOMATO)));
	public static final Item BAKED_TOMATO = registerItem("baked_tomato",
			settings -> new Item(settings.food(ModFoodComponents.BAKED_TOMATO)));
	public static final Item CORN = registerItem("corn",
			settings -> new Item(settings.food(ModFoodComponents.CORN)));
	public static final Item COOKED_CORN = registerItem("cooked_corn",
			settings -> new Item(settings.food(ModFoodComponents.COOKED_CORN)));

	public static final Item BRONZE_SWORD = registerItem("bronze_sword",
					settings -> new Item(settings.sword(ModToolMaterials.BRONZE, 3, -2.4f)));
	public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel",
			settings -> new ShovelItem(ModToolMaterials.BRONZE, 1.5F, -3.0F, settings));
	public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe",
			settings -> new Item(settings.pickaxe(ModToolMaterials.BRONZE, 1.0F, -2.8F)));
	public static final Item BRONZE_AXE = registerItem("bronze_axe",
			settings -> new AxeItem(ModToolMaterials.BRONZE, 7.0F, -3.2F, settings));
	public static final Item BRONZE_HOE = registerItem("bronze_hoe",
			settings -> new HoeItem(ModToolMaterials.BRONZE, -1.0F, -2.0F, settings));

	public static final Item BRONZE_HELMET = registerItem("bronze_helmet",
			settings -> new Item(settings.armor(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, EquipmentType.HELMET)));
	public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate",
			settings -> new Item(settings.armor(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
	public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings",
			settings -> new Item(settings.armor(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
	public static final Item BRONZE_BOOTS = registerItem("bronze_boots",
			settings -> new Item(settings.armor(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, EquipmentType.BOOTS)));

	private static Item registerItem(String name, Function<Item.Settings, Item> itemFactory) {
		return Registry.register(Registries.ITEM, Identifier.of(LotRMEMod.MOD_ID, name), 
				itemFactory.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LotRMEMod.MOD_ID, name)))));
	}

	public static void registerModItems() {
		LotRMEMod.LOGGER.info("Registering Mod Items for " + LotRMEMod.MOD_ID);
	}
}
