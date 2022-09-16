package filehandling;

import java.io.*;

public class BufferedInputOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./src/filehandling/java.txt");
        BufferedOutputStream stream = new BufferedOutputStream(fos);
        String txt = "Java is Secure Language";
        stream.write(txt.getBytes());
        stream.close();
        fos.close();

    }
}
