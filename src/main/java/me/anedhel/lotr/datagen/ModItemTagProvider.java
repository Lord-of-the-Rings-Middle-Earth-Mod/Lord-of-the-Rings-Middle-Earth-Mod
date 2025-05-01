/*
 * Copyright (c)
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * lord-of-the-rings-middle-earth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * lord-of-the-rings-middle-earth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModOreType;
import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.item.ModGearType;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        configureGear(ModGearType.BRONZE);
        configureModWoodTypes();
	    configureModOreTypes();
	    configureModCrops();
    }

    /**
     * This Method configures all required Tags for the given GearType
     * @param gearType The ModGearType, that the Tags should be configured for
     */
    private void configureGear(ModGearType gearType) {
        Item helmet = gearType.getHelmet();
        Item chestplate = gearType.getChestplate();
        Item leggings = gearType.getLeggings();
        Item boots = gearType.getBoots();
        /*Item sword = gearType.getSword();
        Item axe = gearType.getAxe();
        Item pickaxe = gearType.getPickaxe();
        Item shovel = gearType.getShovel();
        Item hoe = gearType.getHoe();*/

        FabricTagBuilder trimTag = getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR);

        if (!gearType.isVanillaAddition()) {
            if (helmet != null){
                trimTag.add(helmet);
            }
            if (chestplate != null){
                trimTag.add(chestplate);
            }
            if (leggings != null){
                trimTag.add(leggings);
            }
            if (boots != null){
                trimTag.add(boots);
            }
            /*if (sword != null){

            }
            if (axe != null){

            }
            if (pickaxe != null){

            }
            if (shovel != null){

            }
            if (hoe != null){

            }*/
        }
    }

    /**
     * This Method configures all required Tags for the given ModWoodType
     */
    private void configureModWoodTypes() {
        FabricTagBuilder logsThatBurnTag = getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN);
        FabricTagBuilder planksTag = getOrCreateTagBuilder(ItemTags.PLANKS);

        for (ModWoodType woodType : ModWoodType.values()) {
            FabricTagBuilder logTag = getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("lotr", turnBlockIntoTag(woodType.getLog()))));

            if (!woodType.isVanillaAddition()) {
                if (woodType.getLog() != null) {
                    logsThatBurnTag.add(woodType.getLog().asItem());
                    logTag.add(woodType.getLog().asItem());
                }
            }
            if (woodType.getWood() != null) {
                logsThatBurnTag.add(woodType.getWood().asItem());
                logTag.add(woodType.getWood().asItem());
            }
            if (woodType.getStrippedLog() != null) {
                logsThatBurnTag.add(woodType.getStrippedLog().asItem());
                logTag.add(woodType.getStrippedLog().asItem());
            }
            if (woodType.getStrippedWood() != null) {
                logsThatBurnTag.add(woodType.getStrippedWood().asItem());
                logTag.add(woodType.getStrippedWood().asItem());
            }
            if (woodType.getPlanks() != null) {
                planksTag.add(woodType.getPlanks().asItem());
            }
        }
    }

	/**
	 * Configures all required tags for mod-specific ore types.
	 */
	private void configureModOreTypes() {
		FabricTagBuilder rawOreTag = getOrCreateTagBuilder(ConventionalItemTags.RAW_ORES);
		FabricTagBuilder ingotTag = getOrCreateTagBuilder(ConventionalItemTags.INGOTS);
		for(ModOreType oreType : ModOreType.values()) {
			if(oreType.getOreDrop() != null) {
				rawOreTag.add(oreType.getOreDrop());
			}
			if(oreType.getSmeltingItem() != null) {
				ingotTag.add(oreType.getSmeltingItem());
			}
		}
	}

    /**
     * Configures all required tags for mod-specific crops.
     */
    private void configureModCrops() {
        getOrCreateTagBuilder(ItemTags.VILLAGER_PLANTABLE_SEEDS)
                .add(ModItems.TOMATO_SEEDS);
    }

    /**
     * Converts a given block into a tag-friendly string.
     * The block's name is transformed to lowercase and spaces are replaced with underscores.
     *
     * @param block The block to be converted.
     * @return A string representation of the block's name suitable for use as a tag.
     */
    private String turnBlockIntoTag (Block block) {
        return block.getName().getString().replace(' ', '_').toLowerCase();
    }
}