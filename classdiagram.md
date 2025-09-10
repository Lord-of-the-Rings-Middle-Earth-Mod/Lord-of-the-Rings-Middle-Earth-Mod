# Lord of the Rings Middle Earth Mod - Class Diagrams

This document contains Mermaid class diagrams showing the structure and relationships of the main classes in the Lord of the Rings Middle Earth Mod. The diagrams are organized by functional areas for better readability.

## 1. Main Mod Structure Overview

```mermaid
classDiagram
    direction TB
    
    class LordOfTheRingsMiddleEarthMod {
        +String MOD_ID$
        +Logger LOGGER$
        +String COPYRIGHT$
        +onInitialize() void
        -addCropsToComposter() void
        -initModWoodTypes() void
    }

    class LordOfTheRingsMiddleEarthModClient {
        +onInitializeClient() void
        -registerStoneTypeCutoutLayers() void
        -registerStoneFamilyOverlays(BlockFamily) void
        -registerModEntities() void
        -registerModCropCutoutLayers() void
        -registerModFlowerCutoutLayers() void
        -registerWoodTypeSigns() void
        -registerModSignSpriteIds() void
    }

    class LordOfTheRingsMiddleEarthModDataGenerator {
        +onInitializeDataGenerator(FabricDataGenerator) void
        +buildRegistry(RegistryBuilder) void
    }

    class ModBlocks {
        +Block TIN_ORE$
        +Block DEEPSLATE_TIN_ORE$
        +Block TIN_BLOCK$
        +Block RAW_TIN_BLOCK$
        +Block BRONZE_BLOCK$
        +Block SILVER_ORE$
        +Block DEEPSLATE_SILVER_ORE$
        +Block RAW_SILVER_BLOCK$
        +Block SILVER_BLOCK$
        +Block WILD_BEETROOT$
        +Block POTTED_WILD_BEETROOT$
        +Block WILD_CARROT$
        +Block POTTED_WILD_CARROT$
        +Block WILD_POTATO$
        +Block POTTED_WILD_POTATO$
        +Block WILD_LETTUCE$
        +Block POTTED_WILD_LETTUCE$
        +Block WILD_TOMATO$
        +Block POTTED_WILD_TOMATO$
        +Block WILD_CORN$
        +Block POTATO_CRATE$
        +Block CARROT_CRATE$
        +Block BEETROOT_CRATE$
        +Block LETTUCE_CROP$
        +Block LETTUCE_CRATE$
        +Block TOMATO_CROP$
        +Block TOMATO_CRATE$
        +Block CORN_CROP$
        +Block CORN_CRATE$
        +registerModBlocks() void$
        -registerBlock(String, Block) Block$
        -registerBlockItem(String, Block) Item$
    }

    class ModItems {
        +Item HOBBIT_SPAWN_EGG$
        +Item PINE_SIGN$
        +Item HANGING_PINE_SIGN$
        +Item PINE_BOAT$
        +Item PINE_CHEST_BOAT$
        +Item RAW_TIN$
        +Item TIN_INGOT$
        +Item BRONZE_INGOT$
        +Item RAW_SILVER$
        +Item SILVER_INGOT$
        +Item SILVER_NUGGET$
        +Item BRONZE_SWORD$
        +Item BRONZE_PICKAXE$
        +Item BRONZE_AXE$
        +Item BRONZE_SHOVEL$
        +Item BRONZE_HOE$
        +Item BRONZE_HELMET$
        +Item BRONZE_CHESTPLATE$
        +Item BRONZE_LEGGINGS$
        +Item BRONZE_BOOTS$
        +Item TOMATO$
        +Item BAKED_TOMATO$
        +Item TOMATO_SEEDS$
        +Item LETTUCE$
        +Item CORN$
        +Item COOKED_CORN$
        +Item CORN_SEEDS$
        +registerModItems() void$
        -registerItem(String, Item) Item$
    }

    class ModEntities {
        +EntityType~HobbitEntity~ HOBBIT$
    }

    class ModItemGroups {
        +ItemGroup LOTR_STONES$
        +ItemGroup LOTR_WOOD$
        +ItemGroup LOTR_ORES$
        +ItemGroup LOTR_FOOD$
        +ItemGroup LOTR_TOOLS_AND_UTILITIES$
        +ItemGroup LOTR_FUNCTIONAL$
        +ItemGroup LOTR_ENTITIES$
        +registerModItemGroups() void$
        -addItemsToVanillaItemGroups() void$
    }

    %% Interface implementations
    LordOfTheRingsMiddleEarthMod ..|> ModInitializer : implements
    LordOfTheRingsMiddleEarthModClient ..|> ClientModInitializer : implements
    LordOfTheRingsMiddleEarthModDataGenerator ..|> DataGeneratorEntrypoint : implements

    %% Main relationships
    LordOfTheRingsMiddleEarthMod --> ModBlocks : uses
    LordOfTheRingsMiddleEarthMod --> ModItems : uses
    LordOfTheRingsMiddleEarthMod --> ModEntities : uses
    LordOfTheRingsMiddleEarthMod --> ModItemGroups : uses
```

