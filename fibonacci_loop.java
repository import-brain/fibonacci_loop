public class fibonacci_loop {

    public static void main(String[] args) {

        // declaring start of fibonacci numbers

        long precedingNumber = 1;

        long oldestPrecedingNumber = 0;

        long currentNumber = 1;

        System.out.printf("%d%n", 1);

        // instantiating array

        long[] fibonacciArray = new long[50];

        // for loop glitches when I use i++, quite odd....

        for (int i = 0; i < 50; i = i + 1) {

            System.out.printf("%d%n", currentNumber);

            currentNumber = currentNumber + precedingNumber;

            oldestPrecedingNumber = precedingNumber;

            precedingNumber = currentNumber - oldestPrecedingNumber;

            // math

        }
    }
}