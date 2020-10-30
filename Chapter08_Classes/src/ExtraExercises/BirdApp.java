package ExtraExercises;

public class BirdApp {
    public static void main(String[] args) {
        Bird red = new Bird("Red");
        System.out.println(red);

        Bird chuck = new Bird("Chuck");
        System.out.println(chuck);

        if (red.equals(chuck)) {
            System.out.println(red + " equals " + chuck);
        } else {
            System.out.println(red + " is not equal to " + chuck);
        }
    }
}
