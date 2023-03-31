package org.example;

import lombok.Getter;

public abstract class AbstractSpell {
    @Getter
    private String name;
    @Getter
    private int baseDamage;
    @Getter
    private int baseSuccessRate;

    public AbstractSpell(String name, int baseDamage, int baseSuccessRate) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.baseSuccessRate = baseSuccessRate;
    }

    public abstract int getDamage();

    public abstract void cast(Wizard wizard);
}


