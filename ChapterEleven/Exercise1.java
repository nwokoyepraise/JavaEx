/**
 * This class solves Exercise 1 Chapter 11 ["Inner Classes"] of the
 * book "Thinking in Java"
 * This exercise demonstrates working with inner classes
 * 
 * @author nwokoyepraise@gmail.com
 */
import static util.Print.print;

public class Exercise1 {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.getInner();
    }
}

class Outer {
    class Inner {
        Inner() {
            print("inner class");
        }
    }

    Inner getInner() {
        return new Inner();
    }
}