package applePrint;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Apple {
    private AppleColor color;
    private int weight;

// builder generate an all arg constructor unless there is another @XConstructor
}
