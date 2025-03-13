package me.anedhel.lotr.datagen.util;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels {

	public static final Model PILLAR = block(new Identifier("minecraft", "block/cube_column"), "",
			TextureKey.END, TextureKey.SIDE);
	public static final Model PILLAR_TOP = block(new Identifier("minecraft", "block/cube_column"), "_top",
			TextureKey.END, TextureKey.SIDE);
	public static final Model PILLAR_MIDDLE = block(new Identifier("minecraft", "block/cube_column"), "_middle",
			TextureKey.END, TextureKey.SIDE);
	public static final Model PILLAR_BASE = block(new Identifier("minecraft", "block/cube_column"), "_bottom",
			TextureKey.END, TextureKey.SIDE);

	private static Model block(Identifier parent, TextureKey ... requiredTextureKeys) {
		return new Model(Optional.of(parent),
				Optional.empty(), requiredTextureKeys);
	}

	private static Model block(Identifier parent, String variant, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(parent) ,Optional.of(variant), requiredTextureKeys);
	}
}
