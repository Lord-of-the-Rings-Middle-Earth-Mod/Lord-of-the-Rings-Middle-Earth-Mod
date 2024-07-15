package me.anedhel.lotr.item;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.block.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * This class is used to manage all ItemGroups the Mod uses and adds
 */
public class ModItemGroups {

    public static final ItemGroup LOTR_STONES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_stones"),
            FabricItemGroup.builder()
                    .displayName(Text.translatableWithFallback("itemgroup.lotr_stone", "LotR Stones"))
                    .icon(() -> new ItemStack(ModStoneBlocks.BLUESLATE)).entries(((displayContext, entries) -> {
                        entries.addAll(ModStoneType.ANDESITE.getItemGroupList());
                        entries.addAll(ModStoneType.POLISHED_ANDESITE.getItemGroupList());

                        entries.addAll(ModStoneType.DIORITE.getItemGroupList());
                        entries.addAll(ModStoneType.POLISHED_DIORITE.getItemGroupList());

                        entries.addAll(ModStoneType.GRANITE.getItemGroupList());
                        entries.addAll(ModStoneType.POLISHED_GRANITE.getItemGroupList());

                        entries.addAll(ModStoneType.BLUESLATE.getItemGroupList());
                        entries.addAll(ModStoneType.CHALK.getItemGroupList());
                    })).build());

    public static final ItemGroup LOTR_WOOD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_wood"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_wood", "LotR Wood"))
                    .icon(() -> new ItemStack(ModWoodBlocks.PINE_LOG)).entries(((displayContext, entries) -> {
                        entries.addAll(ModWoodType.PINE.getItemGroupList());
                    })).build());

    public static final ItemGroup LOTR_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_blocks"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_blocks", "LotR Blocks"))
                    .icon(() -> new ItemStack(ModStoneBlocks.CHALK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                    }).build());

    public static final ItemGroup LOTR_FOOD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_food"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_food", "LotR Food"))
                    .icon(() -> new ItemStack(ModItems.TOMATO)).entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.BEETROOT_CRATE);
                        entries.add(ModBlocks.CARROT_CRATE);
                        entries.add(ModBlocks.POTATO_CRATE);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModBlocks.TOMATO_CRATE);
                        entries.add(ModItems.CORN);
                        entries.add(ModBlocks.CORN_CRATE);
                    })).build());

    public static final ItemGroup LOTR_PLANTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_plants"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_plants", "LotR Plants"))
                    .icon(() -> new ItemStack(ModItems.TOMATO_SEEDS)).entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.WILD_BEETROOT);
                        entries.add(ModBlocks.WILD_CARROT);
                        entries.add(ModBlocks.WILD_POTATO);
                        entries.add(ModBlocks.WILD_CORN);
                        entries.add(ModBlocks.WILD_LETTUCE);
                        entries.add(ModBlocks.WILD_TOMATO);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.LETTUCE);
                        entries.add(ModBlocks.LETTUCE_CRATE);
                        entries.add(ModItems.CORN_SEEDS);
                    })).build());

    public static final ItemGroup LOTR_INGREDIENTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_ingredients"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_ingredients", "LotR Ingredients"))
                    .icon(() -> new ItemStack(ModItems.TIN_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.BRONZE_INGOT);
                    }).build());

    public static final ItemGroup LOTR_TOOLS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_tools"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_tools", "LotR Tools"))
                    .icon(() -> new ItemStack(ModItems.BRONZE_AXE)).entries((displayContext, entries) -> {
                        entries.addAll(ModGearType.BRONZE.getToolItemGroupList());
                    }).build());

    public static final ItemGroup LOTR_TRANSPORT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_transport"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr:transport", "LotR Transport"))
                    .icon(() -> new ItemStack(ModItems.PINE_BOAT)).entries(((displayContext, entries) -> {
                        entries.addAll(ModWoodType.PINE.getItemGroupTransportList());
                    })).build());

    public static final ItemGroup LOTR_COMBAT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_combat"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_combat", "LotR Combar"))
                    .icon(() -> new ItemStack(ModItems.BRONZE_SWORD)).entries((displayContext, entries) -> {
                        entries.addAll(ModGearType.BRONZE.getCombatItemGroupList());
                    }).build());

    public static final ItemGroup LOTR_SPAWNING = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_spawning"),
            FabricItemGroup.builder().displayName(Text.translatableWithFallback("itemgroup.lotr_spawning", "LotR Spawning"))
                    .icon(() -> new ItemStack(ModItems.HOBBIT_SPAWN_EGG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.HOBBIT_SPAWN_EGG);
                    }).build());

    /**
     * This Method is run on startup and informs that ItemGroups are being registered.
     */
    public static void registerModItemGroups () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod ItemGroups for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}