## 2. Entity System

```mermaid
classDiagram
    direction TB
    
    class NPCEntity {
        +NPCEntity(EntityType, World)
    }

    class HobbitEntity {
        -TrackedData~Integer~ DATA_ID_TYPE_VARIANT$
        +AnimationState idleAnimationState
        +int idleAnimationTimeout
        +HobbitEntity(EntityType, World)
        #initGoals() void
        +createHobbitAttributes() DefaultAttributeContainer.Builder$
        -setupAnimationStates() void
        #updateLimbs(float) void
        +tick() void
        #initDataTracker() void
        -getTypeVariant() int
        +getVariant() HobbitVariant
        +setVariant(HobbitVariant) void
        +initialize(ServerWorldAccess, LocalDifficulty, SpawnReason, EntityData, NbtCompound) EntityData
        +readCustomDataFromNbt(NbtCompound) void
        +writeCustomDataToNbt(NbtCompound) void
    }

    class HobbitVariant {
        <<enumeration>>
        DEFAULT
        BROWN
        GREEN
        +getTexture() Identifier
        +byId(int) HobbitVariant$
    }

    class HobbitModel {
        +getTexturedModelData() TexturedModelData$
    }

    class HobbitRenderer {
        +getTexture(HobbitEntity) Identifier
    }

    class ModModelLayers {
        +EntityModelLayer HOBBIT$
    }

    %% Inheritance
    NPCEntity --|> PathAwareEntity : extends
    HobbitEntity --|> NPCEntity : extends

    %% Usage relationships
    HobbitEntity --> HobbitVariant : uses
    HobbitRenderer --> HobbitEntity : renders
    HobbitModel --> HobbitEntity : models
    HobbitRenderer --> ModModelLayers : uses
```

## 3. Block System

