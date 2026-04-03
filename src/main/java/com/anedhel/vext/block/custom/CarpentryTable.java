/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.block.custom;

import com.anedhel.vext.screen.custom.CarpentryTableScreenHandler;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jspecify.annotations.Nullable;

/**
 * Represents a carpentry table block used for crafting custom recipes.
 * <p>
 * This block provides a custom GUI interface for players to access carpentry recipes.
 * It is directional and can be placed facing any horizontal direction.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class CarpentryTable extends HorizontalFacingBlock {

	public static final MapCodec<CarpentryTable> CODEC = createCodec(CarpentryTable::new);
	private static final Text TITLE = Text.translatableWithFallback("vext.container.carpentry_table"
			, "Carpentry Table");
	private static final VoxelShape SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);

	public CarpentryTable(Settings settings) {
		super(settings);
		this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH));
	}

	/**
	 * Handles the block interaction when a player right-clicks on the carpentry table.
	 * Currently the Method is pretty much empty due to a bug with the Recipe
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
		if(!world.isClient()) {
			player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
		}
		return ActionResult.SUCCESS;
	}

	/**
	 * Creates a screen handler factory for the carpentry table block, allowing players to access the custom GUI.
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
				(syncId, inv, player) -> new CarpentryTableScreenHandler(syncId, inv,
						ScreenHandlerContext.create(world, pos)),
				TITLE
		);
	}

	/**
	 * Appends the block state properties for the carpentry table, including the facing direction.
	 *
	 * @param builder The state manager builder to which the properties will be added.
	 */
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	/**
	 * Rotates the block state of the carpentry table based on the given rotation.
	 *
	 * @param state The current block state of the carpentry table.
	 * @param rotation The rotation to apply to the block state.
	 * @return The rotated block state of the carpentry table.
	 */
	@Override
	public BlockState rotate(BlockState state, BlockRotation rotation) {
		return state.with(FACING, rotation.rotate(state.get(FACING)));
	}

	/**
	 * Mirrors the block state of the carpentry table based on the given mirror.
	 *
	 * @param state The current block state of the carpentry table.
	 * @param mirror The mirror to apply to the block state.
	 * @return The mirrored block state of the carpentry table.
	 */
	@Override
	public BlockState mirror(BlockState state, BlockMirror mirror) {
		return state.rotate(mirror.getRotation(state.get(FACING)));
	}

	/**
	 * Handles the block state replacement when the carpentry table is broken or replaced.
	 *
	 * @param state The current block state of the carpentry table.
	 * @param world The server world in which the block is located.
	 * @param pos The position of the block in the world.
	 * @param moved A boolean indicating whether the block was moved or not.
	 */
	@Override
	protected void onStateReplaced(BlockState state, ServerWorld world, BlockPos pos, boolean moved) {
		ItemScatterer.onStateReplaced(state, world, pos);
	}

	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return SHAPE;
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
	}

	@Override
	protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
		return CODEC;
	}
}
