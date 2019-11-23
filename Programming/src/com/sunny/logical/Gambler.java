package com.sunny.logical;
/*
* created by:SunnyRaj
* Date 23/11/2019
* Purpose: this is a gambling game programm
**/
import com.sunny.utility.LogicalUtility;

public class Gambler { 

    public static void main(String[] args) {
    	System.out.println("Enter stack amount");
        int stake  = LogicalUtility.inputInteger();    // gambler's stating bankroll
        System.out.println("Enter goal amount");
        int goal   = LogicalUtility.inputInteger();   // gambler's desired bankroll
        System.out.println("Enter trails amount");
        int trials = LogicalUtility.inputInteger();   // number of trials to perform

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}