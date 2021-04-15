/**
 * Write a program that receives 3 parameters and prints (void) the maximum.
 */

package functions;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = cin.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = cin.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = cin.nextDouble();

        printMax(number1, number2, number3);
    }

    private static void printMax(double number1, double number2, double number3) {
        String baseStr = "The maximum of the three numbers is: ";
        if (number1 > number2 && number1 > number3)
            System.out.println(baseStr + number1);
        else if (number2 > number1 && number2 > number3)
            System.out.println(baseStr + number2);
        else
            System.out.println(baseStr + number3);
    }
}
