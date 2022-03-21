// import java.util.*;
import static util.Print.print;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);

       
        System.out.format("Row 1: [%d %f]%n", 12, 3.333);
        print(new App().getClass().getName());
 
        print(Arrays.toString(("Hell !! worl !!").split("!!")));

        Matcher m = Pattern.compile(". ").matcher("this. is. what. we. are. talking. anout");

        while (m.find())
        print(m.group());
    }
}