package org.example;

import java.util.Scanner;

public class Game {
    private Wizard wizard;
    private Wand wand;
    private SortingHat sortingHat;
    private List<Level> levels;
    private int currentLevelIndex;

    public Game(Wizard wizard, Wand wand, SortingHat sortingHat, List<Level> levels) {
        this.wizard = wizard;
        this.wand = wand;
        this.sortingHat = sortingHat;
        this.levels = levels;
        this.currentLevelIndex = 0;
    }

    public void start() {
        House house = sortingHat.assignHouse(wizard);
        wizard.setHouse(house);
        System.out.println(wizard.getName() + ", welcome to " + house.getName() + "!");

        Scanner scanner = new Scanner(System.in);

        while (wizard.isAlive() && currentLevelIndex < levels.size()) {
            Level level = levels.get(currentLevelIndex);
            System.out.println("Level " + level.getLevelNumber() + ":");
            System.out.println("You are facing " + level.getEnemy().getName() + "!");
            System.out.println("Prepare yourself for the battle!");

            while (wizard.isAlive() && level.getEnemy().isAlive()) {
                System.out.println("What do you want to do?");
                System.out.println("1. Cast a spell");
                System.out.println("2. Drink a potion");
                System.out.println("3. Flee");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Choose a spell to cast:");
                        List<Spell> spells = wizard.getSpells();
                        for (int i = 0; i < spells.size(); i++) {
                            Spell spell = spells.get(i);
                            System.out.println((i + 1) + ". " + spell.getName());
                        }
                        int spellChoice = scanner.nextInt();
                        Spell spell = spells.get(spellChoice - 1);
                        spell.cast(wizard);
                        level.getEnemy().takeDamage(spell.getDamage());
                        break;
                    case 2:
                        System.out.println("Choose a potion to drink:");
                        List<Potion> potions = wizard.getPotions();
                        for (int i = 0; i < potions.size(); i++) {
                            Potion potion = potions.get(i);
                            System.out.println((i + 1) + ". " + potion.getName());
                        }
                        int potionChoice = scanner.nextInt();
                        Potion potion = potions.get(potionChoice - 1);
                        potion.use(wizard);
                        break;
                    case 3:
                        System.out.println("You fled the battle!");
                        wizard.takeDamage(level.getEnemy().getDamage());
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }

                if (level.getEnemy().isAlive()) {
                    level.getEnemy().attack(wizard);
                }
            }

            if (wizard.isAlive()) {
                System.out.println("Congratulations! You have defeated " + level.getEnemy().getName() + "!");
                wizard.gainExperience(level.getExperienceReward());
                currentLevelIndex++;
            } else {
                System.out.println("You have been defeated. Game over!");
            }
        }
    }
}


