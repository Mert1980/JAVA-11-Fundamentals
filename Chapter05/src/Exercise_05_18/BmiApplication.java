package Exercise_05_18;

public class BmiApplication {
    public static void main(String[] args) {
        System.out.println("Enter your length (cm):");
        int height = KeyboardUtility.readInt();
        System.out.println("Enter your weight (kg):");
        int weight = KeyboardUtility.readInt();

        double bmi = BmiUtility.calculatePmi(weight, height);
        BmiUtility.printDiagnose(bmi);
        BmiUtility.printWeightStatus(bmi);
    }


}

