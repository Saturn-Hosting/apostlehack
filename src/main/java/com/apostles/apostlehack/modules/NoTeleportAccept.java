package com.apostles.apostlehack.modules;

import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;

import static com.apostles.apostlehack.ApostleHack.CATEGORY;

public class NoTeleportAccept extends Module {
    public NoTeleportAccept() {
        super(CATEGORY, "no-teleport-accept", "Ignores all Accept Teleportation packets.");
    }

    @EventHandler
    private void onSendPacket(PacketEvent.Send event) {
        if (event.packet instanceof TeleportConfirmC2SPacket) {
            event.cancel(); // Cancels the packet to prevent teleportation
        }
    }
}
