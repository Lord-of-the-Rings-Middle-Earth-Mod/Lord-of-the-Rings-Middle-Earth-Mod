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

/**
 * This class is used to manage all ItemGroups the Mod uses and adds
 */
public class ModItemGroups {

    public static final ItemGroup LOTR_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lotr_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.CHALK)).entries(((displayContext, entries) -> {
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
                    })).build());

    /**
     * This Method is run on startup and informs that ItemGroups are being registered.
     */
    public static void registerModItemGroups () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod ItemGroups for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}