```mermaid
classDiagram
    direction TB
    
    class ModWoodType {
        <<enumeration>>
        PINE
        -Block log
        -Block wood
        -Block strippedLog
        -Block strippedWood
        -BlockFamily woodFamily
        -BlockFamily strippedWoodFamily
        -BlockFamily planksFamily
        -Item boatItem
        -Item chestBoatItem
        -Block leaves
        -Block sapling
        +getLog() Block
        +getWood() Block
        +getStrippedLog() Block
        +getStrippedWood() Block
        +getPlanks() Block
        +getLeaves() Block
        +getSapling() Block
    }

    class ModWoodBlocks {
        +Block PINE_LOG$
        +Block STRIPPED_PINE_LOG$
        +Block PINE_PLANKS$
        +Block PINE_LEAVES$
        +Block PINE_SAPLING$
        +BlockFamily PINE_WOOD_FAMILY$
        +BlockFamily STRIPPED_PINE_FAMILY$
        +BlockFamily PINE_PLANKS_FAMILY$
    }

    class ModStoneType {
        <<enumeration>>
        +getMossyStoneFamily() BlockFamily
        +getOvergrownStoneFamily() BlockFamily
        +getMossyCobbledFamily() BlockFamily
    }

    class TomatoCropBlock {
        +getAgeProperty() IntProperty
        +getMaxAge() int
        +getCropItem() ItemConvertible
        +getSeedsItem() ItemConvertible
    }

    class LettuceCropBlock {
        +getAgeProperty() IntProperty
        +getMaxAge() int
        +getCropItem() ItemConvertible
    }

    class CornCropBlock {
        +getAgeProperty() IntProperty
        +getMaxAge() int
        +getCropItem() ItemConvertible
        +getSeedsItem() ItemConvertible
    }

    class ModWoodBlocks {
        +Block PINE_LOG$
        +Block PINE_WOOD$
        +Block PINE_WOOD_STAIRS$
        +Block PINE_WOOD_SLAB$
        +Block PINE_WOOD_BUTTON$
        +Block PINE_WOOD_PRESSURE_PLATE$
        +Block PINE_WOOD_DOOR$
        +Block PINE_WOOD_TRAPDOOR$
        +Block STRIPPED_PINE_LOG$
        +Block STRIPPED_PINE_WOOD$
        +Block STRIPPED_PINE_STAIRS$
        +Block STRIPPED_PINE_SLAB$
        +Block STRIPPED_PINE_WOOD_BUTTON$
        +Block STRIPPED_PINE_WOOD_PRESSURE_PLATE$
        +Block STRIPPED_PINE_DOOR$
        +Block STRIPPED_PINE_TRAPDOOR$
        +Block PINE_PLANKS$
        +Block PINE_PLANKS_STAIRS$
        +Block PINE_PLANKS_SLAB$
        +Block PINE_PLANKS_FENCE$
        +Block PINE_PLANKS_FENCE_GATE$
        +Block PINE_PLANKS_BUTTON$
        +Block PINE_PLANKS_PRESSURE_PLATE$
        +Block PINE_PLANKS_DOOR$
        +Block PINE_PLANKS_TRAPDOOR$
        +Block PINE_LEAVES$
        +Block PINE_SAPLINGS$
        +Identifier PINE_SIGN_TEXTURE$
        +Identifier PINE_HANGING_SIGN_TEXTURE$
        +Identifier PINE_HANGING_GUI_SIGN_TEXTURE$
        +Block STANDING_PINE_SIGN$
        +Block WALL_PINE_SIGN$
        +Block HANGING_PINE_SIGN$
        +Block WALL_HANGING_PINE_SIGN$
        +BlockFamily PINE_WOOD_FAMILY$
        +BlockFamily STRIPPED_PINE_FAMILY$
        +BlockFamily PINE_PLANKS_FAMILY$
        -registerBlock(String, Block) Block$
        -registerBlockItem(String, Block) Item$
        +registerModWoodBlocks() void$
    }

    class ModStoneBlocks {
        +Block BLUESLATE$
        +Block BLUESLATE_STAIRS$
        +Block BLUESLATE_SLAB$
        +Block BLUESLATE_WALL$
        +Block BLUESLATE_BUTTON$
        +Block BLUESLATE_PRESSURE_PLATE$
        +BlockFamily BLUESLATE_FAMILY$
        +Block MOSSY_BLUESLATE$
        +Block MOSSY_BLUESLATE_STAIRS$
        +Block MOSSY_BLUESLATE_SLAB$
        +Block MOSSY_BLUESLATE_WALL$
        +Block MOSSY_BLUESLATE_BUTTON$
        +Block MOSSY_BLUESLATE_PRESSURE_PLATE$
        +BlockFamily MOSSY_BLUESLATE_FAMILY$
        +Block OVERGROWN_BLUESLATE$
        +Block OVERGROWN_BLUESLATE_STAIRS$
        +Block OVERGROWN_BLUESLATE_SLAB$
        +Block OVERGROWN_BLUESLATE_WALL$
        +Block OVERGROWN_BLUESLATE_BUTTON$
        +Block OVERGROWN_BLUESLATE_PRESSURE_PLATE$
        +BlockFamily OVERGROWN_BLUESLATE_FAMILY$
        -registerBlock(String, Block) Block$
        -registerBlockItem(String, Block) Item$
        +registerModStoneBlocks() void$
    }

    class ModOreType {
        <<enumeration>>
        TIN_ORE
        SILVER_ORE
        -Block stoneOre
        -Block deepslateOre
        -Block andesiteOre
        -Block dioriteOre
        -Block graniteOre
        -Block blueslateOre
        -Block chalkOre
        -Item oreDrop
        -Block oreDropBlock
        -UniformLootNumberProvider dropRange
        -int miningLevel
        -Item nugget
        -Item smeltingItem
        -Block smeltingBlock
        +ModOreType(Block, Block, Block, Block, Block, Block, Block, Item, Block, UniformLootNumberProvider, int, Item, Item, Block)
        +getBlockItemGroupList() List~ItemStack~
        +getItemItemGroupList() List~ItemStack~
        +getStoneOre() Block
        +getDeepslateOre() Block
        +getOreDrop() Item
        +getOreDropBlock() Block
        +getDropRange() UniformLootNumberProvider
        +getMiningLevel() int
        +getNugget() Item
        +getSmeltingItem() Item
        +getSmeltingBlock() Block
    }

    class PineSaplingGenerator {
        +getConfiguredFeatures() RegistryEntry~ConfiguredFeature~Block, ?~~$
    }

    %% Inheritance
    TomatoCropBlock --|> CropBlock : extends
    LettuceCropBlock --|> CropBlock : extends
    CornCropBlock --|> CropBlock : extends

    %% Relationships
    ModBlocks --> TomatoCropBlock : contains
    ModBlocks --> LettuceCropBlock : contains
    ModBlocks --> CornCropBlock : contains
    ModBlocks --> ModWoodBlocks : uses
    ModBlocks --> ModStoneBlocks : uses
    ModWoodType --> ModWoodBlocks : uses
    ModStoneType --> ModStoneBlocks : uses
    PineSaplingGenerator --> ModWoodBlocks : generates
```

