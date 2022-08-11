import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {

        //creating stream: from array
        String[] courses = {"Java", "JS", "TS"};
        Stream<String> courseStream = Arrays.stream(courses);

        // creating stream from collection
        List<String> courseList = Arrays.asList("Java","JS","TS","Spring");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("Spring",102),
                new Course("Microservices",103)
        );
        Stream<Course> myCourseStream = myCourses.stream();

        //creating streams from values
        Stream<Integer> stream = Stream.of(1,2,3,4,5);

        //intermediate operations are in documentations

        //map: takes stream<T> and returns stream<T>, it produces single value for each input value, it is called one to one mapping
        //flatmap: takes stream<stream<T>> as input and returns stream<t>, it is a mapper function produces multiple valuye for each input value, it is called one to many mapping
        //eg. Stream.of(1,2,3,4); -> [1,2,3,4] mapping it will produce another stream
        // [[1,2],[3,4],[5,6],[7,8]] --> flatmap produces [1,2,3,4,5,6,7,8]

        //anyMatch:check if theres any element in the stream matches the given predicate and return boolean
        // all match: check if all elements match, return boolean
        //non-match: ensure no elements in the stream match the given predicate
        // findany: return any element from a stream

        //reduce:reduce to sum of numbers in a stream
        //iterate: create infinite stream... can limit the size of stream by using limit
    }
}
