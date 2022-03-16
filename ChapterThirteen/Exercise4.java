import static util.Print.print;

class MyOwnException extends RuntimeException {
    String mString;

    MyOwnException(String arg) {
        super(arg);
        this.mString = arg;
    }

    public void printString(){
        print (mString);
    }
}

public class Exercise4 {

    public static void main(String[] args) {
      throw new MyOwnException("this is an exception");
    }
}
