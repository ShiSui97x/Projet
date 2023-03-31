package org.example;

import lombok.*;

@Getter
@Setter
public class Enemy extends AbstractEnemy {
    private String name;

    public Enemy(int healthPoints, int damage, int defense, int level, String name) {
        super(healthPoints, damage, defense, level,name);
        this.name = name;
    }

    @Override
    public void attack(Character enemy) {
        enemy.takeDamage(this.damage);
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", healthPoints=" + this.healthPoints +
                ", damage=" + this.damage +
                ", defense=" + this.defense +
                ", level=" + this.level +
                '}';
    }
}






