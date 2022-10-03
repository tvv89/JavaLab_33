package com.epam.spring.homework1.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {
    private final List<Animal> pets;

    @Autowired
    public Pet(List<Animal> pets) {
        this.pets = pets;
    }

    public void printPets() {
        pets.forEach(s->System.out.println(s.getClass().getSimpleName()));
    }

}
