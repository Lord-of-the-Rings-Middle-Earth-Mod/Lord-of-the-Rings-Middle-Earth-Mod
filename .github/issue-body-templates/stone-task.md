# Task:
Implement all the stone_type blocks following the blueslate pattern.

# How to do this:
- ModStoneBlocks
  - Register all needed stone_type blocks (588 blocks and 126 BlockFamilies)
  - For this you can copy-paste the blueslate registrations and just change the names from blueslate to stone_type
- ModStoneTypes
  - Add an entry to the enum, referencing all the blockfamilies for stone_type, that were created in ModStoneBlocks
- ModItemGroups
  - add `entries.addAll(ModStoneType.STONE_TYPE.getLotRStoneItemGroupList());` to the LOTR_STONES ItemGroup
- Add a line to the CHANGELOG.md that stone_type has been added as stone type similar to the already existing line for blueslate

When those steps are done, the stone type is all added. DataGen etc. is all automatically done by iterating over the ModStoneType Enum. Each stone type should contain about 588 blocks and 126 Block Families.

You can see an extensive Tutorial on how to add a stone type in the following file: https://drive.google.com/file/d/1PPP5iPaxeeUu-IXlhVU_WspjRAf-rYF8/view?usp=sharing

This issue requires **ALL** of the above mentioned steps to be implemented **completely**. No blocks should be left out and we do not want a systematic approach to the issue, we want the final result.