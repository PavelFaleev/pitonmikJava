package com.pitomnik.animals;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Pets {

    private String color;

    public Cat(String name, LocalDate birthDate, List<String> commands, String color) {
        super(name, birthDate, commands);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
