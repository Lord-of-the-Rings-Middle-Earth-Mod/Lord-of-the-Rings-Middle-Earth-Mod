---
name: add-stone-type
description: Complete implementation guide for adding a new Ornament for all Stone Types to the VExt Mod. Use this skill when asked to add an ornament.
license: CC-BY-NC-SA
---

# Adding a New Ornament

Throughout this guide, `OrnamentName` / `ornament_name` are placeholders. Replace them with the actual ornament name from the issue title in all file names, class names, and identifiers.
Use the Bronze, Silver, and Gold ornament implementations as your sole reference throughout. Do not deviate from established patterns unless explicitly required.
If the issue specifies special block behaviour (e.g. light emission, redstone interaction), implement it accordingly. Purely decorative ornaments require no additional behaviour.

## Scope

Applies to all 9 SubSets of every StoneType currently in `ModStoneTypes`.

## Steps

### Block & BlockFamily Registration
Register all OrnamentName blocks and `BlockFamily` entries in the respective `Blocks` file of each StoneType following the Bronze/Silver/Gold pattern. All variants must be covered: base, mossy, overgrown, cracked, and all combinations thereof.

### `StoneTypeVariants` Extension
Add enum entries for all OrnamentName variants to `StoneTypeVariants` following the Bronze/Silver/Gold pattern. Extend `getRecipePath()`, `getBaseFromOrnamented()`, `isOrnamented()`, and all other relevant switch statements.

### `ModStoneSubSet` Update
Add the new OrnamentName `BlockFamily` fields, extend the constructor, and update `getAllBlockFamilies()`, `getStoneSubSetItemGroupList()`, `getStoneTypeVariantFamily()`, and `crackedFamilyMap` — following the Bronze/Silver/Gold fields as a 1:1 reference.

### `ModStoneSet` Instantiation
Pass the new OrnamentName families when constructing each `ModStoneSubSet` instance, as done for the existing ornaments.

### Data Generation
`ModBlockTagProvider`, `ModLootTableProvider`, and `ModEnUsLangProvider` are handled automatically — do not implement manually.

Extend `generateModStoneSubSetRecipes()` with all OrnamentName ornament recipes following the Bronze/Silver/Gold pattern — `generateOrnamentRecipe()`, `generateOvergrownRecipe()`, and `generateStoneSmelting()` for the cracked variants. Extend `generateStoneCuttingRecipes()` and `generateBlockFamilyStoneCutting()` accordingly.

Extend `ModModelProvider` — each SubSet type has its own generation method, extend each following the Bronze/Silver/Gold pattern.

### `ModTextures`
Add all required overlay entries following the `CRACKED_` prefix naming convention as required by `getCrackedVariant()`. When opening the PR, list all added entry names in the PR comment so Texture Artists know the exact file names expected in `block/overlays/`.

## Acceptance Criteria

- [ ] New ornament is fully implemented following the Bronze/Silver/Gold pattern
- [ ] CHANGELOG.md has been updated
- [ ] No existing ornament functionality is broken