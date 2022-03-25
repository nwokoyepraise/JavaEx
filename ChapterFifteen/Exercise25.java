/**
 * This class solves Exercise 25 Chapter 15 ["Type Information"] of the
 * book "Thinking in Java"
 *
 *  The exercise how to call hidden methods through reflection
 * 
 * @author nwokoyepraise@gmail.com
 */
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import typeinfo.books.Book;

public class Exercise25 {

    public static void main(String[] args) throws Exception {
        Book book = new Book();
    
        List<Method> methods = new ArrayList<>();
        methods.add(book.getClass().getDeclaredMethod("methodA"));
        methods.add(book.getClass().getDeclaredMethod("methodB"));
        methods.add(book.getClass().getDeclaredMethod("methodC"));
        
        for (Method method: methods) {
            method.setAccessible(true);
            method.invoke(book);
        }
        
    }
}
