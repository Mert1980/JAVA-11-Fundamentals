package Exercise_05_18;

public class BmiUtility {
    public static double calculatePmi(int weight, int height){
        double pmi = (double) weight / ((double)height/100 * height/100);
        return Math.round(pmi * 10.0)/10.0;
    }

    public static void printDiagnose(double bmi){
        System.out.println("Your body mass index: " + bmi);
    }

    public static void printWeightStatus(double bmi){
        if (bmi < 18.5){
            System.out.println("You are underweight.");
        } else if(bmi < 24.9) {
            System.out.println("You are normal.");
        } else if (bmi < 29.9){
            System.out.println("You are overweight!");
        } else {
            System.out.println("You are obese!");
        }
    }
}
