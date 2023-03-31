package org.example;

import java.util.Random;

public class SortingHat {
    private final Random random;

    public SortingHat() {
        this.random = new Random();
    }

    public House assignHouse(Wizard player) {
        int houseIndex = random.nextInt(4);
        switch (houseIndex) {
            case 0:
                return new House("Gryffindor", "resistance to damage");
            case 1:
                return new House("Hufflepuff", "efficiency with potions");
            case 2:
                return new House("Ravenclaw", "accuracy with spells");
            case 3:
                return new House("Slytherin", "damage with spells");
            default:
                throw new RuntimeException("Invalid house index: " + houseIndex);
        }
    }
}
