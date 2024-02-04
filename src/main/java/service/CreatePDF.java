package service;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import dto.FIle;
import dto.Graph;
import dto.Table;
import util.MethodsPDF;

import java.io.IOException;

public class CreatePDF {

    private Document document;
    private final FIle arch = new FIle();
    private final Graph grap = new Graph();
    private final Table Table = new Table();
    private final MethodsPDF des = new MethodsPDF();

    public void init(double[] x, double[] y) {

        String imagefile = arch.open() + "\\imagen.png";
        String namepdf = des.namepdf();

        try {
            PdfWriter writer = new PdfWriter(namepdf);
            PdfDocument pdfDocument = new PdfDocument(writer);
            document = new Document(pdfDocument);
        } catch (IOException e) {
            System.out.println("Error al crear el documento:\n" + e.getMessage());
        }
        ImageData data = grap.imagedata(imagefile);

        document.add(grap.image(data));
        document.add(Table.bodytable(x, y));
        document.close();

    }

}
