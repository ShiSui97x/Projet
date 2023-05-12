package org.example;

import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
public abstract class Character {
    public int healthPoints;
    public int damage;
    public int defense;
    public int level;
    public String name;

    public Character(int healthPoints, int damage, int defense, int level, String name){
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.defense= defense;
        this.level = level;
        this.name = name;
    }

    public abstract void attack(Character enemy);

    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage - defense, 0);
        healthPoints = Math.max(healthPoints - actualDamage, 0);
    }

}





