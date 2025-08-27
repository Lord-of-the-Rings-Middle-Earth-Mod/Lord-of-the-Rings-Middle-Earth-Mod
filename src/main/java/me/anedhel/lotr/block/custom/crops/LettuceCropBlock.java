package me.anedhel.lotr.block.custom.crops;

import com.mojang.serialization.MapCodec;
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

    /**
     * Returns the codec for this block. Currently unused in Minecraft 1.20.3/1.20.4.
     * As per Fabric migration guide, returning null is acceptable until this is needed.
     */
    @Override
    protected MapCodec<? extends Block> getCodec() {
        return null;
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
