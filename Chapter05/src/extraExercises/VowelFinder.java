package extraExercises;

import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word and find out the number of vowels in it!");

        String word = scanner.nextLine();
        int vowelCounter = 0;

        for (int i = 0; i < word.length(); i++) {
            if(isVowel(word.charAt(i))){
                vowelCounter++;
            }
        }
        System.out.println(vowelCounter);
        scanner.close();
    }

    public static boolean isVowel(char letter){
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'|| letter == 'u'){
            return true;
        } else return false;
    }
}
