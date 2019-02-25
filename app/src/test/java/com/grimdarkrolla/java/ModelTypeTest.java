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
        System.out.println("Model name: " + testAttacker.getModelName());
    }

    @Test
    public void setNumberOfModels_Tests() {
        testAttacker.setNumberOfModels(7);
        assertEquals(7, testAttacker.getNumberOfModels());
        System.out.println("Number of models: " + testAttacker.getNumberOfModels());
    }

    @Test
    public void setWpnShots_Tests() {
        testAttacker.setWpnShots(3);
        assertEquals(3, testAttacker.getWpnShots());
        System.out.println("Number of shots: " + testAttacker.getWpnShots());
    }

    @Test
    public void setBallisticSkill_Tests() {
        testAttacker.setBallisticSkill(3);
        assertEquals(3, testAttacker.getBallisticSkill());
        System.out.println("BS: " + testAttacker.getBallisticSkill());
    }

    @Test
    public void setWpnStrength_Tests() {
        testAttacker.setWpnStrength(4);
        assertEquals(4, testAttacker.getWpnStrength());
        System.out.println("Wpn Str: " + testAttacker.getWpnStrength());
    }

    @Test
    public void setWpnArmorPen_Tests() {
        testAttacker.setWpnArmorPen(-2);
        assertEquals(2, testAttacker.getWpnArmorPen());
        System.out.println("Wpn AP: " + testAttacker.getWpnArmorPen());
    }

    @Test
    public void setWpnDmg_Tests() {
        testAttacker.setWpnDmg(2);
        assertEquals(2, testAttacker.getWpnDmg());
        System.out.println("Wpn dmg: " + testAttacker.getWpnDmg());
    }

    @Test
    public void setWpnSkill_Tests() {
        testAttacker.setWpnSkill(3);
        assertEquals(3, testAttacker.getWpnSkill());
        System.out.println("WS: " + testAttacker.getWpnSkill());
    }

    @Test
    public void setPointCost_Tests() {
        testAttacker.setPointCost(13);
        assertEquals(13, testAttacker.getPointCost());
        System.out.println("Point cost: " + testAttacker.getPointCost());
    }

    @Test
    public void setStrength_Tests() {
        testAttacker.setStrength(4);
        assertEquals(4, testAttacker.getStrength());
        System.out.println("Unit Strength: " + testAttacker.getStrength());
    }

    @Test
    public void setAttacks_Tests() {
        testAttacker.setAttacks(4);
        assertEquals(4, testAttacker.getAttacks());
        System.out.println("Number of Attacks: " + testAttacker.getAttacks());
    }

    @Test
    public void setToughness_Tests() {
        testDefender.setToughness(5);
        assertEquals(5, testDefender.getToughness());
        System.out.println("Model Toughness: " + testDefender.getToughness());
    }

    @Test
    public void setWounds_Tests() {
        testDefender.setWounds(4);
        assertEquals(4, testDefender.getWounds());
        System.out.println("Wounds per model: " + testDefender.getWounds());
    }

    @Test
    public void setArmorSave_Tests() {
        testDefender.setArmorSave(3);
        assertEquals(3, testDefender.getArmorSave());
        System.out.println("Armor Save: " + testDefender.getArmorSave());
    }

    @Test
    public void setInvulnSave_Tests() {
        testDefender.setInvulnSave(4);
        assertEquals(4, testDefender.getInvulnSave());
        System.out.println("Invuln Save: " + testDefender.getInvulnSave());
    }

    @Test
    public void setLeadership_Tests() {
        testDefender.setLeadership(8);
        assertEquals(8, testDefender.getLeadership());
        System.out.println("Unit Leadership: " + testDefender.getLeadership());
    }

    @Test
    public void setDefender_Tests() {
        testDefender.setModelName("Space Marine");
        testAttacker.setDefender(testDefender);
        assertNotNull(testAttacker.getDefender());
        System.out.println("Defender name: " + testAttacker.getDefender().getModelName());
    }

    @Test
    public void getModelName_Tests() {
        testAttacker.setModelName("Space Marine");
        assertNotEquals("Eldar", testAttacker.getModelName());
        assertEquals("Space Marine", testAttacker.getModelName());
        System.out.println(testAttacker.getModelName());

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
        System.out.println("(Total casualties caused: " + testAttacker.totalDefenderCasualties() + ") / (Model cost: " + testAttacker.getPointCost() + " * Number of Models: " + testAttacker.getNumberOfModels() + ") = Combat Efficiency: " + testAttacker.totalCombatEfficiency());
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
    }

    @Test
    public void totalNumberOfHits_Tests() {
        testAttacker.setNumberOfModels(5);
        testAttacker.setWpnShots(2);
        testAttacker.setBallisticSkill(3);
        assertEquals(6.6666666666, testAttacker.totalNumberOfHits(), 0.0000000001);
    }

    @Test
    public void totalNumberOfShots_Tests() {
        testAttacker.setNumberOfModels(5);
        testAttacker.setWpnShots(2);
        assertEquals(10, testAttacker.totalNumberOfShots());
    }

    @Test
    public void totalToHitPercentage_Tests() {
        testAttacker.setBallisticSkill(3);
        assertEquals((double) 4/6, testAttacker.totalToHitPercentage(), 0);
        System.out.println("(BS %: " + testAttacker.ballisticSkillToHit() + ") + (Mod %: " + testAttacker.modifierToHit() + ") + (Re-roll %: " + testAttacker.rerollToHit() + ") = " + testAttacker.totalToHitPercentage() + " total % To Hit");
    }

    @Test
    public void ballisticSkillToHit_Tests() {
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
    }

    @Test
    public void modifierToHit_Tests() {
    }

    @Test
    public void rerollToHit_Tests() {
    }

    @Test
    public void totalToWoundPercentage_Tests() {
        testAttacker.setDefender(testDefender);
        testAttacker.setWpnStrength(4);
        testDefender.setToughness(4);
        assertEquals((double) 3/6, testAttacker.totalToWoundPercentage(), 0);
        System.out.println("(Base wound %: " + testAttacker.baseToWound() + ") + (Mod %: " + testAttacker.modifierToWound() + ") + (Re-roll %: " + testAttacker.rerollToWound() + ") = " + testAttacker.totalToWoundPercentage() + " total % To Wound");
    }

    @Test
    public void baseToWound_Tests() {
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
    }

    @Test
    public void modifierToWound_Tests() {
    }

    @Test
    public void rerollToWound_Tests() {
    }

    @Test
    public void percentageToFailSave_Tests() {
        testAttacker.setDefender(testDefender);
        testDefender.setArmorSave(3);
        testDefender.setInvulnSave(4);
        assertEquals((double) 2/6, testAttacker.percentageToFailSave(), 0.0000000001);
        System.out.println("% to fail save: " + testAttacker.percentageToFailSave());
    }

    @Test
    public void bestSaveSelector_Tests() {
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
    }

    @Test
    public void modifiedArmorSave_Tests() {
        testAttacker.setDefender(testDefender);
        testAttacker.setWpnArmorPen(2);
        testDefender.setArmorSave(3);
        assertEquals(5, testAttacker.modifiedArmorSave());
        System.out.println("Base armor save: " + testDefender.getArmorSave() + " / Wpn AP: -" + testAttacker.getWpnArmorPen() + " / Modified save: " + testAttacker.modifiedArmorSave());

        testAttacker.setWpnArmorPen(-3);
        assertEquals(6, testAttacker.modifiedArmorSave());
        System.out.println("Base armor save: " + testDefender.getArmorSave() + " / Wpn AP: -" + testAttacker.getWpnArmorPen() + " / Modified save: " + testAttacker.modifiedArmorSave());

    }

    @Test
    public void toPercentage_Test() {
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
    }
}