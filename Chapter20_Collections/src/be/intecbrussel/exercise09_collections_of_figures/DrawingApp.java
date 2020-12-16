package be.intecbrussel.exercise09_collections_of_figures;

public class DrawingApp {
    public static void main(String[] args) {

        Drawing myDrawing = new Drawing();
        myDrawing.add(new Circle(5, 5, 5));
        myDrawing.add(new Rectangle(10, 20, 1, 1));
        myDrawing.add(new Triangle(10, 20, 20));
        myDrawing.add(new Square(7, 1, 1));
        myDrawing.add(new Square(7, 1, 1));

        myDrawing.getDrawables().forEach(shape -> System.out.println(shape));

        myDrawing.removeAtIndex(0);
        System.out.println();
        myDrawing.getDrawables().forEach(shape -> System.out.println(shape));
    }
}


