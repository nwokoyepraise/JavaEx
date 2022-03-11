/**
 * This class solves Exercise 31 Chapter 12 ["Holding Your Objects"] of the
 * book "Thinking in Java"
 * This exercise deals with making the RandomShapeGenerator.java class iterable
 * 
 * @author nwokoyepraise@gmail.com
 */
import java.util.Iterator;

import polymorphism.shape.RandomShapeGenerator;
import polymorphism.shape.Shape;
import static util.Print.print;

public class Exercise31 {

    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator(5);
        Iterator<Shape> it = rsg.iterator();

        while (it.hasNext()) {
            print(it.next());
        }
    }
}
