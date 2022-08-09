import java.lang.reflect.Array;
import java.util.*;
import java.util.function.*;

public class Practice {
    public static void main(String[] args) {

        // accepts one parameter and return boolean value
        Predicate<Integer> greaterThan10 = num -> num > 10;
        System.out.println(greaterThan10.test(15));
        System.out.println(greaterThan10.test(5));

        // accepts 2 arguments and return boolean value
        BiPredicate<Integer, Integer> greater = (num1, num2) -> num1 > num2;
        System.out.println(greater.test(20, 50));

        //consumer, one parameter, no return
        Consumer<String> printStar = str -> System.out.println("***" + str + "***");
        printStar.accept("hello");

        //Biconsumer: 2 paameters, no return
        BiConsumer<String, String> combine = (str1, str2) -> System.out.println(str1 + " " + str2);
        combine.accept("nigara", "sayram");

        //method accepts int and int, print the string given times of time
        BiConsumer<Integer, String> printNtimes = (n, str) -> {
            for (Integer i = 0; i < n; i++) {
                System.out.println(str);
            }
        };

        printNtimes.accept(5, "hello");

        //task - foreach
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Steven", 5000);
        map.put("Albus", 4500);
        map.put("Harold", 5500);
        map.put("Steve", 3500);
        map.put("Nathan", 5000);
        map.put("Nick", 6000);

        //print name of employees whose salary is more than 5k
        map.forEach((key, value) -> {
            if (value > 5000) {
                System.out.println(key);
            }
        });

        //takes 2 int arry and combine to lis of arrays
        BiFunction<int[], int[], List<Integer>> combineArrays = (arr1, arr2) -> {
            List<Integer> combinedList = new ArrayList<>();
            for (int i : arr1) combinedList.add(i);
            for (int i : arr2) combinedList.add(i);
            return combinedList; };

    }



}
