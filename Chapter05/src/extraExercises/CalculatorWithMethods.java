package extraExercises;

import java.util.Scanner;

public class CalculatorWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        System.out.print("First: ");
        int first = scanner.nextInt();
        System.out.print("Second: ");
        int second = scanner.nextInt();
        System.out.println("Please select the calculation method: ");
        System.out.print("+  -  *   /  of  % : ");
        String operator = scanner.next();
        double result = 0;

        switch (operator) {
            case "+":
                result = sum(first, second);
                break;
            case "-":
                result = subtract(first, second);
                break;
            case "*":
                result = multiply(first, second);
                break;
            case "/":
                result = divide(first, second);
                break;
            case "%":
                result = modulo(first, second);
                break;
        }
      System.out.println(first + " " + operator + " " + second + " is: " + result);
      scanner.close();
    }
    public static double sum(int number1, int number2){
        return number1 + number2;
    }
    public static double subtract(int number1, int number2){
       return number1-number2;
    }
    public static double multiply(int number1, int number2){
       return number1 * number2;
    }
    public static double divide(int number1, int number2){
        return number1/number2;
    }
    public static double modulo(int number1, int number2){
        return number1 % number2;
    }
}
