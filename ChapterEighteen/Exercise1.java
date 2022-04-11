
/**
 * This class solves Exercise 1 Chapter 18 ["Containers in Depth"] of the
 * book "Thinking in Java"
 * This exercise demonstrates various methods for handling containers
 * 
 * @author @nwokoyepraise
 */
import static util.Print.print;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        List<String> arrayCountries = new ArrayList<String>();
        List<String> linkedCountries = new ArrayList<String>();

        for (int i = 0; i < Countries.DATA.length; i++) {
            arrayCountries.add(Countries.DATA[i][0]);
            linkedCountries.add(Countries.DATA[i][1]);
        }

        Collections.sort(arrayCountries);
        Collections.sort(linkedCountries);

        print(arrayCountries);
        print(linkedCountries);

        for (int i = 0; i < 3; i++) {
            Collections.shuffle(arrayCountries);
            Collections.shuffle(linkedCountries);
            print(arrayCountries);
            print(linkedCountries);
        }

    }
}