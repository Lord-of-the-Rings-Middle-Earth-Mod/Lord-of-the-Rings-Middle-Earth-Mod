/*
 * Copyright (c)
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * lord-of-the-rings-middle-earth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * lord-of-the-rings-middle-earth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotr.entity.client;

import com.google.common.collect.Maps;
import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.entity.custom.HobbitEntity;
import me.anedhel.lotr.entity.variant.HobbitVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

/**
 * HobbitRenderer class for rendering Hobbit entities in Minecraft. It handles the rendering of different Hobbit
 * variants based on their texture paths.
 */
public class HobbitRenderer extends MobEntityRenderer<HobbitEntity, HobbitModel<HobbitEntity>> {

    private static final String TEXTURE_PATH = "textures/entity" + "/hobbit/";
    private static final Map<HobbitVariant, Identifier> LOCATION_BY_VARIANT = Util.make(
            Maps.newEnumMap(HobbitVariant.class), map -> {
                map.put(HobbitVariant.HOBBIT_1,
                        new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, TEXTURE_PATH + "hobbit_1.png"));
                map.put(HobbitVariant.HOBBIT_2,
                        new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, TEXTURE_PATH + "hobbit_2.png"));
                map.put(HobbitVariant.HOBBIT_3,
                        new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, TEXTURE_PATH + "hobbit_3.png"));
            });

    public HobbitRenderer(EntityRendererFactory.Context context) {
        super(context, new HobbitModel<>(context.getPart(ModModelLayers.HOBBIT)), 0.6f);
    }

    @Override
    public Identifier getTexture(HobbitEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
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
}