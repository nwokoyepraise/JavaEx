/**
 * This class solves Exercise 21 Chapter 5 ["Initialization & Cleanup"] of the
 * book "Thinking in Java"
 * The code demonstrates the use of enum types
 * 
 * @author nwokoyepraise@gmail.com
 */
public class Exercise21 {

    public static void main(String[] args) {
        for (Currency cur : Currency.values()) {
            System.out.println("value: " + cur + " ordinal: " + cur.ordinal());
        }
    }
}

enum Currency {
    IRANIAN_RIAL, VIETNAMESE_DONG, INDONESIAN_RUPIAH, SIERRA_LEONEAN_LEONE, LAOTIAN_KIP, UZBEK_SUM
}
