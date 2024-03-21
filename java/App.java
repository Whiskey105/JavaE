import Domain.Person;
import Domain.Validator;

//TODO создать кастомные исключения
public class App {
    public static void main(String[] args) throws Exception {

        //TODO проверить работу представления
        String test = "Петров/Сергей/Алексадрович/01.02.2002/79234123342/z";

        String[] arrTest =  test.split("/");

        //int n = Integer.parseInt(arrTest[2]);

        boolean testB = Validator.validateNumber(arrTest[2]);

        //Validator.validateChar(arrTest[2]);

        System.out.println(testB);

    }


}
