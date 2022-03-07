/**
 * This class solves Exercise 2 Chapter 8 ["Reusing Classes"] of the
 * book "Thinking in Java"
 * The class demonstrates lazy initialization
 * 
 * @author nwokoyepraise@gmail.com
 */
public class Exercise1 {
    private AnotherClass ac;

    public AnotherClass getAnotherClass() {
        if (true)
            ac = new AnotherClass();
        return ac;
    }

    public String toString(){
        return "AnotherClass: " + getAnotherClass();
    }

    public static void main(String[] args) {

        Exercise1 d = new Exercise1();
        System.out.println(d);
    }
}

class AnotherClass {

}