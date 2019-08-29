import java.util.List;
import java.util.Map;

public interface CarRepository {


    List<Car> findAll();

    List<Car> findByName(String name);

    List<Car> findByYear(int year);

    Map<String, List<Car>> groupByYear();

    List<Car> sortByYear();
}
