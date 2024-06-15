package me.anedhel.lotr;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.entity.ModEntities;
import me.anedhel.lotr.entity.custom.HobbitEntity;
import me.anedhel.lotr.item.ModItemGroups;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
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

		addCropsToComposer();
		LOGGER.info("The Lord of the Rings Mod is loaded.");
	}

	private void addCropsToComposer() {
		/*ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_BEETROOT, 0.4f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_CARROT, 0.4f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_POTATO, 0.4f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_CORN, 0.4f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_LETTUCE, 0.4f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_TOMATO, 0.4f);*/

		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORN, 0.65f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORN_SEEDS, 0.65f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.LETTUCE, 0.65f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO_SEEDS, 0.5f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO, 0.65f);
	}
}