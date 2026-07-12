package foksware.wtf.client.Events.impl;

import foksware.wtf.client.Events.Event;
import net.minecraft.network.protocol.Packet;
import net.minecraft.server.packs.repository.Pack;

public class PacketEvent extends Event {
    public Packet<?> packet;

    public PacketEvent(Packet<?> packet) {
        this.packet = packet;
    }
}
