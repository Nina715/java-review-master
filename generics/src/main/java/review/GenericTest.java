package review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Mike", 101));
        students.add(new Student("Joe", 102));
        students.add(new Student("Adam", 103));


        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Albus", 201));
        teachers.add(new Teacher("Severus", 202));

        printInfo(students);
        printing(students);
        System.out.println(returnItem(students).getName());

        MyUtils<Student> student1 = new MyUtils<>();
        student1.printing(students);
        MyUtils<Teacher> teacher1= new MyUtils<>();
        System.out.println(teacher1.returnItem(teachers));
        System.out.println(student1.returnName(students));

    }

    //methods: take the list of students and print each student and total count
    public static void printInfo(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("total count: " + students.size());
    }

    //method that takes list and print each items and total count
    //creating a dynamic method by putting it in the method
    public static <T> void printing (List<T> generalList){
        for (T item : generalList) {
            System.out.println(item);
        }
        System.out.println("total  count: "+generalList.size());
    }

    //write a method that takes a list and return the last item of the list
    public static <T> T returnItem(List<T> list){
        return list.get(list.size()-1);
    }
}
