package filehandling;

import java.io.*;

public class BufferedWriterReaderDemo {
    public static void main(String[] args) throws IOException {
        String path = "./src/filehandling/java.txt";
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Java is Object-Oriented Language");
        bufferedWriter.close();
        fileWriter.close();

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int i = bufferedReader.read();
        while (i>0){
            System.out.print((char) i);
            i = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
