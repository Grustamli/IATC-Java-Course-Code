/**
 * Write a function that receives an array and returns the elements' sum.
 */
package funcarrays;

public class Exercise03 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int sum = arraySum(arr);
        System.out.println("Sum of the elements is: " + sum);
    }

    private static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
