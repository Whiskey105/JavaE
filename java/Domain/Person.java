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

    //TODO конструктор из строки, сроку валидировать до отправки (не проверять внутри консруктора)

    public String getLastName() {
        return lastName;
    }

    //TODO геттеры и сеттеры для полей
}
