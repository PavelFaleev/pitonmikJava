package com.pitomnik.animals;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Pets {

    private String breed;

    public Dog(String name, LocalDate birthDate, List<String> commands, String breed) {
        super(name, birthDate, commands);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
