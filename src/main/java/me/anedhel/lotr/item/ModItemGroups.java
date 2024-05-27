package me.anedhel.lotr.item;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup LOTR_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lotr_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.CHALK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModBlocks.CHALK);
                        entries.add(ModBlocks.CHALK_STAIRS);
                        entries.add(ModBlocks.CHALK_SLAB);
                        entries.add(ModBlocks.CHALK_WALL);
                        entries.add(ModBlocks.CHALK_BUTTON);
                        entries.add(ModBlocks.CHALK_PRESSURE_PLATE);
                        entries.add(ModBlocks.CHALK_BRICK);
                        entries.add(ModBlocks.CHALK_BRICK_STAIRS);
                        entries.add(ModBlocks.CHALK_BRICK_SLAB);
                        entries.add(ModBlocks.CHALK_BRICK_WALL);
                        entries.add(ModBlocks.COBBLED_CHALK);
                        entries.add(ModBlocks.COBBLED_CHALK_STAIRS);
                        entries.add(ModBlocks.COBBLED_CHALK_SLAB);
                        entries.add(ModBlocks.COBBLED_CHALK_WALL);
                        entries.add(ModBlocks.COBBLED_CHALK_BUTTON);
                        entries.add(ModBlocks.COBBLED_CHALK_PRESSURE_PLATE);
                    }).build());

    public static final ItemGroup LOTR_INGREDIENTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_ingredients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lotr_ingredients"))
                    .icon(() -> new ItemStack(ModItems.TIN_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.BRONZE_INGOT);
                    }).build());

    public static final ItemGroup LOTR_TOOLS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lotr_tools"))
                    .icon(() -> new ItemStack(ModItems.BRONZE_AXE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BRONZE_AXE);
                        entries.add(ModItems.BRONZE_PICKAXE);
                        entries.add(ModItems.BRONZE_SHOVEL);
                        entries.add(ModItems.BRONZE_HOE);
                    }).build());

    public static final ItemGroup LOTR_COMBAT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_combat"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lotr_combat"))
                    .icon(() -> new ItemStack(ModItems.BRONZE_SWORD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BRONZE_SWORD);
                        entries.add(ModItems.BRONZE_HELMET);
                        entries.add(ModItems.BRONZE_CHESTPLATE);
                        entries.add(ModItems.BRONZE_LEGGINGS);
                        entries.add(ModItems.BRONZE_BOOTS);
                    }).build());

    public static void registerModItemGroups () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod ItemGroups for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}
