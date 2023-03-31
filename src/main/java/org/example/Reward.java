package org.example;

public class Reward {
    private int healthPoints;
    private int damagePoints;

    public Reward(int healthPoints, int damagePoints) {
        this.healthPoints = healthPoints;
        this.damagePoints = damagePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}

