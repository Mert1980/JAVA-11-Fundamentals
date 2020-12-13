package be.intecbrussel.exercise01_list;

import java.util.*;

public class ListApp {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
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
        printList(list);
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
    
    public static void printList(List<Integer> list){
        list.forEach(number -> System.out.print(number + " "));
    }

    public static void printSum(List<Integer> list){
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("The sum is " + sum);
    }

    public static void printAverage(List<Integer> list){
        OptionalDouble average = list.stream()
                .mapToDouble(number -> number.doubleValue())
                .average();
        if(average.isPresent()){
            System.out.println("The average is " +  average.getAsDouble());
        }
    }
}
