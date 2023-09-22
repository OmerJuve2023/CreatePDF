package pdf;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.property.HorizontalAlignment;

import java.net.MalformedURLException;

public class grafico {

    public Image image(ImageData data) {
        Image image = new Image(data);
        image.getImageScaledWidth();
        image.getImageScaledHeight();
        image.setHorizontalAlignment(HorizontalAlignment.CENTER);
        return image;
    }

    public ImageData imagedata(String imagefile){
        ImageData data=null;
        try {
            data= ImageDataFactory.create(imagefile);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return data;
    }

}
