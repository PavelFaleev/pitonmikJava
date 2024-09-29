package com.pitomnik.animals;

import java.time.LocalDate;
import java.util.List;

public class Horse extends PackAnimals {

    private double speed;

    public Horse(String name, LocalDate birthDate, List<String> commands, double speed) {
        super(name, birthDate, commands);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String getType() {
        return "Horse";
    }
}
