package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.item.ModGearType;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;

/**
 * This class is used to register all crafting recipes the mod provides.
 */
public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE);
    private static final List<ItemConvertible> TIN_BLOCK_SMELTABLES = List.of(ModBlocks.RAW_TIN_BLOCK);
    private static final List<ItemConvertible> IRON_BLOCK_SMELTABLES = List.of(Blocks.RAW_IRON_BLOCK);
    private static final List<ItemConvertible> GOLD_BLOCK_SMELTABLES = List.of(Blocks.RAW_GOLD_BLOCK);
    private static final List<ItemConvertible> COPPER_BLOCK_SMELTABLES = List.of(Blocks.RAW_COPPER_BLOCK);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * This method is where all crafting recipes are added via code.
     * @param exporter A RecipeJsonProvider, which is provided by minecraft
     */
    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 200, "tin");
        offerBlasting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 100, "tin");
        offerSmelting(exporter, TIN_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.TIN_BLOCK, 5.6f, 1600, "tin_block");
        offerBlasting(exporter, TIN_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.TIN_BLOCK, 5.6f, 800, "tin_block");
        offerSmelting(exporter, IRON_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.IRON_BLOCK, 5.6f, 1600, "iron_block");
        offerBlasting(exporter, IRON_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.IRON_BLOCK, 5.6f, 800, "iron_block");
        offerSmelting(exporter, GOLD_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 5.6f, 1600, "gold_block");
        offerBlasting(exporter, GOLD_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 5.6f, 800, "gold_block");
        offerSmelting(exporter, COPPER_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 5.6f, 1600, "copper_block");
        offerBlasting(exporter, COPPER_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 5.6f, 800, "copper_block");


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_INGOT)
                .input(ModItems.TIN_INGOT)
                .input(Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.TIN_INGOT), conditionsFromItem(ModItems.TIN_INGOT))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_INGOT) + "_crafting"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN, RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.MISC, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT, RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOMATO_SEEDS, 1)
                        .input(ModItems.TOMATO)
                        .criterion(hasItem(ModItems.TOMATO), conditionsFromItem(ModItems.TOMATO))
                        .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOMATO_SEEDS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORN_SEEDS, 1)
                        .input(ModItems.CORN)
                        .criterion(hasItem(ModItems.CORN), conditionsFromItem(ModItems.CORN))
                        .offerTo(exporter, new Identifier(getRecipeName(ModItems.CORN_SEEDS)));

        createCrateRecipe(ModItems.TOMATO, ModBlocks.TOMATO_CRATE, exporter);
        createCrateRecipe(ModItems.LETTUCE, ModBlocks.LETTUCE_CRATE, exporter);
        createCrateRecipe(ModItems.CORN, ModBlocks.CORN_CRATE, exporter);
        createCrateRecipe(Items.POTATO, ModBlocks.POTATO_CRATE, exporter);
        createCrateRecipe(Items.CARROT, ModBlocks.CARROT_CRATE, exporter);
        createCrateRecipe(Items.BEETROOT, ModBlocks.BEETROOT_CRATE, exporter);

        createModWoodTypesRecipes(exporter);

        createModGearTypeRecipes(ModGearType.BRONZE, exporter);

        createModStoneTypeRecipes(exporter);
    }

    /**
     * This Method is used to generate all Crafting Recipes for the given GearType
     * @param gearType The ModGearType that all craftingRecipes are to be generated for
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createModGearTypeRecipes (ModGearType gearType, RecipeExporter exporter) {
        Item material = gearType.getMaterial();
        Item helmet = gearType.getHelmet();
        Item chestplate = gearType.getChestplate();
        Item leggings = gearType.getLeggings();
        Item boots = gearType.getBoots();
        Item sword = gearType.getSword();
        Item axe = gearType.getAxe();
        Item pickaxe = gearType.getPickaxe();
        Item shovel = gearType.getShovel();
        Item hoe = gearType.getHoe();

        if (!gearType.isVanillaAddition()){
            if (helmet != null) {
                createHelmetRecipe(material, helmet, exporter);
            }
            if (chestplate != null) {
                createChestplateRecipe(material, chestplate, exporter);
            }
            if (leggings != null) {
                createLegginsRecipe(material, leggings, exporter);
            }
            if (boots != null) {
                createBootsRecipe(material, boots, exporter);
            }
            if (sword != null) {
                createSwordRecipe(material, sword, exporter);
            }
            if (axe != null) {
                createAxeRecipe(material, axe, exporter);
            }
            if (pickaxe != null) {
                createPickaxeRecipe(material, pickaxe, exporter);
            }
            if (shovel != null) {
                createShovelRecipe(material, shovel, exporter);
            }
            if (hoe != null) {
                createHoeRecipe(material, hoe, exporter);
            }
        }
    }

    /**
     * This Method is used to create all crafting recipes using the given ModStoneType
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createModStoneTypeRecipes (RecipeExporter exporter) {
        for (ModStoneType stoneType : ModStoneType.values()) {
            if (stoneType.getStone() != null) {
                if (stoneType.getStoneStairs() != null) {
                    createStairRecipe(stoneType.getStone(), stoneType.getStoneStairs(), exporter);
                    offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getStoneStairs(), stoneType.getStone(), 1);
                }
                if (stoneType.getStoneSlab() != null) {
                    offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getStoneSlab(), stoneType.getStone());
                    offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getStoneSlab(), stoneType.getStone(), 2);
                }
                if (stoneType.getStoneWall() != null) {
                    offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getStoneWall(), stoneType.getStone());
                    offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getStoneWall(), stoneType.getStone(), 1);
                }
                if (stoneType.getStoneButton() != null) {
                    createButtonRecipe(stoneType.getStone(), stoneType.getStoneButton(), exporter);
                }
                if (stoneType.getStonePressurePlate() != null) {
                    offerPressurePlateRecipe(exporter, stoneType.getStonePressurePlate(), stoneType.getStone());
                }
                if (stoneType.getCobbled() != null) {
                    createCobbledStoneTypeRecipe(stoneType.getStone(), stoneType.getCobbled(), exporter);
                    if (stoneType.getCobbledStairs() != null) {
                        createStairRecipe(stoneType.getCobbled(), stoneType.getCobbledStairs(), exporter);
                        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getCobbledStairs(), stoneType.getCobbled(), 1);
                    }
                    if (stoneType.getCobbledSlab() != null) {
                        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getCobbledSlab(), stoneType.getCobbled());
                        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getCobbledSlab(), stoneType.getCobbled(), 2);
                    }
                    if (stoneType.getCobbledWall() != null) {
                        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getCobbledWall(), stoneType.getCobbled());
                        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getCobbledWall(), stoneType.getCobbled(), 1);
                    }
                    if (stoneType.getCobbledButton() != null) {
                        createButtonRecipe(stoneType.getCobbled(), stoneType.getCobbledButton(), exporter);
                    }
                    if (stoneType.getCobbledPressurePlate() != null) {
                        offerPressurePlateRecipe(exporter, stoneType.getCobbledPressurePlate(), stoneType.getCobbled());
                    }
                }
                if (stoneType.getBrick() != null) {
                    createBricksRecipe(stoneType.getStone(), stoneType.getBrick(), exporter);
                    offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getBrick(), stoneType.getStone());
                    if (stoneType.getBrickStairs() != null) {
                        createStairRecipe(stoneType.getBrick(), stoneType.getBrickStairs(), exporter);
                        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getBrickStairs(), stoneType.getStone(), 1);
                        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getBrickStairs(), stoneType.getBrick(), 1);
                    }
                    if (stoneType.getBrickSlab() != null) {
                        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getBrickSlab(), stoneType.getBrick());
                        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getBrickSlab(), stoneType.getStone(), 2);
                        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getBrickSlab(), stoneType.getBrick(), 2);
                    }
                    if (stoneType.getBrickWall() != null) {
                        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getBrickWall(), stoneType.getBrick());
                        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getBrickWall(), stoneType.getStone(), 1);
                        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getBrickWall(), stoneType.getBrick(), 1);
                    }
                }
            }
        }
    }

    /**
     * This Method is used to create all crafting recipes for all ModWoodTypes
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createModWoodTypesRecipes(RecipeExporter exporter) {
        for (ModWoodType woodType : ModWoodType.values()) {
            if (!woodType.isVanillaAddition()) {
                generateFamily(exporter, woodType.getWoodFamily());
                generateFamily(exporter, woodType.getStrippedWoodFamily());
                generateFamily(exporter, woodType.getPlanksFamily());
                if (woodType.getLog() != null && woodType.getWood() != null && woodType.getStrippedLog() != null && woodType.getStrippedWood() != null) {
                    offerBarkBlockRecipe(exporter, woodType.getWood(), woodType.getLog());
                    offerBarkBlockRecipe(exporter, woodType.getStrippedWood(), woodType.getStrippedLog());
                    if (woodType.getPlanks() != null) {
                        offerPlanksRecipe(exporter, woodType.getPlanks(), TagKey.of(RegistryKeys.ITEM, new Identifier("lotr", turnBlockIntoTag(woodType.getLog()))), 4);
                    }
                }
            }
        }
    }

    /**
     * This Method is used to generate a Crafting Recipe for a StorageCrate of the FarmItem
     * @param item The Farm Item you wish to compact into a crate
     * @param crate The Crate for the Farm Item
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createCrateRecipe (Item item, Block crate, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, crate, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(item) + "_crate"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, item, 9)
                .input(crate)
                .criterion(hasItem(crate), conditionsFromItem(crate))
                .offerTo(exporter, new Identifier(getRecipeName(item)));

    }

    /**
     * This Method creates a BrickRecipe for the given input-stone which will be turned into 4 of the given output-stone
     * @param input a blank stone type
     * @param output the brick of the blank stone type
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createBricksRecipe (Block input, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("##")
                .pattern("##")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This Method creates a Crafting Recipe, that uses 2 input-stone and 2 cobble to create 4 output-cobbled-stone
     * @param input a blank stone type
     * @param output the cobbled variant of the blank stone type
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createCobbledStoneTypeRecipe (Block input, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("#C")
                .pattern("C#")
                .input('#', input)
                .input('C', Items.COBBLESTONE)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This Method creates a ButtonRecipe for the given input stone, which will be turned into 1 button.
     * @param input a blank stone type
     * @param output the button of the blank stone type
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createButtonRecipe (Block input, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1)
                .pattern(" # ")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This Method creates a StairRecipe for the given input block.
     * @param input a base block (stone, planks, etc.)
     * @param output the stairs of the input
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createStairRecipe (Block input, Block output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a SwordRecipe for the given input.
     * @param input Ingredient, that should be a ModToolMaterial
     * @param output The sword made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createSwordRecipe (Item input, Item output, RecipeExporter exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .input('#', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a AxeRecipe for the given input.
     * @param input Ingredient, that should be a ModToolMaterial
     * @param output The axe made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createAxeRecipe (Item input, Item output, RecipeExporter exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a PickaxeRecipe for the given input.
     * @param input Ingredient, that should be a ModToolMaterial
     * @param output The pickaxe made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createPickaxeRecipe (Item input, Item output, RecipeExporter exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a ShovelRecipe for the given input.
     * @param input Ingredient, that should be a ModToolMaterial
     * @param output The shovel made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createShovelRecipe (Item input, Item output, RecipeExporter exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .input('#', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a HoeRecipe for the given input.
     * @param input Ingredient, that should be a ModToolMaterial
     * @param output The how made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createHoeRecipe (Item input, Item output, RecipeExporter exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a HelmetRecipe for the given input
     * @param input Ingredient, that should be a ModArmorMaterial
     * @param output The helmet made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createHelmetRecipe(Item input, Item output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a ChestplateRecipe for the given input
     * @param input Ingredient, that should be a ModArmorMaterial
     * @param output The chestplate made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createChestplateRecipe(Item input, Item output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a LegginsRecipe for the given input
     * @param input Ingredient, that should be a ModArmorMaterial
     * @param output The leggins made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createLegginsRecipe(Item input, Item output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    /**
     * This method creates a BootsRecipe for the given input
     * @param input Ingredient, that should be a ModArmorMaterial
     * @param output The boots made from the Ingredient
     * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one is provided in the parameters of the method you edit.
     */
    private void createBootsRecipe(Item input, Item output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    private String turnBlockIntoTag (Block block) {
        return block.getName().getString().replace(' ', '_').toLowerCase();
    }
}