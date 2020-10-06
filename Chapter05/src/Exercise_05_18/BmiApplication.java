package Exercise_05_18;

import java.util.Scanner;

public class BmiApplication {
    public static void main(String[] args) {
        System.out.println("Enter your length (cm):");
        int height = KeyboardUtility.readInt();
        System.out.println("Enter your weight (kg):");
        int weight = KeyboardUtility.readInt();

        float bmi = BmiUtility.calculateBmi(weight, height);

    }
}

