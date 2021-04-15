/**
 * Write a function that receives 3 parameters and returns 1 if each parameter is bigger
 * than 100. Else return 0.
 */

package functions;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = cin.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = cin.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = cin.nextDouble();

        int result = checkAllBiggerThan100(number1, number2, number3);
        System.out.println("Result: " + result);

    }

    private static int checkAllBiggerThan100(double number1, double number2, double number3) {
        int hundred = 100;
        if (number1 > hundred && number2 > hundred && number3 > hundred)
            return 1;
        else
            return 0;
    }
}
