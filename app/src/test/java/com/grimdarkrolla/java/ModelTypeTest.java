package com.grimdarkrolla.java;

import com.grimdarkrolla.java.models.ModelType;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTypeTest {

    private ModelType testAttacker = new ModelType();
    private ModelType testDefender = new ModelType();

    @Test
    public void setModelName_Tests() {
        testAttacker.setModelName("Space Marine");
        assertEquals("Space Marine", testAttacker.getModelName());

        System.out.println("--- Set Model Name ---");
        System.out.println("Model name: " + testAttacker.getModelName());
        System.out.println("\n");

    }

    @Test
    public void setNumberOfModels_Tests() {
        testAttacker.setNumberOfModels(7);
        assertEquals(7, testAttacker.getNumberOfModels());

        System.out.println("--- Set Number of Models ---");
        System.out.println("Number of models: " + testAttacker.getNumberOfModels());
        System.out.println("\n");
    }

    @Test
    public void setWpnShots_Tests() {
        testAttacker.setWpnShots(3);
        assertEquals(3, testAttacker.getWpnShots());

        System.out.println("--- Set Weapon Shots ---");
        System.out.println("Number of shots: " + testAttacker.getWpnShots());
        System.out.println("\n");
    }

    @Test
    public void setBallisticSkill_Tests() {
        testAttacker.setBallisticSkill(3);
        assertEquals(3, testAttacker.getBallisticSkill());

        System.out.println("--- Set Ballistic Skill ---");
        System.out.println("BS: " + testAttacker.getBallisticSkill());
        System.out.println("\n");
    }

    @Test
    public void setWpnStrength_Tests() {
        testAttacker.setWpnStrength(4);
        assertEquals(4, testAttacker.getWpnStrength());

        System.out.println("--- Set Weapon Strength ---");
        System.out.println("Wpn Str: " + testAttacker.getWpnStrength());
        System.out.println("\n");
    }

    @Test
    public void setWpnArmorPen_Tests() {
        testAttacker.setWpnArmorPen(-2);
        assertEquals(2, testAttacker.getWpnArmorPen());

        System.out.println("--- Set Armor Penetration ---");
        System.out.println("Wpn AP: " + testAttacker.getWpnArmorPen());
        System.out.println("\n");
    }

    @Test
    public void setWpnDmg_Tests() {
        testAttacker.setWpnDmg(2);
        assertEquals(2, testAttacker.getWpnDmg());

        System.out.println("--- Set Weapon Damage ---");
        System.out.println("Wpn dmg: " + testAttacker.getWpnDmg());
        System.out.println("\n");
    }

    @Test
    public void setWpnSkill_Tests() {
        testAttacker.setWpnSkill(3);
        assertEquals(3, testAttacker.getWpnSkill());

        System.out.println("--- Set Weapon Skill ---");
        System.out.println("WS: " + testAttacker.getWpnSkill());
        System.out.println("\n");
    }

    @Test
    public void setPointCost_Tests() {
        testAttacker.setPointCost(13);
        assertEquals(13, testAttacker.getPointCost());

        System.out.println("--- Set Model Point Cost ---");
        System.out.println("Point cost per model: " + testAttacker.getPointCost());
        System.out.println("\n");
    }

    @Test
    public void setStrength_Tests() {
        testAttacker.setStrength(4);
        assertEquals(4, testAttacker.getStrength());

        System.out.println("--- Set Model Strength ---");
        System.out.println("Model Strength: " + testAttacker.getStrength());
        System.out.println("\n");
    }

    @Test
    public void setAttacks_Tests() {
        testAttacker.setAttacks(4);
        assertEquals(4, testAttacker.getAttacks());

        System.out.println("--- Set Number of Attacks ---");
        System.out.println("Number of Attacks: " + testAttacker.getAttacks());
        System.out.println("\n");
    }

    @Test
    public void setToughness_Tests() {
        testDefender.setToughness(5);
        assertEquals(5, testDefender.getToughness());

        System.out.println("--- Set Model Toughness ---");
        System.out.println("Model Toughness: " + testDefender.getToughness());
        System.out.println("\n");
    }

    @Test
    public void setWounds_Tests() {
        testDefender.setWounds(4);
        assertEquals(4, testDefender.getWounds());

        System.out.println("--- Set Model Wounds ---");
        System.out.println("Wounds per model: " + testDefender.getWounds());
        System.out.println("\n");
    }

    @Test
    public void setArmorSave_Tests() {
        testDefender.setArmorSave(3);
        assertEquals(3, testDefender.getArmorSave());

        System.out.println("--- Set Model Armor Save ---");
        System.out.println("Armor Save: " + testDefender.getArmorSave());
        System.out.println("\n");
    }

    @Test
    public void setInvulnSave_Tests() {
        testDefender.setInvulnSave(4);
        assertEquals(4, testDefender.getInvulnSave());

        System.out.println("--- Set Model Invulnerable Save ---");
        System.out.println("Invuln Save: " + testDefender.getInvulnSave());
        System.out.println("\n");
    }

    @Test
    public void setLeadership_Tests() {
        testDefender.setLeadership(8);
        assertEquals(8, testDefender.getLeadership());

        System.out.println("--- Set Model Leadership ---");
        System.out.println("Model Leadership: " + testDefender.getLeadership());
        System.out.println("\n");
    }

    @Test
    public void setDefender_Tests() {
        testDefender.setModelName("Space Marine");
        testAttacker.setDefender(testDefender);
        assertNotNull(testAttacker.getDefender());

        System.out.println("--- Set Model as Defender ---");
        System.out.println("Defender name: " + testAttacker.getDefender().getModelName());
        System.out.println("\n");
    }

    @Test
    public void getModelName_Tests() {
        testAttacker.setModelName("Space Marine");
        assertNotEquals("Eldar", testAttacker.getModelName());
        assertEquals("Space Marine", testAttacker.getModelName());
    }

    @Test
    public void getNumberOfModels_Tests() {
        testAttacker.setNumberOfModels(2);
        assertNotEquals(6, testAttacker.getNumberOfModels());
    }

    @Test
    public void getWpnShots_Tests() {
        testAttacker.setWpnShots(2);
        assertNotEquals(1, testAttacker.getWpnShots());
    }

    @Test
    public void getBallisticSkill_Tests() {
        testAttacker.setBallisticSkill(3);
        assertNotEquals(4, testAttacker.getBallisticSkill());
    }

    @Test
    public void getWpnStrength_Tests() {
        testAttacker.setWpnStrength(6);
        assertNotEquals(3, testAttacker.getWpnStrength());
    }

    @Test
    public void getWpnArmorPen_Tests() {
        testAttacker.setWpnArmorPen(-4);
        assertNotEquals(-4, testAttacker.getWpnArmorPen());
    }

    @Test
    public void getWpnDmg_Tests() {
        testAttacker.setWpnDmg(4);
        assertNotEquals(1, testAttacker.getWpnDmg());
    }

    @Test
    public void getPointCost_Tests() {
        testAttacker.setPointCost(10);
        assertNotEquals(0, testAttacker.getPointCost());
    }

    @Test
    public void getWpnSkill_Tests() {
        testAttacker.setWpnStrength(5);
        assertNotEquals(2, testAttacker.getWpnSkill());
    }

    @Test
    public void getStrength_Tests() {
        testAttacker.setStrength(6);
        assertNotEquals(1, testAttacker.getStrength());
    }

    @Test
    public void getAttacks_Tests() {
        testAttacker.setAttacks(2);
        assertNotEquals(1, testAttacker.getAttacks());
    }

    @Test
    public void getToughness_Tests() {
        testDefender.setToughness(2);
        assertNotEquals(4, testDefender.getToughness());
    }

    @Test
    public void getWounds_Tests() {
        testDefender.setWounds(1);
        assertNotEquals(3, testDefender.getWounds());
    }

    @Test
    public void getArmorSave_Tests() {
        testDefender.setArmorSave(6);
        assertNotEquals(2, testDefender.getArmorSave());
    }

    @Test
    public void getInvulnSave_Tests() {
        testDefender.setInvulnSave(2);
        assertNotEquals(4, testDefender.getInvulnSave());
    }

    @Test
    public void getLeadership_Tests() {
        testDefender.setLeadership(5);
        assertNotEquals(8, testDefender.getLeadership());
    }

    @Test
    public void getDefender_Tests() {
        testAttacker.setDefender(testDefender);
        assertNotNull(testAttacker.getDefender());
        assertNull(testDefender.getDefender());
    }

    @Test
    public void totalCombatEfficiency_Test() {
        testAttacker.setPointCost(13);
        testAttacker.setNumberOfModels(5);
        testAttacker.setWpnShots(2);
        testAttacker.setBallisticSkill(3);
        testAttacker.setWpnStrength(4);
        testAttacker.setWpnDmg(2);
        testAttacker.setDefender(testDefender);
        testDefender.setToughness(4);
        testDefender.setArmorSave(3);
        testDefender.setInvulnSave(4);
        testDefender.setWounds(2);
        assertEquals(0.01538462, testAttacker.totalCombatEfficiency(), 0.00001);

        System.out.println("--- Total Combat Efficiency ---");
        System.out.println("(Total casualties caused: " + testAttacker.totalDefenderCasualties() + ") / (Model cost: " + testAttacker.getPointCost() + " * Number of Models: " + testAttacker.getNumberOfModels() + ") = Combat Efficiency: " + testAttacker.totalCombatEfficiency());
        System.out.println("\n");
    }

    @Test
    public void totalDefenderCasualties_Tests() {
        testAttacker.setNumberOfModels(5);
        testAttacker.setWpnShots(2);
        testAttacker.setBallisticSkill(3);
        testAttacker.setWpnStrength(4);
        testAttacker.setWpnDmg(2);
        testAttacker.setDefender(testDefender);
        testDefender.setToughness(4);
        testDefender.setArmorSave(3);
        testDefender.setInvulnSave(4);
        testDefender.setWounds(2);
        assertEquals(1, testAttacker.totalDefenderCasualties(), 0);

        System.out.println("--- Total Casualties Caused ---");
        System.out.println(testAttacker.totalDamageDealt() + " damage inflicted on a model with " + testDefender.getWounds() + " wounds =  " + testAttacker.totalDefenderCasualties() + " total casualties caused");
        System.out.println("\n");
    }

    @Test
    public void totalDamageDealt_Tests() {
        testAttacker.setNumberOfModels(5);
        testAttacker.setWpnShots(2);
        testAttacker.setBallisticSkill(3);
        testAttacker.setWpnStrength(4);
        testAttacker.setWpnDmg(2);
        testAttacker.setDefender(testDefender);
        testDefender.setToughness(4);
        testDefender.setArmorSave(3);
        testDefender.setInvulnSave(4);
        assertEquals(2.2222222222, testAttacker.totalDamageDealt(), 0.0000000001);

        System.out.println("--- Total Damage Dealt ---");
        System.out.println(testAttacker.totalNumberOfUnsavedWounds() + " unsaved wounds * " + testAttacker.getWpnDmg() + " damage per wound = " + testAttacker.totalDamageDealt() + " total damage inflicted ");
        System.out.println("\n");
    }

    @Test
    public void totalNumberOfUnsavedWounds_Tests() {
        testAttacker.setNumberOfModels(5);
        testAttacker.setWpnShots(2);
        testAttacker.setBallisticSkill(3);
        testAttacker.setWpnStrength(4);
        testAttacker.setDefender(testDefender);
        testDefender.setToughness(4);
        testDefender.setArmorSave(3);
        testDefender.setInvulnSave(4);
        assertEquals(1.1111111111, testAttacker.totalNumberOfUnsavedWounds(), 0.0000000001);

        System.out.println("--- Total Number of Unsaved Wounds ---");
        System.out.println(testAttacker.totalNumberOfWounds() + " wounds vs " + testDefender.getArmorSave() + "+/ " + testDefender.getInvulnSave() + "++ saves = " + testAttacker.totalNumberOfUnsavedWounds() + " total unsaved wounds (best save is " + testAttacker.bestSaveSelector() + "+)");
        System.out.println("\n");
    }

    @Test
    public void totalNumberOfWounds_Tests() {
        testAttacker.setNumberOfModels(5);
        testAttacker.setWpnShots(2);
        testAttacker.setBallisticSkill(3);
        testAttacker.setWpnStrength(4);
        testAttacker.setDefender(testDefender);
        testDefender.setToughness(4);
        assertEquals(3.3333333333, testAttacker.totalNumberOfWounds(), 0.0000000001);

        System.out.println("--- Total Number of Wounds ---");
        System.out.println(testAttacker.totalNumberOfHits() + " hits rolled at S" + testAttacker.getWpnStrength() + " vs T" + testDefender.getToughness() + " = " + testAttacker.totalNumberOfWounds() + " total wounds");
        System.out.println("\n");
    }

    @Test
    public void totalNumberOfHits_Tests() {
        testAttacker.setNumberOfModels(5);
        testAttacker.setWpnShots(2);
        testAttacker.setBallisticSkill(3);
        assertEquals(6.6666666666, testAttacker.totalNumberOfHits(), 0.0000000001);

        System.out.println("--- Total Number of Hits ---");
        System.out.println(testAttacker.totalNumberOfShots() + " shots rolled at BS " + testAttacker.getBallisticSkill() + " = " + testAttacker.totalNumberOfHits() + " total hits");
        System.out.println("\n");
    }

    @Test
    public void totalNumberOfShots_Tests() {
        testAttacker.setNumberOfModels(5);
        testAttacker.setWpnShots(2);
        assertEquals(10, testAttacker.totalNumberOfShots());

        System.out.println("--- Total Number of Shots ---");
        System.out.println(testAttacker.getNumberOfModels() + " models * " + testAttacker.getWpnShots() + " shots per weapon = " + testAttacker.totalNumberOfShots() + " total shots");
        System.out.println("\n");
    }

    @Test
    public void totalToHitPercentage_Tests() {
        System.out.println("--- Total To Hit Percentage ---");

        testAttacker.setBallisticSkill(3);
        assertEquals((double) 4/6, testAttacker.totalToHitPercentage(), 0);
        System.out.println("Base Case -- (BS 3+ %: " + testAttacker.ballisticSkillToHit() + " + Re-roll %: " + testAttacker.rerollToHit(testAttacker.getToHitReroll()) + ") + (Mod %: " + testAttacker.modifierToHit(testAttacker.getToHitModifier()) + ") = " + testAttacker.totalToHitPercentage() + " total % To Hit");

        testAttacker.setToHitModifier(1);
        assertEquals((double) 5/6, testAttacker.totalToHitPercentage(), 0.0000000001);
        System.out.println("+1 To Hit Rolls -- (BS 3+ %: " + testAttacker.ballisticSkillToHit() + " + Re-roll %: " + testAttacker.rerollToHit(testAttacker.getToHitReroll()) + ") + (Mod %: " + testAttacker.modifierToHit(testAttacker.getToHitModifier()) + ") = " + testAttacker.totalToHitPercentage() + " total % To Hit");

        testAttacker.setToHitModifier(0);
        testAttacker.setToHitReroll("ones");
        assertEquals(0.7777777777, testAttacker.totalToHitPercentage(), 0.0000000001);
        System.out.println("Reroll 1's -- (BS 3+ %: " + testAttacker.ballisticSkillToHit() + " + Re-roll %: " + testAttacker.rerollToHit(testAttacker.getToHitReroll()) + ") + (Mod %: " + testAttacker.modifierToHit(testAttacker.getToHitModifier()) + ") = " + testAttacker.totalToHitPercentage() + " total % To Hit");

        testAttacker.setToHitModifier(1);
        testAttacker.setToHitReroll("ones");
        assertEquals(0.9444444444, testAttacker.totalToHitPercentage(), 0.0000000001);
        System.out.println("+1 To Hit / Reroll 1's -- (BS 3+ %: " + testAttacker.ballisticSkillToHit() + " + Re-roll %: " + testAttacker.rerollToHit(testAttacker.getToHitReroll()) + ") + (Mod %: " + testAttacker.modifierToHit(testAttacker.getToHitModifier()) + ") = " + testAttacker.totalToHitPercentage() + " total % To Hit");

        testAttacker.setToHitModifier(0);
        testAttacker.setToHitReroll("all");
        assertEquals(0.8888888888, testAttacker.totalToHitPercentage(), 0.0000000001);
        System.out.println("Reroll All Misses -- (BS 3+ %: " + testAttacker.ballisticSkillToHit() + " + Re-roll %: " + testAttacker.rerollToHit(testAttacker.getToHitReroll()) + ") + (Mod %: " + testAttacker.modifierToHit(testAttacker.getToHitModifier()) + ") = " + testAttacker.totalToHitPercentage() + " total % To Hit");

        testAttacker.setToHitModifier(1);
        testAttacker.setToHitReroll("all");
        assertEquals(0.8888888888, testAttacker.totalToHitPercentage(), 0.0000000001);
        System.out.println("+1 To Hit / Reroll All Misses -- (BS 3+ %: " + testAttacker.ballisticSkillToHit() + " + Re-roll %: " + testAttacker.rerollToHit(testAttacker.getToHitReroll()) + ") + (Mod %: " + testAttacker.modifierToHit(testAttacker.getToHitModifier()) + ") = " + testAttacker.totalToHitPercentage() + " total % To Hit");
        System.out.println("\n");
    }

    @Test
    public void ballisticSkillToHit_Tests() {
        System.out.println("--- Ballistic Skill To Hit ---");

        testAttacker.setBallisticSkill(0);
        assertEquals((double) 6/6, testAttacker.ballisticSkillToHit(), 0);
        System.out.println("BS 0 = Auto-hit: " + testAttacker.ballisticSkillToHit());

        testAttacker.setBallisticSkill(2);
        assertEquals((double) 5/6, testAttacker.ballisticSkillToHit(), 0);
        System.out.println("BS 2+ %: " + testAttacker.ballisticSkillToHit());

        testAttacker.setBallisticSkill(3);
        assertEquals((double) 4/6, testAttacker.ballisticSkillToHit(), 0);
        System.out.println("BS 3+ %: " + testAttacker.ballisticSkillToHit());

        testAttacker.setBallisticSkill(4);
        assertEquals((double) 3/6, testAttacker.ballisticSkillToHit(), 0);
        System.out.println("BS 4+ %: " + testAttacker.ballisticSkillToHit());

        testAttacker.setBallisticSkill(5);
        assertEquals((double) 2/6, testAttacker.ballisticSkillToHit(), 0);
        System.out.println("BS 5+ %: " + testAttacker.ballisticSkillToHit());

        testAttacker.setBallisticSkill(6);
        assertEquals((double) 1/6, testAttacker.ballisticSkillToHit(), 0);
        System.out.println("BS 6+ %: " + testAttacker.ballisticSkillToHit());
        System.out.println("\n");
    }

    @Test
    public void modifierToHit_Tests() {
        System.out.println("--- Modifiers To Hit ---");

        assertEquals((double) 3/6 * -1, testAttacker.modifierToHit(-3), 0);
        System.out.println("-3 to hit: " + testAttacker.modifierToHit(-3));
        assertEquals((double) 2/6 * -1, testAttacker.modifierToHit(-2), 0);
        System.out.println("-2 to hit: " + testAttacker.modifierToHit(-2));
        assertEquals((double) 1/6 * -1, testAttacker.modifierToHit(-1), 0);
        System.out.println("-1 to hit: " + testAttacker.modifierToHit(-1));

        assertEquals(0, testAttacker.modifierToHit(0), 0);
        System.out.println("0 to hit: " + testAttacker.modifierToHit(0));

        assertEquals((double) 1/6, testAttacker.modifierToHit(1), 0);
        System.out.println("+1 to hit: " + testAttacker.modifierToHit(1));
        assertEquals((double) 2/6, testAttacker.modifierToHit(2), 0);
        System.out.println("+2 to hit: " + testAttacker.modifierToHit(2));
        assertEquals((double) 3/6, testAttacker.modifierToHit(3), 0);
        System.out.println("+3 to hit: " + testAttacker.modifierToHit(3));
        System.out.println("\n");
    }

    @Test
    public void rerollToHit_Tests() {
        System.out.println("--- Reroll To Hit ---");

        testAttacker.setBallisticSkill(3);
        assertEquals(0.1111111111, testAttacker.rerollToHit("ones"), 0.0000000001);
        System.out.println("Reroll 1's: " + testAttacker.rerollToHit("ones"));

        assertEquals(0.2222222222, testAttacker.rerollToHit("all"), 0.0000000001);
        System.out.println("Reroll all misses at BS " + testAttacker.getBallisticSkill() + "+ : " + testAttacker.rerollToHit("all"));
        System.out.println("\n");
    }

    @Test
    public void totalToWoundPercentage_Tests() {
        System.out.println("--- Total To Wound Percentage ---");

        testAttacker.setDefender(testDefender);
        testAttacker.setWpnStrength(4);
        testDefender.setToughness(4);
        assertEquals((double) 3/6, testAttacker.totalToWoundPercentage(), 0);
        System.out.println("Base Case -- (Base wound %: " + testAttacker.baseToWound() + ") + (Mod %: " + testAttacker.modifierToWound(testAttacker.getToWoundModifier()) + ") + (Re-roll %: " + testAttacker.rerollToWound(testAttacker.getToWoundReroll()) + ") = " + testAttacker.totalToWoundPercentage() + " total % To Wound");

        testAttacker.setToWoundModifier(1);
        assertEquals((double) 4/6, testAttacker.totalToWoundPercentage(), 0);
        System.out.println("+1 To Wound Rolls -- (Base wound %: " + testAttacker.baseToWound() + ") + (Mod %: " + testAttacker.modifierToWound(testAttacker.getToWoundModifier()) + ") + (Re-roll %: " + testAttacker.rerollToWound(testAttacker.getToWoundReroll()) + ") = " + testAttacker.totalToWoundPercentage() + " total % To Wound");

        testAttacker.setToWoundModifier(0);
        testAttacker.setToWoundReroll("ones");
        assertEquals(0.5833333333, testAttacker.totalToWoundPercentage(), 0.0000000001);
        System.out.println("Reroll 1's -- (Base wound %: " + testAttacker.baseToWound() + ") + (Mod %: " + testAttacker.modifierToWound(testAttacker.getToWoundModifier()) + ") + (Re-roll %: " + testAttacker.rerollToWound(testAttacker.getToWoundReroll()) + ") = " + testAttacker.totalToWoundPercentage() + " total % To Wound");

        testAttacker.setToWoundModifier(1);
        testAttacker.setToWoundReroll("all");
        assertEquals(0.9166666666, testAttacker.totalToWoundPercentage(), 0.0000000001);
        System.out.println("+1 To Wound / Reroll All Misses -- (Base wound %: " + testAttacker.baseToWound() + ") + (Mod %: " + testAttacker.modifierToWound(testAttacker.getToWoundModifier()) + ") + (Re-roll %: " + testAttacker.rerollToWound(testAttacker.getToWoundReroll()) + ") = " + testAttacker.totalToWoundPercentage() + " total % To Wound");
        System.out.println("\n");
    }

    @Test
    public void baseToWound_Tests() {
        System.out.println("--- Base To Wound Method---");

        // Test default 'Auto-wound' value using '0' for WpnStrength
        testAttacker.setDefender(testDefender);
        testAttacker.setWpnStrength(0);
        testDefender.setToughness(4);
        assertEquals((double) 6/6, testAttacker.baseToWound(), 0);
        System.out.println("Auto-wound: " + testAttacker.baseToWound());

        // Test WpnStrength >= 2x Toughness value
        testAttacker.setWpnStrength(8);
        assertEquals((double) 5/6, testAttacker.baseToWound(), 0);
        System.out.println("% WpnStrength > 2x Toughness value: " + testAttacker.baseToWound());

        // Test WpnStrength > Toughness value, but < 2x Toughness
        testAttacker.setWpnStrength(5);
        assertEquals((double) 4/6, testAttacker.baseToWound(), 0);
        System.out.println("% WpnStrength > Toughness value: " + testAttacker.baseToWound());

        // Test WpnStrength == Toughness value
        testAttacker.setWpnStrength(4);
        assertEquals((double) 3/6, testAttacker.baseToWound(), 0);
        System.out.println("% WpnStrength == Toughness value: " + testAttacker.baseToWound());

        // Test WpnStrength < Toughness value, but > 1/2x Toughness
        testAttacker.setWpnStrength(3);
        assertEquals((double) 2/6, testAttacker.baseToWound(), 0);
        System.out.println("% WpnStrength < Toughness value: " + testAttacker.baseToWound());

        // Test WpnStrength <= 1/2x Toughness value
        testAttacker.setWpnStrength(2);
        assertEquals((double) 1/6, testAttacker.baseToWound(), 0);
        System.out.println("% WpnStrength <= 1/2x Toughness value: " + testAttacker.baseToWound());
        System.out.println("\n");
    }

    @Test
    public void modifierToWound_Tests() {
        System.out.println("--- Modifiers To Wound ---");

        assertEquals((double) 3/6 * -1, testAttacker.modifierToWound(-3), 0);
        System.out.println("-3 to wound: " + testAttacker.modifierToWound(-3));
        assertEquals((double) 2/6 * -1, testAttacker.modifierToWound(-2), 0);
        System.out.println("-2 to wound: " + testAttacker.modifierToWound(-2));
        assertEquals((double) 1/6 * -1, testAttacker.modifierToWound(-1), 0);
        System.out.println("-1 to wound: " + testAttacker.modifierToWound(-1));

        assertEquals(0, testAttacker.modifierToWound(0), 0);
        System.out.println("0 to wound: " + testAttacker.modifierToWound(0));

        assertEquals((double) 1/6, testAttacker.modifierToWound(1), 0);
        System.out.println("+1 to wound: " + testAttacker.modifierToWound(1));
        assertEquals((double) 2/6, testAttacker.modifierToWound(2), 0);
        System.out.println("+2 to wound: " + testAttacker.modifierToWound(2));
        assertEquals((double) 3/6, testAttacker.modifierToWound(3), 0);
        System.out.println("+3 to wound: " + testAttacker.modifierToWound(3));
        System.out.println("\n");
    }

    @Test
    public void rerollToWound_Tests() {
        System.out.println("--- Reroll To Wound ---");

        // S = T to wound rerolls
        testAttacker.setWpnStrength(4);
        testAttacker.setDefender(testDefender);
        testDefender.setToughness(4);
        testAttacker.baseToWound();
        assertEquals((double) 1/12, testAttacker.rerollToWound("ones"), 0);
        System.out.println("S = T Reroll 1's: " + testAttacker.rerollToWound("ones"));

        assertEquals((double) 3/12, testAttacker.rerollToWound("all"), 0);
        System.out.println("S = T Reroll all misses: " + testAttacker.rerollToWound("all"));

        // T*2 > S > T to wound rerolls
        testAttacker.setWpnStrength(5);
        testAttacker.baseToWound();
        assertEquals(0.1111111111, testAttacker.rerollToWound("ones"), 0.0000000001);
        System.out.println("T*2 > S > T Reroll 1's: " + testAttacker.rerollToWound("ones"));

        assertEquals(0.2222222222, testAttacker.rerollToWound("all"), 0.0000000001);
        System.out.println("T*2 > S > T Reroll all misses: " + testAttacker.rerollToWound("all"));

        // S >= T*2 to wound rerolls
        testAttacker.setWpnStrength(8);
        testAttacker.baseToWound();
        assertEquals(0.1388888888, testAttacker.rerollToWound("ones"), 0.0000000001);
        System.out.println("S >= T*2 Reroll 1's: " + testAttacker.rerollToWound("ones"));

        assertEquals(0.1388888888, testAttacker.rerollToWound("all"), 0.0000000001);
        System.out.println("S >= T*2 Reroll all misses: " + testAttacker.rerollToWound("all"));

        // S < T to wound rerolls
        testAttacker.setWpnStrength(3);
        testAttacker.baseToWound();
        assertEquals(0.0555555555, testAttacker.rerollToWound("ones"), 0.0000000001);
        System.out.println("S < T Reroll 1's: " + testAttacker.rerollToWound("ones"));

        assertEquals(0.2222222222, testAttacker.rerollToWound("all"), 0.0000000001);
        System.out.println("S < T Reroll all misses: " + testAttacker.rerollToWound("all"));

        // S <= T/2 to wound rerolls
        testAttacker.setWpnStrength(2);
        testAttacker.baseToWound();
        assertEquals(0.02777777777, testAttacker.rerollToWound("ones"), 0.0000000001);
        System.out.println("S <= T/2 Reroll 1's: " + testAttacker.rerollToWound("ones"));

        assertEquals(0.1388888888, testAttacker.rerollToWound("all"), 0.0000000001);
        System.out.println("S <= T/2 Reroll all misses: " + testAttacker.rerollToWound("all"));
        System.out.println("\n");
    }

    @Test
    public void percentageToFailSave_Tests() {
        testAttacker.setDefender(testDefender);
        testDefender.setArmorSave(3);
        testDefender.setInvulnSave(4);
        assertEquals((double) 2/6, testAttacker.percentageToFailSave(), 0.0000000001);

        System.out.println("--- Percentage to Fail A Save ---");
        System.out.println("% to fail save: " + testAttacker.percentageToFailSave());
        System.out.println("\n");
    }

    @Test
    public void bestSaveSelector_Tests() {
        System.out.println("--- Best Save Selector ---");

        testAttacker.setDefender(testDefender);
        testDefender.setArmorSave(3);
        testDefender.setInvulnSave(4);
        assertEquals(3, testAttacker.bestSaveSelector());

        System.out.println("Armor Save: " + testAttacker.modifiedArmorSave() + " / Inv Save: " + testDefender.getInvulnSave() + " / Best Save: " + testAttacker.bestSaveSelector());

        testAttacker.setDefender(testDefender);
        testAttacker.setWpnArmorPen(-1);
        assertEquals(4, testAttacker.bestSaveSelector());
        System.out.println("Armor Save: " + testAttacker.modifiedArmorSave() + " / Inv Save: " + testDefender.getInvulnSave() + " / Best Save: " + testAttacker.bestSaveSelector());

        testAttacker.setDefender(testDefender);
        testAttacker.setWpnArmorPen(-2);
        assertEquals(4, testAttacker.bestSaveSelector());
        System.out.println("Armor Save: " + testAttacker.modifiedArmorSave() + " / Inv Save: " + testDefender.getInvulnSave() + " / Best Save: " + testAttacker.bestSaveSelector());

        testAttacker.setDefender(testDefender);
        testDefender.setInvulnSave(6);
        assertEquals(5, testAttacker.bestSaveSelector());
        System.out.println("Armor Save: " + testAttacker.modifiedArmorSave() + " / Inv Save: " + testDefender.getInvulnSave() + " / Best Save: " + testAttacker.bestSaveSelector());
        System.out.println("\n");
    }

    @Test
    public void modifiedArmorSave_Tests() {
        System.out.println("--- Modified Armor Saves ---");

        testAttacker.setDefender(testDefender);
        testAttacker.setWpnArmorPen(2);
        testDefender.setArmorSave(3);
        assertEquals(5, testAttacker.modifiedArmorSave());
        System.out.println("Base armor save: " + testDefender.getArmorSave() + " / Wpn AP: -" + testAttacker.getWpnArmorPen() + " / Modified save: " + testAttacker.modifiedArmorSave());

        testAttacker.setWpnArmorPen(-3);
        assertEquals(6, testAttacker.modifiedArmorSave());
        System.out.println("Base armor save: " + testDefender.getArmorSave() + " / Wpn AP: -" + testAttacker.getWpnArmorPen() + " / Modified save: " + testAttacker.modifiedArmorSave());
        System.out.println("\n");
    }

    @Test
    public void toPercentage_Test() {
        System.out.println("--- 'To Percentage' Method ---");

        // Test default value
        testAttacker.toPercentage(0);
        assertEquals((double) 6/6, testAttacker.toPercentage(0),0);
        System.out.println("Auto-hit / Auto-fail save: " + testAttacker.toPercentage(0));

        testAttacker.toPercentage(2);
        assertEquals((double) 5/6, testAttacker.toPercentage(2),0);
        System.out.println("BS 2+ / 6+ save fail %: " + testAttacker.toPercentage(2));

        testAttacker.toPercentage(3);
        assertEquals((double) 4/6, testAttacker.toPercentage(3),0);
        System.out.println("BS 3+ / 5+ save fail %: " + testAttacker.toPercentage(3));

        testAttacker.toPercentage(4);
        assertEquals((double) 3/6, testAttacker.toPercentage(4),0);
        System.out.println("BS 4+ / 4+ save fail %: " + testAttacker.toPercentage(4));

        testAttacker.toPercentage(5);
        assertEquals((double) 2/6, testAttacker.toPercentage(5),0);
        System.out.println("BS 5+ / 3+ save fail %: " + testAttacker.toPercentage(5));

        testAttacker.toPercentage(6);
        assertEquals((double) 1/6, testAttacker.toPercentage(6),0);
        System.out.println("BS 6+ / 2+ save fail %: " + testAttacker.toPercentage(6));
        System.out.println("\n");
    }
}