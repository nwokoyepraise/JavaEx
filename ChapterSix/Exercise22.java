/**
 * This class solves Exercise 19 Chapter 5 ["Initialization & Cleanup"] of the
 * book "Thinking in Java"
 * The code demonstrates the use of the values() and ordinal() methods for enum
 * types
 * 
 * @author nwokoyepraise@gmail.com
 */
public class Exercise22 {

    static void print(String str) {
        System.out.println("currency used in: " + str);
    }

    public static void main(String[] args) {
        for (Currencies cur : Currencies.values()) {
            switch (cur) {
                case IRANIAN_RIAL:
                    print("iran");
                    break;

                case VIETNAMESE_DONG:
                    print("vietnam");
                    break;

                case INDONESIAN_RUPIAH:
                    print("indonesia");
                    break;

                case SIERRA_LEONEAN_LEONE:
                    print("sierra leone");
                    break;

                case LAOTIAN_KIP:
                    print("lao");
                    break;

                case UZBEK_SUM:
                    print("uzbekistan");
                    break;
            }
        }
    }
}

enum Currencies {
    IRANIAN_RIAL, VIETNAMESE_DONG, INDONESIAN_RUPIAH, SIERRA_LEONEAN_LEONE, LAOTIAN_KIP, UZBEK_SUM
}