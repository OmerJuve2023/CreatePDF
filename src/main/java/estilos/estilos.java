package estilos;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.property.TextAlignment;

public class estilos {
    public Cell encabezado(String txt, Color Background, Color fontColor, float size) {

        Cell cell = new Cell();
        cell.add(txt);
        cell.setTextAlignment(TextAlignment.CENTER);
        cell.setFontSize(size);
        cell.setBackgroundColor(Background);
        cell.setFontColor(fontColor);
        return cell;
    }

    public Cell cuerpo(String txt, int r, int g, int b, Color fontColor) {
        Cell cell = new Cell();
        cell.add(txt);
        cell.setTextAlignment(TextAlignment.CENTER);
        cell.setBackgroundColor(new DeviceRgb(r, g, b));
        cell.setFontColor(fontColor);

        return cell;
    }
}
