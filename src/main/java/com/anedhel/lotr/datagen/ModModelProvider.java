package com.anedhel.lotr.datagen;

import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.block.woodtypes.ModWoodSet;
import com.anedhel.lotr.block.woodtypes.ModWoodTypes;
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
		generateModWoodTypeBlockStateModels(blockStateModelGenerator);

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

	private void generateModWoodTypeBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();
			blockStateModelGenerator.createLogTexturePool(woodSet.getLog()).log(woodSet.getLog()).wood(woodSet.getWood());

			blockStateModelGenerator.createLogTexturePool(woodSet.getStrippedLog()).log(woodSet.getStrippedLog()).wood(woodSet.getStrippedWood());

			BlockStateModelGenerator.BlockTexturePool pinePlanksTexturePool =
					blockStateModelGenerator.registerCubeAllModelTexturePool(woodSet.getPlanksVariant("base"));
			pinePlanksTexturePool.stairs(woodSet.getPlanksVariant("stairs"));
			pinePlanksTexturePool.slab(woodSet.getPlanksVariant("slab"));
			pinePlanksTexturePool.button(woodSet.getPlanksVariant("button"));
			pinePlanksTexturePool.pressurePlate(woodSet.getPlanksVariant("pressure_plate"));
			pinePlanksTexturePool.fence(woodSet.getPlanksVariant("fence"));
			pinePlanksTexturePool.fenceGate(woodSet.getPlanksVariant("fence_gate"));
			blockStateModelGenerator.registerDoor(woodSet.getPlanksVariant("door"));
			blockStateModelGenerator.registerTrapdoor(woodSet.getPlanksVariant("trapdoor"));
		}
	}
}
