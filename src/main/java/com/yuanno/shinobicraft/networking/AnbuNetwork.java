package com.yuanno.shinobicraft.networking;

import com.yuanno.shinobicraft.Main;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Handles all the networking with helper methods
 */
public class AnbuNetwork {

    private static int packet = 0;
    private static final String PROTOCOL_VERSION = Integer.toString(1);
    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(Main.MODID, "main_channel"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    // NetworkRegistry.ChannelBuilder.named(new ResourceLocation(ModMain.PROJECT_ID,
    // "main_channel")).clientAcceptedVersions(PROTOCOL_VERSION::equals).serverAcceptedVersions(PROTOCOL_VERSION::equals).networkProtocolVersion(()
    // -> PROTOCOL_VERSION).simpleChannel();

    public static <MSG> void registerPacket(Class<MSG> messageType, BiConsumer<MSG, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, MSG> decoder, BiConsumer<MSG, Supplier<NetworkEvent.Context>> messageConsumer) {
        INSTANCE.registerMessage(packet++, messageType, encoder, decoder, messageConsumer);
    }

    public static <MSG> void sendToServer(MSG msg) {
        INSTANCE.sendToServer(msg);
    }

    public static <MSG> void sendTo(MSG msg, Player player) {
        if (!(player instanceof ServerPlayer)) {
            return;
        }

        INSTANCE.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) player), msg);
    }

    public static <MSG> void sendToAll(MSG msg) {
        INSTANCE.send(PacketDistributor.ALL.noArg(), msg);
    }

    public static <MSG> void sendToAllTracking(MSG msg, LivingEntity tracked) {
        INSTANCE.send(PacketDistributor.TRACKING_ENTITY.with(() -> tracked), msg);
    }

    public static <MSG> void sendToAllTrackingAndSelf(MSG msg, LivingEntity tracked) {
        INSTANCE.send(PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> tracked), msg);
    }

    public static <MSG> void sendToAllAround(MSG msg, Entity sender) {
        sendToAllAroundDistance(msg, sender.level, sender.position(), 256);
    }

    public static <MSG> void sendToAllAroundDistance(MSG msg, Level world, Vec3 pivot, int distance) {
        INSTANCE.send(PacketDistributor.NEAR.with(() -> new PacketDistributor.TargetPoint(pivot.x(), pivot.y(), pivot.z(), distance, world.dimension())), msg);
    }
}
