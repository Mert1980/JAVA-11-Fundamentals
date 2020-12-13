package be.intecbrussel.exercise01_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListApp2 {
    public static void main(String[] args) {
        List<String> sentence = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String word = scanner.next();
            if(word.equals(".")){
                break;
            }
            sentence.add(word);
        }
        printSentenceInReverseOrder(sentence);
        printNumberOfWords(sentence);
        printSentence(sentence);
    }

    public static void printSentence(List<String> list){
        list.stream().forEach(word -> System.out.print(word + " "));
    }

    public static void printSentenceInReverseOrder(List<String> list){
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void printNumberOfWords(List<String> list){
        System.out.println("The sentence has " + list.size() + " words");
    }
}
