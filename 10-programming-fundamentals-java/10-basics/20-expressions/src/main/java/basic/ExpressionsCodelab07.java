package basic;

public class ExpressionsCodelab07 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 7");
        System.out.println("--------------");

        // ----------------
        // Create a double variable that holds the division of 2 other int variables (with values 9 and 2)
        // Print the result using: System.out.println("Printing division: " + <YOUR_DIVISION_VARIABLE_NAME>);
        // Inspect the result, does it look as desired? Weren't we expecting something else?

        int first = 9;
        int second = 2;

        double division = first / second;

        System.out.println(division);

        // No, we lose the .5 precision because we divide an int by an int, which results in a value of int
        // (stored in a double variable)
        // To convert to double, multiply one of the numbers with 1.0 to convert them to a double
        // double division = 1.0 * first / second;
    }

}
