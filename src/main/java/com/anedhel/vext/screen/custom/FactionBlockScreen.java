package com.anedhel.vext.screen.custom;

import com.anedhel.vext.VExtMod;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FactionBlockScreen extends HandledScreen<FactionBlockScreenHandler> {
    private static final Identifier TEXTURE = Identifier.of(VExtMod.MOD_ID,"textures/gui/container/citybuilder/factionblock.png");

    public FactionBlockScreen(FactionBlockScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);

        backgroundWidth = 176;
        backgroundHeight = 222;

        playerInventoryTitleY = this.backgroundHeight - 94;
    }

    private TextFieldWidget nameField;
    private boolean needsName;


    /**@Override public boolean keyPressed(int keyCode, int scanCode, int modifiers, long timestamp) {
        if (needsName && nameField != null && nameField.isFocused()) {
            if (keyCode == GLFW.GLFW_KEY_ENTER) {
                String text = nameField.getText();
                sendNameToServer(text);
                needsName = false;
                nameField.setVisible(false);
                return true;
            }
        }
        return super.keyPressed(keyCode, scanCode, modifiers, timestamp);
    }*/

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
        super.render(context, mouseX, mouseY, deltaTicks);
        this.drawMouseoverTooltip(context, mouseX, mouseY );
        if (needsName) {
            nameField.render(context, mouseX, mouseY, deltaTicks);
        }
    }


    @Override
    protected void drawBackground(DrawContext context, float deltaTicks, int mouseX, int mouseY) {
        int i = this.x;
        int j = this.y;
        context.drawTexture(RenderPipelines.GUI_TEXTURED, TEXTURE, i, j, 0, 0, this.backgroundWidth, this.backgroundHeight, 256, 256);
    }
}
