/**
 * Write a function that receives an array and returns the sum of all the elements that has a
 * value higher than 100.
 */
package funcarrays;

public class Exercise05 {
    public static void main(String[] args) {
        int arr[] = {101, 88, 234, 12, -5, 6, 44, 8, 0};
        int sum = arraySumOver100(arr);
        System.out.println("Sum of the elements higher than 100 is: " + sum);
    }

    private static int arraySumOver100(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (elem > 100) sum += elem;
        }
        return sum;
    }
}
