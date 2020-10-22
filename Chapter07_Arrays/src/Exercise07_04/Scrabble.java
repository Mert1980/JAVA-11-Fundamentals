package Exercise07_04;

import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int [] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

        System.out.println("Enter a text: ");
        String text = scanner.nextLine();

        char [] textIntoChars = text.toCharArray();

        int totalPoints = 0;
        for (char letter : textIntoChars){
            for (int i = 0; i < letters.length; i++) {
                if(letters[i] == letter){
                    totalPoints+=points[i];
                    break;
                };
            }
        }
        System.out.println(totalPoints);
    }
}
