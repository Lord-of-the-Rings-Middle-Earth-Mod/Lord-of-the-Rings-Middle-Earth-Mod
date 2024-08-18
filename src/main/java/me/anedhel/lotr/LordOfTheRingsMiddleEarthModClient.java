package me.anedhel.lotr;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModWoodBlocks;
import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.entity.ModBoats;
import me.anedhel.lotr.entity.ModEntities;
import me.anedhel.lotr.entity.client.HobbitModel;
import me.anedhel.lotr.entity.client.HobbitRenderer;
import me.anedhel.lotr.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;

public class LordOfTheRingsMiddleEarthModClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOMATO_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LETTUCE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORN_CROP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WILD_BEETROOT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WILD_BEETROOT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WILD_CARROT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WILD_CARROT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WILD_POTATO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WILD_POTATO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WILD_CORN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WILD_LETTUCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WILD_LETTUCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WILD_TOMATO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WILD_TOMATO, RenderLayer.getCutout());

        for (ModWoodType woodType : ModWoodType.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(woodType.getLeaves(), RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(woodType.getSapling(), RenderLayer.getCutout());

            BlockRenderLayerMap.INSTANCE.putBlock(woodType.getWoodDoor(), RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(woodType.getStrippedWoodDoor(), RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(woodType.getPlanksDoor(), RenderLayer.getCutout());
        }

        TerraformBoatClientHelper.registerModelLayers(ModBoats.PINE_BOAT_ID, false);

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModWoodBlocks.PINE_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModWoodBlocks.PINE_HANGING_SIGN_TEXTURE));

        EntityRendererRegistry.register(ModEntities.HOBBIT, HobbitRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.HOBBIT, HobbitModel::getTexturedModelData);
    }
}