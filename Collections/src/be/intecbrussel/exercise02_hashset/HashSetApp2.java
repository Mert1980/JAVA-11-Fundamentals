package be.intecbrussel.exercise02_hashset;

import java.util.*;

public class HashSetApp2 {
    public static void main(String[] args) {
        Set<String> sentence = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter a word ('.' stops): ");
            String word = scanner.next();
            if(word.equals(".")){
                break;
            }
            sentence.add(word);
        }
        printNumberOfWords(sentence); // no duplication is allowed
        printSentence(sentence); // order of the words is not stable
    }

    public static void printSentence(Set<String> list){
        list.stream().forEach(word -> System.out.print(word + " "));
    }

    public static void printNumberOfWords(Set<String> list){
        System.out.println("The sentence has " + list.size() + " words");
    }
}
