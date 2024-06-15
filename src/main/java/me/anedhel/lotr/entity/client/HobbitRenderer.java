package me.anedhel.lotr.entity.client;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.entity.custom.HobbitEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;

public class HobbitRenderer extends MobEntityRenderer<HobbitEntity, HobbitModel<HobbitEntity>> {

    //private static final Identifier TEXTURE_PATH = new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "textures/entity/hobbit/");
    private static final int TEXTURE_COUNT = 2;
    private Identifier TEXTURE;

    public HobbitRenderer(EntityRendererFactory.Context context) {
        super(context, new HobbitModel<>(context.getPart(ModModelLayers.HOBBIT)), 0.6f);
        TEXTURE = new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "textures/entity/hobbit/hobbit_" + getRandomNumber() + ".png");
    }

    @Override
    public Identifier getTexture(HobbitEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(HobbitEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.6f, 0.6f, 0.6f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    private int getRandomNumber() {
        return Random.create().nextInt(TEXTURE_COUNT - 1) + 1;
    }
}