package be.intecbrussel.exercise04_tree_set;

import java.util.*;

public class TreeSetApp {
    public static void main(String[] args) {
        NavigableSet<String> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word. '.' stops: ");
            String word = scanner.next();
            if (word.equals(".")) {
                break;
            }
            treeSet.add(word); // duplications are not added
        }
        printTreeSet(treeSet);
        System.out.println();
        System.out.println("Last word: " + treeSet.first());
        System.out.println("First word: " + treeSet.last());
    }

    public static void printTreeSet(NavigableSet<String> set){
        set.forEach(word -> System.out.print(word + " "));
    }
}

