package applePrint;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> appleInventory = new ArrayList<>();
        appleInventory.add(new Apple(AppleColor.GREEN, 120));
        appleInventory.add(new Apple(AppleColor.RED, 155));
        appleInventory.add(new Apple(AppleColor.GREEN, 160));
        appleInventory.add(new Apple(AppleColor.GREEN, 85));
        appleInventory.add(new Apple(AppleColor.RED, 155));

        applePrintPredicate simplePrint = m-> System.out.println("An apple of "+m.getWeight()+" g");
        applePrintPredicate fancyPrint = m ->{
            if (m.getWeight()<120) System.out.println("A light "+ m.getColor()+" apple.");
            else System.out.println("A heavy "+m.getColor()+" apple.");
        };

        for (Apple apple : appleInventory) {
          simplePrint.prettyPrint(apple);
        }
        for (Apple apple : appleInventory) {
            fancyPrint.prettyPrint(apple);
        }


    }


}
