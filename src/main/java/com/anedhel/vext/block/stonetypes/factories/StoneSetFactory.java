/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.block.stonetypes.factories;

import com.anedhel.vext.block.custom.ModFriezeBlock;
import com.anedhel.vext.block.custom.ModPillarBlock;
import com.anedhel.vext.block.stonetypes.ModStoneSet;
import com.anedhel.vext.block.stonetypes.ModStoneSubSet;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.sound.BlockSoundGroup;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static com.anedhel.vext.block.ModBlocks.registerBlock;

public class StoneSetFactory {

	private static final List<BlockFamily.Variant> variantsOne   = List.of(BlockFamily.Variant.SLAB);
	private static final List<BlockFamily.Variant> variantsTwo   = List.of(BlockFamily.Variant.STAIRS, BlockFamily.Variant.SLAB);
	private static final List<BlockFamily.Variant> variantsThree = List.of(BlockFamily.Variant.STAIRS, BlockFamily.Variant.SLAB, BlockFamily.Variant.WALL);
	private static final List<BlockFamily.Variant> variantsFour  = List.of(BlockFamily.Variant.STAIRS, BlockFamily.Variant.SLAB, BlockFamily.Variant.WALL, BlockFamily.Variant.CHISELED);
	private static final List<BlockFamily.Variant> variantsFive  = List.of(BlockFamily.Variant.STAIRS, BlockFamily.Variant.SLAB, BlockFamily.Variant.WALL, BlockFamily.Variant.BUTTON, BlockFamily.Variant.PRESSURE_PLATE);

	public static ModStoneSet createStoneSet(String baseName, StoneSetSettings settings) {
		Function<String, BlockFamily> stone = prefix -> createStoneBlockFamily(baseName, prefix, settings, variantsFive);

		return new ModStoneSet(
				stone.apply(""),               stone.apply("mossy"),                stone.apply("overgrown"),
				stone.apply("cobbled"),        stone.apply("mossy_cobbled"),        stone.apply("overgrown_cobbled"),
				stone.apply("smooth"),         stone.apply("mossy_smooth"),         stone.apply("overgrown_smooth"),
				stone.apply("cracked_smooth"), stone.apply("mossy_cracked_smooth"), stone.apply("overgrown_cracked_smooth"),
				createStoneSubSet(joinName("polished", baseName),            settings, variantsOne),
				createStoneSubSet(joinName(baseName, "pillar"),            settings, variantsOne, ModPillarBlock::new),
				createStoneSubSet(joinName(baseName, "frieze"),            settings, variantsOne, ModFriezeBlock::new),
				createStoneSubSet(joinName("cobbled", baseName, "bricks"),            settings, variantsThree),
				createStoneSubSet(joinName("rustic", baseName, "bricks"),            settings, variantsThree),
				createStoneSubSet(joinName(baseName, "bricks"),            settings, variantsFour),
				createStoneSubSet(joinName(baseName, "tiles"),            settings, variantsThree),
				createStoneSubSet(joinName(baseName, "pavement"),            settings, variantsTwo),
				createStoneSubSet(joinName("fancy", baseName, "bricks"), settings, variantsThree));
	}

	private static ModStoneSubSet createStoneSubSet(String name, StoneSetSettings settings,
			List<BlockFamily.Variant> variants) {
		return createStoneSubSet(name, settings, variants, Block::new);
	}

	private static ModStoneSubSet createStoneSubSet(String name, StoneSetSettings settings,
			List<BlockFamily.Variant> variants, Function<AbstractBlock.Settings, Block> blockFactory) {
		BiFunction<String, StoneSetSettings, BlockFamily> f =
				(prefix, s) -> createStoneBlockFamily(name, prefix, s, variants, blockFactory);

		return new ModStoneSubSet(
				f.apply("",                          settings),
				f.apply("mossy",                    settings),
				f.apply("overgrown",                settings),
				f.apply("cracked",                  settings),
				f.apply("mossy_cracked",            settings),
				f.apply("overgrown_cracked",        settings),
				f.apply("bronze",                   settings),
				f.apply("mossy_bronze",             settings),
				f.apply("overgrown_bronze",         settings),
				f.apply("cracked_bronze",           settings),
				f.apply("mossy_cracked_bronze",     settings),
				f.apply("overgrown_cracked_bronze", settings),
				f.apply("silver",                   settings),
				f.apply("mossy_silver",             settings),
				f.apply("overgrown_silver",         settings),
				f.apply("cracked_silver",           settings),
				f.apply("mossy_cracked_silver",     settings),
				f.apply("overgrown_cracked_silver", settings),
				f.apply("gold",                     settings),
				f.apply("mossy_gold",               settings),
				f.apply("overgrown_gold",           settings),
				f.apply("cracked_gold",             settings),
				f.apply("mossy_cracked_gold",       settings),
				f.apply("overgrown_cracked_gold",   settings),
				f.apply("glowstone",                    settings.withLuminance(15)),
				f.apply("mossy_glowstone",              settings.withLuminance(15)),
				f.apply("overgrown_glowstone",          settings.withLuminance(15)),
				f.apply("cracked_glowstone",            settings.withLuminance(7)),
				f.apply("mossy_cracked_glowstone",      settings.withLuminance(7)),
				f.apply("overgrown_cracked_glowstone",  settings.withLuminance(7)),
				name);
	}

