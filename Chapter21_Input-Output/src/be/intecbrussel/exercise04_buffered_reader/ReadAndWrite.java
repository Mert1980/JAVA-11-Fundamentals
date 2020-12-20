package be.intecbrussel.exercise04_buffered_reader;

import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("File.txt", true))){
            writer.write("This is first line");
            writer.newLine();
            writer.write("This is the second line");
            writer.newLine();
        } catch (IOException ex){
            System.out.println("Oops, something went wrong!");
            System.out.println(ex.getMessage());
        }
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
