import java.util.Random;

/**
 * This class solves Exercise 8 Chapter 5 ["Controlling Execution"] of the book
 * "Thinking
 * in
 * Java"
 * This program checks the use of breaks in switch statements
 * 
 * @author nwokoyepraise@gmail.com
 */
public class Exercise8 {

    static void print(String string) {
        System.out.println(string);
    }

    static void withBreak() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int j = random.nextInt(5);
            switch (j % 2) {
                case 0:
                    print("Random number is even");
                    break;

                case 1:
                    print("Random number is odd");
                    break;
            }
        }
    }

    static void withoutBreak() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int j = random.nextInt(5);
            switch (j % 2) {
                case 0:
                    print("Random number is even");
                
                case 1:
                    print("Random number is odd");
              
            }
        }
    }

    public static void main(String[] args) {
        print(">>> Testing with break");
        withBreak();
        print("\n >>> Testing without break");
        withoutBreak();
    }
}
