package me.anedhel.lotr.datagen.util;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
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

	public static final Model CUBE_ALL_OVERLAY = block("cube_all_overlay", TextureKey.ALL,
			TextureKey.LAYER1);
	public static final Model STAIRS_ALL_OVERLAY = block(new Identifier("minecraft", "block/stairs"),
			TextureKey.ALL, TextureKey.LAYER1);
	public static final Model INNER_STAIRS_ALL_OVERLAY = block(new Identifier("minecraft", "block/inner_stairs"),
			"_inner", TextureKey.ALL, TextureKey.LAYER1);
	public static final Model OUTER_STAIRS_ALL_OVERLAY = block(new Identifier("minecraft", "block/outer_stairs"),
			"_outer", TextureKey.ALL, TextureKey.LAYER1);
	public static final Model SLAB_ALL_OVERLAY = block(new Identifier("minecraft", "block/slab"),
			TextureKey.ALL, TextureKey.LAYER1);
	public static final Model SLAB_TOP_ALL_OVERLAY = block(new Identifier("minecraft", "block/slab_top"),
			"_top", TextureKey.ALL, TextureKey.LAYER1);
	public static final Model DOUBLE_SLAB_ALL_OVERLAY = block(new Identifier("minecraft", "block/cube_all"),
			"_double", TextureKey.ALL, TextureKey.LAYER1);
	public static final Model WALL_POST_ALL_OVERLAY = block(new Identifier("minecraft", "block/template_wall_post"),
			"_post", TextureKey.ALL, TextureKey.LAYER1);
	public static final Model WALL_SIDE_ALL_OVERLAY = block(new Identifier("minecraft", "block/template_wall_side"),
			"_side", TextureKey.ALL, TextureKey.LAYER1);
	public static final Model WALL_SIDE_TALL_ALL_OVERLAY = block(new Identifier("minecraft", "block/template_wall_side_tall"),
			"_side_tall", TextureKey.ALL, TextureKey.LAYER1);
	public static final Model WALL_INVENTORY_ALL_OVERLAY = block(new Identifier("minecraft", "block/wall_inventory"),
			"_inventory", TextureKey.ALL, TextureKey.LAYER1);
	public static final Model BUTTON_ALL_OVERLAY = block(new Identifier("minecraft", "block/button"),
			TextureKey.ALL, TextureKey.LAYER1);
	public static final Model BUTTON_PRESSED_ALL_OVERLAY = block(new Identifier("minecraft", "block/button_pressed"),
			"_pressed", TextureKey.ALL, TextureKey.LAYER1);
	public static final Model BUTTON_INVENTORY_ALL_OVERLAY = block(new Identifier("minecraft", "block/button_inventory"),
			"_inventory", TextureKey.ALL, TextureKey.LAYER1);
	public static final Model PRESSURE_PLATE_UP_ALL_OVERLAY = block(new Identifier("minecraft", "block/pressure_plate_up"),
			"", TextureKey.ALL, TextureKey.LAYER1);
	public static final Model PRESSURE_PLATE_DOWN_ALL_OVERLAY = block(new Identifier("minecraft", "block/pressure_plate_down"),
			"_down", TextureKey.ALL, TextureKey.LAYER1);

	private static Model block(String parent, TextureKey ... requiredTextureKeys) {
		return block(new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + parent), requiredTextureKeys);
	}

	private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
		return block(new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + parent), variant, requiredTextureKeys);
	}

	private static Model block(Identifier parent, TextureKey ... requiredTextureKeys) {
		return new Model(Optional.of(parent),
				Optional.empty(), requiredTextureKeys);
	}

	private static Model block(Identifier parent, String variant, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(parent) ,Optional.of(variant), requiredTextureKeys);
	}
}
