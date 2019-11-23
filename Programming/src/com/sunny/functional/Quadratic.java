package com.sunny.functional;
/*
* created by:SunnyRaj
* Date 23/11/2019
* Purpose: this programm is used to find all roots of a quardratic equation
**/
public class Quadratic {
    public static void main(String[] args) 
    {
        double a = Utility.inputDouble(), b = Utility.inputDouble(), c = Utility.inputDouble();;
        double root1, root2;
        double determinant = b * b - 4 * a * c;
        // condition for real and different roots
        if(determinant > 0) 
        {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
        }
        // Condition for real and equal roots
        else if(determinant == 0) 
        {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        // If roots are not real
        else 
        {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}