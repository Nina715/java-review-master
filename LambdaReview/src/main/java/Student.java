import lombok.Data;

import java.util.Objects;

@Data
public class Student {
    private String firstName;
    private String lasttName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private int age;


    //lombok --> everything with annotations
    //noarg constructor: not for static fields
    //allargs constrcutor: not for final field already initialized, or static fields
    //requiredArgsConstructor: uninitialized final fields and fields with constrians such as @NonNull
    //you can modify access level to generate constructor
    //data: getter for all fields, setters for all non-final fields, to string method, hashcode and equals implementation, constructor (for requiredArgsConstructor)
    //builder annotation can be applied at class, constructor and method level.
}
