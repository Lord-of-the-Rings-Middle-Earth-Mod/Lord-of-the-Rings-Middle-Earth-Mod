package com.anedhel.lotr.item;

import com.anedhel.lotr.LotRMEMod;
import net.minecraft.item.Item;
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

	public static final Item TOMATO = registerItem("tomato",
			settings -> new Item(settings.food(ModFoodComponents.TOMATO)));
	public static final Item BAKED_TOMATO = registerItem("baked_tomato",
			settings -> new Item(settings.food(ModFoodComponents.BAKED_TOMATO)));
	public static final Item CORN = registerItem("corn",
			settings -> new Item(settings.food(ModFoodComponents.CORN)));
	public static final Item COOKED_CORN = registerItem("cooked_corn",
			settings -> new Item(settings.food(ModFoodComponents.COOKED_CORN)));

	private static Item registerItem(String name, Function<Item.Settings, Item> itemFactory) {
		return Registry.register(Registries.ITEM, Identifier.of(LotRMEMod.MOD_ID, name), 
				itemFactory.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LotRMEMod.MOD_ID, name)))));
	}

	public static void registerModItems() {
		LotRMEMod.LOGGER.info("Registering Mod Items for " + LotRMEMod.MOD_ID);
	}
}
