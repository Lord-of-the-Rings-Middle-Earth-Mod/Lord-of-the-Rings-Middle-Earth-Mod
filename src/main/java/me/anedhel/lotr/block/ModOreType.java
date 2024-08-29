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

public enum ModOreType {

    TIN_ORE(ModBlocks.TIN_ORE , ModBlocks.DEEPSLATE_TIN_ORE, null, null, null,
            null, null,
            ModItems.RAW_TIN, UniformLootNumberProvider.create(2.0f, 5.0f), MiningLevels.STONE,false);

    private final Block stoneOre;
    private final Block deepslateOre;
    private final Block andesiteOre;
    private final Block dioriteOre;
    private final Block graniteOre;

    private final Block blueslateOre;
    private final Block chalkOre;

    private final Item oreDrop;
    private final UniformLootNumberProvider dropRange;
    private final int miningLevel;

    private final boolean vanillaAddition;

    ModOreType(Block stoneOre, Block deepslateOre, Block andesiteOre, Block dioriteOre, Block graniteOre, Block blueslateOre, Block chalkOre, Item oreDrop, UniformLootNumberProvider dropRange, int miningLevel, boolean vanillaAddition) {
        this.stoneOre = stoneOre;
        this.deepslateOre = deepslateOre;
        this.andesiteOre = andesiteOre;
        this.dioriteOre = dioriteOre;
        this.graniteOre = graniteOre;
        this.blueslateOre = blueslateOre;
        this.chalkOre = chalkOre;
        this.oreDrop = oreDrop;
        this.dropRange = dropRange;
        this.miningLevel = miningLevel;
        this.vanillaAddition = vanillaAddition;
    }

    public List<ItemStack> getItemGroupList() {
        List<ItemStack> oreItemGroupList = new ArrayList<>();
        if (!vanillaAddition) {
            if (stoneOre != null) {
                oreItemGroupList.add(new ItemStack(stoneOre));
            }
            if (deepslateOre != null) {
                oreItemGroupList.add(new ItemStack(deepslateOre));
            }
        }
        if (andesiteOre != null) {
            oreItemGroupList.add(new ItemStack(andesiteOre));
        }
        if (dioriteOre != null) {
            oreItemGroupList.add(new ItemStack(dioriteOre));
        }
        if (graniteOre != null) {
            oreItemGroupList.add(new ItemStack(graniteOre));
        }
        if (blueslateOre != null) {
            oreItemGroupList.add(new ItemStack(blueslateOre));
        }
        if (chalkOre != null) {
            oreItemGroupList.add(new ItemStack(chalkOre));
        }
        return oreItemGroupList;
    }

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

    public UniformLootNumberProvider getDropRange() {
        return dropRange;
    }

    public int getMiningLevel() {
        return miningLevel;
    }

    public boolean isVanillaAddition() {
        return vanillaAddition;
    }
}
