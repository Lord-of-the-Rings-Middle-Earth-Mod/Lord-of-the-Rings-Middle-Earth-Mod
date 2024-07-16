package me.anedhel.lotr.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        //Keep the Generation Feature Order
        ModOreGeneration.generateOres();
        ModTreeGeneration.generateTrees();
    }
}
