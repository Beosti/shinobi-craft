package com.yuanno.shinobicraft.init;

import com.yuanno.shinobicraft.Main;
import com.yuanno.shinobicraft.client.screens.PlayerStatsScreen;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

/**
 * class that handles keybinds
 * also registers keybinds
 */
public class ModKeyBindings {

    // make the key that does something
    public static KeyMapping playerScreen = new KeyMapping("key.shinobicraft.stats", GLFW.GLFW_KEY_Y, "key.categories.shinobicraft");

    // say what the key does when pressed
    @Mod.EventBusSubscriber(modid = Main.MODID, value = Dist.CLIENT)
    public static class Registration {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event)
        {
            if (playerScreen.consumeClick() && Minecraft.getInstance().screen == null)
                PlayerStatsScreen.open();
        }
    }

    // register the key
    @Mod.EventBusSubscriber(modid = Main.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void registerKeyBindings(RegisterKeyMappingsEvent event)
        {
            event.register(playerScreen);
        }
    }
}
