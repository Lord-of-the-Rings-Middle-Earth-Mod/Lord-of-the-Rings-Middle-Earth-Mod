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
			blockStateModelGenerator.createLogTexturePool(woodSet.getLog()).log(woodSet.getLog());
			BlockStateModelGenerator.BlockTexturePool pineWoodTexturePool =
					blockStateModelGenerator.registerCubeAllModelTexturePool(woodSet.getWoodVariant("base"));
			pineWoodTexturePool.stairs(woodSet.getWoodVariant("stairs"));
			pineWoodTexturePool.slab(woodSet.getWoodVariant("slab"));
			pineWoodTexturePool.button(woodSet.getWoodVariant("button"));
			pineWoodTexturePool.pressurePlate(woodSet.getWoodVariant("pressure_plate"));
			pineWoodTexturePool.fence(woodSet.getWoodVariant("fence"));
			pineWoodTexturePool.fenceGate(woodSet.getWoodVariant("fence_gate"));
			blockStateModelGenerator.registerDoor(woodSet.getWoodVariant("door"));
			blockStateModelGenerator.registerTrapdoor(woodSet.getWoodVariant("trapdoor"));

			blockStateModelGenerator.createLogTexturePool(woodSet.getStrippedLog()).log(woodSet.getStrippedLog());
			BlockStateModelGenerator.BlockTexturePool strippedPineWoodTexturePool =
					blockStateModelGenerator.registerCubeAllModelTexturePool(woodSet.getStrippedWoodVariant("base"));
			strippedPineWoodTexturePool.stairs(woodSet.getStrippedWoodVariant("stairs"));
			strippedPineWoodTexturePool.slab(woodSet.getStrippedWoodVariant("slab"));
			strippedPineWoodTexturePool.button(woodSet.getStrippedWoodVariant("button"));
			strippedPineWoodTexturePool.pressurePlate(woodSet.getStrippedWoodVariant("pressure_plate"));
			strippedPineWoodTexturePool.fence(woodSet.getStrippedWoodVariant("fence"));
			strippedPineWoodTexturePool.fenceGate(woodSet.getStrippedWoodVariant("fence_gate"));
			blockStateModelGenerator.registerDoor(woodSet.getStrippedWoodVariant("door"));
			blockStateModelGenerator.registerTrapdoor(woodSet.getStrippedWoodVariant("trapdoor"));

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
