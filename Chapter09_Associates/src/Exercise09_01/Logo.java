package Exercise09_01;

import Exercise09_01_Aggregations.Circle;
import Exercise09_01_Aggregations.Rectangle;

import java.text.CharacterIterator;

public class Logo {
    private Rectangle[] rectangle = new Rectangle[5];
    private Circle[] circle = new Circle[5];
    private String text;

    public Logo(Rectangle r, Circle c, String s){
        this.rectangle[0] = r;
        this.circle[0] = c;
        this.text = s;
    }

    public void setRectangle(Rectangle r){
        int index = 0;
        while(true){
            if(this.rectangle[index] == null){
                this.rectangle[index] = r;
                break;
            } else {
                index++;
            }
        }

    }

    public Rectangle[] getRectangle(){
        return this.rectangle;
    }

    public void setCircle(Circle c){
        int index = 0;
        while(true){
            if(this.circle[index] != null){
                this.circle[index] = c;
                break;
            } else {
                index++;
            }
        }
    }

    public Circle[] getCircle(){
        return this.circle;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public double getArea(Circle c, Rectangle r){
        return c.getArea() + r.getArea();
    }

    @Override
    public String toString() {
        return "Logo{" +
                "rectangle=" + rectangle[0] + "\n" + rectangle[1] + "\n"+
                "     circle=" + circle[0] + "\n"+
                "     text='" + text + '\'' +
                '}';
    }
}
