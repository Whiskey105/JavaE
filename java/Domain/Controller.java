package Domain;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Controller {

    public static void run() throws Exception {
        boolean isRun = true;
        String switchCommand;
        Scanner scanner = new Scanner(System.in);
        printCommands();
        while(isRun){
            System.out.println("Input command:");
            switchCommand = scanner.nextLine().toLowerCase(Locale.ROOT);
            switch (switchCommand){
                case "add" :
                    createNewRecord();
                    break;
                case "quit" :
                    isRun = false;
                    break;
                case "help" :
                    printCommands();
                    break;
                default :
                    System.out.println("Wrong command");
                    printCommands();
                    break;
            }

        }
    }

    private static void printCommands(){
        System.out.println("--------------Command list--------------\n" +
                "    add -> Добавить запись\n" +
                "    quit -> Завершить работу\n" +
                "    help -> Вывод всех команд");
    }

    /*
    public Person createNewPerson(String sourceLine)
    {
        String[] array = sourceLine.split(" ");
        return new Person(array[0], array[1], array[2], array[3],array[4],array[5]);
    }*/

    private static String getSourceLine(){
        System.out.println("Введите данные через пробел для создания записи.\n" +
                            "Пример ввода -> \"Петров Сергей Алексаднрович 01.02.2002 79234123342 f\"");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static void createNewRecord() throws Exception {
        String source = getSourceLine();
        if (!validation(source)){
            return;
        }
        String[] sourceArray = source.split(" ");
        String fileName = sourceArray[0].toLowerCase() + ".txt";
        File file = new File(fileName);
        SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy");
        Date date = formater.parse(sourceArray[3]);

        try (FileWriter fileWriter = new FileWriter(file, true)){
            if (file.length() > 0){
                fileWriter.write('\n');
            }
            fileWriter.write(String.format("%s %s %s %s %s %s", sourceArray[0], sourceArray[1], sourceArray[2], formater.format(date), sourceArray[4], sourceArray[5]));
            fileWriter.close();
        }catch (IOException e){
            throw new FileSystemException("Возникла ошибка при работе с файлом");
        }

    }

    private static boolean validation(String source) throws Exception{
        if (Validator.validateStringSize(source)){
            String[] valArray = source.split(" ");
            boolean isValidSex = Validator.validateChar(valArray[5]);
            boolean isValidNumber = Validator.validateNumber(valArray[4]);
            boolean isValidDate = Validator.validateDate(valArray[3]);
            return isValidSex && isValidNumber && isValidDate;
        }
        return false;
    }




}
