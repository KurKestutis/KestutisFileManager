package lt.vtmc.ems;

import java.util.Scanner;

public class Menu {

    private char exit;
    private Scanner input = new Scanner(System.in);
	private FileCopy fc;

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
        //System.out.println("If you want copy file press c: ");
        //String read = input.next().toLowerCase();
        if (true){
            System.out.println("Input file destination and name for example\nC:\\Users\\UserName\\Documents\\fileName.txt : ");
            String readFileName = input.next();
            System.out.println("Input new file destination and name: ");
            String readNewFileNAme = input.next();
            FileCopy fc = new FileCopy(readFileName, readNewFileNAme);
			fc.copyByteByByte();
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
				break;
            case 'n':
                exit = 'n';
                System.out.println("Good luck!");
				break;
            default:
                System.out.println("Wrong symbol!");
                exit = 'n';
        }
    }
}
