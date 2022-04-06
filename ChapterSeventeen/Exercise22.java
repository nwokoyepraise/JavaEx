import static util.Print.print;

import java.util.Arrays;

/**
 * This class solves Exercise 22 Chapter 17 ["Arrays"] of the
 * book "Thinking in Java"
 * 
 * This exercise shows that performing binarySearch() on an unsorted array leads
 * to unpredictable results.
 * 
 * In this case, an OutOfBoundsException is thrown
 * 
 * @author @nwokoyepraise
 */

public class Exercise22 {

    public static void main(String[] args) {
        String[] sa = "a n v b m z d x e f g h i j k l".split(" ");
        //Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
        print(Arrays.toString(sa));
        int index = Arrays.binarySearch(sa, "i",
                String.CASE_INSENSITIVE_ORDER);

        print("Index: " + index + "\n" + sa[index]);
    }
}
