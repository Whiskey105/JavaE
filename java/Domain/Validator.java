package Domain;

import Exceptions.InvalidArrayLengthException;
import Exceptions.InvalidFormatException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Validator {

    //TODO Переписать методы по кастомные исключения
    public static boolean validateStringSize(String line) throws Exception {
        String[] parsedLine = line.split(" ");
        int fieldsCount = 6;
        try {
            if(parsedLine.length > fieldsCount) {
                throw new InvalidArrayLengthException("More fields than necessary!");
            } else if (parsedLine.length < fieldsCount){
                throw new InvalidFormatException("There are not enough fields to create a record!");
            }
        } catch (InvalidFormatException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Проверьте корректность ввода строки, число полей неверно - " + parsedLine.length);
            return false;
        }

        return true;
    }


    //TODO Продумать форматирование первого символа (нужна ли проверка и удаление или сразу выводить исключение)
    public static boolean validateNumber(String number) throws Exception {
        try {
            Long.parseLong(number);
            return true;
        } catch (NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Неверный формат номера - " + number);
            return false;
        }
    }

    public static boolean validateChar (String sex) throws Exception {
        try {
            if(!sex.equals("m") && !sex.equals("f"))
            {
                throw new InvalidFormatException("Invalid format exception");
            }
        } catch (InvalidFormatException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Неверный формат пола - " + sex);
            return false;
        }


        return true;
    }

    public static boolean validateDate (String date) throws  Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        try {
            formatter.parse(date);
        } catch (ParseException e) {
            System.out.println("Error: "+ e.getMessage());
            System.out.println("Неверный формат года рождения - " + date);
            return false;
        }
        return true;
    }





}
