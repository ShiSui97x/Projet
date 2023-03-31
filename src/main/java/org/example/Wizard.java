package org.example;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
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
        if (successRate < spell.getSuccessRate()) {
            int damage = spell.getDamage();
            target.takeDamage(damage);
        } else {
            System.out.println("Spell failed!");
        }
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
        if (this.healthPoints <= 0) {
            System.out.println(this.name + " has been defeated!");
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

