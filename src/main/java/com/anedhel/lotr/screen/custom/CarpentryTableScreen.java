package com.anedhel.lotr.screen.custom;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.cursor.StandardCursors;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.StonecuttingRecipe;
import net.minecraft.recipe.display.CuttingRecipeDisplay;
import net.minecraft.recipe.display.SlotDisplay;
import net.minecraft.recipe.display.SlotDisplayContexts;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.context.ContextParameterMap;
import net.minecraft.util.math.MathHelper;

public class CarpentryTableScreen extends HandledScreen<CarpentryTableScreenHandler> {

	private static final Identifier SCROLLER_TEXTURE = Identifier.ofVanilla("container/stonecutter/scroller");
	private static final Identifier SCROLLER_DISABLED_TEXTURE = Identifier.ofVanilla("container/stonecutter/scroller_disabled");
	private static final Identifier RECIPE_SELECTED_TEXTURE = Identifier.ofVanilla("container/stonecutter/recipe_selected");
	private static final Identifier RECIPE_HIGHLIGHTED_TEXTURE = Identifier.ofVanilla("container/stonecutter/recipe_highlighted");
	private static final Identifier RECIPE_TEXTURE = Identifier.ofVanilla("container/stonecutter/recipe");
	private static final Identifier TEXTURE = Identifier.ofVanilla("textures/gui/container/stonecutter.png");
	private static final int SCROLLBAR_WIDTH = 12;
	private static final int SCROLLBAR_HEIGHT = 15;
	private static final int RECIPE_LIST_COLUMNS = 4;
	private static final int RECIPE_LIST_ROWS = 3;
	private static final int RECIPE_ENTRY_WIDTH = 16;
	private static final int RECIPE_ENTRY_HEIGHT = 18;
	private static final int SCROLLBAR_AREA_HEIGHT = 54;
	private static final int RECIPE_LIST_OFFSET_X = 52;
	private static final int RECIPE_LIST_OFFSET_Y = 14;
	private float scrollAmount;
	private boolean mouseClicked;
	private int scrollOffset;
	private boolean canCraft;

	public CarpentryTableScreen(CarpentryTableScreenHandler handler, PlayerInventory inventory, Text title) {
		super(handler, inventory, title);
		handler.setContentsChangedListener(this::onInventoryChange);
		this.titleY--;
	}

