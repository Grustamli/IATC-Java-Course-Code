/**
 * Write a function that receives a number n and prints n asterisks.
 */

package functions;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = cin.nextInt();
        printAsterics(number);
    }

    private static void printAsterics(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
