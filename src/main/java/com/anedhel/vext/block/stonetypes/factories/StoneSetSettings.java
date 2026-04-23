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

import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;

public record StoneSetSettings(
		float baseHardness,
		float baseResistance,
		BlockSoundGroup sound,
		MapColor mapColor,
		NoteBlockInstrument instrument,
		int luminance) {
	private static final BlockSoundGroup DEFAULT_SOUND_GROUP = BlockSoundGroup.STONE;
	private static final MapColor DEFAULT_MAP_COLOR = MapColor.STONE_GRAY;
	private static final NoteBlockInstrument DEFAULT_INSTRUMENT = NoteBlockInstrument.BASEDRUM;
	private static final int DEFAULT_LUMINANCE = 0;


	public StoneSetSettings(float baseHardness, float baseResistance) {
		this(baseHardness, baseResistance, DEFAULT_SOUND_GROUP, DEFAULT_MAP_COLOR, DEFAULT_INSTRUMENT,
				DEFAULT_LUMINANCE);
	}

	public StoneSetSettings(float baseHardness, float baseResistance, int luminance) {
		this(baseHardness, baseResistance, DEFAULT_SOUND_GROUP, DEFAULT_MAP_COLOR, DEFAULT_INSTRUMENT,
				luminance);
	}

	public StoneSetSettings withLuminance(int luminance) {
		return new StoneSetSettings(baseHardness, baseResistance, sound, mapColor, instrument, luminance);
	}

	public StoneSetSettings withStrength(float strength) {
		return new StoneSetSettings(strength, strength, sound, mapColor, instrument, luminance);
	}

	public StoneSetSettings withHardness(float hardness) {
		return new StoneSetSettings(hardness, baseResistance, sound, mapColor, instrument, luminance);
	}

	public StoneSetSettings withResistance(float resistance) {
		return new StoneSetSettings(baseHardness, resistance, sound, mapColor, instrument, luminance);
	}
}
