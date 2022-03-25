/**
 * This class solves Exercise 1 Chapter 16 ["Generics"] of the
 * book "Thinking in Java"
 *
 *  When the default constructor in typeinfo/toys.Toy is commented out, an InstantationException is thrown
 * 
 * @author nwokoyepraise
 */
import static util.Print.print;

class Pet {
    Pet(){
        print("pet class");
    }

    @Override
    public String toString() {
        return "pet class";
    }
}

class Dog extends Pet {
    private String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

public class Exercise1<T> {

    public static void main(String[] args) {
        Holder<Pet> h = new Holder<Pet>(new Pet());

        Pet pet = h.get();
        print(pet);

        h.set(new Dog("Ekuke"));
        print(h.get());
    }
}

class Holder<T> {
    private T a;

    public Holder(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }
}