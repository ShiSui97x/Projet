package org.example;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractEnemy extends Character {
    private String name;

    public AbstractEnemy(int healthPoints, int damage, int defense, int level, String name) {
        super(name,healthPoints, damage, defense, level);
        this.name = name;
    }

    @Override
    public void attack(Character enemy) {
        enemy.takeDamage(this.damage);
    }
}
