package com.example.zoomanagementass3.Model;

/**
 * Abstract base for all big cat species (Lion, Tiger, Cougar, ...).
 *
 * @author Ian
 */
public abstract class BigCat extends Animal {

    protected BigCat(String name, int age) {
        super(name, age);
    }
}
