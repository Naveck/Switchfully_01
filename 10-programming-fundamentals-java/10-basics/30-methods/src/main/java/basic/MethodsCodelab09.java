package basic;

public class MethodsCodelab09 {

    public static void main(String[] args) {
        // Create a method easyPrint that takes an int (i.e. valueToPrint) as parameter
        //      and prints the following message: "Easy printing value: <valueToPrint>"
        // Overload method easyPrint so that it takes a String (i.e. valueToPrint) as parameter
        //      and prints the following message: "Easy printing value: <valueToPrint>"
        // Overload method easyPrint so that it takes a double (i.e. valueToPrint) as parameter
        //      and prints the following message: "Easy printing value: <valueToPrint>"
        // Call easyPrint (3 times) with values 105, "Mark" and 80.45

        easyPrint(105);
        easyPrint("Mark");
        easyPrint(80.45);
    }

    private static void easyPrint(int valueToPrint){
        System.out.println(String.format("Easy printing value: %d", valueToPrint));
    }

    private static void easyPrint(String valueToPrint){
        System.out.println(String.format("Easy printing value: %s", valueToPrint));
    }

    private static void easyPrint(double valueToPrint){
        System.out.println(String.format("Easy printing value: %f", valueToPrint));
    }



}
