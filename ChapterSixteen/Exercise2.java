
/**
 * This class solves Exercise 2 Chapter 16 ["Generics"] of the
 * book "Thinking in Java"
 *
 * 
 * @author nwokoyepraise
 */

import static util.Print.print;

public class Exercise2 {

    public static void main(String[] args) {
        ObjectHolder<PhoneBrands> oh = new ObjectHolder<PhoneBrands>(new Apple());
        print(oh.get());

        oh.set(new Samsung());
        print(oh.get());

        oh.set(new Nokia());
        print(oh.get());

    }
}

class PhoneBrands {

}

class Apple extends PhoneBrands {

    public String toString() {
        return ("apple");
    }
}

class Samsung extends PhoneBrands {

    public String toString() {
        return ("samsung");
    }
}

class Nokia extends PhoneBrands {
    public String toString() {
        return ("nokia");
    }
}

class ObjectHolder<T> {
    private T a;

    public ObjectHolder(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }
}