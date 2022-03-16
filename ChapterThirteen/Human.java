class Annoyance extends RuntimeException{
}

class Sneeze extends Annoyance {
}

public class Human {

    static void runtimeExceptionThrower (int type){
        try {
            switch(type) {
                case 0: throw new Sneeze();
                case 1: throw new Annoyance();
                default: return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {

        for(int i=0; i<3; i++)
        runtimeExceptionThrower(i);
    }
}