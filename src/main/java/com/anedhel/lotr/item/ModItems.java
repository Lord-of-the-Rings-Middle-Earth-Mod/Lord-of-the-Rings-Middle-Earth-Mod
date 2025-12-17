package com.anedhel.lotr.item;

import com.anedhel.lotr.LotRMEMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

	public static final Item RAW_TIN = registerItem("raw_tin",
			new Item(new Item.Settings()));
	public static final Item TIN_INGOT = registerItem("tin_ingot",
			new Item(new Item.Settings()));
	public static final Item RAW_SILVER = registerItem("raw_silver",
			new Item(new Item.Settings()));
	public static final Item SILVER_INGOT = registerItem("silver_ingot",
			new Item(new Item.Settings()));
	public static final Item SILVER_NUGGET = registerItem("silver_nugget",
			new Item(new Item.Settings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(LotRMEMod.MOD_ID, name), item);
	}

	public static void registerModItems() {
		LotRMEMod.LOGGER.info("Registering Mod Items for " + LotRMEMod.MOD_ID);
	}
}
