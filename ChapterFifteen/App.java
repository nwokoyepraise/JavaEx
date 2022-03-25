import static util.Print.print;

class App implements Cat {

    public static void main(String[] args) {
        App h = new App();

        print(h instanceof Cat);

    }
}

interface Cat {

}

interface A {
    void f();
}

class B implements A {
    public void f() {
        print(123);
    }

    public void g() {
        print(848);
    }
}

class InterfaceViolation {
    public static void main(String[] args) {

        A a = new B();
        a.f();
        // a.g(); // Compile error
        System.out.println(a.getClass().getName());
        print(a instanceof A);
        if (a instanceof B) {
            B b = (B) a;
            b.g();
        }
    }
}