package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*public class RPGGame {

    @Getter
    private static Wizard player;

    @Getter
    private SortingHat sortingHat;

    @Getter
    @Setter
    private static boolean gameOver;

    private static Scanner scanner;


    public RPGGame() {
        scanner = new Scanner(System.in);
        sortingHat = new SortingHat();
        player = new Wizard();
        player.setHouse(sortingHat.assignHouse(player));
        player.setKnownSpells(new ArrayList<>());
        player.setPotions(new ArrayList<>());
        gameOver = false;
    }

    public static void startGame() {
        System.out.println("Welcome to Hogwarts!");
        System.out.println("You are now a student at the greatest school of witchcraft and wizardry.");
        System.out.println("You will learn powerful spells, brew potent potions, and make new friends along the way.");
        System.out.println("But be warned, danger lurks around every corner. Are you ready to begin your adventure?");
        System.out.println("Press any key to continue...");
        scanner.nextLine();

        while (!gameOver) {
            playRound();
        }
    }

    private static void playRound() {
        System.out.println("\n====================");
        System.out.println("Current Status:");
        System.out.println(player);


        AbstractEnemy enemy = EnemyFactory.createEnemy();
        System.out.println("\n====================");
        System.out.println("A " + enemy.getSize() + " " + enemy.getClass().getSimpleName() + " appears!");

        while (!enemy.isDefeated() && !player.isDefeated()) {
            playerTurn(enemy);
            if (!enemy.isDefeated()) {
                enemy.attack(player);
            }
        }

        if (player.isDefeated()) {
            System.out.println("You have been defeated. Game over.");
            gameOver = true;
        } else {
            System.out.println("You have defeated the " + enemy.getClass().getSimpleName() + "!");
            player.gainExperience();
            player.levelUp();
            System.out.println("You have gained a level and increased your stats!");
            System.out.println("You may now choose to increase your points of life or points of damage.");
            System.out.println("Enter 'life' to increase points of life, or 'damage' to increase points of damage.");
            String input = scanner.nextLine();
            while (!input.equals("life") && !input.equals("damage")) {
                System.out.println("Invalid input. Please enter 'life' or 'damage'.");
                input = scanner.nextLine();
            }
            if (input.equals("life")) {
                player.increaseMaxHealth();
            } else {
                player.increaseDamage();
            }
        }
    }

    private static void playerTurn(AbstractEnemy enemy) {
        System.out.println("\n====================");
        System.out.println("It is your turn to attack!");
        System.out.println("Choose a spell to cast:");

        List<Spell> knownSpells = player.getKnownSpells();
        for (int i = 0; i < knownSpells.size(); i++) {
            Spell spell = knownSpells.get(i);
            System.out.println((i + 1) + ". " + spell.getName() + " (damage: " + spell.getDamage() + ", success rate: " + spell.getSuccessRate() + "%)");
        }

        String input = scanner.nextLine();
        while (!input.matches("[0-9]+") || Integer.parseInt(input) < 1 || Integer.parseInt(input) > knownSpells.size()) {
            System.out.println("Invalid input. Please enter a number between 1 and " + knownSpells.size() + ".");
            input = scanner.nextLine();
            Spell selectedSpell = knownSpells.get(Integer.parseInt(input) - 1);
            int damage = selectedSpell.cast(getPlayer(),Character.);
            if (damage == 0) {
                System.out.println("You failed to cast the spell!");
            } else {
                System.out.println("You cast " + selectedSpell.getName() + " for " + damage + " damage!");
                enemy.takeDamage(damage);
            }

            if (!enemy.isDefeated()) {
                System.out.println("The " + enemy.getClass().getSimpleName() + " has " + enemy.getCurrentHealth() + " health remaining.");
            }
        }
    }
}*/


