package be.intecbrussel.exercise07_05;

public class Statistics {
    public static void main(String[] args) {
        double average = average(1,2,3, 4);
        System.out.println(average);

        int min = min(2, -3, 4, 8);
        System.out.println(min);

        int max = max(2, -3, 4, 8);
        System.out.println(max);
    }

    public static double average(int... values){
        int sum = 0;
        for(int number:values){
            sum+=number;
        }
        if(values.length != 0){
            return (double)sum / values.length;
        }
        return 0;
    }

    public static int min(int... values){
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if(min > values[i]){
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int... values){
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if(max < values[i]){
                max = values[i];
            }
        }
        return max;
    }
}
