package basic;

public class MethodsCodelab07 {

    public static void main(String[] args) {
        // Create a method add, making the addition of its two parameters and returning the result (all type double)
        // Create a method subtract, subtracting the first parameter by the second and returning the result (all type double)
        // Create a method multiply, multiplying it's two parameters and returning the result (all type double)
        // Create a method divide, dividing the first parameter by the second and returning the result (all type double)
        // Transform the following equation using only your newly created methods. Print out the result:
        //  --> ((4.5 + 3.5) / 2.0) + (2.0 * (4.5 - 1.5))
        //  --> e.g.: (1 + 1) should we written as add(1, 1)

        double firstHalf = divide(add(4.5, 3.5), 2.0);
        double secondHalf = multiply(2.0, subtract(4.5, 1.5));

        double finalResult = add(firstHalf, secondHalf);

        System.out.println(finalResult);
    }

    private static double add(double int1, double int2) {
        return int1 + int2;
    }

    private static double subtract(double int1, double int2) {
        return int1 - int2;
    }

    private static double multiply(double int1, double int2) {
        return int1 * int2;
    }

    private static double divide(double int1, double int2) {
        return int1 / int2;
    }

}
