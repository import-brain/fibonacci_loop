public class fibonacci_loop {

    public static void main(String[] args) {

        // declaring start of fibonacci numbers

        long preceding_number = 1;

        long oldest_preceding_number = 0;

        long current_number = 1;

        System.out.printf("%d%n", 1);

        // for loop glitches when I use i++, quite odd....

        for (int i = 0; i < 50; i = i + 1) {

            System.out.printf("%d%n", current_number);

            current_number = current_number + preceding_number;

            oldest_preceding_number = preceding_number;

            preceding_number = current_number - oldest_preceding_number;

            // math

        }
    }
}