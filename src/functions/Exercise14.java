/**
 * Write a function that receives 3 parameters and prints 1 if each parameter is bigger
 * than 100. Else prints 0.
 */

package functions;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = cin.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = cin.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = cin.nextDouble();

        checkAllBiggerThan100(number1, number2, number3);

    }

    private static void checkAllBiggerThan100(double number1, double number2, double number3) {
        int hundred = 100;
        if (number1 > hundred && number2 > hundred && number3 > hundred)
            System.out.println("Result: " + 1);
        else
            System.out.println("Result: " + 0);
    }
}
