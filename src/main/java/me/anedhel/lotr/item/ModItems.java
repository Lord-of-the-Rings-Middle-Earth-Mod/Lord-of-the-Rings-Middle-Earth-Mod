package me.anedhel.lotr.item;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModWoodBlocks;
import me.anedhel.lotr.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * This class is used to register all Items added by the mod.
 */
public class ModItems {

    public static final Item HOBBIT_SPAWN_EGG = registerItem("hobbit_spawn_egg",
            new SpawnEggItem(ModEntities.HOBBIT, 0xa86518, 0x3b260f, new FabricItemSettings()));

    public static final Item PINE_SIGN = registerItem("pine_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModWoodBlocks.STANDING_PINE_SIGN, ModWoodBlocks.WALL_PINE_SIGN));
    public static final Item HANGING_PINE_SIGN = registerItem("hanging_pine_sign",
            new HangingSignItem(ModWoodBlocks.HANGING_PINE_SIGN, ModWoodBlocks.WALL_HANGING_PINE_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));

    public static final Item BRONZE_SWORD = registerItem("bronze_sword",
            new SwordItem(ModToolMaterial.BRONZE, 3, -2.4f, new FabricItemSettings()));
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe",
            new PickaxeItem(ModToolMaterial.BRONZE, 1, -2.8f, new FabricItemSettings()));
    public static final Item BRONZE_AXE = registerItem("bronze_axe",
            new AxeItem(ModToolMaterial.BRONZE, 6, -3.1f, new FabricItemSettings()));
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel",
            new ShovelItem(ModToolMaterial.BRONZE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item BRONZE_HOE = registerItem("bronze_hoe",
            new HoeItem(ModToolMaterial.BRONZE, -2, -1.0f, new FabricItemSettings()));

    public static final Item BRONZE_HELMET = registerItem("bronze_helmet",
            new ArmorItem(ModArmorMaterial.BRONZE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate",
            new ArmorItem(ModArmorMaterial.BRONZE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings",
            new ArmorItem(ModArmorMaterial.BRONZE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BRONZE_BOOTS = registerItem("bronze_boots",
            new ArmorItem(ModArmorMaterial.BRONZE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    public static final Item LETTUCE = registerItem("lettuce",
            new AliasedBlockItem(ModBlocks.LETTUCE_CROP, new FabricItemSettings()));

    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings().food(ModFoodComponents.CORN)));
    public static final Item CORN_SEEDS = registerItem("corn_seeds",
            new AliasedBlockItem(ModBlocks.CORN_CROP, new FabricItemSettings()));

    /**
     * This Method is used to register Items with minecraft.
     * @param name the name of the Item
     * @param item the Item
     * @return the Item after it has been registered
     */
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,
                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name), item);
    }

    /**
     * This Method is run on startup and informs that Items are being registered.
     */
    public static void registerModItems () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod Items for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}
