/**
 * This class solves Exercise 2 Chapter 12 ["Holding Your Objects"] of the
 * book "Thinking in Java"
 * This exercise deals with implementing set container
 * 
 * @author nwokoyepraise@gmail.com
 */
import java.util.HashSet;
import java.util.Set;

class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}

public class Exercise2 {

    public static void main(String[] args) {
        SimpleCollection.main(args);
    }
}
