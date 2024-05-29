package me.anedhel.lotr.item;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * This class is used to register all Items added by the mod.
 */
public class ModItems {


    /**
     * This Method is used to register Items with minecraft.
     * @param name the name of the Item
     * @param item the Item
     * @return the Item after it has been registered
     */
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
