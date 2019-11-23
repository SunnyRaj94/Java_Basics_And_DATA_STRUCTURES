package com.sunny.functional;
/*
* created by:SunnyRaj
* Date 23/11/2019
* Purpose: this programm is used to find distance 
**/
public class Distance 
{
    public static void main(String[] args) {

        // parse x- and y-coordinates from command-line arguments
        int x = Utility.inputInteger();
        int y = Utility.inputInteger();

        // compute distance to (0, 0)
        double dist = Math.sqrt(x*x + y*y);
 
        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }   
}