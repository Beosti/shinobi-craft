package com.yuanno.shinobicraft.data.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.common.util.INBTSerializable;

public interface IEntityStats extends INBTSerializable<CompoundTag> {

    IEntityStats setOwner(LivingEntity entity);

    void setNinjaLevel(int amount);
    void alterNinjaLevel(int amount);
    int getNinjaLevel();

    void setNinjutsuLevel(int amount);
    void alterNinjutsuLevel(int amount);
    int getNinjutsuLevel();

    void setTaijutsuLevel(int amount);
    void alterTaijutsuLevel(int amount);
    int getTaijutsuLevel();

    void setGenjutsuLevel(int amount);
    void alterGenjutsuLevel(int amount);
    int getGenjutsuLevel();

    void setKenjutsuLevel(int amount);
    void alterKenjutsuLevel(int amount);
    int getKenjutsuLevel();

    void setMedicaljutsuLevel(int amount);
    void alterMedicaljutsuLevel(int amount);
    int getMedicaljutsuLevel();

    void setFuuinjutsuLevel(int amount);
    void alterFuuinjutsuLevel(int amount);
    int getFuuinjutsuLevel();

    void setDojutsuLevel(int amount);
    void alterDojutsuLevel(int amount);
    int getDojutsuLevel();

    void setSummoningLevel(int amount);
    void alterSummoningLevel(int amount);
    int getSummoningLevel();

    void setSenjutsuLevel(int amount);
    void alterSenjutsuLevel(int amount);
    int getSenjutsuLevel();

    void setNinjutsuExperience(double amount);
    void alterNinjutsuExperience(double amount);
    double getNinjutsuExperience();

    void setTaijutsuExperience(double amount);
    void alterTaijutsuExperience(double amount);
    double getTaijutsuExperience();

    void setGenjutsuExperience(double amount);
    void alterGenjutsuExperience(double amount);
    double getGenjutsuExperience();

    void setKenjutsuExperience(double amount);
    void alterKenjutsuExperience(double amount);
    double getKenjutsuExperience();

    void setMedicalExperience(double amount);
    void alterMedicalExperience(double amount);
    double getMedicalExperience();

    void setFuuinjutsuExperience(double amount);
    void alterFuuinjutsuExperience(double amount);
    double getFuuinjutsuExperience();

    void setDojutsuExperience(double amount);
    void alterDojutsuExperience(double amount);
    double getDojutsuExperience();

    void setSummoningExperience(double amount);
    void alterSummoningExperience(double amount);
    double getSummoningExperience();

    void setSenjutsuExperience(double amount);
    void alterSenjutsuExperience(double amount);
    double getSenjutsuExperience();

    void setMaxTaijutsuExperience(double amount);
    void alterMaxTaijutsuExperience(double amount);
    double getTaijutsuMaxExperience();

    void setKenjutsuMaxExperience(double amount);
    void alterKenjutsuMaxExperience(double amount);
    double getKenjutsuMaxExperience();
}