import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        //create arraylist and a class
        List<Student> students = new ArrayList<>();


        // add element to arrayList
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));
        System.out.println(students);

        //iteration on arraylist
        //1. for loop with get () method
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        //2. iterator
        System.out.println("printing with iterator -- forward");
        Iterator iterator = students.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()); //after the last one, the iterator is pointing at the last element, hencehas previous is going backward
        }
        System.out.println("printing with iterator -- backward");
        while (((ListIterator<?>) iterator).hasPrevious()){
            System.out.println(((ListIterator<?>) iterator).previous());
        }

        //3 foreach loop
        System.out.println("printing with foreach loop");
        for (Student student : students) {
            System.out.println(student);
        }

        //4 lambda expression
        System.out.println("printing with lambda");
        students.forEach(student -> System.out.println(student));

        // sorting elements in list
        System.out.println("\n ---Sorting List---");
        Collections.sort(students,new sortedByID());
        System.out.println(students);

        Collections.sort(students,new sortByNameDesc());
        System.out.println(students);

    }

    static class sortedByID implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id- o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
