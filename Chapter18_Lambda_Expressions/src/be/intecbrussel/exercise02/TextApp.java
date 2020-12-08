package be.intecbrussel.exercise02;

import java.math.BigDecimal;

public class TextApp {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello to lambda expressions");
        System.out.println("Words with letter 'e");
        tp.filteredText(s -> s.contains("e"));

        System.out.println("Words longer than 4");
        tp.filteredText(s -> s.length() > 4);

        System.out.println("Words beginning with 'a");
        tp.filteredText(s -> s.charAt(0) == 'a');

        System.out.println("Words that have 'e' as a second character");
        tp.filteredText((s -> s.charAt(1) == 'e'));

        System.out.println("Words that have 'e' 2 times");
        tp.filteredText(s -> {
            int count = 0;
            for (char ch:s.toCharArray()) {
                if(ch == 'e'){
                    count++;
                }
            }
            return count == 2;
        });

        System.out.println("Print the words as reversed:");
        tp.printProcessedWords(TextUtil::reverse);

        System.out.println("Scramble the words in the text:");
        TextScrambler textScrambler = new TextScrambler();
        tp.printProcessedWords(textScrambler::scramble);

        System.out.println("Print the words in the text in small letters:");
        tp.printProcessedWords(String::toLowerCase);

        TextPrinter tp2 = new TextPrinter("123234567 345234567 126234567 879564356");
        tp2.printNumberValues(BigDecimal::new);
        tp2.printSum(BigDecimal::new);

    }
}