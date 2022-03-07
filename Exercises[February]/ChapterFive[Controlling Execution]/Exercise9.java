/**
 * This class solves Exercise 9 Chapter 5 ["Controlling Execution"] of the book
 * "Thinking
 * in
 * Java"
 * This program includes a method that accept an int param and then prints the fibonnaci sequence upto that param
 * 
 * @author nwokoyepraise@gmail.com
 */
public class Exercise9 {
    static void print(String string) {
        System.out.print(string);
    }
    
    //initialize variables
   static int n1=0,n2=1,n3=0;

    static void fibonacci(int count) {
        // for (int i = 0; i < count; i++) {
        //     n3 = n1+n2;
        //     n1= n2;
        //     n2 = n3;
        //     print(" " + n3);
        // }
       if (count>0) {
           n3 = n1 + n2;
           n1 = n2;
           n2 = n3;
           print(" "+n3);
           fibonacci(count-1);
       }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}
