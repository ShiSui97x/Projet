package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Core {
    PHOENIX_FEATHER("Phoenix feather"),
    DRAGON_HEARTSTRING("Dragon heartstring"),
    UNICORN_HAIR("Unicorn hair");

    private final String description;
}

