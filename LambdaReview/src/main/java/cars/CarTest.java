package cars;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Honda", 2015, 200));
        cars.add(new Car("Honda", 2008, 200));
        cars.add(new Car("Toyota", 2021, 155));
        cars.add(new Car("Audi", 2000, 200));
        cars.add(new Car("Tesla", 2022, 140));

        CarPredicate newCar = new FilterNewCar();
        CarPredicate fastCar = new FilterTopSpeed();
        CarPredicate durableCar = new DurableCar();
        System.out.println(filterCar(cars, fastCar));
        System.out.println(filterCar(cars, newCar));
        System.out.println(filterCar(cars,durableCar));

        //fast car with lambda
        System.out.println(filterCar(cars, car -> car.getTopSpeed() > 160));
        // new car with lambda
        System.out.println(filterCar(cars, car -> car.getYear() > 2018));


    }

    public static List<Car> filterCar(List<Car> inventory, CarPredicate car) {
        List<Car> result = new ArrayList<>();

        for (Car individualCar : inventory) {
            if (car.filterCar(individualCar)) {
                result.add(individualCar);
            }
        }
        return result;
    }
}
