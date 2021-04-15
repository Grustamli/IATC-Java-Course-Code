/**
 * Write a function that receives an array and returns how many elements can be divided
 * by 3.
 */
package funcarrays;

public class Exercise07 {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 4, -5, 6, -7, 8, 0};
        int divisibleByThreeCount = countDivisibleByThree(arr);
        System.out.println("Number of elements divisible by 3 is: " + divisibleByThreeCount);
    }

    private static int countDivisibleByThree(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (elem != 0 && elem % 3 == 0) count++;
        }
        return count;
    }
}
