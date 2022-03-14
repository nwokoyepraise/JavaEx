/**
 * This class solves Exercise 2 Chapter 13 ["Error Handling with Exceptions"] of the
 * book "Thinking in Java"
 * This exercise demonstrates error handling in a try-catch clause
 * 
 * @author nwokoyepraise@gmail.com
 */
import static util.Print.print;
public class Exercise2 {
    public static void main(String[] args) {
        Subject mSubject = null;

        try {
            mSubject.myMethod();
        } catch (Exception e) {
            print(e);
        }
    }
}

class Subject {
    void myMethod() {

    }
}