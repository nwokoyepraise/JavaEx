
/**
 * This class solves Exercise 16 Chapter 9 ["Polymorphism"] of the
 * book "Thinking in Java"
 * 
 * @author nwokoyepraise@gmail.com
 */
import static util.Print.print;

public class Exercise16 {

    public static void main(String[] args) {
        AlertStatus alertStatus = new AlertStatus();
        alertStatus.warning();
        alertStatus.problem();
        alertStatus.error();
    }
}

class Starship {
    Status mStatus;

    void changeState(Status status) {
        print("current status is: " + status);
    }
}

class AlertStatus extends Starship {

    void warning() {
        changeState(Status.WARNING);
    }

    void problem() {
        changeState(Status.PROBLEM);
    }

    void error() {
        changeState(Status.ERROR);
    }
}

enum Status {
    WARNING, PROBLEM, ERROR;
}