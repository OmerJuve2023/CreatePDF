package util;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class MethodsPDF {

    public void deleteimage() {
        File file = FileSystemView.getFileSystemView().getHomeDirectory();
        String fil = file + "\\imagen.png";
        file = new File(fil);
        file.deleteOnExit();
    }

    public String namepdf() {
        File file = FileSystemView.getFileSystemView().getHomeDirectory();
        String fil = file + "\\ejercicio.pdf";
        file = new File(fil);
        if (file.exists()) {
            for (int i = 1; i < 100; i++) {
                String a = FileSystemView.getFileSystemView()
                                   .getHomeDirectory() + "\\ejercicio" + i + ".pdf";
                file = new File(a);
                if (!file.exists()) {
                    break;
                }
            }
        }
        return file.getAbsolutePath();
    }

    public void style() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                 InstantiationException e) {
            System.out.println("Error en el estilo de la interfaz\n" + e.getMessage());
        }

    }
}
