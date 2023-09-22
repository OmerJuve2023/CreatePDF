package methods;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import pdf.archivo;
import pdf.desarrollo;
import pdf.grafico;
import pdf.tabla;

import javax.swing.text.StyleConstants;
import java.awt.*;
import java.io.IOException;

public class createPDF {

    private Document document;
    private final archivo arch = new archivo();
    private final grafico grap = new grafico();
    private final tabla tabla = new tabla();
    private final desarrollo des=new desarrollo();

    public void init(double[] x, double[] y) {

        String imagefile = arch.open()+"\\imagen.png";
        String namepdf = des.namepdf();

        try {
            PdfWriter writer = new PdfWriter(namepdf);
            PdfDocument pdfDocument = new PdfDocument(writer);
            document = new Document(pdfDocument);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImageData data = grap.imagedata(imagefile);
        /*
        Text text = null;

        try {
             text=new Text("asdsd").setFont(PdfFontFactory.createFont(FontConstants.HELVETICA));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Paragraph paragraph=new Paragraph();
        paragraph.add(text);
        document.add(new Paragraph("asdad"));
        */
        document.add(grap.image(data));
        document.add(tabla.bodytable(x, y));
        document.close();

    }

}
