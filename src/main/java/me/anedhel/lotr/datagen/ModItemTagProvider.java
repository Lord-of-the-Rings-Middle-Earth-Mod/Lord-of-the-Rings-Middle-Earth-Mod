package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.item.ModGearType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        configureGear(ModGearType.BRONZE);
        configureModWoodType(ModWoodType.PINE);
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

    /**
     * This Method configures all required Tags for the given ModWoodType
     * @param woodType The ModWoodType, that the Tags should be configured for
     */
    private void configureModWoodType(ModWoodType woodType) {
        Block log = woodType.getLog();
        Block wood = woodType.getWood();
        Block strippedLog = woodType.getStrippedLog();
        Block strippedWood = woodType.getStrippedWood();
        Block planks = woodType.getPlanks();

        FabricTagBuilder logsThatBurnTag = getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN);
        FabricTagBuilder planksTag = getOrCreateTagBuilder(ItemTags.PLANKS);
        FabricTagBuilder logTag = getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("lotr", log.getName().getString().replace(' ', '_').toLowerCase())));

        if (!woodType.isVanillaAddition()) {
            if (log != null) {
                logsThatBurnTag.add(log.asItem());
                logTag.add(log.asItem());
            }
        }
        if (wood != null) {
            logsThatBurnTag.add(wood.asItem());
            logTag.add(wood.asItem());
        }
        if (strippedLog != null) {
            logsThatBurnTag.add(strippedLog.asItem());
            logTag.add(strippedLog.asItem());
        }
        if (strippedWood != null) {
            logsThatBurnTag.add(strippedWood.asItem());
            logTag.add(strippedWood.asItem());
        }
        if (planks != null) {
            planksTag.add(planks.asItem());
        }
    }

    private String turnBlockIntoTag () {
        return null;
    }
}