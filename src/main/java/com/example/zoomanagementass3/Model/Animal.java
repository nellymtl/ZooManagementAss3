package com.example.zoomanagementass3.Model;

import java.util.Objects;

/**
 * Base model for all animals in the zoo.
 * Holds common properties and display helpers used by the UI layer.
 *
 * @author Ian
 */
public class Animal {
    private String name;
    private int age; // in years, non-negative

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Animal name must not be empty");
        }
        this.name = name.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Animal age must be >= 0");
        }
        this.age = age;
    }

    /**
     * Species name for display. Subclasses can override for friendly labels.
     */
    public String getSpecies() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("%s (%d) – %s", getName(), getAge(), getSpecies());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Animal other))
            return false;
        // Consider animals equal when name and concrete type match
        return Objects.equals(name, other.name) && getClass().equals(other.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), name);
    }
}
