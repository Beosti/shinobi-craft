package com.yuanno.shinobicraft.data.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.LivingEntity;

public class EntityStatsBase implements IEntityStats {

    private LivingEntity owner;
    private int ninjaLevel, ninjutsuLevel, taijutsuLevel, genjutsuLevel, kenjutsuLevel, medicaljutsuLevel, fuuinjutsuLevel, dojutsuLevel, summoningLevel, senjutsuLevel;
    private double ninjutsuExperience, taijutsuExperience, genjutsuExperience, kenjutsuExperience, medicalExperience, fuuinjutsuExperience, dojutsuExperience, summoningExperience, senjutsuExperience;
    private double taijutsuMaxExperience, kenjutsuMaxExperience;

    public IEntityStats setOwner(LivingEntity entity)
    {
        this.owner = entity;
        return this;
    }

    public void setNinjaLevel(int amount)
    {
        this.ninjaLevel = amount;
    }
    public void alterNinjaLevel(int amount)
    {
        this.ninjaLevel += amount;
    }
    public int getNinjaLevel()
    {
        return this.ninjaLevel;
    }
    public void setNinjutsuLevel(int amount)
    {
        this.ninjutsuLevel = amount;
    }
    public void alterNinjutsuLevel(int amount)
    {
        this.ninjutsuLevel += amount;
    }
    public int getNinjutsuLevel()
    {
        return this.ninjutsuLevel;
    }
    public void setTaijutsuLevel(int amount)
    {
        this.taijutsuLevel = amount;
    }
    public void alterTaijutsuLevel(int amount)
    {
        this.taijutsuLevel += amount;
    }
    public int getTaijutsuLevel()
    {
        return this.taijutsuLevel;
    }
    public void setGenjutsuLevel(int amount)
    {
        this.genjutsuLevel = amount;
    }
    public void alterGenjutsuLevel(int amount)
    {
        this.genjutsuLevel += amount;
    }
    public int getGenjutsuLevel()
    {
        return this.genjutsuLevel;
    }
    public void setKenjutsuLevel(int amount)
    {
        this.kenjutsuLevel = amount;
    }
    public void alterKenjutsuLevel(int amount)
    {
        this.kenjutsuLevel += amount;
    }
    public int getKenjutsuLevel()
    {
        return this.kenjutsuLevel;
    }
    public void setMedicaljutsuLevel(int amount)
    {
        this.medicaljutsuLevel = amount;
    }
    public void alterMedicaljutsuLevel(int amount)
    {
        this.medicaljutsuLevel += amount;
    }
    public int getMedicaljutsuLevel()
    {
        return this.medicaljutsuLevel;
    }
    public void setFuuinjutsuLevel(int amount)
    {
        this.fuuinjutsuLevel = amount;
    }
    public void alterFuuinjutsuLevel(int amount)
    {
        this.fuuinjutsuLevel += amount;
    }
    public int getFuuinjutsuLevel()
    {
        return this.fuuinjutsuLevel;
    }
    public void setDojutsuLevel(int amount)
    {
        this.dojutsuLevel = amount;
    }
    public void alterDojutsuLevel(int amount)
    {
        this.dojutsuLevel += amount;
    }
    public int getDojutsuLevel()
    {
        return this.dojutsuLevel;
    }
    public void setSummoningLevel(int amount)
    {
        this.summoningLevel = amount;
    }
    public void alterSummoningLevel(int amount)
    {
        this.summoningLevel += amount;
    }
    public int getSummoningLevel()
    {
        return this.summoningLevel;
    }
    public void setSenjutsuLevel(int amount)
    {
        this.senjutsuLevel = amount;
    }
    public void alterSenjutsuLevel(int amount)
    {
        this.senjutsuLevel += amount;
    }
    public int getSenjutsuLevel()
    {
        return this.senjutsuLevel;
    }
    public void setNinjutsuExperience(double amount)
    {
        this.ninjutsuExperience = amount;
    }
    public void alterNinjutsuExperience(double amount)
    {
        this.ninjutsuExperience += amount;
    }
    public double getNinjutsuExperience()
    {
        return this.ninjutsuExperience;
    }
    public void setTaijutsuExperience(double amount)
    {
        this.taijutsuExperience = amount;
    }
    public void alterTaijutsuExperience(double amount)
    {
        this.taijutsuExperience += amount;
    }
    public double getTaijutsuExperience()
    {
        return this.taijutsuExperience;
    }
    public void setGenjutsuExperience(double amount)
    {
        this.genjutsuExperience = amount;
    }
    public void alterGenjutsuExperience(double amount)
    {
        this.genjutsuExperience += amount;
    }
    public double getGenjutsuExperience()
    {
        return this.genjutsuExperience;
    }
    public void setKenjutsuExperience(double amount)
    {
        this.kenjutsuExperience = amount;
    }
    public void alterKenjutsuExperience(double amount)
    {
        this.kenjutsuExperience += amount;
    }
    public double getKenjutsuExperience()
    {
        return this.kenjutsuExperience;
    }
    public void setMedicalExperience(double amount)
    {
        this.medicalExperience = amount;
    }
    public void alterMedicalExperience(double amount)
    {
        this.medicalExperience += amount;
    }
    public double getMedicalExperience()
    {
        return this.medicalExperience;
    }
    public void setFuuinjutsuExperience(double amount)
    {
        this.fuuinjutsuExperience = amount;
    }
    public void alterFuuinjutsuExperience(double amount)
    {
        this.fuuinjutsuExperience += amount;
    }
    public double getFuuinjutsuExperience()
    {
        return this.fuuinjutsuExperience;
    }
    public void setDojutsuExperience(double amount)
    {
        this.dojutsuExperience = amount;
    }
    public void alterDojutsuExperience(double amount)
    {
        this.dojutsuExperience += amount;
    }
    public double getDojutsuExperience()
    {
        return this.dojutsuExperience;
    }
    public void setSummoningExperience(double amount)
    {
        this.summoningExperience = amount;
    }
    public void alterSummoningExperience(double amount)
    {
        this.summoningExperience += amount;
    }
    public double getSummoningExperience()
    {
        return this.summoningExperience;
    }
    public void setSenjutsuExperience(double amount)
    {
        this.senjutsuExperience = amount;
    }
    public void alterSenjutsuExperience(double amount)
    {
        this.senjutsuExperience += amount;
    }
    public double getSenjutsuExperience()
    {
        return this.senjutsuExperience;
    }

