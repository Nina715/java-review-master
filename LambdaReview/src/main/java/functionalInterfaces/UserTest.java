package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("David","Nick",56));
        users.add(new User("Nina","Sayram",30));
        users.add(new User("Ether","Eshay",23));
        users.add(new User("Harry","Porter",33));
        users.add(new User("Auther","Harry",42));
        users.add(new User("James","King",18));

        //print all elements in the list
        Consumer<List<User>> printAll=list->list.forEach(user-> System.out.println(user));

        Predicate<User> print = u->u.getLastName().startsWith("E");
        // print all users that last name starts with E
        Consumer<List<User>> printE=list->list.forEach(user -> {if (print.test(user)) System.out.println(user);});

        printAll.accept(users);
        System.out.println("user's last name starts with E");
        printE.accept(users);

        //second way
        printName(users,p->true);
        printName(users,p->p.getLastName().startsWith("E"));
    }

    private static void printName(List<User> users,Predicate<User> p){
        for (User user : users) {
            if (p.test(user)){
                System.out.println(user);
            }
        }
    }
}
