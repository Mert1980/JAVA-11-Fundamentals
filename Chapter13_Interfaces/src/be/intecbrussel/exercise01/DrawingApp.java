package be.intecbrussel.exercise01;

public class DrawingApp {
    public static void main(String[] args) {
        Drawing myDrawing = new Drawing();
        DrawingContext drawingContext = new TextDrawingContext();

        myDrawing.add(new Circle(5, 5, 5));
        myDrawing.add(new Rectangle(10, 20, 1, 1));
        myDrawing.add(new Square(30, 1, 1));
        myDrawing.add(new Triangle(10, 20, 20));
        myDrawing.add(new IsoScelesTriangle(40, 60));

        myDrawing.draw(drawingContext);
        System.out.println("------------------------------");

        myDrawing.scaleDouble();
        myDrawing.draw(drawingContext);
        System.out.println("------------------------------");

        myDrawing.add(new Circle());
        myDrawing.draw(drawingContext);
        System.out.println("------------------------------");

        myDrawing.scaleHalf();
        myDrawing.draw(drawingContext);
    }
}
