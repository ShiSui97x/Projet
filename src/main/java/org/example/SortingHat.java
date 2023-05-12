package org.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class SortingHat {
    private Random random;

    public House assignHouse() {
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
