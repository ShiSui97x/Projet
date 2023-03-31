package org.example;

public class Level {
    private int levelNumber;
    private Enemy enemy;
    private List<Spell> availableSpells;

    public Level(int levelNumber, Enemy enemy, List<Spell> availableSpells) {
        this.levelNumber = levelNumber;
        this.enemy = enemy;
        this.availableSpells = availableSpells;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public List<Spell> getAvailableSpells() {
        return availableSpells;
    }
}

