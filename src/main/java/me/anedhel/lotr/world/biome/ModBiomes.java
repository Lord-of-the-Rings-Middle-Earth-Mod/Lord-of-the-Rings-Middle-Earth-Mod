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

package me.anedhel.lotr.world.biome;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

/**
 * This class is used to register the biomes of the mod.
 */
public class ModBiomes {

    public static final RegistryKey<Biome> SHIRE = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "shire"));

    /**
     * Registers all biomes for the mod using the provided `Registerable` context.
     *
     * @param context The `Registerable` context used to register biomes.
     */
    public static void boostrap (Registerable<Biome> context) {
        context.register(SHIRE, shire(context));
    }

    /**
     * Configures the global overworld generation settings for biomes.
     * <p>
     * This method adds various default features to the biome generation, such as land carvers, amethyst geodes,
     * dungeons, mineable blocks, springs, and a frozen top layer.
     *
     * @param builder The `GenerationSettings.LookupBackedBuilder` used to configure biome generation.
     */
    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    /**
     * Creates and configures the "Shire" biome.
     *
     * @param context The `Registerable` context used to access biome-related registries.
     * @return A configured `Biome` instance representing the "Shire".
     */
    public static Biome shire(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        ModBiomeFeatures.addShireMobs(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        ModBiomeFeatures.addArdaOres(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.TREES_PLAINS);
        DefaultBiomeFeatures.addForestFlowers(biomeBuilder);
        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder()).waterColor(0x2f5a86).waterFogColor(0x2f5a86).skyColor(0x22a1e6)
                        .grassColor(0x30a81d).foliageColor(0x268617).fogColor(0x22a1e6)
                        .moodSound(BiomeMoodSound.CAVE).build())
                .build();
    }
}
