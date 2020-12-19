package be.intecbrussel.exercise03_read_file;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        // read the file character by character
        try(FileReader file = new FileReader("File.txt")) {
            int character;
            while((character = file.read()) != -1){
                System.out.println((char) character);
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
