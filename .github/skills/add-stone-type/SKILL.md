---
name: add-stone-type
description: Complete implementation guide for adding a new StoneType to the VExt Mod. Use this skill when asked to add a stone type, create blocks for a new geological material, or implement a new entry in ModStoneTypes.
license: CC-BY-NC-SA
---

# Adding a New Stone Type
 
Throughout this guide, `StoneType` / `stone_type` are placeholders. Replace them with the actual stone type name from the issue title in all file names, class names, and identifiers.
 
Use `BlueslateBlocks.java` as your sole reference throughout. Do not deviate from established patterns unless explicitly required.
 
## Steps
 
1. Create `StoneTypeBlocks.java` in `com.anedhel.vext.block.stonetypes` — register all blocks, BlockFamilies, all 9 ModStoneSubSets, and the main ModStoneSet following the Blueslate pattern exactly. Add a `registerStoneTypeBlocks()` method.
2. Add the new stone type to the `ModStoneTypes` enum referencing the ModStoneSet.
3. Call `registerStoneTypeBlocks()` in `ModBlocks`.
4. Add the ModStoneSet to the `VEXT_STONE` item group in `ModItemGroups`.
5. Add an entry to `CHANGELOG.md` under the current release.
 
> DataGen (block tags, loot tables, lang entries, recipes, models) is fully automated via `ModStoneTypes` iteration — do not implement manually.
 
## Acceptance Criteria
 
- [ ] New stone type is fully implemented following the Blueslate pattern
- [ ] CHANGELOG.md has been updated
- [ ] No existing stone type functionality is broken
