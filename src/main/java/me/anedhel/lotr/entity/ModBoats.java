package me.anedhel.lotr.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import me.anedhel.lotr.block.ModWoodBlocks;
import me.anedhel.lotr.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {

    public static final Identifier PINE_BOAT_ID = new Identifier("lotr", "pine_boat");
    public static final Identifier PINE_CHEST_BOAT_ID = new Identifier("lotr", "pine_chest_boat");

    public static final RegistryKey<TerraformBoatType> PINE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINE_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType pineBoat = new TerraformBoatType.Builder()
                .item(ModItems.PINE_BOAT)
                .chestItem(ModItems.PINE_CHEST_BOAT)
                .planks(Item.fromBlock(ModWoodBlocks.PINE_PLANKS))
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PINE_BOAT_KEY, pineBoat);
    }
}
