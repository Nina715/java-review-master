package cars;

public class DurableCar implements CarPredicate{
    @Override
    public boolean filterCar(Car car) {
        return car.getMake().equalsIgnoreCase("toyota");
    }
}
