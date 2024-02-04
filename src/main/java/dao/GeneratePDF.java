package dao;

import util.MethodsPDF;
import service.CreatePDF;
import service.CreatePNG;

import javax.swing.*;

public class GeneratePDF {
    private final CreatePNG png = new CreatePNG();
    private final CreatePDF pdf = new CreatePDF();
    private final MethodsPDF deleteimg = new MethodsPDF();

    public void init(double[] x, double[] y) {

        png.init(x, y);
        int a = JOptionPane.showConfirmDialog(null,
                "generar PDF?",
                "Método Newton",
                JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            pdf.init(x, y);
        }
        deleteimg.deleteimage();
    }
}