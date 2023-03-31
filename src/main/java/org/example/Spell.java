package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Spell extends AbstractSpell {
    @Getter
    @Setter
    private int damage;
    @Getter
    @Setter
    private int precision;
    @Getter
    @Setter
    public String name;

    public List<String> knowSpells;

    public Spell(String name, int successRate, int damage) {
        super(name, successRate, damage);
        this.damage = damage;

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

    public int getSuccessChance() {
        switch(this.name){
            case "Wingardium Leviosa":

            default:
                throw new IllegalStateException("Unexpected value: " + this.name);
        }

    }
}

