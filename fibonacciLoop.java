import java.util.Arrays;
import java.util.Scanner;

// main function for the fibonacci loop class

public class fibonacciLoop {

    public static void main(String[] args) {

        // declaring start of fibonacci numbers

        long precedingNumber = 1;

        long oldestPrecedingNumber = 0;

        long currentNumber = 1;

        // ask user for input

        Scanner myScanner = new Scanner(System.in);

        System.out.println("How long do you want the fibonacci sequence to continue for? ");

        int length = myScanner.nextInt();

        myScanner.close();

        // instantiating array

        long[] fibonacciArray = new long[length + 1];

        fibonacciArray[0] = 1;


        for (int i = 0; i < length; i++) {

            currentNumber = currentNumber + precedingNumber;

            oldestPrecedingNumber = precedingNumber;

            precedingNumber = currentNumber - oldestPrecedingNumber;

            fibonacciArray[i + 1] = currentNumber;

            // math

        }
        System.out.println(Arrays.toString(fibonacciArray));
    }
}