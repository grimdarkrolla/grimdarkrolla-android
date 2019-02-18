package com.grimdarkrolla.java.attackmodels;

import com.grimdarkrolla.java.models.UnitType;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTypeTest {

    private UnitType testUnit = new UnitType();

    @Test
    public void setUnitName_Tests() {
        testUnit.setUnitName("Space Marine");
        assertEquals("Space Marine", testUnit.getUnitName());
        System.out.println("Unit name: " + testUnit.getUnitName());
    }

    @Test
    public void setNumberOfModels_Tests() {
        testUnit.setNumberOfModels(7);
        assertEquals(7, testUnit.getNumberOfModels());
        System.out.println("Number of models: " + testUnit.getNumberOfModels());
    }

    @Test
    public void setWpnShots_Tests() {
        testUnit.setWpnShots(3);
        assertEquals(3, testUnit.getWpnShots());
        System.out.println("Number of shots: " + testUnit.getWpnShots());
    }

    @Test
    public void setBallisticSkill_Tests() {
        testUnit.setBallisticSkill(3);
        assertEquals(3, testUnit.getBallisticSkill());
        System.out.println("BS: " + testUnit.getBallisticSkill());
    }

    @Test
    public void setWpnStrength_Tests() {
        testUnit.setWpnStrength(4);
        assertEquals(4, testUnit.getWpnStrength());
        System.out.println("Wpn Str: " + testUnit.getWpnStrength());
    }

    @Test
    public void setWpnArmorPen_Tests() {
        testUnit.setWpnArmorPen(-2);
        assertEquals(2, testUnit.getWpnArmorPen());
        System.out.println("Wpn AP: " + testUnit.getWpnArmorPen());
    }

    @Test
    public void setWpnDmg_Tests() {
        testUnit.setWpnDmg(2);
        assertEquals(2, testUnit.getWpnDmg());
        System.out.println("Wpn dmg: " + testUnit.getWpnDmg());
    }

    @Test
    public void setWpnSkill_Tests() {
        testUnit.setWpnSkill(3);
        assertEquals(3, testUnit.getWpnSkill());
        System.out.println("WS: " + testUnit.getWpnSkill());
    }

    @Test
    public void setPointCost_Tests() {
        testUnit.setPointCost(13);
        assertEquals(13, testUnit.getPointCost());
        System.out.println("Point cost: " + testUnit.getPointCost());
    }

    @Test
    public void setStrength_Tests() {
        testUnit.setStrength(4);
        assertEquals(4, testUnit.getStrength());
        System.out.println("Unit Strength: " + testUnit.getStrength());
    }

    @Test
    public void setAttacks_Tests() {
        testUnit.setAttacks(4);
        assertEquals(4, testUnit.getAttacks());
        System.out.println("Number of Attacks: " + testUnit.getAttacks());
    }

    @Test
    public void setToughness_Tests() {
        testUnit.setToughness(5);
        assertEquals(5, testUnit.getToughness());
        System.out.println("Unit Toughness: " + testUnit.getToughness());
    }

    @Test
    public void setWounds_Tests() {
        testUnit.setWounds(5);
        assertEquals(5, testUnit.getWounds());
        System.out.println("Wounds per model: " + testUnit.getWounds());
    }

    @Test
    public void setArmorSave_Tests() {
        testUnit.setArmorSave(3);
        assertEquals(3, testUnit.getArmorSave());
        System.out.println("Armor Save: " + testUnit.getArmorSave());
    }

    @Test
    public void setInvulnSave_Tests() {
        testUnit.setInvulnSave(4);
        assertEquals(4, testUnit.getInvulnSave());
        System.out.println("Invuln Save: " + testUnit.getInvulnSave());
    }

    @Test
    public void setLeadership_Tests() {
        testUnit.setLeadership(8);
        assertEquals(8, testUnit.getLeadership());
        System.out.println("Unit Leadership: " + testUnit.getLeadership());
    }

    @Test
    public void setDefender_Tests() {
        testUnit.setUnitName("Space Marine");
        testUnit.setDefender(testUnit);
        assertEquals("Space Marine", testUnit.getUnitName());
        assertNotNull(testUnit.getDefender());
    }

    @Test
    public void getUnitName_Tests() {
        testUnit.setUnitName("Space Marine");
        assertNotEquals("Eldar", testUnit.getUnitName());
    }

    @Test
    public void getNumberOfModels_Tests() {
        testUnit.setNumberOfModels(2);
        assertNotEquals(6, testUnit.getNumberOfModels());
    }

    @Test
    public void getWpnShots_Tests() {
        testUnit.setWpnShots(2);
        assertNotEquals(1, testUnit.getWpnShots());
    }

    @Test
    public void getBallisticSkill_Tests() {
        testUnit.setBallisticSkill(3);
        assertNotEquals(4, testUnit.getBallisticSkill());
    }

    @Test
    public void getWpnStrength_Tests() {
        testUnit.setWpnStrength(6);
        assertNotEquals(3, testUnit.getWpnStrength());
    }

    @Test
    public void getWpnArmorPen_Tests() {
        testUnit.setWpnArmorPen(-4);
        assertNotEquals(-4, testUnit.getWpnArmorPen());
    }

    @Test
    public void getWpnDmg_Tests() {
        testUnit.setWpnDmg(4);
        assertNotEquals(1, testUnit.getWpnDmg());
    }

    @Test
    public void getPointCost_Tests() {
        testUnit.setPointCost(10);
        assertNotEquals(0, testUnit.getPointCost());
    }

    @Test
    public void getWpnSkill_Tests() {
        testUnit.setWpnStrength(5);
        assertNotEquals(2, testUnit.getWpnSkill());
    }

    @Test
    public void getStrength_Tests() {
        testUnit.setStrength(6);
        assertNotEquals(1, testUnit.getStrength());
    }

    @Test
    public void getAttacks_Tests() {
        testUnit.setAttacks(2);
        assertNotEquals(1, testUnit.getAttacks());
    }

    @Test
    public void getToughness_Tests() {
        testUnit.setToughness(2);
        assertNotEquals(4, testUnit.getToughness());
    }

    @Test
    public void getWounds_Tests() {
        testUnit.setWounds(1);
        assertNotEquals(3, testUnit.getWounds());
    }

    @Test
    public void getArmorSave_Tests() {
        testUnit.setArmorSave(6);
        assertNotEquals(2, testUnit.getArmorSave());
    }

    @Test
    public void getInvulnSave_Tests() {
        testUnit.setInvulnSave(2);
        assertNotEquals(4, testUnit.getInvulnSave());
    }

    @Test
    public void getLeadership_Tests() {
        testUnit.setLeadership(5);
        assertNotEquals(8, testUnit.getLeadership());
    }

    @Test
    public void getDefender_Tests() {
        testUnit.setDefender(testUnit);
        assertNotNull(testUnit.getDefender());
    }

    @Test
    public void totalDefenderCasualties_Tests() {
        testUnit.setNumberOfModels(5);
        testUnit.setWpnShots(2);
        testUnit.setBallisticSkill(3);
        testUnit.setDefender(testUnit);
        testUnit.setWpnStrength(4);
        testUnit.setToughness(4);
        testUnit.setArmorSave(3);
        testUnit.setInvulnSave(4);
        testUnit.setWpnDmg(2);
        testUnit.setWounds(2);
        assertEquals(1, testUnit.totalDefenderCasualties(), 0);
    }

    @Test
    public void totalDamageDealt_Tests() {
        testUnit.setNumberOfModels(5);
        testUnit.setWpnShots(2);
        testUnit.setBallisticSkill(3);
        testUnit.setDefender(testUnit);
        testUnit.setWpnStrength(4);
        testUnit.setToughness(4);
        testUnit.setArmorSave(3);
        testUnit.setInvulnSave(4);
        testUnit.setWpnDmg(2);
        assertEquals(2.2222222222, testUnit.totalDamageDealt(), 0.0000000001);
    }

    @Test
    public void totalNumberOfUnsavedWounds_Tests() {
        testUnit.setNumberOfModels(5);
        testUnit.setWpnShots(2);
        testUnit.setBallisticSkill(3);
        testUnit.setDefender(testUnit);
        testUnit.setWpnStrength(4);
        testUnit.setToughness(4);
        testUnit.setArmorSave(3);
        testUnit.setInvulnSave(4);
        assertEquals(1.1111111111, testUnit.totalNumberOfUnsavedWounds(), 0.0000000001);
    }

    @Test
    public void totalNumberOfWounds_Tests() {
        testUnit.setNumberOfModels(5);
        testUnit.setWpnShots(2);
        testUnit.setBallisticSkill(3);
        testUnit.setDefender(testUnit);
        testUnit.setWpnStrength(4);
        testUnit.setToughness(4);
        assertEquals(3.3333333333, testUnit.totalNumberOfWounds(), 0.0000000001);
    }

    @Test
    public void totalNumberOfHits_Tests() {
        testUnit.setNumberOfModels(5);
        testUnit.setWpnShots(2);
        testUnit.setBallisticSkill(3);
        assertEquals(6.6666666666, testUnit.totalNumberOfHits(), 0.0000000001);
    }

    @Test
    public void totalNumberOfShots_Tests() {
        testUnit.setNumberOfModels(5);
        testUnit.setWpnShots(2);
        assertEquals(10, testUnit.totalNumberOfShots());
    }

    @Test
    public void totalToHitPercentage_Tests() {
        testUnit.setBallisticSkill(3);
        assertEquals((double) 4/6, testUnit.totalToHitPercentage(), 0);
        System.out.println("(BS %: " + testUnit.ballisticSkillToHit() + ") + (Mod %: " + testUnit.modifierToHit() + ") + (Re-roll %: " + testUnit.rerollToHit() + ") = " + testUnit.totalToHitPercentage() + " total % To Hit");
    }

    @Test
    public void ballisticSkillToHit_Tests() {
        testUnit.setBallisticSkill(0);
        assertEquals((double) 6/6, testUnit.ballisticSkillToHit(), 0);
        System.out.println("BS 0 = Auto-hit: " + testUnit.ballisticSkillToHit());

        testUnit.setBallisticSkill(2);
        assertEquals((double) 5/6, testUnit.ballisticSkillToHit(), 0);
        System.out.println("BS 2+ %: " + testUnit.ballisticSkillToHit());

        testUnit.setBallisticSkill(3);
        assertEquals((double) 4/6, testUnit.ballisticSkillToHit(), 0);
        System.out.println("BS 3+ %: " + testUnit.ballisticSkillToHit());

        testUnit.setBallisticSkill(4);
        assertEquals((double) 3/6, testUnit.ballisticSkillToHit(), 0);
        System.out.println("BS 4+ %: " + testUnit.ballisticSkillToHit());

        testUnit.setBallisticSkill(5);
        assertEquals((double) 2/6, testUnit.ballisticSkillToHit(), 0);
        System.out.println("BS 5+ %: " + testUnit.ballisticSkillToHit());

        testUnit.setBallisticSkill(6);
        assertEquals((double) 1/6, testUnit.ballisticSkillToHit(), 0);
        System.out.println("BS 6+ %: " + testUnit.ballisticSkillToHit());
    }

    @Test
    public void modifierToHit_Tests() {
    }

    @Test
    public void rerollToHit_Tests() {
    }

    @Test
    public void totalToWoundPercentage_Tests() {
        testUnit.setDefender(testUnit);
        testUnit.setWpnStrength(4);
        testUnit.setToughness(4);
        assertEquals((double) 3/6, testUnit.totalToWoundPercentage(), 0);
        System.out.println("(Base wound %: " + testUnit.baseToWound() + ") + (Mod %: " + testUnit.modifierToWound() + ") + (Re-roll %: " + testUnit.rerollToWound() + ") = " + testUnit.totalToWoundPercentage() + " total % To Wound");
    }

    @Test
    public void baseToWound_Tests() {
        // Test default 'Auto-wound' value using '0' for WpnStrength
        testUnit.setDefender(testUnit);
        testUnit.setWpnStrength(0);
        testUnit.setToughness(4);
        assertEquals((double) 6/6, testUnit.baseToWound(), 0);
        System.out.println("Auto-wound: " + testUnit.baseToWound());

        // Test WpnStrength >= 2x Toughness value
        testUnit.setDefender(testUnit);
        testUnit.setWpnStrength(8);
        testUnit.setToughness(4);
        assertEquals((double) 5/6, testUnit.baseToWound(), 0);
        System.out.println("% WpnStrength > 2x Toughness value: " + testUnit.baseToWound());

        // Test WpnStrength > Toughness value, but < 2x Toughness
        testUnit.setDefender(testUnit);
        testUnit.setWpnStrength(5);
        testUnit.setToughness(4);
        assertEquals((double) 4/6, testUnit.baseToWound(), 0);
        System.out.println("% WpnStrength > Toughness value: " + testUnit.baseToWound());

        // Test WpnStrength == Toughness value
        testUnit.setDefender(testUnit);
        testUnit.setWpnStrength(4);
        testUnit.setToughness(4);
        assertEquals((double) 3/6, testUnit.baseToWound(), 0);
        System.out.println("% WpnStrength == Toughness value: " + testUnit.baseToWound());

        // Test WpnStrength < Toughness value, but > 1/2x Toughness
        testUnit.setDefender(testUnit);
        testUnit.setWpnStrength(3);
        testUnit.setToughness(4);
        assertEquals((double) 2/6, testUnit.baseToWound(), 0);
        System.out.println("% WpnStrength < Toughness value: " + testUnit.baseToWound());

        // Test WpnStrength < Toughness value
        testUnit.setDefender(testUnit);
        testUnit.setWpnStrength(2);
        testUnit.setToughness(4);
        assertEquals((double) 1/6, testUnit.baseToWound(), 0);
        System.out.println("% WpnStrength <= 1/2x Toughness value: " + testUnit.baseToWound());
    }

    @Test
    public void modifierToWound_Tests() {
    }

    @Test
    public void rerollToWound_Tests() {
    }

    @Test
    public void percentageToFailSave_Tests() {
        testUnit.setDefender(testUnit);
        testUnit.setArmorSave(3);
        testUnit.setInvulnSave(4);
        assertEquals((double) 2/6, testUnit.percentageToFailSave(), 0.0000000001);
        System.out.println("% to fail save: " + testUnit.percentageToFailSave());
    }

    @Test
    public void bestSaveSelector_Tests() {
        testUnit.setDefender(testUnit);
        testUnit.setArmorSave(3);
        testUnit.setInvulnSave(4);
        assertEquals(3, testUnit.bestSaveSelector());
        System.out.println("Armor Save: " + testUnit.modifiedArmorSave() + " / Inv Save: " + testUnit.getInvulnSave() + " / Best Save: " + testUnit.bestSaveSelector());

        testUnit.setDefender(testUnit);
        testUnit.setArmorSave(3);
        testUnit.setWpnArmorPen(-1);
        testUnit.setInvulnSave(4);
        assertEquals(4, testUnit.bestSaveSelector());
        System.out.println("Armor Save: " + testUnit.modifiedArmorSave() + " / Inv Save: " + testUnit.getInvulnSave() + " / Best Save: " + testUnit.bestSaveSelector());

        testUnit.setDefender(testUnit);
        testUnit.setArmorSave(3);
        testUnit.setWpnArmorPen(-2);
        testUnit.setInvulnSave(4);
        assertEquals(4, testUnit.bestSaveSelector());
        System.out.println("Armor Save: " + testUnit.modifiedArmorSave() + " / Inv Save: " + testUnit.getInvulnSave() + " / Best Save: " + testUnit.bestSaveSelector());

        testUnit.setDefender(testUnit);
        testUnit.setArmorSave(3);
        testUnit.setWpnArmorPen(-2);
        testUnit.setInvulnSave(6);
        assertEquals(5, testUnit.bestSaveSelector());
        System.out.println("Armor Save: " + testUnit.modifiedArmorSave() + " / Inv Save: " + testUnit.getInvulnSave() + " / Best Save: " + testUnit.bestSaveSelector());
    }

    @Test
    public void modifiedArmorSave_Tests() {
        testUnit.setDefender(testUnit);
        testUnit.setArmorSave(3);
        testUnit.setWpnArmorPen(2);
        assertEquals(5, testUnit.modifiedArmorSave());
        System.out.println("Base armor save: " + testUnit.getArmorSave() + " / Wpn AP: " + testUnit.getWpnArmorPen() + " / Modified save: " + testUnit.modifiedArmorSave());
    }

    @Test
    public void toPercentage_Test() {
        // Test default value
        testUnit.toPercentage(0);
        assertEquals((double) 6/6, testUnit.toPercentage(0),0);
        System.out.println("Auto-hit / Auto-fail save: " + testUnit.toPercentage(0));

        testUnit.toPercentage(2);
        assertEquals((double) 5/6, testUnit.toPercentage(2),0);
        System.out.println("BS 2+ / 6+ save fail %: " + testUnit.toPercentage(2));

        testUnit.toPercentage(3);
        assertEquals((double) 4/6, testUnit.toPercentage(3),0);
        System.out.println("BS 3+ / 5+ save fail %: " + testUnit.toPercentage(3));

        testUnit.toPercentage(4);
        assertEquals((double) 3/6, testUnit.toPercentage(4),0);
        System.out.println("BS 4+ / 4+ save fail %: " + testUnit.toPercentage(4));

        testUnit.toPercentage(5);
        assertEquals((double) 2/6, testUnit.toPercentage(5),0);
        System.out.println("BS 5+ / 3+ save fail %: " + testUnit.toPercentage(5));

        testUnit.toPercentage(6);
        assertEquals((double) 1/6, testUnit.toPercentage(6),0);
        System.out.println("BS 6+ / 2+ save fail %: " + testUnit.toPercentage(6));
    }
}