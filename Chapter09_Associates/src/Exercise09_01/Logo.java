package Exercise09_01;

import Exercise09_01_Aggregations.Circle;
import Exercise09_01_Aggregations.Rectangle;

public class Logo {
    private Rectangle rectangle;
    private Circle circle;
    private String text;

    public Logo(Rectangle r, Circle c, String s){
        this.rectangle = r;
        this.circle = c;
        this.text = s;
    }

    public void setRectangle(Rectangle r){
        this.rectangle = r;
    }

    public Rectangle getRectangle(){
        return this.rectangle;
    }

    public void setCircle(Circle c){
        this.circle = c;
    }

    public Circle getCircle(){
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




}
