/*
 * Copyright (c) 2024-
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
package me.anedhel.lotr;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModStoneType;
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
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.data.family.BlockFamily;

/**
 * The client-side entry point for the Lord of the Rings Middle Earth mod.
 */
public class LordOfTheRingsMiddleEarthModClient implements ClientModInitializer {

    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
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

        registerStoneTypeCutoutLayers();
        registerModEntities();
        registerModCropCutoutLayers();
        registerModFlowerCutoutLayers();
    }

    /**
     * Registers all stone type cutout layers.
     */
    private void registerStoneTypeCutoutLayers() {
        for (ModStoneType stoneType : ModStoneType.values()) {
            registerStoneFamilyOverlays(stoneType.getMossyStoneFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownStoneFamily());

            registerStoneFamilyOverlays(stoneType.getMossyCobbledFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownCobbledFamily());

            registerStoneFamilyOverlays(stoneType.getMossyCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getBronzeCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedBronzeCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getMossyBronzeCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyBronzeCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownBronzeCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownBronzeCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getSilverCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedSilverCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getMossySilverCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossySilverCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownSilverCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownSilverCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getGoldCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedGoldCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getMossyGoldCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyGoldCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownGoldCobbledBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownGoldCobbledBrickFamily());

            registerStoneFamilyOverlays(stoneType.getMossyBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyBrickFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownBrickFamily());
            registerStoneFamilyOverlays(stoneType.getBronzeBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedBronzeBrickFamily());
            registerStoneFamilyOverlays(stoneType.getMossyBronzeBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyBronzeBrickFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownBronzeBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownBronzeBrickFamily());
            registerStoneFamilyOverlays(stoneType.getSilverBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedSilverBrickFamily());
            registerStoneFamilyOverlays(stoneType.getMossySilverBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossySilverBrickFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownSilverBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownSilverBrickFamily());
            registerStoneFamilyOverlays(stoneType.getGoldBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedGoldBrickFamily());
            registerStoneFamilyOverlays(stoneType.getMossyGoldBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyGoldBrickFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownGoldBrickFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownGoldBrickFamily());

            registerStoneFamilyOverlays(stoneType.getMossyTilesFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyTilesFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownTilesFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownTilesFamily());
            registerStoneFamilyOverlays(stoneType.getBronzeTilesFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedBronzeTilesFamily());
            registerStoneFamilyOverlays(stoneType.getMossyBronzeTilesFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyBronzeTilesFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownBronzeTilesFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownBronzeTilesFamily());
            registerStoneFamilyOverlays(stoneType.getSilverTilesFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedSilverTilesFamily());
            registerStoneFamilyOverlays(stoneType.getMossySilverTilesFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossySilverTilesFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownSilverTilesFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownSilverTilesFamily());
            registerStoneFamilyOverlays(stoneType.getGoldTilesFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedGoldTilesFamily());
            registerStoneFamilyOverlays(stoneType.getMossyGoldTilesFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyGoldTilesFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownGoldTilesFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownGoldTilesFamily());

            registerStoneFamilyOverlays(stoneType.getMossyPavementFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyPavementFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownPavementFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownPavementFamily());
            registerStoneFamilyOverlays(stoneType.getBronzePavementFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedBronzePavementFamily());
            registerStoneFamilyOverlays(stoneType.getMossyBronzePavementFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyBronzePavementFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownBronzePavementFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownBronzePavementFamily());
            registerStoneFamilyOverlays(stoneType.getSilverPavementFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedSilverPavementFamily());
            registerStoneFamilyOverlays(stoneType.getMossySilverPavementFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossySilverPavementFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownSilverPavementFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownSilverPavementFamily());
            registerStoneFamilyOverlays(stoneType.getGoldPavementFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedGoldPavementFamily());
            registerStoneFamilyOverlays(stoneType.getMossyGoldPavementFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyGoldPavementFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownGoldPavementFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownGoldPavementFamily());

            registerStoneFamilyOverlays(stoneType.getMossyFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getBronzeFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedBronzeFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getMossyBronzeFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyBronzeFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownBronzeFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownBronzeFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getSilverFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedSilverFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getMossySilverFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossySilverFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownSilverFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownSilverFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getGoldFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedGoldFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getMossyGoldFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedMossyGoldFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getOvergrownGoldFancyBricksFamily());
            registerStoneFamilyOverlays(stoneType.getCrackedOvergrownGoldFancyBricksFamily());

            BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                    stoneType.getMossySmooth(), stoneType.getMossySmoothSlab(),
                    stoneType.getCrackedMossySmooth(), stoneType.getCrackedMossySmoothSlab(),
                    stoneType.getOvergrownSmooth(), stoneType.getOvergrownSmoothSlab(),
                    stoneType.getCrackedOvergrownSmooth(), stoneType.getCrackedOvergrownSmoothSlab(),
                    stoneType.getBronzeSmooth(), stoneType.getBronzeSmoothSlab(),
                    stoneType.getCrackedBronzeSmooth(), stoneType.getCrackedBronzeSmoothSlab(),
                    stoneType.getMossyBronzeSmooth(), stoneType.getMossyBronzeSmoothSlab(),
                    stoneType.getCrackedMossyBronzeSmooth(), stoneType.getCrackedMossyBronzeSmoothSlab(),
                    stoneType.getOvergrownBronzeSmooth(), stoneType.getOvergrownBronzeSmoothSlab(),
                    stoneType.getCrackedOvergrownBronzeSmooth(), stoneType.getCrackedOvergrownBronzeSmoothSlab(),
                    stoneType.getSilverSmooth(), stoneType.getSilverSmoothSlab(),
                    stoneType.getCrackedSilverSmooth(), stoneType.getCrackedSilverSmoothSlab(),
                    stoneType.getMossySilverSmooth(), stoneType.getMossySilverSmoothSlab(),
                    stoneType.getCrackedMossySilverSmooth(), stoneType.getCrackedMossySilverSmoothSlab(),
                    stoneType.getOvergrownSilverSmooth(), stoneType.getOvergrownSilverSmoothSlab(),
                    stoneType.getCrackedOvergrownSilverSmooth(), stoneType.getCrackedOvergrownSilverSmoothSlab(),
                    stoneType.getGoldSmooth(), stoneType.getGoldSmoothSlab(),
                    stoneType.getCrackedGoldSmooth(), stoneType.getCrackedGoldSmoothSlab(),
                    stoneType.getMossyGoldSmooth(), stoneType.getMossyGoldSmoothSlab(),
                    stoneType.getCrackedMossyGoldSmooth(), stoneType.getCrackedMossyGoldSmoothSlab(),
                    stoneType.getOvergrownGoldSmooth(), stoneType.getOvergrownGoldSmoothSlab(),
                    stoneType.getCrackedOvergrownGoldSmooth(), stoneType.getCrackedOvergrownGoldSmoothSlab());

            BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                    stoneType.getMossyPillar(), stoneType.getMossyPillarSlab(),
                    stoneType.getCrackedMossyPillar(), stoneType.getCrackedMossyPillarSlab(),
                    stoneType.getOvergrownPillar(), stoneType.getOvergrownPillarSlab(),
                    stoneType.getCrackedOvergrownPillar(), stoneType.getCrackedOvergrownPillarSlab(),
                    stoneType.getBronzePillar(), stoneType.getBronzePillarSlab(),
                    stoneType.getCrackedBronzePillar(), stoneType.getCrackedBronzePillarSlab(),
                    stoneType.getMossyBronzePillar(), stoneType.getMossyBronzePillarSlab(),
                    stoneType.getCrackedMossyBronzePillar(), stoneType.getCrackedMossyBronzePillarSlab(),
                    stoneType.getOvergrownBronzePillar(), stoneType.getOvergrownBronzePillarSlab(),
                    stoneType.getCrackedOvergrownBronzePillar(), stoneType.getCrackedOvergrownBronzePillarSlab(),
                    stoneType.getSilverPillar(), stoneType.getSilverPillarSlab(),
                    stoneType.getCrackedSilverPillar(), stoneType.getCrackedSilverPillarSlab(),
                    stoneType.getMossySilverPillar(), stoneType.getMossySilverPillarSlab(),
                    stoneType.getCrackedMossySilverPillar(), stoneType.getCrackedMossySilverPillarSlab(),
                    stoneType.getOvergrownSilverPillar(), stoneType.getOvergrownSilverPillarSlab(),
                    stoneType.getCrackedOvergrownSilverPillar(), stoneType.getCrackedOvergrownSilverPillarSlab(),
                    stoneType.getGoldPillar(), stoneType.getGoldPillarSlab(),
                    stoneType.getCrackedGoldPillar(), stoneType.getCrackedGoldPillarSlab(),
                    stoneType.getMossyGoldPillar(), stoneType.getMossyGoldPillarSlab(),
                    stoneType.getCrackedMossyGoldPillar(), stoneType.getCrackedMossyGoldPillarSlab(),
                    stoneType.getOvergrownGoldPillar(), stoneType.getOvergrownGoldPillarSlab(),
                    stoneType.getCrackedOvergrownGoldPillar(), stoneType.getCrackedOvergrownGoldPillarSlab());
        }
    }

    /**
     * Registers the base block and its variants from the given stone family
     * to the BlockRenderLayerMap with the Cutout render layer.
     *
     * @param stoneFamily the BlockFamily containing the base block and its variants
     */
    private void registerStoneFamilyOverlays(BlockFamily stoneFamily) {
        BlockRenderLayerMap.INSTANCE.putBlock(stoneFamily.getBaseBlock(), RenderLayer.getCutout());
        for (Block variant : stoneFamily.getVariants().values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(variant, RenderLayer.getCutout());
        }
    }

    /**
     * Registers all ModEntity renderers and model layers.
     */
    private void registerModEntities() {
        EntityRendererRegistry.register(ModEntities.HOBBIT, HobbitRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.HOBBIT, HobbitModel::getTexturedModelData);
    }

    /**
     * Registers the crop cutout layers for the mod's crops.
     */
    private void registerModCropCutoutLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOMATO_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LETTUCE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORN_CROP, RenderLayer.getCutout());
    }

    /**
     * Registers the flower cutout layers for the mod's flowers.
     */
    private void registerModFlowerCutoutLayers() {
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
    }
}
