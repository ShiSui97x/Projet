package org.example;

public abstract class AbstractEnemy extends Character {

    public AbstractEnemy(String name, int maxHP, int damage, int defense, int accuracy) {
        super(name, maxHP, damage, defense);
    }

    public abstract void specialAttack(Character character);

    @Override
    public void defend(Character enemy) {
        System.out.println(getName() + " se prépare à encaisser une attaque...");
        setDefense(getDefense() * 2);
    }

    @Override
    public void attack(Character character) {
        if (Math.random() < getAccuracy() / 100.0) {
            System.out.println(getName() + " attaque " + character.getName() + " !");
            int damageDealt = (int) (getDamage() * (1 - character.getDefense() / 100.0));
            character.setCurrentHP(character.getCurrentHP() - damageDealt);
            System.out.println(character.getName() + " perd " + damageDealt + " points de vie !");
        } else {
            System.out.println(getName() + " rate son attaque !");
        }
    }
}
