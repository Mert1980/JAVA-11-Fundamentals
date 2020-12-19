package be.intecbrussel.exercise01_path_file_filesystem;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ClassFileSystem {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        System.out.println(fs.getSeparator()); // for MacOS prints "/"
        for(Path p : fs.getRootDirectories()){
            System.out.println(p); // for MacOS prints "/"
        }
    }
}
