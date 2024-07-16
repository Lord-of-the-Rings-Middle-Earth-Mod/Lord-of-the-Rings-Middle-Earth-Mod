package me.anedhel.lotr;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.entity.ModBoats;
import me.anedhel.lotr.entity.ModEntities;
import me.anedhel.lotr.entity.custom.HobbitEntity;
import me.anedhel.lotr.item.ModItemGroups;
import me.anedhel.lotr.item.ModItems;
import me.anedhel.lotr.world.gen.ModWorldGeneration;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.ComposterBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LordOfTheRingsMiddleEarthMod implements ModInitializer {

	public static final String MOD_ID = "lotr";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("The Lord of the Rings Mod starts to initialise.");
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBoats.registerBoats();

		FabricDefaultAttributeRegistry.register(ModEntities.HOBBIT, HobbitEntity.createHobbitAttributes());

		ModWorldGeneration.generateModWorldGen();

		initModWoodTypes();

		addCropsToComposer();
		LOGGER.info("The Lord of the Rings Mod is loaded.");
	}

	/**
	 * In this Method compostable ModCrops and ModFlowers are defined
	 */
	private void addCropsToComposer() {
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_BEETROOT, 0.4f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_CARROT, 0.4f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_POTATO, 0.4f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_CORN, 0.4f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_LETTUCE, 0.4f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_TOMATO, 0.4f);

		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORN, 0.65f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORN_SEEDS, 0.65f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.LETTUCE, 0.65f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO_SEEDS, 0.5f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO, 0.65f);
	}

	/**
	 * This Method is used to initialise all WoodTypes to be flammable and the logs to be strippable
	 */
	private void initModWoodTypes() {
		for (ModWoodType woodType : ModWoodType.values()) {
			StrippableBlockRegistry.register(woodType.getLog(), woodType.getStrippedLog());
			StrippableBlockRegistry.register(woodType.getWood(), woodType.getStrippedWood());

			//ToDo: Add Stairs, Slab, Fence, Fence Gate, etc?
			FlammableBlockRegistry.getDefaultInstance().add(woodType.getLog(), 5, 5);
			FlammableBlockRegistry.getDefaultInstance().add(woodType.getWood(), 5, 5);
			FlammableBlockRegistry.getDefaultInstance().add(woodType.getStrippedLog(), 5, 5);
			FlammableBlockRegistry.getDefaultInstance().add(woodType.getStrippedWood(), 5, 5);
			FlammableBlockRegistry.getDefaultInstance().add(woodType.getPlanks(), 5, 20);
			FlammableBlockRegistry.getDefaultInstance().add(woodType.getLeaves(), 30, 60);

			ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(woodType.getSapling(), 0.35f);
			ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(woodType.getLeaves(), 0.25f);
		}
	}
}