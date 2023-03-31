package org.example;

public abstract class Character {

    private String name;
    private int maxHP;
    private int currentHP;
    private int damage;
    private int defense;
    private int accuracy;
    private House house;

    public Character(String name, int maxHP, int damage, int defense, int accuracy) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.damage = damage;
        this.defense = defense;
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
        house.applyHouseBonus(this);
    }

    public abstract void attack(Character character);

    public void defend(Character character) {
        // Défendre diminue les dégâts reçus en fonction de la valeur de défense.
        int damageTaken = Math.max(0, character.getDamage() - this.defense);
        this.currentHP = Math.max(0, this.currentHP - damageTaken);
    }
}

