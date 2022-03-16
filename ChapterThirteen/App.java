import static util.Print.print;

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
    }
}


