/**
 * This class solves Exercise 2 Chapter 9 ["Polymorphism"] of the
 * book "Thinking in Java"
 * As the "@Override annotation is added to the various shapes (Circle, Triangle
 * and Square), there is no observable change with what was already existing"
 * 
 * @author nwokoyepraise@gmail.com
 */
import polymorphism.shape.*;

public class Exercise2 {

    public static void main(String[] args) {
        Shapes.main(args);
    }
}

class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for (Shape shp : s)
            shp.draw();
    }
}