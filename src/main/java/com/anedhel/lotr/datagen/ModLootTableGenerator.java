/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.datagen;

import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.block.custom.crops.CornCropBlock;
import com.anedhel.lotr.block.custom.crops.TomatoCropBlock;
import com.anedhel.lotr.block.stonetypes.ModStoneSet;
import com.anedhel.lotr.block.stonetypes.ModStoneTypes;
import com.anedhel.lotr.block.woodtypes.ModWoodSet;
import com.anedhel.lotr.block.woodtypes.ModWoodTypes;
import com.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

/**
 * Data generator for block loot tables.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModLootTableGenerator extends FabricBlockLootTableProvider {

	public ModLootTableGenerator(FabricDataOutput dataOutput,
			CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}

	/**
	 * Generates the loot tables for the mod.
	 */
	@Override
	public void generate() {
		generateModWoodTypeLootTables();
		generateModStoneTypeLootTables();

		addDrop(ModBlocks.RAW_TIN_BLOCK);
		addDrop(ModBlocks.TIN_BLOCK);
		addDrop(ModBlocks.RAW_SILVER_BLOCK);
		addDrop(ModBlocks.SILVER_BLOCK);
		addDrop(ModBlocks.BRONZE_BLOCK);

		addDrop(ModBlocks.SILVER_ORE, oreDrops(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER));
		addDrop(ModBlocks.DEEPSLATE_SILVER_ORE, oreDrops(ModBlocks.DEEPSLATE_SILVER_ORE, ModItems.RAW_SILVER));

		addDrop(ModBlocks.TIN_ORE, multipleOreDrops(ModBlocks.TIN_ORE,
				ModItems.RAW_TIN, UniformLootNumberProvider.create(2.0F, 4.0F)
		));
		addDrop(ModBlocks.DEEPSLATE_TIN_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_TIN_ORE,
				ModItems.RAW_TIN, UniformLootNumberProvider.create(2.0F, 4.0F)
		));

		BlockStatePropertyLootCondition.Builder tomatoCropBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(
				StatePredicate.Builder.create()
				.exactMatch(TomatoCropBlock.AGE, TomatoCropBlock.MAX_AGE));
		addDrop(ModBlocks.TOMATO_CROP, cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, tomatoCropBuilder));
		addDrop(ModBlocks.WILD_TOMATO, wildFlowerDrops(
				ModBlocks.WILD_TOMATO, ModItems.TOMATO, UniformLootNumberProvider.create(1.0F, 2.0F)
		));
		addDrop(ModBlocks.POTTED_WILD_TOMATO, pottedPlantDrops(ModBlocks.WILD_TOMATO));

		addDrop(ModBlocks.WILD_CORN, (Block block) -> this.dropsWithProperty(block, TallPlantBlock.HALF, DoubleBlockHalf.LOWER));
		AnyOfLootCondition.Builder builder2 =
				BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create()
								.exactMatch(CornCropBlock.AGE, 7))
						.or(BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create()
								.exactMatch(CornCropBlock.AGE, 8)));

		addDrop(ModBlocks.CORN_CROP, cropDrops(ModBlocks.CORN_CROP, ModItems.CORN, ModItems.CORN_SEEDS, builder2));
	}

	/**
	 * Generates loot tables for all mod wood types.
	 */
	private void generateModWoodTypeLootTables() {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();

			addDrop(woodSet.getLog());
			addDrop(woodSet.getWoodVariant("base"));

			addDrop(woodSet.getStrippedLog());
			addDrop(woodSet.getStrippedWoodVariant("base"));

			generateBlockFamilyLootTables(woodSet.getPlanksFamily());
		}
	}

	/**
	 * Generates loot tables for all mod stone types.
	 */
	private void generateModStoneTypeLootTables() {
		for(ModStoneTypes stoneType: ModStoneTypes.values()) {
			ModStoneSet stoneSet = stoneType.getModStoneSet();
			stoneSet.getAllBlockFamilies().forEach(this::generateBlockFamilyLootTables);
			stoneSet.getAllStoneSubSets().forEach(subSet -> subSet.getAllBlockFamilies().forEach(this::generateBlockFamilyLootTables));
		}
	}

	/**
	 * Generates loot tables for all variants of a {@link BlockFamily}.
	 *
	 * @param family The {@link BlockFamily} to generate loot tables for.
	 */
	private void generateBlockFamilyLootTables(BlockFamily family) {
		for(Block value : family.getVariants().values()) {
			if(value == family.getVariant(BlockFamily.Variant.SLAB)){
				addDrop(value, slabDrops(value));
			} else if (value == family.getVariant(BlockFamily.Variant.DOOR)){
				addDrop(value, doorDrops(value));
			}else {
				addDrop(value);
			}
		}
	}

	/**
	 * Generates loot table for ores that drop a multiple of the same {@link Item} or themselves when mined with silk touch.
	 * Currently the item drop is always tin, that will change with the addition of more ores.
	 *
	 * @param blockDrop the {@link Block} that is being dropped with silk touch
	 * @param itemDrop the {@link Item} that is being dropped without silk touch
	 * @param dropRange the range of items to drop
	 * @return the generated {@link LootTable.Builder}
	 */
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

	/**
	 * Generates loot table for wild flowers of a {@link net.minecraft.block.CropBlock}.
	 * Currently the drop is always Wild Tomato and the item Tomato,
	 * but that will change with the addition of more wildflowers.
	 *
	 * @param drop the {@link FlowerBlock} that is being dropped with shears.
	 * @param item the {@link Item} that is being dropped without shears.
	 * @param dropRange the range of items to drop.
	 * @return the generated {@link LootTable.Builder}
	 */
	private LootTable.Builder wildFlowerDrops (Block drop, Item item, UniformLootNumberProvider dropRange) {
		return this.dropsWithShears(drop, this.applyExplosionDecay(
				drop, ItemEntry.builder(item).apply(SetCountLootFunction.builder(dropRange))
		)
				);
	}
}
