package be.intecbrussel.exercise11_01;

public class DayApp {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        System.out.println(day);
        System.out.println();

        // print every day of the week
        for (Day d:Day.values()
             ) {
            System.out.println(d);
        }

        System.out.println();

        // print only working days
        for (Day d:Day.values()
        ) {
            if(d.isWorkDay()){
                System.out.println(d.name());
            }
        }
    }
}
