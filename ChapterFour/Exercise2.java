/**
 * This class solves Exercise 2 Chapter 4 ["Operators"] of the book "Thinking in Java"
 * The exercise aims to illustrate aliasing
 * @author nwokoyepraise@gmail.com
 */
public class Exercise2 {
    
    
    public static void main(String[] args) {
      FloatClass d1 = new FloatClass();
      FloatClass d2 = new FloatClass();
      d1.mFloat = 1.2f;
      d2.mFloat = 2.5f;

      System.out.println("1: d1.mFloat: " + d1.mFloat+
      ", d2.mFloat: " + d2.mFloat);

      d1.mFloat = 3.3f;

      System.out.println("1: d1.mFloat: " + d1.mFloat+
      ", d2.mFloat: " + d2.mFloat);

      d1 = d2;

      System.out.println("1: d1.mFloat: " + d1.mFloat+
      ", d2.mFloat: " + d2.mFloat);
    }
}

class FloatClass {
    float mFloat;
}
