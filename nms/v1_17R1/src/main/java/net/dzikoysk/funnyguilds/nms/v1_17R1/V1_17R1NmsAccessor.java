package net.dzikoysk.funnyguilds.nms.v1_17R1;

import net.dzikoysk.funnyguilds.nms.api.NmsAccessor;
import net.dzikoysk.funnyguilds.nms.api.packet.PacketRegistry;
import net.dzikoysk.funnyguilds.nms.api.playerlist.PlayerListAccessor;
import net.dzikoysk.funnyguilds.nms.v1_17R1.playerlist.V1_17R1PlayerListAccessor;

public class V1_17R1NmsAccessor implements NmsAccessor {
    @Override
    public PacketRegistry getPacketRegistry() {
        return null;
    }

    @Override
    public PlayerListAccessor getPlayerListAccessor() {
        return new V1_17R1PlayerListAccessor();
    }
}