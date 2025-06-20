package repository;

import java.io.File;
import javax.swing.filechooser.FileSystemView;

public class FilesClean {
    File desktop = FileSystemView.getFileSystemView().getHomeDirectory();
    File documents = FileSystemView.getFileSystemView().getDefaultDirectory();
    public File desktop(){
        return desktop;
    }
    public File documents(){
        return documents;
    }
    
    public void delete(File path) {
        if (path.isDirectory()) {
            File[] files = path.listFiles();
            if (files != null) {
                for (File file : files) {
                    recursiveDelete(file);
                }
            }
        }
        if (path.delete()) {
            System.out.println(":O");
        } else {
            System.out.println("D:");
        }
    }

    public void recursiveDelete(File path) {
        if (path.isDirectory()) {
            File[] files = path.listFiles();
            if (files != null) {
                for (File file : files) {
                    recursiveDelete(file);
                }
            }
        }
        if (path.delete()) {
            System.out.println(":O");
        } else {
            System.out.println("D:");
        }
    }
}
