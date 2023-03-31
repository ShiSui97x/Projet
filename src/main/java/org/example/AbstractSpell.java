package org.example;

public abstract class AbstractSpell {

    private String name;
    private int baseDamage;
    private int baseSuccessRate;

    public AbstractSpell(String name, int baseDamage, int baseSuccessRate) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.baseSuccessRate = baseSuccessRate;
    }

    public String getName() {
        return name;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int getBaseSuccessRate() {
        return baseSuccessRate;
    }

    public abstract int getFinalDamage(Wizard wizard, Enemy enemy);

    public abstract int getFinalSuccessRate(Wizard wizard, Enemy enemy);

    public abstract int getDamage();
}


