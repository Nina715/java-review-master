import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {
        // all match
        // first stream then check all the values in the stream to see if all the dishes have less than 1000 calories
        System.out.println("******all match******");
        boolean isHealthy = DishData.getall()
                .stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("******any match vegeterian option*****");
        boolean containsVegeterian = DishData.getall()
                .stream().anyMatch(Dish::isVegetarian);
        System.out.println(containsVegeterian);

        System.out.println("*******None match******");
        boolean notContain = DishData.getall()
                .stream().noneMatch(dish -> dish.getCalories()>1000);
        System.out.println(notContain);

        System.out.println("********find any**********");
        Optional<Dish> dish = DishData.getall()
                .stream().filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish);

        System.out.println("******findFirst*****");
        Optional<Dish> dish2 = DishData.getall()
                .stream().filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2);

    }
}
