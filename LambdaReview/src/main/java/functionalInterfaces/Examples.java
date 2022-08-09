package functionalInterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {
        //predicate<T> accepts one object and return boolean value
        //below is the elements class, where you are implementing the method
        Predicate<Integer> lesserThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 18;
            }
        };
        System.out.println(lesserThan.test(16));

        //lambda expression way//
        //num<18, is the implementation of test method in the predicate interface
        Predicate<Integer> lessThan = num -> num < 18;
        System.out.println(lessThan.test(20));

        //*********Consumer Interface*********
        Consumer<Integer> display = num-> System.out.println(num);
        display.accept(15);

        //**Biconsumer**//
        BiConsumer<Integer,Integer> addTwo = (a,b)-> System.out.println(a+b);
        addTwo.accept(100,200);

        //*****Function****
        Function<String,String > fun = s->"hello "+s;
        System.out.println(fun.apply("Nina"));

        //******Supplier******//
        //suppliers accepts no arguments and return smth
        Supplier<Double> randomValue = ()->Math.random();
        System.out.println(randomValue.get());

    }
}
