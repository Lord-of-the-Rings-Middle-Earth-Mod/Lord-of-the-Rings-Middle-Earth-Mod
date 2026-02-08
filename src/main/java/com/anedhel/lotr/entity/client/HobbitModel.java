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

package com.anedhel.lotr.entity.client;

import com.anedhel.lotr.entity.client.animation.HobbitAnimations;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.util.math.MathHelper;

/**
 * A model for the Hobbit entity, defining its geometry and animations.
 * Created with Blockbench
 *
 * @autor bakbar
 * @since 0.1.0
 */
public class HobbitModel extends EntityModel<HobbitRenderState> {
	private final ModelPart hobbitTextured;
	private final ModelPart head;

	private final Animation walkingAnimation;
	private final Animation idleAnimation;

	public HobbitModel(ModelPart root) {
		super(root);
		this.hobbitTextured = root.getChild("hobbitTextured");
		this.head = this.hobbitTextured.getChild("hobbitSlim").getChild("head");

		this.walkingAnimation = HobbitAnimations.WALKING.createAnimation(root);
		this.idleAnimation = HobbitAnimations.IDLE.createAnimation(root);
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData hobbitTextured = modelPartData.addChild("hobbitTextured", ModelPartBuilder.create(),
				ModelTransform.rotation(-8.0F, 24.0F, 10.0F));

		ModelPartData hobbitSlim = hobbitTextured.addChild("hobbitSlim", ModelPartBuilder.create(),
				ModelTransform.rotation(8.0F, 0.0F, -10.0F));

		ModelPartData head = hobbitSlim.addChild("head", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -8.0F, -4.0F
						, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.25F)), ModelTransform.rotation(0.0F, -14.0F, 0.0F));

		ModelPartData body = hobbitSlim.addChild("body", ModelPartBuilder.create().uv(28, 12).cuboid(-4.0F, 0.0F, -2.0F
				, 8.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, -14.0F, 0.0F));

		ModelPartData rightArm = body.addChild("rightArm", ModelPartBuilder.create().uv(36, 0).cuboid(-2.0F, -2.0F,
				-2.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.rotation(-5.0F, 2.0F, 0.0F));

		ModelPartData leftArm = body.addChild("leftArm", ModelPartBuilder.create().uv(16, 34).cuboid(-1.0F, -2.0F,
				-2.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.rotation(5.0F, 2.0F, 0.0F));

		ModelPartData hobbitPipe = leftArm.addChild("hobbitPipe", ModelPartBuilder.create().uv(0, 16).cuboid(-1.0F,
						-2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(0.0F, -5.0F, 1.0F, 0.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, -2.0F, 1.2217F, 0.0F, -0.6109F));

		ModelPartData legs = body.addChild("legs", ModelPartBuilder.create(), ModelTransform.rotation(0.0F, 8.0F,
				0.0F));

		ModelPartData rightLeg = legs.addChild("rightLeg", ModelPartBuilder.create().uv(0, 32).cuboid(-2.0F, 0.0F,
				-2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.rotation(-1.9F, 0.0F, 0.0F));

		ModelPartData leftLeg = legs.addChild("leftLeg", ModelPartBuilder.create().uv(28, 28).cuboid(-2.0F, 0.0F,
				-2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.rotation(1.9F, 0.0F, 0.0F));

		ModelPartData smoke = hobbitTextured.addChild("smoke", ModelPartBuilder.create(),
				ModelTransform.rotation(8.0F, -2.0F, -10.0F));

		ModelPartData ring2 = smoke.addChild("ring2", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, 0.0F, -1.0F,
				2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 0.0F, 0.0F));

		ModelPartData ring3 = smoke.addChild("ring3", ModelPartBuilder.create().uv(9, 32).cuboid(-1.5F, 0.0F, -1.5F,
				3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 0.0F, 0.0F));

		ModelPartData ring4 = smoke.addChild("ring4", ModelPartBuilder.create().uv(28, 24).cuboid(-2.0F, 0.0F, -2.0F,
				4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 0.0F, 0.0F));

		ModelPartData ring5 = smoke.addChild("ring5", ModelPartBuilder.create().uv(35, 24).cuboid(-2.5F, 0.0F, -2.5F,
				5.0F, 0.0F, 5.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 0.0F, 0.0F));

		ModelPartData ring6 = smoke.addChild("ring6", ModelPartBuilder.create().uv(18, 0).cuboid(-3.0F, 0.0F, -3.0F,
				6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void setAngles(HobbitRenderState state) {
		super.setAngles(state);
		this.setHeadAngles(state.relativeHeadYaw, state.pitch);

		this.walkingAnimation.applyWalking(state.limbSwingAnimationProgress, state.limbSwingAmplitude,
			2f, 2.5f);
		this.idleAnimation.apply(state.idleAnimationState, state.age, 1f);
	}

	public void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -40f, 40f);
		headPitch = MathHelper.clamp(headPitch, -20f, 20f);

		this.head.yaw = headYaw * (float) (Math.PI / 180.0);
		this.head.pitch = headPitch * (float) (Math.PI / 180.0);
	}
}
