package Exercise09_01;

import java.util.Scanner;

public class HigherLowerGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HigherLowerGame game = new HigherLowerGame(10);
        System.out.println("Guess a number: ");
        while(true){
            int number = scanner.nextInt();
            if(game.guess(number) == -1){
                System.out.println("Try higher!");
            }
            if (game.guess(number) == 1){
                System.out.println("Try smaller!");
            }
            if(game.guess(number) == 0){
                System.out.println("You nailed it!");
                break;
            }
        }
    }
}
