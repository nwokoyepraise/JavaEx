class BaseballException extends RuntimeException {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
        // Doesn’t actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    } // Throws no checked exceptions
}

class StormException extends RuntimeException {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    public StormyInning()
            throws RainedOut, BaseballException {
    }

    public StormyInning(String s)
            throws Foul, BaseballException {
    }

    public void walk() throws PopFoul {
    }

    public void rainHard() throws RainedOut {
    }

    public void event() {
    }

    public void atBat() throws PopFoul {
        throw new PopFoul();
    }

    public static void main(String[] args) {
        StormyInning si = new StormyInning();
        si.atBat();

        Inning i = new StormyInning();
        i.atBat();
        // try {
        // StormyInning si = new StormyInning();
        // si.atBat();
        // } catch (PopFoul e) {
        // System.out.println("Pop foul");
        // } catch (RainedOut e) {
        // System.out.println("Rained out");
        // } catch (BaseballException e) {
        // System.out.println("Generic baseball exception");
        // }
        
        // Strike not thrown in derived version.
        // try {
        //     // What happens if you upcast?

        //     // You must catch the exceptions from the
        //     // base-class version of the method:
        // } catch (Strike e) {
        //     System.out.println("Strike");
        // } catch (Foul e) {
        //     System.out.println("Foul");
        // } catch (RainedOut e) {
        //     System.out.println("Rained out");
        // } catch (BaseballException e) {
        //     System.out.println("Generic baseball exception");
        // }
    }
} /// :~
