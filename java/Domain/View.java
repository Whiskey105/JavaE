package Domain;

import java.io.Reader;
import java.util.Locale;
import java.util.Scanner;

public class View {

    public void run(){
        boolean isRun = true;
        String switchCommand;
        Scanner scanner = new Scanner(System.in);
        while(isRun){
            System.out.println("Input command:");
            switchCommand = scanner.nextLine().toLowerCase(Locale.ROOT);
            switch (switchCommand){
                case "add" :
                    int n = 0;
                case "quit" :
                    isRun = false;
                case "help" :
                    printCommands();
                default :
                    System.out.println("Wrong command");
            }

        }
    }

    public void printCommands(){

    }
}