	@Override
	public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
		super.render(context, mouseX, mouseY, deltaTicks);
		this.drawMouseoverTooltip(context, mouseX, mouseY);
	}

	@Override
	protected void drawBackground(DrawContext context, float deltaTicks, int mouseX, int mouseY) {
		int i = this.x;
		int j = this.y;
		context.drawTexture(RenderPipelines.GUI_TEXTURED, TEXTURE, i, j, 0.0F, 0.0F, this.backgroundWidth, this.backgroundHeight, 256, 256);
		int k = (int)(41.0F * this.scrollAmount);
		Identifier identifier = this.shouldScroll() ? SCROLLER_TEXTURE : SCROLLER_DISABLED_TEXTURE;
		int l = i + 119;
		int m = j + 15 + k;
		context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, identifier, l, m, 12, 15);
		if (mouseX >= l && mouseX < l + 12 && mouseY >= m && mouseY < m + 15) {
			context.setCursor(this.mouseClicked ? StandardCursors.RESIZE_NS : StandardCursors.POINTING_HAND);
		}

		int n = this.x + 52;
		int o = this.y + 14;
		int p = this.scrollOffset + 12;
		this.renderRecipeBackground(context, mouseX, mouseY, n, o, p);
		this.renderRecipeIcons(context, n, o, p);
	}

	@Override
	protected void drawMouseoverTooltip(DrawContext context, int x, int y) {
		super.drawMouseoverTooltip(context, x, y);
		if (this.canCraft) {
			int i = this.x + 52;
			int j = this.y + 14;
			int k = this.scrollOffset + 12;
			CuttingRecipeDisplay.Grouping<StonecuttingRecipe> grouping = this.handler.getAvailableRecipes();

			for (int l = this.scrollOffset; l < k && l < grouping.size(); l++) {
				int m = l - this.scrollOffset;
				int n = i + m % 4 * 16;
				int o = j + m / 4 * 18 + 2;
				if (x >= n && x < n + 16 && y >= o && y < o + 18) {
					ContextParameterMap contextParameterMap = SlotDisplayContexts.createParameters(this.client.world);
					SlotDisplay slotDisplay = ((CuttingRecipeDisplay.GroupEntry)grouping.entries().get(l)).recipe().optionDisplay();
					context.drawItemTooltip(this.textRenderer, slotDisplay.getFirst(contextParameterMap), x, y);
				}
			}
		}
	}

	private void renderRecipeBackground(DrawContext context, int mouseX, int mouseY, int x, int y, int scrollOffset) {
		for (int i = this.scrollOffset; i < scrollOffset && i < this.handler.getAvailableRecipeCount(); i++) {
			int j = i - this.scrollOffset;
			int k = x + j % 4 * 16;
			int l = j / 4;
			int m = y + l * 18 + 2;
			Identifier identifier;
			if (i == this.handler.getSelectedRecipe()) {
				identifier = RECIPE_SELECTED_TEXTURE;
			} else if (mouseX >= k && mouseY >= m && mouseX < k + 16 && mouseY < m + 18) {
				identifier = RECIPE_HIGHLIGHTED_TEXTURE;
			} else {
				identifier = RECIPE_TEXTURE;
			}

			int n = m - 1;
			context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, identifier, k, n, 16, 18);
			if (mouseX >= k && mouseY >= n && mouseX < k + 16 && mouseY < n + 18) {
				context.setCursor(StandardCursors.POINTING_HAND);
			}
		}
	}

	private void renderRecipeIcons(DrawContext context, int x, int y, int scrollOffset) {
		CuttingRecipeDisplay.Grouping<StonecuttingRecipe> grouping = this.handler.getAvailableRecipes();
		ContextParameterMap contextParameterMap = SlotDisplayContexts.createParameters(this.client.world);

		for (int i = this.scrollOffset; i < scrollOffset && i < grouping.size(); i++) {
			int j = i - this.scrollOffset;
			int k = x + j % 4 * 16;
			int l = j / 4;
			int m = y + l * 18 + 2;
			SlotDisplay slotDisplay = ((CuttingRecipeDisplay.GroupEntry)grouping.entries().get(i)).recipe().optionDisplay();
			context.drawItem(slotDisplay.getFirst(contextParameterMap), k, m);
		}
	}

	@Override
	public boolean mouseClicked(Click click, boolean doubled) {
		if (this.canCraft) {
			int i = this.x + 52;
			int j = this.y + 14;
			int k = this.scrollOffset + 12;

			for (int l = this.scrollOffset; l < k; l++) {
				int m = l - this.scrollOffset;
				double d = click.x() - (i + m % 4 * 16);
				double e = click.y() - (j + m / 4 * 18);
				if (d >= 0.0 && e >= 0.0 && d < 16.0 && e < 18.0 && this.handler.onButtonClick(this.client.player, l)) {
					MinecraftClient.getInstance().getSoundManager().play(
							PositionedSoundInstance.master(SoundEvents.UI_STONECUTTER_SELECT_RECIPE, 1.0F));
					this.client.interactionManager.clickButton(this.handler.syncId, l);
					return true;
				}
			}

			i = this.x + 119;
			j = this.y + 9;
			if (click.x() >= i && click.x() < i + 12 && click.y() >= j && click.y() < j + 54) {
				this.mouseClicked = true;
			}
		}

		return super.mouseClicked(click, doubled);
	}

	@Override
	public boolean mouseDragged(Click click, double offsetX, double offsetY) {
		if (this.mouseClicked && this.shouldScroll()) {
			int i = this.y + 14;
			int j = i + 54;
			this.scrollAmount = ((float)click.y() - i - 7.5F) / (j - i - 15.0F);
			this.scrollAmount = MathHelper.clamp(this.scrollAmount, 0.0F, 1.0F);
			this.scrollOffset = (int)(this.scrollAmount * this.getMaxScroll() + 0.5) * 4;
			return true;
		} else {
			return super.mouseDragged(click, offsetX, offsetY);
		}
	}

	@Override
	public boolean mouseReleased(Click click) {
		this.mouseClicked = false;
		return super.mouseReleased(click);
	}

	@Override
	public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
		if (super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount)) {
			return true;
		} else {
			if (this.shouldScroll()) {
				int i = this.getMaxScroll();
				float f = (float)verticalAmount / i;
				this.scrollAmount = MathHelper.clamp(this.scrollAmount - f, 0.0F, 1.0F);
				this.scrollOffset = (int)(this.scrollAmount * i + 0.5) * 4;
			}

			return true;
		}
	}

	private boolean shouldScroll() {
		return this.canCraft && this.handler.getAvailableRecipeCount() > 12;
	}

	protected int getMaxScroll() {
		return (this.handler.getAvailableRecipeCount() + 4 - 1) / 4 - 3;
	}

	private void onInventoryChange() {
		this.canCraft = this.handler.canCraft();
		if (!this.canCraft) {
			this.scrollAmount = 0.0F;
			this.scrollOffset = 0;
		}
	}
}
