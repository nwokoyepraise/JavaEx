import static util.Print.print;
import java.util.*;

public class App {

}

class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Collections.addAll(collection, 1, 3, 4, 5);
        print(collection);

        //String[] s = { "d", "e", "Air", "aiz", "Azx" };

        Set<String> ss = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        Collections.addAll(ss, "d", "e", "Air", "aiz", "Azx");

        print(ss);

    }
}

class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}

class A implements Iterable<String> {
    private String[] arr;

    A(String[] arr) {
        this.arr = arr;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < arr.length;
            }

            @Override
            public String next() {
                return arr[index++];
            }
            
        };
    }
}

class B {
    public static void main(String[] args) {
        String[] s = { "d", "e", "Air", "aiz", "Azx" };
        A myA = new A(s);

        Iterator<String> it = myA.iterator();

        for (String g : myA) {
            print(g);
        }
       
        while (it.hasNext()) {
        //    print(it.next());
        }
    }
}