package advanced;

public class LoopsCodelabs01 {

    public static void main(String[] args) {
        triangle(10);
    }

    /**
     * Prints out a triangle of height <height>
     * e.g. triangle(2) --> *
     * **
     * <p>
     * e.g. triangle(4) --> *
     * **
     * ***
     * ****
     * <p>
     * e.g. triangle(0) --> ""
     * <p>
     * <p>
     * If you're stuck try to solve these two problems:
     * 1. Create a method that will print a rectangle of width 4 and height <heigh>
     * e.g. rectangle(2) --> ****
     * ****
     * <p>
     * e.g. rectangle(4) --> ****
     * ****
     * ****
     * ****
     * <p>
     * 2. Create a method that will print a line of a given length
     * e.g. line(2)     --> **
     * <p>
     * e.g. line(4)     --> ****
     * <p>
     * Now try to combine these two methods!
     */
    public static void triangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
