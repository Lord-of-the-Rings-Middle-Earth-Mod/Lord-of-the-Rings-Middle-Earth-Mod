package me.anedhel.lotr.block;

import net.minecraft.block.Block;

public enum ModWoodType {
    PINE(ModBlocks.PINE_LOG, ModBlocks.PINE_WOOD, ModBlocks.STRIPPED_PINE_LOG, ModBlocks.STRIPPED_PINE_WOOD,
            ModBlocks.PINE_PLANKS, ModBlocks.PINE_PLANKS_STAIRS, ModBlocks.PINE_PLANKS_SLAB,
            ModBlocks.PINE_PLANKS_BUTTON, ModBlocks.PINE_PLANKS_PRESSURE_PLATE,
            ModBlocks.PINE_PLANKS_FENCE, ModBlocks.PINE_PLANKS_FENCE_GATE,
            ModBlocks.PINE_PLANKS_DOOR, ModBlocks.PINE_PLANKS_TRAPDOOR,
            ModBlocks.PINE_LEAVES, false);

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
    private final Block leaves;
    private final boolean vanillaAddition;

    ModWoodType(Block log, Block wood, Block strippedLog, Block strippedWood, Block planks, Block planksStairs, Block planksSlab, Block planksButton, Block planksPressurePlate, Block planksFence, Block planksFenceGate, Block planksDoor, Block planksTrapdoor, Block leaves, boolean vanillaAddition) {
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
        this.leaves = leaves;
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

    public Block getLeaves() {
        return leaves;
    }

    public boolean isVanillaAddition() {
        return vanillaAddition;
    }
}
