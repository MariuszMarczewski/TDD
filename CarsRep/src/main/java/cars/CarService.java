package cars;

import cars.Car;
import cars.CarRepository;

import java.util.List;
import java.util.Map;

public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll(){
        return carRepository.findAll();
    }

    public List<Car> findByName(String name){
        return carRepository.findByName(name);
    }

    public List<Car> findByYear(int year){
        return carRepository.findByYear(year);
    }

    public Map<String, List<Car>> groupByYear(){
        return carRepository.groupByYear();
    }

    public List<Car> sortByYear(){
        return carRepository.sortByYear();
    }

}
