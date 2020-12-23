package be.intecbrussel.exercise07_object_serialization.drawing;

public interface DrawingContext {
    void draw(Rectangle rectangle);

    void draw(Circle circle);

    void draw(Triangle triangle);

}
