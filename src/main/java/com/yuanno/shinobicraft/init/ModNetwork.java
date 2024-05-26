package com.yuanno.shinobicraft.init;

import com.yuanno.shinobicraft.networking.AnbuNetwork;
import com.yuanno.shinobicraft.networking.server.SSyncEntityStatsDataPacket;

public class ModNetwork {

    public static void init()
    {
        AnbuNetwork.registerPacket(SSyncEntityStatsDataPacket.class, SSyncEntityStatsDataPacket::encode, SSyncEntityStatsDataPacket::decode, SSyncEntityStatsDataPacket::handle);
    }
}
