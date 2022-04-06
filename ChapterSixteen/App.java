import java.util.*;

import static util.Print.print;

public class App {

    public static void main(String[] args) {

    }
}

class Creature{}

class Animal extends Creature {
}

class Cow extends Animal {
}

class Cat extends Cow {
}

class meow extends Cat {}

class CheckedList {

    public static void copy(List<? extends Number> source, List<? super Number> target) {
        for (Number number : source) {
            target.add(number);
        }
    }

    public static void check(List<?> animals) {

    }

    public static void operate(List<? extends Number> input, List<? extends Object> anim, List<? super Cow> output) {
        // one is only allowed to read f
        for (Number number : input) {
            // output.add(number);
            output.add(new meow());
            
        }
    }

    public static void main(String[] args) {
        List<Object> cows = new ArrayList<>();
        check(cows);
    }
}
