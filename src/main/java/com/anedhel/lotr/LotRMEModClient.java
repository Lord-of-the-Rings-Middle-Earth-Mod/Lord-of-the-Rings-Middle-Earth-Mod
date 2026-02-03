/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr;

import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.block.stonetypes.ModStoneTypes;
import com.anedhel.lotr.block.woodtypes.ModWoodSet;
import com.anedhel.lotr.block.woodtypes.ModWoodTypes;
import com.anedhel.lotr.screen.ModScreenHandlers;
import com.anedhel.lotr.screen.custom.CarpentryTableScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.data.family.BlockFamily;

public class LotRMEModClient implements ClientModInitializer {

	/**
	 * Runs the mod initializer on the client environment.
	 */
	@Override
	public void onInitializeClient() {
		registerWoodTypeCutoutLayers();
		registerStoneTypeCutoutLayers();
		registerCropCutoutLayers();

		BlockRenderLayerMap.putBlock(ModBlocks.CARPENTRY_TABLE, BlockRenderLayer.CUTOUT);

		HandledScreens.register(ModScreenHandlers.CARPENTRY_TABLE_SCREEN_HANDLER, CarpentryTableScreen::new);
	}

	private void registerWoodTypeCutoutLayers() {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();

			BlockRenderLayerMap.putBlock(woodSet.getPlanksVariant("door"), BlockRenderLayer.CUTOUT);
			BlockRenderLayerMap.putBlock(woodSet.getPlanksVariant("trapdoor"), BlockRenderLayer.CUTOUT);
		}
	}

	private void registerStoneTypeCutoutLayers() {
		for(ModStoneTypes stoneType : ModStoneTypes.values()) {
			stoneType.getModStoneSet().getAllBlockFamilies().forEach(this::registerStoneFamilyOverlays);
			stoneType.getModStoneSet().getAllStoneSubSets().forEach(subSet ->
					subSet.getAllBlockFamilies().forEach(this::registerStoneFamilyOverlays));
		}
	}

	private void registerCropCutoutLayers() {
		BlockRenderLayerMap.putBlock(ModBlocks.TOMATO_CROP, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(ModBlocks.WILD_TOMATO, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(ModBlocks.POTTED_WILD_TOMATO, BlockRenderLayer.CUTOUT);
	}

	private void registerStoneFamilyOverlays(BlockFamily stoneFamily) {
		BlockRenderLayerMap.putBlock(stoneFamily.getBaseBlock(), BlockRenderLayer.CUTOUT);
		for (Block variant : stoneFamily.getVariants().values()) {
			BlockRenderLayerMap.putBlock(variant, BlockRenderLayer.CUTOUT);
		}
	}
}
