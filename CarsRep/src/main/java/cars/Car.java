package cars;

import java.util.Objects;

public class Car {

    private String name;
    private int year;
    private String country;

    public Car(String name, int year, String country) {
        this.name = name;
        this.year = year;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car cars = (Car) o;
        return year == cars.year &&
                Objects.equals(name, cars.name) &&
                Objects.equals(country, cars.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, country);
    }
}
