package extraExercises;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(20, 30);
        // myRectangle = new Rectangle();
        Rectangle mySecondRectangle = new Rectangle();
        myRectangle.setPosition(10, 25);
        myRectangle.setPosition(20, myRectangle.getYPos());

        // System.out.println(myRectangle);
        // System.out.println(myRectangle.base);
        // System.out.println(myRectangle.height);

        // myRectangle.base = 20;
        // myRectangle.height = 10;

//        myRectangle.setBase(-20);
//        myRectangle.setHeight(50);
        System.out.println("Base " + myRectangle.getBase());
        System.out.println("Height " + myRectangle.getHeight());
        System.out.println("Area: " + myRectangle.getArea());
        System.out.println("Perimeter: " + myRectangle.getPerimeter());
        System.out.println("xPos: " + myRectangle.getPosition()[0]);
        System.out.println("yPos: " + myRectangle.getPosition()[1]);

        System.out.println();
        System.out.println("Base " + mySecondRectangle.getBase());
        System.out.println("Height " + mySecondRectangle.getHeight());
        System.out.println("Area: " + mySecondRectangle.getArea());
        System.out.println("Perimeter: " + mySecondRectangle.getPerimeter());



    }
}
