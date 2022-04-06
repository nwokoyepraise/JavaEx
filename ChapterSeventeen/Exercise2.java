import java.util.Arrays;
import static util.Print.print;

/**
 * This class solves Exercise 2 Chapter 17 ["Arrays"] of the
 * book "Thinking in Java"
 * 
 * This exercise dmonstrates use of the Arrays.fill() method
 * 
 * @author @nwokoyepraise
 */

public class Exercise2 {
    
    static BerylliumSphere[] takesInt(int i) {
        BerylliumSphere[] berylliumSpheres = new BerylliumSphere[i];
        Arrays.fill(berylliumSpheres, new BerylliumSphere());
        return berylliumSpheres;
    }
    public static void main(String[] args) {
        print(Arrays.toString(takesInt(5)));
    }
}
