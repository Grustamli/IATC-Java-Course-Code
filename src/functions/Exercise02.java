/**
 * Write a program that receives 2 parameters and returns their multiplication
 */

package functions;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = cin.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = cin.nextDouble();

        double product = multiply(number1, number2);
        System.out.print("The product of the two numbers is: " + product);
    }

    private static double multiply(double number1, double number2){
        return number1 * number2;
    }
}
