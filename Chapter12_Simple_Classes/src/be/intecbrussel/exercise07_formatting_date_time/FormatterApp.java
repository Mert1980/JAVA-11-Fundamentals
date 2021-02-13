package be.intecbrussel.exercise07_formatting_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (DD/MM/YYYY): ");

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String dateInput = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(dateInput, f1);

        System.out.println(localDate.format(f2));


        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
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
