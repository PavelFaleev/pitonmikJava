package com.pitomnik.registry;

import com.pitomnik.animals.Animal;
import com.pitomnik.db.AnimalDAO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> animals;
    private AnimalDAO dao;

    public AnimalRegistry() {
        dao = new AnimalDAO();
        animals = dao.loadAllAnimals();
        Counter.setCount(animals.size());
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        dao.saveAnimal(animal);
        Counter.increment();
    }

    public List<String> getCommands(String animalName) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                return animal.getCommands();
            }
        }
        return null;
    }

    public boolean addCommand(String animalName, String command) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                animal.addCommand(command);
                return true;
            }
        }
        return false;
    }

    public List<Animal> getAnimalsByBirthDate() {
        List<Animal> sorted = new ArrayList<>(animals);
        sorted.sort(Comparator.comparing(Animal::getBirthDate));
        return sorted;
    }

    public int getTotalCount() {
        return Counter.getCount();
    }

    public List<Animal> getAllAnimals() {
        return animals;
    }
}
