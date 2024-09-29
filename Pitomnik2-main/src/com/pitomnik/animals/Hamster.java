package com.pitomnik.animals;

import java.time.LocalDate;
import java.util.List;

public class Hamster extends Pets {

    private double wheelSize;

    public Hamster(String name, LocalDate birthDate, List<String> commands, double wheelSize) {
        super(name, birthDate, commands);
        this.wheelSize = wheelSize;
    }

    public double getWheelSize() {
        return wheelSize;
    }

    @Override
    public String getType() {
        return "Hamster";
    }
}
