package doubleColonOperator;

import java.io.PrintStream;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Calculate s1 = (x,y)-> Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate m1 = (x,y)-> new Calculator().findMultiply(x,y);
        m1.calculate(5,6);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply;
        m2.calculate(6,6);

        BiFunction<String,Integer,String> fn = (str,i)->str.substring(i);
        System.out.println(fn.apply("hello", 3));

        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("developer",3));

        Consumer<Integer> display =i-> System.out.println(i);
        Consumer<Integer> display2= System.out::println;
        display.accept(5);
        display2.accept(20);

        //if want to use instance method right after double colon operator, then we need to pass class name as a parameter
        BiFunction<MyClass,Integer,Double> a = MyClass::method;
        BiFunction<String,String,String> concat1 = String::concat;
    }
}
