package org.niit;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class TextToPDF {
    public static void textToPdf() {
        Document pdfDoc = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(pdfDoc, new FileOutputStream("src/output/txt.pdf")).setPdfVersion(PdfWriter.PDF_VERSION_1_7);
            pdfDoc.open();
            String para1 = "एक सरल पीडीएफ फ़ाइल यह एक छोटा प्रदर्शन है. पीडीएफ फाइल-सिर्फ वर्चुअल यांत्रिकी ट्यूटोरियल में उपयोग के लिए. अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. बरिंग, जिज़जल. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ. और अधिक पाठ के रूप में. और अधिक पाठ. अधिक पाठ. पृष्ठ पर जारी... अधिक सरल पीडीएफ 2.. अधिक पृष्ठ से अधिक.";
            BaseFont unicode = BaseFont.createFont("/Users/neha/Desktop/m.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(unicode, 12, Font.NORMAL, new BaseColor(50, 205, 50));
            Paragraph para = new Paragraph(para1 + "\n", font);
            para.setAlignment(Element.ALIGN_JUSTIFIED);
            pdfDoc.add(para);
            System.out.println("Successfully text added to pdf");
            pdfDoc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
