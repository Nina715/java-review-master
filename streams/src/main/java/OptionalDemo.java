import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,2,10,23);

        //empty() - is present
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());//if empty it will display false
        System.out.println(Optional.of(numbers).isPresent());

        //ifPresent
        Optional<Integer> bigNumber = numbers.stream().filter(x -> x > 100).findAny();
        bigNumber.ifPresent(System.out::println); // if no value, then it doesnt do anything

        //get
        //System.out.println(bigNumber.get());//return nums

        //orElse
        System.out.println(bigNumber.orElse(0));//if theres nothing then return 0


    }
}
