package Exercise08_11;

public class CosinusApp {
    public static void main(String[] args) {
        final double PI = 3.14;
       // System.out.println(Math.toDegrees(0.1));

        for (double i = 0; i <= 2 * PI; i += 0.1) {
            System.out.println(Math.cos(i) + " radiant");
        }

        System.out.println();
        for (double i = 0; i <= 360 ; i += Math.toDegrees(0.1)) {
            System.out.println(Math.cos(i) + " degrees");
        }
    }
}


