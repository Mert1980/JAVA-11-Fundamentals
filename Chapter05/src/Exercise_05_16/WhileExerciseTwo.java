package Exercise_05_16;

public class WhileExerciseTwo {
    public static void main(String[] args) {
        int number = 50;

        while(true){
            if(number <= 0){
                break;
            }
            number--;
            if(number % 3 == 0){
                System.out.println(number);
            }
        }
    }
}
