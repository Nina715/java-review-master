package doubleColonOperator;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {


        //zero - argument
        Supplier<Car> car1 = () -> new Car();
        System.out.println(car1.get().getModel());
        Supplier<Car> car2 = Car::new;
        System.out.println(car2.get().getModel());

        //1 - argument
        Function<String,Car> car3 = car -> new Car(car);
        System.out.println(car3.apply("Honda"));
        Function<String,Car> car4 = Car::new;
        System.out.println(car4.apply("Toyota"));

        //2 - arguments
        BiFunction<String,Integer,Car> car5 = (make,model)->new Car(make,model);
        System.out.println(car5.apply("Honda",2018));
        BiFunction<String,Integer,Car> car6 = Car::new;
        System.out.println(car6.apply("Toyota",2017));


    }
}
