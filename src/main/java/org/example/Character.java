package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public abstract class Character {
    private String name;
    private int healthPoints;
    public int damage;
    private int defense;
    private int level;

    public abstract void attack(Character enemy);

    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage - defense, 0);
        healthPoints = Math.max(healthPoints - actualDamage, 0);
    }

}





