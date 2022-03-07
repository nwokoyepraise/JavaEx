
/**
 * This class solves Exercise 2 Chapter 9 ["Access Control"] of the
 * book "Thinking in Java"
 * The compiler generates errors because the PackagedClass is not public and their is no package access because they are not in the same package
 * 
 * @author nwokoyepraise@gmail.com
 */
//import java.util.Vector;
import access.local.*;
public class Exercise9 {
    
}

class Foreign {
    public static void main(String[] args) {
    PackagedClass pc = new PackagedClass();
    }
    }