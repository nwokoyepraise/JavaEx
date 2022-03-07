/**
 * This class solves Exercise 2 Chapter 5 ["Initialization & Cleanup"] of the
 * book "Thinking in Java"
 * The class checks the difference between a varible initialized at point of
 * creation and the one initialized by the class constructor
 * 
 * @author nwokoyepraise@gmail.com
 */

public class Exercise2 {

    public static void main(String[] args) {
        new CheckInit();
    }
}

class CheckInit {
    static String str1 = "english";
    static String str2;

    CheckInit() {
        str2 = "maths";
        System.out.println(str1); // "english"
        System.out.println(str2); // "maths"
        // no difference between the tring field initialized at the point of creation
        // and the one initialized by the constructor
    }
}
