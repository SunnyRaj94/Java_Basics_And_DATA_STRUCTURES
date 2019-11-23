package com.sunny.functional;

public class WindChill 
{
    public static void main(String[] args) {
        double t = Utility.inputDouble();
        double v = Utility.inputDouble();
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
    }

}
