/**
 * This class solves Exercise 24 Chapter 8 ["Reusing Classes"] of the
 * book "Thinking in Java"
 * In this exercise, from the output, it can be seen that the base-class gets
 * loaded first and its static variables initialized before the ones from the
 * derived class get loaded and initialized
 * 
 * @author nwokoyepraise@gmail.com
 */
public class Exercise24 {

    public static void main(String[] args) {
        new BrownBeetle();

        /*
         * Output
         * static Insect.x1 initialized
         * static Beetle.x2 initialized
         * i = 9, j = 0
         * Beetle.k initialized
         * k = 47
         * j = 39
         */
    }
}

class BrownBeetle extends Beetle {

}