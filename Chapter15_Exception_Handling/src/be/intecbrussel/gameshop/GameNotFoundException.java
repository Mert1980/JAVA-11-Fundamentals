package be.intecbrussel.gameshop;

public class GameNotFoundException extends IllegalArgumentException{
    public GameNotFoundException(){
        super();
    }

    public GameNotFoundException(String message){
        super(message);
    }

    public GameNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public GameNotFoundException(Throwable cause){
        super(cause);
    }
}
