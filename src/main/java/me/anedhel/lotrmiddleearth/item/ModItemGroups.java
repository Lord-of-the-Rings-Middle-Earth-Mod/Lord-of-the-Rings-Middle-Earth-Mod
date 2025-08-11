package me.anedhel.lotrmiddleearth.item;

import me.anedhel.lotrmiddleearth.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotrmiddleearth.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LOTR_STONE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "lotr_stone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lotr_stone"))
                    .icon(() -> new ItemStack(ModBlocks.CHALK)).entries((displayContext, entries) -> {
                        // Basic chalk blocks
                        entries.add(ModBlocks.CHALK);
                        entries.add(ModBlocks.CHALK_SLAB);
                        entries.add(ModBlocks.CHALK_STAIRS);
                        entries.add(ModBlocks.CHALK_WALL);
                        
                        entries.add(ModBlocks.CHALK_BRICK);
                        entries.add(ModBlocks.CHALK_BRICK_SLAB);
                        entries.add(ModBlocks.CHALK_BRICK_STAIRS);
                        entries.add(ModBlocks.CHALK_BRICK_WALL);
                        
                        entries.add(ModBlocks.CHALK_PAVEMENT);
                        entries.add(ModBlocks.CHALK_PAVEMENT_SLAB);
                        entries.add(ModBlocks.CHALK_PAVEMENT_STAIRS);
                        entries.add(ModBlocks.CHALK_PAVEMENT_WALL);
                        
                        entries.add(ModBlocks.CHALK_TILES);
                        entries.add(ModBlocks.CHALK_TILES_SLAB);
                        entries.add(ModBlocks.CHALK_TILES_STAIRS);
                        
                        entries.add(ModBlocks.CHISELED_CHALK_BRICK);
                        
                        entries.add(ModBlocks.COBBLED_CHALK);
                        entries.add(ModBlocks.COBBLED_CHALK_SLAB);
                        entries.add(ModBlocks.COBBLED_CHALK_STAIRS);
                        entries.add(ModBlocks.COBBLED_CHALK_WALL);
                        
                        entries.add(ModBlocks.COBBLED_CHALK_BRICKS);
                        entries.add(ModBlocks.COBBLED_CHALK_BRICKS_SLAB);
                        entries.add(ModBlocks.COBBLED_CHALK_BRICKS_STAIRS);
                        entries.add(ModBlocks.COBBLED_CHALK_BRICKS_WALL);
                        
                        entries.add(ModBlocks.SMOOTH_CHALK);
                        entries.add(ModBlocks.SMOOTH_CHALK_SLAB);
                        entries.add(ModBlocks.SMOOTH_CHALK_STAIRS);
                        
                        entries.add(ModBlocks.FANCY_CHALK_BRICKS);
                        entries.add(ModBlocks.FANCY_CHALK_BRICKS_SLAB);
                        entries.add(ModBlocks.FANCY_CHALK_BRICKS_STAIRS);
                        
                        entries.add(ModBlocks.CHALK_PILLAR);
                        
                        // Cracked variants
                        entries.add(ModBlocks.CRACKED_CHALK_BRICK);
                        entries.add(ModBlocks.CRACKED_CHALK_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_CHALK_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_CHALK_BRICK_WALL);
                        
                        entries.add(ModBlocks.CRACKED_CHALK_PAVEMENT);
                        entries.add(ModBlocks.CRACKED_CHALK_PAVEMENT_SLAB);
                        entries.add(ModBlocks.CRACKED_CHALK_PAVEMENT_STAIRS);
                        entries.add(ModBlocks.CRACKED_CHALK_PAVEMENT_WALL);
                        
                        entries.add(ModBlocks.CRACKED_CHALK_TILES);
                        entries.add(ModBlocks.CRACKED_CHALK_TILES_SLAB);
                        entries.add(ModBlocks.CRACKED_CHALK_TILES_STAIRS);
                        
                        entries.add(ModBlocks.CRACKED_COBBLED_CHALK_BRICKS);
                        entries.add(ModBlocks.CRACKED_COBBLED_CHALK_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_COBBLED_CHALK_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_COBBLED_CHALK_BRICKS_WALL);
                        
                        entries.add(ModBlocks.CRACKED_FANCY_CHALK_BRICKS);
                        entries.add(ModBlocks.CRACKED_FANCY_CHALK_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_FANCY_CHALK_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_FANCY_CHALK_BRICKS_WALL);
                        
                        entries.add(ModBlocks.CRACKED_SMOOTH_CHALK);
                        entries.add(ModBlocks.CRACKED_SMOOTH_CHALK_SLAB);
                        entries.add(ModBlocks.CRACKED_SMOOTH_CHALK_STAIRS);
                        
                        entries.add(ModBlocks.CRACKED_CHALK_PILLAR);
                        
                    }).build());

    public static void registerItemGroups() {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Item Groups for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}