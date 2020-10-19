package ExtraExercises;

import java.util.Scanner;

public class Spaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' '){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
