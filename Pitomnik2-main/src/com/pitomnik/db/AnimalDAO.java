package com.pitomnik.db;

import com.pitomnik.animals.*;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalDAO {

    public void saveAnimal(Animal animal) {
        String sql = "INSERT INTO Animals (name, type, birthDate, commands, specificAttribute, attributeValue) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, animal.getName());
            pstmt.setString(2, animal.getType());
            pstmt.setDate(3, Date.valueOf(animal.getBirthDate()));
            pstmt.setString(4, String.join(", ", animal.getCommands()));
            if (animal instanceof Dog) {
                pstmt.setString(5, "breed");
                pstmt.setString(6, ((Dog) animal).getBreed());
            } else if (animal instanceof Cat) {
                pstmt.setString(5, "color");
                pstmt.setString(6, ((Cat) animal).getColor());
            } else if (animal instanceof Hamster) {
                pstmt.setString(5, "wheelSize");
                pstmt.setDouble(6, ((Hamster) animal).getWheelSize());
            } else if (animal instanceof Horse) {
                pstmt.setString(5, "speed");
                pstmt.setDouble(6, ((Horse) animal).getSpeed());
            } else if (animal instanceof Camel) {
                pstmt.setString(5, "humpCount");
                pstmt.setInt(6, ((Camel) animal).getHumpCount());
            } else if (animal instanceof Donkey) {
                pstmt.setString(5, "strength");
                pstmt.setDouble(6, ((Donkey) animal).getStrength());
            } else {
                pstmt.setString(5, null);
                pstmt.setString(6, null);
            }
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Animal> loadAllAnimals() {
        List<Animal> animals = new ArrayList<>();
        String sql = "SELECT * FROM Animals";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String type = rs.getString("type");
                String name = rs.getString("name");
                LocalDate birthDate = rs.getDate("birthDate").toLocalDate();
                List<String> commands = Arrays.asList(rs.getString("commands").split(",\\s*"));
                String specificAttribute = rs.getString("specificAttribute");
                String attributeValue = rs.getString("attributeValue");
                switch (type) {
                    case "Dog":
                        animals.add(new Dog(name, birthDate, commands, attributeValue));
                        break;
                    case "Cat":
                        animals.add(new Cat(name, birthDate, commands, attributeValue));
                        break;
                    case "Hamster":
                        animals.add(new Hamster(name, birthDate, commands, Double.parseDouble(attributeValue)));
                        break;
                    case "Horse":
                        animals.add(new Horse(name, birthDate, commands, Double.parseDouble(attributeValue)));
                        break;
                    case "Camel":
                        animals.add(new Camel(name, birthDate, commands, Integer.parseInt(attributeValue)));
                        break;
                    case "Donkey":
                        animals.add(new Donkey(name, birthDate, commands, Double.parseDouble(attributeValue)));
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animals;
    }
}
