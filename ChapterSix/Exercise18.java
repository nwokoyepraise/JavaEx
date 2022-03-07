/**
 * This class solves Exercise 18 Chapter 5 ["Initialization & Cleanup"] of the
 * book "Thinking in Java"
 * This class demonstrates printing argument at class constructor while using
 * array reference when creating the class
 * 
 * @author nwokoyepraise@gmail.com
 */

public class Exercise18 {

    public static void main(String[] args) {
        ClassWithConstruct[] c = new ClassWithConstruct[2];
        c[0] = new ClassWithConstruct("string1");
        c[1] = new ClassWithConstruct("string2");
    }
}

class ClassWithConstruct {
    ClassWithConstruct(String arg) {
        System.out.println(arg);
    }

    ClassWithConstruct() {
    }
}