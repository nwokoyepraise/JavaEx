/**
 * This class solves Exercise 1 Chapter 12 ["Holding Your Objects"] of the
 * book "Thinking in Java"
 * This exercise deals with implementing parameterized array lists
 * 
 * @author nwokoyepraise@gmail.com
 */
import java.util.ArrayList;
import static util.Print.print;

class Gerbil {
    int gerbilNumber;

    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop() {
        print("gerbil number " + gerbilNumber + " is hopping");
    }
}

public class Exercise1 {

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            gerbils.add(new Gerbil(i));
        }

        for (int j = 0; j < gerbils.size(); j++) {
            gerbils.get(j).hop();
        }
    }
}
