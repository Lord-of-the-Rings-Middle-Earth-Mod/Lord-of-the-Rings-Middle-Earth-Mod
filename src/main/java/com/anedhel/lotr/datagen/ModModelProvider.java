package com.anedhel.lotr.datagen;

import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {

	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SILVER_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVER_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
		itemModelGenerator.register(ModItems.BAKED_TOMATO, Models.GENERATED);
		itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
		itemModelGenerator.register(ModItems.COOKED_CORN, Models.GENERATED);

		itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
		itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
		itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
		itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
		itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);
	}
}
