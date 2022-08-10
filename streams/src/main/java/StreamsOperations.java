import java.util.Arrays;
import java.util.List;

public class StreamsOperations {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,3,5,3,2,2,3);
        //myList.forEach(m->System.out.println(m));
        myList.forEach(System.out::println);
        /**use foreach as terminal operations*/
        System.out.println("***********filter***********");

        //step 1: convert to stream
        //step 2: filter out the value that is even
        //step 3: for each of the filtered value, print it out
        myList.stream()
                .filter(m->m%2==0)
                .forEach(System.out::println);

        System.out.println("*******distinct********");
        //filtering distinct element, filtering element first, then choose only distinct elements, then print
        myList.stream()
                .filter(m->m%2==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("*******limit*******");
        //filtering distinct element, filtering element first, then choose only distinct elements, then limit the size to only 1 and print
        myList.stream()
                .filter(m->m%2==0)
                .distinct()
                .limit(1)
                .forEach(System.out::println);


        //skipping: skipping the # of elements you designated
        System.out.println("*******skip*******");
        // convert to stream, then filter, then skip the first two elements filtered and print the rest that is left
        myList.stream()
                .filter(m->m%2==0)
                .skip(2)
                .forEach(System.out::println);

        //Map: takes a function, and the function applied to each element, mapping it to a new element
        System.out.println("*******Map*******");
        //first convert to map, then multiply all elements in the list by 3, then filter the result to get event number, then print out the filtered result
        myList.stream()
                .map(i->i*3)
                .filter(i->i%2==0)
                .forEach(System.out::println);

        System.out.println("******word list*******");
        List<String> words = Arrays.asList("Java","Apple","Honda","Developer");
        //print number of characters for each word
        words.stream()
                .map(String::length)
                .forEach(System.out::println);


    }
}
