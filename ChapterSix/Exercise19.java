/**
 * This class solves Exercise 19 Chapter 5 ["Initialization & Cleanup"] of the
 * book "Thinking in Java"
 * The code demonstrates passing both a comma-separated list of Strings or a String[] into a vararg String array method
 * 
 * @author nwokoyepraise@gmail.com
 */

public class Exercise19 {
    
    static void varArg(String ...args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        varArg("string1", "string2");
        varArg(new String[]{"string1", "string2"});
    }
}
