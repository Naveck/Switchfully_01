package basic;

public class MethodsCodelab06 {

    public static void main(String[] args) {
        // Create a method add
        // Method add should define 2 parameters (both doubles)
        // Method add should return the addition of both parameters (as a double)
        // call the add method with arguments 80.51 and 10.01 and print the result
        // is there something wrong with the result? Try to solve this.
        // check the solutions folder if you can't find a way to show the correct result

        System.out.printf("%1.2f", add(80.51, 10.01));
    }

    private static double add(double int1, double int2){
        return int1 + int2;
    }

}
