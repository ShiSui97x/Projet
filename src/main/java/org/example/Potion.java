package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Potion {
    private String name;
    private int potency;
    private String effect;

    public Potion(String name, int potency, String effect) {
        this.name = name;
        this.potency = potency;
        this.effect = effect;
    }
}


