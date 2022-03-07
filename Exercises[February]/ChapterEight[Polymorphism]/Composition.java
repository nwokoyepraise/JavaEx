import static util.Print.print;

public class Composition {

}

class Engine {
    public void start() {
    }

    public void rev() {
    }

    public void stop() {
    }
}

class Wheel {
    public void inflate(int psi) {
    }
}

class Window {
    public void rollup() {
    }

    public void rolldown() {
    }
}

class Door {
    public Window window = new Window();

    public void open() {
    }

    public void close() {
    }
}

class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(),
            right = new Door(); // 2-door

    public Car() {
        for (int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }
}

// UPCASTING
class Instrument {
    public void play() {
        print("play");
    }

    static void tune(Instrument i) {
        // ...
        i.play();
    }
}

// Wind objects are instruments
// because they have the same interface:
class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();

        // Upcasting
        // ("flute which is a type of "Wind" is converted to type "Instrument")
        Instrument.tune(flute);
    }
}

// /**
//  * Upcasting in Java
//  * @author nwokoyepraise
//  */
// class Car {

//     static void drive(Car car) {

//     }
// }

// class Lexus extends Car {

//     public static void main(String[] args) {
//         Lexus rx350 = new Lexus();
//         /*rx350 which is a type of "Lexus" is being converted to type of "Car"
//         because they share the same interface (through inheritance) */
//         Car.drive(rx350);
//     }
// }