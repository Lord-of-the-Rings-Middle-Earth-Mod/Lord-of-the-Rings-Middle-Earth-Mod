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
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

/**
 * This class is responsible for generating item tags for the mod. It extends the FabricTagProvider.ItemTagProvider
 * class and overrides the configure method to set up the tags.
 */
public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
	    getOrCreateTagBuilder(ConventionalItemTags.FOODS).add(ModItems.TOMATO).add(ModItems.BAKED_TOMATO)
			    .add(ModItems.CORN).add(ModItems.COOKED_CORN);

	    getOrCreateTagBuilder(ItemTags.VILLAGER_PLANTABLE_SEEDS).add(ModItems.TOMATO_SEEDS).add(ModItems.CORN_SEEDS);

	    configureGear();
        configureModWoodTypes();
	    configureModOreTypes();
    }

	/**
	 * Configures all required tags for mod-specific gear types.
	 */
	private void configureGear() {
		for(ModGearType gearType : ModGearType.values()) {
			FabricTagBuilder trimTag = getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR);
			FabricTagBuilder swordTag = getOrCreateTagBuilder(ItemTags.SWORDS);
			FabricTagBuilder axeTag = getOrCreateTagBuilder(ItemTags.AXES);
			FabricTagBuilder pickaxeTag = getOrCreateTagBuilder(ItemTags.PICKAXES);
			FabricTagBuilder shovelTag = getOrCreateTagBuilder(ItemTags.SHOVELS);
			FabricTagBuilder hoeTag = getOrCreateTagBuilder(ItemTags.HOES);
			FabricTagBuilder toolTag = getOrCreateTagBuilder(ItemTags.TOOLS);

			if(gearType.getHelmet() != null && gearType.getChestplate() != null && gearType.getLeggings() != null
					&& gearType.getBoots() != null) {
				trimTag.add(gearType.getHelmet(), gearType.getChestplate(), gearType.getLeggings(),
						gearType.getBoots());
			}
			if(gearType.getSword() != null) {
				toolTag.add(gearType.getSword());
				swordTag.add(gearType.getSword());
			}
			if(gearType.getAxe() != null) {
				toolTag.add(gearType.getAxe());
				axeTag.add(gearType.getAxe());
			}
			if(gearType.getPickaxe() != null) {
				toolTag.add(gearType.getPickaxe());
				pickaxeTag.add(gearType.getPickaxe());
			}
			if(gearType.getShovel() != null) {
				toolTag.add(gearType.getShovel());
				shovelTag.add(gearType.getShovel());
			}
			if(gearType.getHoe() != null) {
				toolTag.add(gearType.getHoe());
				hoeTag.add(gearType.getHoe());
			}
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
		FabricTagBuilder nuggetTag = getOrCreateTagBuilder(ConventionalItemTags.NUGGETS);
		FabricTagBuilder ingotTag = getOrCreateTagBuilder(ConventionalItemTags.INGOTS);
		for(ModOreType oreType : ModOreType.values()) {
			if(oreType.getOreDrop() != null) {
				rawOreTag.add(oreType.getOreDrop());
			}
			if(oreType.getNugget() != null) {
				nuggetTag.add(oreType.getNugget());
			}
			if(oreType.getSmeltingItem() != null) {
				ingotTag.add(oreType.getSmeltingItem());
			}
		}
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