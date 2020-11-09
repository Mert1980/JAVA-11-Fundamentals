package be.intecbrussel.exercise10_10;

public class DrawingApp {
    public static void main(String[] args) {
        Drawing picture = new Drawing();

        Shape rect = new Rectangle(10, 20);
        Shape circle = new Circle(5, 2, 2);
        Shape sq = new Square(3, 5, 5);
        Shape triangle = new Triangle(20, 30, 30);
        Shape isoTrg = new IsoScelesTriangle(34, 45, 20, 20);

        picture.add(circle);
        picture.add(rect);
        picture.add(circle); // try to add circle 2nd time. This gives a warning
        picture.add(sq);
        picture.add(triangle);
        picture.add(isoTrg);

        // print picture
        System.out.println(picture); // size is 5

        // remove square from picture
        picture.remove(sq);

        // print picture again
        System.out.println(picture); // the new size is 4

    }
}
