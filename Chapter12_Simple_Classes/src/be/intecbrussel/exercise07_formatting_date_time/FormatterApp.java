package be.intecbrussel.exercise07_formatting_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatterApp {
    public static void main(String[] args) {
        String date = "2017-03-08 12:30:54";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date, format);

        System.out.println("origional date as string: " + date);
        System.out.println("generated LocalDateTime: " + dateTime);

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (DD/MM/YYYY): ");

        String date = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);*/

        /*DateTimeFormatter DateFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        DateTimeFormatter DateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        // Parsing
        LocalDateTime dt = LocalDateTime.parse("14/11/2020 13:45:23", formatter);

        // Formatting
        //System.out.println(formatter.format(dt));
        //System.out.println(isoFormatter.format(dt));

        LocalDateTime now = LocalDateTime.now();
        //System.out.println(now);
        System.out.format("%1$td/%1$tm/%1$tY %1$tH:%1$tM:%1$tS", now);
        // Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '$'*/

    }
}
