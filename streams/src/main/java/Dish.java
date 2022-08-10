import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Dish {
    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;

}


