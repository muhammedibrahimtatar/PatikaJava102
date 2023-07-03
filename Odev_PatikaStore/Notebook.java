package Odev_PatikaStore;

import java.util.HashMap;

public class Notebook extends ProductManager {

    public static HashMap<Integer,ProductManager> ourNoteBooks=new HashMap<>();

    public Notebook(String name, Brand brandOfPruduct, double screenSize, double battaryPower, int memory, int ram, String color, int price, int quality, int discountRate) {
        super(name, brandOfPruduct, screenSize, battaryPower, memory, ram, color, price, quality, discountRate);

        ourNoteBooks.put(this.getId(),this);
    }

}