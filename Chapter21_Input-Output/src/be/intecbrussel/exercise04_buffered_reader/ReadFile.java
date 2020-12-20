package be.intecbrussel.exercise04_buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        // read the file line by line
        try(BufferedReader reader = new BufferedReader(new FileReader("File.txt"))) {
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException ex){
            System.out.println("Oops, something went wrong!");
            System.out.println(ex.getMessage());
        }
    }
}