    public void setMaxTaijutsuExperience(double amount)
    {
        this.taijutsuMaxExperience = amount;
    }
    public void alterMaxTaijutsuExperience(double amount)
    {
        this.taijutsuMaxExperience += amount;
    }
    public double getTaijutsuMaxExperience()
    {
        return this.taijutsuMaxExperience;
    }
    public void setKenjutsuMaxExperience(double amount)
    {
        this.kenjutsuMaxExperience = amount;
    }
    public void alterKenjutsuMaxExperience(double amount)
    {
        this.kenjutsuMaxExperience += amount;
    }
    public double getKenjutsuMaxExperience()
    {
        return this.kenjutsuMaxExperience;
    }


    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();

        nbt.putInt("ninjaLevel", this.getNinjaLevel());
        nbt.putInt("ninjutsuLevel", this.getNinjutsuLevel());
        nbt.putInt("taijutsuLevel", this.getTaijutsuLevel());
        nbt.putInt("genjutsuLevel", this.getGenjutsuLevel());
        nbt.putInt("kenjutsuLevel", this.getKenjutsuLevel());
        nbt.putInt("medicaljutsuLevel", this.getMedicaljutsuLevel());
        nbt.putInt("fuuinjutsuLevel", this.getFuuinjutsuLevel());
        nbt.putInt("dojutsuLevel", this.getDojutsuLevel());
        nbt.putInt("summoningLevel", this.getSummoningLevel());
        nbt.putInt("senjutsuLevel", this.getSenjutsuLevel());

        nbt.putDouble("ninjutsuExperience", this.getNinjutsuExperience());
        nbt.putDouble("taijutsuExperience", this.getTaijutsuExperience());
        nbt.putDouble("genjutsuExperience", this.getGenjutsuExperience());
        nbt.putDouble("kenjutsuExperience", this.getKenjutsuExperience());
        nbt.putDouble("medicaljutsuExperience", this.getMedicalExperience());
        nbt.putDouble("fuuinjutsuExperience", this.getFuuinjutsuExperience());
        nbt.putDouble("dojutsuExperience", this.getDojutsuExperience());
        nbt.putDouble("summoningExperience", this.getSummoningExperience());
        nbt.putDouble("senjutsuExperience", this.getSenjutsuExperience());

        nbt.putDouble("kenjutsuMaxExperience", this.getKenjutsuMaxExperience());
        nbt.putDouble("taijutsuMaxExperience", this.getTaijutsuMaxExperience());
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        this.setNinjaLevel(nbt.getInt("ninjaLevel"));
        this.setNinjutsuLevel(nbt.getInt("ninjutsuLevel"));
        this.setTaijutsuLevel(nbt.getInt("taijutsuLevel"));
        this.setGenjutsuLevel(nbt.getInt("genjutsuLevel"));
        this.setKenjutsuLevel(nbt.getInt("kenjutsuLevel"));
        this.setMedicaljutsuLevel(nbt.getInt("medicaljutsuLevel"));
        this.setFuuinjutsuLevel(nbt.getInt("fuuinjutsuLevel"));
        this.setDojutsuLevel(nbt.getInt("dojutsuLevel"));
        this.setSummoningLevel(nbt.getInt("summoningLevel"));
        this.setSenjutsuLevel(nbt.getInt("senjutsuLevel"));

        this.setNinjutsuExperience(nbt.getDouble("ninjutsuExperience"));
        this.setTaijutsuExperience(nbt.getDouble("taijutsuExperience"));
        this.setGenjutsuExperience(nbt.getDouble("genjutsuExperience"));
        this.setKenjutsuExperience(nbt.getDouble("kenjutsuExperience"));
        this.setMedicalExperience(nbt.getDouble("medicaljutsuExperience"));
        this.setFuuinjutsuExperience(nbt.getDouble("fuuinjutsuExperience"));
        this.setDojutsuExperience(nbt.getDouble("dojutsuExperience"));
        this.setSummoningExperience(nbt.getDouble("summoningExperience"));
        this.setSenjutsuExperience(nbt.getDouble("senjutsuExperience"));

        this.setMaxTaijutsuExperience(nbt.getDouble("taijutsuMaxExperience"));
        this.setKenjutsuMaxExperience(nbt.getDouble("kenjutsuMaxExperience"));

    }
}