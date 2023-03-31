package org.example;

public class Wand {
    private String type;
    private int power;

    // Constructeur
    public Wand() {
        this.type = generateRandomType();
        this.power = generateRandomPower();
    }

    // Getters et Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private String generateRandomType() {
        String[] types = {"Oak", "Willow", "Holly", "Elder", "Maple"};
        int index = (int) (Math.random() * types.length);
        return types[index];
    }

    private int generateRandomPower() {
        return (int) (Math.random() * 10) + 1;
    }
}

