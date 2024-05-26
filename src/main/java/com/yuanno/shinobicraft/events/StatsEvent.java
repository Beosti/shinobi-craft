package com.yuanno.shinobicraft.events;

import com.yuanno.shinobicraft.Main;
import com.yuanno.shinobicraft.data.entity.EntityStatsCapability;
import com.yuanno.shinobicraft.data.entity.IEntityStats;
import com.yuanno.shinobicraft.networking.AnbuNetwork;
import com.yuanno.shinobicraft.networking.server.SSyncEntityStatsDataPacket;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MODID)
public class StatsEvent {

    @SubscribeEvent
    public static void setStatsEvent(PlayerEvent.PlayerLoggedInEvent event)
    {
        Player player = event.getEntity();
        if (player.level.isClientSide) // checks if client side; no no no bad boy
            return;

        // happens server side
        IEntityStats entityStats = EntityStatsCapability.get(player);
        entityStats.setMaxTaijutsuExperience(100);
        entityStats.setKenjutsuMaxExperience(100);

        // sends client side for the screen!
        AnbuNetwork.sendTo(new SSyncEntityStatsDataPacket(player), player);
    }
}