## 4. Item System & Materials

```mermaid
classDiagram
    direction TB
    
    class ModToolMaterial {
        <<enumeration>>
        BRONZE
        -int miningLevel
        -int itemDurability
        -float miningSpeed
        -float attackDamage
        -int enchantability
        -Supplier~Ingredient~ repairIngredient
        +ModToolMaterial(int, int, float, float, int, Supplier~Ingredient~)
        +getDurability() int
        +getMiningSpeedMultiplier() float
        +getAttackDamage() float
        +getMiningLevel() int
        +getEnchantability() int
        +getRepairIngredient() Ingredient
    }

    class ModArmorMaterial {
        <<enumeration>>
        BRONZE
        -String name
        -int durabilityMultiplier
        -int[] protectionAmounts
        -int enchantability
        -SoundEvent equipSound
        -float toughness
        -float knockbackResistance
        -Supplier~Ingredient~ repairIngredient
        -int[] BASE_DURABILITY$
        +ModArmorMaterial(String, int, int[], int, SoundEvent, float, float, Supplier~Ingredient~)
        +getName() String
        +getDurability(ArmorItem.Type) int
        +getProtection(ArmorItem.Type) int
        +getEnchantability() int
        +getEquipSound() SoundEvent
        +getRepairIngredient() Ingredient
        +getToughness() float
        +getKnockbackResistance() float
    }

    class ModFoodComponents {
        +FoodComponent TOMATO$
        +FoodComponent BAKED_TOMATO$
        +FoodComponent CORN$
        +FoodComponent COOKED_CORN$
    }

    class ModBoats {
        +Identifier PINE_BOAT_ID$
        +Identifier PINE_CHEST_BOAT_ID$
        +RegistryKey~TerraformBoatType~ PINE_BOAT_KEY$
        +registerBoats() void$
    }

    class ModGearType {
        <<enumeration>>
        BRONZE
        -Item material
        -Item helmet
        -Item chestplate
        -Item leggings
        -Item boots
        -Item sword
        -Item axe
        -Item pickaxe
        -Item shovel
        -Item hoe
        +ModGearType(Item, Item, Item, Item, Item, Item, Item, Item, Item, Item)
        +getGearItemGroupList() List~ItemStack~
        +getMaterial() Item
        +getHelmet() Item
        +getChestplate() Item
        +getLeggings() Item
        +getBoots() Item
        +getSword() Item
        +getAxe() Item
        +getPickaxe() Item
        +getShovel() Item
        +getHoe() Item
    }

    %% Interface implementations
    ModToolMaterial ..|> ToolMaterial : implements
    ModArmorMaterial ..|> ArmorMaterial : implements

    %% Usage relationships
    ModItems --> ModToolMaterial : uses
    ModItems --> ModArmorMaterial : uses
    ModItems --> ModFoodComponents : uses
    ModItems --> ModBoats : uses
    ModItems --> ModGearType : uses
    ModGearType --> ModArmorMaterial : uses
    ModGearType --> ModToolMaterial : uses
```

