package be.intecbrussel.exercise02_file_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {
    public static void main(String[] args) {
        // Path path = Paths.get("File.txt");
        // FileWriter file = new FileWriter(path.toFile());
        File file = new File("File.txt");
        file.setWritable(true);
        try(FileWriter fileWriter = new FileWriter(file, true)){

            fileWriter.write("Hello\n");
            fileWriter.write("World\n");
        } catch (IOException ex){
            System.out.println("Oops! Something wrong");
            System.out.println(ex.getMessage());
        }
    }
}
