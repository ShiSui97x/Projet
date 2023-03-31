package org.example;

public class Enemy extends AbstractEnemy {

    public Enemy(String name, int maxHP, int damage, int defense, int accuracy) {
        super(name, maxHP, damage, defense, accuracy);
    }

    @Override
    public void specialAttack(Character character) {
        // L'ennemi ordinaire n'a pas de spécialité
    }
}

