package org.example;

import lombok.Getter;

public class Potion {
    @Getter
    private String name;
    @Getter
    private int healingPower;

    public Potion(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    public void use(Wizard wizard) {
        wizard.getPotions(wizard.getHealthPoints() + healingPower);
    }
}

