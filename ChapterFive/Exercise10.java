import java.util.ArrayList;

public class Exercise10 {
    static void print(String string) {
        System.out.println(string);
    }

    static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static void printVampire(int number) {
        ArrayList<String> list = new ArrayList<>();

        for (String s : Integer.toString(number).split("")) {
            list.add(s);
        }

        int length = list.size();

        int combination = (factorial(length) / (factorial(2) * (factorial(length - 2))));

        int i1 = 0, i2 = 0, x0 = 0, x1 = 1, x2 = 2, x3 = 3;

        for (int i = 0; i < combination; i++) {
            for (int j = 0; j < length; j++) {
                i1 = Integer.parseInt(list.get(x0) + list.get(x1));
                i2 = Integer.parseInt(list.get(x2) + list.get(x3));
                print("" + i1);
                print("" + i2);

                if (i1 * i2 == number) {
                    print("Hello" + true);
                    break;
                }

                x3 = (x3 - 1 < 0) ? length - 1 : x3 - 1;
                x2 = (x2 - 1 < 0) ? length - 1 : x2 - 1;
                x1 = (x1 - 1 < 0) ? length - 1 : x1 - 1;
                x0 = (x0 - 1 < 0) ? length - 1 : x0 - 1;

            }
      
            
        }
    }

    public static void main(String[] args) {
        printVampire(1234);
    }
}
