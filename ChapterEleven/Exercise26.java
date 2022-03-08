/**
 * This class solves Exercise 26 Chapter 11 ["Inner Classes"] of the
 * book "Thinking in Java"
 * This exercise demonstrates inheriting an inner class from an inner class
 * 
 * @author nwokoyepraise@gmail.com
 */

import static util.Print.print;

public class Exercise26 {

    class Index {
        Index(int i) {
            print(i);
        }
    }

    public static void main(String[] args) {
        new BookShelf().new BookIndex(new Exercise26());
    }
}

class BookShelf {

    class BookIndex extends Exercise26.Index{
        BookIndex(Exercise26 e){
            e.super(5);
        }
    }
}