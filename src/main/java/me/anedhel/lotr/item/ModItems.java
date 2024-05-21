package me.anedhel.lotr.item;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,
                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name), item);
    }

    public static void registerModItems () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod Items for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}
