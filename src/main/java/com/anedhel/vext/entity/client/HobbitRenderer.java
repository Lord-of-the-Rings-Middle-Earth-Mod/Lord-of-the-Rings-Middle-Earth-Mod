/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.entity.client;

import com.anedhel.vext.VExtMod;
import com.anedhel.vext.entity.custom.HobbitEntity;
import com.anedhel.vext.entity.variant.HobbitVariant;
import com.google.common.collect.Maps;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

/**
 * A renderer for the Hobbbit Entity.
 *
 * @autor Moritz Rohleder
 * @since 0.1.0
 */
public class HobbitRenderer extends MobEntityRenderer<HobbitEntity, HobbitRenderState, HobbitModel> {

	private static final String TEXTURE_PATH = "textures/entity" + "/hobbit/";
	private static final Map<HobbitVariant, Identifier> LOCATION_BY_VARIANT = Util.make(
			Maps.newEnumMap(HobbitVariant.class), map -> {
				map.put(HobbitVariant.HOBBIT_1,
						Identifier.of(VExtMod.MOD_ID, TEXTURE_PATH + "hobbit_1.png"));
				map.put(HobbitVariant.HOBBIT_2,
						Identifier.of(VExtMod.MOD_ID, TEXTURE_PATH + "hobbit_2.png"));
				map.put(HobbitVariant.HOBBIT_3,
						Identifier.of(VExtMod.MOD_ID, TEXTURE_PATH + "hobbit_3.png"));
			});

	public HobbitRenderer(EntityRendererFactory.Context context) {
		super(context, new HobbitModel(context.getPart(ModEntityModelLayers.HOBBIT)), 0.5f);
	}

	@Override
	public Identifier getTexture(HobbitRenderState state) {
		return LOCATION_BY_VARIANT.get(state.variant);
	}

	/**
	 * Renders the Hobbit Entity, applying a scaling transformation if the entity is a baby.
	 *
	 * @param state the render state of the Hobbit Entity
	 * @param matrixStack the matrix stack to apply transformations to
	 * @param orderedRenderCommandQueue the queue for ordered render commands
	 * @param cameraRenderState the current state of the camera render
	 */
	@Override
	public void render(HobbitRenderState state, MatrixStack matrixStack,
			OrderedRenderCommandQueue orderedRenderCommandQueue, CameraRenderState cameraRenderState) {
		if(state.baby) {
			matrixStack.scale(0.5f, 0.5f, 0.5f);
		} else {
			matrixStack.scale(1f, 1f, 1f);
		}

		super.render(state, matrixStack, orderedRenderCommandQueue, cameraRenderState);
	}

	/**
	 * Creates a new render state for the Hobbit Entity.
	 *
	 * @return a new HobbitRenderState instance
	 */
	@Override
	public HobbitRenderState createRenderState() {
		return new HobbitRenderState();
	}

	/**
	 * Updates the render state of the Hobbit Entity.
	 *
	 * @param livingEntity the Hobbit Entity
	 * @param livingEntityRenderState the render state to update
	 * @param f the partial tick time
	 */
	@Override
	public void updateRenderState(HobbitEntity livingEntity, HobbitRenderState livingEntityRenderState, float f) {
		super.updateRenderState(livingEntity, livingEntityRenderState, f);
		livingEntityRenderState.idleAnimationState.copyFrom(livingEntity.idleAnimationState);
		livingEntityRenderState.variant = livingEntity.getVariant();
	}
}
