package com.grimdarkrolla.java.models.attackmodels;

public class UnitType {
    private String unitName;
    private int numberOfModels;
    private int pointCost;

    // Shooting stats
    private int wpnShots;
    private int ballisticSkill;
    private int wpnStrength;
    private int wpnArmorPen;
    private int wpnDmg;

    // Melee stats
    private int wpnSkill;
    private int strength;
    private int attacks;

    // Defense stats
    private int toughness;
    private int wounds;
    private int armorSave;
    private int invulnSave;

    // Morale stat
    private int leadership;

    // Defender unit type
    private UnitType defender;

    // Public constructor
    public UnitType() {
        this.unitName = "";
        this.numberOfModels = 1;
        this.pointCost = 0;
        this.wpnShots = 1;
        this.ballisticSkill = 0;
        this.wpnStrength = 0;
        this.wpnArmorPen = 0;
        this.wpnDmg = 1;
        this.wpnSkill = 0;
        this.strength = 0;
        this.attacks = 1;
        this.toughness = 0;
        this.wounds = 1;
        this.armorSave = 0;
        this.invulnSave = 0;
        this.leadership = 0;
        this.defender = null;
    }

    /**** Getters ****/
    public String getUnitName() {
        return unitName;
    }

    public int getNumberOfModels() {
        return this.numberOfModels;
    }

    public int getPointCost() {
        return pointCost;
    }

    // Shooting stat getters
    public int getWpnShots() {
        return this.wpnShots;
    }

    public int getBallisticSkill() {
        return this.ballisticSkill;
    }

    public int getWpnStrength() {
        return this.wpnStrength;
    }

    public int getWpnArmorPen() {
        return this.wpnArmorPen;
    }

    public int getWpnDmg() {
        return this.wpnDmg;
    }

    // Melee stat getters
    public int getWpnSkill() {
        return wpnSkill;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttacks() {
        return attacks;
    }

    // Defense stat getters
    public int getToughness() {
        return toughness;
    }

    public int getWounds() {
        return wounds;
    }

    public int getArmorSave() {
        return armorSave;
    }

    public int getInvulnSave() {
        return invulnSave;
    }

    // Morale stat getter
    public int getLeadership() {
        return leadership;
    }

    // Defender unit getter
    public UnitType getDefender() {
        return defender;
    }

    /**** Setters ****/
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
    public void setNumberOfModels(int numberOfModels) {
        this.numberOfModels = numberOfModels;
    }

    public void setPointCost(int pointCost) {
        this.pointCost = pointCost;
    }

    // Shooting stat setters
    public void setWpnShots(int wpnShots) {
        this.wpnShots = wpnShots;
    }

    public void setBallisticSkill(int ballisticSkill) {
        this.ballisticSkill = ballisticSkill;
    }

    public void setWpnStrength(int wpnStrength) {
        this.wpnStrength = wpnStrength;
    }

    public void setWpnArmorPen(int wpnArmorPen) {
        this.wpnArmorPen = Math.abs(wpnArmorPen);
    }

    public void setWpnDmg(int wpnDmg) {
        this.wpnDmg = wpnDmg;
    }

    // Melee stat setters
    public void setWpnSkill(int wpnSkill) {
        this.wpnSkill = wpnSkill;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAttacks(int attacks) {
        this.attacks = attacks;
    }


    // Defense stat setters
    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public void setWounds(int wounds) {
        this.wounds = wounds;
    }

    public void setArmorSave(int armorSave) {
        this.armorSave = armorSave;
    }

    public void setInvulnSave(int invulnSave) {
        this.invulnSave = invulnSave;
    }

    // Morale stat setter
    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    // Defender unit getter
    public void setDefender(UnitType defender) {
        this.defender = defender;
    }

    /**** Tally Calculations ****/
    // Calculates total number of defender casualties taken
    public double totalDefenderCasualties() {
        return Math.floor(this.totalDamageDealt() / this.defender.getWounds());
    }
    
    // Calculates total damage caused to a unit type
    public double totalDamageDealt() {
        return this.totalNumberOfUnsavedWounds() * this.getWpnDmg();
    }

    // Calculates total number of wounds caused after saving throws
    public double totalNumberOfUnsavedWounds() {
        return this.totalNumberOfWounds() * this.percentageToFailSave();
    }

    // Calculates total number of wounds caused by the attacker prior to the defender's saves
    public double totalNumberOfWounds() {
        return this.totalNumberOfHits() * this.totalToWoundPercentage();
    }

    // Calculates the total number of hits (attacker hits defender)
    public double totalNumberOfHits() {
        return this.totalNumberOfShots() * this.totalToHitPercentage();
    }

    /**** Unit Type Calculations ****/
    // Calculates total number shots a unit has
    public int totalNumberOfShots() {
        return this.numberOfModels * this.wpnShots;
    }

    // Calculates total to hit percentage
    public double totalToHitPercentage() {
        return this.ballisticSkillToHit() + this.modifierToHit() + this.rerollToHit();
    }

    // Translates the ballistic skill to its percentage to successfully hit
    public double ballisticSkillToHit() {
        return toPercentage(this.getBallisticSkill());
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
    public double totalToWoundPercentage() {
        return this.baseToWound() + this.modifierToWound() + this.rerollToWound();
    }

    // Translates UnitType wpnStrength vs Defender toughness as a percentage to successfully wound
    public double baseToWound() {
        int defenderToughness = this.defender.getToughness();
        int attackerWpnStrength = this.getWpnStrength();

        if (attackerWpnStrength == 0) { // Shot automatically wounds
            return (double)6/6;
        } else if (attackerWpnStrength >= (defenderToughness * 2)) {
            return (double)5/6;
        } else if (attackerWpnStrength > defenderToughness) {
            return (double)4/6;
        } else if (attackerWpnStrength == defenderToughness) {
            return (double)3/6;
        } else if (attackerWpnStrength <= (defenderToughness / 2)) {
            return (double)1/6;
        } else if (attackerWpnStrength < defenderToughness) {
            return (double)2/6;
        } else {
            return 0;
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
    public double percentageToFailSave() {
        return (1 - toPercentage(this.bestSaveSelector()));
    }

    // Compares armorSave and invulnerableSave and returns whichever is better
    public int bestSaveSelector() {
        int modifiedArmorSave = this.modifiedArmorSave();
        if (modifiedArmorSave < this.defender.getInvulnSave()) {
            return modifiedArmorSave;
        } else {
            return this.defender.getInvulnSave();
        }
    }

    // Calculates saves after any modifiers are applied
    public int modifiedArmorSave() {
        return this.defender.getArmorSave() + this.wpnArmorPen;
    }

    // Translates numbers into percentages - used in ballisticSkillToHit() and percentageToFailSave()
    public double toPercentage(int number) {
        switch (number) {
            case 2:
                return (double)5/6;
            case 3:
                return (double)4/6;
            case 4:
                return (double)3/6;
            case 5:
                return (double)2/6;
            case 6:
                return (double)1/6;

            // In ballisticSkillToHit(), automatic hit
            // In percentageToFailSave(), no armor save
            default:
                return 6/6;
        }
    }
}
