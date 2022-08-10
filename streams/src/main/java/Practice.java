import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
       List<Integer> updatedList = integerList.stream()
                .map(i->i*i)
                .collect(Collectors.toList());
        System.out.println(updatedList);

       List<Integer> numbers1 = Arrays.asList(1,2,3);
       List<Integer> numbers2 = Arrays.asList(3,4);


    }
}
