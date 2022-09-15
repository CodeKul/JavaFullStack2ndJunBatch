package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        String fileName = "./src/filehandling/welcome.txt";
        FileWriter fw = new FileWriter(fileName);
        fw.write("Welcome");
        //  fw.write("\nHIII");
        System.out.println("Content Added");
        fw.close();

        FileReader fr = new FileReader(fileName);
        int i = fr.read();
        while (i > 0) {
            System.out.print((char) i);
            i = fr.read();
        }
    }
}
