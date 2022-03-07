/**
 * This class solves Exercise 19 Chapter 10 ["Interfaces"] of the
 * book "Thinking in Java"
 * This exercise demonstrates implementing factory method
 * 
 * @author nwokoyepraise@gmail.com
 */

import static util.Print.print;
interface Toss {
    void doToss();
}

interface TossFactory {
    Toss getToss();
}

class CoinToss implements Toss {
    public void doToss() {
        print("coinToss()");
    }
}

class CoinTossFactory implements TossFactory {
    public Toss getToss(){
        return new CoinToss();
    }
}

class DiceToss implements Toss {
    public void doToss() {
        print("diceToss()");
    }
}

class DiceTossFactory implements TossFactory {
    public Toss getToss(){
        return new DiceToss();
    }
}

public class Exercise19 {

    static void performToss(TossFactory tf) {
        Toss t = tf.getToss();
        t.doToss();
    }

    public static void main(String[] args) {
        performToss(new CoinTossFactory());
        performToss(new DiceTossFactory());
    }
}
