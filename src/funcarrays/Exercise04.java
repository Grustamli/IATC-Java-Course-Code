/**
 * Write a function that receives an array and returns the sum of all the positive numbers.
 */
package funcarrays;

public class Exercise04 {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 4, -5, 6, -7, 8, 0};
        int sum = arrayPositiveSum(arr);
        System.out.println("Sum of the positive elements is: " + sum);
    }

    private static int arrayPositiveSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (elem > 0) sum += elem;
        }
        return sum;
    }
}
