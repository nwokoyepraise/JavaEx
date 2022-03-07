/**
 * This class solves Exercise 8 Chapter 4 ["Operators"] of the book "Thinking in Java"
 * The exercise aims to show how hex and octal notations with long values
 * @author nwokoyepraise@gmail.com
 */
public class Exercise8 {

    public static void main(String[] args) {
        Long l1 = 0X2fL;
        System.out.println("i1: " + Long.toBinaryString(l1));

        Long l2 = 0765L;
        System.out.println("i1: " + Long.toBinaryString(l2));

    }
}