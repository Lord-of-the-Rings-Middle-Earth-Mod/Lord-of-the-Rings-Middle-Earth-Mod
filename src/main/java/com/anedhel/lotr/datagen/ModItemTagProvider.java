package com.anedhel.lotr.datagen;

import com.anedhel.lotr.block.woodtypes.ModWoodSet;
import com.anedhel.lotr.block.woodtypes.ModWoodTypes;
import com.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

	public ModItemTagProvider(FabricDataOutput output,
			CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		configureModWoodTypes(wrapperLookup);

		valueLookupBuilder(ConventionalItemTags.RAW_MATERIALS)
				.add(ModItems.RAW_TIN)
				.add(ModItems.RAW_SILVER);
		valueLookupBuilder(ConventionalItemTags.INGOTS)
				.add(ModItems.TIN_INGOT)
				.add(ModItems.SILVER_INGOT);
		valueLookupBuilder(ConventionalItemTags.NUGGETS)
				.add(ModItems.SILVER_NUGGET);
	}

	private void configureModWoodTypes(RegistryWrapper.WrapperLookup wrapperLookup) {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();

			valueLookupBuilder(woodSet.getLogItemTag())
					.add(woodSet.getLog().asItem())
					.add(woodSet.getStrippedLog().asItem())
					.add(woodSet.getWood().asItem())
					.add(woodSet.getStrippedWood().asItem());
		}
	}

}
