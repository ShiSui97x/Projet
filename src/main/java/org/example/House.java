package org.example;


import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class House {
    private String name;
    private String specialty;
    public House(String name, String specialty){
        this.name=name;
        this.specialty=specialty;
    }
}



