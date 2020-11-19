package be.intecbrussel.exercise04_iterator;

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

        System.out.println("----------------------------------");
        Drawing.DrawableIterator iterator = (Drawing.DrawableIterator) myDrawing.iterator();
        while(iterator.hasNext()){
            /*if(iterator.next() == null){
                return;
            }*/
             System.out.println(iterator.next());
        }
    }
}

    /*Circle{PI=3.14, radius=5, xPos=5, yPos=5}
    Rectangle{height=10, width=20, xPos=1, yPos=1}
    Rectangle{height=30, width=30, xPos=1, yPos=1}
    Triangle{height=20, width=10, perpendicular=20, xPos=1, yPos=1}
    Triangle{height=60, width=40, perpendicular=1, xPos=1, yPos=1}
    Circle{PI=3.14, radius=0, xPos=1, yPos=1}
    */
