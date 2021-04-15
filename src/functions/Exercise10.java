/**
 * Write a function that receives a number a and a number b.
 * Print all the numbers * between.
 */

package functions;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = cin.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = cin.nextInt();

        printNumbersBetween(number1, number2);
    }

    private static void printNumbersBetween(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}
