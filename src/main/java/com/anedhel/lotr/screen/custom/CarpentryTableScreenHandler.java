/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.screen.custom;

import com.anedhel.lotr.LotRMEMod;
import com.anedhel.lotr.recipe.CarpentryRecipe;
import com.anedhel.lotr.recipe.CarpentryRecipeDisplay;
import com.anedhel.lotr.recipe.ModRecipes;
import com.anedhel.lotr.screen.ModScreenHandlers;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.display.SlotDisplay;
import net.minecraft.recipe.input.SingleStackRecipeInput;
import net.minecraft.screen.*;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Server-side screen handler for the carpentry table GUI.
 * <p>
 * This class manages the carpentry table's inventory, recipe selection,
 * and crafting logic. It handles player interactions and synchronizes
 * the GUI state between server and client.
 * ToDo: Check all JavaDocs
 *
 * @author Moritz Rohleder
 * @see com.anedhel.lotr.screen.custom.CarpentryTableScreen
 * @see com.anedhel.lotr.block.custom.CarpentryTable
 * @since 0.1.0
 */
public class CarpentryTableScreenHandler extends ScreenHandler {

	public static final int INPUT_ID = 0;
	public static final int OUTPUT_ID = 1;
	private static final int INVENTORY_START = 2;
	private static final int INVENTORY_END = 29;
	private static final int OUTPUT_START = 29;
	private static final int OUTPUT_END = 38;
	private final ScreenHandlerContext context;
	final Property selectedRecipe = Property.create();
	private final World world;
	private CarpentryRecipeDisplay.Grouping<CarpentryRecipe> availableRecipes = CarpentryRecipeDisplay.Grouping.empty();
	private ItemStack inputStack = ItemStack.EMPTY;
	long lastTakeTime;
	final Slot inputSlot;
	final Slot outputSlot;
	Runnable contentsChangedListener = () -> {};
	public final Inventory input = new SimpleInventory(1) {
		@Override
		public void markDirty() {
			super.markDirty();
			CarpentryTableScreenHandler.this.onContentChanged(this);
			CarpentryTableScreenHandler.this.contentsChangedListener.run();
		}
	};
	final CraftingResultInventory output = new CraftingResultInventory();

	public CarpentryTableScreenHandler(int syncId, PlayerInventory playerInventory) {
		this(syncId, playerInventory, ScreenHandlerContext.EMPTY);
	}

	public CarpentryTableScreenHandler(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
		super(ModScreenHandlers.CARPENTRY_TABLE_SCREEN_HANDLER, syncId);
		this.context = context;
		this.world = playerInventory.player.getEntityWorld();
		this.inputSlot = this.addSlot(new Slot(this.input, INPUT_ID, 20, 33));
		this.outputSlot = this.addSlot(new Slot(this.output, OUTPUT_ID, 143, 33) {
			@Override
			public boolean canInsert(ItemStack stack) {
				return false;
			}

			@Override
			public void onTakeItem(PlayerEntity player, ItemStack stack) {
				stack.onCraftByPlayer(player, stack.getCount());
				CarpentryTableScreenHandler.this.output.unlockLastRecipe(player, this.getInputStacks());
				ItemStack itemStack = CarpentryTableScreenHandler.this.inputSlot.takeStack(1);
				if(!itemStack.isEmpty()) {
					CarpentryTableScreenHandler.this.populateResult(CarpentryTableScreenHandler.this.selectedRecipe.get());
				}
				context.run((world, pos) -> {
					long l = world.getTime();
					if (CarpentryTableScreenHandler.this.lastTakeTime != l) {
						world.playSound(null, pos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 1.0F, 1.0F);
						CarpentryTableScreenHandler.this.lastTakeTime = l;
					}
				});
				super.onTakeItem(player, stack);
			}

			private List<ItemStack> getInputStacks() {
				return List.of(CarpentryTableScreenHandler.this.inputSlot.getStack());
			}
		});
		this.addPlayerSlots(playerInventory, 8, 84);
		this.addProperty(this.selectedRecipe);
	}

	public int getSelectedRecipe() {
		return this.selectedRecipe.get();
	}

	public CarpentryRecipeDisplay.Grouping<CarpentryRecipe> getAvailableRecipes() {
		return this.availableRecipes;
	}

	public int getAvailableRecipeCount() {
		return this.availableRecipes.size();
	}

	public boolean canCraft() {
		return this.inputSlot.hasStack() && !this.availableRecipes.isEmpty();
	}

	@Override
	public boolean canUse(PlayerEntity player) {
		return canUse(this.context, player, Blocks.CRAFTING_TABLE);
	}

	@Override
	public boolean onButtonClick(PlayerEntity player, int id) {
		if (this.selectedRecipe.get() == id) {
			return false;
		} else {
			if (this.isInBounds(id)) {
				this.selectedRecipe.set(id);
				this.populateResult(id);
			}

			return true;
		}
	}

	private boolean isInBounds(int id) {
		return id >= 0 && id < this.availableRecipes.size();
	}

