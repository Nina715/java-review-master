package cars;

public class Car {
    private String make;
    private int year;
    private int topSpeed;

    public Car(String make, int year, int topSpeed) {
        this.make = make;
        this.year = year;
        this.topSpeed = topSpeed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
