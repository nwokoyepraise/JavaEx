/**
 * This class solves Exercise 1 Chapter 11 ["Inner Classes"] of the
 * book "Thinking in Java"
 * This exercise demonstrates working with inner classes
 * 
 * @author nwokoyepraise@gmail.com
 */

public class Exercise2 {

    public static void main(String[] args) {
        Sequence sequence = new Sequence(3);
        sequence.add(new StringHolder("this is a string"));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}

class StringHolder {
    String str;

    StringHolder(String str) {
        this.str = str;
    }

    public String toString() {
        return str;
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length)
                i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
