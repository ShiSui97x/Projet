package org.example;

import lombok.Getter;

public class Wizard extends Character {
    @Getter
    private Pet pet;
    @Getter
    private Wand wand;
    @Getter
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;

    public Wizard(String name, int maxHp, int damage, int defense, Pet pet, Wand wand, House house) {
        super(name, maxHp, damage, defense);
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.knownSpells = new ArrayList<>();
        this.potions = new ArrayList<>();
    }

    public List<Spell> getKnownSpells() {
        return knownSpells;
    }

    public List<Potion> getPotions() {
        return potions;
    }

    public void learnSpell(Spell spell) {
        knownSpells.add(spell);
    }

    public void addPotion(Potion potion) {
        potions.add(potion);
    }
    public void defend() {
        int diceRoll = Dice.roll(); // Roll a dice to determine defense effectiveness
        int damageReduction = diceRoll * this.getDefense();
        this.takeDamage(damageReduction);
    }

    @Override
    public void attack(Character character) {
        int diceRoll = Dice.roll(); // Roll a dice to determine attack effectiveness
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

}

