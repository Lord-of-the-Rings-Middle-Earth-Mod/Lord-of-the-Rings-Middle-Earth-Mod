package com.anedhel.vext.screen.custom;

import com.anedhel.vext.screen.ModScreenHandlers;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.math.BlockPos;

public class FactionBlockScreenHandler extends ScreenHandler {

    //CLIENT constructor
    public FactionBlockScreenHandler(int syncID, PlayerInventory playerInventory) {
        super(ModScreenHandlers.FACTION_BLOCK_SCREEN_HANDLER, syncID);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }
}

