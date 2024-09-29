package com.pitomnik.animals;

import java.time.LocalDate;
import java.util.List;

public abstract class PackAnimals extends Animal {

    public PackAnimals(String name, LocalDate birthDate, List<String> commands) {
        super(name, birthDate, commands);
    }
}