## 5. World Generation

```mermaid
classDiagram
    direction TB
    
    class ModWorldGeneration {
        +generateModWorldGen() void$
    }

    class ModOreGeneration {
        +generateOres() void$
    }

    class ModTreeGeneration {
        +generateTrees() void$
    }

    class ModConfiguredFeatures {
        +RegistryKey~ConfiguredFeature~ TIN_ORE_KEY$
        +RegistryKey~ConfiguredFeature~ PINE_KEY$
        +boostrap(Registerable) void$
    }

    class ModPlacedFeatures {
        +RegistryKey~PlacedFeature~ TIN_ORE$
        +RegistryKey~PlacedFeature~ PINE_PLACED_KEY$
        +boostrap(Registerable) void$
    }

    class ModBiomes {
        +boostrap(Registerable) void$
    }

    class ModDimensions {
        +bootstrapType(Registerable) void$
    }

    %% Relationships
    ModWorldGeneration --> ModConfiguredFeatures : uses
    ModWorldGeneration --> ModPlacedFeatures : uses
    ModWorldGeneration --> ModOreGeneration : uses
    ModWorldGeneration --> ModTreeGeneration : uses
    ModConfiguredFeatures --> ModPlacedFeatures : uses
    ModOreGeneration --> ModPlacedFeatures : uses
    ModTreeGeneration --> ModPlacedFeatures : uses
```

## 6. Data Generation System

