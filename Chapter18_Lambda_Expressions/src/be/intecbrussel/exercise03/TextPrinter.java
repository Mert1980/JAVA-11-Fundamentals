package be.intecbrussel.exercise03;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinter {
    private String text;

    public TextPrinter(String text) {
        this.text = text;
    }

    public void printNumberValues(Function<String, BigDecimal> parser){
        for (String w : text.split(" ")) {
            //System.out.format("%,d%n", parser.parse(w));
            System.out.println(parser.apply(w));
        }
    }

    public void printSum(Function<String, BigDecimal> parser){
        BigDecimal total = new BigDecimal(0);
        for (String w : text.split(" ")) {
            total = total.add(parser.apply(w));
        }
        System.out.println(total);
    }

    public void printProcessedWords(Function<String, String> processor){
        for (String w : text.split(" ")) {
            System.out.println(processor.apply(w));
        }
    }

    public void filteredText(Predicate<String> filter){
        for (String w : text.split(" ")) {
            if(filter.test(w)){
                System.out.println(w);
            }
        }
    }
}
