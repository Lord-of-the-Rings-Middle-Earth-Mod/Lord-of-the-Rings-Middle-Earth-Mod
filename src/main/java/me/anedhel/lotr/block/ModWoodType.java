package me.anedhel.lotr.block;

import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public enum ModWoodType {
    PINE(ModBlocks.PINE_LOG, ModBlocks.PINE_WOOD, ModBlocks.STRIPPED_PINE_LOG, ModBlocks.STRIPPED_PINE_WOOD,
            ModBlocks.PINE_PLANKS, ModBlocks.PINE_PLANKS_STAIRS, ModBlocks.PINE_PLANKS_SLAB,
            ModBlocks.PINE_PLANKS_BUTTON, ModBlocks.PINE_PLANKS_PRESSURE_PLATE,
            ModBlocks.PINE_PLANKS_FENCE, ModBlocks.PINE_PLANKS_FENCE_GATE,
            ModBlocks.PINE_PLANKS_DOOR, ModBlocks.PINE_PLANKS_TRAPDOOR,
            ModBlocks.PINE_PLANKS_FAMILY, ModBlocks.PINE_LEAVES, false);

    private final Block log;
    private final Block wood;
    private final Block strippedLog;
    private final Block strippedWood;
    private final Block planks;
    private final Block planksStairs;
    private final Block planksSlab;
    private final Block planksButton;
    private final Block planksPressurePlate;
    private final Block planksFence;
    private final Block planksFenceGate;
    private final Block planksDoor;
    private final Block planksTrapdoor;
    private final BlockFamily planksFamily;
    private final Block leaves;
    private final boolean vanillaAddition;

    ModWoodType(Block log, Block wood, Block strippedLog, Block strippedWood, Block planks, Block planksStairs, Block planksSlab, Block planksButton, Block planksPressurePlate, Block planksFence, Block planksFenceGate, Block planksDoor, Block planksTrapdoor, BlockFamily planksFamily, Block leaves, boolean vanillaAddition) {
        this.log = log;
        this.wood = wood;
        this.strippedLog = strippedLog;
        this.strippedWood = strippedWood;
        this.planksStairs = planksStairs;
        this.planksSlab = planksSlab;
        this.planksButton = planksButton;
        this.planksPressurePlate = planksPressurePlate;
        this.planksFence = planksFence;
        this.planksFenceGate = planksFenceGate;
        this.planksDoor = planksDoor;
        this.planksTrapdoor = planksTrapdoor;
        this.vanillaAddition = vanillaAddition;
        this.planks = planks;
        this.planksFamily = planksFamily;
        this.leaves = leaves;
    }

    public List<ItemStack> getItemGroupList() {
        List<ItemStack> itemGroupList = new ArrayList<>();

        if (log != null && !vanillaAddition) {
            itemGroupList.add(new ItemStack(log));
        }
        if (wood != null) {
            itemGroupList.add(new ItemStack(wood));
        }
        if (strippedLog != null) {
            itemGroupList.add(new ItemStack(strippedLog));
        }
        if (strippedWood != null) {
            itemGroupList.add(new ItemStack(strippedWood));
        }
        if (planks != null) {
            itemGroupList.add(new ItemStack(planks));
        }
        if (planksStairs != null) {
            itemGroupList.add(new ItemStack(planksStairs));
        }
        if (planksSlab != null) {
            itemGroupList.add(new ItemStack(planksSlab));
        }
        if (planksButton != null) {
            itemGroupList.add(new ItemStack(planksButton));
        }
        if (planksPressurePlate != null) {
            itemGroupList.add(new ItemStack(planksPressurePlate));
        }
        if (planksFence != null) {
            itemGroupList.add(new ItemStack(planksFence));
        }
        if (planksFenceGate != null) {
            itemGroupList.add(new ItemStack(planksFenceGate));
        }
        if (planksDoor != null) {
            itemGroupList.add(new ItemStack(planksDoor));
        }
        if (planksTrapdoor != null) {
            itemGroupList.add(new ItemStack(planksTrapdoor));
        }
        if (leaves != null) {
            itemGroupList.add(new ItemStack(leaves));
        }

        return itemGroupList;
    }

    public Block getLog() {
        return log;
    }

    public Block getWood() {
        return wood;
    }

    public Block getStrippedWood() {
        return strippedWood;
    }

    public Block getStrippedLog() {
        return strippedLog;
    }

    public Block getPlanks() {
        return planks;
    }

    public Block getPlanksSlab() {
        return planksSlab;
    }

    public Block getPlanksStairs() {
        return planksStairs;
    }

    public Block getPlanksButton() {
        return planksButton;
    }

    public Block getPlanksPressurePlate() {
        return planksPressurePlate;
    }

    public Block getPlanksFence() {
        return planksFence;
    }

    public Block getPlanksFenceGate() {
        return planksFenceGate;
    }

    public Block getPlanksDoor() {
        return planksDoor;
    }

    public Block getPlanksTrapdoor() {
        return planksTrapdoor;
    }

    public BlockFamily getPlanksFamily() {
        return planksFamily;
    }

    public Block getLeaves() {
        return leaves;
    }

    public boolean isVanillaAddition() {
        return vanillaAddition;
    }
}
