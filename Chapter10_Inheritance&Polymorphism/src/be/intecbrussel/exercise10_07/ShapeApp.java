package be.intecbrussel.exercise10_07;

public class ShapeApp {
    public static void main(String[] args) {
        Circle circle1= new Circle(5, 3, 3);
        System.out.println(circle1); // Circle{PI=3.14, radius=5, xPos=3, yPos=3}

        System.out.println();

        Circle circle2 = new Circle(circle1);
        System.out.println(circle2); // Circle{PI=3.14, radius=5, xPos=1, yPos=1}

    }
}
