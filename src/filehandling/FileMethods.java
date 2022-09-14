package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {
        File file = new File("./src/filehandling/codekul.txt");
        try {
            if (file.createNewFile())
                System.out.println("File is Created");
            else
                System.out.println("File Exists");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("IS FILE "+file.isFile());
        System.out.println("Path "+file.getPath());
        System.out.println(file.getName());
    }
}
