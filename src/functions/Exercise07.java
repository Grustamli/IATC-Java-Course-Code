/**
 * Write a program that receives 3 parameters and prints (void) their sum
 */

package functions;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = cin.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = cin.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = cin.nextDouble();

        printSum(number1, number2, number3);
    }

    private static void printSum(double number1, double number2, double number3) {
        double sum = number1 + number2 + number3;
        System.out.println("The sum of the three numbers is: " + sum);
    }
}
