package dto;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FIle {

    private final JFileChooser fileChooser = new JFileChooser();
    private File file1;
    private String imagefile;

    public String open() {
       fileChooser.showOpenDialog(null);
        file1 = FileSystemView.getFileSystemView().getHomeDirectory();
        return file1.getAbsolutePath();
    }

    public String save() {
        fileChooser.showSaveDialog(null);
        file1 = FileSystemView.getFileSystemView().getHomeDirectory();
        return file1.getAbsolutePath();
    }
}
