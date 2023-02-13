package advanced.codelab02;

import java.awt.*;

public class HouseApplication {

    /**
     * Do the following
     * ------------------
     *
     * Start by having a quick look at all the different .java files (BigCanvas, BigSquare,...).
     * It's perfectly fine if you see things you don't understand (yet).
     *
     * Then, create a BigWindow object (width 1000 and height 450)
     * Create a BigCanvas object
     *      Create Shape objects (BigCircle, BigSquare and BigTriangle) and add them to the BigCanvas object.
     *      (3 houses, 1 sun in total: read below)
     * Add the BigCanvas object, as a "component" to the BigWindow object
     * Call the method to launch the BigWindow object.
     *
     * Run the application, we want to see the following:
     *      A completely red house on the bottom-left
     *      A house with a black roof and a yellow building in the bottom-middle
     *      A completely blue house on the bottom-right
     *      A yellow sun on the top-right
     *
     * Hint:
     *   - Take a look at the house-and-sun.png screenshot for a final result.
     *   - A house is made with one BigSquare and one BigTriangle
     *   - A sun is made with BigCircle
     *   - When a shape is not visible, it might be possible it is drawn outside of the dimensions of the BigCanvas.
     *      - E.g. try y-coordinate 360 instead of 450 to make sure the shape is inside of the visible canvas area.
     *   - A Color object can be retrieved / created by calling pre-defined constants, such as Color.RED
     *
     * Extra:
     *   When you change the dimensions of the BigWindow object, our houses and sun should adapt to this new size.
     *   The sun should always be located to the far-left, -right or middle of the window.
     *   Hint: use the getWindowsDimensions() method on BigWindow.
     *
     */
    public static void main(String[] args) {
        // Start programming here!

        BigWindow myWindow = new BigWindow(1000,450);

        BigCanvas myCanvas = new BigCanvas();

        BigCircle sun = new BigCircle(825,25,150, Color.yellow);

        BigSquare redSquare = new BigSquare(0,375,Color.red);
        BigSquare yellowSquare = new BigSquare(475,375,Color.yellow);
        BigSquare blueSquare = new BigSquare(950, 375, Color.blue);

        BigTriangle redTriangle = new BigTriangle(0,375,Color.red);
        BigTriangle blackTriangle = new BigTriangle(475,375,Color.black);
        BigTriangle blueTriangle = new BigTriangle(950,375, Color.blue);

        myCanvas.addShape(sun);
        myCanvas.addShape(redSquare);
        myCanvas.addShape(yellowSquare);
        myCanvas.addShape(blueSquare);
        myCanvas.addShape(redTriangle);
        myCanvas.addShape(blackTriangle);
        myCanvas.addShape(blueTriangle);

        myWindow.addComponent(myCanvas);

        myWindow.launch();

    }

}
