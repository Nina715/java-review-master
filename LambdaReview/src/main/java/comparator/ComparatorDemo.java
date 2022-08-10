package comparator;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.text.WrappedPlainView;
import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        //ascending sort
        Collections.sort(list);
        System.out.println(list);

        //comparator interfaqce acceots two object and return an integer: -1 obj1 comes before obj2, 1 obj1 comes before obj2, 0 obj1==obj2
       // Collections.sort(list,new MyComparator());
       // System.out.println(list);

        Collections.sort(list,((o1,o2)->(o1>o2)?-1:(o2>o1)?1:0));
        System.out.println(list);

        //ascending
        //simplified and call comparator method.. java already built a 1,-1,0 into the method compareTo
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);
        //descending
        list.sort((o2,o1)->o1.compareTo(o2));
        System.out.println(list);

        //comparator.comparig: accepts a sort key function and returns a comparator for the type
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(80,Color.YELLOW));
        apples.add(new Apple(155,Color.RED));
        apples.add(new Apple(80,Color.GREEN));

        apples.sort(Comparator.comparing((Apple a)->a.getWeight()));
        System.out.println(apples);

        apples.sort(Comparator.comparing((Apple::getColor)));
        System.out.println(apples);

        //reverse
        apples.sort(Comparator.comparing(Apple::getWeight).reversed());
        System.out.println(apples);

        //chaining - first sorting on weight then color (the order enum is written)
        apples.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getColor));
        System.out.println(apples);


    }
}
