package be.intecbrussel.exercise03_weekdays_months;

import java.time.DayOfWeek;
import java.util.Scanner;

public class FindDay {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("Select a day:").append("\n").append("1-Monday, ")
                .append("2-Tuesday, ").append("3-Wednesday, ").append("4-Thursday, ")
                .append("5-Friday, ").append("6-Saturday, ").append("7-Sunday");
        System.out.println(sb.toString());

        int input1 = keyboard.nextInt();
        DayOfWeek selectedDay = DayOfWeek.of(input1);
        System.out.println("You selected " + selectedDay.name());

        System.out.print("Enter number of days to add: ");
        int input2 = keyboard.nextInt();
        DayOfWeek newDay = selectedDay.plus(input2);
        System.out.println("Your new day is " + newDay.name());
    }
}
