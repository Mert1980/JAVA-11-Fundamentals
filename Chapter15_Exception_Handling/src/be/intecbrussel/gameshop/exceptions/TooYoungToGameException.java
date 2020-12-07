package be.intecbrussel.gameshop.exceptions;

public class TooYoungToGameException extends Exception{
    public TooYoungToGameException(){
        super();
    }

    public TooYoungToGameException(String message){
        super(message);
    }

    public TooYoungToGameException(String message, Throwable cause){
        super(message, cause);
    }

    public TooYoungToGameException(Throwable cause){
        super(cause);
    }
}
