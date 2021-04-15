/**
 * Write a function that receives a two digit number and prints its tens.
 */
package functions;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a two digit number: ");
        int number = cin.nextInt();

        printTens(number);
    }

    private static void printTens(int number) {
        int tens = (number % 100) / 10;
        System.out.println("Tens of the number " + number + " are " + tens);
    }
}
