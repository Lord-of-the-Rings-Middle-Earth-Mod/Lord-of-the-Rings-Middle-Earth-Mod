package me.anedhel.lotr;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.entity.ModEntities;
import me.anedhel.lotr.entity.custom.HobbitEntity;
import me.anedhel.lotr.item.ModItemGroups;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Block;
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

		FabricDefaultAttributeRegistry.register(ModEntities.HOBBIT, HobbitEntity.createHobbitAttributes());

		initModWoodType(ModWoodType.PINE);

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
	 * This Method is used to initialise the given WoodType to be flammable and the logs to be strippable
	 * @param woodType The woodType to be initialised
	 */
	private void initModWoodType (ModWoodType woodType) {
		Block log = woodType.getLog();
		Block wood = woodType.getWood();
		Block strippedLog = woodType.getStrippedLog();
		Block strippedWood = woodType.getStrippedWood();
		Block planks = woodType.getPlanks();
		Block leaves = woodType.getLeaves();

		StrippableBlockRegistry.register(log, strippedLog);
		StrippableBlockRegistry.register(wood, strippedWood);

		//ToDo: Add Stairs, Slab, Fence, Fence Gate, etc?
		FlammableBlockRegistry.getDefaultInstance().add(log, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(wood, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(strippedLog, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(strippedWood, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(planks, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(leaves, 30, 60);
	}
}