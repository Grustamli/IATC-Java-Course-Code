/**
 * Write a program that receives 3 parameters and returns their sum
 */

package functions;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = cin.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = cin.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = cin.nextDouble();

        double sum = sum(number1, number2, number3);
        System.out.print("The sum of the three numbers is: " + sum);
    }

    private static double sum(double number1, double number2, double number3) {
        return number1 + number2 + number3;
    }
}
