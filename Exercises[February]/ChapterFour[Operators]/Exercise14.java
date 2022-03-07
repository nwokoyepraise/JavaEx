/**
 * This class solves Exercise 14 Chapter 4 ["Operators"] of the book "Thinking
 * in
 * Java"
 * The exercise requires a method that takes in two string arguements and
 * compares them using boolean comparison
 * 
 * @author nwokoyepraise@gmail.com
 */
public class Exercise14 {

    static void compare(String a, String b) {
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    public static void main(String[] args) {
        compare("true", "true");
        compare("true", "false");
    }
}