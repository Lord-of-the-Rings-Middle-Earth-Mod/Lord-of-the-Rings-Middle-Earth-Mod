package com.anedhel.lotr.datagen;

import com.anedhel.lotr.block.ModBlockTags;
import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.block.stonetypes.ModStoneSet;
import com.anedhel.lotr.block.stonetypes.ModStoneSubSet;
import com.anedhel.lotr.block.stonetypes.ModStoneTypes;
import com.anedhel.lotr.block.woodtypes.ModWoodSet;
import com.anedhel.lotr.block.woodtypes.ModWoodTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.tag.ProvidedTagBuilder;
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
		configureModWoodTypes();
		configureModStoneTypes();

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

	private void configureModWoodTypes() {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();

			configureWoodFamilyTags(woodSet.getPlanksFamily());

			valueLookupBuilder(woodSet.getLogBlockTag())
					.add(woodSet.getLog())
					.add(woodSet.getWoodVariant("base"))
					.add(woodSet.getStrippedLog())
					.add(woodSet.getStrippedWoodVariant("base"));

			valueLookupBuilder(BlockTags.AXE_MINEABLE)
					.add(woodSet.getLog())
					.add(woodSet.getWoodFamily().getVariants().values())
					.add(woodSet.getStrippedLog())
					.add(woodSet.getStrippedWoodFamily().getVariants().values());
		}
	}

	private void configureModStoneTypes() {
		for(ModStoneTypes stoneType : ModStoneTypes.values()) {
			ModStoneSet stoneSet = stoneType.getModStoneSet();
			for(ModStoneSubSet subSet : stoneSet.getAllStoneSubSets()) {
				configureStoneSubSetTags(subSet);
			}
			for(BlockFamily family : stoneSet.getAllBlockFamilies()) {
				configureStoneFamilyTags(family);
			}
			stoneSet.getPillarSet().getAllBlockFamilies().forEach(blockFamily -> valueLookupBuilder(ModBlockTags.PILLARS)
					.add(blockFamily.getBaseBlock()));
			stoneSet.getFriezeSet().getAllBlockFamilies().forEach(blockFamily -> valueLookupBuilder(ModBlockTags.FRIEZES)
					.add(blockFamily.getBaseBlock()));
		}
	}

	private void configureWoodFamilyTags(BlockFamily family) {
		ProvidedTagBuilder<Block, Block> axeMinableBuilder = valueLookupBuilder(BlockTags.AXE_MINEABLE);
		family.getVariants().values().forEach(axeMinableBuilder::add);
		valueLookupBuilder(BlockTags.WOODEN_FENCES)
				.add(family.getVariant(BlockFamily.Variant.FENCE));

		valueLookupBuilder(BlockTags.FENCE_GATES)
				.add(family.getVariant(BlockFamily.Variant.FENCE_GATE));
	}

	private void configureStoneSubSetTags(ModStoneSubSet subSet) {
		subSet.getAllBlockFamilies().forEach(this::configureStoneFamilyTags);
	}

	private void configureStoneFamilyTags(BlockFamily family) {
		ProvidedTagBuilder<Block, Block> pickaxeMineableBuilder = valueLookupBuilder(BlockTags.PICKAXE_MINEABLE);
		family.getVariants().values().forEach(pickaxeMineableBuilder::add);

		if(family.getVariant(BlockFamily.Variant.WALL) != null) {
			valueLookupBuilder(BlockTags.WALLS)
					.add(family.getVariant(BlockFamily.Variant.WALL));
		}
	}
}
