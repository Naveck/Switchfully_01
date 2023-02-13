package basic;

public class ArraysCodelab07 {


    /**
     * Change the following code so that it uses an array instead of a list of variables.
     * Can you see that after the change this code has become more flexible?
     */
    public static void main(String[] args) {


        double[] numbers = new double[]{34, 12, 24, 89, 10, 96, 74, 67, 46, 53};

        System.out.println("The average is: " + calculateSumOrAverage(numbers));
    }

    private static double calculateSumOrAverage(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;

        }
        return sum / numbers.length;
    }
}
