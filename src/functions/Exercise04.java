/**
 * Write a program that receives 3 parameters and returns their average.
 */

package functions;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = cin.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = cin.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = cin.nextDouble();

        double average = average(number1, number2, number3);
        System.out.println("The average of the three numbers is: " + average);
    }

    private static double average(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3;
    }
}
