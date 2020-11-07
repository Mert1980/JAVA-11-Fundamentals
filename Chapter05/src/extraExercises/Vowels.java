package extraExercises;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a text: ");
        String text = scanner.nextLine();

        int counter = 0;
        for (int i = 0; i < text.length() ; i++) {
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'u' || text.charAt(i) == 'i' || text.charAt(i) == 'o' ){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
