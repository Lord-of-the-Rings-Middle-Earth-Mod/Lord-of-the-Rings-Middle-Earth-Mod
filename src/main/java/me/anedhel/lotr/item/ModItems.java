/*
 * Copyright (c)
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * lord-of-the-rings-middle-earth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * lord-of-the-rings-middle-earth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotr.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModWoodBlocks;
import me.anedhel.lotr.entity.ModBoats;
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
		    new SpawnEggItem(ModEntities.HOBBIT, 0x008000, 0xcccc00, new FabricItemSettings()));

    public static final Item PINE_SIGN = registerItem("pine_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModWoodBlocks.STANDING_PINE_SIGN, ModWoodBlocks.WALL_PINE_SIGN));
    public static final Item HANGING_PINE_SIGN = registerItem("hanging_pine_sign",
            new HangingSignItem(ModWoodBlocks.HANGING_PINE_SIGN, ModWoodBlocks.WALL_HANGING_PINE_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item PINE_BOAT = TerraformBoatItemHelper
            .registerBoatItem(ModBoats.PINE_BOAT_ID, ModBoats.PINE_BOAT_KEY, false);
    public static final Item PINE_CHEST_BOAT = TerraformBoatItemHelper
            .registerBoatItem(ModBoats.PINE_CHEST_BOAT_ID, ModBoats.PINE_BOAT_KEY, true);


    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));

    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new FabricItemSettings()));

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
    public static final Item BAKED_TOMATO = registerItem("baked_tomato",
            new Item(new FabricItemSettings().food(ModFoodComponents.BAKED_TOMATO)));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    public static final Item LETTUCE = registerItem("lettuce",
            new AliasedBlockItem(ModBlocks.LETTUCE_CROP, new FabricItemSettings()));

    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings().food(ModFoodComponents.CORN)));
    public static final Item COOKED_CORN = registerItem("cooked_corn",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_CORN)));
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
