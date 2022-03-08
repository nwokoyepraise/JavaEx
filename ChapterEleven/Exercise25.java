/**
 * This class solves Exercise 25 Chapter 11 ["Inner Classes"] of the
 * book "Thinking in Java"
 * This exercise involves extending the GreenhouseControls.java to add more events for waterMist control
 * 
 * @author nwokoyepraise@gmail.com
 */

public class Exercise25 extends  GreenhouseControls{
    private boolean waterMist = false;

    public class WaterMistOn extends Event {
        public WaterMistOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            // Put hardware control code here to
            // physically turn on the light.
            waterMist = true;
        }

        public String toString() {
            return "Water mist is on";
        }
    }

    public static void main(String[] args) {
        GreenhouseController.main(args);
    }
}
