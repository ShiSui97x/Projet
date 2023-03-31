package org.example;

import lombok.Getter;
import lombok.Setter;

public class Reward {
    @Getter
    @Setter
    private int healthPoints;
    @Getter
    @Setter
    private int damagePoints;

    public Reward(int healthPoints, int damagePoints) {
        this.healthPoints = healthPoints;
        this.damagePoints = damagePoints;
    }


}

