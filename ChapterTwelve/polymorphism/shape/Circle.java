package polymorphism.shape;

import static util.Print.print;

public class Circle extends Shape {

    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }

    @Override
    public String toString(){
        return "Circle";
    }

}
