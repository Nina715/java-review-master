import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        // create an empty set
        Set<Student> studentSet = new HashSet<>();

        //add elements
        studentSet.add(new Student(7, "Ibadet"));
        studentSet.add(new Student(8, "Ahmet"));
        studentSet.add(new Student(9, "Muhabbet"));
        studentSet.add(new Student(10, "Nina"));
        studentSet.add(new Student(9,"Muhabbet")); // adding it, because java think this is another object due to new keyword
        //must add equals and hashcode method to ensure objects are compared before adding
        // must add hashCode or else dups are still going to be added
        // hashset uses hashing mechanism to generate hashcode to store object/items, if we dont override the hashing mechanism... then it
        //wont be able to compare two items


        //printing myset
        System.out.println(studentSet);

        //adding another set
        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        numSet.add(2);
        System.out.println(numSet);//1,2
        System.out.println(numSet.add(2));// false, does not add as hashSet does not accept dups

        System.out.println(firstRepeatingChar("Java Developer"));


    }

    // find the first repeating char in string
    public static Character firstRepeatingChar(String example) {
        Set<Character> charSet = new HashSet<>();

        for (int i = 0; i < example.length(); i++) {
            if (charSet.add(example.charAt(i)) == false) {
                return example.charAt(i);
            }
        }
        return null;
    }

}
