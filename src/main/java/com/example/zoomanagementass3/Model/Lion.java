package com.example.zoomanagementass3.Model;

/**
 * Lion species model.
 *
 * @author Ian
 */
public class Lion extends BigCat {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Lion";
    }
}
