package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CarRepository {

    private static Map<String, Car> cars = new HashMap<>();

    static{
        cars.put("Damian", (new Car("volvo", 1979)));
    }

    private CarRepository() {
    }

    public static Optional<Car> find(String name){

    return Optional.ofNullable(cars.get(name));
    }
}
