package org.example;

import lombok.*;

@AllArgsConstructor
@Getter
public class Potion {
    private String name;
    private int healing;

    public void use(Wizard wizard) {
        wizard.usePotion(this);
    }

    public int getHealing() {
        return this.healing;
    }
}


