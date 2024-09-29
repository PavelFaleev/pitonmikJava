package com.pitomnik.animals;

import java.time.LocalDate;
import java.util.List;

public abstract class Pets extends Animal {

    public Pets(String name, LocalDate birthDate, List<String> commands) {
        super(name, birthDate, commands);
    }
}
