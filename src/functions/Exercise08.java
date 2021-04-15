/**
 * Write a program that receives 3 parameters and prints (void) their average.
 */

package functions;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = cin.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = cin.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = cin.nextDouble();

        printAvg(number1, number2, number3);

    }

    private static void printAvg(double number1, double number2, double number3) {
        double average = (number1 + number2 + number3) / 3;
        System.out.println("The average of the three numbers is: " + average);
    }
}
