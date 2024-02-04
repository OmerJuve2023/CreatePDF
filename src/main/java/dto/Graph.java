package dto;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.property.HorizontalAlignment;

import java.net.MalformedURLException;

public class Graph {

    public Image image(ImageData data) {
        Image image = new Image(data);
        image.getImageScaledWidth();
        image.getImageScaledHeight();
        image.setHorizontalAlignment(HorizontalAlignment.CENTER);
        return image;
    }

    public ImageData imagedata(String imagefile) {
        ImageData data = null;
        try {
            data = ImageDataFactory.create(imagefile);
        } catch (MalformedURLException e) {
            System.out.println("Error en la imagen:\n+" + e.getMessage());
        }
        return data;
    }

}
