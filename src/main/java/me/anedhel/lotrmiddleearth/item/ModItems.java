package me.anedhel.lotrmiddleearth.item;

import me.anedhel.lotrmiddleearth.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotrmiddleearth.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * A helper class, that will register all Items to be added.
 */
public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    /**
     * This adds the following Items to the Ingredient Tab in the creative Menu.
     * - RUBY
     * @param entries The Item Group that the items should be added to. Should always be ItemGroups.INGREDIENTS.
     */
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    /**
     * Registers a given Item with the game.
     * @param name The name, by which the item will be referred to for textures, models and the language files.
     * @param item The Item that is meant to be registered.
     * @return The registered Item.
     */
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Items for " + LordOfTheRingsMiddleEarthMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