```mermaid
classDiagram
    direction TB
    
    class ModModelProvider {
        +ModModelProvider(FabricDataOutput)
        +generateBlockStateModels(BlockStateModelGenerator) void
        +generateItemModels(ItemModelGenerator) void
        -generateModStoneTypeBlockModels(BlockStateModelGenerator) void
        -generateModWoodTypesBlockModels(BlockStateModelGenerator) void
        -generateModOreTypeBlockModels(BlockStateModelGenerator) void
        -generateModPillarTypeBlockModels(BlockStateModelGenerator) void
        -generateGearItemModels(ItemModelGenerator, ModGearType) void
    }

    class ModBlockTagProvider {
        +ModBlockTagProvider(FabricDataOutput, CompletableFuture)
        #configure(RegistryWrapper.WrapperLookup) void
        -generateStoneTypeBlockTags(ModStoneType) void
        -generateWoodTypeBlockTags(ModWoodType) void
        -generateOreTypeBlockTags(ModOreType) void
    }

    class ModItemTagProvider {
        +ModItemTagProvider(FabricDataOutput, CompletableFuture, FabricTagProvider.BlockTagProvider)
        #configure(RegistryWrapper.WrapperLookup) void
        -generateStoneTypeItemTags(ModStoneType) void
        -generateWoodTypeItemTags(ModWoodType) void
        -generateOreTypeItemTags(ModOreType) void
    }

    class ModLootTableProvider {
        +ModLootTableProvider(FabricDataOutput)
        +generate(BiConsumer) void
        -addDrop(Block) LootTable.Builder
        -cropDrops(Block, Item, Item, LootCondition.Builder) LootTable.Builder
        -oreDrops(Block, Item) LootTable.Builder
    }

    class ModRecipeProvider {
        +ModRecipeProvider(FabricDataOutput)
        +generate(RecipeExporter) void
        -offerWoodTypeRecipes(RecipeExporter, ModWoodType) void
        -offerStoneTypeRecipes(RecipeExporter, ModStoneType) void
        -offerOreTypeRecipes(RecipeExporter, ModOreType) void
        -offerGearTypeRecipes(RecipeExporter, ModGearType) void
        -createSlabRecipe(RecipeCategory, ItemConvertible, Ingredient) ShapedRecipeJsonBuilder
        -createStairsRecipe(ItemConvertible, Ingredient) ShapedRecipeJsonBuilder
    }

    class ModWorldGenerator {
        +ModWorldGenerator(FabricDataOutput)
        +buildRegistry(RegistryBuilder) void
    }

    class ModEnUsLangProvider {
        +ModEnUsLangProvider(FabricDataOutput)
        +generateTranslations(TranslationBuilder) void
        -generateBlockTranslations(TranslationBuilder) void
        -generateItemTranslations(TranslationBuilder) void
        -generateEntityTranslations(TranslationBuilder) void
        -generateSubtitleTranslations(TranslationBuilder) void
        -generateStoneTypeTranslations(TranslationBuilder, ModStoneType) void
        -generateWoodTypeTranslations(TranslationBuilder, ModWoodType) void
        -generateOreTypeTranslations(TranslationBuilder, ModOreType) void
    }

    %% Usage relationships
    LordOfTheRingsMiddleEarthModDataGenerator --> ModModelProvider : uses
    LordOfTheRingsMiddleEarthModDataGenerator --> ModBlockTagProvider : uses
    LordOfTheRingsMiddleEarthModDataGenerator --> ModItemTagProvider : uses
    LordOfTheRingsMiddleEarthModDataGenerator --> ModLootTableProvider : uses
    LordOfTheRingsMiddleEarthModDataGenerator --> ModRecipeProvider : uses
    LordOfTheRingsMiddleEarthModDataGenerator --> ModWorldGenerator : uses
    LordOfTheRingsMiddleEarthModDataGenerator --> ModEnUsLangProvider : uses
    LordOfTheRingsMiddleEarthModDataGenerator --> ModConfiguredFeatures : uses
    LordOfTheRingsMiddleEarthModDataGenerator --> ModPlacedFeatures : uses
    LordOfTheRingsMiddleEarthModDataGenerator --> ModBiomes : uses
    LordOfTheRingsMiddleEarthModDataGenerator --> ModDimensions : uses
```

## Package Overview

### Main Package (`me.anedhel.lotr`)
Contains the three main entry points for the mod:
- **LordOfTheRingsMiddleEarthMod**: Server-side mod initialization
- **LordOfTheRingsMiddleEarthModClient**: Client-side initialization  
- **LordOfTheRingsMiddleEarthModDataGenerator**: Data generation setup

### Block Package (`me.anedhel.lotr.block`)
Handles all block-related functionality including:
- Block registration and definitions
- Wood type system with various wood blocks
- Stone type system with variants
- Custom crop blocks for farming

### Item Package (`me.anedhel.lotr.item`)
Manages all items in the mod:
- Item registration
- Tool and armor materials
- Food components
- Item groups for creative inventory

### Entity Package (`me.anedhel.lotr.entity`)
Contains entity-related classes:
- Custom entities like HobbitEntity
- Entity variants and models
- Boats system
- Client-side rendering

### World Package (`me.anedhel.lotr.world`)
Handles world generation features:
- Configured features for terrain
- Placed features for world decoration
- Custom biomes
- Dimension definitions

### Data Generation Package (`me.anedhel.lotr.datagen`)
Provides data generation for:
- Block and item models
- Recipes and loot tables
- Language files
- Tags for blocks and items

## Key Design Patterns

1. **Registry Pattern**: Used throughout for registering blocks, items, and entities
2. **Enum Pattern**: Used for materials (ModToolMaterial, ModArmorMaterial) and variants
3. **Builder Pattern**: Used in entity attribute creation and world generation
4. **Template Pattern**: Used in data generation providers
5. **Factory Pattern**: Used in item and block creation

## Architecture Notes

- The mod follows Fabric's modular architecture with clear separation between client and server code
- Uses dependency injection through Fabric's API system
- Implements proper resource management through registries
- Follows Minecraft's existing patterns for blocks, items, and entities
- Includes comprehensive data generation for assets and data