# Lord of the Rings Middle Earth Mod - Class Diagram

This document contains a Mermaid class diagram showing the structure and relationships of the main classes in the Lord of the Rings Middle Earth Mod.

```mermaid
classDiagram
    %% Main Mod Entry Points
    class LordOfTheRingsMiddleEarthMod {
        +String MOD_ID
        +Logger LOGGER
        +String COPYRIGHT
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
    }

    class LordOfTheRingsMiddleEarthModDataGenerator {
        +onInitializeDataGenerator(FabricDataGenerator) void
        +buildRegistry(RegistryBuilder) void
    }

    %% Core Registry Classes
    class ModBlocks {
        +Block TIN_ORE$
        +Block DEEPSLATE_TIN_ORE$
        +Block TIN_BLOCK$
        +Block RAW_TIN_BLOCK$
        +Block BRONZE_BLOCK$
        +Block SILVER_ORE$
        +Block TOMATO_CROP$
        +Block LETTUCE_CROP$
        +Block CORN_CROP$
        +registerModBlocks() void$
        -registerBlock(String, Block) Block$
    }

    class ModItems {
        +Item HOBBIT_SPAWN_EGG$
        +Item PINE_SIGN$
        +Item PINE_BOAT$
        +Item RAW_TIN$
        +Item TIN_INGOT$
        +Item BRONZE_INGOT$
        +Item RAW_SILVER$
        +Item SILVER_INGOT$
        +Item BRONZE_SWORD$
        +Item BRONZE_PICKAXE$
        +Item BRONZE_HELMET$
        +Item TOMATO$
        +Item LETTUCE$
        +Item CORN$
        +registerModItems() void$
        -registerItem(String, Item) Item$
    }

    class ModEntities {
        +EntityType~HobbitEntity~ HOBBIT$
    }

    class ModItemGroups {
        +registerModItemGroups() void$
    }

    %% Entity System
    class NPCEntity {
        +NPCEntity(EntityType, World)
    }

    class HobbitEntity {
        -TrackedData~Integer~ DATA_ID_TYPE_VARIANT$
        +createHobbitAttributes() DefaultAttributeContainer.Builder$
        +getVariant() HobbitVariant
        +setVariant(HobbitVariant) void
        +initialize(ServerWorldAccess, LocalDifficulty, SpawnReason, EntityData, NbtCompound) EntityData
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

    %% Material Enums
    class ModToolMaterial {
        <<enumeration>>
        BRONZE
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
        +getName() String
        +getDurability(ArmorItem.Type) int
        +getProtection(ArmorItem.Type) int
        +getEnchantability() int
        +getEquipSound() SoundEvent
        +getRepairIngredient() Ingredient
        +getToughness() float
        +getKnockbackResistance() float
    }

    %% Block System
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

    %% Crop System
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

    %% World Generation
    class ModWorldGeneration {
        +generateModWorldGen() void$
    }

    class ModConfiguredFeatures {
        +boostrap(Registerable) void$
    }

    class ModPlacedFeatures {
        +boostrap(Registerable) void$
    }

    class ModBiomes {
        +boostrap(Registerable) void$
    }

    class ModDimensions {
        +bootstrapType(Registerable) void$
    }

    %% Food Components
    class ModFoodComponents {
        +FoodComponent TOMATO$
        +FoodComponent BAKED_TOMATO$
        +FoodComponent CORN$
        +FoodComponent COOKED_CORN$
    }

    %% Boats System
    class ModBoats {
        +Identifier PINE_BOAT_ID$
        +RegistryKey~TerraformBoatType~ PINE_BOAT_KEY$
        +Identifier PINE_CHEST_BOAT_ID$
        +registerBoats() void$
    }

    %% Data Generation
    class ModModelProvider {
    }

    class ModBlockTagProvider {
    }

    class ModItemTagProvider {
    }

    class ModLootTableProvider {
    }

    class ModRecipeProvider {
    }

    class ModWorldGenerator {
    }

    class ModEnUsLangProvider {
    }

    %% Interface Implementations
    LordOfTheRingsMiddleEarthMod ..|> ModInitializer : implements
    LordOfTheRingsMiddleEarthModClient ..|> ClientModInitializer : implements
    LordOfTheRingsMiddleEarthModDataGenerator ..|> DataGeneratorEntrypoint : implements
    ModToolMaterial ..|> ToolMaterial : implements
    ModArmorMaterial ..|> ArmorMaterial : implements

    %% Inheritance Relationships
    NPCEntity --|> PathAwareEntity : extends
    HobbitEntity --|> NPCEntity : extends
    TomatoCropBlock --|> CropBlock : extends
    LettuceCropBlock --|> CropBlock : extends
    CornCropBlock --|> CropBlock : extends

    %% Composition and Usage Relationships
    LordOfTheRingsMiddleEarthMod --> ModBlocks : uses
    LordOfTheRingsMiddleEarthMod --> ModItems : uses
    LordOfTheRingsMiddleEarthMod --> ModEntities : uses
    LordOfTheRingsMiddleEarthMod --> ModItemGroups : uses
    LordOfTheRingsMiddleEarthMod --> ModWoodType : uses
    LordOfTheRingsMiddleEarthMod --> ModWorldGeneration : uses
    LordOfTheRingsMiddleEarthMod --> ModBoats : uses

    LordOfTheRingsMiddleEarthModClient --> ModWoodType : uses
    LordOfTheRingsMiddleEarthModClient --> ModStoneType : uses
    LordOfTheRingsMiddleEarthModClient --> ModEntities : uses
    LordOfTheRingsMiddleEarthModClient --> ModModelLayers : uses

    ModItems --> ModToolMaterial : uses
    ModItems --> ModArmorMaterial : uses
    ModItems --> ModFoodComponents : uses
    ModItems --> ModBlocks : uses
    ModItems --> ModEntities : uses
    ModItems --> ModBoats : uses

    ModBlocks --> TomatoCropBlock : contains
    ModBlocks --> LettuceCropBlock : contains
    ModBlocks --> CornCropBlock : contains

    ModEntities --> HobbitEntity : contains
    HobbitEntity --> HobbitVariant : uses
    HobbitRenderer --> HobbitEntity : renders
    HobbitModel --> HobbitEntity : models

    ModWoodType --> ModWoodBlocks : uses
    ModWorldGeneration --> ModConfiguredFeatures : uses
    ModWorldGeneration --> ModPlacedFeatures : uses

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

    %% Package Organization
    namespace "me.anedhel.lotr" {
        class LordOfTheRingsMiddleEarthMod
        class LordOfTheRingsMiddleEarthModClient
        class LordOfTheRingsMiddleEarthModDataGenerator
    }

    namespace "me.anedhel.lotr.block" {
        class ModBlocks
        class ModWoodType
        class ModWoodBlocks
        class ModStoneType
        class TomatoCropBlock
        class LettuceCropBlock
        class CornCropBlock
    }

    namespace "me.anedhel.lotr.item" {
        class ModItems
        class ModItemGroups
        class ModToolMaterial
        class ModArmorMaterial
        class ModFoodComponents
    }

    namespace "me.anedhel.lotr.entity" {
        class ModEntities
        class NPCEntity
        class ModBoats
        class HobbitEntity
        class HobbitVariant
        class HobbitModel
        class HobbitRenderer
        class ModModelLayers
    }

    namespace "me.anedhel.lotr.world" {
        class ModWorldGeneration
        class ModConfiguredFeatures
        class ModPlacedFeatures
        class ModBiomes
        class ModDimensions
    }

    namespace "me.anedhel.lotr.datagen" {
        class ModModelProvider
        class ModBlockTagProvider
        class ModItemTagProvider
        class ModLootTableProvider
        class ModRecipeProvider
        class ModWorldGenerator
        class ModEnUsLangProvider
    }
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