package pdf;

import methods.createPDF;
import methods.createPNG;

import javax.swing.*;

public class union {
    private final createPNG png = new createPNG();
    private final createPDF pdf = new createPDF();
    private final desarrollo deleteimg=new desarrollo();
    public void init(double[] x, double[] y) {

        png.init(x, y);
        int a = JOptionPane.showConfirmDialog(null, "generar PDF?", "Método Newton", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            pdf.init(x, y);
        }
        deleteimg.deleteimage();

    }


}
