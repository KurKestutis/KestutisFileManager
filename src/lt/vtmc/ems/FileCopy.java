package lt.vtmc.ems;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    private String fileDestinationAndName;
    private String newfileDestinationAndName;

    public FileCopy(String fileDestinationAndName, String newfileDestinationAndName) {
        this.fileDestinationAndName = fileDestinationAndName;
        this.newfileDestinationAndName = newfileDestinationAndName;
    }

    private void copyByteByByte() {
        try (FileInputStream fis = new FileInputStream(fileDestinationAndName);
             FileOutputStream fos = new FileOutputStream(newfileDestinationAndName)){
            int dataBox;
            while ((dataBox = fis.read()) != 0){
                fos.flush();
                fos.write(dataBox);
            }
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }
}
