package org.niit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;

public class PdfReader {
    public static void main(String args[]) {
        PDFTextStripper pdfStripper = null;
        PDDocument pdDoc = null;
        try {
            pdfStripper = new PDFTextStripper();
            pdDoc = PDDocument.load(new File("/Users/neha/Desktop/sample.pdf"));
            int count = pdDoc.getNumberOfPages();
            System.out.println("Number of pages : "+count);
            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(5);
            String parsedText = pdfStripper.getText(pdDoc);
            System.out.println(parsedText);
            System.out.println("--------------------------------********************---------------------------------");
            TextToPDF.textToPdf();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
