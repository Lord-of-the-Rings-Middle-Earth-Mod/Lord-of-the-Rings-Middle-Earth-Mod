package me.anedhel.lotr;

import me.anedhel.lotr.datagen.ModBlockTagProvider;
import me.anedhel.lotr.datagen.ModLootTableProvider;
import me.anedhel.lotr.datagen.ModModelProvider;
import me.anedhel.lotr.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class LordOfTheRingsMiddleEarthModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
