package com.example.zoomanagementass3.Model;

/**
 * Cougar species model.
 *
 * @author Ian
 */
public class Cougar extends BigCat {
    public Cougar(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Cougar";
    }
}
