package be.intecbrussel.exercise10_10;

public class DrawingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        Shape rect = new Rectangle(10, 20);
        Shape circle = new Circle(5, 2, 2);
        Shape sq = new Square(3, 5, 5);
        Shape triangle = new Triangle(20, 30, 30);
        Shape isoTrg = new IsoScelesTriangle(34, 45, 20, 20);
        Shape sq2 = new Square(20, 5, 5);
        Shape sq3 = new Square(30, 5, 5);

        drawing.add(circle);
        drawing.add(rect);
        drawing.add(circle); // try to add circle 2nd time. This gives a warning
        drawing.add(sq);
        drawing.add(triangle);
        drawing.add(isoTrg);

        // print drawing
        System.out.println(drawing); // size is 5

        // remove square from drawing
        drawing.remove(sq);

        // print drawing again
        System.out.println(drawing); // the new size is 4

        // add 2 new squares and increase the size of the array to accommodate new figures
        drawing.add(sq2);
        drawing.add(sq3);
        System.out.println(drawing);


        // clear the drawing
        // drawing.clear();
        // System.out.println(drawing); // Drawing{shapes=[null, null, null, null, null, null, null, null, null, null], size=0}

    }
}
