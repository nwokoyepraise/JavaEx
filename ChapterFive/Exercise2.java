import java.util.ArrayList;
import java.util.Random;

/**
 * This class solves Exercise 2 Chapter 5 ["Controlling Execution"] of the book
 * "Thinking
 * in
 * Java"
 * This program generates 25 random int values.
 * 
 * @author nwokoyepraise@gmail.com
 */
public class Exercise2 {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (i == 24) {return;}
            int first = list.get(i);
            int second = list.get(i+1);
      
            if (first > second) {
                System.out.println("First(" + first + ")" + "is greater than second(" + second +  ")");
            } else if (first < second) {
                System.out.println("First(" + first + ")" + "is less than second(" + second +  ")");
            } else {
                System.out.println("First(" + first + ")" + "is equal to second(" + second +  ")");
            }

        }
    }
}
