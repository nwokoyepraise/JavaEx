import static util.Print.print;

public class App {
}

interface A {
}

interface B {
    void h ();
}

class X implements A, B {
   public void h (){
        print("ke");
    }
}

class Y implements A {
    B makeB() {
        // Anonymous inner class:
        return new B() {
            public void h (){
                print("ke2");
            }
        };
    }
}

class MultiInterfaces {
    static void takesA(A a) {
    }

    static void takesB(B b) {
       b.h();
    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}