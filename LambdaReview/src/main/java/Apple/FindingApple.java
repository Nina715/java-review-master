package Apple;

import java.util.ArrayList;
import java.util.List;

public class FindingApple {
    private int weight;
    private Color color;

    public FindingApple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FindingApple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

    public static void main(String[] args) {
        List<FindingApple> inventory = new ArrayList<>();
        inventory.add(new FindingApple(300,Color.GREEN));
        inventory.add(new FindingApple(100,Color.RED));
        inventory.add(new FindingApple(320,Color.GREEN));
        inventory.add(new FindingApple(50,Color.RED));
        inventory.add(new FindingApple(330,Color.RED));

        List<FindingApple> heavyApple = filterApples(inventory,new HeavyApple());
        List<FindingApple> greenApples = filterApples(inventory,new GreenApple());
        System.out.println(heavyApple);
        System.out.println(greenApples);
    }

    private static List<FindingApple> filterApples(List<FindingApple> inventory, Apple apple) {
        List<FindingApple> result = new ArrayList<>();
        for (FindingApple findingApple : inventory) {
            if (apple.test(findingApple)){
                result.add(findingApple);
            }
        }
        return result;
    }

}
