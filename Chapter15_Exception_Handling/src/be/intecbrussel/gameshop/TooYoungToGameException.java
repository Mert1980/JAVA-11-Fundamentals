package be.intecbrussel.gameshop;

public class TooYoungToGameException extends RuntimeException{
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
