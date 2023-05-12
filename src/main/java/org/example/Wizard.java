package org.example;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Wizard {
    private String name;
    private int healthPoints;
    private int damagePoints;
    private Wand wand;
    private House house;
    private Pet pet;
    private List<Spell> knownSpells;
    private List<Potion> potions;

    public void castSpell(Spell spell, Wizard target) {
        double successRate = Math.random();
        if (successRate < spell.successRate) {
            int damage = spell.damage;
            target.takeDamage(damage);
        } else {
            System.out.println("Spell failed!");
        }
    }
    public House setHouse(SortingHat sortingHat) {
        this.house = sortingHat.assignHouse();
        return house;
    }

    public void takeDamage(int damage){
            this.healthPoints -= damage;
            if (this.healthPoints <= 0) {
                System.out.println(this.name + " has been defeated!");
            }
        }
    }

   public void usePotion(Potion potion) {
        int healing = potion.getHealing();
        this.healthPoints += healing;
    }

    public void defend() {
        this.damagePoints /= 2;
    }
}

