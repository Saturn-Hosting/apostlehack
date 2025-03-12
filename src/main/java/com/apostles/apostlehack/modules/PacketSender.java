package com.apostles.apostlehack.modules;

import meteordevelopment.meteorclient.settings.*;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket;
import net.minecraft.network.packet.c2s.login.LoginHelloC2SPacket;
import net.minecraft.util.Identifier;
import io.netty.buffer.Unpooled;
import net.minecraft.network.PacketByteBuf;
import com.apostles.apostlehack.ApostleHack;

import java.util.UUID;

public class PacketSender extends Module {
    private final SettingGroup sgGeneral = this.settings.getDefaultGroup();

    public PacketSender() {
        super(ApostleHack.CATEGORY, "packet-sender", "A module to send custom packets to the server.");
    }

    @EventHandler
    public void onActivate() {
        ClientPlayNetworkHandler networkHandler = mc.getNetworkHandler();

        LoginHelloC2SPacket login = new LoginHelloC2SPacket("azedev", UUID.randomUUID());

        networkHandler.sendPacket(login);
    }
}
