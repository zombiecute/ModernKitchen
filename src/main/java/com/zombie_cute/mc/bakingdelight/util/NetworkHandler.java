package com.zombie_cute.mc.bakingdelight.util;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.math.BlockPos;

public class NetworkHandler {
    public static void sendUpdateInventoryPacket(BlockPos pos, ItemStack itemStack) {
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        buf.writeBlockPos(pos);
        buf.writeItemStack(itemStack);
        ClientPlayNetworking.send(Bakingdelight.UPDATE_INVENTORY_PACKET_ID, buf);
    }
    public static void sendSpawnXPPacket(BlockPos pos) {
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        buf.writeBlockPos(pos);
        ClientPlayNetworking.send(Bakingdelight.SPAWN_XP_PACKET_ID, buf);
    }
    public static void sendChangeBlockEntityDataPacket(BlockPos pos, int[] array) {
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        buf.writeBlockPos(pos);
        buf.writeIntArray(array);
        ClientPlayNetworking.send(Bakingdelight.CHANGE_BLOCK_ENTITY_DATA_PACKET_ID, buf);
    }
}
