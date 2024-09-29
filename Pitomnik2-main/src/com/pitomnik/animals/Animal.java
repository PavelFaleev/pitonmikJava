package com.pitomnik.animals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> commands;

    public Animal(String name, LocalDate birthDate, List<String> commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>(commands);
        com.pitomnik.registry.Counter.increment();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public abstract String getType();
}
