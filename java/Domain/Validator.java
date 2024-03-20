package Domain;

import java.text.ParseException;

public class Validator {

    public boolean validateStringSize(String line) throws Exception {
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

    public boolean validateNumber(String number) throws Exception {
        try {
            int num = Integer.parseInt(number);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
