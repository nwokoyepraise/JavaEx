import java.util.ArrayList;

public class Pets {
    static Pet[] createArray(int num) {
        Pet[] pets = new Pet[num];
        for (int i = 0; i < num; i++) {
            pets[i] = new Pet();
        }
        return pets;
    }

    static ArrayList<Pet> arrayList(int num) {
        ArrayList<Pet> pets = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            pets.add(new Pet());
        }
        return pets;
    }
}