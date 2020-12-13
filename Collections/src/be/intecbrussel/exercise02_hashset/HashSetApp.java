package be.intecbrussel.exercise02_hashset;

import java.util.*;

public class HashSetApp {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number('-1' stops): ");
            int number = scanner.nextInt();
            if(number == -1){
                break;
            }
            list.add(number);
        }
        System.out.print("The list: ");
        printList(list); // no duplication is allowed
        System.out.println();
        printSum(list);
        printAverage(list);
    }

    /*public static void printList(List<Integer> list){
        Iterator iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }*/

    public static void printList(Set<Integer> list){
        list.forEach(number -> System.out.print(number + " "));
    }

    public static void printSum(Set<Integer> list){
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("The sum is " + sum);
    }

    public static void printAverage(Set<Integer> list){
        OptionalDouble average = list.stream()
                .mapToDouble(number -> number.doubleValue())
                .average();
        if(average.isPresent()){
            System.out.println("The average is " +  average.getAsDouble());
        }
    }
}
