package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spell extends AbstractSpell {
    private int damage;
    private int precision;

    public Spell(String name, int successRate, int damage, int precision) {
        super(name, successRate);
        this.damage =
                damage;
        this.precision = precision;
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public void cast(Wizard wizard) {
        switch (this.getName()) {
            case "Wingardium Leviosa":
                // Code pour lancer le sort Wingardium Leviosa
                break;
            case "Accio":
                // Code pour lancer le sort Accio
                break;
            case "Expecto Patronum":
                // Code pour lancer le sort Expecto Patronum
                break;
            case "Expelliarmus":
                // Code pour lancer le sort Expelliarmus
                break;
            default:
                System.out.println("Sort inconnu : " + this.getName());
        }
    }
    }
}