	private static BlockFamily createStoneBlockFamily(String name, String prefix, StoneSetSettings stoneSetSettings,
			List<BlockFamily.Variant> variants) {
		return createStoneBlockFamily(name, prefix, stoneSetSettings, variants, Block::new);
	}

	private static BlockFamily createStoneBlockFamily(String name, String prefix, StoneSetSettings stoneSetSettings,
			List<BlockFamily.Variant> variants, Function<AbstractBlock.Settings, Block> blockFactory) {
		float hardness          = stoneSetSettings.baseHardness();
		float resistance        = stoneSetSettings.baseResistance();
		BlockSoundGroup sound   = stoneSetSettings.sound();
		MapColor mapColor       = stoneSetSettings.mapColor();
		NoteBlockInstrument instrument = stoneSetSettings.instrument();

		Block base = registerBlock(joinName(prefix, name), s -> blockFactory.apply(stoneSettings(s, hardness,
				resistance,	sound, mapColor, instrument, false)));
		BlockFamily.Builder builder = BlockFamilies.register(base);

		String variantName = variantBaseName(name);

		if (variants.contains(BlockFamily.Variant.STAIRS))
			builder.stairs(registerBlock(joinName(prefix, variantName, "stairs"),
					s -> new StairsBlock(base.getDefaultState(), stoneSettings(s, hardness, resistance, sound, mapColor, instrument, false))));
		if (variants.contains(BlockFamily.Variant.SLAB))
			builder.slab(registerBlock(joinName(prefix, variantName, "slab"),
					s -> new SlabBlock(stoneSettings(s, hardness, resistance, sound, mapColor, instrument, false))));
		if (variants.contains(BlockFamily.Variant.WALL))
			builder.wall(registerBlock(joinName(prefix, variantName, "wall"),
					s -> new WallBlock(stoneSettings(s, hardness, resistance, sound, mapColor, instrument, false))));
		if (variants.contains(BlockFamily.Variant.CHISELED))
			builder.chiseled(registerBlock(joinName(prefix, "chiseled", variantName),
					s -> new Block(stoneSettings(s, hardness, resistance, sound, mapColor, instrument, false))));
		if (variants.contains(BlockFamily.Variant.BUTTON))
			builder.button(registerBlock(joinName(prefix, variantName, "button"),
					s -> new ButtonBlock(BlockSetType.STONE, 10, stoneSettings(s, hardness, resistance, sound, mapColor, instrument, true))));
		if (variants.contains(BlockFamily.Variant.PRESSURE_PLATE))
			builder.pressurePlate(registerBlock(joinName(prefix, variantName, "pressure_plate"),
					s -> new PressurePlateBlock(BlockSetType.STONE, stoneSettings(s, hardness, resistance, sound, mapColor, instrument, true))));

		return builder.build();
	}

	private static AbstractBlock.Settings stoneSettings(AbstractBlock.Settings settings, float hardness, float resistance,
			BlockSoundGroup sound, MapColor mapColor, NoteBlockInstrument instrument, boolean redstoneBlock) {
		AbstractBlock.Settings base = settings.strength(hardness, resistance).requiresTool().sounds(sound);
		return redstoneBlock ? base : base.mapColor(mapColor).instrument(instrument);
	}

	private static String joinName(String... parts){
		return Arrays.stream(parts)
				.filter(s -> s != null && !s.isEmpty())
				.collect(java.util.stream.Collectors.joining("_"));
	}

	private static String variantBaseName(String name) {
		return name.endsWith("s") ? name.substring(0, name.length() - 1) : name;
	}
}