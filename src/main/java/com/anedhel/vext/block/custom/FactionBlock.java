package com.anedhel.vext.block.custom;

import com.anedhel.vext.screen.custom.FactionBlockScreenHandler;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jspecify.annotations.Nullable;

/**
 * Represents a Faction-Bloc used for the City-Building environment.
 * <p>
 * This block provides a custom GUI interface for players to access the faction settings and resources.
 *
 * @author Ano_Jedt
 * @since after 0.1.0
 */

public class FactionBlock extends Block {

    public static final MapCodec<FactionBlock> CODEC = createCodec(FactionBlock::new);
    private static final VoxelShape SHAPE = Block.createCuboidShape(1.0D, 1.0D, 1.0D, 15.0D, 15.0D, 15.0D);
    private static final Text TITLE = Text.translatableWithFallback("vext.container.FactionBlock"
            , "Faction Block");
    public FactionBlock(Settings settings) {
        super(settings);
    }

    /**
     * Handles the block interaction when a player right-clicks on the FactionBlock.
     *
     * @param state The current block state of the carpentry table.
     * @param world The world in which the block is located.
     * @param pos The position of the block in the world.
     * @param player The player entity interacting with the block.
     * @param hit The result of the block hit, containing information about the interaction.
     * @return The result of the action, indicating whether the interaction was successful or not.
     */
    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.BLOCK_BELL_USE, SoundCategory.BLOCKS, 1f, 1f);
        if(!world.isClient()) {
            player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
        }

        player.sendMessage(
                Text.literal(
                        "Player: " + player.getName().getString()
                                + " | Pos: "
                                + pos.getX() + ", "
                                + pos.getY() + ", "
                                + pos.getZ()
                ),
                false
        );

        return ActionResult.SUCCESS;
    }

    /**
     * Creates a screen handler factory for the Faction block, allowing players to access the custom GUI.
     *
     * @param state The current block state of the carpentry table.
     * @param world The world in which the block is located.
     * @param pos The position of the block in the world.
     * @return A named screen handler factory for the carpentry table, or null if it cannot be created.
     */
    @Override
    protected @Nullable NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world,
                                                                             BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory(
                (syncId, inv, player) -> new FactionBlockScreenHandler(syncId, inv),
                TITLE
        );
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected MapCodec<? extends Block> getCodec() {
        return CODEC;
    }
}
