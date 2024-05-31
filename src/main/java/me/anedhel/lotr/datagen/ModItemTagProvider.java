package me.anedhel.lotr.datagen;

import me.anedhel.lotr.item.ModGearType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        configureGear(ModGearType.BRONZE);
    }

    /**
     * This Method configures all required Tags for the given GearType
     * @param gearType The ModGearType, that the Tags should be configured for
     */
    private void configureGear(ModGearType gearType) {
        Item helmet = gearType.getHelmet();
        Item chestplate = gearType.getChestplate();
        Item leggings = gearType.getLeggings();
        Item boots = gearType.getBoots();
        /*Item sword = gearType.getSword();
        Item axe = gearType.getAxe();
        Item pickaxe = gearType.getPickaxe();
        Item shovel = gearType.getShovel();
        Item hoe = gearType.getHoe();*/

        FabricTagBuilder trimTag = getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR);

        if (!gearType.isVanillaAddition()) {
            if (helmet != null){
                trimTag.add(helmet);
            }
            if (chestplate != null){
                trimTag.add(chestplate);
            }
            if (leggings != null){
                trimTag.add(leggings);
            }
            if (boots != null){
                trimTag.add(boots);
            }
            /*if (sword != null){

            }
            if (axe != null){

            }
            if (pickaxe != null){

            }
            if (shovel != null){

            }
            if (hoe != null){

            }*/
        }
    }
}