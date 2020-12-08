package be.intecbrussel.exercise02;

import java.math.BigDecimal;

public class TextPrinter {
    private String text;

    public TextPrinter(String text) {
        this.text = text;
    }

    public void printNumberValues(NumberParser parser){
        for (String w : text.split(" ")) {
            //System.out.format("%,d%n", parser.parse(w));
            System.out.println(parser.parse(w));
        }
    }

    public void printSum(NumberParser parser){
        int sum = 0;
        for (String w : text.split(" ")) {
            sum+=Integer.valueOf(w);
        }
        System.out.println("The total is " + sum);
    }

    public void printProcessedWords(WordProcessor processor){
        for (String w : text.split(" ")) {
            System.out.println(processor.process(w));
        }
    }

    public void filteredText(WordFilter filter){
        for (String w : text.split(" ")) {
            if(filter.isValid(w)){
                System.out.println(w);
            }
        }
    }
}
