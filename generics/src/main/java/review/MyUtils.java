package review;

import java.util.List;

public class MyUtils<T> {

    //method that takes list and print each items and total count
    //creating a dynamic method by putting it in the method
    public void printing(List<T> generalList) {
        for (T item : generalList) {
            System.out.println(item);
        }
        System.out.println("total  count: " + generalList.size());
    }

    //write a method that takes a list and return the last item of the list
    public T returnItem(List<T> list) {
        return list.get(list.size() - 1);
    }

    //take a list and return last item - name
    public String returnName(List<T> list) {
        if (list.get(list.size() - 1) instanceof Student) {
            return ((Student) list.get(list.size() - 1)).getName();
        } else if (list.get(list.size() - 1) instanceof Teacher) {
            return ((Teacher) list.get(list.size() - 1)).getName();
        } else {
           return "invalid";
        }
    }
}
