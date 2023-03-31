package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Wizard extends Character {
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;

    public Wizard(int healthPoints, int damage, int defense, int level, Pet pet, Wand wand, House house) {
        super(healthPoints, damage, defense, level);
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.knownSpells = new ArrayList<>();
        this.potions = new ArrayList<>();
    }

    @Override
    public void attack(Character enemy) {
        int spellDamage = wand.getCore().getPower() * wand.getSize() * level;
        if (knownSpells.contains(Spell.EXPELLIARMUS)) {
            System.out.println("Expelliarmus!");
            spellDamage += 10;
        }
        if (enemy instanceof AbstractEnemy) {
            spellDamage *= 2;
        }
        System.out.printf("Wizard attacks for %d damage!\n", spellDamage);
        enemy.takeDamage(spellDamage);
    }

    public void defend() {
        System.out.println(this + " defends with magic shield!");
        setDefense(getDefense() + 10);
    }

    public void castSpell(Spell spell, Character target) {
        if (!knownSpells.contains(spell)) {
            System.out.printf("Wizard does not know the %s spell!\n", spell);
            return;
        }
        int spellDamage = spell.getPower() * level;
        System.out.printf("Wizard casts %s for %d damage!\n", spell, spellDamage);
        target.takeDamage(spellDamage);
    }

    public void usePotion(Potion potion) {
        if (!potions.contains(potion)) {
            System.out.printf("Wizard does not have a %s potion!\n", potion);
            return;
        }
        int healing = potion.getHealing() * level;
        System.out.printf("Wizard uses %s for %d healing!\n", potion, healing);
        healthPoints += healing;
    }
}

