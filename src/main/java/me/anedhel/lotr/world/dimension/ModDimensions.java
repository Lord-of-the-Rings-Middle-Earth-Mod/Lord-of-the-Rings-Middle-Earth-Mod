/*
 * Copyright (c)
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * lord-of-the-rings-middle-earth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * lord-of-the-rings-middle-earth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotr.world.dimension;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

/**
 * This class is used to register the dimensions of the mod.
 */
public class ModDimensions {
    public static final RegistryKey<DimensionOptions> ARDA_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "arda"));
    public static final RegistryKey<World> ARDA_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "arda"));
    public static final RegistryKey<DimensionType> ARDA_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "arda_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(ARDA_DIM_TYPE, new DimensionType(OptionalLong.of(24000),
                // fixedTime: double the normal minecraft day length
                true, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                -64, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }
}
