package Domain;

import java.util.Date;
import java.util.jar.JarException;

public class Person {

    private String firstName;
    private String midName;
    private String lastName;
    private Date birthDate;
    private int telephoneNumber;
    private char sex;

    public Person(String firstName, String midName, String lastName, Date birthDate, int telephoneNumber, char sex) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.telephoneNumber = telephoneNumber;
        this.sex = sex;
    }



    public String getLastName() {
        return lastName;
    }


}
