/**
 * This class solves Exercise 5&6 Chapter 4 ["Operators"] of the book "Thinking in Java"
 * The exercise aims to illustrate aliasing
 * @author nwokoyepraise@gmail.com
 */
class Dog {
    String name, says;

    void display () {
        System.out.println(this.name + " says " + this.says);
    }
}

public class Exercise5 {
   
    public static void main (String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "spot";
        dog2.name = "scruffy";
        dog1.says = "Ruff!";
        dog2.says = "Wurf!";

        dog1.display();
        dog2.display();

        //further solution for Exercise 6
        Dog dog3 = dog1;

        System.out.println(dog3 == dog1);
        System.out.println(dog3.equals(dog1));
    }
}
