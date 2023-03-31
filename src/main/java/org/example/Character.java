package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    @Getter
    @Setter
    public String name;
    public int maxHP;
    @Getter
    @Setter
    public int currentHP;
    @Getter
    @Setter
    public int damage;
    @Getter
    @Setter
    public int defense;
    @Getter
    @Setter
    public int accuracy;
    @Getter
    @Setter
    public House house;

    public Character(String name, int maxHP, int damage, int defense) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.damage = damage;
        this.defense = defense;
        this.accuracy = accuracy;
    }
    public abstract void attack(Character character);
    public abstract void defend(Character character);

    public List<Potion> getPotions() {
        List<String> potions= new ArrayList<>();
        potions.add("healingPotion");
        return potions;
    }
}

