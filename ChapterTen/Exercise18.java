/**
 * This class solves Exercise 18 Chapter 10 ["Interfaces"] of the
 * book "Thinking in Java"
 * This exercise demonstrates implementing interfaces and interface factories
 * 
 * @author nwokoyepraise@gmail.com
 */
import static util.Print.print;

interface Cycle {
    void drive();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public void drive() {
        print("unicycle drive()");
    }
}

class Bicycle implements Cycle {
    public void drive() {
        print("bicycle drive()");
    }
}

class Tricycle implements Cycle {
    public void drive() {
        print("Tricycle drive()");
    }
}

class UnicycleFactory implements CycleFactory {
    public Unicycle getCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory {
    public Bicycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    public Tricycle getCycle() {
        return new Tricycle();
    }
}

public class Exercise18 {

    static void performAction(CycleFactory cf) {
        Cycle c = cf.getCycle();
        c.drive();
    }

    public static void main(String[] args) {
        performAction(new UnicycleFactory());
        performAction(new BicycleFactory());
        performAction(new TricycleFactory());
    }

}
