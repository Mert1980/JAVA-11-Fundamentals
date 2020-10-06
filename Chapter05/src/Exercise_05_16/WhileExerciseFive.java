package Exercise_05_16;

import java.util.Scanner;

public class WhileExerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do{
            System.out.println("Enter a number between 0 and 10");
            number = scanner.nextInt();
        } while(number < 0 || number > 10);


//        while(true){
//            System.out.println("Enter a number between 0 and 10");
//            int number = scanner.nextInt();
//
//            if(number > 0 && number < 10){
//                break;
//            }
//        }
    }
}
