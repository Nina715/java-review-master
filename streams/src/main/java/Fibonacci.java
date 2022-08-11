import java.util.Arrays;
import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {
        Stream.iterate(0,n->n+2)
                        .limit(5)
                                .forEach(System.out::println);

        //stream, iterate(given initial value, then lambda expression and provide the rule that you want this initial value to follow
        // limit the iteration to 8 and print the first and second value in the array
        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(8)
                .forEach(t-> System.out.println(t[0]+", "+t[1]));

        Stream.iterate(new int[] {0,1,2,3},t->new int[]{t[1],t[2],t[3],t[0]+t[2]})
                .limit(5)
                .forEach(t-> System.out.println(t[0]+", "+t[1]+", "+t[2]+", "+t[3]));

        //print the fibonacci number the regular way
        //create fibonacci number
        //map to only get the first element
        //print each element
        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(8)
                .map(t->t[0])
                .forEach(b-> System.out.print(b+" "));

    }
}
