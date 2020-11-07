package be.intecbrussel.exercise09_01;

import be.intecbrussel.exercise09_01_aggregations.Circle;
import be.intecbrussel.exercise09_01_aggregations.Rectangle;

public class LogoApp {
    public static void main(String[] args) {
        Logo myLogo = new Logo(new Rectangle(), new Circle(), "CodeWithMe");
        myLogo.setRectangle(new Rectangle(2, 2, 2, 2));
        System.out.println(myLogo);

    }
}
