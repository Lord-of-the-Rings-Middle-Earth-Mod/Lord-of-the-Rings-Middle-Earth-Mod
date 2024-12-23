package me.anedhel.lotrmiddleearth;

import me.anedhel.lotrmiddleearth.blocks.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class LordOfTheRingsMiddleEarthModClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.OVERGROWN_CHALK_BRICKS,
                ModBlocks.GOLD_ORNAMENTED_CHALK_BRICKS,
                ModBlocks.GOLD_ORNAMENTED_OVERGROWN_CHALK_BRICKS);
    }
}
