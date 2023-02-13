package basic;

public class MethodsCodelab10 {

    public static void main(String[] args) {

        //--------
        // Try to remove the duplication of this code

        printRevolves("Earth");
        printRevolves("Mars");
        printRevolves("Mercury");
        printRevolves("Venus");

    }

    private static void printRevolves(String planet){
        System.out.println(planet + " revolves around the sun");
    }
}
