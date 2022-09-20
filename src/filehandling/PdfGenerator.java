package filehandling;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfGenerator {
    public static void main(String[] args) {
        String filePath = "./src/filehandling/PdfTest.pdf";
        Document document = new Document();
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            PdfWriter.getInstance(document,fos );
            document.open();
            Paragraph paragraph = new Paragraph("Pdf file generated successfully");
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
            document.close();
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
