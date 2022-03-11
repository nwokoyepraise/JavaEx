import java.util.Iterator;

public class Pet implements Iterable<String> {
    private String[] arr = { "Rat", "Manx", "Cymric", "Mutt", "Pug", "Cymric", "Pug", "Manx" };

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

    int id() {
        return 1;
    }

}
