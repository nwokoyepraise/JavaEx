/**
 * This class solves Exercise 1 Chapter 10 ["Interfaces"] of the
 * book "Thinking in Java"
 * This exercise demonstrates implementing abstract classes
 * 
 * @author nwokoyepraise@gmail.com
 */
import static util.Print.print;

public class Exercise1 {

    static void doAll(Rodent r) {
        r.climb();
        r.run();
    }

    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster()};
       
        for (Rodent rodent: rodents) {
            doAll(rodent);
        }
    }
}

abstract class Rodent {
    abstract void run();

    abstract void climb();

}

class Mouse extends Rodent {
    void run() {
        print("mouse runs");
    }

    void climb() {
        print("mouse climbs");
    }

}

class Gerbil extends Rodent {
    void run() {
        print("gerbil runs");
    }

    void climb() {
        print("gerbil climbs");
    }
}

class Hamster extends Rodent {
    void run() {
        print("hamster runs");
    }

    void climb() {
        print("hanster climbs");
    }
}
