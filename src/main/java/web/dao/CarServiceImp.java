
package web.dao;

        import org.springframework.stereotype.Component;
        import web.model.Car;
        import java.util.ArrayList;
        import java.util.List;

@Component
public class CarServiceImp implements CarService{

    private static int carsCount;
    private final List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(++carsCount,"Audi",5000000));
        cars.add(new Car(++carsCount,"VAZ",1000000));
        cars.add(new Car(++carsCount,"Mersedes",3000000));
        cars.add(new Car(++carsCount,"Opel",2000000));
        cars.add(new Car(++carsCount,"Lada",1000000));
    }

    @Override
    public List<Car> showCars(int count) {
        return cars.stream().limit(count).toList();
    }
}