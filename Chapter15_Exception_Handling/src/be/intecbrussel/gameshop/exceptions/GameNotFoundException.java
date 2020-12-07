package be.intecbrussel.gameshop.exceptions;

public class GameNotFoundException extends GameShopException{
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
