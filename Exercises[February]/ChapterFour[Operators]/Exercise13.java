/**
 * This class solves Exercise 13 Chapter 4 ["Operators"] of the book "Thinking
 * in
 * Java"
 * The exercise requires a method that takes in a char and prints the binary equivalent
 * 
 * @author nwokoyepraise@gmail.com
 */

public class Exercise13 {

    static void displayCharInBin(char c) {
        System.out.println(Integer.toBinaryString(c));
    }

    public static void main(String [] args) {
        displayCharInBin('a');
        displayCharInBin('b');
        displayCharInBin('c');
    }
}
