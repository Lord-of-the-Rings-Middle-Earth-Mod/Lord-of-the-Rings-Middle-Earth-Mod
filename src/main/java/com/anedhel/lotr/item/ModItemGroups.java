package com.anedhel.lotr.item;

import com.anedhel.lotr.LotRMEMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

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
					})).build());

	public static void registerItemGroups() {
		LotRMEMod.LOGGER.info("Registering Item Groups for " + LotRMEMod.MOD_ID);
	}
}
