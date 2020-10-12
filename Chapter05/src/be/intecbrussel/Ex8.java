package be.intecbrussel;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the figure by entering '1' for square, '2' for triangle and '3' for circle:");
        int shape = scanner.nextInt();
        double area = 0;
        final double PI = 3.14;
        switch (shape){
            case 1:
                System.out.println("Enter the length of the square: ");
                int length = scanner.nextInt();
                area = length * length;
                System.out.println("The area of the square is " + area);
                break;
            case 2:
                System.out.println("Enter the bottom width of the triangle:");
                int bottomWidth = scanner.nextInt();
                System.out.println("Enter the height of the triangle:");
                int height = scanner.nextInt();
                area = (bottomWidth*height)/2;
                System.out.println("The area of the triangle is " + area);
                break;
            case 3:
                System.out.println("Enter the radius of the circle:");
                int radius = scanner.nextInt();
                area = radius * radius * PI;
                System.out.println("The area of the circle is " + area);
                break;
        }
    }
}
