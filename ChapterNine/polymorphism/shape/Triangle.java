package polymorphism.shape;
import static util.Print.print;
public class Triangle extends Shape{
    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }
}
