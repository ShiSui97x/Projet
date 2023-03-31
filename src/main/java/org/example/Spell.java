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
        if (Math.random() < successRate / 100.0) {
            target.takeDamage(damage);
            System.out.println("Spell " + name + " successfully cast on " + target.name + " for " + damage + " damage.");
        } else {
            System.out.println("Spell " + name + " failed to cast on " + target.name + ".");
        }
    }
}
