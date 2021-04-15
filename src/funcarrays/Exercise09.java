/**
 * Write a function that receives an array and returns the maximum number.
 */
package funcarrays;

public class Exercise09 {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 4, -5, 6, -7, 8, 0};
        int arrayMax = max(arr);
        System.out.println("Maximum element of the array is: " + arrayMax);
    }

    private static int max(int[] arr) {
        int max = arr[0]; // Set first element of the array as maximum for now...

        /* iterate over the array and check if the current element is higher than the max.
           If it is, set max to current looked element */
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (elem > max) max = elem;
        }
        return max;
    }
}
