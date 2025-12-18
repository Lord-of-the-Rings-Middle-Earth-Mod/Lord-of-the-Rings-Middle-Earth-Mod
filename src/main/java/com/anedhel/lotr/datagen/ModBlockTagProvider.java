package com.anedhel.lotr.datagen;

import com.anedhel.lotr.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

	public ModBlockTagProvider(FabricDataOutput output,
			CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
				.add(ModBlocks.TIN_ORE)
				.add(ModBlocks.DEEPSLATE_TIN_ORE)
				.add(ModBlocks.RAW_TIN_BLOCK)
				.add(ModBlocks.TIN_BLOCK)
				.add(ModBlocks.SILVER_ORE)
				.add(ModBlocks.DEEPSLATE_SILVER_ORE)
				.add(ModBlocks.RAW_SILVER_BLOCK)
				.add(ModBlocks.SILVER_BLOCK);

		valueLookupBuilder(BlockTags.STONE_ORE_REPLACEABLES)
				.add(ModBlocks.TIN_ORE)
				.add(ModBlocks.SILVER_ORE);
		valueLookupBuilder(ConventionalBlockTags.ORES_IN_GROUND_STONE)
				.add(ModBlocks.TIN_ORE)
				.add(ModBlocks.SILVER_ORE);

		valueLookupBuilder(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
				.add(ModBlocks.DEEPSLATE_TIN_ORE)
				.add(ModBlocks.DEEPSLATE_SILVER_ORE);
		valueLookupBuilder(ConventionalBlockTags.ORES_IN_GROUND_DEEPSLATE)
				.add(ModBlocks.DEEPSLATE_TIN_ORE)
				.add(ModBlocks.DEEPSLATE_SILVER_ORE);

		valueLookupBuilder(ConventionalBlockTags.ORES)
				.add(ModBlocks.TIN_ORE)
				.add(ModBlocks.DEEPSLATE_TIN_ORE)
				.add(ModBlocks.SILVER_ORE)
				.add(ModBlocks.DEEPSLATE_SILVER_ORE);

		valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
				.add(ModBlocks.TIN_ORE)
				.add(ModBlocks.DEEPSLATE_TIN_ORE)
				.add(ModBlocks.RAW_TIN_BLOCK)
				.add(ModBlocks.TIN_BLOCK);

		valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
				.add(ModBlocks.SILVER_ORE)
				.add(ModBlocks.DEEPSLATE_SILVER_ORE)
				.add(ModBlocks.RAW_SILVER_BLOCK)
				.add(ModBlocks.SILVER_BLOCK);
	}
}
