package advanced;

public class LoopsCodelabs09 {

    /**
     * Create a method that will return the n-th fibonacci number.
     * E.g.
     * fibonacci(1) = 1
     * fibonacci(2) = 1
     * fibonacci(3) = 2
     * fibonacci(4) = 3
     * fibonacci(5) = 5
     * fibonacci(6) = 8
     * ...
     * fibonacci(n) = fibonacci(n - 1) + fibonacci (n - 2)
     */
    public static int fibonacci(int number) {
        if(number <= 0) {
            return 0;
        }
        if (number == 1 || number == 2) {
            return 1;
        }

        int previousNumber = 1;
        int currentNumber = 1;

        for (int index = 2; index < number; index++){
            int helper = currentNumber;
            currentNumber += previousNumber;
            previousNumber = helper;
        }
        return currentNumber;
    }
}
