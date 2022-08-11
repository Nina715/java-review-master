import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);
        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);

        // no intial value
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(result2);

        //maximum and minimum value using reduce
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);

        //count the number of dishes in the stream using map and reduce
        //first stream, then each element in the list will return one
        //then sum the number of 1s to get the sum
        int dishCount = DishData.getall().stream()
                .map(m -> 1)
                .reduce(0, (a, b) -> a + b);
        System.out.println(dishCount);
        long dishCount2 = DishData.getall().stream().count();
        System.out.println(dishCount2);
    }
}
