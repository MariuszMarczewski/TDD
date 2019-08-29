package cars;

import cars.Car;
import cars.CarRepository;

import java.util.*;
import java.util.stream.Collectors;

public class InMemoryCarRepository implements CarRepository {

    private List<Car> cars;

    public InMemoryCarRepository(List<Car> cars) {
        this.cars = cars;
    }

    public InMemoryCarRepository() {

    }

    private void init() {
        List<Car> cars = Arrays.asList(
                new Car("Volvo", 1999, "Sweden"),
                new Car("Saab", 2010, "Sweden"),
                new Car("Renault", 2015, "France"),
                new Car("Dacia", 1999, "Romania"),
                new Car("Lada", 2009, "Russia"),
                new Car("Skoda", 1999, "Czech Republic"),
                new Car("Citroen", 2001, "France"),
                new Car("Audi", 2006, "Germany"),
                new Car("Opel", 2013, "Germany")
                );

    }

    @Override
    public List<Car> findAll() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<Car> findByName(String name) {
        return cars.stream()
                .filter(car -> car.getName().equals(name))
                .collect(Collectors.toList());

    }

    @Override
    public List<Car> findByYear(int year) {
        return cars.stream()
                .filter(car -> car.getName().equals(year))
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, List<Car>> groupByYear() {
        return cars.stream()
                .collect(Collectors.groupingBy(car -> car.getCountry()));
    }

    @Override
    public List<Car> sortByYear() {
        return cars.stream()
                .sorted(Comparator.comparingInt(car -> car.getYear()))
                .collect(Collectors.toList());
    }
}
