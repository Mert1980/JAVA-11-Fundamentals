package be.intecbrussel.exercise01_list;

import java.util.*;

public class ListApp2 {
    public static void main(String[] args) {
        List<String> sentence = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String word = scanner.nextLine();
            sentence.add(word);
            if(word.endsWith(".")){
                break;
            }
        }
        printSentence(sentence);
        printSentenceInReverseOrder(sentence);
        printNumberOfWords(sentence);
    }

    public static void printSentence(List<String> list){
        list.forEach(word -> System.out.print(word + " "));
    }

    public static void printSentenceInReverseOrder(List<String> list){
        Collections.reverse(list);
        list.forEach(word -> System.out.print(word + " "));
        /*for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }*/
    }

    public static void printNumberOfWords(List<String> list){
        System.out.println("The sentence has " + list.size() + " words");
    }
}
