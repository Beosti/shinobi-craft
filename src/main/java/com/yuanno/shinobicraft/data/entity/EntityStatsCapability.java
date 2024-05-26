package com.yuanno.shinobicraft.data.entity;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class EntityStatsCapability implements ICapabilitySerializable<CompoundTag> {

    public static final Capability<IEntityStats> INSTANCE = CapabilityManager.get(new CapabilityToken<>() {});
    private final IEntityStats instance = new EntityStatsBase();

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        return EntityStatsCapability.INSTANCE.orEmpty(cap, LazyOptional.of(() -> this.instance));
    }

    @Override
    public CompoundTag serializeNBT() {
        return this.instance.serializeNBT();
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        this.instance.deserializeNBT(nbt);
    }

    public static IEntityStats get(final LivingEntity entity) {
        IEntityStats props = entity.getCapability(INSTANCE, null).orElse(new EntityStatsBase());
        props.setOwner(entity);
        return props;
    }

    @Nullable
    public static IEntityStats getLazy(final LivingEntity entity) {
        return entity.getCapability(INSTANCE, null).orElse(null);
    }

}