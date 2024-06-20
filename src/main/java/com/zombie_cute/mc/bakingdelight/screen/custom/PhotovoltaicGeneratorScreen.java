package com.zombie_cute.mc.bakingdelight.screen.custom;

import com.mojang.blaze3d.systems.RenderSystem;
import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.entities.PhotovoltaicGeneratorBlockEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.Objects;

public class PhotovoltaicGeneratorScreen extends HandledScreen<PhotovoltaicGeneratorScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(Bakingdelight.MOD_ID,
            "textures/gui/photovoltaic_generator_gui.png");
    public PhotovoltaicGeneratorScreen(PhotovoltaicGeneratorScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.isHelpOpen = false;
    }
    private boolean isHelpOpen;
    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }
    public static final String GREEN_TIP_1 = "bakingdelight.tooltips.green_tip_1";
    public static final String GREEN_TIP_2 = "bakingdelight.tooltips.green_tip_2";
    public static final String GREEN_TIP_3 = "bakingdelight.tooltips.green_tip_3";
    public static final String YELLOW_TIP_1 = "bakingdelight.tooltips.yellow_tip_1";
    public static final String YELLOW_TIP_2 = "bakingdelight.tooltips.yellow_tip_2";
    public static final String YELLOW_TIP_3 = "bakingdelight.tooltips.yellow_tip_3";
    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0,TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth,backgroundHeight);

        renderYText(context, x, y);
        renderPowerLevel(context,x,y);
        renderDayNightIcon(context, x, y);
        if (handler.isWorking()){
            context.drawTexture(TEXTURE, x + 148,y + 14,192,0,12,12);
        }
        if (handler.isInSlowMode()){
            context.drawTexture(TEXTURE, x + 135,y + 14,192,12,12,12);
        }
        if (mouseX >= x + 17 && mouseX <= x + 32 && mouseY >= y + 15 && mouseY <= y + 67){
            context.drawTexture(TEXTURE,mouseX+3,mouseY+6,192,24,45,13);
            context.drawText(textRenderer,String.valueOf(handler.getPower()),
                    mouseX+6,mouseY+9,0xffffff,false);
        }
        if (this.isHelpOpen){
            context.drawTexture(TEXTURE,x, y-70,0,166,176,86);
            if (mouseX >= x + 161 && mouseX <= x + 171 && mouseY >= y - 66 && mouseY <= y - 56){
                context.drawTexture(TEXTURE,x+161,y-66,176,171,11,11);
            }
            context.drawText(textRenderer,Text.translatable(GREEN_TIP_1),
                    x+19,y-64,0xffffff,true);
            context.drawText(textRenderer,Text.translatable(GREEN_TIP_2),
                    x+19,y-54,0xffffff,true);
            context.drawText(textRenderer,Text.translatable(GREEN_TIP_3),
                    x+19,y-44,0xffffff,true);
            context.drawText(textRenderer,Text.translatable(YELLOW_TIP_1),
                    x+19,y-32,0xffffff,true);
            context.drawText(textRenderer,Text.translatable(YELLOW_TIP_2),
                    x+19,y-22,0xffffff,true);
            context.drawText(textRenderer,Text.translatable(YELLOW_TIP_3),
                    x+19,y-12,0xffffff,true);
        } else {
            if (mouseX >= x + 161 && mouseX <= x + 171 && mouseY >= y + 5 && mouseY <= y + 15){
                context.drawTexture(TEXTURE,x+161,y+5,192,37,11,11);
            }
        }
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (this.isHelpOpen){
            if (mouseX >= x + 161 && mouseX <= x + 171 && mouseY >= y - 66 && mouseY <= y - 56 && button == 0){
                this.isHelpOpen = false;
                MinecraftClient.getInstance().getSoundManager()
                        .play(PositionedSoundInstance.master(SoundEvents.UI_BUTTON_CLICK, 1.0F));
                return true;
            }
        } else {
            if (mouseX >= x + 161 && mouseX <= x + 171 && mouseY >= y + 5 && mouseY <= y + 15 && button == 0){
                this.isHelpOpen = true;
                MinecraftClient.getInstance().getSoundManager()
                        .play(PositionedSoundInstance.master(SoundEvents.UI_BUTTON_CLICK, 1.0F));
                return true;
            }
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    private void renderYText(DrawContext context, int x, int y) {
        if (handler.getYValue() > 0){
            context.drawText(textRenderer,String.valueOf(handler.getYValue()), x + 70, y + 57,0xffffff,true);
        } else {
            context.drawText(textRenderer,String.valueOf(handler.getYValue()), x + 70, y + 57,0xff0000,true);
        }
    }

    private void renderDayNightIcon(DrawContext context, int x, int y) {
        if (!Objects.requireNonNull(handler.blockEntity.getWorld()).getDimension().hasFixedTime()){
            if (PhotovoltaicGeneratorBlockEntity.isEarlyMorningOrTwilight(Objects.requireNonNull(handler.blockEntity.getWorld())) &&
                    handler.blockEntity.getWorld().isThundering()){
                context.drawTexture(TEXTURE, x + 38, y + 54,204,67,14,14);
            } else if (PhotovoltaicGeneratorBlockEntity.isEarlyMorningOrTwilight(Objects.requireNonNull(handler.blockEntity.getWorld())) &&
                    handler.blockEntity.getWorld().isRaining()) {
                context.drawTexture(TEXTURE, x + 38, y + 54,190,67,14,14);
            } else if (PhotovoltaicGeneratorBlockEntity.isEarlyMorningOrTwilight(Objects.requireNonNull(handler.blockEntity.getWorld()))) {
                context.drawTexture(TEXTURE, x + 38, y + 54,176,67,14,14);
            } else if ((PhotovoltaicGeneratorBlockEntity.isMorningOrAfternoon(Objects.requireNonNull(handler.blockEntity.getWorld())) ||
                    PhotovoltaicGeneratorBlockEntity.isNoon(Objects.requireNonNull(handler.blockEntity.getWorld())))
                    && handler.blockEntity.getWorld().isThundering()){
                context.drawTexture(TEXTURE, x + 38, y + 54,204,53,14,14);
            } else if ((PhotovoltaicGeneratorBlockEntity.isMorningOrAfternoon(Objects.requireNonNull(handler.blockEntity.getWorld())) ||
                    PhotovoltaicGeneratorBlockEntity.isNoon(Objects.requireNonNull(handler.blockEntity.getWorld())))
                    && handler.blockEntity.getWorld().isRaining()){
                context.drawTexture(TEXTURE, x + 38, y + 54,190,53,14,14);
            } else if ((PhotovoltaicGeneratorBlockEntity.isMorningOrAfternoon(Objects.requireNonNull(handler.blockEntity.getWorld())) ||
                    PhotovoltaicGeneratorBlockEntity.isNoon(Objects.requireNonNull(handler.blockEntity.getWorld())))){
                context.drawTexture(TEXTURE, x + 38, y + 54,176,53,14,14);
            } else if (handler.blockEntity.getWorld().isThundering()) {
                context.drawTexture(TEXTURE, x + 38, y + 54,204,81,14,14);
            } else if (handler.blockEntity.getWorld().isRaining()) {
                context.drawTexture(TEXTURE, x + 38, y + 54,190,81,14,14);
            } else {
                context.drawTexture(TEXTURE, x + 38, y + 54,176,81,14,14);
            }
        }
    }

    @Environment(EnvType.CLIENT)
    private void renderPowerLevel(DrawContext context, int x, int y) {
        if (handler.getPower() != 0){
            int offset = 53 - handler.getScaledProgress();
            context.drawTexture(TEXTURE, x + 17, y + 15 + offset, 176, offset,16, handler.getScaledProgress());
        }
    }
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
