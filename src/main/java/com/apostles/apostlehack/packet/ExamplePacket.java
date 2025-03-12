package com.apostles.apostlehack.packet;

import io.netty.buffer.Unpooled;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.CustomPayload;

public class ExamplePacket implements CustomPayload {
    private final PacketByteBuf buf;

    public ExamplePacket(String data) {
        this.buf = new PacketByteBuf(Unpooled.buffer());
        this.buf.writeString(data);
    }

    public PacketByteBuf getBuf() {
        return buf;
    }

    @Override
    public Id<? extends CustomPayload> getId() {
        return null;
    }
}
