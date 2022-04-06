import static util.Print.print;

import java.util.Arrays;

/**
 * This class solves Exercise 1 Chapter 17 ["Arrays"] of the
 * book "Thinking in Java"
 * This exercise dmonstrates use of the various types of array initialization
 * 
 * @author @nwokoyepraise
 */

class Exercise1 {

    static void view(BerylliumSphere[] berylliumSphere) {
        print(Arrays.toString(berylliumSphere));
    }

    public static void main(String[] args) {
        view(new BerylliumSphere[] {
                new BerylliumSphere(), new BerylliumSphere()
        });

        //aggragate initialization
        BerylliumSphere[] br1 = { new BerylliumSphere() };
        
        //dynamic aggregate initialization
        BerylliumSphere[] br2;
        br2 = new BerylliumSphere[] { new BerylliumSphere() };

        view(br1);
        view(br2);
    }
}