# Lord of the Rings Middle Earth Mod - Class Diagrams

This document contains Mermaid class diagrams showing the structure and relationships of the main classes in the Lord of the Rings Middle Earth Mod. The diagrams are organized by functional areas for better readability.

## 1. Main Mod Structure Overview

```mermaid
classDiagram
    direction TB
    
    class LordOfTheRingsMiddleEarthMod {
        +String MOD_ID
        +Logger LOGGER
        +onInitialize() void
    }

    class LordOfTheRingsMiddleEarthModClient {
        +onInitializeClient() void
    }

    class LordOfTheRingsMiddleEarthModDataGenerator {
        +onInitializeDataGenerator() void
        +buildRegistry() void
    }

    class ModBlocks {
        +registerModBlocks() void$
    }

    class ModItems {
        +registerModItems() void$
    }

    class ModEntities {
        +EntityType HOBBIT$
    }

    class ModItemGroups {
        +registerModItemGroups() void$
    }

    %% Interface implementations
    LordOfTheRingsMiddleEarthMod ..|> ModInitializer
    LordOfTheRingsMiddleEarthModClient ..|> ClientModInitializer
    LordOfTheRingsMiddleEarthModDataGenerator ..|> DataGeneratorEntrypoint

    %% Main relationships
    LordOfTheRingsMiddleEarthMod --> ModBlocks
    LordOfTheRingsMiddleEarthMod --> ModItems
    LordOfTheRingsMiddleEarthMod --> ModEntities
    LordOfTheRingsMiddleEarthMod --> ModItemGroups
```

## 2. Entity System

```mermaid
classDiagram
    direction TB
    
    class NPCEntity {
        +NPCEntity(EntityType, World)
    }

    class HobbitEntity {
        +getVariant() HobbitVariant
        +setVariant() void
        +initialize() EntityData
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
        +getTexture() Identifier
    }

    class ModModelLayers {
        +EntityModelLayer HOBBIT$
    }

    %% Inheritance
    NPCEntity --|> PathAwareEntity
    HobbitEntity --|> NPCEntity

    %% Usage relationships
    HobbitEntity --> HobbitVariant
    HobbitRenderer --> HobbitEntity
    HobbitModel --> HobbitEntity
    HobbitRenderer --> ModModelLayers
```

## 3. Block System

```mermaid
classDiagram
    direction TB
    
    class ModBlocks {
        +Block TIN_ORE$
        +Block TOMATO_CROP$
        +Block LETTUCE_CROP$
        +Block CORN_CROP$
        +registerModBlocks() void$
    }

    class ModWoodType {
        <<enumeration>>
        PINE
        +getLog() Block
        +getPlanks() Block
        +getLeaves() Block
        +getSapling() Block
    }

    class ModWoodBlocks {
        +Block PINE_LOG$
        +Block PINE_PLANKS$
        +Block PINE_LEAVES$
        +BlockFamily PINE_PLANKS_FAMILY$
    }

    class ModStoneType {
        <<enumeration>>
        +getMossyStoneFamily() BlockFamily
        +getOvergrownStoneFamily() BlockFamily
    }

    class TomatoCropBlock {
        +getMaxAge() int
        +getCropItem() ItemConvertible
        +getSeedsItem() ItemConvertible
    }

    class LettuceCropBlock {
        +getMaxAge() int
        +getCropItem() ItemConvertible
    }

    class CornCropBlock {
        +getMaxAge() int
        +getCropItem() ItemConvertible
        +getSeedsItem() ItemConvertible
    }

    %% Inheritance
    TomatoCropBlock --|> CropBlock
    LettuceCropBlock --|> CropBlock
    CornCropBlock --|> CropBlock

    %% Relationships
    ModBlocks --> TomatoCropBlock
    ModBlocks --> LettuceCropBlock
    ModBlocks --> CornCropBlock
    ModWoodType --> ModWoodBlocks
```

## 4. Item System & Materials

```mermaid
classDiagram
    direction TB
    
    class ModItems {
        +Item RAW_TIN$
        +Item TIN_INGOT$
        +Item BRONZE_SWORD$
        +Item BRONZE_HELMET$
        +Item TOMATO$
        +registerModItems() void$
    }

    class ModToolMaterial {
        <<enumeration>>
        BRONZE
        +getDurability() int
        +getAttackDamage() float
        +getRepairIngredient() Ingredient
    }

    class ModArmorMaterial {
        <<enumeration>>
        BRONZE
        +getDurability() int
        +getProtection() int
        +getEnchantability() int
    }

    class ModFoodComponents {
        +FoodComponent TOMATO$
        +FoodComponent BAKED_TOMATO$
        +FoodComponent CORN$
    }

    class ModBoats {
        +Identifier PINE_BOAT_ID$
        +registerBoats() void$
    }

    %% Interface implementations
    ModToolMaterial ..|> ToolMaterial
    ModArmorMaterial ..|> ArmorMaterial

    %% Usage relationships
    ModItems --> ModToolMaterial
    ModItems --> ModArmorMaterial
    ModItems --> ModFoodComponents
    ModItems --> ModBoats
```

## 5. World Generation

```mermaid
classDiagram
    direction TB
    
    class ModWorldGeneration {
        +generateModWorldGen() void$
    }

    class ModConfiguredFeatures {
        +bootstrap() void$
    }

    class ModPlacedFeatures {
        +bootstrap() void$
    }

    class ModBiomes {
        +bootstrap() void$
    }

    class ModDimensions {
        +bootstrapType() void$
    }

    %% Relationships
    ModWorldGeneration --> ModConfiguredFeatures
    ModWorldGeneration --> ModPlacedFeatures
    ModConfiguredFeatures --> ModPlacedFeatures
```

## 6. Data Generation System

```mermaid
classDiagram
    direction TB
    
    class LordOfTheRingsMiddleEarthModDataGenerator {
        +onInitializeDataGenerator() void
    }

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

    %% Usage relationships
    LordOfTheRingsMiddleEarthModDataGenerator --> ModModelProvider
    LordOfTheRingsMiddleEarthModDataGenerator --> ModBlockTagProvider
    LordOfTheRingsMiddleEarthModDataGenerator --> ModItemTagProvider
    LordOfTheRingsMiddleEarthModDataGenerator --> ModLootTableProvider
    LordOfTheRingsMiddleEarthModDataGenerator --> ModRecipeProvider
    LordOfTheRingsMiddleEarthModDataGenerator --> ModWorldGenerator
    LordOfTheRingsMiddleEarthModDataGenerator --> ModEnUsLangProvider
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