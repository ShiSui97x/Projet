package org.example;

public class House {

    private String name;
    private List<Character> members;

    public House(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Character> getMembers() {
        return members;
    }

    public void addMember(Character character) {
        members.add(character);
    }

    public void removeMember(Character character) {
        members.remove(character);
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



