import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CarServiceTest {

    @Test
    public void findAllShouldReturnListofPets(){
//        given

        List<Car> testCars = Arrays.asList(
                new Car("syrena", 1960, "Poland"),
                new Car("pobieda", 1953, "Poland")
                );

        CarService carService = new CarService(new InMemoryCarRepository(testCars));

//        when

        List<Car> actuallist = carService.findAll();

//        then

        Assert.assertEquals(testCars, actuallist);
    }

}