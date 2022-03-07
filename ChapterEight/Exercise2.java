/**
 * This class solves Exercise 2 Chapter 8 ["Reusing Classes"] of the
 * book "Thinking in Java"
 * The class demonstrates inheritance
 * 
 * @author nwokoyepraise@gmail.com
 */
import static util.Print.print;

public class Exercise2 extends Detergent {

    public void scrub() {
        append(" srub method overriden");
    }

    public void sterilizer (){
        append(" sterilizer()");
    }

    public static void main(String[] args) {
       Exercise2 x = new Exercise2();
       x.dilute();
       x.apply();
       x.scrub();
       x.foam();
       print(x);
       print("Testing Detergent base class:");
       Detergent.main(args);
    }
}

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        print(x);
    }

}

class Detergent extends Cleanser {
    // Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }

    // Add methods to the interface:
    public void foam() {
        append(" foam()");
    }

    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }
}