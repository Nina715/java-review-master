package cars;

public class FilterNewCar implements CarPredicate{

    @Override
    public boolean filterCar(Car car) {
        return car.getYear()>2015;
    }
}
