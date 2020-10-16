import java.util.Scanner;

public class Exercise_06_03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = keyboard.nextLine();

        // Print the text and the length of the text
        System.out.println(text);
        System.out.println("The length of the text: " + text.length());

        // Print the text in capital letters
        System.out.println(text.toUpperCase());

        // Print the text in small letters
        System.out.println(text.toLowerCase());

        // Replace all letters 'a' with letter 'o'
        System.out.println(text.replace('a', 'o'));

        // Print the number of 'e's in the text
        int counter = 0;
        for (int i = 0; i < text.length() ; i++) {

            if(text.charAt(i) == 'e'){
                counter++;
            }
        }
        System.out.println("The number of e in the text is " + counter);

        // Compare 2 strings alphabetically and print the first
        System.out.println("Enter the second text: ");
        String textSecond = keyboard.nextLine();

        int length = text.length() > textSecond.length() ? textSecond.length() : text.length();
        String priorInAlphabet = "";
        for (int i = 0; i < length; i++) {
            if(text.charAt(i) == textSecond.charAt(i)){
                continue;
            } else if(text.charAt(i) < textSecond.charAt(i)){
                priorInAlphabet = text;
                break;
            } else {
                priorInAlphabet = textSecond;
            }
        }
        System.out.println(priorInAlphabet + " comes prior in alphabet");

        // Use API to compare two strings lexicographically.

        int comparison = text.compareToIgnoreCase(textSecond);
        if(comparison == 0){
            System.out.println(text + " is equal in alphabet " + " with " + textSecond);
        } else if (comparison > 0){
            System.out.println(text + " comes prior in alphabet");
        } else {
            System.out.println(textSecond + " comes prior in alphabet");
        }

        // Trim extra spaces in a text
        System.out.println("Enter a new text: ");
        String newText = keyboard.nextLine();

        System.out.println(newText.trim());
    }
}
