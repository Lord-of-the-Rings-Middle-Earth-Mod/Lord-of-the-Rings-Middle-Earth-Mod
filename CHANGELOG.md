# Changelog

All notable changes to the Lord of the Rings Middle Earth mod will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- **Comprehensive Chalk Blocks System**: Added complete chalk building blocks system with 58+ variants
  - Basic blocks: Chalk, Chalk Brick, Chalk Pavement, Chalk Tiles, Chiseled Chalk Brick, Cobbled Chalk, Cobbled Chalk Bricks, Smooth Chalk, Fancy Chalk Bricks
  - Cracked variants: All basic blocks have corresponding cracked versions for weathered aesthetics
  - Pillar blocks: Chalk Pillar and Cracked Chalk Pillar with axis rotation support
  - Derived blocks: Slabs, Stairs, and Walls for all appropriate block types
  - Full data generation: Block models, item models, recipes, loot tables, and language translations
  - Creative tab integration: All blocks organized in "LotR Stone" creative tab
  - Recipe system: Traditional crafting recipes plus efficient stonecutter recipes
  - Texture support: Ready for 27 chalk texture variants as specified in issue requirements

### Technical
- Implemented complete Fabric mod data generation pipeline for chalk blocks
- Added comprehensive recipe system with both shaped crafting and stonecutter efficiency
- Proper loot table generation with correct slab drop behavior
- Full localization support with English translations
- Creative tab organization following established mod patterns