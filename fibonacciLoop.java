import java.util.Arrays;

// main function for the fibonacci loop class

public class fibonacciLoop {

    public static void main(String[] args) {

        // declaring start of fibonacci numbers

        long precedingNumber = 1;

        long oldestPrecedingNumber = 0;

        long currentNumber = 1;

        // instantiating array

        long[] fibonacciArray = new long[51];

        fibonacciArray[0] = 1;


        for (int i = 0; i < 50; i++) {

            currentNumber = currentNumber + precedingNumber;

            oldestPrecedingNumber = precedingNumber;

            precedingNumber = currentNumber - oldestPrecedingNumber;

            fibonacciArray[i + 1] = currentNumber;

            // math

        }
        System.out.println(Arrays.toString(fibonacciArray));
    }
}