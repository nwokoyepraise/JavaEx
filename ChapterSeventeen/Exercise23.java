import static util.Print.print;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * This class solves Exercise 22 Chapter 17 ["Arrays"] of the
 * book "Thinking in Java"
 * 
 * This exercise shows how to use autoboxing in primitive arrays as well as using the comparator
 * 
 * @author @nwokoyepraise
 */

public class Exercise23 {

    public static void main(String[] args) {
        int size = 5;
        Integer[] ints = new Integer[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            ints[i] = random.nextInt(100);
        }

        print("ints: " + Arrays.toString(ints));

        Arrays.sort(ints, Comparator.reverseOrder());

        print("ints sorted: " + Arrays.toString(ints));
    }
}
