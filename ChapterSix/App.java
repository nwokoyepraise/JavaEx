import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        new Print("hello world");
        new Print(true);
        new Print(MyEnum.values().toString());

        Integer[] arr = { 1, 2, 3, 4, 5 };
        // int[] d = { new Integer(3), new Integer(5) };
        new Print(Arrays.toString(arr));
        for (int arrs : arr) {
            new Print(arrs);
        }
    }
}

enum MyEnum {
    HOT, COLD, MILD
}
