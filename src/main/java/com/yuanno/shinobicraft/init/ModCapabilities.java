package com.yuanno.shinobicraft.init;

import com.yuanno.shinobicraft.Main;
import com.yuanno.shinobicraft.data.entity.EntityStatsCapability;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MODID)
public class ModCapabilities {

    @SubscribeEvent
    public static void register(RegisterCapabilitiesEvent event)
    {
        event.register(EntityStatsCapability.class);
    }

    @SubscribeEvent
    public static void attachCapabilities(AttachCapabilitiesEvent<Entity> event)
    {
        if (event.getObject() == null)
            return;


        if (event.getObject() instanceof LivingEntity)
        {
            event.addCapability(new ResourceLocation(Main.MODID, "entity_stats"), new EntityStatsCapability());
        }
    }
}
