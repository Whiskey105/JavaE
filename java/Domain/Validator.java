package Domain;

import java.text.ParseException;

public class Validator {

    //TODO Переписать методы по кастомные исключения
    public static boolean validateStringSize(String line) throws Exception {
        String[] parsedLine = line.split(" ");
        int fieldsCount = 6;

        if(parsedLine.length > fieldsCount) {
            throw new Exception("Полей больше чем необходимо! Проверьте корректность ввода.");
        } else if (parsedLine.length < fieldsCount){
            throw new Exception("Полей недостаточно для создания записи! Проверьте корректность ввода.");
        } else {
            return true;
        }

    }


    //TODO Продумать форматирование первого символа (нужна ли проверка и удаление или сразу выводить исключение)
    public static boolean validateNumber(String number) throws Exception {
        try {
            int num = Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e){
            System.out.println(e);
            return false;
        }
    }

    public static boolean validateChar (String sex) throws Exception {
        if(sex.length() > 1 || sex != "m" && sex != "f")
        {
            throw new Exception("Пол указан неверно!");
        }

        return true;
    }

    public static boolean validateDate (String date) throws  Exception {

        return false;
    }





}
