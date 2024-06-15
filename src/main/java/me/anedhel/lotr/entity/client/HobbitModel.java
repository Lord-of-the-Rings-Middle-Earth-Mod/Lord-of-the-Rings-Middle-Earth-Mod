// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package me.anedhel.lotr.entity.client;

import me.anedhel.lotr.entity.animation.ModAnimations;
import me.anedhel.lotr.entity.custom.HobbitEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class HobbitModel<T extends HobbitEntity> extends SinglePartEntityModel<T> {

	private final ModelPart Hobbit_Textured;
	private final ModelPart head;

	public HobbitModel(ModelPart root) {
		this.Hobbit_Textured = root.getChild("Hobbit_Textured");
		head = Hobbit_Textured.getChild("Hobbit_Slim").getChild("Head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Hobbit_Textured = modelPartData.addChild("Hobbit_Textured", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, 24.0F, 10.0F));

		ModelPartData Hobbit_Slim = Hobbit_Textured.addChild("Hobbit_Slim", ModelPartBuilder.create(), ModelTransform.pivot(8.0F, 0.0F, -10.0F));

		ModelPartData Head = Hobbit_Slim.addChild("Head", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, -14.0F, 0.0F));

		ModelPartData Body = Hobbit_Slim.addChild("Body", ModelPartBuilder.create().uv(28, 12).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -14.0F, 0.0F));

		ModelPartData RightArm = Body.addChild("RightArm", ModelPartBuilder.create().uv(36, 0).cuboid(-2.0F, -2.0F, -2.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData LeftArm = Body.addChild("LeftArm", ModelPartBuilder.create().uv(16, 34).cuboid(-1.0F, -2.0F, -2.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData Hobbit_Pipe = LeftArm.addChild("Hobbit_Pipe", ModelPartBuilder.create().uv(0, 16).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.0F, -5.0F, 1.0F, 0.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, -2.0F, 1.2217F, 0.0F, -0.6109F));

		ModelPartData Legs = Body.addChild("Legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 8.0F, 0.0F));

		ModelPartData RightLeg = Legs.addChild("RightLeg", ModelPartBuilder.create().uv(0, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9F, 0.0F, 0.0F));

		ModelPartData LeftLeg = Legs.addChild("LeftLeg", ModelPartBuilder.create().uv(28, 28).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.9F, 0.0F, 0.0F));

		ModelPartData Smoke = Hobbit_Textured.addChild("Smoke", ModelPartBuilder.create(), ModelTransform.pivot(8.0F, -2.0F, -10.0F));

		ModelPartData Ring2 = Smoke.addChild("Ring2", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Ring3 = Smoke.addChild("Ring3", ModelPartBuilder.create().uv(9, 32).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Ring4 = Smoke.addChild("Ring4", ModelPartBuilder.create().uv(28, 24).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Ring5 = Smoke.addChild("Ring5", ModelPartBuilder.create().uv(35, 24).cuboid(-2.5F, 0.0F, -2.5F, 5.0F, 0.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Ring6 = Smoke.addChild("Ring6", ModelPartBuilder.create().uv(18, 0).cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void setAngles(HobbitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.HOBBIT_WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.HOBBIT_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Hobbit_Textured.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return Hobbit_Textured;
	}
}