package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Spell extends AbstractSpell {
    public Spell(String name, int damage, int successRate) {
        super(name, damage, successRate);
    }

    @Override
    public void cast(Character target) {
        if (Math.random() < getSuccessRate() / 100.0) {
            target.takeDamage(getDamage());
            System.out.println("Spell " + getName() + " successfully cast on " + target.getName() + " for " + getDamage() + " damage.");
        } else {
            System.out.println("Spell " + getName() + " failed to cast on " + target.getName() + ".");
        }
    }
}
