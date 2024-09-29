package com.pitomnik.animals;

import java.time.LocalDate;
import java.util.List;

public class Donkey extends PackAnimals {

    private double strength;

    public Donkey(String name, LocalDate birthDate, List<String> commands, double strength) {
        super(name, birthDate, commands);
        this.strength = strength;
    }

    public double getStrength() {
        return strength;
    }

    @Override
    public String getType() {
        return "Donkey";
    }
}
