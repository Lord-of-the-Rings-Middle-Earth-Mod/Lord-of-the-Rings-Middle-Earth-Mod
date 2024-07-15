package me.anedhel.lotr.block;

import me.anedhel.lotr.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public enum ModWoodType {
    PINE(ModWoodBlocks.PINE_LOG, ModWoodBlocks.STRIPPED_PINE_LOG,
            ModWoodBlocks.PINE_WOOD_FAMILY, ModWoodBlocks.STRIPPED_PINE_FAMILY, ModWoodBlocks.PINE_PLANKS_FAMILY,
            ModItems.PINE_BOAT, ModItems.PINE_CHEST_BOAT, ModWoodBlocks.PINE_LEAVES, ModWoodBlocks.PINE_SAPLINGS,
            false);

    private final Block log;
    private final Block wood;
    private final Block woodStairs;
    private final Block woodSlab;
    private final Block woodButton;
    private final Block woodPressurePlate;
    private final Block woodDoor;
    private final Block woodTrapdoor;
    private final BlockFamily woodFamily;

    private final Block strippedLog;
    private final Block strippedWood;
    private final Block strippedWoodStairs;
    private final Block strippedWoodButton;
    private final Block strippedWoodPressurePlate;
    private final Block strippedWoodSlab;
    private final Block strippedWoodDoor;
    private final Block strippedWoodTrapdoor;
    private final BlockFamily strippedWoodFamily;

    private final Block planks;
    private final Block planksStairs;
    private final Block planksSlab;
    private final Block planksButton;
    private final Block planksPressurePlate;
    private final Block planksFence;
    private final Block planksFenceGate;
    private final Block planksDoor;
    private final Block planksTrapdoor;
    private final Item planksBoat;
    private final Item planksChestBoat;
    private final BlockFamily planksFamily;

    private final Block leaves;
    private final Block sapling;

    private final boolean vanillaAddition;

    ModWoodType(Block log, Block strippedLog, @NotNull BlockFamily woodFamily, @NotNull BlockFamily strippedWoodFamily, @NotNull BlockFamily planksFamily, Item planksBoat, Item planksChestBoat, Block leaves, Block sapling, boolean vanillaAddition) {
        this.log = log;
        this.wood = woodFamily.getBaseBlock();
        this.woodStairs = woodFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.woodSlab = woodFamily.getVariant(BlockFamily.Variant.SLAB);
        this.woodButton = woodFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.woodPressurePlate = woodFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.woodDoor = woodFamily.getVariant(BlockFamily.Variant.DOOR);
        this.woodTrapdoor = woodFamily.getVariant(BlockFamily.Variant.TRAPDOOR);
        this.woodFamily = woodFamily;

        this.strippedLog = strippedLog;
        this.strippedWood = strippedWoodFamily.getBaseBlock();
        this.strippedWoodStairs = strippedWoodFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.strippedWoodSlab = strippedWoodFamily.getVariant(BlockFamily.Variant.SLAB);
        this.strippedWoodButton = strippedWoodFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.strippedWoodPressurePlate = strippedWoodFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.strippedWoodDoor = strippedWoodFamily.getVariant(BlockFamily.Variant.DOOR);
        this.strippedWoodTrapdoor = strippedWoodFamily.getVariant(BlockFamily.Variant.TRAPDOOR);
        this.strippedWoodFamily = strippedWoodFamily;

        this.planks = planksFamily.getBaseBlock();
        this.planksStairs = planksFamily.getVariant(BlockFamily.Variant.STAIRS);
        this.planksSlab = planksFamily.getVariant(BlockFamily.Variant.SLAB);
        this.planksButton = planksFamily.getVariant(BlockFamily.Variant.BUTTON);
        this.planksPressurePlate = planksFamily.getVariant(BlockFamily.Variant.PRESSURE_PLATE);
        this.planksFence = planksFamily.getVariant(BlockFamily.Variant.FENCE);
        this.planksFenceGate = planksFamily.getVariant(BlockFamily.Variant.FENCE_GATE);
        this.planksDoor = planksFamily.getVariant(BlockFamily.Variant.DOOR);
        this.planksTrapdoor = planksFamily.getVariant(BlockFamily.Variant.TRAPDOOR);
        this.planksFamily = planksFamily;
        this.planksBoat = planksBoat;
        this.planksChestBoat = planksChestBoat;

        this.leaves = leaves;
        this.sapling = sapling;

        this.vanillaAddition = vanillaAddition;
    }

    public List<ItemStack> getItemGroupList() {
        List<ItemStack> woodItemGroupList = new ArrayList<>();

        if (log != null && !vanillaAddition) {
            woodItemGroupList.add(new ItemStack(log));
        }
        if (wood != null) {
            woodItemGroupList.add(new ItemStack(wood));
        }
        if (woodStairs != null) {
            woodItemGroupList.add(new ItemStack(woodStairs));
        }
        if (woodSlab != null) {
            woodItemGroupList.add(new ItemStack(woodSlab));
        }
        if (woodButton != null) {
            woodItemGroupList.add(new ItemStack(woodButton));
        }
        if (woodPressurePlate != null) {
            woodItemGroupList.add(new ItemStack(woodPressurePlate));
        }
        if (woodDoor != null) {
            woodItemGroupList.add(new ItemStack(woodDoor));
        }
        if (woodTrapdoor != null) {
            woodItemGroupList.add(new ItemStack(woodTrapdoor));
        }
        if (strippedLog != null) {
            woodItemGroupList.add(new ItemStack(strippedLog));
        }
        if (strippedWood != null) {
            woodItemGroupList.add(new ItemStack(strippedWood));
        }
        if (strippedWoodStairs != null) {
            woodItemGroupList.add(new ItemStack(strippedWoodStairs));
        }
        if (strippedWoodSlab != null) {
            woodItemGroupList.add(new ItemStack(strippedWoodSlab));
        }
        if (strippedWoodButton != null) {
            woodItemGroupList.add(new ItemStack(strippedWoodButton));
        }
        if (strippedWoodPressurePlate != null) {
            woodItemGroupList.add(new ItemStack(strippedWoodPressurePlate));
        }
        if (strippedWoodDoor != null) {
            woodItemGroupList.add(new ItemStack(strippedWoodDoor));
        }
        if (strippedWoodTrapdoor != null) {
            woodItemGroupList.add(new ItemStack(strippedWoodTrapdoor));
        }
        if (planks != null) {
            woodItemGroupList.add(new ItemStack(planks));
        }
        if (planksStairs != null) {
            woodItemGroupList.add(new ItemStack(planksStairs));
        }
        if (planksSlab != null) {
            woodItemGroupList.add(new ItemStack(planksSlab));
        }
        if (planksButton != null) {
            woodItemGroupList.add(new ItemStack(planksButton));
        }
        if (planksPressurePlate != null) {
            woodItemGroupList.add(new ItemStack(planksPressurePlate));
        }
        if (planksFence != null) {
            woodItemGroupList.add(new ItemStack(planksFence));
        }
        if (planksFenceGate != null) {
            woodItemGroupList.add(new ItemStack(planksFenceGate));
        }
        if (planksDoor != null) {
            woodItemGroupList.add(new ItemStack(planksDoor));
        }
        if (planksTrapdoor != null) {
            woodItemGroupList.add(new ItemStack(planksTrapdoor));
        }

        return woodItemGroupList;
    }

    public List<ItemStack> getItemGroupTransportList () {
        List<ItemStack> transportItemGroupList = new ArrayList<>();

        if (planksBoat != null) {
            transportItemGroupList.add(new ItemStack(planksBoat));
        }
        if (planksChestBoat != null) {
            transportItemGroupList.add(new ItemStack(planksChestBoat));
        }

        return transportItemGroupList;
    }

    public List<ItemStack> getItemGroupPlantList () {
        List<ItemStack> plantItemGroupList = new ArrayList<>();

        if (leaves != null) {
            plantItemGroupList.add(new ItemStack(leaves));
        }
        if (sapling != null) {
            plantItemGroupList.add(new ItemStack(sapling));
        }

        return plantItemGroupList;
    }

    public Block getLog() {
        return log;
    }

    public Block getWood() {
        return wood;
    }

    public Block getWoodStairs () {
        return woodStairs;
    }

    public Block getWoodSlab () {
        return woodSlab;
    }

    public Block getWoodButton () {
        return woodButton;
    }

    public Block getWoodPressurePlate () {
        return woodPressurePlate;
    }

    public Block getWoodDoor () {
        return woodDoor;
    }

    public Block getWoodTrapdoor () {
        return woodTrapdoor;
    }

    public BlockFamily getWoodFamily() {
        return woodFamily;
    }

    public Block getStrippedLog() {
        return strippedLog;
    }

    public Block getStrippedWood() {
        return strippedWood;
    }

    public Block getStrippedWoodStairs() {
        return strippedWoodStairs;
    }

    public Block getStrippedWoodSlab() {
        return strippedWoodSlab;
    }

    public Block getStrippedWoodButton () {
        return strippedWoodButton;
    }

    public Block getStrippedWoodPressurePlate() {
        return strippedWoodPressurePlate;
    }

    public Block getStrippedWoodDoor() {
        return strippedWoodDoor;
    }

    public Block getStrippedWoodTrapdoor() {
        return strippedWoodTrapdoor;
    }

    public BlockFamily getStrippedWoodFamily() {
        return strippedWoodFamily;
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

    public Item getPlanksBoat() {
        return planksBoat;
    }

    public Item getPlanksChestBoat() {
        return planksChestBoat;
    }

    public Block getLeaves() {
        return leaves;
    }

    public Block getSapling() {
        return sapling;
    }

    public boolean isVanillaAddition() {
        return vanillaAddition;
    }
}
