package com.example.zoomanagementass3.Model;

/**
 * Tiger species model.
 *
 * @author Ian
 */
public class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Tiger";
    }
}
