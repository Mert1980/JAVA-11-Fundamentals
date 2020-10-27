package Exercise08_11;

public class CosinusApp {
    public static void main(String[] args) {
        showCos("degrees");
    }

    public static void showCos(String unit){
        switch (unit){
            case "radiant":
                calCosRad(Math.PI, 0.1, unit);
            case "degrees":
                calCosRad(180, Math.toDegrees(0.1), unit);
        }
    }

    public static void calCosRad(double limit, double period, String unit){
        for (double i = 0; i <= 2 * limit; i += period) {
            System.out.println(Math.cos(i) + " " + unit);
        }
    }
}


