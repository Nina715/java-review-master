import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        //toCollections (Supplier): create a collection using collector

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);
        // first stream, filter out all the even values and collect into an array List
        List<Integer> numList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numList);

        Set<Integer> numSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numSet);

        //toList: returns a collector interface that gathers the input data into a new list
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        //toSet: returns a collector interface that gathers the input data into a new set
        Set<Integer> numSet2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());

        //toMap(function, function): returns a collector interface that gathers the input data into a new map
        //stream, then collect all list data into a map... but need 2 functions to decide the key and value
        Map<String, Integer> dishMap = DishData.getall().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        //counting(): return a collector that counts the nuymber of the elements
        Long count = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());
        System.out.println(count);

        //summingInt: (ToIntFunction): returns a collector that produces the sum of a integer value func
        //put everything into stream, then collect and use to sum to sum up all the calories in the list
        Integer caloriesSum = DishData.getall().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(caloriesSum);

        //averagingInt (ToIntFunction): returns avg of the integers passed values
        Double avgCalories = DishData.getall().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(avgCalories);

        //joining(): is used to join various elements of a character of string array into a single string obj
        List<String>courses = Arrays.asList("Java","JS","TS");
        System.out.println(courses.stream()
                .collect(Collectors.joining("+")));

        //partitioningBy(): used to partition a stream obj based on a given predicate
        //output is gonna be in map format, one true key + one list of all obj which is falls in the given condition, and one false key + one list of all obj that doesnt follow the given condition
        Map<Boolean, List<Dish>> vegeDish = DishData.getall().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(vegeDish);

        //groupingBy(): is used for grouping object by some property and storing results in a map instance
        Map<Type, List<Dish>> dishType = DishData.getall().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);

    }
}
