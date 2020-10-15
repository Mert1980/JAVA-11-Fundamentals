package ExtraExercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scan.nextInt();

        System.out.print("Enter second number: ");
        int second = scan.nextInt();

        System.out.print("Enter the operator (+, -, * or /): ");
        String operator = scan.next();

        int result = 0;
        double division = 0;

        switch (operator){
            case "+":
                result = first + second;
                // System.out.println(result);
                break;
            case "-":
                if(first > second){
                    result = first - second;
                } else if (first < second){
                    result = second- first;
                } else result = 0;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (first > second){
                    division = (1.0) * first / second;
                } else if (first < second){
                    division = (1.0) * second / first;
                } else division = 1;
                break;
        }
        System.out.println("The result is: " + (operator.equals("/") ? Double.toString(division): Integer.toString(result) ));
            // System.out.println("The result is: " + (operator.equals("/") ? division: result));
    }
}

