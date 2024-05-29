package me.anedhel.lotr.block.custom;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class AlloyForgeBlock extends BlockWithEntity implements BlockEntityProvider {

    public AlloyForgeBlock(Settings settings) {
        super(settings);
    }

    /**
     *
     * @param pos
     * @param state
     * @return a new block entity instance
     * @implNote While this is marked as nullable, in practice this should never return
     * {@code null}. {@link PistonExtensionBlock} is the only block in vanilla that
     * returns {@code null} inside the implementation.
     */
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return
    }
}
