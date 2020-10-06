package Exercise_05_18;

public class BmiUtility {
    public static float calculatePmi(int weight, int height){
        float pmi = (float) weight / height * height;
        return pmi;
    }
}
