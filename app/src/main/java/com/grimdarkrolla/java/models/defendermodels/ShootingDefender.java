package com.grimdarkrolla.java.models.defendermodels;

public class ShootingDefender {
    private int numberOfModels;
    private int toughness;
    private int wounds;
    private int armorSave;
    private int invulnerableSave;
    private int leadership;

    public ShootingDefender() {
        this.numberOfModels = 1;
        this.toughness = 4;
        this.wounds = 1;
        this.armorSave = 3;
        this.invulnerableSave = 0;
        this.leadership = 8;
    }

    // Getters
    public int getNumberOfModels() {
        return this.numberOfModels;
    }

    public int getToughness() {
        return this.toughness;
    }

    public int getWounds() {
        return this.wounds;
    }

    public int getArmorSave() {
        return this.armorSave;
    }

    public int getInvulnerableSave() {
        return this.invulnerableSave;
    }

    public int getLeadership() {
        return this.leadership;
    }

    // Setters
    public void setNumberOfModels(int numberOfModels) {
        this.numberOfModels = numberOfModels;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public void setWounds(int wounds) {
        this.wounds = wounds;
    }

    public void setArmorSave(int armorSave) {
        this.armorSave = armorSave;
    }

    public void setInvulnerableSave(int invulnerableSave) {
        this.invulnerableSave = invulnerableSave;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }
}
