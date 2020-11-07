package be.intecbrussel.exercise08_11;

public class CosinusApp {
    public static void main(String[] args) {
        showCos("degrees");
    }

    public static void showCos(String unit){
        switch (unit){
            case "radiant":
                calCos(Math.PI*2, 0.1, unit);
            case "degrees":
                calCos(360, Math.toDegrees(0.1), unit);
        }
    }

    public static void calCos(double limit, double period, String unit){
        for (double i = 0; i <= limit; i += period) {
            System.out.println(Math.cos(i) + " " + unit);
        }
    }
}


