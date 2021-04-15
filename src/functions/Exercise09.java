/**
 * Write a function that doesn’t get any parameters, and prints 10 asterisks.
 */

package functions;

public class Exercise09 {
    public static void main(String[] args) {
        printAsterics();
    }

    private static void printAsterics(){
        int astericsCount = 10;
        for (int i = 0; i < astericsCount; i++){
            System.out.print("*");
        }
    }
}
