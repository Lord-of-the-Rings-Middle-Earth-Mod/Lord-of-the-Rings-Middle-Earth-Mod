package com.anedhel.lotr.datagen;

import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {

	public ModLootTableGenerator(FabricDataOutput dataOutput,
			CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}

	@Override
	public void generate() {
		addDrop(ModBlocks.RAW_TIN_BLOCK);
		addDrop(ModBlocks.TIN_BLOCK);
		addDrop(ModBlocks.RAW_SILVER_BLOCK);
		addDrop(ModBlocks.SILVER_BLOCK);

		addDrop(ModBlocks.SILVER_ORE, oreDrops(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER));
		addDrop(ModBlocks.DEEPSLATE_SILVER_ORE, oreDrops(ModBlocks.DEEPSLATE_SILVER_ORE, ModItems.RAW_SILVER));

		addDrop(ModBlocks.TIN_ORE, multipleOreDrops(ModBlocks.TIN_ORE,
				ModItems.RAW_TIN, UniformLootNumberProvider.create(2.0F, 4.0F)
		));
		addDrop(ModBlocks.DEEPSLATE_TIN_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_TIN_ORE,
				ModItems.RAW_TIN, UniformLootNumberProvider.create(2.0F, 4.0F)
		));
	}

	private LootTable.Builder multipleOreDrops(Block blockDrop, Item itemDrop, UniformLootNumberProvider dropRange) {
		RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
		return this.dropsWithSilkTouch(
				blockDrop, this.applyExplosionDecay(
						blockDrop,
						ItemEntry.builder(itemDrop)
								.apply(SetCountLootFunction.builder(dropRange))
								.apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
				)
		);
	}
}
