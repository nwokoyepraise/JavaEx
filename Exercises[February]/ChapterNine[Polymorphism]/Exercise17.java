
/**
 * This class solves Exercise 17 Chapter 9 ["Polymorphism"] of the
 * book "Thinking in Java"
 * This exercise demonstrates what happens when a derived is upcasted and a method which exists in the 
 * base-class but not in the derived class is called. It can be seen there is no effect when the method is called.
 * 
 * Also a test us also made on when the class is downcasted. In this case a ClassCastException is thrown.
 * 
 * @author nwokoyepraise@gmail.com
 */
import static util.Print.print;

public class Exercise17 {
    static void ride(Cycle2 cycle, Speed2 speed) {
        cycle.ride(speed);
    }

    public static void main(String[] args) {
        ride(new Unicycle2(), Speed2.SLOW);
        ride(new Bicycle2(), Speed2.NORMAL);
        ride(new Tricycle2(), Speed2.FAST);
        Cycle2[] cycles = {
                new Unicycle2(),
                new Bicycle2(),
                new Tricycle2()
        };

        for (Cycle2 cycle : cycles) {
            cycle.balance();
        }

        /*
         * Cycle2[] cycle2s = {
         * new Unicycle2(),
         * new Bicycle2(),
         * new Tricycle2()
         * };
         * ((Unicycle2) cycle2s[0]).balance();
         * 
         * for (Cycle2 cycle2 : cycle2s) {
         * ((Unicycle2) cycle2)).balance();
         * }
         */
    }
}

class Cycle2 {
    void ride(Speed2 speed) {
        print("cycle is being ridden at " + speed + " speed");
    }

    void balance() {
    }
}

class Unicycle2 extends Cycle2 {
    void ride(Speed2 speed) {
        print("unicycle is being ridden at " + speed + " speed");
    }

    void balance() {
        print("unicycle is balanced");
    }
}

class Bicycle2 extends Cycle2 {
    void ride(Speed2 speed) {
        print("bicycle is being ridden at " + speed + " speed");
    }

    void balance() {
        print("Bicycle is balanced");
    }
}

class Tricycle2 extends Cycle2 {
    void ride(Speed2 speed) {
        print("tricycle is being ridden at " + speed + " speed");
    }
}

enum Speed2 {
    SLOW, NORMAL, FAST;
}