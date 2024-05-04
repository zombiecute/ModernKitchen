package com.zombie_cute.mc.bakingdelight.screen.custom;

import com.mojang.blaze3d.systems.RenderSystem;
import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.entities.OvenBlockEntity;
import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.c2s.play.CustomPayloadC2SPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Objects;

public class OvenScreen extends HandledScreen<OvenScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(Bakingdelight.MOD_ID,
            "textures/gui/oven_gui.png");
    public OvenScreen(OvenScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }
    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        int minX = x + 124;
        int minY = y + 55;
        int maxX = x + 158;
        int maxY = y + 66;
        if (mouseX >= minX && mouseX <= maxX &&
                mouseY >= minY && mouseY <= maxY && button == 0){
            MinecraftClient mc = MinecraftClient.getInstance();
            if (mc.player != null){
                PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
                BlockPos pos = handler.blockEntity.getPos();
                buf.writeBlockPos(pos);
                Objects.requireNonNull(mc.getNetworkHandler()).sendPacket(new CustomPayloadC2SPacket(
                        Identifier.tryParse("bakingdelight:oven_spawn_xp"),buf
                ));
                if (handler.getExperiences() == 0){
                    mc.player.playSound(SoundEvents.BLOCK_DISPENSER_FAIL,1.0f,2.8f);
                } else {
                    mc.player.playSound(SoundEvents.BLOCK_DISPENSER_DISPENSE,1.0f,1.0f);
                }
            }
            ServerPlayNetworking.registerGlobalReceiver(
                    new Identifier(Bakingdelight.MOD_ID, "oven_spawn_xp"),
                    ((server, player, handler1, buf1, responseSender) -> {
                        BlockPos blockPos = buf1.readBlockPos();
                        server.execute(() -> {
                            World world = server.getWorld(player.getWorld().getRegistryKey());
                            if (world != null) {
                                BlockEntity blockEntity = world.getBlockEntity(blockPos);
                                if (blockEntity instanceof OvenBlockEntity entity){
                                    if (entity.getExperience() != 0){
                                        ExperienceOrbEntity xp;
                                        xp = new ExperienceOrbEntity(world,
                                                blockPos.getX(),blockPos.getY() + 1,blockPos.getZ(), entity.getExperience());
                                        world.spawnEntity(xp);
                                        entity.setExperience(0);
                                    }
                                }
                            }
                        });
                    })
            );
            return true;
        } else {
            return super.mouseClicked(mouseX, mouseY, button);
        }
    }
    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0,TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth,backgroundHeight);

        renderProgressArrow(context, x, y);
        renderBurnTime(context, x, y);
        if (mouseX >= x + 124 && mouseX <= x + 158 && mouseY >= y + 55 && mouseY <= y + 66){
            context.drawTexture(TEXTURE, x + 123, y + 54, 0, 195, 36,13);
            if (handler.getExperiences() != 0){
                context.drawTooltip(Objects.requireNonNull(client).textRenderer,Text.translatable(AdvanceFurnaceScreen.TOOLTIP).formatted(Formatting.WHITE),mouseX,mouseY);
            }
        }
        if (handler.getExperiences() <= 9999){
            context.drawText(textRenderer,String.valueOf(handler.getExperiences()),x+125,y+56, 0x82fd64,true);
        } else {
            context.drawText(textRenderer,"9999+",x+125,y+56, 0x82fd64,true);
        }
    }

    private void renderBurnTime(DrawContext context, int x, int y) {
        if (handler.isBurning()){
            int offset = 11 - handler.getScaledBurnTime();
            context.drawTexture(TEXTURE, x + 47, y + 39 + offset,
                    0, 167 + offset, 18, handler.getScaledBurnTime());
        }
    }

    private void renderProgressArrow(DrawContext context, int x, int y) {
        if (handler.isCrafting()){
            context.drawTexture(TEXTURE, x + 95, y + 21, 0, 178, handler.getScaledProgress(), 17);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
