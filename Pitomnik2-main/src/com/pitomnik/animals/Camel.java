package com.pitomnik.animals;

import java.time.LocalDate;
import java.util.List;

public class Camel extends PackAnimals {

    private int humpCount;

    public Camel(String name, LocalDate birthDate, List<String> commands, int humpCount) {
        super(name, birthDate, commands);
        this.humpCount = humpCount;
    }

    public int getHumpCount() {
        return humpCount;
    }

    @Override
    public String getType() {
        return "Camel";
    }
}
