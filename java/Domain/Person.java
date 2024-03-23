package Domain;

import java.util.Date;
import java.util.jar.JarException;

public class Person {

    private String firstName;
    private String midName;
    private String lastName;
    private Date birthDate;
    private long telephoneNumber;
    private char sex;

    public Person(String firstName, String midName, String lastName, Date birthDate, long telephoneNumber, char sex) {
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }


    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
