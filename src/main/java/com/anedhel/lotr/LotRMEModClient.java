package com.anedhel.lotr;

import com.anedhel.lotr.block.woodtypes.ModWoodSet;
import com.anedhel.lotr.block.woodtypes.ModWoodTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class LotRMEModClient implements ClientModInitializer {

	/**
	 * Runs the mod initializer on the client environment.
	 */
	@Override
	public void onInitializeClient() {
		registerWoodTypeCutoutLayers();
	}

	private void registerWoodTypeCutoutLayers() {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();

			BlockRenderLayerMap.putBlock(woodSet.getPlanksVariant("door"), BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(woodSet.getPlanksVariant("trapdoor"), BlockRenderLayer.CUTOUT);
		}
	}
}
