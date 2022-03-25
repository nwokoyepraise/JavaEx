package typeinfo.books;

import static util.Print.print;

public class Book {

    private void methodA() {
        print("private method A");
    }

    protected void methodB() {
        print("protected method B");
    }

    void methodC() {
        print("package access method C");
    }

    public void D(){}

    public static void main(String[] args) {
        
    }
}
