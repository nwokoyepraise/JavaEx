/**
 * This class solves Exercise 23 Chapter 8 ["Reusing Classes"] of the
 * book "Thinking in Java"
 * The class demonstrates that class loading takes place only once and can be done either by the creation of the 
 * first instance of the class or by the acccess of a static member
 * 
 * @author nwokoyepraise@gmail.com
 */

import static util.Print.print;

public class Exercise23 {
    static int i = 2;
    static {
        print("class loaded");
    }

    public static void main(String[] args) {
        new Exercise23();
        new Exercise23();
        print(i);
    }
}