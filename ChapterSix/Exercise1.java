/**
 * This class solves Exercise 1 Chapter 5 ["Initialization & Cleanup"] of the
 * book "Thinking in Java"
 * The class demonstrates that java initializes an uninitialized String
 * reference to null.
 * 
 * @author nwokoyepraise@gmail.com
 */

public class Exercise1 {
    static String str;

    public static void main(String[] args) {
        System.out.println(str);
    }
}
