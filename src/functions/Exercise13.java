/**
 * Write a function that receives a two digit number and returns its tens.
 */
package functions;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a two digit number: ");
        int number = cin.nextInt();

        int tens =  getTens(number);
        System.out.println("Tens of the number " + number + " are " + tens);
    }

    private static int getTens(int number){
        return (number % 100) / 10;
    }
}
