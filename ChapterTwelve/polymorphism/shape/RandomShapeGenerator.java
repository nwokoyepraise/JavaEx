package polymorphism.shape;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape> {
    private Random rand = new Random();
    Shape[] arr;

   public RandomShapeGenerator(int num) {
       this.arr = new Shape[num];
        for (int i = 0; i < num; i++) {
            switch (rand.nextInt(3)) {
                case 0:
                arr[i] = new Circle();
                    break;
                case 1:
                arr[i] = new Square();
                    break;
                case 2:
                arr[i] = new Triangle();
                    break;
            }
        }

    }

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < arr.length;
            }

            @Override
            public Shape next() {
                return arr[index++];
            }

        };
    }
}
