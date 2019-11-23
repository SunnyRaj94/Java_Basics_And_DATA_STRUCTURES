package com.sunny.functional;
/*
* created by:SunnyRaj
* Date 23/11/2019
* Purpose: this programm is used to find the effective temperature (the wind chill) to be
**/
import com.sunny.utility.FunctionalUtility;

public class WindChill 
{
    public static void main(String[] args) {
        double t = FunctionalUtility.inputDouble();
        double v = FunctionalUtility.inputDouble();
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
    }

}
