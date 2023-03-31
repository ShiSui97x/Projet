package org.example;
import lombok.Data;
import lombok.*;

@Getter
@Setter
public class Boss extends AbstractEnemy {

    private String name;

    public Boss(int healthPoints, int damage, int defense, int level, String name) {
        super(healthPoints, damage, defense, level,name);
        this.name = name;
    }

    @Override
    public void attack(Character enemy) {
        enemy.takeDamage(this.getDamage());
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", healthPoints=" + this.getHealthPoints() +
                ", damage=" + this.getDamage() +
                ", defense=" + this.getDefense() +
                ", level=" + this.getLevel() +
                '}';
    }
}



