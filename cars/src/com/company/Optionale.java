package com.company;

import java.util.Optional;

public class Optionale {

    public static void main(String[] args) {

        Optional<Car> car = CarRepository.find("Damian");

        car
                .filter(c -> c.getName().equals("volvo"))
                .map(Car::getName)
                .map(String::toUpperCase)
                .ifPresent(c -> System.out.println(c));


    }
}
