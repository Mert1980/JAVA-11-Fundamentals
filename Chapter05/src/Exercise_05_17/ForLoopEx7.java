package Exercise_05_17;

public class ForLoopEx7 {
    public static void main(String[] args) {
        for (int i = 1; i < 10_000; i++) {
            boolean isMultipleOf6 = i % 6 == 0;
            boolean isMultipleOf28 = i % 28 == 0;

            if(isMultipleOf6 && isMultipleOf28){
                System.out.println(i);
            }
        }
    }
}
