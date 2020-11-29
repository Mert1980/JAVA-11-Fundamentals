package be.intecbrussel.reading_file;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        ArrayList<String> lines =  new ArrayList<>();

        // create a Scanner object for reading files
        try (Scanner reader = new Scanner(new File("file.txt"))) {

            // read all lines from a file
            while (reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    // do something with the lines
    }

    /*
        Methods and constructors can throw exceptions. There are roughly two categories of exceptions.
        There are exceptions we have to handle, and exceptions we do not have to handle. We can handle exceptions
        by wrapping the code into a try-catch block or throwing them out of the method.

        The code below reads the file given to it as a parameter line by line. Reading a file can throw an exception —
        for example, the file might not exist or the program does not have read rights to the file. This kind of
        exception has to be handled. 

        We handle the exception by wrapping the code into a try-catch block. In this example we do not really care
        about the exception, but we do print a message to the user about it.
     */
    public List<String> readLines(String fileName){
        List<String> lines =  new ArrayList<>();

        try {
            Files.lines(Paths.get("file.txt")).forEach(line -> lines.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return lines;
    }

    /*
    A programmer can also leave the exception unhandled and shift the responsibility for handling it to whomever calls
    the method. We can shift the responsibility of handling an exception forward by throwing the exception out of a
    method, and adding notice of this to the declaration of the method. Notice on throwing an exception forward throws
    *ExceptionType* is added before the opening bracket of a method.
    */

    public List<String> readLines2(String fileName) throws Exception {
        ArrayList<String> lines =  new ArrayList<>();
        Files.lines(Paths.get(fileName)).forEach(line -> lines.add(line));
        return lines;
    }

    /* Now the method calling the readLines method has to either handle the exception in a try-catch block or shift the
    responsibility yet forward. Sometimes the responsibility of handling exceptions is avoided until the end, and even
    the main method can throw an exception to the caller

    public class MainProgram {
        public static void main(String[] args) throws Exception {
            // ...
        }
    }
    */
}