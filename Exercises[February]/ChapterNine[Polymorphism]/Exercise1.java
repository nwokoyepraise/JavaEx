
/**
 * This class solves Exercise 1 Chapter 9 ["Polymorphism"] of the
 * book "Thinking in Java"
 * This exercise dmonstrates that each type of the Cycle subclass can upcast to Cycle
 * 
 * @author nwokoyepraise@gmail.com
 */
import static util.Print.print;

public class Exercise1 {

    static void ride(Cycle cycle, Speed speed) {
        cycle.ride(speed);
    }

    public static void main(String[] args) {
        ride(new Unicycle(), Speed.SLOW);
        ride(new Bicycle(), Speed.NORMAL);
        ride(new Tricycle(), Speed.FAST);
    }
}

class Cycle {
    void ride(Speed speed) {
        print("cycle is being ridden at " + speed + " speed");
    }
}

class Unicycle extends Cycle {
    void ride(Speed speed) {
        print("unicycle is being ridden at " + speed + " speed");
    }
}

class Bicycle extends Cycle {
    void ride(Speed speed) {
        print("bicycle is being ridden at " + speed + " speed");
    }
}

class Tricycle extends Cycle {
    void ride(Speed speed) {
        print("tricycle is being ridden at " + speed + " speed");
    }
}

enum Speed {
    SLOW, NORMAL, FAST;
}