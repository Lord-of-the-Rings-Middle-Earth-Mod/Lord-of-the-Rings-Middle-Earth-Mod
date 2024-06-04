package me.anedhel.lotr.block.custom.crops;

import me.anedhel.lotr.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;

public class LettuceCropBlock extends CropBlock {

    public static final int MAX_AGE = 3;
    public static final IntProperty AGE = Properties.AGE_3;

    public LettuceCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.LETTUCE;
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
