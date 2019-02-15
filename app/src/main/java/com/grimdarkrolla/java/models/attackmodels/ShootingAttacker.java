package com.grimdarkrolla.java.models.attackmodels;

public class ShootingAttacker {
    private int numberOfModels;
    private int shotsPerModel;
    private int ballisticSkill;
    private int weaponStrength;
    private int weaponArmorPenetration;
    private int weaponDamage;

    public ShootingAttacker() {
        this.numberOfModels = 1;
        this.shotsPerModel = 1;
        this.ballisticSkill = 0;
        this.weaponStrength = 0;
        this.weaponArmorPenetration = 0;
        this.weaponDamage = 1;
    }

    // Getters
    public int getNumberOfModels() {
        return this.numberOfModels;
    }

    public int getShotsPerModel() {
        return this.shotsPerModel;
    }

    public int getBallisticSkill() {
        return this.ballisticSkill;
    }

    public int getWeaponStrength() {
        return this.weaponStrength;
    }

    public int getWeaponArmorPenetration() {
        return this.weaponArmorPenetration;
    }

    public int getWeaponDamage() {
        return this.weaponDamage;
    }

    // Setters
    public void setNumberOfModels(int numberOfModels) {
        this.numberOfModels = numberOfModels;
    }

    public void setShotsPerModel(int shotsPerModel) {
        this.shotsPerModel = shotsPerModel;
    }

    public void setBallisticSkill(int ballisticSkill) {
        this.ballisticSkill = ballisticSkill;
    }

    public void setWeaponStrength(int weaponStrength) {
        this.weaponStrength = weaponStrength;
    }

    public void setWeaponArmorPenetration(int weaponArmorPenetration) {
        this.weaponArmorPenetration = weaponArmorPenetration;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
}
