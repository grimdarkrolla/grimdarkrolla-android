package com.grimdarkrolla.java;

// Calculations for the end tallies
final public class TallyCalculations {

    // Calculates total number of defender casualties taken
    public static double totalDefenderCasualties() {

    }


    // Calculates total number of wounds caused by the attacker prior to the defender's saves
    public static double totalNumberOfWounds() {
        return totalNumberOfHits * totalToWoundPercentage;
    }

    // Calculates the total number of hits (attacker hits defender)
    public static double totalNumberOfHits(int attackerTotalShots, double totalToHitPercentage) {
        return attackerTotalShots * totalToHitPercentage;
    }

}
