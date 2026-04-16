/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.mixin;

import com.anedhel.vext.block.ModBlockTags;
import com.anedhel.vext.block.woodtypes.PineBlocks;
import com.anedhel.vext.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

/**
 * Mixin for {@link AxeItem} that extends stripping behaviour.
 * <p>
 * Drops bark items when a log is stripped with an axe, and copies over
 * block state properties (e.g. axis) from the original log to the stripped
 * log so that no information is lost during the stripping process.
 *
 * @author Moritz Rohleder
 * @since x.y.z
 */
@Mixin(AxeItem.class)
public class AxeItemMixin {

	/**
	 * Injects into {@code tryStrip} to drop the appropriate bark item after a strippable Block
	 * has been stripped.
	 * <p>
	 * Two bark items are spawned slightly above the stripped block. Nothing is
	 * dropped on the logical client side.
	 *
	 * @param world  the world in which the block was stripped
	 * @param pos    the position of the stripped block
	 * @param player the player who stripped the block, or {@code null} if none
	 * @param state  the {@link BlockState} of the block before stripping
	 * @param cir    the callback info for the {@link Optional}{@code <BlockState>} return value
	 */
	@Inject(method = "tryStrip",
			at = @At(value = "INVOKE",
					target = "Lnet/minecraft/world/World;playSound(Lnet/minecraft/entity/Entity;"
							+ "Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/sound/SoundEvent;Lnet/minecraft/sound/SoundCategory;FF)V",
							shift = At.Shift.AFTER))
	private void dropBarkOnStrip(World world, BlockPos pos, @Nullable PlayerEntity player, BlockState state,
			CallbackInfoReturnable<Optional<BlockState>> cir) {
		if (!world.isClient()){
			Item barkItem = getBarkForBlock(state);
			if (barkItem != null) {
				ItemEntity itemEntity = new ItemEntity(
						world, pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5,
						new ItemStack(barkItem, 2)
				);
				world.spawnEntity(itemEntity);
			}
		}
	}

	/**
	 * Injects into {@code getStrippedState} to copy all shared block state properties
	 * from the original block state to the stripped block state.
	 * <p>
	 * This ensures that properties besides the axis are preserved when stripping block that is not a log.
	 *
	 * @param state the original {@link BlockState} before stripping
	 * @param cir   the callback info carrying the stripped {@link BlockState} as return value
	 */
	@Inject(
			method = "getStrippedState",
			at = @At("RETURN"),
			cancellable = true
	)
	private void onGetStrippedState(BlockState state, CallbackInfoReturnable<Optional<BlockState>> cir) {
		if(cir.getReturnValue().isPresent()){
			BlockState strippedState = cir.getReturnValue().get();

			for(Property<?> property : state.getProperties()) {
				if(strippedState.contains(property)) {
					strippedState = copyProperty(strippedState, state, property);
				}
			}

			cir.setReturnValue(Optional.of(strippedState));
		}
	}

	/**
	 * Returns the bark {@link Item} that corresponds to the given block {@link BlockState},
	 * or {@code null} if no matching bark item exists.
	 *
	 * @param blockState the {@link BlockState} of the log being stripped
	 * @return the matching bark {@link Item}, or {@code null} if none
	 */
	@Unique
	private Item getBarkForBlock(BlockState blockState) {
		if (blockState.isIn(BlockTags.OAK_LOGS)) {
			return ModItems.OAK_BARK;
		} else if(blockState.isIn(BlockTags.SPRUCE_LOGS)) {
			return ModItems.SPRUCE_BARK;
		} else if(blockState.isIn(BlockTags.BIRCH_LOGS)) {
			return ModItems.BIRCH_BARK;
		} else if(blockState.isIn(BlockTags.JUNGLE_LOGS)) {
			return ModItems.JUNGLE_BARK;
		} else if(blockState.isIn(BlockTags.ACACIA_LOGS)) {
			return ModItems.ACACIA_BARK;
		} else if(blockState.isIn(BlockTags.DARK_OAK_LOGS)) {
			return ModItems.DARK_OAK_BARK;
		} else if(blockState.isIn(BlockTags.MANGROVE_LOGS)) {
			return ModItems.MANGROVE_BARK;
		} else if(blockState.isIn(BlockTags.CHERRY_LOGS)) {
			return ModItems.CHERRY_BARK;
		} else if(blockState.isIn(BlockTags.BAMBOO_BLOCKS)) {
			return ModItems.BAMBOO_BARK;
		} else if (blockState.isIn(BlockTags.PALE_OAK_LOGS)) {
			return ModItems.PALE_OAK_BARK;
		}else if(blockState.isIn(ModBlockTags.PINE_STRIPPABLE)) {
			return PineBlocks.PINE_BARK;
		} else {
			return null;
		}
	}

	/**
	 * Copies the value of the given {@link Property} from the {@code source} state
	 * to the {@code target} state and returns the updated target state.
	 *
	 * @param <T>      the comparable type of the property value
	 * @param target   the {@link BlockState} to copy the property value into
	 * @param source   the {@link BlockState} to read the property value from
	 * @param property the {@link Property} to copy
	 * @return the updated {@code target} {@link BlockState} with the copied property value
	 */
	@Unique
	private <T extends Comparable<T>> BlockState copyProperty(BlockState target, BlockState source,
			Property<T> property) {
		return target.with(property, source.get(property));
	}
}