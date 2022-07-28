import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
       //no type checking.. any objects can be accepted into the list ArrayList items = new ArrayList();
        
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        // if there is no type check, then this one is accepted items.add("apple");

        printDouble(items);
        
    }

    private static void printDouble(ArrayList<Integer> items) {
        for (Integer i:items){
            System.out.println(i*2);
        }
    }
}