	@Override
	public void onContentChanged(Inventory inventory) {
		ItemStack itemStack = this.inputSlot.getStack();
		if (!itemStack.isOf(this.inputStack.getItem())) {
			this.inputStack = itemStack.copy();
			this.updateInput(itemStack);
			LotRMEMod.LOGGER.info("On Content Changed recipes found: " + this.availableRecipes.size());
		}
	}

	private List<RecipeEntry<CarpentryRecipe>> findMatches(ItemStack stack) {
		List<RecipeEntry<CarpentryRecipe>> result = new ArrayList<>();
		for (RecipeEntry<CarpentryRecipe> entry : this.world.getRecipeManager().getSynchronizedRecipes().getAllOfType(
				ModRecipes.CARPENTRY_RECIPE_RECIPE_TYPE)) {
			if (entry.value() instanceof CarpentryRecipe recipe && recipe.ingredient().test(stack)) {
				result.add(entry);
			}
		}
		return result;
	}

	private void updateInput(ItemStack stack) {
		this.selectedRecipe.set(-1);
		this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY);
		if (!stack.isEmpty()) {
			List<RecipeEntry<CarpentryRecipe>> matches = findMatches(stack);
			List<CarpentryRecipeDisplay.GroupEntry<CarpentryRecipe>> entries = new ArrayList<>();
			for (RecipeEntry<CarpentryRecipe> entry : matches) {
				CarpentryRecipe recipe = entry.value();
				SlotDisplay option = recipe.createResultDisplay();
				entries.add(new CarpentryRecipeDisplay.GroupEntry<>(
						new CarpentryRecipeDisplay.RecipeOption<>(option, Optional.of(entry))
				));
			}
			this.availableRecipes = new CarpentryRecipeDisplay.Grouping<>(entries);
		} else {
			this.availableRecipes = CarpentryRecipeDisplay.Grouping.empty();
		}
	}

	void populateResult(int selectedId) {
		Optional<RecipeEntry<CarpentryRecipe>> optional;
		if (!this.availableRecipes.isEmpty() && this.isInBounds(selectedId)) {
			CarpentryRecipeDisplay.GroupEntry<CarpentryRecipe> groupEntry = this.availableRecipes
					.entries()
					.get(selectedId);
			optional = groupEntry.recipe().recipe();
		} else {
			optional = Optional.empty();
		}

		optional.ifPresentOrElse(
				recipe -> {
					this.output.setLastRecipe(recipe);
					this.outputSlot
							.setStackNoCallbacks(
									recipe.value().craft(new SingleStackRecipeInput(this.input.getStack(0)), this.world.getRegistryManager()));
				},
				() -> {
					this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY);
					this.output.setLastRecipe(null);
				}
		);
		this.sendContentUpdates();
	}

	@Override
	public ScreenHandlerType<?> getType() {
		return ModScreenHandlers.CARPENTRY_TABLE_SCREEN_HANDLER;
	}

	public void setContentsChangedListener(Runnable contentsChangedListener) {
		this.contentsChangedListener = contentsChangedListener;
	}

	@Override
	public boolean canInsertIntoSlot(ItemStack stack, Slot slot) {
		return slot.inventory != this.output && super.canInsertIntoSlot(stack, slot);
	}

	@Override
	public ItemStack quickMove(PlayerEntity player, int slot) {
		ItemStack itemStack = ItemStack.EMPTY;
		Slot slot2 = this.slots.get(slot);
		if (slot2 != null && slot2.hasStack()) {
			ItemStack itemStack2 = slot2.getStack();
			Item item = itemStack2.getItem();
			itemStack = itemStack2.copy();
			if (slot == 1) {
				item.onCraftByPlayer(itemStack2, player);
				if (!this.insertItem(itemStack2, 2, 38, true)) {
					return ItemStack.EMPTY;
				}

				slot2.onQuickTransfer(itemStack2, itemStack);
			} else if (slot == 0) {
				if (!this.insertItem(itemStack2, 2, 38, false)) {
					return ItemStack.EMPTY;
				}
			} else {
				boolean isCarpentryInput = !findMatches(itemStack2).isEmpty();
				if (isCarpentryInput) {
					if (!this.insertItem(itemStack2, 0, 1, false)) {
						return ItemStack.EMPTY;
					}
				} else if (slot >= 2 && slot < 29) {
					if (!this.insertItem(itemStack2, 29, 38, false)) {
						return ItemStack.EMPTY;
					}
				} else if (slot >= 29 && slot < 38 && !this.insertItem(itemStack2, 2, 29, false)) {
					return ItemStack.EMPTY;
				}
			}

			if (itemStack2.isEmpty()) {
				slot2.setStack(ItemStack.EMPTY);
			}

			slot2.markDirty();
			if (itemStack2.getCount() == itemStack.getCount()) {
				return ItemStack.EMPTY;
			}

			slot2.onTakeItem(player, itemStack2);
			if (slot == 1) {
				player.dropItem(itemStack2, false);
			}

			this.sendContentUpdates();
		}

		return itemStack;
	}

	@Override
	public void onClosed(PlayerEntity player) {
		super.onClosed(player);
		this.output.removeStack(1);
		this.context.run((world, pos) -> this.dropInventory(player, this.input));
	}
}
