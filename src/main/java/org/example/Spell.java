package org.example;

import lombok.Getter;
import lombok.Setter;

public class Spell extends AbstractSpell {
    @Getter
    @Setter
    private int damage;
    @Getter
    @Setter
    private int precision;

    public Spell(String name, int successRate, int damage,) {
        super(name,successRate,damage);
        this.damage = damage;
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

