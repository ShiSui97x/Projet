package org.example;


import lombok.Getter;



@Getter
public class House {
    private final String name;
    private final String specialty;

    public House(String name, String specialty){
        this.name=name;
        this.specialty=specialty;
    }
}



