package com.anedhel.lotr.item;

import com.anedhel.lotr.LotRMEMod;
import net.fabricmc.fabric.api.tag.convention.v2.TagUtil;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {

	public static TagKey<Item> PINE_LOGS = createModTag("pine_logs");

	private static TagKey<Item> createCommonTag(String name) {
		return TagKey.of(RegistryKeys.ITEM, Identifier.of(TagUtil.C_TAG_NAMESPACE, name));
	}

	private static TagKey<Item> createModTag(String name) {
		return TagKey.of(RegistryKeys.ITEM, Identifier.of(LotRMEMod.MOD_ID, name));
	}
}
