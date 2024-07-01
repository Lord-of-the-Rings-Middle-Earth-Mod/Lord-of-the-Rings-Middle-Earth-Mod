package me.anedhel.lotr.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public enum ModGearType {
    BRONZE(ModItems.BRONZE_INGOT, ModItems.BRONZE_HELMET, ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_LEGGINGS, ModItems.BRONZE_BOOTS,
            ModItems.BRONZE_SWORD, ModItems.BRONZE_AXE, ModItems.BRONZE_PICKAXE, ModItems.BRONZE_SHOVEL, ModItems.BRONZE_HOE, false);

    private final Item material;
    private final Item helmet;
    private final Item chestplate;
    private final Item leggings;
    private final Item boots;
    private final Item sword;
    private final Item axe;
    private final Item pickaxe;
    private final Item shovel;
    private final Item hoe;
    private final boolean vanillaAddition;

    ModGearType(Item material, Item helmet, Item chestplate, Item leggings, Item boots, Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, boolean vanillaAddition) {
        this.material = material;
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
        this.sword = sword;
        this.axe = axe;
        this.pickaxe = pickaxe;
        this.shovel = shovel;
        this.hoe = hoe;
        this.vanillaAddition = vanillaAddition;
    }

    public @NotNull List<ItemStack> getToolItemGroupList () {
        List<ItemStack> toolItemGroupList = new ArrayList<>();
        if (axe != null) {
            toolItemGroupList.add(new ItemStack(axe));
        }
        if (pickaxe != null) {
            toolItemGroupList.add(new ItemStack(pickaxe));
        }
        if (shovel != null) {
            toolItemGroupList.add(new ItemStack(shovel));
        }
        if (hoe != null) {
            toolItemGroupList.add(new ItemStack(hoe));
        }
        return toolItemGroupList;
    }

    public @NotNull List<ItemStack> getCombatItemGroupList () {
        List<ItemStack> combatItemGroupList = new ArrayList<>();
        if (sword != null) {
            combatItemGroupList.add(new ItemStack(sword));
        }
        if (helmet != null) {
            combatItemGroupList.add(new ItemStack(helmet));
        }
        if (chestplate != null) {
            combatItemGroupList.add(new ItemStack(chestplate));
        }
        if (leggings != null) {
            combatItemGroupList.add(new ItemStack(leggings));
        }
        if (boots != null) {
            combatItemGroupList.add(new ItemStack(boots));
        }
        return combatItemGroupList;
    }

    public Item getMaterial() {
        return material;
    }

    public Item getHelmet() {
        return helmet;
    }

    public Item getChestplate() {
        return chestplate;
    }

    public Item getLeggings() {
        return leggings;
    }

    public Item getBoots() {
        return boots;
    }

    public Item getSword() {
        return sword;
    }

    public Item getAxe() {
        return axe;
    }

    public Item getPickaxe() {
        return pickaxe;
    }

    public Item getShovel() {
        return shovel;
    }

    public Item getHoe() {
        return hoe;
    }

    public boolean isVanillaAddition() {
        return vanillaAddition;
    }
}
