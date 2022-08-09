package cars;

@FunctionalInterface
public interface CarPredicate {
    public boolean filterCar (Car car);
}
