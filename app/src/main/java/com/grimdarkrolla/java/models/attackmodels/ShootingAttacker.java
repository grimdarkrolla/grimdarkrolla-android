package com.grimdarkrolla.java.models.attackmodels;

public class ShootingAttacker {
    private int numberOfModels;
    private int shotsPerWeapon;
    private int ballisticSkill;
    private int weaponStrength;
    private int weaponArmorPenetration;
    private int weaponDamage;

    public ShootingAttacker() {
        this.numberOfModels = 1;
        this.shotsPerWeapon = 1;
        this.ballisticSkill = 0;
        this.weaponStrength = 0;
        this.weaponArmorPenetration = 0;
        this.weaponDamage = 1;
    }

    /**** Getters ****/
    public int getNumberOfModels() {
        return this.numberOfModels;
    }

    public int getShotsPerWeapon() {
        return this.shotsPerWeapon;
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

    /**** Setters ****/
    public void setNumberOfModels(int numberOfModels) {
        this.numberOfModels = numberOfModels;
    }

    public void setShotsPerWeapon(int shotsPerWeapon) {
        this.shotsPerWeapon = shotsPerWeapon;
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

    /**** Calculations ****/
    // Calculates total number shots a unit has
    public int totalNumberOfShots() {
        return this.numberOfModels * this.shotsPerWeapon;
    }

    // Calculates total to hit percentage
    public double totalToHitPercentage() {
        return this.ballisticSkillToHit() + this.modifierToHit() + this.rerollToHit();
    }

    // Translates the ballistic skill to its percentage to successfully hit
    public double ballisticSkillToHit() {
        switch (this.getBallisticSkill()) {
            case 2:
                return 5/6;
            case 3:
                return 4/6;
            case 4:
                return 3/6;
            case 5:
                return 2/6;
            case 6:
                return 1/6;
             default: // Shot automatically hits
                 return 6/6;
        }
    }

    // Adjusts hit percentage based on modifiers
    public double modifierToHit() {
        return 0;
    }

    // Adjusts hit percentage based on rerolls
    public double rerollToHit() {
        return 0;
    }

    // Calculates total percentage to wound
    public double totalToWoundPercentage(int shootingDefenderToughness) {
        return this.baseToWound(shootingDefenderToughness) + this.modifierToWound() + rerollToWound();
    }

    // Translates ShootingAttacker weaponStrength vs ShootingDefender toughness as a percentage to successfully wound
    public double baseToWound(int shootingDefenderToughness) {
        if (this.weaponStrength >= (shootingDefenderToughness * 2)) {
            return 5/6;
        } else if (this.weaponStrength > shootingDefenderToughness) {
            return 4/6;
        } else if (this.weaponStrength == shootingDefenderToughness) {
            return 3/6;
        } else if (this.weaponStrength <= (shootingDefenderToughness / 2)) {
            return 1/6;
        } else if (this.weaponStrength < shootingDefenderToughness) {
            return 2/6;
        } else { // Shot automatically hits
            return 6/6;
        }
    }

    // Adjusts wound percentage based on modifiers
    public double modifierToWound() {
        return 0;
    }

    // Adjusts wound percentage based on rerolls
    public double rerollToWound() {
        return 0;
    }

    // Translates save value to percentage to fail the save
    public double precentageToFailSave(int shootingDefenderArmorSave, int shootingDefenderInvulnerableSave) {
        int bestSaveValue = bestSaveSelector(shootingDefenderArmorSave, shootingDefenderInvulnerableSave);
        switch (bestSaveValue) {
            case 2:
                return 5/6;
            case 3:
                return 4/6;
            case 4:
                return 3/6;
            case 5:
                return 2/6;
            case 6:
                return 1/6;
            default: // Armor automatically fails to save
                return 6/6;
        }
    }

    // Compares armorSave and invulnerableSave and returns whichever is better
    public int bestSaveSelector(int shootingDefenderArmorSave, int shootingDefenderInvulnerableSave) {
        int modifiedArmorSave = this.modifiedArmorSave(shootingDefenderArmorSave);
        if (modifiedArmorSave < shootingDefenderInvulnerableSave) {
            return modifiedArmorSave;
        } else {
            return shootingDefenderInvulnerableSave;
        }
    }

    // Calculates saves after any modifiers are applied
    public int modifiedArmorSave(int shootingDefendersArmorSave) {
        return shootingDefendersArmorSave + Math.abs(this.weaponArmorPenetration);
    }
}
