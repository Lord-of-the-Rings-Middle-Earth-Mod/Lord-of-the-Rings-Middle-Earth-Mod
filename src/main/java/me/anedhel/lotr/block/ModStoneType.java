package me.anedhel.lotr.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public enum ModStoneType {
    ANDESITE(Blocks.ANDESITE, null, null, null,
            ModBlocks.ANDESITE_BUTTON, ModBlocks.ANDESITE_PRESSURE_PLATE, true),
    POLISHED_ANDESITE(Blocks.POLISHED_ANDESITE, null, null, ModBlocks.POLISHED_ANDESITE_WALL,
            ModBlocks.POLISHED_ANDESITE_BUTTON, ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, true),
    COBBLED_ANDESITE(ModBlocks.COBBLED_ANDESITE, ModBlocks.COBBLED_ANDESITE_STAIRS, ModBlocks.COBBLED_ANDESITE_SLAB, ModBlocks.COBBLED_ANDESITE_WALL,
            ModBlocks.COBBLED_ANDESITE_BUTTON, ModBlocks.COBBLED_ANDESITE_PRESSURE_PLATE, false),
    ANDESITE_BRICK(ModBlocks.ANDESITE_BRICK, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICK_WALL,
            null, null, false),

    DIORITE(Blocks.DIORITE, null, null, null,
            ModBlocks.DIORITE_BUTTON, ModBlocks.DIORITE_PRESSURE_PLATE, true),
    POLISHED_DIORITE(Blocks.POLISHED_DIORITE, null, null, ModBlocks.POLISHED_DIORITE_WALL,
            ModBlocks.POLISHED_DIORITE_BUTTON, ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, true),
    COBBLED_DIORITE(ModBlocks.COBBLED_DIORITE, ModBlocks.COBBLED_DIORITE_STAIRS, ModBlocks.COBBLED_DIORITE_SLAB, ModBlocks.COBBLED_DIORITE_WALL,
            ModBlocks.COBBLED_DIORITE_BUTTON, ModBlocks.COBBLED_DIORITE_PRESSURE_PLATE, false),
    DIORITE_BRICK(ModBlocks.DIORITE_BRICK, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICK_WALL,
            null, null, false),

    GRANITE(Blocks.GRANITE, null, null, null,
            ModBlocks.GRANITE_BUTTON, ModBlocks.GRANITE_PRESSURE_PLATE, true),
    POLISHED_GRANITE(Blocks.POLISHED_GRANITE, null, null, ModBlocks.POLISHED_GRANITE_WALL,
            ModBlocks.POLISHED_GRANITE_BUTTON, ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, true),
    COBBLED_GRANITE(ModBlocks.COBBLED_GRANITE, ModBlocks.COBBLED_GRANITE_STAIRS, ModBlocks.COBBLED_GRANITE_SLAB, ModBlocks.COBBLED_GRANITE_WALL,
            ModBlocks.COBBLED_GRANITE_BUTTON, ModBlocks.COBBLED_GRANITE_PRESSURE_PLATE, false),
    GRANITE_BRICK(ModBlocks.GRANITE_BRICK, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICK_WALL,
            null, null, false),

    SMOOTH_BASALT(Blocks.SMOOTH_BASALT, ModBlocks.SMOOTH_BASALT_STAIRS, ModBlocks.SMOOTH_BASALT_SLAB, ModBlocks.SMOOTH_BASALT_WALL,
            ModBlocks.SMOOTH_BASALT_BUTTON, ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE, true),
    BASALT_BRICKS(ModBlocks.BASALT_BRICK, ModBlocks.BASALT_BRICK_STAIRS, ModBlocks.BASALT_BRICK_SLAB, ModBlocks.BASALT_BRICK_WALL,
            null, null, false),

    BLUESLATE(ModBlocks.BLUESLATE, ModBlocks.BLUESLATE_STAIRS, ModBlocks.BLUESLATE_SLAB, ModBlocks.BLUESLATE_WALL,
            ModBlocks.BLUESLATE_BUTTON, ModBlocks.BLUESLATE_PRESSURE_PLATE, false),
    COBBLED_BLUESLATE(ModBlocks.COBBLED_BLUESLATE, ModBlocks.COBBLED_BLUESLATE_STAIRS, ModBlocks.COBBLED_BLUESLATE_SLAB, ModBlocks.COBBLED_BLUESLATE_WALL,
            ModBlocks.COBBLED_BLUESLATE_BUTTON, ModBlocks.COBBLED_BLUESLATE_PRESSURE_PLATE, false),
    BLUESLATE_BRICK(ModBlocks.BLUESLATE_BRICK, ModBlocks.BLUESLATE_BRICK_STAIRS, ModBlocks.BLUESLATE_BRICK_SLAB, ModBlocks.BLUESLATE_BRICK_WALL,
            null, null, false),

    CHALK(ModBlocks.CHALK, ModBlocks.CHALK_STAIRS, ModBlocks.CHALK_SLAB, ModBlocks.CHALK_WALL,
            ModBlocks.CHALK_BUTTON, ModBlocks.CHALK_PRESSURE_PLATE, false),
    COBBLED_CHALK(ModBlocks.COBBLED_CHALK, ModBlocks.COBBLED_CHALK_STAIRS, ModBlocks.COBBLED_CHALK_SLAB, ModBlocks.COBBLED_CHALK_WALL,
            ModBlocks.COBBLED_CHALK_BUTTON, ModBlocks.COBBLED_CHALK_PRESSURE_PLATE, false),
    CHALK_BRICK(ModBlocks.CHALK_BRICK, ModBlocks.CHALK_BRICK_STAIRS, ModBlocks.CHALK_BRICK_SLAB, ModBlocks.CHALK_BRICK_WALL,
            null, null, false);

    private final Block baseBlock;
    private final Block stairBlock;
    private final Block slabBlock;
    private final Block wallBlock;
    private final Block buttonBlock;
    private final Block pressurePlateBlock;
    private final boolean vanillaAddition;

    ModStoneType(Block baseBlock, Block stairBlock, Block slabBlock, Block wallBlock, Block buttonBlock, Block pressurePlateBlock, boolean vanillaAddition) {
        this.baseBlock = baseBlock;
        this.stairBlock = stairBlock;
        this.slabBlock = slabBlock;
        this.wallBlock = wallBlock;
        this.buttonBlock = buttonBlock;
        this.pressurePlateBlock = pressurePlateBlock;
        this.vanillaAddition = vanillaAddition;
    }

    public @NotNull List<ItemStack> getItemGroupList() {
        List<ItemStack> itemGroupList = new ArrayList<>();

        if (baseBlock != null && !vanillaAddition) {
            itemGroupList.add(new ItemStack(baseBlock));
        }
        if (stairBlock != null) {
            itemGroupList.add(new ItemStack(stairBlock));
        }
        if (slabBlock != null) {
            itemGroupList.add(new ItemStack(slabBlock));
        }
        if (wallBlock != null) {
            itemGroupList.add(new ItemStack(wallBlock));
        }
        if (buttonBlock != null) {
            itemGroupList.add(new ItemStack(buttonBlock));
        }
        if (pressurePlateBlock != null) {
            itemGroupList.add(new ItemStack(pressurePlateBlock));
        }

        return itemGroupList;
    }

    public Block getBaseBlock() {
        return baseBlock;
    }

    public Block getStairBlock() {
        return stairBlock;
    }

    public Block getPressurePlateBlock() {
        return pressurePlateBlock;
    }

    public Block getButtonBlock() {
        return buttonBlock;
    }

    public Block getWallBlock() {
        return wallBlock;
    }

    public Block getSlabBlock() {
        return slabBlock;
    }

    public boolean isVanillaAddition() {
        return vanillaAddition;
    }
}
