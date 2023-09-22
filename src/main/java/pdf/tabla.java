package pdf;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import estilos.estilos;

import java.text.DecimalFormat;

public class tabla {
    estilos cell = new estilos();
    public Table bodytable(double[]x,double[]y){
        float [] columnWidth={100f,140f,150f};
        Table table=new Table(columnWidth);
        table.addCell(cell.encabezado("Iteraciones", Color.BLACK, Color.WHITE, 15f));
        table.addCell(cell.encabezado("valores de x", Color.BLACK, Color.WHITE, 15f));
        table.addCell(cell.encabezado("valores de y", Color.BLACK, Color.WHITE, 15f));

        DecimalFormat f = new DecimalFormat("0.######");

        for (int i = 0; i < x.length; i++) {
            if ((i % 2) == 0) {
                table.addCell(cell.cuerpo(String.valueOf((i + 1)), 224, 255, 255, null));
                table.addCell(cell.cuerpo(f.format(x[i]), 224, 255, 255, null));
                table.addCell(cell.cuerpo(f.format(y[i]), 224, 255, 255, null));
            } else {
                table.addCell(cell.cuerpo(String.valueOf((i + 1)), 255, 255, 255, null));
                table.addCell(cell.cuerpo(f.format(x[i]), 255, 255, 255, null));
                table.addCell(cell.cuerpo(f.format(y[i]), 255, 255, 255, null));
            }
        }
        table.setHorizontalAlignment(HorizontalAlignment.CENTER);

        return table;
    }

}
