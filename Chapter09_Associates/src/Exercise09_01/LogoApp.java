package Exercise09_01;

import Exercise09_01_Aggregations.Circle;
import Exercise09_01_Aggregations.Rectangle;

public class LogoApp {
    public static void main(String[] args) {
        Logo myLogo = new Logo(new Rectangle(), new Circle(), "CodeWithMe");
        myLogo.setRectangle(new Rectangle(2, 2, 2, 2));
        System.out.println(myLogo);

    }
}
