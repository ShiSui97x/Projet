package org.example;

import java.util.*;

import java.util.Random;

public class SortingHat {
    private List<House> houses = Arrays.asList(new Gryffindor(), new Hufflepuff(), new Ravenclaw(), new Slytherin());

    public House assignHouse(Wizard wizard) {
        House house = houses.get(new Random().nextInt(houses.size()));
        house.welcome(wizard);
        return house;
    }
}




