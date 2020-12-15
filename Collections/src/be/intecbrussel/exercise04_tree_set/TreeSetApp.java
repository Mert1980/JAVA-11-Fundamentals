package be.intecbrussel.exercise04_tree_set;

import java.util.*;

public class TreeSetApp {
    public static void main(String[] args) {
        SortedSet<String> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word. '.' stops: ");

        while (true) {
            String word = scanner.next();
            treeSet.add(word); // duplications are not added
            if (word.endsWith(".")) {
                break;
            }
        }
        printTreeSet(treeSet);
        System.out.println();
        System.out.println("First word: " + treeSet.first());
        System.out.println("Last word: " + treeSet.last());
    }

    public static void printTreeSet(SortedSet<String> set){
        set.forEach(word -> System.out.print(word + " "));
    }
}

