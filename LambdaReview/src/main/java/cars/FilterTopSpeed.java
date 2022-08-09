package cars;

public class FilterTopSpeed implements CarPredicate{

    @Override
    public boolean filterCar(Car car) {
        return car.getTopSpeed()>160;
    }
}
