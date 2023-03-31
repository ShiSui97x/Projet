package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wizard extends Character {
    @Getter
    private Pet pet;
    @Getter
    private Wand wand;
    @Getter
    private House house;
    @Getter
    public List<Spell> knownSpells = new ArrayList<>();
    @Getter
    public List<Potion> potions = new ArrayList<>();

    public Wizard(String name, int maxHp, int damage, int defense, Pet pet, Wand wand, House house) {
        super(name, maxHp, damage, defense);
        this.pet = pet;
        this.wand = wand;
        this.house = house;
    }

    @Override
    public void attack(Character character) {
        int diceRoll = new Random().nextInt(50);
        int damageDealt = diceRoll * this.getDamage();
        if (knownSpells.size() > 0) {
            Spell spell = knownSpells.get(new Random().nextInt(knownSpells.size())); // Choose a random known spell
            int spellSuccessChance = spell.getSuccessChance();
            if (spellSuccessChance >= diceRoll) { // If the spell successfully hits the target
                int spellDamage = spell.getDamage();
                System.out.println(this.getName() + " casts " + spell.getName() + " for " + spellDamage + " damage!");
                damageDealt += spellDamage;
            } else {
                System.out.println(this.getName() + " tried to cast " + spell.getName() + " but missed.");
            }
        }
        character.takeDamage(damageDealt);
    }

    @Override
    public void defend(Character character) {
        // Défendre diminue les dégâts reçus en fonction de la valeur de défense.
        int damageTaken = Math.max(0, character.getDamage() - this.defense);
        this.currentHP = Math.max(0, this.currentHP - damageTaken);
    }

    public boolean isAlive() {


    }
}


