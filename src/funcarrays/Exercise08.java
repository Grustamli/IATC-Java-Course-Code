/**
 * Write a function that receives an array and prints its elements backwards.
 */
package funcarrays;

public class Exercise08 {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 4, -5, 6, -7, 8, 0};
        System.out.print("Printing the array backwards: ");
        printBackwards(arr);
    }

    private static void printBackwards(int[] arr) {
        // Start from the last index and print the element at that index, then decrement the index
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
