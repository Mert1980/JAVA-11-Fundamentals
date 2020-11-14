package be.intecbrussel.exercise04_localdates_times;

import java.time.LocalDate;
import java.util.Scanner;

public class BirthdayApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birth year: ");
        int year = scan.nextInt();
        System.out.print("Birth month: ");
        int month = scan.nextInt();
        System.out.print("Birth day: ");
        int day = scan.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("Is " + year + " a leap year? " + date.isLeapYear());

        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek().getValue());

    }
}
