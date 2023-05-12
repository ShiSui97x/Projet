package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;

public class RPGGame {

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
        player.setHouse(sortingHat);
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
    }

}


