package lt.vtmc.ems;

import java.util.Scanner;

public class Menu {

    private char exit;
    private Scanner input = new Scanner(System.in);

    public void start() {
            // TODO
            while (exit != 'n') {
                System.out.println("Simple Java file manager ver. 1.0.\nSelect file operation");
                fileOperation();
                exitMenu();
            }
    }

    private void fileOperation() {
        // TODO
        System.out.println("If you want copy file press c: ");
        String read = input.next().toLowerCase();
        if (read.charAt(0) != 'c'){
            System.out.println("Input file name: ");
            String readFileName = input.next();
            System.out.println("Input new file name: ");
            String readNewFileNAme = input.next();
            FileCopy fc = new FileCopy(readFileName, readNewFileNAme);
        }
    }

    private void exitMenu() {
        // TODO
        System.out.println("Continue (y/n): ");
        String read = input.next().toLowerCase();
        char close = read.charAt(0);
        switch (close) {
            case 'y':
                exit = 'y';
            case 'n':
                exit = 'n';
                System.out.println("Good luck!");
            default:
                System.out.println("Wrong symbol!");
                exit = 'n';
        }
    }
}
