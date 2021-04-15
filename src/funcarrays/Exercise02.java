/**
 * Write a function that receives an array and prints all the elements.
 */
package funcarrays;

public class Exercise02 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        System.out.print("Elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
