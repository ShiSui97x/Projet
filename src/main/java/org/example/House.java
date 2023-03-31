package org.example;

import lombok.Getter;

public class House {
    @Getter
    private String name;

    public House(String name) {
        this.name = name;
    }

    public void applyHouseBonus(Character character) {
        switch (name) {
            case "Gryffindor":
                character.setDefense(character.getDefense() + 5);
                break;
            case "Slytherin":
                character.setDamage(character.getDamage() + 5);
                break;
            case "Hufflepuff":
                for (Potion potion : character.getPotions()) {
                    potion.setPower(potion.getPower() + 10);
                }
                break;
            case "Ravenclaw":
                character.setAccuracy(character.getAccuracy() + 10);
                break;
        }
    }

}



