package me.anedhel.lotr.world.tree;

import me.anedhel.lotr.world.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class PineSaplingGenerator extends SaplingGenerator {

    /**
     * @param random
     * @param bees
     * @return
     */
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.PINE_KEY;
    }
}
