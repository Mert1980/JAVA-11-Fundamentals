package be.intecbrussel.exercise01_path_file_filesystem;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FilesApp2 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("/Users/mertdemirok/Data/folder3/file3.txt");
            Files.createDirectories(path.getParent());
            if(Files.notExists(path)){
                Files.createFile(path);
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
            List<String> lines = new ArrayList<>();
            lines.add("Hello");
            lines.add("World");

            Files.write(path, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println(attributes.size());
            System.out.println(attributes.creationTime());
            System.out.println(attributes.lastAccessTime());
            System.out.println(attributes.lastModifiedTime());

            Files.lines(path).forEach(System.out::println);
            // get owner
            System.out.println(Files.getOwner(path));
            // rename file
            Files.move(path, path.resolveSibling("newFile"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
