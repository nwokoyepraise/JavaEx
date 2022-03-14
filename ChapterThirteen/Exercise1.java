/**
 * This class solves Exercise 1 Chapter 13 ["Error Handling with Exceptions"] of the
 * book "Thinking in Java"
 * This exercise demonstrates error handling with "finally" block
 * 
 * @author nwokoyepraise@gmail.com
 */
import static util.Print.print;
public class Exercise1 {
    
    public static void main(String[] args) {
        try {
            throw new Exception("this is an error!");
        } catch (Exception e) {
           print(e.getMessage());
        }finally{
            print("inside finally block");
        }
    }
}

