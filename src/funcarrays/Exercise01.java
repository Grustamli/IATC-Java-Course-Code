/**
 * Write a function that receives an array and an integer x. The function will accept x
 * elements to the array.
 */
package funcarrays;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter a number: ");
        int number = cin.nextInt();
        populateArray(arr, number);

        System.out.print("Elements of the array: ");

        // Print all elements of the array, arr
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void populateArray(int[] arr, int x){
        for (int i = 0; i < arr.length; i++){
            arr[i] = x;
        }
    }
}
