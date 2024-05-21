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
                    .icon(() -> new ItemStack(ModBlocks.CHALK_STONE)).entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.CHALK_STONE);
                        entries.add(ModBlocks.CHALK_STONE_STAIRS);
                        entries.add(ModBlocks.CHALK_STONE_SLAB);
                        entries.add(ModBlocks.CHALK_STONE_WALL);
                        entries.add(ModBlocks.CHALK_STONE_BUTTON);
                        entries.add(ModBlocks.CHALK_STONE_PRESSUREPLATE);
                    })).build());

    public static void registerModItemGroups () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod ItemGroups for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}
