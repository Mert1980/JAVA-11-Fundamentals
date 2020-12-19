package be.intecbrussel.exercise01_path_file_filesystem;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FilesApp {
    public static void main(String[] args) {
        try{
            // Define Path
            Path path = Paths.get("/Users/mertdemirok/Data/folder1/file1.txt");
            // Create parent directories
            Files.createDirectories(path.getParent());
            // Create if not exists
            if(Files.notExists(path)){
                Files.createFile(path);
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
            // Write lines of text to file
            List<String> lines = new ArrayList<>();
            lines.add("Hello");
            lines.add("World");
            Files.write(path, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);

            // Retrieve attributes of file
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println(attributes.size());
            System.out.println(attributes.creationTime());
            System.out.println(attributes.lastAccessTime());
            System.out.println(attributes.lastModifiedTime());
//            System.out.println(attributes.isArchive());
//            System.out.println(attributes.isHidden());
//            System.out.println(attributes.isReadOnly());

            // Read lines of text from file
            Files.lines(path).forEach(System.out::println);

            // Copy file
            Path path2 = Paths.get("/Users/mertdemirok/Data/folder2/file1.txt");
            Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);

            // Delete File
            Files.deleteIfExists(path);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
