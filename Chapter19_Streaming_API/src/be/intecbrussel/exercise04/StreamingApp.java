package be.intecbrussel.exercise04;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamingApp {
    public static void main(String[] args) {
        Person person1 = new Person("Mert", "Demirok", Person.Gender.MALE, 40, 82, 182);
        Person person2 = new Person("Ali", "Kaptan", Person.Gender.MALE, 34, 70, 169);
        Person person3 = new Person("Suzan", "Bekci", Person.Gender.FEMALE, 25, 60, 170);
        Person person4 = new Person("Almira", "Demirok", Person.Gender.FEMALE, 3, 17, 85);

        Person[] sa = Stream.of(person1, person2, person3, person4).toArray(Person[]::new);

        // print only females
        Stream.of(sa)
                .filter(person -> person.getGender().equals(Person.Gender.FEMALE))
                .forEach(female -> System.out.println(female));
        System.out.println("----".repeat(22));

        // print persons older than 30
        Stream.of(sa).filter(person -> person.getAge() > 30)
                .forEach(person -> System.out.println(person));
        System.out.println("----".repeat(22));

        // print persons between 50-80 kgs
        Stream.of(sa).filter(person -> person.getWeight() > 50 && person.getWeight() < 80)
                .forEach(person -> System.out.println(person));
        System.out.println("----".repeat(22));

        // print the weight of persons older than 30
        Stream.of(sa).filter(person -> person.getAge() > 30)
                .mapToDouble(person -> person.getWeight())
                .forEach(weight -> System.out.println(weight));
        System.out.println("----".repeat(22));

        // Print all the ages of persons one by one
        Stream.of(sa).mapToInt(person -> person.getAge())
                .forEach(age -> System.out.println(age));
        System.out.println("----".repeat(22));

        // print first and lastnames of the persons
        Stream.of(sa).map(person -> person.getName() + " " + person.getSurname())
                .forEach(person -> System.out.println(person));
        System.out.println("----".repeat(22));

        // print the average age and the min/max ages
        OptionalDouble averageAge = Stream.of(sa).mapToDouble(person -> person.getAge())
                .average();
        if(averageAge.isPresent()){
            System.out.println("Average age is " + averageAge.getAsDouble());
        }
        System.out.println("----".repeat(22));

        Double minAge = Stream.of(sa).mapToDouble(person -> person.getAge())
                .min().getAsDouble();
        System.out.println("Minimum age is " + minAge);
        System.out.println("----".repeat(22));

        Double maxAge = Stream.of(sa).mapToDouble(person -> person.getAge())
                .max().getAsDouble();
        System.out.println("Maximum age is " + maxAge);
        System.out.println("----".repeat(22));

        // Print the weights of persons one by one
        Stream.of(sa).mapToDouble(person -> person.getWeight())
                .forEach(weight -> System.out.println(weight));
        System.out.println("----".repeat(22));

        // print the average age and the min/max ages
        OptionalDouble averageWeight = Stream.of(sa).mapToDouble(person -> person.getWeight())
                .average();
        if(averageWeight.isPresent()){
            System.out.println("Average weight is " + averageWeight.getAsDouble());
        }
        System.out.println("----".repeat(22));

        Double minWeight = Stream.of(sa).mapToDouble(person -> person.getWeight())
                .min().getAsDouble();
        System.out.println("Minimum weight is " + minWeight);
        System.out.println("----".repeat(22));

        Double maxWeight = Stream.of(sa).mapToDouble(person -> person.getWeight())
                .max().getAsDouble();
        System.out.println("Maximum weight is " + maxWeight);
        System.out.println("----".repeat(22));

        // find the sum of square roots of the first 20 numbers between 0-1000 that are both divisible by 5 and 8
        Double sum = IntStream.iterate(0, i -> i + 1)
                .limit(1000)
                .filter(number -> number % 5 == 0 && number % 8 == 0)
                .limit(20)
                .mapToDouble(number -> Math.sqrt(number))
                .sum();
        System.out.printf("%.2f",sum);

        // make a program to generate 500 random, even and unique numbers between 0-10000,
        // sort and make an array from them

        Random random = new Random();
        int[] numbers = new int[500];
        int counter = 0;

        while(counter < 500){
            // generate a random int
            int randomNumber = random.nextInt(10000);

            // check if the number is in the array, if so continue
            if (checkDuplicate(numbers, randomNumber))
                continue;

            // add to array if the number is even and increase counter
            if(randomNumber % 2 == 0){
               numbers[counter] = randomNumber;
               counter++;
            }
        }
        int[] sorted = Arrays.stream(numbers).sorted().toArray();
        Arrays.stream(sorted).forEach(number -> System.out.println(number));
    }

    private static boolean checkDuplicate(int[] numbers, int randomNumber) {
        if(Arrays.stream(numbers)
            .anyMatch(number -> number == randomNumber)){
            return true;
        }
        return false;
    }


}
