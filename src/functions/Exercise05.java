/**
 * Write a program that receives 3 parameters and returns the maximum.
 */

package functions;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = cin.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = cin.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = cin.nextDouble();

        double maximum = maximum(number1, number2, number3);
        System.out.println("The maximum of the three numbers is: " + maximum);
    }

    private static double maximum(double number1, double number2, double number3) {
        if (number1 > number2 && number1 > number3)
            return number1;
        if (number2 > number1 && number2 > number3)
            return number2;
        return number3;
    }
}
