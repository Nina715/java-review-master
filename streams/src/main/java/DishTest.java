import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DishTest {


    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800, Type.MEAT),
                new Dish("beef",false,700, Type.MEAT),
                new Dish("chicken",false,400, Type.MEAT),
                new Dish("fries",true,530, Type.OTHER),
                new Dish("rice",true,350, Type.OTHER),
                new Dish("fruit",true,120, Type.OTHER),
                new Dish("pizza",true,550, Type.OTHER),
                new Dish("prawns",false,300, Type.FISH),
                new Dish("salmon",false,450, Type.FISH)
        );

        //printing dishes that has less than 400 calories
        System.out.println("dishes with less than 400 calories");
        menu.stream()
                .filter(m->m.getCalories()<400)
                .forEach(System.out::println);
        System.out.println("***length of the name of each dish***");
        menu.stream()
                .map(m->m.getName().length())
                .forEach(System.out::println);
        //method 2
        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("********print 3 high caloric dish name***********");
        //first convert to stream then filter out the dishes that are above 300, then get the name of those dishes and limit the list to 3
        menu.stream()
                .filter(m->m.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("*******print all dish name that are below 400 calories in order*******");
        //first strean, then filter the ones below 400, then sort based on calories in reverse, then get the name, and print
        menu.stream()
                .filter(m->m.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);



    }
}
