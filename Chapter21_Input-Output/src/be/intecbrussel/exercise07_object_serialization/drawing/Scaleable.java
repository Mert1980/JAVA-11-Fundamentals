package be.intecbrussel.exercise07_object_serialization.drawing;

import java.io.Serializable;

public interface Scaleable extends Serializable {
    // Constants
    public static final int DOUBLE = 200;
    public static final int HALF = 50;
    public static final int QUARTER = 25;

    // Methods
    public abstract void scale(int factor);

    // Default Methods
    public default void scaleDouble(){
        scale(DOUBLE);
    }

    public default void scaleHalf(){
        scale(HALF);
    }
}
