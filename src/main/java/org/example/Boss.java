package org.example;

public class Boss extends AbstractEnemy {

    private AbstractSpell specialSpell;

    public Boss(String name, int maxHP, int damage, int defense, int accuracy, AbstractSpell specialSpell) {
        super(name, maxHP, damage, defense, accuracy);
        this.specialSpell = specialSpell;
    }

    @Override
    public void specialAttack(Character character) {
        if (Math.random() < getAccuracy() / 100.0) {
            System.out.println(getName() + " lance un sort spécial sur " + character.getName() + " !");
            int damageDealt = specialSpell.getDamage();
            character.setCurrentHP(character.getCurrentHP() - damageDealt);
            System.out.println(character.getName() + " perd " + damageDealt + " points de vie !");
        } else {
            System.out.println(getName() + " rate son attaque spéciale !");
        }
    }
}
