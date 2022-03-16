import static util.Print.print;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
        App app = new App();
        print(app.getClass());
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace())
                System.out.println(ste);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("Exercise1.java"));
            
        } catch (Exception e) {
           
        }
    }
}


