package com.grimdarkrolla.java.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class ModelType implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public long id;

    private String modelName;
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

    // Modifiers to Hit and Wound
    private int toHitModifier;
    private String toHitReroll;
    private int toWoundModifier;
    private String toWoundReroll;

    // Defender unit type
    private ModelType defender;

    // Public constructor
    public ModelType() {
        this.id = 0;
        this.modelName = "";
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
        this.toHitModifier = 0;
        this.toHitReroll = "";
        this.toWoundModifier = 0;
        this.toWoundReroll = "";
        this.defender = null;
    }

    /**** Getters ****/
    public long getId() {
        return this.id;
    }
    public String getModelName() {
        return modelName;
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

    // Hit and Wound Modifier getters
    public int getToHitModifier() {
        return toHitModifier;
    }
    public String getToHitReroll() {
        return toHitReroll;
    }
    public int getToWoundModifier() {
        return toWoundModifier;
    }
    public String getToWoundReroll() {
        return toWoundReroll;
    }

    // Defender unit getter
    public ModelType getDefender() {
        return defender;
    }

    /**** Setters ****/
    public void setId(long id) {
        this.id = id;
    }
    public void setModelName(String unitName) {
        this.modelName = unitName;
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

    // Hit and Wound Modifier setters
    public void setToHitModifier(int toHitModifier) { this.toHitModifier = toHitModifier; }
    public void setToHitReroll(String toHitReroll) { this.toHitReroll = toHitReroll; }
    public void setToWoundModifier(int toWoundModifier) {
        this.toWoundModifier = toWoundModifier;
    }
    public void setToWoundReroll(String toWoundReroll) {
        this.toWoundReroll = toWoundReroll;
    }

    // Defender unit getter
    public void setDefender(ModelType defender) {
        this.defender = defender;
    }

    /**** Tally Calculations ****/
    // Calculates an attacking model's return on investment
    public double totalCombatEfficiency() {
        return this.totalDefenderCasualties() / (this.getPointCost() * this.getNumberOfModels());
    }

    public double modelCombatEfficiency() {
        return this.totalDefenderCasualties() / this.getPointCost();
    }

    // Calculates total number of defender casualties taken
    public double totalDefenderCasualties() {
        return Math.floor(this.totalDamageDealt() / this.getDefender().getWounds());
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
        return this.getNumberOfModels() * this.getWpnShots();
    }

    // Calculates total to hit percentage
    public double totalToHitPercentage() {
        return (this.ballisticSkillToHit() + this.rerollToHit(this.getToHitReroll())) + this.modifierToHit(this.getToHitModifier());
    }

    // Translates the ballistic skill to its percentage to successfully hit
    public double ballisticSkillToHit() {
        return toPercentage(this.getBallisticSkill());
    }

    // Adjusts hit percentage based on modifiers
    public double modifierToHit(int toHitModifier) {
        switch (toHitModifier) {
            case -3:
                return (double) 3/6 * -1;
            case -2:
                return (double) 2/6 * -1;
            case -1:
                return (double) 1/6 * -1;
            case 1:
                return (double) 1/6;
            case 2:
                return (double) 2/6;
            case 3:
                return (double) 3/6;
            default:
                return 0;
        }
    }

    // Adjusts hit percentage based on rerolls
    public double rerollToHit(String diceToReroll) {
        switch (diceToReroll) {
            // Case 1 is used for rerolling 1's
            case "ones":
                return this.ballisticSkillToHit() * 1/6;
            // Case 2 is used for rerolling all misses
            case "all":
                return (1 - this.ballisticSkillToHit()) * this.ballisticSkillToHit();
            default:
                return 0;
        }
    }

    // Calculates total percentage to wound
    public double totalToWoundPercentage() {
        return (this.baseToWound() + this.rerollToWound(this.getToWoundReroll())) + this.modifierToWound(this.getToWoundModifier());
    }

    // Translates ModelType wpnStrength vs Defender toughness as a percentage to successfully wound
    public double baseToWound() {
        int defenderToughness = this.getDefender().getToughness();
        int attackerWpnStrength = this.getWpnStrength();

        if (attackerWpnStrength == 0) { // Hit automatically wounds
            return (double) 6/6;
        } else if (attackerWpnStrength >= (defenderToughness * 2)) {
            return (double) 5/6;
        } else if (attackerWpnStrength > defenderToughness) {
            return (double) 4/6;
        } else if (attackerWpnStrength == defenderToughness) {
            return (double) 3/6;
        } else if (attackerWpnStrength <= (defenderToughness / 2)) {
            return (double) 1/6;
        } else if (attackerWpnStrength < defenderToughness) {
            return (double) 2/6;
        } else {
            return (double) 0;
        }
    }

    // Adjusts wound percentage based on modifiers
    public double modifierToWound(int toWoundModifier) {
        switch (toWoundModifier) {
            case -3:
                return (double) 3/6 * -1;
            case -2:
                return (double) 2/6 * -1;
            case -1:
                return (double) 1/6 * -1;
            case 1:
                return (double) 1/6;
            case 2:
                return (double) 2/6;
            case 3:
                return (double) 3/6;
            default:
                return 0;
        }
    }

    // Adjusts wound percentage based on rerolls
    public double rerollToWound(String diceToReroll) {
        switch (diceToReroll) {
            // Case 1 is used for rerolling 1's
            case "ones":
                return this.baseToWound() * 1/6;
            // Case 2 is used for rerolling all misses
            case "all":
                return (1 - this.baseToWound()) * this.baseToWound();
            default:
                return 0;
        }    }

    // Translates save value to percentage to fail the save
    public double percentageToFailSave() {
        return (1 - toPercentage(this.bestSaveSelector()));
    }

    // Compares armorSave and invulnerableSave and returns whichever is better
    public int bestSaveSelector() {
        int modifiedArmorSave = this.modifiedArmorSave();
        if (modifiedArmorSave < this.getDefender().getInvulnSave()) {
            return modifiedArmorSave;
        } else {
            return this.getDefender().getInvulnSave();
        }
    }

    // Calculates saves after any modifiers are applied
    public int modifiedArmorSave() {
        return this.getDefender().getArmorSave() + this.getWpnArmorPen();
    }

    // Translates numbers into percentages - used in ballisticSkillToHit() and percentageToFailSave()
    public double toPercentage(int number) {
        switch (number) {
            case 2:
                return (double) 5/6;
            case 3:
                return (double) 4/6;
            case 4:
                return (double) 3/6;
            case 5:
                return (double) 2/6;
            case 6:
                return (double) 1/6;

            // In ballisticSkillToHit() = automatic hit
            // In percentageToFailSave() = auto-fail armor save
            default:
                return (double) 6/6;
        }
    }
}
