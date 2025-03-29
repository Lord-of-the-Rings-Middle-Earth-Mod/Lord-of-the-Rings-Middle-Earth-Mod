package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModStoneType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.data.family.BlockFamily;

public class ModEnUsLangProvider extends FabricLanguageProvider {

	public ModEnUsLangProvider(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generateTranslations(TranslationBuilder translationBuilder) {
		translationBuilder.add("itemgroup.lotr_blocks", "LOTR Blocks");
		translationBuilder.add("itemgroup.lotr_food", "LOTR Food");
		translationBuilder.add("itemgroup.lotr_plants", "LOTR Plants");
		translationBuilder.add("itemgroup.lotr_ingredients", "LOTR Ingredients");
		translationBuilder.add("itemgroup.lotr_tools", "LOTR Tools");
		translationBuilder.add("itemgroup.lotr_combat", "LOTR Combat");
		translationBuilder.add("itemgroup.lotr_spawning", "LOTR Spawning");
		translationBuilder.add("itemgroup.lotr_stone", "LOTR Stone");
		translationBuilder.add("itemgroup.lotr_wood", "LOTR Wood");
		translationBuilder.add("itemgroup.lotr_transport", "LOTR Transport");

		generateStoneTypeTranslations(translationBuilder);
	}

	/**
	 * Generates translations for all stone type variants.
	 *
	 * @param translationBuilder The builder used to add translations.
	 */
	private void generateStoneTypeTranslations(TranslationBuilder translationBuilder) {
		for(ModStoneType stoneType : ModStoneType.values()) {
			String stoneName = stoneType.getName();

			generateStoneFamilyTranslations(stoneType.getStoneFamily(), translationBuilder, stoneName);
			generateStoneFamilyTranslations(stoneType.getMossyStoneFamily(), translationBuilder, "Mossy " + stoneName);
			generateStoneFamilyTranslations(stoneType.getOvergrownStoneFamily(), translationBuilder,
					"Overgrown " + stoneName);

			generateStoneFamilyTranslations(stoneType.getCobbledFamily(), translationBuilder, "Cobbled " + stoneName);
			generateStoneFamilyTranslations(stoneType.getMossyCobbledFamily(), translationBuilder,
					"Mossy Cobbled " + stoneName);
			generateStoneFamilyTranslations(stoneType.getOvergrownCobbledFamily(), translationBuilder,
					"Overgrown Cobbled " + stoneName);

			generateStoneFamilyTranslations(stoneType.getCobbledBrickFamily(), translationBuilder,
					"Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossyCobbledBrickFamily(), translationBuilder,
					"Mossy Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownCobbledBrickFamily(), translationBuilder,
					"Overgrown Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getBronzeCobbledBrickFamily(), translationBuilder,
					"Bronze Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossyBronzeCobbledBrickFamily(), translationBuilder,
					"Mossy Bronze Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownBronzeCobbledBrickFamily(), translationBuilder,
					"Overgrown Bronze Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getSilverCobbledBrickFamily(), translationBuilder,
					"Silver Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossySilverCobbledBrickFamily(), translationBuilder,
					"Mossy Silver Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownSilverCobbledBrickFamily(), translationBuilder,
					"Overgrown Silver Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getGoldCobbledBrickFamily(), translationBuilder,
					"Gold Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossyGoldCobbledBrickFamily(), translationBuilder,
					"Mossy Gold Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownGoldCobbledBrickFamily(), translationBuilder,
					"Overgrown Gold Cobbled " + stoneName + " Bricks");

			generateStoneFamilyTranslations(stoneType.getCrackedCobbledBrickFamily(), translationBuilder,
					"Cracked Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyCobbledBrickFamily(), translationBuilder,
					"Cracked Mossy Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownCobbledBrickFamily(), translationBuilder,
					"Cracked Overgrown Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedBronzeCobbledBrickFamily(), translationBuilder,
					"Cracked Bronze Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyBronzeCobbledBrickFamily(), translationBuilder,
					"Cracked Mossy Bronze Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownBronzeCobbledBrickFamily(), translationBuilder,
					"Cracked Overgrown Bronze Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedSilverCobbledBrickFamily(), translationBuilder,
					"Cracked Silver Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossySilverCobbledBrickFamily(), translationBuilder,
					"Cracked Mossy Silver Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownSilverCobbledBrickFamily(), translationBuilder,
					"Cracked Overgrown Silver Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedGoldCobbledBrickFamily(), translationBuilder,
					"Cracked Gold Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyGoldCobbledBrickFamily(), translationBuilder,
					"Cracked Mossy Gold Cobbled " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownGoldCobbledBrickFamily(), translationBuilder,
					"Cracked Overgrown Gold Cobbled " + stoneName + " Bricks");

			generateStoneFamilyTranslations(stoneType.getBrickFamily(), translationBuilder,
					stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossyBrickFamily(), translationBuilder,
					"Mossy " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownBrickFamily(), translationBuilder,
					"Overgrown " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getBronzeBrickFamily(), translationBuilder,
					"Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossyBronzeBrickFamily(), translationBuilder,
					"Mossy Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownBronzeBrickFamily(), translationBuilder,
					"Overgrown Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getSilverBrickFamily(), translationBuilder,
					"Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossySilverBrickFamily(), translationBuilder,
					"Mossy Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownSilverBrickFamily(), translationBuilder,
					"Overgrown Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getGoldBrickFamily(), translationBuilder,
					"Gold " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossyGoldBrickFamily(), translationBuilder,
					"Mossy Gold " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownGoldBrickFamily(), translationBuilder,
					"Overgrown Gold " + stoneName + " Bricks");

			generateStoneFamilyTranslations(stoneType.getCrackedBrickFamily(), translationBuilder,
					"Cracked " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyBrickFamily(), translationBuilder,
					"Cracked Mossy " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownBrickFamily(), translationBuilder,
					"Cracked Overgrown " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedBronzeBrickFamily(), translationBuilder,
					"Cracked Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyBronzeBrickFamily(), translationBuilder,
					"Cracked Mossy Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownBronzeBrickFamily(), translationBuilder,
					"Cracked Overgrown Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedSilverBrickFamily(), translationBuilder,
					"Cracked Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossySilverBrickFamily(), translationBuilder,
					"Cracked Mossy Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownSilverBrickFamily(), translationBuilder,
					"Cracked Overgrown Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedGoldBrickFamily(), translationBuilder,
					"Cracked Gold " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyGoldBrickFamily(), translationBuilder,
					"Cracked Mossy Gold " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownGoldBrickFamily(), translationBuilder,
					"Cracked Overgrown Gold " + stoneName + " Bricks");

			generateStoneFamilyTranslations(stoneType.getTilesFamily(), translationBuilder,
					stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getMossyTilesFamily(), translationBuilder,
					"Mossy " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getOvergrownTilesFamily(), translationBuilder,
					"Overgrown " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getBronzeTilesFamily(), translationBuilder,
					"Bronze " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getMossyBronzeTilesFamily(), translationBuilder,
					"Mossy Bronze " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getOvergrownBronzeTilesFamily(), translationBuilder,
					"Overgrown Bronze " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getSilverTilesFamily(), translationBuilder,
					"Silver " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getMossySilverTilesFamily(), translationBuilder,
					"Mossy Silver " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getOvergrownSilverTilesFamily(), translationBuilder,
					"Overgrown Silver " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getGoldTilesFamily(), translationBuilder,
					"Gold " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getMossyGoldTilesFamily(), translationBuilder,
					"Mossy Gold " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getOvergrownGoldTilesFamily(), translationBuilder,
					"Overgrown Gold " + stoneName + " Tiles");

			generateStoneFamilyTranslations(stoneType.getCrackedTilesFamily(), translationBuilder,
					"Cracked " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyTilesFamily(), translationBuilder,
					"Cracked Mossy " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownTilesFamily(), translationBuilder,
					"Cracked Overgrown " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getCrackedBronzeTilesFamily(), translationBuilder,
					"Cracked Bronze " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyBronzeTilesFamily(), translationBuilder,
					"Cracked Mossy Bronze " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownBronzeTilesFamily(), translationBuilder,
					"Cracked Overgrown Bronze " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getCrackedSilverTilesFamily(), translationBuilder,
					"Cracked Silver " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getCrackedMossySilverTilesFamily(), translationBuilder,
					"Cracked Mossy Silver " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownSilverTilesFamily(), translationBuilder,
					"Cracked Overgrown Silver " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getCrackedGoldTilesFamily(), translationBuilder,
					"Cracked Gold " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyGoldTilesFamily(), translationBuilder,
					"Cracked Mossy Gold " + stoneName + " Tiles");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownGoldTilesFamily(), translationBuilder,
					"Cracked Overgrown Gold " + stoneName + " Tiles");

			generateStoneFamilyTranslations(stoneType.getPavementFamily(), translationBuilder,
					stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getMossyPavementFamily(), translationBuilder,
					"Mossy " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getOvergrownPavementFamily(), translationBuilder,
					"Overgrown " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getBronzePavementFamily(), translationBuilder,
					"Bronze " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getMossyBronzePavementFamily(), translationBuilder,
					"Mossy Bronze " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getOvergrownBronzePavementFamily(), translationBuilder,
					"Overgrown Bronze " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getSilverPavementFamily(), translationBuilder,
					"Silver " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getMossySilverPavementFamily(), translationBuilder,
					"Mossy Silver " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getOvergrownSilverPavementFamily(), translationBuilder,
					"Overgrown Silver " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getGoldPavementFamily(), translationBuilder,
					"Gold " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getMossyGoldPavementFamily(), translationBuilder,
					"Mossy Gold " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getOvergrownGoldPavementFamily(), translationBuilder,
					"Overgrown Gold " + stoneName + " Pavement");

			generateStoneFamilyTranslations(stoneType.getCrackedPavementFamily(), translationBuilder,
					"Cracked " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyPavementFamily(), translationBuilder,
					"Cracked Mossy " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownPavementFamily(), translationBuilder,
					"Cracked Overgrown " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getCrackedBronzePavementFamily(), translationBuilder,
					"Cracked Bronze " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyBronzePavementFamily(), translationBuilder,
					"Cracked Mossy Bronze " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownBronzePavementFamily(), translationBuilder,
					"Cracked Overgrown Bronze " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getCrackedSilverPavementFamily(), translationBuilder,
					"Cracked Silver " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getCrackedMossySilverPavementFamily(), translationBuilder,
					"Cracked Mossy Silver " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownSilverPavementFamily(), translationBuilder,
					"Cracked Overgrown Silver " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getCrackedGoldPavementFamily(), translationBuilder,
					"Cracked Gold " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyGoldPavementFamily(), translationBuilder,
					"Cracked Mossy Gold " + stoneName + " Pavement");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownGoldPavementFamily(), translationBuilder,
					"Cracked Overgrown Gold " + stoneName + " Pavement");

			generateStoneFamilyTranslations(stoneType.getFancyBricksFamily(), translationBuilder,
					"Fancy " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossyFancyBricksFamily(), translationBuilder,
					"Fancy Mossy " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownFancyBricksFamily(), translationBuilder,
					"Fancy Overgrown " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getBronzeFancyBricksFamily(), translationBuilder,
					"Fancy Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossyBronzeFancyBricksFamily(), translationBuilder,
					"Fancy Mossy Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownBronzeFancyBricksFamily(), translationBuilder,
					"Fancy Overgrown Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getSilverFancyBricksFamily(), translationBuilder,
					"Fancy Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossySilverFancyBricksFamily(), translationBuilder,
					"Fancy Mossy Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownSilverFancyBricksFamily(), translationBuilder,
					"Fancy Overgrown Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getGoldFancyBricksFamily(), translationBuilder,
					"Fancy Gold " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getMossyGoldFancyBricksFamily(), translationBuilder,
					"Fancy Mossy Gold " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getOvergrownGoldFancyBricksFamily(), translationBuilder,
					"Fancy Overgrown Gold " + stoneName + " Bricks");

			generateStoneFamilyTranslations(stoneType.getCrackedFancyBricksFamily(), translationBuilder,
					"Cracked Fancy " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyFancyBricksFamily(), translationBuilder,
					"Cracked Fancy Mossy " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownFancyBricksFamily(), translationBuilder,
					"Cracked Fancy Overgrown " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedBronzeFancyBricksFamily(), translationBuilder,
					"Cracked Fancy Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyBronzeFancyBricksFamily(), translationBuilder,
					"Cracked Fancy Mossy Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownBronzeFancyBricksFamily(), translationBuilder,
					"Cracked Fancy Overgrown Bronze " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedSilverFancyBricksFamily(), translationBuilder,
					"Cracked Fancy Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossySilverFancyBricksFamily(), translationBuilder,
					"Cracked Fancy Mossy Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownSilverFancyBricksFamily(), translationBuilder,
					"Cracked Fancy Overgrown Silver " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedGoldFancyBricksFamily(), translationBuilder,
					"Cracked Fancy Gold " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedMossyGoldFancyBricksFamily(), translationBuilder,
					"Cracked Fancy Mossy Gold " + stoneName + " Bricks");
			generateStoneFamilyTranslations(stoneType.getCrackedOvergrownGoldFancyBricksFamily(), translationBuilder,
					"Cracked Fancy Overgrown Gold " + stoneName + " Bricks");

			generateSmoothStoneTranslations(stoneType, translationBuilder, stoneName);

			generatePillarTranslations(stoneType, translationBuilder, stoneName);
		}
	}

	/**
	 * Generates translations for a stone family.
	 * @param family the Block Family for which the translations should be generated
	 * @param translationBuilder the translation builder
	 * @param name the name of the stone type. Should be a combination of the variant and the name from the ModStoneType enum
	 */
	private void generateStoneFamilyTranslations(BlockFamily family, TranslationBuilder translationBuilder,
			String name) {
		translationBuilder.add(family.getBaseBlock().getTranslationKey(), name);
		if(family.getVariant(BlockFamily.Variant.STAIRS) != null) {
			translationBuilder.add(family.getVariant(BlockFamily.Variant.STAIRS).getTranslationKey(), name + "Stairs");
		}
		if(family.getVariant(BlockFamily.Variant.SLAB) != null) {
			translationBuilder.add(family.getVariant(BlockFamily.Variant.SLAB).getTranslationKey(), name + "Slab");
		}
		if(family.getVariant(BlockFamily.Variant.WALL) != null) {
			translationBuilder.add(family.getVariant(BlockFamily.Variant.WALL).getTranslationKey(), name + "Wall");
		}
		if(family.getVariant(BlockFamily.Variant.CHISELED) != null) {
			translationBuilder.add(family.getVariant(BlockFamily.Variant.CHISELED).getTranslationKey(), "Chiseled " + name);
		}
		if(family.getVariant(BlockFamily.Variant.BUTTON) != null) {
			translationBuilder.add(family.getVariant(BlockFamily.Variant.BUTTON).getTranslationKey(), name + "Button");
		}
		if(family.getVariant(BlockFamily.Variant.PRESSURE_PLATE) != null) {
			translationBuilder.add(family.getVariant(BlockFamily.Variant.PRESSURE_PLATE).getTranslationKey(), name + "PressurePlate");
		}
	}

	/**
	 * Generates translations for all smooth variants of the given stone type.
	 *
	 * @param stoneType The stone type for which the translations should be generated.
	 * @param translationBuilder The builder used to add translations.
	 * @param name The name of the stone type.
	 */
	private void generateSmoothStoneTranslations(ModStoneType stoneType, TranslationBuilder translationBuilder,
			String name) {
		translationBuilder.add(stoneType.getSmooth(), "Smooth " + name);
		translationBuilder.add(stoneType.getSmoothSlab(), "Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedSmooth(), "Cracked Smooth " + name);
		translationBuilder.add(stoneType.getCrackedSmoothSlab(), "Cracked Smooth " + name + " Slab");

		translationBuilder.add(stoneType.getMossySmooth(), "Mossy Smooth " + name);
		translationBuilder.add(stoneType.getMossySmoothSlab(), "Mossy Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedMossySmooth(), "Cracked Mossy Smooth " + name);
		translationBuilder.add(stoneType.getCrackedMossySmoothSlab(), "Cracked Mossy Smooth " + name + " Slab");

		translationBuilder.add(stoneType.getOvergrownSmooth(), "Overgrown Smooth " + name);
		translationBuilder.add(stoneType.getOvergrownSmoothSlab(), "Overgrown Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedOvergrownSmooth(), "Cracked Overgrown Smooth " + name);
		translationBuilder.add(stoneType.getCrackedOvergrownSmoothSlab(), "Cracked Overgrown Smooth " + name + " Slab");

		translationBuilder.add(stoneType.getBronzeSmooth(), "Bronze Smooth " + name);
		translationBuilder.add(stoneType.getBronzeSmoothSlab(), "Bronze Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedBronzeSmooth(), "Cracked Bronze Smooth " + name);
		translationBuilder.add(stoneType.getCrackedBronzeSmoothSlab(), "Cracked Bronze Smooth " + name + " Slab");

		translationBuilder.add(stoneType.getMossyBronzeSmooth(), "Mossy Bronze Smooth " + name);
		translationBuilder.add(stoneType.getMossyBronzeSmoothSlab(), "Mossy Bronze Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedMossyBronzeSmooth(), "Cracked Mossy Bronze Smooth " + name);
		translationBuilder.add(stoneType.getCrackedMossyBronzeSmoothSlab(), "Cracked Mossy Bronze Smooth " + name +
				" Slab");

		translationBuilder.add(stoneType.getOvergrownBronzeSmooth(), "Overgrown Bronze Smooth " + name);
		translationBuilder.add(stoneType.getOvergrownBronzeSmoothSlab(), "Overgrown Bronze Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedOvergrownBronzeSmooth(), "Cracked Overgrown Bronze Smooth " + name);
		translationBuilder.add(stoneType.getCrackedOvergrownBronzeSmoothSlab(), "Cracked Overgrown Bronze Smooth " + name +
				" Slab");

		translationBuilder.add(stoneType.getSilverSmooth(), "Silver Smooth " + name);
		translationBuilder.add(stoneType.getSilverSmoothSlab(), "Silver Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedSilverSmooth(), "Cracked Silver Smooth " + name);
		translationBuilder.add(stoneType.getCrackedSilverSmoothSlab(), "Cracked Silver Smooth " + name + " Slab");

		translationBuilder.add(stoneType.getMossySilverSmooth(), "Mossy Silver Smooth " + name);
		translationBuilder.add(stoneType.getMossySilverSmoothSlab(), "Mossy Silver Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedMossySilverSmooth(), "Cracked Mossy Silver Smooth " + name);
		translationBuilder.add(stoneType.getCrackedMossySilverSmoothSlab(), "Cracked Mossy Silver Smooth " + name +
				" Slab");

		translationBuilder.add(stoneType.getOvergrownSilverSmooth(), "Overgrown Silver Smooth " + name);
		translationBuilder.add(stoneType.getOvergrownSilverSmoothSlab(), "Overgrown Silver Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedOvergrownSilverSmooth(), "Cracked Overgrown Silver Smooth " + name);
		translationBuilder.add(stoneType.getCrackedOvergrownSilverSmoothSlab(), "Cracked Overgrown Silver Smooth " + name +
				" Slab");

		translationBuilder.add(stoneType.getGoldSmooth(), "Gold Smooth " + name);
		translationBuilder.add(stoneType.getGoldSmoothSlab(), "Gold Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedGoldSmooth(), "Cracked Gold Smooth " + name);
		translationBuilder.add(stoneType.getCrackedGoldSmoothSlab(), "Cracked Gold Smooth " + name + " Slab");

		translationBuilder.add(stoneType.getMossyGoldSmooth(), "Mossy Gold Smooth " + name);
		translationBuilder.add(stoneType.getMossyGoldSmoothSlab(), "Mossy Gold Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedMossyGoldSmooth(), "Cracked Mossy Gold Smooth " + name);
		translationBuilder.add(stoneType.getCrackedMossyGoldSmoothSlab(), "Cracked Mossy Gold Smooth " + name +
				" Slab");

		translationBuilder.add(stoneType.getOvergrownGoldSmooth(), "Overgrown Gold Smooth " + name);
		translationBuilder.add(stoneType.getOvergrownGoldSmoothSlab(), "Overgrown Gold Smooth " + name + " Slab");
		translationBuilder.add(stoneType.getCrackedOvergrownGoldSmooth(), "Cracked Overgrown Gold Smooth " + name);
		translationBuilder.add(stoneType.getCrackedOvergrownGoldSmoothSlab(), "Cracked Overgrown Gold Smooth " + name +
				" Slab");
	}

	/**
	 * Generates translations for all pillar variants of the given stone type.
	 *
	 * @param stoneType The stone type for which the translations should be generated.
	 * @param translationBuilder The builder used to add translations.
	 * @param name The name of the stone type.
	 */
	private void generatePillarTranslations(ModStoneType stoneType, TranslationBuilder translationBuilder,
			String name) {
		translationBuilder.add(stoneType.getPillar(), name + " Pillar");
		translationBuilder.add(stoneType.getPillarSlab(), name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedPillar(), "Cracked " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedPillarSlab(), "Cracked " + name + " Pillar Slab");

		translationBuilder.add(stoneType.getMossyPillar(), "Mossy " + name + " Pillar");
		translationBuilder.add(stoneType.getMossyPillarSlab(), "Mossy " + name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedMossyPillar(), "Cracked Mossy " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedMossyPillarSlab(), "Cracked Mossy " + name + " Pillar Slab");

		translationBuilder.add(stoneType.getOvergrownPillar(), "Overgrown " + name + " Pillar");
		translationBuilder.add(stoneType.getOvergrownPillarSlab(), "Overgrown " + name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedOvergrownPillar(), "Cracked Overgrown " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedOvergrownPillarSlab(), "Cracked Overgrown " + name + " Pillar Slab");

		translationBuilder.add(stoneType.getBronzePillar(), "Bronze " + name + " Pillar");
		translationBuilder.add(stoneType.getBronzePillarSlab(), "Bronze " + name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedBronzePillar(), "Cracked Bronze " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedBronzePillarSlab(), "Cracked Bronze " + name + " Pillar Slab");

		translationBuilder.add(stoneType.getMossyBronzePillar(), "Mossy Bronze " + name + " Pillar");
		translationBuilder.add(stoneType.getMossyBronzePillarSlab(), "Mossy Bronze " + name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedMossyBronzePillar(), "Cracked Mossy Bronze " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedMossyBronzePillarSlab(), "Cracked Mossy Bronze " + name +
				" Pillar Slab");

		translationBuilder.add(stoneType.getOvergrownBronzePillar(), "Overgrown Bronze " + name + " Pillar");
		translationBuilder.add(stoneType.getOvergrownBronzePillarSlab(), "Overgrown Bronze " + name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedOvergrownBronzePillar(), "Cracked Overgrown Bronze " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedOvergrownBronzePillarSlab(), "Cracked Overgrown Bronze " + name +
				" Pillar Slab");

		translationBuilder.add(stoneType.getSilverPillar(), "Silver  " + name + " Pillar");
		translationBuilder.add(stoneType.getSilverPillarSlab(), "Silver " + name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedSilverPillar(), "Cracked Silver " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedSilverPillarSlab(), "Cracked Silver " + name + " Pillar Slab");

		translationBuilder.add(stoneType.getMossySilverPillar(), "Mossy Silver " + name + " Pillar");
		translationBuilder.add(stoneType.getMossySilverPillarSlab(), "Mossy Silver " + name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedMossySilverPillar(), "Cracked Mossy Silver " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedMossySilverPillarSlab(), "Cracked Mossy Silver " + name +
				" Pillar Slab");

		translationBuilder.add(stoneType.getOvergrownSilverPillar(), "Overgrown Silver " + name + " Pillar");
		translationBuilder.add(stoneType.getOvergrownSilverPillarSlab(), "Overgrown Silver " + name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedOvergrownSilverPillar(), "Cracked Overgrown Silver " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedOvergrownSilverPillarSlab(), "Cracked Overgrown Silver " + name +
				" Pillar Slab");

		translationBuilder.add(stoneType.getGoldPillar(), "Gold " + name + " Pillar");
		translationBuilder.add(stoneType.getGoldPillarSlab(), "Gold " + name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedGoldPillar(), "Cracked Gold " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedGoldPillarSlab(), "Cracked Gold " + name + " Pillar Slab");

		translationBuilder.add(stoneType.getMossyGoldPillar(), "Mossy Gold " + name + " Pillar");
		translationBuilder.add(stoneType.getMossyGoldPillarSlab(), "Mossy Gold " + name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedMossyGoldPillar(), "Cracked Mossy Gold " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedMossyGoldPillarSlab(), "Cracked Mossy Gold " + name +
				" Pillar Slab");

		translationBuilder.add(stoneType.getOvergrownGoldPillar(), "Overgrown Gold " + name + " Pillar");
		translationBuilder.add(stoneType.getOvergrownGoldPillarSlab(), "Overgrown Gold " + name + " Pillar Slab");
		translationBuilder.add(stoneType.getCrackedOvergrownGoldPillar(), "Cracked Overgrown Gold  " + name + " Pillar");
		translationBuilder.add(stoneType.getCrackedOvergrownGoldPillarSlab(), "Cracked Overgrown Gold " + name +
				" Pillar Slab");
	}
}