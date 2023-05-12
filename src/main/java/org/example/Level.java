package org.example;


import lombok.Getter;

@Getter
public class Level {
    private final int number;
    private final String name;
    private final String description;

    public Level(int number, String name, String description){
        this.number= number;
        this.name=name;
        this.description=description;
    }
}


