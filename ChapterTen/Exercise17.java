
/**
 * This class solves Exercise 19 Chapter 10 ["Interfaces"] of the
 * book "Thinking in Java"
 * This exercise proves that variables in an interface are implicitly static and final
 * 
 * @author nwokoyepraise@gmail.com
 */
import static util.Print.print;

interface Amount {
    int AMOUNT = 5;
}

interface Amount2 {
    int AMOUNT = 2;
}

public class Exercise17 implements Amount {
    public static void main(String[] args) {
        print(AMOUNT);
        // Exercise17 e = new Exercise17();
        // print(e.AMOUNT); compile time error "the static ariable should be accessed in
        // a static manner"

        // AMOUNT++; compile time error "final field AMOUNT cannot be assigned"
    }
}
