/**
 * Write a function that receives a number and returns its units.
 */
package functions;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = cin.nextInt();

        int units =  getUnits(number);
        System.out.println("Units of the number " + number + " is " + units);
    }

    private static int getUnits(int number){
        return number % 10;
    }
}
