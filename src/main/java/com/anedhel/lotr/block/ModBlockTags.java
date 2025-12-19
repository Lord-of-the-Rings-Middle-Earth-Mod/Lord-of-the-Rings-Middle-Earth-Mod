package com.anedhel.lotr.block;

import com.anedhel.lotr.LotRMEMod;
import net.fabricmc.fabric.api.tag.convention.v2.TagUtil;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {

	public static final TagKey<Block> PILLARS = createCommonTag("pillars");

	public static final TagKey<Block> PINE_LOGS = createModTag("pine_logs");

	private static TagKey<Block> createCommonTag(String name) {
		return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TagUtil.C_TAG_NAMESPACE, name));
	}

	private static TagKey<Block> createModTag(String name) {
		return TagKey.of(RegistryKeys.BLOCK, Identifier.of(LotRMEMod.MOD_ID, name));
	}
}
