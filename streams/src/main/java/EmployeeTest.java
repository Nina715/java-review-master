import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //print all emails
        //mapping as one employee has one email
        EmployeeData.readAll().
                map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //print all phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmPhoneNumbers)
                .forEach(System.out::println);
        System.out.println("*********get individual phone #*************");
        //first way to get phone numbers
        //flatmap it to get the list of phone number... then stream the list to get individual value then print each individual value
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmPhoneNumbers().stream())
                .forEach(System.out::println);

        //flatmap it to get the list of phone number... then stream the list to get individual value then print each individual value
        EmployeeData.readAll()
                .map(Employee::getEmPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
