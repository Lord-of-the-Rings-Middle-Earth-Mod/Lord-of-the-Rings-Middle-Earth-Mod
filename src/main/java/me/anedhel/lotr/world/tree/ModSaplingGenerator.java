package me.anedhel.lotr.world.tree;

import me.anedhel.lotr.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerator {
    public static final SaplingGenerator PINE = new SaplingGenerator("pine", 0f, Optional.empty(),
            Optional.empty(), Optional.of(ModConfiguredFeatures.PINE_KEY),
            Optional.empty(), Optional.empty(), Optional.empty());
}
