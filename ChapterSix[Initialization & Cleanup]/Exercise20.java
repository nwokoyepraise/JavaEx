public class Exercise20 {
    
    public static void main(String[] args) {
        AnotherClass.main("string1", "string2", "string3");
        AnotherClass.main(1, 2, 3);
        AnotherClass.main('a', 'b', 'c');
    }
}

class AnotherClass {

    public static void main(Object ...args) {
        for (Object arg : args)
        System.out.println(arg);
    }
}
