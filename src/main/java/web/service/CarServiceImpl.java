package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl {
    private final List<Car> cars = List.of(
            new Car("Toyota", "Camry", "black"),
            new Car("Honda", "Civic", "white"),
            new Car("Ford", "Focus", "red"),
            new Car("BMW", "X5", "black"),
            new Car("Audi", "A4", "yellow")
    );

    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
