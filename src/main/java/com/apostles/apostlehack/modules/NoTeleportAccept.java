package com.apostles.apostlehack.modules;

import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;

import static com.apostles.apostlehack.ApostleHack.CATEGORY;

public class NoTeleportAccept extends Module {
    public NoTeleportAccept() {
        super(CATEGORY, "no-teleport-accept", "Ignores all Accept Teleportation packets.");
    }

    @EventHandler
    private void onReceivePacket(PacketEvent.Receive event) {
        if (event.packet instanceof PlayerPositionLookS2CPacket) {
            event.cancel(); // Cancels the packet to prevent teleportation
        }
    }
}
