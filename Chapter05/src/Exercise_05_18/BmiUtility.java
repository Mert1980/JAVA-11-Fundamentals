package Exercise_05_18;

public class BmiUtility {
    public static double calculatePmi(int weight, int height){
        double pmi = (double) weight / ((double)height/100 * height/100);
        return Math.round(pmi * 10.0)/10.0;
    }

    public static void printDiagnose(double bmi){
        System.out.println("Your body mass index: " + bmi);
    }
}
