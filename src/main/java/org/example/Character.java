package org.example;

import lombok.Getter;
import lombok.Setter;

public abstract class Character {
    @Getter
    @Setter
    private String name;
    private int maxHP;
    @Getter
    @Setter
    private int currentHP;
    @Getter
    @Setter
    private int damage;
    @Getter
    @Setter
    private int defense;
    @Getter
    @Setter
    private int accuracy;
    @Getter
    @Setter
    private House house;

    public Character(String name, int maxHP, int damage, int defense, int accuracy) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.damage = damage;
        this.defense = defense;
        this.accuracy = accuracy;
    }
    house.applyHouseBonus(this);
    public abstract void attack(Character character);

    public void defend(Character character) {
        // Défendre diminue les dégâts reçus en fonction de la valeur de défense.
        int damageTaken = Math.max(0, character.getDamage() - this.defense);
        this.currentHP = Math.max(0, this.currentHP - damageTaken);
    }
}

