package me.anedhel.lotr.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public enum ModStoneType {
    ANDESITE(Blocks.ANDESITE, null, null, null,
            ModStoneBlocks.ANDESITE_BUTTON, ModStoneBlocks.ANDESITE_PRESSURE_PLATE, ModStoneBlocks.COBBLED_ANDESITE_FAMILY, ModStoneBlocks.ANDESITE_BRICK_FAMILY, true),
    POLISHED_ANDESITE(Blocks.POLISHED_ANDESITE, null, null, ModStoneBlocks.POLISHED_ANDESITE_WALL,
            ModStoneBlocks.POLISHED_ANDESITE_BUTTON, ModStoneBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, null, null, true),

    DIORITE(Blocks.DIORITE, null, null, null,
            ModStoneBlocks.DIORITE_BUTTON, ModStoneBlocks.DIORITE_PRESSURE_PLATE, ModStoneBlocks.COBBLED_DIORITE_FAMILY, ModStoneBlocks.DIORITE_BRICK_FAMILY, true),
    POLISHED_DIORITE(Blocks.POLISHED_DIORITE, null, null, ModStoneBlocks.POLISHED_DIORITE_WALL,
            ModStoneBlocks.POLISHED_DIORITE_BUTTON, ModStoneBlocks.POLISHED_DIORITE_PRESSURE_PLATE, null, null, true),

    GRANITE(Blocks.GRANITE, null, null, null,
            ModStoneBlocks.GRANITE_BUTTON, ModStoneBlocks.GRANITE_PRESSURE_PLATE, ModStoneBlocks.COBBLED_GRANITE_FAMILY, ModStoneBlocks.GRANITE_BRICK_FAMILY, true),
    POLISHED_GRANITE(Blocks.POLISHED_GRANITE, null, null, ModStoneBlocks.POLISHED_GRANITE_WALL,
            ModStoneBlocks.POLISHED_GRANITE_BUTTON, ModStoneBlocks.POLISHED_GRANITE_PRESSURE_PLATE, null, null, true),

    SMOOTH_BASALT(Blocks.SMOOTH_BASALT, ModStoneBlocks.SMOOTH_BASALT_STAIRS, ModStoneBlocks.SMOOTH_BASALT_SLAB, ModStoneBlocks.SMOOTH_BASALT_WALL,
            ModStoneBlocks.SMOOTH_BASALT_BUTTON, ModStoneBlocks.SMOOTH_BASALT_PRESSURE_PLATE, null, null, true),
    BASALT_BRICKS(ModStoneBlocks.BASALT_BRICK, ModStoneBlocks.BASALT_BRICK_STAIRS, ModStoneBlocks.BASALT_BRICK_SLAB, ModStoneBlocks.BASALT_BRICK_WALL,
            null, null, null, null, false),

    BLUESLATE(ModStoneBlocks.BLUESLATE_FAMILY, ModStoneBlocks.COBBLED_BLUESLATE_FAMILY, ModStoneBlocks.BLUESLATE_BRICK_FAMILY, false),

    CHALK(ModStoneBlocks.CHALK_FAMILY, ModStoneBlocks.COBBLED_CHALK_FAMILY, ModStoneBlocks.CHALK_BRICK_FAMILY, false);

    private final Block stone;
    private final Block stoneStairs;
    private final Block stoneSlab;
    private final Block stoneWall;
    private final Block stoneButton;
    private final Block stonePressurePlate;
    private final BlockFamily stoneFamily;

    private final Block cobbled;
    private final Block cobbledStairs;
    private final Block cobbledSlab;
    private final Block cobbledWall;
    private final Block cobbledButton;
    private final Block cobbledPressurePlate;
    private final BlockFamily cobbledFamily;

    private final Block brick;
    private final Block brickStairs;
    private final Block brickSlab;
    private final Block brickWall;
    private final BlockFamily brickFamily;

    private final boolean vanillaAddition;

    ModStoneType(BlockFamily stoneFamily, BlockFamily cobbledFamily, BlockFamily brickFamily, boolean vanillaAddition) {
        this.stone = stoneFamily.getBaseBlock();
        this.stoneStairs = stoneFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.stoneSlab = stoneFamily.getVariant(BlockFamily.Variant.SLAB);
        this.stoneWall = stoneFamily.getVariant(BlockFamily.Variant.WALL);
        this.stoneButton = stoneFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.stonePressurePlate = stoneFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.stoneFamily = stoneFamily;

        this.cobbled = cobbledFamily.getBaseBlock();
        this.cobbledStairs = cobbledFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.cobbledSlab = cobbledFamily.getVariant(BlockFamily.Variant.SLAB);
        this.cobbledWall = cobbledFamily.getVariant(BlockFamily.Variant.WALL);
        this.cobbledButton = cobbledFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.cobbledPressurePlate = cobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.cobbledFamily = cobbledFamily;

        this.brick = brickFamily.getBaseBlock();
        this.brickStairs = brickFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.brickSlab = brickFamily.getVariant(BlockFamily.Variant.SLAB);
        this.brickWall = brickFamily.getVariant(BlockFamily.Variant.WALL);
        this.brickFamily = brickFamily;

        this.vanillaAddition = vanillaAddition;
    }

    ModStoneType(Block baseBlock, Block basestairBlock, Block baseslabBlock, Block basewallBlock, Block basebuttonBlock, Block basepressurePlateBlock, BlockFamily cobbledFamily, BlockFamily brickFamily, boolean vanillaAddition) {
        this.stone = baseBlock;
        this.stoneStairs = basestairBlock;
        this.stoneSlab = baseslabBlock;
        this.stoneWall = basewallBlock;
        this.stoneButton = basebuttonBlock;
        this.stonePressurePlate = basepressurePlateBlock;
        this.stoneFamily = null;

        this.cobbled = cobbledFamily != null ? cobbledFamily.getBaseBlock() : null;
        this.cobbledStairs = cobbledFamily != null ? cobbledFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.cobbledSlab = cobbledFamily != null ? cobbledFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.cobbledWall = cobbledFamily != null ? cobbledFamily.getVariant(BlockFamily.Variant.WALL) : null;
        this.cobbledButton = cobbledFamily != null ? cobbledFamily.getVariant(BlockFamily.Variant.BUTTON) : null;
        this.cobbledPressurePlate = cobbledFamily != null ? cobbledFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE) : null;
        this.cobbledFamily = cobbledFamily;

        this.brick = brickFamily != null ? brickFamily.getBaseBlock() : null;
        this.brickStairs = brickFamily != null ? brickFamily.getVariant(BlockFamily.Variant.STAIRS) : null;
        this.brickSlab = brickFamily != null ? brickFamily.getVariant(BlockFamily.Variant.SLAB) : null;
        this.brickWall = brickFamily != null ? brickFamily.getVariant(BlockFamily.Variant.WALL) : null;
        this.brickFamily = brickFamily;

        this.vanillaAddition = vanillaAddition;
    }

    public @NotNull List<ItemStack> getItemGroupList() {
        List<ItemStack> itemGroupList = new ArrayList<>();

        if (stone != null && !vanillaAddition) {
            itemGroupList.add(new ItemStack(stone));
        }
        if (stoneStairs != null) {
            itemGroupList.add(new ItemStack(stoneStairs));
        }
        if (stoneSlab != null) {
            itemGroupList.add(new ItemStack(stoneSlab));
        }
        if (stoneWall != null) {
            itemGroupList.add(new ItemStack(stoneWall));
        }
        if (stoneButton != null) {
            itemGroupList.add(new ItemStack(stoneButton));
        }
        if (stonePressurePlate != null) {
            itemGroupList.add(new ItemStack(stonePressurePlate));
        }
        if (cobbled != null) {
            if (!vanillaAddition) {
                itemGroupList.add(new ItemStack(cobbled));
            }
            if (cobbledStairs != null) {
                itemGroupList.add(new ItemStack(cobbledStairs));
            }
            if (cobbledSlab != null) {
                itemGroupList.add(new ItemStack(cobbledSlab));
            }
            if (cobbledWall != null) {
                itemGroupList.add(new ItemStack(cobbledWall));
            }
            if (cobbledButton != null) {
                itemGroupList.add(new ItemStack(cobbledButton));
            }
            if (cobbledPressurePlate != null) {
                itemGroupList.add(new ItemStack(cobbledPressurePlate));
            }
        }
        if (brick != null) {
            if (!vanillaAddition) {
                itemGroupList.add(new ItemStack(brick));
            }
            if (brickStairs != null) {
                itemGroupList.add(new ItemStack(brickStairs));
            }
            if (brickSlab != null) {
                itemGroupList.add(new ItemStack(brickSlab));
            }
            if (brickWall != null) {
                itemGroupList.add(new ItemStack(brickWall));
            }
        }

        return itemGroupList;
    }

    public Block getStone() {
        return stone;
    }

    public Block getStoneStairs() {
        return stoneStairs;
    }

    public Block getStoneSlab() {
        return stoneSlab;
    }

    public Block getStoneWall() {
        return stoneWall;
    }

    public Block getStoneButton() {
        return stoneButton;
    }

    public Block getStonePressurePlate() {
        return stonePressurePlate;
    }

    public BlockFamily getStoneFamily() {
        return stoneFamily;
    }

    public Block getCobbled() {
        return cobbled;
    }

    public Block getCobbledSlab() {
        return cobbledSlab;
    }

    public Block getCobbledStairs() {
        return cobbledStairs;
    }

    public Block getCobbledWall() {
        return cobbledWall;
    }

    public Block getCobbledPressurePlate() {
        return cobbledPressurePlate;
    }

    public Block getCobbledButton() {
        return cobbledButton;
    }

    public BlockFamily getCobbledFamily() {
        return cobbledFamily;
    }

    public Block getBrick() {
        return brick;
    }

    public Block getBrickStairs() {
        return brickStairs;
    }

    public Block getBrickSlab() {
        return brickSlab;
    }

    public Block getBrickWall() {
        return brickWall;
    }

    public BlockFamily getBrickFamily() {
        return brickFamily;
    }

    public boolean isVanillaAddition() {
        return vanillaAddition;
    }
}
