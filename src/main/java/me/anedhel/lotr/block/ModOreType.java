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

package me.anedhel.lotr.block;

import me.anedhel.lotr.item.ModItems;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This enum represents different types of ores in the game, including their properties and associated items.
 */
public enum ModOreType {

    TIN_ORE(ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE, null, null, null, null, null, ModItems.RAW_TIN,
		    ModBlocks.RAW_TIN_BLOCK, UniformLootNumberProvider.create(2.0f, 5.0f), MiningLevels.STONE,
		    ModItems.TIN_INGOT, ModBlocks.TIN_BLOCK);

    private final Block stoneOre;
    private final Block deepslateOre;
    private final Block andesiteOre;
    private final Block dioriteOre;
    private final Block graniteOre;

    private final Block blueslateOre;
    private final Block chalkOre;

    private final Item oreDrop;
    private final Block oreDropBlock;

    private final UniformLootNumberProvider dropRange;
    private final int miningLevel;

	private final Item smeltingItem;
	private final Block smeltingBlock;

    ModOreType(Block stoneOre, Block deepslateOre, Block andesiteOre, Block dioriteOre, Block graniteOre,
            Block blueslateOre, Block chalkOre, Item oreDrop, Block oreDropBlock, UniformLootNumberProvider dropRange,
		    int miningLevel, Item smeltingItem, Block smeltingBlock) {
        this.stoneOre = stoneOre;
        this.deepslateOre = deepslateOre;
        this.andesiteOre = andesiteOre;
        this.dioriteOre = dioriteOre;
        this.graniteOre = graniteOre;
        this.blueslateOre = blueslateOre;
        this.chalkOre = chalkOre;
        this.oreDrop = oreDrop;
        this.oreDropBlock = oreDropBlock;
        this.dropRange = dropRange;
        this.miningLevel = miningLevel;
	    this.smeltingItem = smeltingItem;
	    this.smeltingBlock = smeltingBlock;
    }

    /**
     * Retrieves a list of `ItemStack` objects representing the ores associated with this ore type.
     *
     * @return A list of `ItemStack` objects for the ores in this ore type.
     */
    public List<ItemStack> getBlockItemGroupList() {
	    List<ItemStack> blockItemGroupList = new ArrayList<>();
        if(stoneOre != null) {
	        blockItemGroupList.add(new ItemStack(stoneOre));
        }
        if(deepslateOre != null) {
	        blockItemGroupList.add(new ItemStack(deepslateOre));
        }
        if (andesiteOre != null) {
	        blockItemGroupList.add(new ItemStack(andesiteOre));
        }
        if (dioriteOre != null) {
	        blockItemGroupList.add(new ItemStack(dioriteOre));
        }
        if (graniteOre != null) {
	        blockItemGroupList.add(new ItemStack(graniteOre));
        }
        if (blueslateOre != null) {
	        blockItemGroupList.add(new ItemStack(blueslateOre));
        }
        if (chalkOre != null) {
	        blockItemGroupList.add(new ItemStack(chalkOre));
        }

	    if(oreDropBlock != null) {
		    blockItemGroupList.add(new ItemStack(oreDropBlock));
        }
	    if(smeltingBlock != null) {
		    blockItemGroupList.add(new ItemStack(smeltingBlock));
	    }
	    return blockItemGroupList;
    }

	/**
	 * Retrieves a list of `ItemStack` objects representing the ingredients associated with this ore type.
	 *
	 * @return A list of `ItemStack` objects for the ingredients in this ore type.
	 */
	public List<ItemStack> getIngredientsItemGroupList() {
		List<ItemStack> ingredientsItemGroupList = new ArrayList<>();
		if(oreDrop != null) {
			ingredientsItemGroupList.add(new ItemStack(oreDrop));
		}
		if(smeltingItem != null) {
			ingredientsItemGroupList.add(new ItemStack(smeltingItem));
		}
		return ingredientsItemGroupList;
    }

    /**
     * Retrieves a list of smeltable items associated with this ore type.
     *
     * @return A list of `ItemConvertible` objects representing smeltable items.
     */
    public List<ItemConvertible> getSmeltables() {
        List<ItemConvertible> smeltables = new ArrayList<>();
        smeltables.add(oreDrop);
        smeltables.add(stoneOre);
        smeltables.add(deepslateOre);
        smeltables.add(andesiteOre);
        smeltables.add(dioriteOre);
        smeltables.add(graniteOre);
        smeltables.add(blueslateOre);
        smeltables.add(chalkOre);
        return smeltables.stream().filter(Objects::nonNull).toList();
    }

    public Block getStoneOre() {
        return stoneOre;
    }

    public Block getDeepslateOre() {
        return deepslateOre;
    }

    public Block getAndesiteOre() {
        return andesiteOre;
    }

    public Block getGraniteOre() {
        return graniteOre;
    }

    public Block getDioriteOre() {
        return dioriteOre;
    }

    public Block getBlueslateOre() {
        return blueslateOre;
    }

    public Block getChalkOre() {
        return chalkOre;
    }

    public Item getOreDrop() {
        return oreDrop;
    }

    public Block getOreDropBlock() {
        return oreDropBlock;
    }

    public UniformLootNumberProvider getDropRange() {
        return dropRange;
    }

    public int getMiningLevel() {
        return miningLevel;
    }

	public Item getSmeltingItem() {
		return smeltingItem;
	}

	public Block getSmeltingBlock() {
		return smeltingBlock;
	}
}
