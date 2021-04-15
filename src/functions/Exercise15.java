/**
 * Write a function that receives a number and prints its units.
 */
package functions;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = cin.nextInt();

        printUnits(number);
    }

    private static void printUnits(int number){
        int units =  number % 10;
        System.out.println("Units of the number " + number + " is " + units);
    }
}
